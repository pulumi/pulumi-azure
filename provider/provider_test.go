// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package provider

import (
	"context"
	"encoding/json"
	"fmt"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"sync"
	"testing"

	_ "embed"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/grpclog"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
	"github.com/pulumi/pulumi/sdk/v3/go/common/apitype"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/sig"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-azure/provider/v7/pkg/version"
)

// baselineVersion is the release that upgrade tests start from: the last v6 release. Each
// test-programs/<name> program is deployed with it, while test-programs/<name>/v7, where present,
// holds the source a user ends up with after following the v7 migration guide.
const baselineVersion = "6.40.1"

// Use the non-embedded schema to avoid having to run generation before running the tests.
//
//go:embed cmd/pulumi-resource-azure/schema.json
var schemaBytes []byte

func providerServer(_ providers.PulumiTest) (pulumirpc.ResourceProviderServer, error) {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()

	return tfbridge.NewProvider(ctx, nil, "azure", version.Version, info.P, info, schemaBytes), nil
}

func test(t *testing.T, dir string, opts ...optproviderupgrade.PreviewProviderUpgradeOpt) {
	t.Helper()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without cloud credentials")
		return
	}
	subscriptionID := getSubscriptionID(t)
	rpFactory := providers.ResourceProviderFactory(providerServer)
	cacheDir := providertest.GetUpgradeCacheDir(filepath.Base(dir), baselineVersion)
	pt := pulumitest.NewPulumiTest(t, dir,
		opttest.AttachProvider("azure",
			rpFactory.ReplayInvokes(filepath.Join(cacheDir, "grpc.json"), false /* allowLiveFallback */)))
	pt.SetConfig(t, "azure:subscriptionId", subscriptionID)
	// Azure adds resources of its own to some resource groups, such as the smart detection action
	// group that comes with Application Insights. Let them be deleted along with the group, so that
	// destroying the baseline stack doesn't leave the group behind.
	err := pt.CurrentStack().SetConfigWithOptions(context.Background(),
		"azure:features.resourceGroup.preventDeletionIfContainsResources",
		auto.ConfigValue{Value: "false"}, &auto.ConfigOptions{Path: true})
	if err != nil {
		t.Fatalf("failed to set provider features config: %v", err)
	}
	stackPath, grpcLogPath := filepath.Join(cacheDir, "stack.json"), filepath.Join(cacheDir, "grpc.json")
	repairRecordedSecrets(t, stackPath)
	previewResult := providertest.PreviewProviderUpgrade(t, pt, "azure", baselineVersion, opts...)
	// Fix up a recording made just now, before it's committed.
	repairRecordedSecrets(t, stackPath)
	trimGrpcLog(t, grpcLogPath)
	assertpreview.HasNoReplacements(t, previewResult)
	assertpreview.HasNoDeletes(t, previewResult)
}

// trimGrpcLog reduces a recorded gRPC log to its Invoke calls, which are all that replaying a test
// uses. The rest isn't fit to commit: GetSchema alone is tens of megabytes, and calls such as Check
// and Create carry secrets like storage account keys that the recording doesn't redact.
func trimGrpcLog(t *testing.T, path string) {
	t.Helper()
	log, err := grpclog.LoadLog(path)
	if os.IsNotExist(err) {
		return
	}
	if err != nil {
		t.Fatalf("failed to read %s: %v", path, err)
	}
	entries := log.WhereMethod(grpclog.Invoke)
	if len(entries) == len(log.Entries) {
		return
	}
	log.Entries = entries
	if err := log.WriteTo(path); err != nil {
		t.Fatalf("failed to write %s: %v", path, err)
	}
}

// redactedPlaintext is the plaintext providertest's sanitizer gives every redacted string secret.
const redactedPlaintext = `"REDACTED BY PROVIDERTEST"`

