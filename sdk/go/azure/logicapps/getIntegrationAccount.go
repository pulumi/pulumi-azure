// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package logicapps

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Logic App Integration Account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/logicapps"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := logicapps.LookupIntegrationAccount(ctx, &logicapps.LookupIntegrationAccountArgs{
//				Name:              "example-account",
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
// * `Microsoft.Logic`: 2019-05-01
func LookupIntegrationAccount(ctx *pulumi.Context, args *LookupIntegrationAccountArgs, opts ...pulumi.InvokeOption) (*LookupIntegrationAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIntegrationAccountResult
	err := ctx.Invoke("azure:logicapps/getIntegrationAccount:getIntegrationAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIntegrationAccount.
type LookupIntegrationAccountArgs struct {
	// The name of this Logic App Integration Account.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Logic App Integration Account exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getIntegrationAccount.
type LookupIntegrationAccountResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Azure Region where the Logic App Integration Account exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The SKU name of the Logic App Integration Account.
	SkuName string `pulumi:"skuName"`
	// A mapping of tags assigned to the Logic App Integration Account.
	Tags map[string]string `pulumi:"tags"`
}

func LookupIntegrationAccountOutput(ctx *pulumi.Context, args LookupIntegrationAccountOutputArgs, opts ...pulumi.InvokeOption) LookupIntegrationAccountResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupIntegrationAccountResultOutput, error) {
			args := v.(LookupIntegrationAccountArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:logicapps/getIntegrationAccount:getIntegrationAccount", args, LookupIntegrationAccountResultOutput{}, options).(LookupIntegrationAccountResultOutput), nil
		}).(LookupIntegrationAccountResultOutput)
}

// A collection of arguments for invoking getIntegrationAccount.
type LookupIntegrationAccountOutputArgs struct {
	// The name of this Logic App Integration Account.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Logic App Integration Account exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupIntegrationAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIntegrationAccountArgs)(nil)).Elem()
}

// A collection of values returned by getIntegrationAccount.
type LookupIntegrationAccountResultOutput struct{ *pulumi.OutputState }

func (LookupIntegrationAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIntegrationAccountResult)(nil)).Elem()
}

func (o LookupIntegrationAccountResultOutput) ToLookupIntegrationAccountResultOutput() LookupIntegrationAccountResultOutput {
	return o
}

func (o LookupIntegrationAccountResultOutput) ToLookupIntegrationAccountResultOutputWithContext(ctx context.Context) LookupIntegrationAccountResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupIntegrationAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Azure Region where the Logic App Integration Account exists.
func (o LookupIntegrationAccountResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupIntegrationAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupIntegrationAccountResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The SKU name of the Logic App Integration Account.
func (o LookupIntegrationAccountResultOutput) SkuName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) string { return v.SkuName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Logic App Integration Account.
func (o LookupIntegrationAccountResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupIntegrationAccountResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIntegrationAccountResultOutput{})
}
