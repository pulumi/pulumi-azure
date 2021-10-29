module github.com/hashicorp/terraform-provider-azurerm/shim

go 1.15

require (
	github.com/hashicorp/terraform-plugin-sdk/v2 v2.7.0
	github.com/hashicorp/terraform-provider-azurerm v1.44.1-0.20210812080924-c853ec4222d8
)

replace github.com/hashicorp/terraform-provider-azurerm => github.com/pulumi/terraform-provider-azurerm v0.0.0-20211029143404-bb66e3896165