// repairRecordedSecrets undoes two ways in which providertest's sanitizer, which replaces every
// string in a secret's plaintext, damages a recorded stack:
//
//   - It redacts the signatures of secrets nested in a secret's plaintext (AKS's kubeConfigs, for
//     one), and Pulumi then refuses to import the stack ("unrecognized signature 'REDACTED BY
//     PROVIDERTEST' in property map"). Those secrets are restored to a valid, still redacted, form.
//   - It redacts empty strings too. A sensitive input that the program left unset is recorded as an
//     empty secret, and once redacted it diffs against the unset input on replay, which forces a
//     replacement when the input is ForceNew. Such secrets are restored to the empty string.
func repairRecordedSecrets(t *testing.T, stackPath string) {
	t.Helper()
	raw, err := os.ReadFile(stackPath)
	if os.IsNotExist(err) {
		return
	}
	if err != nil {
		t.Fatalf("failed to read %s: %v", stackPath, err)
	}
	var stack apitype.UntypedDeployment
	if err := json.Unmarshal(raw, &stack); err != nil {
		t.Fatalf("failed to parse %s: %v", stackPath, err)
	}
	var deployment apitype.DeploymentV3
	if err := json.Unmarshal(stack.Deployment, &deployment); err != nil {
		t.Fatalf("failed to parse the deployment in %s: %v", stackPath, err)
	}

	repaired := false
	for _, r := range deployment.Resources {
		for _, props := range []map[string]any{r.Inputs, r.Outputs} {
			for _, v := range props {
				repaired = repairSecretPlaintext(v) || repaired
			}
		}
		for k, v := range r.Outputs {
			secret, ok := v.(map[string]any)
			if _, set := r.Inputs[k]; set || !ok || !schemaInputs()[string(r.Type)][k] {
				continue
			}
			if secret[sig.Key] == sig.Secret && secret["plaintext"] == redactedPlaintext {
				secret["plaintext"] = `""`
				repaired = true
			}
		}
	}
	if !repaired {
		return
	}

	if stack.Deployment, err = json.Marshal(deployment); err != nil {
		t.Fatalf("failed to serialize the repaired deployment: %v", err)
	}
	out, err := json.MarshalIndent(stack, "", "  ")
	if err != nil {
		t.Fatalf("failed to serialize the repaired stack: %v", err)
	}
	if err := os.WriteFile(stackPath, out, 0o600); err != nil {
		t.Fatalf("failed to write %s: %v", stackPath, err)
	}
	t.Logf("repaired redacted secrets in %s", stackPath)
}

// schemaInputs maps each resource token in the schema to the set of its input properties.
var schemaInputs = sync.OnceValue(func() map[string]map[string]bool {
	var spec struct {
		Resources map[string]struct {
			InputProperties map[string]json.RawMessage `json:"inputProperties"`
		} `json:"resources"`
	}
	if err := json.Unmarshal(schemaBytes, &spec); err != nil {
		panic(fmt.Sprintf("failed to parse the schema: %v", err))
	}
	inputs := make(map[string]map[string]bool, len(spec.Resources))
	for token, r := range spec.Resources {
		inputs[token] = make(map[string]bool, len(r.InputProperties))
		for name := range r.InputProperties {
			inputs[token][name] = true
		}
	}
	return inputs
})

// repairSecretPlaintext finds the secrets in v and repairs any secrets nested in their plaintext,
// reporting whether anything changed.
func repairSecretPlaintext(v any) bool {
	switch v := v.(type) {
	case map[string]any:
		if v[sig.Key] != sig.Secret {
			repaired := false
			for _, e := range v {
				repaired = repairSecretPlaintext(e) || repaired
			}
			return repaired
		}
		plaintext, ok := v["plaintext"].(string)
		if !ok {
			return false
		}
		var value any
		if json.Unmarshal([]byte(plaintext), &value) != nil || !repairNestedSecret(value) {
			return false
		}
		b, err := json.Marshal(value)
		if err != nil {
			return false
		}
		v["plaintext"] = string(b)
		return true
	case []any:
		repaired := false
		for _, e := range v {
			repaired = repairSecretPlaintext(e) || repaired
		}
		return repaired
	}
	return false
}

// repairNestedSecret restores each secret within v whose signature was redacted, reporting whether
// anything changed.
func repairNestedSecret(v any) bool {
	switch v := v.(type) {
	case map[string]any:
		if s, ok := v[sig.Key]; ok && s != sig.Secret {
			// The plaintext was redacted too, but no longer holds the JSON encoding of a value.
			redacted, err := json.Marshal(v["plaintext"])
			if err != nil {
				return false
			}
			v[sig.Key] = sig.Secret
			v["plaintext"] = string(redacted)
			return true
		}
		repaired := false
		for _, e := range v {
			repaired = repairNestedSecret(e) || repaired
		}
		return repaired
	case []any:
		repaired := false
		for _, e := range v {
			repaired = repairNestedSecret(e) || repaired
		}
		return repaired
	}
	return false
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func getSubscriptionID(t *testing.T) string {
	// Prefer the environment variable, but fall back to the Azure CLI if it's not set.
	// This should always be set in CI, but is useful for local testing.
	subscriptionID := os.Getenv("ARM_SUBSCRIPTION_ID")
	if subscriptionID == "" {
		// Fetch from default Azure CLI profile
		cmd := exec.Command("az", "account", "show", "--query", "id", "-o", "tsv")
		out, err := cmd.Output()
		if err != nil {
			t.Fatal(err)
		}
		if len(out) == 0 {
			t.Fatal("No Azure subscription ID found")
		}
		subscriptionID = strings.Trim(string(out), "\n")
	}

	return subscriptionID
}
