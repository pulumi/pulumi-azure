module github.com/pulumi/pulumi-azure/provider/v4

go 1.16

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.4.2
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.2.1
	github.com/pulumi/pulumi/pkg/v3 v3.3.2-0.20210526172205-85142462c7ed
	github.com/pulumi/pulumi/sdk/v3 v3.3.2-0.20210526172205-85142462c7ed
	github.com/terraform-providers/terraform-provider-azurerm v1.44.1-0.20210507035929-f758aa2eac59
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20210622122928-6e342a1c7e35
)
