require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.0
	github.com/hashicorp/terraform-plugin-sdk v1.1.1
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.0
	github.com/pulumi/pulumi-terraform-bridge v1.4.2
	github.com/stretchr/testify v1.4.0
	github.com/terraform-providers/terraform-provider-azurerm v1.36.0
)

replace (
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20191126095907-3f8a94c0853f
)

module github.com/pulumi/pulumi-azure

go 1.13
