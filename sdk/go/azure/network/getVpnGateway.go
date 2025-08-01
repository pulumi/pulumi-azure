// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing VPN Gateway within a Virtual Hub.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := network.LookupVpnGateway(ctx, &network.LookupVpnGatewayArgs{
//				Name:              "existing-local-vpn_gateway",
//				ResourceGroupName: "existing-vpn_gateway",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("azurermVpnGatewayId", example.Id)
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This data source uses the following Azure API Providers:
//
// * `Microsoft.Network`: 2024-05-01
func LookupVpnGateway(ctx *pulumi.Context, args *LookupVpnGatewayArgs, opts ...pulumi.InvokeOption) (*LookupVpnGatewayResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVpnGatewayResult
	err := ctx.Invoke("azure:network/getVpnGateway:getVpnGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpnGateway.
type LookupVpnGatewayArgs struct {
	// The Name of the VPN Gateway.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the VPN Gateway exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getVpnGateway.
type LookupVpnGatewayResult struct {
	// A `bgpSettings` block as defined below.
	BgpSettings []GetVpnGatewayBgpSetting `pulumi:"bgpSettings"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `ipConfiguration` block as defined below.
	IpConfigurations []GetVpnGatewayIpConfiguration `pulumi:"ipConfigurations"`
	// The Azure location where the VPN Gateway exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The Scale Unit of this VPN Gateway.
	ScaleUnit int `pulumi:"scaleUnit"`
	// A mapping of tags assigned to the VPN Gateway.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the Virtual Hub within which this VPN Gateway has been created.
	VirtualHubId string `pulumi:"virtualHubId"`
}

func LookupVpnGatewayOutput(ctx *pulumi.Context, args LookupVpnGatewayOutputArgs, opts ...pulumi.InvokeOption) LookupVpnGatewayResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupVpnGatewayResultOutput, error) {
			args := v.(LookupVpnGatewayArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:network/getVpnGateway:getVpnGateway", args, LookupVpnGatewayResultOutput{}, options).(LookupVpnGatewayResultOutput), nil
		}).(LookupVpnGatewayResultOutput)
}

// A collection of arguments for invoking getVpnGateway.
type LookupVpnGatewayOutputArgs struct {
	// The Name of the VPN Gateway.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the VPN Gateway exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupVpnGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpnGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getVpnGateway.
type LookupVpnGatewayResultOutput struct{ *pulumi.OutputState }

func (LookupVpnGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpnGatewayResult)(nil)).Elem()
}

func (o LookupVpnGatewayResultOutput) ToLookupVpnGatewayResultOutput() LookupVpnGatewayResultOutput {
	return o
}

func (o LookupVpnGatewayResultOutput) ToLookupVpnGatewayResultOutputWithContext(ctx context.Context) LookupVpnGatewayResultOutput {
	return o
}

// A `bgpSettings` block as defined below.
func (o LookupVpnGatewayResultOutput) BgpSettings() GetVpnGatewayBgpSettingArrayOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) []GetVpnGatewayBgpSetting { return v.BgpSettings }).(GetVpnGatewayBgpSettingArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVpnGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

// An `ipConfiguration` block as defined below.
func (o LookupVpnGatewayResultOutput) IpConfigurations() GetVpnGatewayIpConfigurationArrayOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) []GetVpnGatewayIpConfiguration { return v.IpConfigurations }).(GetVpnGatewayIpConfigurationArrayOutput)
}

// The Azure location where the VPN Gateway exists.
func (o LookupVpnGatewayResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupVpnGatewayResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupVpnGatewayResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The Scale Unit of this VPN Gateway.
func (o LookupVpnGatewayResultOutput) ScaleUnit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) int { return v.ScaleUnit }).(pulumi.IntOutput)
}

// A mapping of tags assigned to the VPN Gateway.
func (o LookupVpnGatewayResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The ID of the Virtual Hub within which this VPN Gateway has been created.
func (o LookupVpnGatewayResultOutput) VirtualHubId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpnGatewayResult) string { return v.VirtualHubId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVpnGatewayResultOutput{})
}
