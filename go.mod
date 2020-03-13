module github.com/pulumi/pulumi-azure

go 1.13

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.0
	github.com/hashicorp/terraform-plugin-sdk v1.6.0
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.12.1
	github.com/pulumi/pulumi-terraform-bridge v1.8.2
	github.com/stretchr/testify v1.4.1-0.20191106224347-f1bd0923b832
	github.com/terraform-providers/terraform-provider-azurerm v1.36.0
)

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20200312134040-42fb554f01cb
)
