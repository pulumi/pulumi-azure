package shim

import (
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	"github.com/hashicorp/terraform-provider-azurerm/internal/provider"
)

func NewProvider() *schema.Provider {
	return provider.AzureProvider()
}
