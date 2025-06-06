// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing API Management Product.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/apimanagement"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := apimanagement.LookupProduct(ctx, &apimanagement.LookupProductArgs{
//				ProductId:         "my-product",
//				ApiManagementName: "example-apim",
//				ResourceGroupName: "search-service",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("productTerms", example.Terms)
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
// * `Microsoft.ApiManagement`: 2022-08-01
func LookupProduct(ctx *pulumi.Context, args *LookupProductArgs, opts ...pulumi.InvokeOption) (*LookupProductResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupProductResult
	err := ctx.Invoke("azure:apimanagement/getProduct:getProduct", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProduct.
type LookupProductArgs struct {
	// The Name of the API Management Service in which this Product exists.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The Identifier for the API Management Product.
	ProductId string `pulumi:"productId"`
	// The Name of the Resource Group in which the API Management Service exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getProduct.
type LookupProductResult struct {
	ApiManagementName string `pulumi:"apiManagementName"`
	// Do subscribers need to be approved prior to being able to use the Product?
	ApprovalRequired bool `pulumi:"approvalRequired"`
	// The description of this Product, which may include HTML formatting tags.
	Description string `pulumi:"description"`
	// The Display Name for this API Management Product.
	DisplayName string `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id        string `pulumi:"id"`
	ProductId string `pulumi:"productId"`
	// Is this Product Published?
	Published         bool   `pulumi:"published"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Is a Subscription required to access API's included in this Product?
	SubscriptionRequired bool `pulumi:"subscriptionRequired"`
	// The number of subscriptions a user can have to this Product at the same time.
	SubscriptionsLimit int `pulumi:"subscriptionsLimit"`
	// Any Terms and Conditions for this Product, which must be accepted by Developers before they can begin the Subscription process.
	Terms string `pulumi:"terms"`
}

func LookupProductOutput(ctx *pulumi.Context, args LookupProductOutputArgs, opts ...pulumi.InvokeOption) LookupProductResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupProductResultOutput, error) {
			args := v.(LookupProductArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:apimanagement/getProduct:getProduct", args, LookupProductResultOutput{}, options).(LookupProductResultOutput), nil
		}).(LookupProductResultOutput)
}

// A collection of arguments for invoking getProduct.
type LookupProductOutputArgs struct {
	// The Name of the API Management Service in which this Product exists.
	ApiManagementName pulumi.StringInput `pulumi:"apiManagementName"`
	// The Identifier for the API Management Product.
	ProductId pulumi.StringInput `pulumi:"productId"`
	// The Name of the Resource Group in which the API Management Service exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupProductOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProductArgs)(nil)).Elem()
}

// A collection of values returned by getProduct.
type LookupProductResultOutput struct{ *pulumi.OutputState }

func (LookupProductResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupProductResult)(nil)).Elem()
}

func (o LookupProductResultOutput) ToLookupProductResultOutput() LookupProductResultOutput {
	return o
}

func (o LookupProductResultOutput) ToLookupProductResultOutputWithContext(ctx context.Context) LookupProductResultOutput {
	return o
}

func (o LookupProductResultOutput) ApiManagementName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.ApiManagementName }).(pulumi.StringOutput)
}

// Do subscribers need to be approved prior to being able to use the Product?
func (o LookupProductResultOutput) ApprovalRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProductResult) bool { return v.ApprovalRequired }).(pulumi.BoolOutput)
}

// The description of this Product, which may include HTML formatting tags.
func (o LookupProductResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.Description }).(pulumi.StringOutput)
}

// The Display Name for this API Management Product.
func (o LookupProductResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupProductResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupProductResultOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.ProductId }).(pulumi.StringOutput)
}

// Is this Product Published?
func (o LookupProductResultOutput) Published() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProductResult) bool { return v.Published }).(pulumi.BoolOutput)
}

func (o LookupProductResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Is a Subscription required to access API's included in this Product?
func (o LookupProductResultOutput) SubscriptionRequired() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupProductResult) bool { return v.SubscriptionRequired }).(pulumi.BoolOutput)
}

// The number of subscriptions a user can have to this Product at the same time.
func (o LookupProductResultOutput) SubscriptionsLimit() pulumi.IntOutput {
	return o.ApplyT(func(v LookupProductResult) int { return v.SubscriptionsLimit }).(pulumi.IntOutput)
}

// Any Terms and Conditions for this Product, which must be accepted by Developers before they can begin the Subscription process.
func (o LookupProductResultOutput) Terms() pulumi.StringOutput {
	return o.ApplyT(func(v LookupProductResult) string { return v.Terms }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupProductResultOutput{})
}
