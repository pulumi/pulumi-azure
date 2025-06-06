// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package trafficmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy.
//
// ## Example Usage
//
// ### World)
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
//			example, err := network.GetTrafficManager(ctx, &network.GetTrafficManagerArgs{
//				Name: "World",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("locationCode", example.Id)
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
// * `Microsoft.Network`: 2022-04-01
//
// Deprecated: azure.trafficmanager.getGeographicalLocation has been deprecated in favor of azure.network.getTrafficManager
func GetGeographicalLocation(ctx *pulumi.Context, args *GetGeographicalLocationArgs, opts ...pulumi.InvokeOption) (*GetGeographicalLocationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGeographicalLocationResult
	err := ctx.Invoke("azure:trafficmanager/getGeographicalLocation:getGeographicalLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGeographicalLocation.
type GetGeographicalLocationArgs struct {
	// Specifies the name of the Location, for example `World`, `Europe` or `Germany`.
	Name string `pulumi:"name"`
}

// A collection of values returned by getGeographicalLocation.
type GetGeographicalLocationResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func GetGeographicalLocationOutput(ctx *pulumi.Context, args GetGeographicalLocationOutputArgs, opts ...pulumi.InvokeOption) GetGeographicalLocationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGeographicalLocationResultOutput, error) {
			args := v.(GetGeographicalLocationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:trafficmanager/getGeographicalLocation:getGeographicalLocation", args, GetGeographicalLocationResultOutput{}, options).(GetGeographicalLocationResultOutput), nil
		}).(GetGeographicalLocationResultOutput)
}

// A collection of arguments for invoking getGeographicalLocation.
type GetGeographicalLocationOutputArgs struct {
	// Specifies the name of the Location, for example `World`, `Europe` or `Germany`.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetGeographicalLocationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGeographicalLocationArgs)(nil)).Elem()
}

// A collection of values returned by getGeographicalLocation.
type GetGeographicalLocationResultOutput struct{ *pulumi.OutputState }

func (GetGeographicalLocationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGeographicalLocationResult)(nil)).Elem()
}

func (o GetGeographicalLocationResultOutput) ToGetGeographicalLocationResultOutput() GetGeographicalLocationResultOutput {
	return o
}

func (o GetGeographicalLocationResultOutput) ToGetGeographicalLocationResultOutputWithContext(ctx context.Context) GetGeographicalLocationResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetGeographicalLocationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGeographicalLocationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGeographicalLocationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetGeographicalLocationResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGeographicalLocationResultOutput{})
}
