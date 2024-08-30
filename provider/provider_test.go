// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package provider

import (
	"context"
	_ "embed"
	"testing"

	"github.com/pulumi/providertest"
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

func providerServer(pt providers.PulumiTest) (pulumirpc.ResourceProviderServer, error) {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()

	return tfbridge.NewProvider(ctx, nil, "azure", version.Version, info.P, info, schemaBytes), nil
}

func test(t *testing.T, dir string) {
	t.Helper()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without cloud credentials")
		return
	}
	pt := pulumitest.NewPulumiTest(t, dir,
		opttest.AttachProviderServer("azure", providerServer))
	previewResult := providertest.PreviewProviderUpgrade(t, pt, "azure", "5.60.0")
	assertpreview.HasNoReplacements(t, previewResult)
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}
