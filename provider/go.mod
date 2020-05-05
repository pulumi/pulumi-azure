module github.com/pulumi/pulumi-azure/provider/v3

go 1.13

require (
	github.com/Azure/go-autorest/autorest/azure/cli v0.3.1
	github.com/hashicorp/terraform-plugin-sdk v1.8.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.3.0
	github.com/pulumi/pulumi/pkg/v2 v2.1.1-0.20200505193935-7b446d6c55ad // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.1.1-0.20200505193935-7b446d6c55ad
	github.com/terraform-providers/terraform-provider-azurerm v1.44.0
)

replace (
	github.com/Azure/go-autorest => github.com/tombuildsstuff/go-autorest v14.0.1-0.20200416184303-d4e299a3c04a+incompatible
	github.com/Azure/go-autorest/autorest => github.com/tombuildsstuff/go-autorest/autorest v0.10.1-0.20200416184303-d4e299a3c04a
	github.com/Azure/go-autorest/autorest/azure/auth => github.com/tombuildsstuff/go-autorest/autorest/azure/auth v0.4.3-0.20200416184303-d4e299a3c04a
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/terraform-providers/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v1.41.1-0.20200501115005-7d844e5cae56
)
