module github.com/pulumi/pulumi-azure/provider/v3

go 1.15

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.2
	github.com/hashicorp/terraform-plugin-sdk v1.13.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.17.1-0.20210120021130-d5916dedb92a
	github.com/pulumi/pulumi/sdk/v2 v2.15.1-0.20201202214525-260620430c4c
	github.com/terraform-providers/terraform-provider-azurerm v1.44.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20210201083255-db1e9f64be2a
)
