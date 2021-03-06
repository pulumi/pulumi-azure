// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Virtual Wan.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/network"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := network.LookupVirtualWan(ctx, &network.LookupVirtualWanArgs{
// 			Name:              "existing",
// 			ResourceGroupName: "existing",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("id", example.Id)
// 		ctx.Export("allowBranchToBranchTraffic", example.AllowBranchToBranchTraffic)
// 		ctx.Export("disableVpnEncryption", data.Azurerm_virtual_wan.Exemple.Disable_vpn_encryption)
// 		ctx.Export("location", data.Azurerm_virtual_wan.Exemple.Location)
// 		ctx.Export("office365LocalBreakoutCategory", data.Azurerm_virtual_wan.Exemple.Office365_local_breakout_category)
// 		ctx.Export("sku", data.Azurerm_virtual_wan.Exemple.Sku)
// 		ctx.Export("tags", data.Azurerm_virtual_wan.Exemple.Tags)
// 		ctx.Export("virtualHubs", data.Azurerm_virtual_wan.Exemple.Virtual_hubs)
// 		ctx.Export("vpnSites", data.Azurerm_virtual_wan.Exemple.Vpn_sites)
// 		return nil
// 	})
// }
// ```
func LookupVirtualWan(ctx *pulumi.Context, args *LookupVirtualWanArgs, opts ...pulumi.InvokeOption) (*LookupVirtualWanResult, error) {
	var rv LookupVirtualWanResult
	err := ctx.Invoke("azure:network/getVirtualWan:getVirtualWan", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVirtualWan.
type LookupVirtualWanArgs struct {
	// The name of this Virtual Wan.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Virtual Wan exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getVirtualWan.
type LookupVirtualWanResult struct {
	// Is branch to branch traffic is allowed?
	AllowBranchToBranchTraffic bool `pulumi:"allowBranchToBranchTraffic"`
	// Is VPN Encryption disabled?
	DisableVpnEncryption bool `pulumi:"disableVpnEncryption"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Azure Region where the Virtual Wan exists.
	Location string `pulumi:"location"`
	Name     string `pulumi:"name"`
	// The Office365 Local Breakout Category.
	Office365LocalBreakoutCategory string `pulumi:"office365LocalBreakoutCategory"`
	ResourceGroupName              string `pulumi:"resourceGroupName"`
	// Type of Virtual Wan (Basic or Standard).
	Sku string `pulumi:"sku"`
	// A mapping of tags assigned to the Virtual Wan.
	Tags map[string]string `pulumi:"tags"`
	// A list of Virtual Hubs ID's attached to this Virtual WAN.
	VirtualHubIds []string `pulumi:"virtualHubIds"`
	// A list of VPN Site ID's attached to this Virtual WAN.
	VpnSiteIds []string `pulumi:"vpnSiteIds"`
}
