// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appservice

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Function App Active Slot.
//
// ## Example Usage
//
// ### Windows Function App
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appservice"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("windowsfunctionappsa"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleServicePlan, err := appservice.NewServicePlan(ctx, "example", &appservice.ServicePlanArgs{
//				Name:              pulumi.String("example-app-service-plan"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				OsType:            pulumi.String("Windows"),
//				SkuName:           pulumi.String("Y1"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleWindowsFunctionApp, err := appservice.NewWindowsFunctionApp(ctx, "example", &appservice.WindowsFunctionAppArgs{
//				Name:               pulumi.String("example-windows-function-app"),
//				ResourceGroupName:  example.Name,
//				Location:           example.Location,
//				StorageAccountName: exampleAccount.Name,
//				ServicePlanId:      exampleServicePlan.ID(),
//				SiteConfig:         &appservice.WindowsFunctionAppSiteConfigArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			exampleWindowsFunctionAppSlot, err := appservice.NewWindowsFunctionAppSlot(ctx, "example", &appservice.WindowsFunctionAppSlotArgs{
//				Name:               pulumi.String("example-windows-function-app-slot"),
//				FunctionAppId:      exampleWindowsFunctionApp.ID(),
//				StorageAccountName: exampleAccount.Name,
//				SiteConfig:         &appservice.WindowsFunctionAppSlotSiteConfigArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appservice.NewFunctionAppActiveSlot(ctx, "example", &appservice.FunctionAppActiveSlotArgs{
//				SlotId: exampleWindowsFunctionAppSlot.ID(),
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
// ### Linux Function App
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appservice"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := storage.NewAccount(ctx, "example", &storage.AccountArgs{
//				Name:                   pulumi.String("linuxfunctionappsa"),
//				ResourceGroupName:      example.Name,
//				Location:               example.Location,
//				AccountTier:            pulumi.String("Standard"),
//				AccountReplicationType: pulumi.String("LRS"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleServicePlan, err := appservice.NewServicePlan(ctx, "example", &appservice.ServicePlanArgs{
//				Name:              pulumi.String("example-app-service-plan"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				OsType:            pulumi.String("Linux"),
//				SkuName:           pulumi.String("Y1"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleLinuxFunctionApp, err := appservice.NewLinuxFunctionApp(ctx, "example", &appservice.LinuxFunctionAppArgs{
//				Name:               pulumi.String("example-linux-function-app"),
//				ResourceGroupName:  example.Name,
//				Location:           example.Location,
//				ServicePlanId:      exampleServicePlan.ID(),
//				StorageAccountName: exampleAccount.Name,
//				SiteConfig:         &appservice.LinuxFunctionAppSiteConfigArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			exampleLinuxFunctionAppSlot, err := appservice.NewLinuxFunctionAppSlot(ctx, "example", &appservice.LinuxFunctionAppSlotArgs{
//				Name:               pulumi.String("example-linux-function-app-slot"),
//				FunctionAppId:      exampleLinuxFunctionApp.Name,
//				StorageAccountName: exampleAccount.Name,
//				SiteConfig:         &appservice.LinuxFunctionAppSlotSiteConfigArgs{},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = appservice.NewFunctionAppActiveSlot(ctx, "example", &appservice.FunctionAppActiveSlotArgs{
//				SlotId: exampleLinuxFunctionAppSlot.ID(),
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
// * `Microsoft.Web`: 2023-12-01
//
// ## Import
//
// a Function App Active Slot can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot example "/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1"
// ```
type FunctionAppActiveSlot struct {
	pulumi.CustomResourceState

	// The timestamp of the last successful swap with `Production`
	LastSuccessfulSwap pulumi.StringOutput `pulumi:"lastSuccessfulSwap"`
	// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
	OverwriteNetworkConfig pulumi.BoolPtrOutput `pulumi:"overwriteNetworkConfig"`
	// The ID of the Slot to swap with `Production`.
	SlotId pulumi.StringOutput `pulumi:"slotId"`
}

