module github.com/pulumi/pulumi-azure/provider/v3

go 1.14

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.0
	github.com/hashicorp/terraform-plugin-sdk v1.13.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.11.0
	github.com/pulumi/pulumi/sdk/v2 v2.12.0
	github.com/terraform-providers/terraform-provider-azurerm v1.44.0
)

replace (
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20201016142117-857b1cde95f3
)
