// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databoxedge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a Databox Edge Device.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/databoxedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databoxedge.LookupDevice(ctx, &databoxedge.LookupDeviceArgs{
//				Name:              "example-device",
//				ResourceGroupName: "example-rg",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDevice(ctx *pulumi.Context, args *LookupDeviceArgs, opts ...pulumi.InvokeOption) (*LookupDeviceResult, error) {
	var rv LookupDeviceResult
	err := ctx.Invoke("azure:databoxedge/getDevice:getDevice", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDevice.
type LookupDeviceArgs struct {
	// The name which should be used for this Databox Edge Device. Changing this forces a new Databox Edge Device to be created.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Databox Edge Device should exist. Changing this forces a new Databox Edge Device to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getDevice.
type LookupDeviceResult struct {
	// A `deviceProperties` block as defined below.
	DeviceProperties []GetDeviceDeviceProperty `pulumi:"deviceProperties"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Azure Region where the Databox Edge Device should exist.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The `skuName` is comprised of two segments separated by a hyphen (e.g. `TEA_1Node_UPS_Heater-Standard`). The first segment of the `skuName` defines the `name` of the SKU. The second segment defines the `tier` of the `skuName`. For more information see the product documentation.
	SkuName string `pulumi:"skuName"`
	// A mapping of tags which should be assigned to the Databox Edge Device.
	Tags map[string]string `pulumi:"tags"`
}

func LookupDeviceOutput(ctx *pulumi.Context, args LookupDeviceOutputArgs, opts ...pulumi.InvokeOption) LookupDeviceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDeviceResult, error) {
			args := v.(LookupDeviceArgs)
			r, err := LookupDevice(ctx, &args, opts...)
			var s LookupDeviceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDeviceResultOutput)
}

// A collection of arguments for invoking getDevice.
type LookupDeviceOutputArgs struct {
	// The name which should be used for this Databox Edge Device. Changing this forces a new Databox Edge Device to be created.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Databox Edge Device should exist. Changing this forces a new Databox Edge Device to be created.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupDeviceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDeviceArgs)(nil)).Elem()
}

// A collection of values returned by getDevice.
type LookupDeviceResultOutput struct{ *pulumi.OutputState }

func (LookupDeviceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDeviceResult)(nil)).Elem()
}

func (o LookupDeviceResultOutput) ToLookupDeviceResultOutput() LookupDeviceResultOutput {
	return o
}

func (o LookupDeviceResultOutput) ToLookupDeviceResultOutputWithContext(ctx context.Context) LookupDeviceResultOutput {
	return o
}

// A `deviceProperties` block as defined below.
func (o LookupDeviceResultOutput) DeviceProperties() GetDeviceDevicePropertyArrayOutput {
	return o.ApplyT(func(v LookupDeviceResult) []GetDeviceDeviceProperty { return v.DeviceProperties }).(GetDeviceDevicePropertyArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDeviceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeviceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Azure Region where the Databox Edge Device should exist.
func (o LookupDeviceResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeviceResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupDeviceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeviceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDeviceResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeviceResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The `skuName` is comprised of two segments separated by a hyphen (e.g. `TEA_1Node_UPS_Heater-Standard`). The first segment of the `skuName` defines the `name` of the SKU. The second segment defines the `tier` of the `skuName`. For more information see the product documentation.
func (o LookupDeviceResultOutput) SkuName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDeviceResult) string { return v.SkuName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Databox Edge Device.
func (o LookupDeviceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDeviceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDeviceResultOutput{})
}