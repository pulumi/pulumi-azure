// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arcmachine

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Hybrid Compute Machine.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/arcmachine"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
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
//			_, err = arcmachine.NewArcMachine(ctx, "example", &arcmachine.ArcMachineArgs{
//				Name:              pulumi.String("example-arcmachine"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Kind:              pulumi.String("SCVMM"),
//				Identity: &arcmachine.ArcMachineIdentityArgs{
//					Type: pulumi.String("SystemAssigned"),
//				},
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("example"),
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
// * `Microsoft.HybridCompute`: 2024-07-10
//
// ## Import
//
// Arc Machines can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:arcmachine/arcMachine:ArcMachine example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.HybridCompute/machines/machine1
// ```
type ArcMachine struct {
	pulumi.CustomResourceState

	// An `identity` block as defined below.
	Identity ArcMachineIdentityPtrOutput `pulumi:"identity"`
	// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Arc machine. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the Arc Machine.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewArcMachine registers a new resource with the given unique name, arguments, and options.
func NewArcMachine(ctx *pulumi.Context,
	name string, args *ArcMachineArgs, opts ...pulumi.ResourceOption) (*ArcMachine, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ArcMachine
	err := ctx.RegisterResource("azure:arcmachine/arcMachine:ArcMachine", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetArcMachine gets an existing ArcMachine resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetArcMachine(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ArcMachineState, opts ...pulumi.ResourceOption) (*ArcMachine, error) {
	var resource ArcMachine
	err := ctx.ReadResource("azure:arcmachine/arcMachine:ArcMachine", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ArcMachine resources.
type arcMachineState struct {
	// An `identity` block as defined below.
	Identity *ArcMachineIdentity `pulumi:"identity"`
	// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
	Kind *string `pulumi:"kind"`
	// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Arc machine. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the Arc Machine.
	Tags map[string]string `pulumi:"tags"`
}

type ArcMachineState struct {
	// An `identity` block as defined below.
	Identity ArcMachineIdentityPtrInput
	// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
	Kind pulumi.StringPtrInput
	// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Arc machine. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags to assign to the Arc Machine.
	Tags pulumi.StringMapInput
}

func (ArcMachineState) ElementType() reflect.Type {
	return reflect.TypeOf((*arcMachineState)(nil)).Elem()
}

type arcMachineArgs struct {
	// An `identity` block as defined below.
	Identity *ArcMachineIdentity `pulumi:"identity"`
	// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
	Kind string `pulumi:"kind"`
	// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the Arc machine. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags to assign to the Arc Machine.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ArcMachine resource.
type ArcMachineArgs struct {
	// An `identity` block as defined below.
	Identity ArcMachineIdentityPtrInput
	// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
	Kind pulumi.StringInput
	// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the Arc machine. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags to assign to the Arc Machine.
	Tags pulumi.StringMapInput
}

func (ArcMachineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*arcMachineArgs)(nil)).Elem()
}

type ArcMachineInput interface {
	pulumi.Input

	ToArcMachineOutput() ArcMachineOutput
	ToArcMachineOutputWithContext(ctx context.Context) ArcMachineOutput
}

func (*ArcMachine) ElementType() reflect.Type {
	return reflect.TypeOf((**ArcMachine)(nil)).Elem()
}

func (i *ArcMachine) ToArcMachineOutput() ArcMachineOutput {
	return i.ToArcMachineOutputWithContext(context.Background())
}

func (i *ArcMachine) ToArcMachineOutputWithContext(ctx context.Context) ArcMachineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArcMachineOutput)
}

// ArcMachineArrayInput is an input type that accepts ArcMachineArray and ArcMachineArrayOutput values.
// You can construct a concrete instance of `ArcMachineArrayInput` via:
//
//	ArcMachineArray{ ArcMachineArgs{...} }
type ArcMachineArrayInput interface {
	pulumi.Input

	ToArcMachineArrayOutput() ArcMachineArrayOutput
	ToArcMachineArrayOutputWithContext(context.Context) ArcMachineArrayOutput
}

type ArcMachineArray []ArcMachineInput

func (ArcMachineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArcMachine)(nil)).Elem()
}

