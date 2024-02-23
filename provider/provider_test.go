// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

package provider

import (
	"context"
	"testing"

	"github.com/pulumi/providertest"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"

	"github.com/pulumi/pulumi-azure/provider/v5/pkg/version"
)

func providerServer() pulumirpc.ResourceProviderServer {
	ctx := context.Background()
	version.Version = "0.0.1"
	info := Provider()

	// We leave the schema blank. This will result in incorrect calls to GetSchema, but
	// otherwise does not effect the provider. It reduces the time to test start.
	schema := []byte("{}")

	return tfbridge.NewProvider(ctx, nil, "azure", version.Version, info.P, info, schema)
}

func test(t *testing.T, dir string, opts ...providertest.Option) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without cloud credentials")
		return
	}
	opts = append(opts,
		providertest.WithProviderName("azure"),
		providertest.WithBaselineVersion("5.60.0"),
		providertest.WithResourceProviderServer(providerServer()),
		providertest.WithSkippedUpgradeTestMode(providertest.UpgradeTestMode_Quick, "Using PreviewOnly mode instead"),
	)
	ptest := providertest.NewProviderTest(dir, opts...)
	ptest.Run(t)
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}
