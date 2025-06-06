// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package batch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Batch Application instance.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/batch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := batch.LookupApplication(ctx, &batch.LookupApplicationArgs{
//				Name:              "testapplication",
//				ResourceGroupName: "test",
//				AccountName:       "testbatchaccount",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("batchApplicationId", example.Id)
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
// * `Microsoft.Batch`: 2024-07-01
func LookupApplication(ctx *pulumi.Context, args *LookupApplicationArgs, opts ...pulumi.InvokeOption) (*LookupApplicationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplicationResult
	err := ctx.Invoke("azure:batch/getApplication:getApplication", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplication.
type LookupApplicationArgs struct {
	// The name of the Batch account.
	AccountName string `pulumi:"accountName"`
	// The name of the Application.
	Name string `pulumi:"name"`
	// The name of the Resource Group where this Batch account exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getApplication.
type LookupApplicationResult struct {
	AccountName string `pulumi:"accountName"`
	// May packages within the application be overwritten using the same version string.
	AllowUpdates bool `pulumi:"allowUpdates"`
	// The package to use if a client requests the application but does not specify a version.
	DefaultVersion string `pulumi:"defaultVersion"`
	// The display name for the application.
	DisplayName string `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Batch application name.
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

func LookupApplicationOutput(ctx *pulumi.Context, args LookupApplicationOutputArgs, opts ...pulumi.InvokeOption) LookupApplicationResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupApplicationResultOutput, error) {
			args := v.(LookupApplicationArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:batch/getApplication:getApplication", args, LookupApplicationResultOutput{}, options).(LookupApplicationResultOutput), nil
		}).(LookupApplicationResultOutput)
}

// A collection of arguments for invoking getApplication.
type LookupApplicationOutputArgs struct {
	// The name of the Batch account.
	AccountName pulumi.StringInput `pulumi:"accountName"`
	// The name of the Application.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where this Batch account exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupApplicationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationArgs)(nil)).Elem()
}

// A collection of values returned by getApplication.
type LookupApplicationResultOutput struct{ *pulumi.OutputState }

func (LookupApplicationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationResult)(nil)).Elem()
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutput() LookupApplicationResultOutput {
	return o
}

func (o LookupApplicationResultOutput) ToLookupApplicationResultOutputWithContext(ctx context.Context) LookupApplicationResultOutput {
	return o
}

func (o LookupApplicationResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// May packages within the application be overwritten using the same version string.
func (o LookupApplicationResultOutput) AllowUpdates() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationResult) bool { return v.AllowUpdates }).(pulumi.BoolOutput)
}

// The package to use if a client requests the application but does not specify a version.
func (o LookupApplicationResultOutput) DefaultVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.DefaultVersion }).(pulumi.StringOutput)
}

// The display name for the application.
func (o LookupApplicationResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplicationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Batch application name.
func (o LookupApplicationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupApplicationResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplicationResultOutput{})
}
