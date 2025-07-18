// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devcenter

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Dev Center Attached Network.
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
//			example, err := devcenter.LookupAttachedNetwork(ctx, &devcenter.LookupAttachedNetworkArgs{
//				Name:        exampleAzurermDevCenterAttachedNetwork.Name,
//				DevCenterId: exampleAzurermDevCenterAttachedNetwork.DevCenterId,
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
func LookupAttachedNetwork(ctx *pulumi.Context, args *LookupAttachedNetworkArgs, opts ...pulumi.InvokeOption) (*LookupAttachedNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAttachedNetworkResult
	err := ctx.Invoke("azure:devcenter/getAttachedNetwork:getAttachedNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAttachedNetwork.
type LookupAttachedNetworkArgs struct {
	// The ID of the associated Dev Center.
	DevCenterId string `pulumi:"devCenterId"`
	// The name of this Dev Center Attached Network.
	Name string `pulumi:"name"`
}

// A collection of values returned by getAttachedNetwork.
type LookupAttachedNetworkResult struct {
	DevCenterId string `pulumi:"devCenterId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The ID of the attached Dev Center Network Connection.
	NetworkConnectionId string `pulumi:"networkConnectionId"`
}

func LookupAttachedNetworkOutput(ctx *pulumi.Context, args LookupAttachedNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupAttachedNetworkResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAttachedNetworkResultOutput, error) {
			args := v.(LookupAttachedNetworkArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:devcenter/getAttachedNetwork:getAttachedNetwork", args, LookupAttachedNetworkResultOutput{}, options).(LookupAttachedNetworkResultOutput), nil
		}).(LookupAttachedNetworkResultOutput)
}

// A collection of arguments for invoking getAttachedNetwork.
type LookupAttachedNetworkOutputArgs struct {
	// The ID of the associated Dev Center.
	DevCenterId pulumi.StringInput `pulumi:"devCenterId"`
	// The name of this Dev Center Attached Network.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupAttachedNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAttachedNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getAttachedNetwork.
type LookupAttachedNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupAttachedNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAttachedNetworkResult)(nil)).Elem()
}

func (o LookupAttachedNetworkResultOutput) ToLookupAttachedNetworkResultOutput() LookupAttachedNetworkResultOutput {
	return o
}

func (o LookupAttachedNetworkResultOutput) ToLookupAttachedNetworkResultOutputWithContext(ctx context.Context) LookupAttachedNetworkResultOutput {
	return o
}

func (o LookupAttachedNetworkResultOutput) DevCenterId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAttachedNetworkResult) string { return v.DevCenterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAttachedNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAttachedNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAttachedNetworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAttachedNetworkResult) string { return v.Name }).(pulumi.StringOutput)
}

// The ID of the attached Dev Center Network Connection.
func (o LookupAttachedNetworkResultOutput) NetworkConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAttachedNetworkResult) string { return v.NetworkConnectionId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAttachedNetworkResultOutput{})
}
