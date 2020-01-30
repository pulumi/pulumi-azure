module github.com/pulumi/pulumi-azure

go 1.13

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.0
	github.com/hashicorp/terraform-plugin-sdk v1.1.1
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.9.2-0.20200130191051-01db3e28312c
	github.com/pulumi/pulumi-terraform-bridge v1.6.5
	github.com/stretchr/testify v1.4.1-0.20191106224347-f1bd0923b832
	github.com/terraform-providers/terraform-provider-azurerm v1.36.0
)

replace (
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20200127185434-ab509a4a12de
)