// NewFunctionAppActiveSlot registers a new resource with the given unique name, arguments, and options.
func NewFunctionAppActiveSlot(ctx *pulumi.Context,
	name string, args *FunctionAppActiveSlotArgs, opts ...pulumi.ResourceOption) (*FunctionAppActiveSlot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SlotId == nil {
		return nil, errors.New("invalid value for required argument 'SlotId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FunctionAppActiveSlot
	err := ctx.RegisterResource("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionAppActiveSlot gets an existing FunctionAppActiveSlot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionAppActiveSlot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionAppActiveSlotState, opts ...pulumi.ResourceOption) (*FunctionAppActiveSlot, error) {
	var resource FunctionAppActiveSlot
	err := ctx.ReadResource("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionAppActiveSlot resources.
type functionAppActiveSlotState struct {
	// The timestamp of the last successful swap with `Production`
	LastSuccessfulSwap *string `pulumi:"lastSuccessfulSwap"`
	// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
	OverwriteNetworkConfig *bool `pulumi:"overwriteNetworkConfig"`
	// The ID of the Slot to swap with `Production`.
	SlotId *string `pulumi:"slotId"`
}

type FunctionAppActiveSlotState struct {
	// The timestamp of the last successful swap with `Production`
	LastSuccessfulSwap pulumi.StringPtrInput
	// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
	OverwriteNetworkConfig pulumi.BoolPtrInput
	// The ID of the Slot to swap with `Production`.
	SlotId pulumi.StringPtrInput
}

func (FunctionAppActiveSlotState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAppActiveSlotState)(nil)).Elem()
}

type functionAppActiveSlotArgs struct {
	// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
	OverwriteNetworkConfig *bool `pulumi:"overwriteNetworkConfig"`
	// The ID of the Slot to swap with `Production`.
	SlotId string `pulumi:"slotId"`
}

// The set of arguments for constructing a FunctionAppActiveSlot resource.
type FunctionAppActiveSlotArgs struct {
	// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
	OverwriteNetworkConfig pulumi.BoolPtrInput
	// The ID of the Slot to swap with `Production`.
	SlotId pulumi.StringInput
}

func (FunctionAppActiveSlotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionAppActiveSlotArgs)(nil)).Elem()
}

type FunctionAppActiveSlotInput interface {
	pulumi.Input

	ToFunctionAppActiveSlotOutput() FunctionAppActiveSlotOutput
	ToFunctionAppActiveSlotOutputWithContext(ctx context.Context) FunctionAppActiveSlotOutput
}

func (*FunctionAppActiveSlot) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionAppActiveSlot)(nil)).Elem()
}

func (i *FunctionAppActiveSlot) ToFunctionAppActiveSlotOutput() FunctionAppActiveSlotOutput {
	return i.ToFunctionAppActiveSlotOutputWithContext(context.Background())
}

func (i *FunctionAppActiveSlot) ToFunctionAppActiveSlotOutputWithContext(ctx context.Context) FunctionAppActiveSlotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAppActiveSlotOutput)
}

// FunctionAppActiveSlotArrayInput is an input type that accepts FunctionAppActiveSlotArray and FunctionAppActiveSlotArrayOutput values.
// You can construct a concrete instance of `FunctionAppActiveSlotArrayInput` via:
//
//	FunctionAppActiveSlotArray{ FunctionAppActiveSlotArgs{...} }
type FunctionAppActiveSlotArrayInput interface {
	pulumi.Input

	ToFunctionAppActiveSlotArrayOutput() FunctionAppActiveSlotArrayOutput
	ToFunctionAppActiveSlotArrayOutputWithContext(context.Context) FunctionAppActiveSlotArrayOutput
}

type FunctionAppActiveSlotArray []FunctionAppActiveSlotInput

func (FunctionAppActiveSlotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionAppActiveSlot)(nil)).Elem()
}

func (i FunctionAppActiveSlotArray) ToFunctionAppActiveSlotArrayOutput() FunctionAppActiveSlotArrayOutput {
	return i.ToFunctionAppActiveSlotArrayOutputWithContext(context.Background())
}

func (i FunctionAppActiveSlotArray) ToFunctionAppActiveSlotArrayOutputWithContext(ctx context.Context) FunctionAppActiveSlotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAppActiveSlotArrayOutput)
}

// FunctionAppActiveSlotMapInput is an input type that accepts FunctionAppActiveSlotMap and FunctionAppActiveSlotMapOutput values.
// You can construct a concrete instance of `FunctionAppActiveSlotMapInput` via:
//
//	FunctionAppActiveSlotMap{ "key": FunctionAppActiveSlotArgs{...} }
type FunctionAppActiveSlotMapInput interface {
	pulumi.Input

	ToFunctionAppActiveSlotMapOutput() FunctionAppActiveSlotMapOutput
	ToFunctionAppActiveSlotMapOutputWithContext(context.Context) FunctionAppActiveSlotMapOutput
}

