// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing IotHub Shared Access Policy
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/iot"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := iot.LookupSharedAccessPolicy(ctx, &iot.LookupSharedAccessPolicyArgs{
//				Name:              "example",
//				ResourceGroupName: exampleAzurermResourceGroup.Name,
//				IothubName:        exampleAzurermIothub.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSharedAccessPolicy(ctx *pulumi.Context, args *LookupSharedAccessPolicyArgs, opts ...pulumi.InvokeOption) (*LookupSharedAccessPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSharedAccessPolicyResult
	err := ctx.Invoke("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedAccessPolicy.
type LookupSharedAccessPolicyArgs struct {
	// The name of the IoTHub to which this Shared Access Policy belongs.
	IothubName string `pulumi:"iothubName"`
	// Specifies the name of the IotHub Shared Access Policy resource.
	Name string `pulumi:"name"`
	// The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getSharedAccessPolicy.
type LookupSharedAccessPolicyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	IothubName string `pulumi:"iothubName"`
	Name       string `pulumi:"name"`
	// The primary connection string of the Shared Access Policy.
	PrimaryConnectionString string `pulumi:"primaryConnectionString"`
	// The primary key used to create the authentication token.
	PrimaryKey        string `pulumi:"primaryKey"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The secondary connection string of the Shared Access Policy.
	SecondaryConnectionString string `pulumi:"secondaryConnectionString"`
	// The secondary key used to create the authentication token.
	SecondaryKey string `pulumi:"secondaryKey"`
}

func LookupSharedAccessPolicyOutput(ctx *pulumi.Context, args LookupSharedAccessPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupSharedAccessPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSharedAccessPolicyResultOutput, error) {
			args := v.(LookupSharedAccessPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", args, LookupSharedAccessPolicyResultOutput{}, options).(LookupSharedAccessPolicyResultOutput), nil
		}).(LookupSharedAccessPolicyResultOutput)
}

// A collection of arguments for invoking getSharedAccessPolicy.
type LookupSharedAccessPolicyOutputArgs struct {
	// The name of the IoTHub to which this Shared Access Policy belongs.
	IothubName pulumi.StringInput `pulumi:"iothubName"`
	// Specifies the name of the IotHub Shared Access Policy resource.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the resource group under which the IotHub Shared Access Policy resource has to be created.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupSharedAccessPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSharedAccessPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getSharedAccessPolicy.
type LookupSharedAccessPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupSharedAccessPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSharedAccessPolicyResult)(nil)).Elem()
}

func (o LookupSharedAccessPolicyResultOutput) ToLookupSharedAccessPolicyResultOutput() LookupSharedAccessPolicyResultOutput {
	return o
}

func (o LookupSharedAccessPolicyResultOutput) ToLookupSharedAccessPolicyResultOutputWithContext(ctx context.Context) LookupSharedAccessPolicyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSharedAccessPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSharedAccessPolicyResultOutput) IothubName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.IothubName }).(pulumi.StringOutput)
}

func (o LookupSharedAccessPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// The primary connection string of the Shared Access Policy.
func (o LookupSharedAccessPolicyResultOutput) PrimaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.PrimaryConnectionString }).(pulumi.StringOutput)
}

// The primary key used to create the authentication token.
func (o LookupSharedAccessPolicyResultOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.PrimaryKey }).(pulumi.StringOutput)
}

func (o LookupSharedAccessPolicyResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The secondary connection string of the Shared Access Policy.
func (o LookupSharedAccessPolicyResultOutput) SecondaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.SecondaryConnectionString }).(pulumi.StringOutput)
}

// The secondary key used to create the authentication token.
func (o LookupSharedAccessPolicyResultOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSharedAccessPolicyResult) string { return v.SecondaryKey }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSharedAccessPolicyResultOutput{})
}
