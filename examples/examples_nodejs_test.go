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
			// RunUpdateTest: true,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccLoadbalancer(t *testing.T) {
	t.Skipf("Skipping due to flake: https://github.com/pulumi/pulumi-azure/issues/1703")
	skipIfShort(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "loadbalancer"),

			// TODO[pulumi/pulumi-azure#1571] various issues with non-empty refresh.
			SkipRefresh: true,
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
			Dir:                    filepath.Join(getCwd(t), "aci-volume-mount"),
			RunUpdateTest:          false,
			SkipEmptyPreviewUpdate: true,
			ExpectRefreshChanges:   true,
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
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccServicebusMigration(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "servicebus-migration-test"),
			RunUpdateTest: true,
			EditDirs: []integration.EditDir{
				{
					Dir:             filepath.Join("servicebus-migration-test", "step2"),
					Additive:        true,
					ExpectNoChanges: true,
				},
			},
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccMsiRenamed(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "msi-renamed-to-authorization"),
			RunUpdateTest: true,
			EditDirs: []integration.EditDir{
				{
					Dir:             filepath.Join("msi-renamed-to-authorization", "step2"),
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
			// RunUpdateTest: true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccTimer(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "timer"),
			RunUpdateTest: true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccQueue(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "queue"),
			RunUpdateTest: true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccIot(t *testing.T) {
	t.Skip(`Fails with error: TypeError: sharedAccessPolicies.find is not a function
		at /home/runner/work/pulumi-azure/pulumi-azure/sdk/nodejs/iot/zMixins.ts:142:131`)
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
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccEventgrid(t *testing.T) {
	t.Skip(`Passes locally but fails in CI with 'Waiting for 'eventgrid_extension' key to become available' until timeout. #2222`)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                      filepath.Join(getCwd(t), "eventgrid"),
			RunUpdateTest:            false,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,

			// Getting the following diff:
			//     "diffs": [
			//         "webhookEndpoint"
			//     ],
			//     "detailedDiff": {
			//         "webhookEndpoint.maxEventsPerBatch": {
			//             "kind": "DELETE"
			//         },
			//         "webhookEndpoint.preferredBatchSizeInKilobytes": {
			//             "kind": "DELETE"
			//         }
			//     }
			// even though the webhook is simply created as
			//     webhookEndpoint: { url: liveUrl }
			// in eventgrid/zMixins.ts.
			ExpectRefreshChanges: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccEventhub(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                      filepath.Join(getCwd(t), "eventhub"),
			RunUpdateTest:            true,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccHttpExternal(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http-external"),
			RunUpdateTest: true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccHttpMulti(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "http-multi"),
			RunUpdateTest: true,
		})
	skipRefresh(&test)
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
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}

func TestAccLinuxVirtualMachines(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:           filepath.Join(getCwd(t), "linux-virtual-machine"),
			RunUpdateTest: true,
		})
	skipRefresh(&test)
	integration.ProgramTest(t, &test)
}
