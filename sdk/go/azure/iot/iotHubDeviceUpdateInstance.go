// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an IoT Hub Device Update Instance.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/iot"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleIotHubDeviceUpdateAccount, err := iot.NewIotHubDeviceUpdateAccount(ctx, "example", &iot.IotHubDeviceUpdateAccountArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleIoTHub, err := iot.NewIoTHub(ctx, "example", &iot.IoTHubArgs{
//				Name:              pulumi.String("example"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku: &iot.IoTHubSkuArgs{
//					Name:     pulumi.String("S1"),
//					Capacity: pulumi.Int(1),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("example"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = iot.NewIotHubDeviceUpdateInstance(ctx, "example", &iot.IotHubDeviceUpdateInstanceArgs{
//				Name:                  pulumi.String("example"),
//				DeviceUpdateAccountId: exampleIotHubDeviceUpdateAccount.ID(),
//				IothubId:              exampleIoTHub.ID(),
//				DiagnosticEnabled:     pulumi.Bool(true),
//				DiagnosticStorageAccount: &iot.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs{
//					ConnectionString: exampleAccount.PrimaryConnectionString,
//					Id:               exampleAccount.ID(),
//				},
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.DeviceUpdate`: 2022-10-01
//
// ## Import
//
// IoT Hub Device Update Instance can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DeviceUpdate/accounts/account1/instances/instance1
// ```
type IotHubDeviceUpdateInstance struct {
	pulumi.CustomResourceState

	// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
	DeviceUpdateAccountId pulumi.StringOutput `pulumi:"deviceUpdateAccountId"`
	// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
	DiagnosticEnabled pulumi.BoolPtrOutput `pulumi:"diagnosticEnabled"`
	// A `diagnosticStorageAccount` block as defined below.
	DiagnosticStorageAccount IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrOutput `pulumi:"diagnosticStorageAccount"`
	// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	IothubId pulumi.StringOutput `pulumi:"iothubId"`
	// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewIotHubDeviceUpdateInstance registers a new resource with the given unique name, arguments, and options.
func NewIotHubDeviceUpdateInstance(ctx *pulumi.Context,
	name string, args *IotHubDeviceUpdateInstanceArgs, opts ...pulumi.ResourceOption) (*IotHubDeviceUpdateInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceUpdateAccountId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceUpdateAccountId'")
	}
	if args.IothubId == nil {
		return nil, errors.New("invalid value for required argument 'IothubId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IotHubDeviceUpdateInstance
	err := ctx.RegisterResource("azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIotHubDeviceUpdateInstance gets an existing IotHubDeviceUpdateInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIotHubDeviceUpdateInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IotHubDeviceUpdateInstanceState, opts ...pulumi.ResourceOption) (*IotHubDeviceUpdateInstance, error) {
	var resource IotHubDeviceUpdateInstance
	err := ctx.ReadResource("azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IotHubDeviceUpdateInstance resources.
type iotHubDeviceUpdateInstanceState struct {
	// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
	DeviceUpdateAccountId *string `pulumi:"deviceUpdateAccountId"`
	// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
	DiagnosticEnabled *bool `pulumi:"diagnosticEnabled"`
	// A `diagnosticStorageAccount` block as defined below.
	DiagnosticStorageAccount *IotHubDeviceUpdateInstanceDiagnosticStorageAccount `pulumi:"diagnosticStorageAccount"`
	// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	IothubId *string `pulumi:"iothubId"`
	// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
	Tags map[string]string `pulumi:"tags"`
}

type IotHubDeviceUpdateInstanceState struct {
	// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
	DeviceUpdateAccountId pulumi.StringPtrInput
	// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
	DiagnosticEnabled pulumi.BoolPtrInput
	// A `diagnosticStorageAccount` block as defined below.
	DiagnosticStorageAccount IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrInput
	// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	IothubId pulumi.StringPtrInput
	// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
	Tags pulumi.StringMapInput
}

func (IotHubDeviceUpdateInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*iotHubDeviceUpdateInstanceState)(nil)).Elem()
}

type iotHubDeviceUpdateInstanceArgs struct {
	// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
	DeviceUpdateAccountId string `pulumi:"deviceUpdateAccountId"`
	// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
	DiagnosticEnabled *bool `pulumi:"diagnosticEnabled"`
	// A `diagnosticStorageAccount` block as defined below.
	DiagnosticStorageAccount *IotHubDeviceUpdateInstanceDiagnosticStorageAccount `pulumi:"diagnosticStorageAccount"`
	// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	IothubId string `pulumi:"iothubId"`
	// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a IotHubDeviceUpdateInstance resource.
type IotHubDeviceUpdateInstanceArgs struct {
	// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
	DeviceUpdateAccountId pulumi.StringInput
	// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
	DiagnosticEnabled pulumi.BoolPtrInput
	// A `diagnosticStorageAccount` block as defined below.
	DiagnosticStorageAccount IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrInput
	// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	IothubId pulumi.StringInput
	// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
	Tags pulumi.StringMapInput
}

func (IotHubDeviceUpdateInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*iotHubDeviceUpdateInstanceArgs)(nil)).Elem()
}

type IotHubDeviceUpdateInstanceInput interface {
	pulumi.Input

	ToIotHubDeviceUpdateInstanceOutput() IotHubDeviceUpdateInstanceOutput
	ToIotHubDeviceUpdateInstanceOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceOutput
}

func (*IotHubDeviceUpdateInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (i *IotHubDeviceUpdateInstance) ToIotHubDeviceUpdateInstanceOutput() IotHubDeviceUpdateInstanceOutput {
	return i.ToIotHubDeviceUpdateInstanceOutputWithContext(context.Background())
}

func (i *IotHubDeviceUpdateInstance) ToIotHubDeviceUpdateInstanceOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IotHubDeviceUpdateInstanceOutput)
}

// IotHubDeviceUpdateInstanceArrayInput is an input type that accepts IotHubDeviceUpdateInstanceArray and IotHubDeviceUpdateInstanceArrayOutput values.
// You can construct a concrete instance of `IotHubDeviceUpdateInstanceArrayInput` via:
//
//	IotHubDeviceUpdateInstanceArray{ IotHubDeviceUpdateInstanceArgs{...} }
type IotHubDeviceUpdateInstanceArrayInput interface {
	pulumi.Input

	ToIotHubDeviceUpdateInstanceArrayOutput() IotHubDeviceUpdateInstanceArrayOutput
	ToIotHubDeviceUpdateInstanceArrayOutputWithContext(context.Context) IotHubDeviceUpdateInstanceArrayOutput
}

type IotHubDeviceUpdateInstanceArray []IotHubDeviceUpdateInstanceInput

func (IotHubDeviceUpdateInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (i IotHubDeviceUpdateInstanceArray) ToIotHubDeviceUpdateInstanceArrayOutput() IotHubDeviceUpdateInstanceArrayOutput {
	return i.ToIotHubDeviceUpdateInstanceArrayOutputWithContext(context.Background())
}

func (i IotHubDeviceUpdateInstanceArray) ToIotHubDeviceUpdateInstanceArrayOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IotHubDeviceUpdateInstanceArrayOutput)
}

