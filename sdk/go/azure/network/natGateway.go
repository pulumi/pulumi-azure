// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure NAT Gateway.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("nat-gateway-example-rg"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewNatGateway(ctx, "example", &network.NatGatewayArgs{
//				Name:                 pulumi.String("nat-gateway"),
//				Location:             example.Location,
//				ResourceGroupName:    example.Name,
//				SkuName:              pulumi.String("Standard"),
//				IdleTimeoutInMinutes: pulumi.Int(10),
//				Zones: pulumi.StringArray{
//					pulumi.String("1"),
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
// For more complete examples, please see the network.NatGatewayPublicIpAssociation and network.NatGatewayPublicIpPrefixAssociation resources.
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Network`: 2024-05-01
//
// ## Import
//
// NAT Gateway can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:network/natGateway:NatGateway test /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/natGateways/gateway1
// ```
type NatGateway struct {
	pulumi.CustomResourceState

	// The idle timeout which should be used in minutes. Defaults to `4`.
	IdleTimeoutInMinutes pulumi.IntPtrOutput `pulumi:"idleTimeoutInMinutes"`
	// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The resource GUID property of the NAT Gateway.
	ResourceGuid pulumi.StringOutput `pulumi:"resourceGuid"`
	// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
	SkuName pulumi.StringPtrOutput `pulumi:"skuName"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
	//
	// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewNatGateway registers a new resource with the given unique name, arguments, and options.
func NewNatGateway(ctx *pulumi.Context,
	name string, args *NatGatewayArgs, opts ...pulumi.ResourceOption) (*NatGateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NatGateway
	err := ctx.RegisterResource("azure:network/natGateway:NatGateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNatGateway gets an existing NatGateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNatGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NatGatewayState, opts ...pulumi.ResourceOption) (*NatGateway, error) {
	var resource NatGateway
	err := ctx.ReadResource("azure:network/natGateway:NatGateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NatGateway resources.
type natGatewayState struct {
	// The idle timeout which should be used in minutes. Defaults to `4`.
	IdleTimeoutInMinutes *int `pulumi:"idleTimeoutInMinutes"`
	// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The resource GUID property of the NAT Gateway.
	ResourceGuid *string `pulumi:"resourceGuid"`
	// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
	SkuName *string `pulumi:"skuName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
	//
	// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
	Zones []string `pulumi:"zones"`
}

type NatGatewayState struct {
	// The idle timeout which should be used in minutes. Defaults to `4`.
	IdleTimeoutInMinutes pulumi.IntPtrInput
	// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The resource GUID property of the NAT Gateway.
	ResourceGuid pulumi.StringPtrInput
	// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
	SkuName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
	//
	// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
	Zones pulumi.StringArrayInput
}

func (NatGatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*natGatewayState)(nil)).Elem()
}

