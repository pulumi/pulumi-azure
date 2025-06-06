// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Network Watcher.
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
//			example, err := network.LookupNetworkWatcher(ctx, &network.LookupNetworkWatcherArgs{
//				Name:              exampleAzurermNetworkWatcher.Name,
//				ResourceGroupName: exampleAzurermResourceGroup.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("networkWatcherId", example.Id)
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
func LookupNetworkWatcher(ctx *pulumi.Context, args *LookupNetworkWatcherArgs, opts ...pulumi.InvokeOption) (*LookupNetworkWatcherResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkWatcherResult
	err := ctx.Invoke("azure:network/getNetworkWatcher:getNetworkWatcher", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkWatcher.
type LookupNetworkWatcherArgs struct {
	// Specifies the Name of the Network Watcher.
	Name string `pulumi:"name"`
	// Specifies the Name of the Resource Group within which the Network Watcher exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getNetworkWatcher.
type LookupNetworkWatcherResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The supported Azure location where the resource exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func LookupNetworkWatcherOutput(ctx *pulumi.Context, args LookupNetworkWatcherOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkWatcherResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkWatcherResultOutput, error) {
			args := v.(LookupNetworkWatcherArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:network/getNetworkWatcher:getNetworkWatcher", args, LookupNetworkWatcherResultOutput{}, options).(LookupNetworkWatcherResultOutput), nil
		}).(LookupNetworkWatcherResultOutput)
}

// A collection of arguments for invoking getNetworkWatcher.
type LookupNetworkWatcherOutputArgs struct {
	// Specifies the Name of the Network Watcher.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the Name of the Resource Group within which the Network Watcher exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupNetworkWatcherOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkWatcherArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkWatcher.
type LookupNetworkWatcherResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkWatcherResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkWatcherResult)(nil)).Elem()
}

func (o LookupNetworkWatcherResultOutput) ToLookupNetworkWatcherResultOutput() LookupNetworkWatcherResultOutput {
	return o
}

func (o LookupNetworkWatcherResultOutput) ToLookupNetworkWatcherResultOutputWithContext(ctx context.Context) LookupNetworkWatcherResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkWatcherResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkWatcherResult) string { return v.Id }).(pulumi.StringOutput)
}

// The supported Azure location where the resource exists.
func (o LookupNetworkWatcherResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkWatcherResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupNetworkWatcherResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkWatcherResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupNetworkWatcherResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkWatcherResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupNetworkWatcherResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkWatcherResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkWatcherResultOutput{})
}
