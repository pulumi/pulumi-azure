// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package provider

import (
	"context"
	"os"
	"os/exec"
	"path/filepath"
	"strings"
	"testing"

	_ "embed"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/providers"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-azure/provider/v6/pkg/version"
)

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
	cacheDir := providertest.GetUpgradeCacheDir(filepath.Base(dir), "5.89.0")
	pt := pulumitest.NewPulumiTest(t, dir,
		opttest.AttachProvider("azure",
			rpFactory.ReplayInvokes(filepath.Join(cacheDir, "grpc.json"), false /* allowLiveFallback */)))
	pt.SetConfig(t, "azure:subscriptionId", subscriptionID)
	previewResult := providertest.PreviewProviderUpgrade(t, pt, "azure", "5.89.0", opts...)
	assertpreview.HasNoReplacements(t, previewResult)
	assertpreview.HasNoDeletes(t, previewResult)
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