// IotHubDeviceUpdateInstanceMapInput is an input type that accepts IotHubDeviceUpdateInstanceMap and IotHubDeviceUpdateInstanceMapOutput values.
// You can construct a concrete instance of `IotHubDeviceUpdateInstanceMapInput` via:
//
//	IotHubDeviceUpdateInstanceMap{ "key": IotHubDeviceUpdateInstanceArgs{...} }
type IotHubDeviceUpdateInstanceMapInput interface {
	pulumi.Input

	ToIotHubDeviceUpdateInstanceMapOutput() IotHubDeviceUpdateInstanceMapOutput
	ToIotHubDeviceUpdateInstanceMapOutputWithContext(context.Context) IotHubDeviceUpdateInstanceMapOutput
}

type IotHubDeviceUpdateInstanceMap map[string]IotHubDeviceUpdateInstanceInput

func (IotHubDeviceUpdateInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (i IotHubDeviceUpdateInstanceMap) ToIotHubDeviceUpdateInstanceMapOutput() IotHubDeviceUpdateInstanceMapOutput {
	return i.ToIotHubDeviceUpdateInstanceMapOutputWithContext(context.Background())
}

func (i IotHubDeviceUpdateInstanceMap) ToIotHubDeviceUpdateInstanceMapOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IotHubDeviceUpdateInstanceMapOutput)
}

