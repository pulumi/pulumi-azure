// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing IP Group.
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
//			example, err := network.GetIpGroup(ctx, &network.GetIpGroupArgs{
//				Name:              "example1-ipgroup",
//				ResourceGroupName: "example-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("cidrs", example.Cidrs)
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
func GetIpGroup(ctx *pulumi.Context, args *GetIpGroupArgs, opts ...pulumi.InvokeOption) (*GetIpGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpGroupResult
	err := ctx.Invoke("azure:network/getIpGroup:getIpGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpGroup.
type GetIpGroupArgs struct {
	// Specifies the Name of the IP Group.
	Name string `pulumi:"name"`
	// Specifies the Name of the Resource Group within which the IP Group exists
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getIpGroup.
type GetIpGroupResult struct {
	// A list of CIDRs or IP addresses.
	Cidrs []string `pulumi:"cidrs"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The supported Azure location where the resource exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func GetIpGroupOutput(ctx *pulumi.Context, args GetIpGroupOutputArgs, opts ...pulumi.InvokeOption) GetIpGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetIpGroupResultOutput, error) {
			args := v.(GetIpGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:network/getIpGroup:getIpGroup", args, GetIpGroupResultOutput{}, options).(GetIpGroupResultOutput), nil
		}).(GetIpGroupResultOutput)
}

// A collection of arguments for invoking getIpGroup.
type GetIpGroupOutputArgs struct {
	// Specifies the Name of the IP Group.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the Name of the Resource Group within which the IP Group exists
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (GetIpGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpGroupArgs)(nil)).Elem()
}

// A collection of values returned by getIpGroup.
type GetIpGroupResultOutput struct{ *pulumi.OutputState }

func (GetIpGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpGroupResult)(nil)).Elem()
}

func (o GetIpGroupResultOutput) ToGetIpGroupResultOutput() GetIpGroupResultOutput {
	return o
}

func (o GetIpGroupResultOutput) ToGetIpGroupResultOutputWithContext(ctx context.Context) GetIpGroupResultOutput {
	return o
}

// A list of CIDRs or IP addresses.
func (o GetIpGroupResultOutput) Cidrs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetIpGroupResult) []string { return v.Cidrs }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// The supported Azure location where the resource exists.
func (o GetIpGroupResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpGroupResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o GetIpGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetIpGroupResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpGroupResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o GetIpGroupResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetIpGroupResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpGroupResultOutput{})
}
