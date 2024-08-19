// Copyright 2016-2024, Pulumi Corporation.  All rights reserved.

//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package provider

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/providertest/replay"
)

func Test_appinsights(t *testing.T) {
	test(t, filepath.Join("test-programs", "appinsights"))
}

func Test_appservice(t *testing.T) {
	test(t, filepath.Join("test-programs", "appservice"))
}

func Test_dns(t *testing.T) {
	test(t, filepath.Join("test-programs", "dns"))
}

func Test_keyvault(t *testing.T) {
	test(t, filepath.Join("test-programs", "keyvault"))
}

func Test_management(t *testing.T) {
	test(t, filepath.Join("test-programs", "management"))
}

func Test_monitoring(t *testing.T) {
	test(t, filepath.Join("test-programs", "monitoring"))
}

func Test_network(t *testing.T) {
	test(t, filepath.Join("test-programs", "network"))
}

func Test_servicebus(t *testing.T) {
	test(t, filepath.Join("test-programs", "servicebus"))
}

func Test_sql(t *testing.T) {
	test(t, filepath.Join("test-programs", "sql"))
}

func Test_storage(t *testing.T) {
	test(t, filepath.Join("test-programs", "storage"))
}

//nolint:lll
func TestRegistryPermadiff(t *testing.T) {
	grpc := `
{
    "method": "/pulumirpc.ResourceProvider/Diff",
    "request": {
        "id": "/subscriptions/0282681f-7a9e-424b-80b2-96babd57a8a1/resourceGroups/resourcegroup783718d7/providers/Microsoft.ContainerRegistry/registries/registryd1530ac2",
        "urn": "urn:pulumi:p-it-venelins-m-aci-volume-23092344::aci-volume-mount::azure:containerservice/registry:Registry::registry",
        "olds": {
            "__meta": "{\"e2bfb730-ecaa-11e6-8f88-34363bc7c4c0\":{\"create\":1800000000000,\"delete\":1800000000000,\"read\":300000000000,\"update\":1800000000000},\"schema_version\":\"2\"}",
            "adminEnabled": true,
            "adminPassword": "*",
            "adminUsername": "registryd1530ac2",
            "anonymousPullEnabled": false,
            "dataEndpointEnabled": false,
            "encryption": {
                "enabled": false,
                "identityClientId": "",
                "keyVaultKeyId": ""
            },
            "exportPolicyEnabled": true,
            "georeplications": [],
            "id": "/subscriptions/0282681f-7a9e-424b-80b2-96babd57a8a1/resourceGroups/resourcegroup783718d7/providers/Microsoft.ContainerRegistry/registries/registryd1530ac2",
            "identity": null,
            "location": "westus",
            "loginServer": "registryd1530ac2.azurecr.io",
            "name": "registryd1530ac2",
            "networkRuleBypassOption": "AzureServices",
            "networkRuleSet": null,
            "publicNetworkAccessEnabled": true,
            "quarantinePolicyEnabled": false,
            "resourceGroupName": "resourcegroup783718d7",
            "retentionPolicy": {
                "days": 7,
                "enabled": false
            },
            "sku": "Basic",
            "tags": null,
            "trustPolicy": {
                "enabled": false
            },
            "zoneRedundancyEnabled": false
        },
        "news": {
            "__defaults": [
                "exportPolicyEnabled",
                "location",
                "name",
                "networkRuleBypassOption",
                "publicNetworkAccessEnabled",
                "zoneRedundancyEnabled"
            ],
            "adminEnabled": true,
            "exportPolicyEnabled": true,
            "location": "westus",
            "name": "registryd1530ac2",
            "networkRuleBypassOption": "AzureServices",
            "publicNetworkAccessEnabled": true,
            "resourceGroupName": "resourcegroup783718d7",
            "sku": "Basic",
            "zoneRedundancyEnabled": false
        },
        "oldInputs": {
            "__defaults": [
                "exportPolicyEnabled",
                "location",
                "name",
                "networkRuleBypassOption",
                "publicNetworkAccessEnabled",
                "zoneRedundancyEnabled"
            ],
            "adminEnabled": true,
            "exportPolicyEnabled": true,
            "location": "westus",
            "name": "registryd1530ac2",
            "networkRuleBypassOption": "AzureServices",
            "publicNetworkAccessEnabled": true,
            "resourceGroupName": "resourcegroup783718d7",
            "sku": "Basic",
            "zoneRedundancyEnabled": false
        }
    },
    "response": {
        "stables": [
            "location",
            "name",
            "resourceGroupName",
            "zoneRedundancyEnabled"
        ],
        "changes": "DIFF_NONE",
        "hasDetailedDiff": true
    },
    "metadata": {
        "kind": "resource",
        "mode": "client",
        "name": "azure"
    }
}
`
	replay.Replay(t, providerServer(), grpc)
}