func (i ArcMachineArray) ToArcMachineArrayOutput() ArcMachineArrayOutput {
	return i.ToArcMachineArrayOutputWithContext(context.Background())
}

func (i ArcMachineArray) ToArcMachineArrayOutputWithContext(ctx context.Context) ArcMachineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArcMachineArrayOutput)
}

// ArcMachineMapInput is an input type that accepts ArcMachineMap and ArcMachineMapOutput values.
// You can construct a concrete instance of `ArcMachineMapInput` via:
//
//	ArcMachineMap{ "key": ArcMachineArgs{...} }
type ArcMachineMapInput interface {
	pulumi.Input

	ToArcMachineMapOutput() ArcMachineMapOutput
	ToArcMachineMapOutputWithContext(context.Context) ArcMachineMapOutput
}

type ArcMachineMap map[string]ArcMachineInput

func (ArcMachineMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArcMachine)(nil)).Elem()
}

func (i ArcMachineMap) ToArcMachineMapOutput() ArcMachineMapOutput {
	return i.ToArcMachineMapOutputWithContext(context.Background())
}

func (i ArcMachineMap) ToArcMachineMapOutputWithContext(ctx context.Context) ArcMachineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArcMachineMapOutput)
}

type ArcMachineOutput struct{ *pulumi.OutputState }

func (ArcMachineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ArcMachine)(nil)).Elem()
}

func (o ArcMachineOutput) ToArcMachineOutput() ArcMachineOutput {
	return o
}

func (o ArcMachineOutput) ToArcMachineOutputWithContext(ctx context.Context) ArcMachineOutput {
	return o
}

// An `identity` block as defined below.
func (o ArcMachineOutput) Identity() ArcMachineIdentityPtrOutput {
	return o.ApplyT(func(v *ArcMachine) ArcMachineIdentityPtrOutput { return v.Identity }).(ArcMachineIdentityPtrOutput)
}

// The kind of the Arc Machine. Possible values are `AVS`, `AWS`, `EPS`, `GCP`, `HCI`, `SCVMM` and `VMware`. Changing this forces a new resource to be created.
func (o ArcMachineOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *ArcMachine) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// The Azure Region where the Arc Machine should exist. Changing this forces a new resource to be created.
func (o ArcMachineOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ArcMachine) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the Arc machine. Changing this forces a new resource to be created.
func (o ArcMachineOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ArcMachine) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Arc Machine should exist. Changing this forces a new resource to be created.
func (o ArcMachineOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ArcMachine) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the Arc Machine.
func (o ArcMachineOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ArcMachine) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ArcMachineArrayOutput struct{ *pulumi.OutputState }

func (ArcMachineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArcMachine)(nil)).Elem()
}

func (o ArcMachineArrayOutput) ToArcMachineArrayOutput() ArcMachineArrayOutput {
	return o
}

func (o ArcMachineArrayOutput) ToArcMachineArrayOutputWithContext(ctx context.Context) ArcMachineArrayOutput {
	return o
}

func (o ArcMachineArrayOutput) Index(i pulumi.IntInput) ArcMachineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ArcMachine {
		return vs[0].([]*ArcMachine)[vs[1].(int)]
	}).(ArcMachineOutput)
}

type ArcMachineMapOutput struct{ *pulumi.OutputState }

func (ArcMachineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArcMachine)(nil)).Elem()
}

func (o ArcMachineMapOutput) ToArcMachineMapOutput() ArcMachineMapOutput {
	return o
}

func (o ArcMachineMapOutput) ToArcMachineMapOutputWithContext(ctx context.Context) ArcMachineMapOutput {
	return o
}

func (o ArcMachineMapOutput) MapIndex(k pulumi.StringInput) ArcMachineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ArcMachine {
		return vs[0].(map[string]*ArcMachine)[vs[1].(string)]
	}).(ArcMachineOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ArcMachineInput)(nil)).Elem(), &ArcMachine{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArcMachineArrayInput)(nil)).Elem(), ArcMachineArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArcMachineMapInput)(nil)).Elem(), ArcMachineMap{})
	pulumi.RegisterOutputType(ArcMachineOutput{})
	pulumi.RegisterOutputType(ArcMachineArrayOutput{})
	pulumi.RegisterOutputType(ArcMachineMapOutput{})
}
