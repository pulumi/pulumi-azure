// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.
// +build nodejs all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
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
			Dir:           filepath.Join(getCwd(t), "loadbalancer"),
			RunUpdateTest: true,
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
			Dir:           filepath.Join(getCwd(t), "aci-volume-mount"),
			RunUpdateTest: true,
		})

	integration.ProgramTest(t, &test)
}

func TestAccAciMulti(t *testing.T) {
	skipIfShort(t)
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
