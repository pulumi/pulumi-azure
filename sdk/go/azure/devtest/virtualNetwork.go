// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devtest

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Virtual Network within a DevTest Lab.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/devtest"
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
//			exampleLab, err := devtest.NewLab(ctx, "example", &devtest.LabArgs{
//				Name:              pulumi.String("example-devtestlab"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Tags: pulumi.StringMap{
//					"Sydney": pulumi.String("Australia"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = devtest.NewVirtualNetwork(ctx, "example", &devtest.VirtualNetworkArgs{
//				Name:              pulumi.String("example-network"),
//				LabName:           exampleLab.Name,
//				ResourceGroupName: example.Name,
//				Subnet: &devtest.VirtualNetworkSubnetArgs{
//					UsePublicIpAddress:          pulumi.String("Allow"),
//					UseInVirtualMachineCreation: pulumi.String("Allow"),
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
// * `Microsoft.DevTestLab`: 2018-09-15
//
// ## Import
//
// DevTest Virtual Networks can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:devtest/virtualNetwork:VirtualNetwork network1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/virtualNetworks/network1
// ```
type VirtualNetwork struct {
	pulumi.CustomResourceState

	// A description for the Virtual Network.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
	LabName pulumi.StringOutput `pulumi:"labName"`
	// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `subnet` block as defined below.
	Subnet VirtualNetworkSubnetOutput `pulumi:"subnet"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// The unique immutable identifier of the Dev Test Virtual Network.
	UniqueIdentifier pulumi.StringOutput `pulumi:"uniqueIdentifier"`
}

// NewVirtualNetwork registers a new resource with the given unique name, arguments, and options.
func NewVirtualNetwork(ctx *pulumi.Context,
	name string, args *VirtualNetworkArgs, opts ...pulumi.ResourceOption) (*VirtualNetwork, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LabName == nil {
		return nil, errors.New("invalid value for required argument 'LabName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualNetwork
	err := ctx.RegisterResource("azure:devtest/virtualNetwork:VirtualNetwork", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualNetwork gets an existing VirtualNetwork resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualNetworkState, opts ...pulumi.ResourceOption) (*VirtualNetwork, error) {
	var resource VirtualNetwork
	err := ctx.ReadResource("azure:devtest/virtualNetwork:VirtualNetwork", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualNetwork resources.
type virtualNetworkState struct {
	// A description for the Virtual Network.
	Description *string `pulumi:"description"`
	// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
	LabName *string `pulumi:"labName"`
	// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `subnet` block as defined below.
	Subnet *VirtualNetworkSubnet `pulumi:"subnet"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The unique immutable identifier of the Dev Test Virtual Network.
	UniqueIdentifier *string `pulumi:"uniqueIdentifier"`
}

type VirtualNetworkState struct {
	// A description for the Virtual Network.
	Description pulumi.StringPtrInput
	// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
	LabName pulumi.StringPtrInput
	// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `subnet` block as defined below.
	Subnet VirtualNetworkSubnetPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// The unique immutable identifier of the Dev Test Virtual Network.
	UniqueIdentifier pulumi.StringPtrInput
}

func (VirtualNetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkState)(nil)).Elem()
}

