// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appservice

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing 3rd Generation (v3) App Service Environment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appservice"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := appservice.LookupEnvironmentV3(ctx, &appservice.LookupEnvironmentV3Args{
//				Name:              "example-ASE",
//				ResourceGroupName: "example-resource-group",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.Id)
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
// * `Microsoft.Web`: 2023-01-01
func LookupEnvironmentV3(ctx *pulumi.Context, args *LookupEnvironmentV3Args, opts ...pulumi.InvokeOption) (*LookupEnvironmentV3Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentV3Result
	err := ctx.Invoke("azure:appservice/getEnvironmentV3:getEnvironmentV3", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironmentV3.
type LookupEnvironmentV3Args struct {
	// The name of this v3 App Service Environment.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the v3 App Service Environment exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getEnvironmentV3.
type LookupEnvironmentV3Result struct {
	// Are new Private Endpoint Connections allowed.
	AllowNewPrivateEndpointConnections bool `pulumi:"allowNewPrivateEndpointConnections"`
	// A `clusterSetting` block as defined below.
	ClusterSettings []GetEnvironmentV3ClusterSetting `pulumi:"clusterSettings"`
	// The number of Dedicated Hosts used by this ASEv3.
	DedicatedHostCount int `pulumi:"dedicatedHostCount"`
	// the DNS suffix for this App Service Environment V3.
	DnsSuffix string `pulumi:"dnsSuffix"`
	// The external inbound IP addresses of the App Service Environment V3.
	ExternalInboundIpAddresses []string `pulumi:"externalInboundIpAddresses"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An Inbound Network Dependencies block as defined below.
	InboundNetworkDependencies []GetEnvironmentV3InboundNetworkDependency `pulumi:"inboundNetworkDependencies"`
	// The internal inbound IP addresses of the App Service Environment V3.
	InternalInboundIpAddresses []string `pulumi:"internalInboundIpAddresses"`
	// The Internal Load Balancing Mode of this ASEv3.
	InternalLoadBalancingMode string `pulumi:"internalLoadBalancingMode"`
	// The number of IP SSL addresses reserved for the App Service Environment V3.
	IpSslAddressCount int `pulumi:"ipSslAddressCount"`
	// The list of Outbound IP Addresses of Linux based Apps in this App Service Environment V3.
	LinuxOutboundIpAddresses []string `pulumi:"linuxOutboundIpAddresses"`
	// The location where the App Service Environment exists.
	Location string `pulumi:"location"`
	// The name of the Cluster Setting.
	Name string `pulumi:"name"`
	// Pricing tier for the front end instances.
	PricingTier            string `pulumi:"pricingTier"`
	RemoteDebuggingEnabled bool   `pulumi:"remoteDebuggingEnabled"`
	ResourceGroupName      string `pulumi:"resourceGroupName"`
	// The ID of the v3 App Service Environment Subnet.
	SubnetId string `pulumi:"subnetId"`
	// A mapping of tags assigned to the v3 App Service Environment.
	Tags map[string]string `pulumi:"tags"`
	// Outbound addresses of Windows based Apps in this App Service Environment V3.
	WindowsOutboundIpAddresses []string `pulumi:"windowsOutboundIpAddresses"`
	ZoneRedundant              bool     `pulumi:"zoneRedundant"`
}

func LookupEnvironmentV3Output(ctx *pulumi.Context, args LookupEnvironmentV3OutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentV3ResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentV3ResultOutput, error) {
			args := v.(LookupEnvironmentV3Args)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:appservice/getEnvironmentV3:getEnvironmentV3", args, LookupEnvironmentV3ResultOutput{}, options).(LookupEnvironmentV3ResultOutput), nil
		}).(LookupEnvironmentV3ResultOutput)
}

// A collection of arguments for invoking getEnvironmentV3.
type LookupEnvironmentV3OutputArgs struct {
	// The name of this v3 App Service Environment.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the v3 App Service Environment exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupEnvironmentV3OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentV3Args)(nil)).Elem()
}

// A collection of values returned by getEnvironmentV3.
type LookupEnvironmentV3ResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentV3ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentV3Result)(nil)).Elem()
}

func (o LookupEnvironmentV3ResultOutput) ToLookupEnvironmentV3ResultOutput() LookupEnvironmentV3ResultOutput {
	return o
}

func (o LookupEnvironmentV3ResultOutput) ToLookupEnvironmentV3ResultOutputWithContext(ctx context.Context) LookupEnvironmentV3ResultOutput {
	return o
}

// Are new Private Endpoint Connections allowed.
func (o LookupEnvironmentV3ResultOutput) AllowNewPrivateEndpointConnections() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) bool { return v.AllowNewPrivateEndpointConnections }).(pulumi.BoolOutput)
}

// A `clusterSetting` block as defined below.
func (o LookupEnvironmentV3ResultOutput) ClusterSettings() GetEnvironmentV3ClusterSettingArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []GetEnvironmentV3ClusterSetting { return v.ClusterSettings }).(GetEnvironmentV3ClusterSettingArrayOutput)
}

// The number of Dedicated Hosts used by this ASEv3.
func (o LookupEnvironmentV3ResultOutput) DedicatedHostCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) int { return v.DedicatedHostCount }).(pulumi.IntOutput)
}

// the DNS suffix for this App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) DnsSuffix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.DnsSuffix }).(pulumi.StringOutput)
}

// The external inbound IP addresses of the App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) ExternalInboundIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []string { return v.ExternalInboundIpAddresses }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentV3ResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.Id }).(pulumi.StringOutput)
}

// An Inbound Network Dependencies block as defined below.
func (o LookupEnvironmentV3ResultOutput) InboundNetworkDependencies() GetEnvironmentV3InboundNetworkDependencyArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []GetEnvironmentV3InboundNetworkDependency {
		return v.InboundNetworkDependencies
	}).(GetEnvironmentV3InboundNetworkDependencyArrayOutput)
}

// The internal inbound IP addresses of the App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) InternalInboundIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []string { return v.InternalInboundIpAddresses }).(pulumi.StringArrayOutput)
}

// The Internal Load Balancing Mode of this ASEv3.
func (o LookupEnvironmentV3ResultOutput) InternalLoadBalancingMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.InternalLoadBalancingMode }).(pulumi.StringOutput)
}

// The number of IP SSL addresses reserved for the App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) IpSslAddressCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) int { return v.IpSslAddressCount }).(pulumi.IntOutput)
}

// The list of Outbound IP Addresses of Linux based Apps in this App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) LinuxOutboundIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []string { return v.LinuxOutboundIpAddresses }).(pulumi.StringArrayOutput)
}

// The location where the App Service Environment exists.
func (o LookupEnvironmentV3ResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.Location }).(pulumi.StringOutput)
}

// The name of the Cluster Setting.
func (o LookupEnvironmentV3ResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.Name }).(pulumi.StringOutput)
}

// Pricing tier for the front end instances.
func (o LookupEnvironmentV3ResultOutput) PricingTier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.PricingTier }).(pulumi.StringOutput)
}

func (o LookupEnvironmentV3ResultOutput) RemoteDebuggingEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) bool { return v.RemoteDebuggingEnabled }).(pulumi.BoolOutput)
}

func (o LookupEnvironmentV3ResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The ID of the v3 App Service Environment Subnet.
func (o LookupEnvironmentV3ResultOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) string { return v.SubnetId }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the v3 App Service Environment.
func (o LookupEnvironmentV3ResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Outbound addresses of Windows based Apps in this App Service Environment V3.
func (o LookupEnvironmentV3ResultOutput) WindowsOutboundIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) []string { return v.WindowsOutboundIpAddresses }).(pulumi.StringArrayOutput)
}

func (o LookupEnvironmentV3ResultOutput) ZoneRedundant() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEnvironmentV3Result) bool { return v.ZoneRedundant }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentV3ResultOutput{})
}
