// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package maps

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Azure Maps Account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/maps"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := maps.LookupAccount(ctx, &maps.LookupAccountArgs{
//				Name:              "production",
//				ResourceGroupName: "maps",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mapsAccountId", example.Id)
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
// * `Microsoft.Maps`: 2023-06-01
func LookupAccount(ctx *pulumi.Context, args *LookupAccountArgs, opts ...pulumi.InvokeOption) (*LookupAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountResult
	err := ctx.Invoke("azure:maps/getAccount:getAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccount.
type LookupAccountArgs struct {
	// Specifies the name of the Maps Account.
	Name string `pulumi:"name"`
	// Specifies the name of the Resource Group in which the Maps Account is located.
	ResourceGroupName string            `pulumi:"resourceGroupName"`
	Tags              map[string]string `pulumi:"tags"`
}

// A collection of values returned by getAccount.
type LookupAccountResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The primary key used to authenticate and authorize access to the Maps REST APIs.
	PrimaryAccessKey  string `pulumi:"primaryAccessKey"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The primary key used to authenticate and authorize access to the Maps REST APIs. The second key is given to provide seamless key regeneration.
	SecondaryAccessKey string `pulumi:"secondaryAccessKey"`
	// The SKU of the Azure Maps Account.
	SkuName string            `pulumi:"skuName"`
	Tags    map[string]string `pulumi:"tags"`
	// A unique identifier for the Maps Account.
	XMsClientId string `pulumi:"xMsClientId"`
}

func LookupAccountOutput(ctx *pulumi.Context, args LookupAccountOutputArgs, opts ...pulumi.InvokeOption) LookupAccountResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccountResultOutput, error) {
			args := v.(LookupAccountArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:maps/getAccount:getAccount", args, LookupAccountResultOutput{}, options).(LookupAccountResultOutput), nil
		}).(LookupAccountResultOutput)
}

// A collection of arguments for invoking getAccount.
type LookupAccountOutputArgs struct {
	// Specifies the name of the Maps Account.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the name of the Resource Group in which the Maps Account is located.
	ResourceGroupName pulumi.StringInput    `pulumi:"resourceGroupName"`
	Tags              pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountArgs)(nil)).Elem()
}

// A collection of values returned by getAccount.
type LookupAccountResultOutput struct{ *pulumi.OutputState }

func (LookupAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountResult)(nil)).Elem()
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutput() LookupAccountResultOutput {
	return o
}

func (o LookupAccountResultOutput) ToLookupAccountResultOutputWithContext(ctx context.Context) LookupAccountResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.Name }).(pulumi.StringOutput)
}

// The primary key used to authenticate and authorize access to the Maps REST APIs.
func (o LookupAccountResultOutput) PrimaryAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.PrimaryAccessKey }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The primary key used to authenticate and authorize access to the Maps REST APIs. The second key is given to provide seamless key regeneration.
func (o LookupAccountResultOutput) SecondaryAccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.SecondaryAccessKey }).(pulumi.StringOutput)
}

// The SKU of the Azure Maps Account.
func (o LookupAccountResultOutput) SkuName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.SkuName }).(pulumi.StringOutput)
}

func (o LookupAccountResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupAccountResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// A unique identifier for the Maps Account.
func (o LookupAccountResultOutput) XMsClientId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountResult) string { return v.XMsClientId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountResultOutput{})
}
