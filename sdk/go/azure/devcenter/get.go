// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devcenter

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Dev Center.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/devcenter"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := devcenter.Get(ctx, &devcenter.GetArgs{
//				Name:              "example",
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
// * `Microsoft.DevCenter`: 2025-02-01
func Get(ctx *pulumi.Context, args *GetArgs, opts ...pulumi.InvokeOption) (*GetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetResult
	err := ctx.Invoke("azure:devcenter/get:get", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking get.
type GetArgs struct {
	// The name of this Dev Center.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Dev Center exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by get.
type GetResult struct {
	// The URI of the Dev Center.
	DevCenterUri string `pulumi:"devCenterUri"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `identity` block as defined below.
	Identities []GetIdentity `pulumi:"identities"`
	// The Azure Region where the Dev Center exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the Dev Center.
	Tags map[string]string `pulumi:"tags"`
}

func GetOutput(ctx *pulumi.Context, args GetOutputArgs, opts ...pulumi.InvokeOption) GetResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetResultOutput, error) {
			args := v.(GetArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:devcenter/get:get", args, GetResultOutput{}, options).(GetResultOutput), nil
		}).(GetResultOutput)
}

// A collection of arguments for invoking get.
type GetOutputArgs struct {
	// The name of this Dev Center.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Dev Center exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (GetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetArgs)(nil)).Elem()
}

// A collection of values returned by get.
type GetResultOutput struct{ *pulumi.OutputState }

func (GetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetResult)(nil)).Elem()
}

func (o GetResultOutput) ToGetResultOutput() GetResultOutput {
	return o
}

func (o GetResultOutput) ToGetResultOutputWithContext(ctx context.Context) GetResultOutput {
	return o
}

// The URI of the Dev Center.
func (o GetResultOutput) DevCenterUri() pulumi.StringOutput {
	return o.ApplyT(func(v GetResult) string { return v.DevCenterUri }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetResult) string { return v.Id }).(pulumi.StringOutput)
}

// An `identity` block as defined below.
func (o GetResultOutput) Identities() GetIdentityArrayOutput {
	return o.ApplyT(func(v GetResult) []GetIdentity { return v.Identities }).(GetIdentityArrayOutput)
}

// The Azure Region where the Dev Center exists.
func (o GetResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o GetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Dev Center.
func (o GetResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetResultOutput{})
}
