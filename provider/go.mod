module github.com/pulumi/pulumi-azure/provider/v4

go 1.16

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.2
	github.com/hashicorp/terraform-plugin-sdk/v2 v2.7.0
	github.com/hashicorp/terraform-provider-azurerm v1.44.1-0.20210812080924-c853ec4222d8
	github.com/hashicorp/terraform-provider-azurerm/shim v0.0.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.9.0
	github.com/pulumi/pulumi/sdk/v3 v3.14.1-0.20211007222624-789e39219452
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/hashicorp/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20211105140625-c6285f6a1131
	github.com/hashicorp/terraform-provider-azurerm/shim => ./shim
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
