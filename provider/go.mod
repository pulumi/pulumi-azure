module github.com/pulumi/pulumi-azure/provider/v3

go 1.16

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.2
	github.com/hashicorp/terraform-plugin-sdk v1.16.1-0.20210222152151-32f0219df5b5
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.21.0
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
	github.com/terraform-providers/terraform-provider-azurerm v1.44.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20210319130347-bbe34b1bb1b1
)