type IotHubDeviceUpdateInstanceOutput struct{ *pulumi.OutputState }

func (IotHubDeviceUpdateInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (o IotHubDeviceUpdateInstanceOutput) ToIotHubDeviceUpdateInstanceOutput() IotHubDeviceUpdateInstanceOutput {
	return o
}

func (o IotHubDeviceUpdateInstanceOutput) ToIotHubDeviceUpdateInstanceOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceOutput {
	return o
}

// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
func (o IotHubDeviceUpdateInstanceOutput) DeviceUpdateAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) pulumi.StringOutput { return v.DeviceUpdateAccountId }).(pulumi.StringOutput)
}

// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
func (o IotHubDeviceUpdateInstanceOutput) DiagnosticEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) pulumi.BoolPtrOutput { return v.DiagnosticEnabled }).(pulumi.BoolPtrOutput)
}

// A `diagnosticStorageAccount` block as defined below.
func (o IotHubDeviceUpdateInstanceOutput) DiagnosticStorageAccount() IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrOutput {
		return v.DiagnosticStorageAccount
	}).(IotHubDeviceUpdateInstanceDiagnosticStorageAccountPtrOutput)
}

// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
func (o IotHubDeviceUpdateInstanceOutput) IothubId() pulumi.StringOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) pulumi.StringOutput { return v.IothubId }).(pulumi.StringOutput)
}

// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
func (o IotHubDeviceUpdateInstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
func (o IotHubDeviceUpdateInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IotHubDeviceUpdateInstance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type IotHubDeviceUpdateInstanceArrayOutput struct{ *pulumi.OutputState }

func (IotHubDeviceUpdateInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (o IotHubDeviceUpdateInstanceArrayOutput) ToIotHubDeviceUpdateInstanceArrayOutput() IotHubDeviceUpdateInstanceArrayOutput {
	return o
}

func (o IotHubDeviceUpdateInstanceArrayOutput) ToIotHubDeviceUpdateInstanceArrayOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceArrayOutput {
	return o
}

func (o IotHubDeviceUpdateInstanceArrayOutput) Index(i pulumi.IntInput) IotHubDeviceUpdateInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IotHubDeviceUpdateInstance {
		return vs[0].([]*IotHubDeviceUpdateInstance)[vs[1].(int)]
	}).(IotHubDeviceUpdateInstanceOutput)
}

type IotHubDeviceUpdateInstanceMapOutput struct{ *pulumi.OutputState }

func (IotHubDeviceUpdateInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IotHubDeviceUpdateInstance)(nil)).Elem()
}

func (o IotHubDeviceUpdateInstanceMapOutput) ToIotHubDeviceUpdateInstanceMapOutput() IotHubDeviceUpdateInstanceMapOutput {
	return o
}

func (o IotHubDeviceUpdateInstanceMapOutput) ToIotHubDeviceUpdateInstanceMapOutputWithContext(ctx context.Context) IotHubDeviceUpdateInstanceMapOutput {
	return o
}

func (o IotHubDeviceUpdateInstanceMapOutput) MapIndex(k pulumi.StringInput) IotHubDeviceUpdateInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IotHubDeviceUpdateInstance {
		return vs[0].(map[string]*IotHubDeviceUpdateInstance)[vs[1].(string)]
	}).(IotHubDeviceUpdateInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IotHubDeviceUpdateInstanceInput)(nil)).Elem(), &IotHubDeviceUpdateInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*IotHubDeviceUpdateInstanceArrayInput)(nil)).Elem(), IotHubDeviceUpdateInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IotHubDeviceUpdateInstanceMapInput)(nil)).Elem(), IotHubDeviceUpdateInstanceMap{})
	pulumi.RegisterOutputType(IotHubDeviceUpdateInstanceOutput{})
	pulumi.RegisterOutputType(IotHubDeviceUpdateInstanceArrayOutput{})
	pulumi.RegisterOutputType(IotHubDeviceUpdateInstanceMapOutput{})
}
