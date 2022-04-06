module github.com/pulumi/pulumi-azure/provider/v5

go 1.16

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.4
	github.com/hashicorp/terraform-plugin-sdk/v2 v2.10.1
	github.com/hashicorp/terraform-provider-azurerm v1.44.1-0.20210812080924-c853ec4222d8
	github.com/hashicorp/terraform-provider-azurerm/shim v0.0.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.20.0
	github.com/pulumi/pulumi/sdk/v3 v3.27.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20211019194827-62530c6537a4
	github.com/hashicorp/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20220406111449-c8ba32389106
	github.com/hashicorp/terraform-provider-azurerm/shim => ./shim
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