type natGatewayArgs struct {
	// The idle timeout which should be used in minutes. Defaults to `4`.
	IdleTimeoutInMinutes *int `pulumi:"idleTimeoutInMinutes"`
	// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
	SkuName *string `pulumi:"skuName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
	// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
	//
	// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a NatGateway resource.
type NatGatewayArgs struct {
	// The idle timeout which should be used in minutes. Defaults to `4`.
	IdleTimeoutInMinutes pulumi.IntPtrInput
	// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
	SkuName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
	// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
	//
	// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
	Zones pulumi.StringArrayInput
}

func (NatGatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*natGatewayArgs)(nil)).Elem()
}

type NatGatewayInput interface {
	pulumi.Input

	ToNatGatewayOutput() NatGatewayOutput
	ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput
}

func (*NatGateway) ElementType() reflect.Type {
	return reflect.TypeOf((**NatGateway)(nil)).Elem()
}

func (i *NatGateway) ToNatGatewayOutput() NatGatewayOutput {
	return i.ToNatGatewayOutputWithContext(context.Background())
}

func (i *NatGateway) ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayOutput)
}

// NatGatewayArrayInput is an input type that accepts NatGatewayArray and NatGatewayArrayOutput values.
// You can construct a concrete instance of `NatGatewayArrayInput` via:
//
//	NatGatewayArray{ NatGatewayArgs{...} }
type NatGatewayArrayInput interface {
	pulumi.Input

	ToNatGatewayArrayOutput() NatGatewayArrayOutput
	ToNatGatewayArrayOutputWithContext(context.Context) NatGatewayArrayOutput
}

type NatGatewayArray []NatGatewayInput

func (NatGatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatGateway)(nil)).Elem()
}

func (i NatGatewayArray) ToNatGatewayArrayOutput() NatGatewayArrayOutput {
	return i.ToNatGatewayArrayOutputWithContext(context.Background())
}

func (i NatGatewayArray) ToNatGatewayArrayOutputWithContext(ctx context.Context) NatGatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayArrayOutput)
}

// NatGatewayMapInput is an input type that accepts NatGatewayMap and NatGatewayMapOutput values.
// You can construct a concrete instance of `NatGatewayMapInput` via:
//
//	NatGatewayMap{ "key": NatGatewayArgs{...} }
type NatGatewayMapInput interface {
	pulumi.Input

	ToNatGatewayMapOutput() NatGatewayMapOutput
	ToNatGatewayMapOutputWithContext(context.Context) NatGatewayMapOutput
}

type NatGatewayMap map[string]NatGatewayInput

func (NatGatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatGateway)(nil)).Elem()
}

func (i NatGatewayMap) ToNatGatewayMapOutput() NatGatewayMapOutput {
	return i.ToNatGatewayMapOutputWithContext(context.Background())
}

func (i NatGatewayMap) ToNatGatewayMapOutputWithContext(ctx context.Context) NatGatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatGatewayMapOutput)
}

type NatGatewayOutput struct{ *pulumi.OutputState }

func (NatGatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NatGateway)(nil)).Elem()
}

func (o NatGatewayOutput) ToNatGatewayOutput() NatGatewayOutput {
	return o
}

func (o NatGatewayOutput) ToNatGatewayOutputWithContext(ctx context.Context) NatGatewayOutput {
	return o
}

// The idle timeout which should be used in minutes. Defaults to `4`.
func (o NatGatewayOutput) IdleTimeoutInMinutes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.IntPtrOutput { return v.IdleTimeoutInMinutes }).(pulumi.IntPtrOutput)
}

// Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
func (o NatGatewayOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
func (o NatGatewayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
func (o NatGatewayOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The resource GUID property of the NAT Gateway.
func (o NatGatewayOutput) ResourceGuid() pulumi.StringOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringOutput { return v.ResourceGuid }).(pulumi.StringOutput)
}

// The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
func (o NatGatewayOutput) SkuName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringPtrOutput { return v.SkuName }).(pulumi.StringPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o NatGatewayOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
//
// > **Note:** Only one Availability Zone can be defined. For more information, please check out the [Azure documentation](https://learn.microsoft.com/en-us/azure/nat-gateway/nat-overview#availability-zones)
func (o NatGatewayOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NatGateway) pulumi.StringArrayOutput { return v.Zones }).(pulumi.StringArrayOutput)
}

type NatGatewayArrayOutput struct{ *pulumi.OutputState }

func (NatGatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatGateway)(nil)).Elem()
}

func (o NatGatewayArrayOutput) ToNatGatewayArrayOutput() NatGatewayArrayOutput {
	return o
}

func (o NatGatewayArrayOutput) ToNatGatewayArrayOutputWithContext(ctx context.Context) NatGatewayArrayOutput {
	return o
}

func (o NatGatewayArrayOutput) Index(i pulumi.IntInput) NatGatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NatGateway {
		return vs[0].([]*NatGateway)[vs[1].(int)]
	}).(NatGatewayOutput)
}

type NatGatewayMapOutput struct{ *pulumi.OutputState }

func (NatGatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatGateway)(nil)).Elem()
}

func (o NatGatewayMapOutput) ToNatGatewayMapOutput() NatGatewayMapOutput {
	return o
}

func (o NatGatewayMapOutput) ToNatGatewayMapOutputWithContext(ctx context.Context) NatGatewayMapOutput {
	return o
}

func (o NatGatewayMapOutput) MapIndex(k pulumi.StringInput) NatGatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NatGateway {
		return vs[0].(map[string]*NatGateway)[vs[1].(string)]
	}).(NatGatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayInput)(nil)).Elem(), &NatGateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayArrayInput)(nil)).Elem(), NatGatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatGatewayMapInput)(nil)).Elem(), NatGatewayMap{})
	pulumi.RegisterOutputType(NatGatewayOutput{})
	pulumi.RegisterOutputType(NatGatewayArrayOutput{})
	pulumi.RegisterOutputType(NatGatewayMapOutput{})
}
