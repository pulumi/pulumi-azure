module github.com/pulumi/pulumi-azure/provider

go 1.13

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.1
	github.com/hashicorp/terraform-plugin-sdk v1.8.0
	github.com/pulumi/pulumi-terraform-bridge v1.8.4-0.20200326020012-c5fd7318ced1
	github.com/pulumi/pulumi/sdk v1.13.2-0.20200330065939-846897448c64
	github.com/terraform-providers/terraform-provider-azurerm v1.44.0
)

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20200324135943-f7461d9c85e3
)
