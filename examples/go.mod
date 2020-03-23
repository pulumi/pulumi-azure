module github.com/pulumi/pulumi-azure/examples

go 1.13

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.9.3-hashi-auth
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.9.3-hashi-auth-subm
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/pulumi/pulumi-azure/sdk => ../sdk
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20200312134040-42fb554f01cb
)

require (
	github.com/pulumi/pulumi/pkg v0.0.0-20200323215703-1d4a75674b2e
	github.com/stretchr/testify v1.5.1
)
