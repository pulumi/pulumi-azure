// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"encoding/json"
	"os"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/assert"
)

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/azure",
		},
	})

	return baseJS
}

func TestAccMultiCallback(t *testing.T) {
	skipIfShort(t)
	t.Skip("Skipping due to Azure capacity issues")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "multi-callback-all"),
			// Removed until the next release after 1.4.0,
			// see https://github.com/pulumi/pulumi-azure/pull/417#issuecomment-558227019
			// RunUpdateTest: true,
			// work around https://github.com/terraform-providers/terraform-provider-azurerm/issues/4598
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                      filepath.Join(getCwd(t), "loadbalancer"),
			RunUpdateTest:            false, // the subresources now longer have a resource group in them
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
			// TO-DO: (@stack72) there is a strangeness with lb.Loadbalancer and the FrontendIpConfiguration
		})

	integration.ProgramTest(t, &test)
}

func TestAccCosmosDb(t *testing.T) {
	skipIfShort(t)
	t.Skip("Skipping due to Azure capacity issues")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "cosmosdb"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccAciVolumeMount(t *testing.T) {
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "aci-volume-mount"),
			// TODO: Turn this back on after upstream version v3.6.0.
			// Upstream added a new property to one of the resources in the test, which causes the test to fail when
			// RunUpdateTest == true.
			RunUpdateTest: false,
		})

	integration.ProgramTest(t, &test)
}

func TestAccAciMulti(t *testing.T) {
	skipIfShort(t)
	t.Skip("Skipping due to Azure Gateway Timeout issues")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "aci-multi"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccTable(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "table"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccServicebusMigration(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "servicebus-migration-test"),
			// Removed until the next release after 1.4.0,
			// see https://github.com/pulumi/pulumi-azure/pull/417#issuecomment-558227019
			// RunUpdateTest: true,
			//EditDirs: []integration.EditDir{
			//	{
			//		Dir:             "step2",
			//		Additive:        true,
			//		ExpectNoChanges: true,
			//	},
			//},
		})

	integration.ProgramTest(t, &test)
}

func TestAccMsiRenamed(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "msi-renamed-to-authorization"),
			RunUpdateTest: true,
			EditDirs: []integration.EditDir{
				{
					Dir:             "step2",
					Additive:        true,
					ExpectNoChanges: true,
				},
			},
		})

	integration.ProgramTest(t, &test)
}

func TestAccBlob(t *testing.T) {
	t.Skip("Temp skipping due to functions issues")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "blob"),
			RunUpdateTest: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "A File from Blob Storage")
			}),
		})

	integration.ProgramTest(t, &test)
}

func TestAccHttp(t *testing.T) {
	t.Skip("Skipping due to Azure Gateway Timeout issues")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http"),
			RunUpdateTest: true,
			ExtraRuntimeValidation: validateAPITest(func(body string) {
				assert.Equal(t, body, "Hello World!")
			}),
		})

	integration.ProgramTest(t, &test)
}

func TestAccNetwork(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                  filepath.Join(getCwd(t), "network"),
			RunUpdateTest:        true,
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccNetwork_OIDC(t *testing.T) {
	oidcClientId := os.Getenv("OIDC_ARM_CLIENT_ID")
	if oidcClientId == "" {
		t.Skip("Skipping OIDC test without OIDC_ARM_CLIENT_ID")
	}
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                  filepath.Join(getCwd(t), "network"),
			RunUpdateTest:        true,
			ExpectRefreshChanges: true,
			Env: []string{
				"ARM_USE_OIDC=true",
				"ARM_CLIENT_ID=" + oidcClientId,
				// not strictly necessary but making sure we test the OIDC path
				"ARM_CLIENT_SECRET=",
			},
		})

	integration.ProgramTest(t, &test)
}

func TestAccWebserver(t *testing.T) {
	t.Skip("Skipping until v2.80.0 release comes out upstream")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                  filepath.Join(getCwd(t), "webserver"),
			RunUpdateTest:        true,
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccTopic(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "topic"),
			// Removed until the next release after 1.4.0,
			// see https://github.com/pulumi/pulumi-azure/pull/417#issuecomment-558227019
			// RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccTimer(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "timer"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccQueue(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "queue"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccIot(t *testing.T) {
	t.Skip("Temp Skipping as part of Pulumi May4th Release")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "iot"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccMinimal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "minimal"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccDurableFunctions(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "durable-functions"),
			RunUpdateTest: false,
		})

	integration.ProgramTest(t, &test)
}

func TestAccEventgrid(t *testing.T) {
	// TODO: Fix this test.
	t.Skip("This test fails to compile. Having difficulty resolving locally. See: https://github.com/pulumi/pulumi-azure/issues/1036")
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                      filepath.Join(getCwd(t), "eventgrid"),
			RunUpdateTest:            false,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccEventhub(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "eventhub"),
			// Removed until the next release after 1.4.0,
			// see https://github.com/pulumi/pulumi-azure/pull/417#issuecomment-558227019
			// RunUpdateTest: true,
			// work around https://github.com/terraform-providers/terraform-provider-azurerm/issues/4598
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccHttpExternal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http-external"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccHttpMulti(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http-multi"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccSecretCapture(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http"),
			RunUpdateTest: true,
			ExtraRuntimeValidation: func(t *testing.T, info integration.RuntimeValidationStackInfo) {
				byts, err := json.Marshal(info.Deployment)
				assert.NoError(t, err)
				assert.NotContains(t, "s3cr3t", string(byts))
			},
		})

	integration.ProgramTest(t, &test)
}

func TestAccLinuxVirtualMachines(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "linux-virtual-machine"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccFrontdoor(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "frontdoor"),
			RunUpdateTest: false,
		})

	integration.ProgramTest(t, &test)
}