type FunctionAppActiveSlotMap map[string]FunctionAppActiveSlotInput

func (FunctionAppActiveSlotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionAppActiveSlot)(nil)).Elem()
}

func (i FunctionAppActiveSlotMap) ToFunctionAppActiveSlotMapOutput() FunctionAppActiveSlotMapOutput {
	return i.ToFunctionAppActiveSlotMapOutputWithContext(context.Background())
}

func (i FunctionAppActiveSlotMap) ToFunctionAppActiveSlotMapOutputWithContext(ctx context.Context) FunctionAppActiveSlotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionAppActiveSlotMapOutput)
}

type FunctionAppActiveSlotOutput struct{ *pulumi.OutputState }

func (FunctionAppActiveSlotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionAppActiveSlot)(nil)).Elem()
}

func (o FunctionAppActiveSlotOutput) ToFunctionAppActiveSlotOutput() FunctionAppActiveSlotOutput {
	return o
}

func (o FunctionAppActiveSlotOutput) ToFunctionAppActiveSlotOutputWithContext(ctx context.Context) FunctionAppActiveSlotOutput {
	return o
}

// The timestamp of the last successful swap with `Production`
func (o FunctionAppActiveSlotOutput) LastSuccessfulSwap() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAppActiveSlot) pulumi.StringOutput { return v.LastSuccessfulSwap }).(pulumi.StringOutput)
}

// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
func (o FunctionAppActiveSlotOutput) OverwriteNetworkConfig() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionAppActiveSlot) pulumi.BoolPtrOutput { return v.OverwriteNetworkConfig }).(pulumi.BoolPtrOutput)
}

// The ID of the Slot to swap with `Production`.
func (o FunctionAppActiveSlotOutput) SlotId() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionAppActiveSlot) pulumi.StringOutput { return v.SlotId }).(pulumi.StringOutput)
}

type FunctionAppActiveSlotArrayOutput struct{ *pulumi.OutputState }

func (FunctionAppActiveSlotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionAppActiveSlot)(nil)).Elem()
}

func (o FunctionAppActiveSlotArrayOutput) ToFunctionAppActiveSlotArrayOutput() FunctionAppActiveSlotArrayOutput {
	return o
}

func (o FunctionAppActiveSlotArrayOutput) ToFunctionAppActiveSlotArrayOutputWithContext(ctx context.Context) FunctionAppActiveSlotArrayOutput {
	return o
}

func (o FunctionAppActiveSlotArrayOutput) Index(i pulumi.IntInput) FunctionAppActiveSlotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FunctionAppActiveSlot {
		return vs[0].([]*FunctionAppActiveSlot)[vs[1].(int)]
	}).(FunctionAppActiveSlotOutput)
}

type FunctionAppActiveSlotMapOutput struct{ *pulumi.OutputState }

func (FunctionAppActiveSlotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionAppActiveSlot)(nil)).Elem()
}

func (o FunctionAppActiveSlotMapOutput) ToFunctionAppActiveSlotMapOutput() FunctionAppActiveSlotMapOutput {
	return o
}

func (o FunctionAppActiveSlotMapOutput) ToFunctionAppActiveSlotMapOutputWithContext(ctx context.Context) FunctionAppActiveSlotMapOutput {
	return o
}

func (o FunctionAppActiveSlotMapOutput) MapIndex(k pulumi.StringInput) FunctionAppActiveSlotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FunctionAppActiveSlot {
		return vs[0].(map[string]*FunctionAppActiveSlot)[vs[1].(string)]
	}).(FunctionAppActiveSlotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAppActiveSlotInput)(nil)).Elem(), &FunctionAppActiveSlot{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAppActiveSlotArrayInput)(nil)).Elem(), FunctionAppActiveSlotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionAppActiveSlotMapInput)(nil)).Elem(), FunctionAppActiveSlotMap{})
	pulumi.RegisterOutputType(FunctionAppActiveSlotOutput{})
	pulumi.RegisterOutputType(FunctionAppActiveSlotArrayOutput{})
	pulumi.RegisterOutputType(FunctionAppActiveSlotMapOutput{})
}