type virtualNetworkArgs struct {
	// A description for the Virtual Network.
	Description *string `pulumi:"description"`
	// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
	LabName string `pulumi:"labName"`
	// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `subnet` block as defined below.
	Subnet *VirtualNetworkSubnet `pulumi:"subnet"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a VirtualNetwork resource.
type VirtualNetworkArgs struct {
	// A description for the Virtual Network.
	Description pulumi.StringPtrInput
	// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
	LabName pulumi.StringInput
	// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A `subnet` block as defined below.
	Subnet VirtualNetworkSubnetPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (VirtualNetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkArgs)(nil)).Elem()
}

type VirtualNetworkInput interface {
	pulumi.Input

	ToVirtualNetworkOutput() VirtualNetworkOutput
	ToVirtualNetworkOutputWithContext(ctx context.Context) VirtualNetworkOutput
}

func (*VirtualNetwork) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetwork)(nil)).Elem()
}

func (i *VirtualNetwork) ToVirtualNetworkOutput() VirtualNetworkOutput {
	return i.ToVirtualNetworkOutputWithContext(context.Background())
}

func (i *VirtualNetwork) ToVirtualNetworkOutputWithContext(ctx context.Context) VirtualNetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkOutput)
}

// VirtualNetworkArrayInput is an input type that accepts VirtualNetworkArray and VirtualNetworkArrayOutput values.
// You can construct a concrete instance of `VirtualNetworkArrayInput` via:
//
//	VirtualNetworkArray{ VirtualNetworkArgs{...} }
type VirtualNetworkArrayInput interface {
	pulumi.Input

	ToVirtualNetworkArrayOutput() VirtualNetworkArrayOutput
	ToVirtualNetworkArrayOutputWithContext(context.Context) VirtualNetworkArrayOutput
}

type VirtualNetworkArray []VirtualNetworkInput

func (VirtualNetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetwork)(nil)).Elem()
}

func (i VirtualNetworkArray) ToVirtualNetworkArrayOutput() VirtualNetworkArrayOutput {
	return i.ToVirtualNetworkArrayOutputWithContext(context.Background())
}

func (i VirtualNetworkArray) ToVirtualNetworkArrayOutputWithContext(ctx context.Context) VirtualNetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkArrayOutput)
}

// VirtualNetworkMapInput is an input type that accepts VirtualNetworkMap and VirtualNetworkMapOutput values.
// You can construct a concrete instance of `VirtualNetworkMapInput` via:
//
//	VirtualNetworkMap{ "key": VirtualNetworkArgs{...} }
type VirtualNetworkMapInput interface {
	pulumi.Input

	ToVirtualNetworkMapOutput() VirtualNetworkMapOutput
	ToVirtualNetworkMapOutputWithContext(context.Context) VirtualNetworkMapOutput
}

type VirtualNetworkMap map[string]VirtualNetworkInput

func (VirtualNetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetwork)(nil)).Elem()
}

func (i VirtualNetworkMap) ToVirtualNetworkMapOutput() VirtualNetworkMapOutput {
	return i.ToVirtualNetworkMapOutputWithContext(context.Background())
}

func (i VirtualNetworkMap) ToVirtualNetworkMapOutputWithContext(ctx context.Context) VirtualNetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkMapOutput)
}

type VirtualNetworkOutput struct{ *pulumi.OutputState }

func (VirtualNetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetwork)(nil)).Elem()
}

func (o VirtualNetworkOutput) ToVirtualNetworkOutput() VirtualNetworkOutput {
	return o
}

func (o VirtualNetworkOutput) ToVirtualNetworkOutputWithContext(ctx context.Context) VirtualNetworkOutput {
	return o
}

// A description for the Virtual Network.
func (o VirtualNetworkOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
func (o VirtualNetworkOutput) LabName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringOutput { return v.LabName }).(pulumi.StringOutput)
}

// Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
func (o VirtualNetworkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
func (o VirtualNetworkOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `subnet` block as defined below.
func (o VirtualNetworkOutput) Subnet() VirtualNetworkSubnetOutput {
	return o.ApplyT(func(v *VirtualNetwork) VirtualNetworkSubnetOutput { return v.Subnet }).(VirtualNetworkSubnetOutput)
}

// A mapping of tags to assign to the resource.
func (o VirtualNetworkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// The unique immutable identifier of the Dev Test Virtual Network.
func (o VirtualNetworkOutput) UniqueIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetwork) pulumi.StringOutput { return v.UniqueIdentifier }).(pulumi.StringOutput)
}

type VirtualNetworkArrayOutput struct{ *pulumi.OutputState }

func (VirtualNetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetwork)(nil)).Elem()
}

func (o VirtualNetworkArrayOutput) ToVirtualNetworkArrayOutput() VirtualNetworkArrayOutput {
	return o
}

func (o VirtualNetworkArrayOutput) ToVirtualNetworkArrayOutputWithContext(ctx context.Context) VirtualNetworkArrayOutput {
	return o
}

func (o VirtualNetworkArrayOutput) Index(i pulumi.IntInput) VirtualNetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualNetwork {
		return vs[0].([]*VirtualNetwork)[vs[1].(int)]
	}).(VirtualNetworkOutput)
}

type VirtualNetworkMapOutput struct{ *pulumi.OutputState }

func (VirtualNetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetwork)(nil)).Elem()
}

func (o VirtualNetworkMapOutput) ToVirtualNetworkMapOutput() VirtualNetworkMapOutput {
	return o
}

func (o VirtualNetworkMapOutput) ToVirtualNetworkMapOutputWithContext(ctx context.Context) VirtualNetworkMapOutput {
	return o
}

func (o VirtualNetworkMapOutput) MapIndex(k pulumi.StringInput) VirtualNetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualNetwork {
		return vs[0].(map[string]*VirtualNetwork)[vs[1].(string)]
	}).(VirtualNetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkInput)(nil)).Elem(), &VirtualNetwork{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkArrayInput)(nil)).Elem(), VirtualNetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkMapInput)(nil)).Elem(), VirtualNetworkMap{})
	pulumi.RegisterOutputType(VirtualNetworkOutput{})
	pulumi.RegisterOutputType(VirtualNetworkArrayOutput{})
	pulumi.RegisterOutputType(VirtualNetworkMapOutput{})
}
