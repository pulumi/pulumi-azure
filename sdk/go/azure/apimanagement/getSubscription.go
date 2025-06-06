// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing API Management Subscription.
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
//			example, err := apimanagement.LookupSubscription(ctx, &apimanagement.LookupSubscriptionArgs{
//				ApiManagementId: "example-apim",
//				SubscriptionId:  "example-subscription-id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.SubscriptionId)
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
func LookupSubscription(ctx *pulumi.Context, args *LookupSubscriptionArgs, opts ...pulumi.InvokeOption) (*LookupSubscriptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSubscriptionResult
	err := ctx.Invoke("azure:apimanagement/getSubscription:getSubscription", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSubscription.
type LookupSubscriptionArgs struct {
	// The ID of the API Management Service in which this Subscription exists.
	ApiManagementId string `pulumi:"apiManagementId"`
	// The Identifier for the API Management Subscription.
	SubscriptionId string `pulumi:"subscriptionId"`
}

// A collection of values returned by getSubscription.
type LookupSubscriptionResult struct {
	// Indicates whether tracing is enabled.
	AllowTracing bool `pulumi:"allowTracing"`
	// The ID of the API assigned to this Subscription.
	ApiId           string `pulumi:"apiId"`
	ApiManagementId string `pulumi:"apiManagementId"`
	// The display name of this Subscription.
	DisplayName string `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The primary key for this subscription.
	PrimaryKey string `pulumi:"primaryKey"`
	// The ID of the Product assigned to this Subscription.
	ProductId string `pulumi:"productId"`
	// The secondary key for this subscription.
	SecondaryKey string `pulumi:"secondaryKey"`
	// The state of this Subscription.
	State          string `pulumi:"state"`
	SubscriptionId string `pulumi:"subscriptionId"`
	// The ID of the User assigned to this Subscription.
	UserId string `pulumi:"userId"`
}

func LookupSubscriptionOutput(ctx *pulumi.Context, args LookupSubscriptionOutputArgs, opts ...pulumi.InvokeOption) LookupSubscriptionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSubscriptionResultOutput, error) {
			args := v.(LookupSubscriptionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:apimanagement/getSubscription:getSubscription", args, LookupSubscriptionResultOutput{}, options).(LookupSubscriptionResultOutput), nil
		}).(LookupSubscriptionResultOutput)
}

// A collection of arguments for invoking getSubscription.
type LookupSubscriptionOutputArgs struct {
	// The ID of the API Management Service in which this Subscription exists.
	ApiManagementId pulumi.StringInput `pulumi:"apiManagementId"`
	// The Identifier for the API Management Subscription.
	SubscriptionId pulumi.StringInput `pulumi:"subscriptionId"`
}

func (LookupSubscriptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubscriptionArgs)(nil)).Elem()
}

// A collection of values returned by getSubscription.
type LookupSubscriptionResultOutput struct{ *pulumi.OutputState }

func (LookupSubscriptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSubscriptionResult)(nil)).Elem()
}

func (o LookupSubscriptionResultOutput) ToLookupSubscriptionResultOutput() LookupSubscriptionResultOutput {
	return o
}

func (o LookupSubscriptionResultOutput) ToLookupSubscriptionResultOutputWithContext(ctx context.Context) LookupSubscriptionResultOutput {
	return o
}

// Indicates whether tracing is enabled.
func (o LookupSubscriptionResultOutput) AllowTracing() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) bool { return v.AllowTracing }).(pulumi.BoolOutput)
}

// The ID of the API assigned to this Subscription.
func (o LookupSubscriptionResultOutput) ApiId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.ApiId }).(pulumi.StringOutput)
}

func (o LookupSubscriptionResultOutput) ApiManagementId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.ApiManagementId }).(pulumi.StringOutput)
}

// The display name of this Subscription.
func (o LookupSubscriptionResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSubscriptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The primary key for this subscription.
func (o LookupSubscriptionResultOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.PrimaryKey }).(pulumi.StringOutput)
}

// The ID of the Product assigned to this Subscription.
func (o LookupSubscriptionResultOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.ProductId }).(pulumi.StringOutput)
}

// The secondary key for this subscription.
func (o LookupSubscriptionResultOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.SecondaryKey }).(pulumi.StringOutput)
}

// The state of this Subscription.
func (o LookupSubscriptionResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupSubscriptionResultOutput) SubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.SubscriptionId }).(pulumi.StringOutput)
}

// The ID of the User assigned to this Subscription.
func (o LookupSubscriptionResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSubscriptionResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSubscriptionResultOutput{})
}
