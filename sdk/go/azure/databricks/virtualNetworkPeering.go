// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Databricks Virtual Network Peering
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/databricks"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/network"
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
//			remote, err := network.NewVirtualNetwork(ctx, "remote", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("remote-vnet"),
//				ResourceGroupName: example.Name,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.1.0/24"),
//				},
//				Location: example.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleWorkspace, err := databricks.NewWorkspace(ctx, "example", &databricks.WorkspaceArgs{
//				Name:              pulumi.String("example-workspace"),
//				ResourceGroupName: example.Name,
//				Location:          example.Location,
//				Sku:               pulumi.String("standard"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetworkPeering, err := databricks.NewVirtualNetworkPeering(ctx, "example", &databricks.VirtualNetworkPeeringArgs{
//				Name:                       pulumi.String("databricks-vnet-peer"),
//				ResourceGroupName:          example.Name,
//				WorkspaceId:                exampleWorkspace.ID(),
//				RemoteAddressSpacePrefixes: remote.AddressSpaces,
//				RemoteVirtualNetworkId:     remote.ID(),
//				AllowVirtualNetworkAccess:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewVirtualNetworkPeering(ctx, "remote", &network.VirtualNetworkPeeringArgs{
//				Name:                      pulumi.String("peer-to-databricks"),
//				ResourceGroupName:         example.Name,
//				VirtualNetworkName:        remote.Name,
//				RemoteVirtualNetworkId:    exampleVirtualNetworkPeering.VirtualNetworkId,
//				AllowVirtualNetworkAccess: pulumi.Bool(true),
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
// * `Microsoft.Databricks`: 2024-05-01
//
// ## Import
//
// Databrick Virtual Network Peerings can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:databricks/virtualNetworkPeering:VirtualNetworkPeering example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Databricks/workspaces/workspace1/virtualNetworkPeerings/peering1
// ```
type VirtualNetworkPeering struct {
	pulumi.CustomResourceState

	// A list of address blocks reserved for this virtual network in CIDR notation.
	AddressSpacePrefixes pulumi.StringArrayOutput `pulumi:"addressSpacePrefixes"`
	// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
	AllowForwardedTraffic pulumi.BoolPtrOutput `pulumi:"allowForwardedTraffic"`
	// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
	AllowGatewayTransit pulumi.BoolPtrOutput `pulumi:"allowGatewayTransit"`
	// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
	AllowVirtualNetworkAccess pulumi.BoolPtrOutput `pulumi:"allowVirtualNetworkAccess"`
	// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
	RemoteAddressSpacePrefixes pulumi.StringArrayOutput `pulumi:"remoteAddressSpacePrefixes"`
	// The ID of the remote virtual network. Changing this forces a new resource to be created.
	//
	// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
	RemoteVirtualNetworkId pulumi.StringOutput `pulumi:"remoteVirtualNetworkId"`
	// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
	//
	// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
	UseRemoteGateways pulumi.BoolPtrOutput `pulumi:"useRemoteGateways"`
	// The ID of the internal Virtual Network used by the DataBricks Workspace.
	//
	// > **Note:** The `virtualNetworkId` field is the value you must supply to the `network.VirtualNetworkPeering` resources `remoteVirtualNetworkId` field to successfully peer the Databricks Virtual Network with the remote virtual network.
	VirtualNetworkId pulumi.StringOutput `pulumi:"virtualNetworkId"`
	// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewVirtualNetworkPeering registers a new resource with the given unique name, arguments, and options.
func NewVirtualNetworkPeering(ctx *pulumi.Context,
	name string, args *VirtualNetworkPeeringArgs, opts ...pulumi.ResourceOption) (*VirtualNetworkPeering, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RemoteAddressSpacePrefixes == nil {
		return nil, errors.New("invalid value for required argument 'RemoteAddressSpacePrefixes'")
	}
	if args.RemoteVirtualNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'RemoteVirtualNetworkId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualNetworkPeering
	err := ctx.RegisterResource("azure:databricks/virtualNetworkPeering:VirtualNetworkPeering", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualNetworkPeering gets an existing VirtualNetworkPeering resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualNetworkPeering(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualNetworkPeeringState, opts ...pulumi.ResourceOption) (*VirtualNetworkPeering, error) {
	var resource VirtualNetworkPeering
	err := ctx.ReadResource("azure:databricks/virtualNetworkPeering:VirtualNetworkPeering", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualNetworkPeering resources.
type virtualNetworkPeeringState struct {
	// A list of address blocks reserved for this virtual network in CIDR notation.
	AddressSpacePrefixes []string `pulumi:"addressSpacePrefixes"`
	// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
	AllowForwardedTraffic *bool `pulumi:"allowForwardedTraffic"`
	// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
	AllowGatewayTransit *bool `pulumi:"allowGatewayTransit"`
	// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
	AllowVirtualNetworkAccess *bool `pulumi:"allowVirtualNetworkAccess"`
	// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
	RemoteAddressSpacePrefixes []string `pulumi:"remoteAddressSpacePrefixes"`
	// The ID of the remote virtual network. Changing this forces a new resource to be created.
	//
	// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
	RemoteVirtualNetworkId *string `pulumi:"remoteVirtualNetworkId"`
	// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
	//
	// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
	UseRemoteGateways *bool `pulumi:"useRemoteGateways"`
	// The ID of the internal Virtual Network used by the DataBricks Workspace.
	//
	// > **Note:** The `virtualNetworkId` field is the value you must supply to the `network.VirtualNetworkPeering` resources `remoteVirtualNetworkId` field to successfully peer the Databricks Virtual Network with the remote virtual network.
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
	// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type VirtualNetworkPeeringState struct {
	// A list of address blocks reserved for this virtual network in CIDR notation.
	AddressSpacePrefixes pulumi.StringArrayInput
	// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
	AllowForwardedTraffic pulumi.BoolPtrInput
	// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
	AllowGatewayTransit pulumi.BoolPtrInput
	// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
	AllowVirtualNetworkAccess pulumi.BoolPtrInput
	// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
	RemoteAddressSpacePrefixes pulumi.StringArrayInput
	// The ID of the remote virtual network. Changing this forces a new resource to be created.
	//
	// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
	RemoteVirtualNetworkId pulumi.StringPtrInput
	// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
	//
	// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
	UseRemoteGateways pulumi.BoolPtrInput
	// The ID of the internal Virtual Network used by the DataBricks Workspace.
	//
	// > **Note:** The `virtualNetworkId` field is the value you must supply to the `network.VirtualNetworkPeering` resources `remoteVirtualNetworkId` field to successfully peer the Databricks Virtual Network with the remote virtual network.
	VirtualNetworkId pulumi.StringPtrInput
	// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
	WorkspaceId pulumi.StringPtrInput
}

func (VirtualNetworkPeeringState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkPeeringState)(nil)).Elem()
}

type virtualNetworkPeeringArgs struct {
	// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
	AllowForwardedTraffic *bool `pulumi:"allowForwardedTraffic"`
	// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
	AllowGatewayTransit *bool `pulumi:"allowGatewayTransit"`
	// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
	AllowVirtualNetworkAccess *bool `pulumi:"allowVirtualNetworkAccess"`
	// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
	RemoteAddressSpacePrefixes []string `pulumi:"remoteAddressSpacePrefixes"`
	// The ID of the remote virtual network. Changing this forces a new resource to be created.
	//
	// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
	RemoteVirtualNetworkId string `pulumi:"remoteVirtualNetworkId"`
	// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
	//
	// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
	UseRemoteGateways *bool `pulumi:"useRemoteGateways"`
	// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a VirtualNetworkPeering resource.
type VirtualNetworkPeeringArgs struct {
	// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
	AllowForwardedTraffic pulumi.BoolPtrInput
	// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
	AllowGatewayTransit pulumi.BoolPtrInput
	// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
	AllowVirtualNetworkAccess pulumi.BoolPtrInput
	// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
	RemoteAddressSpacePrefixes pulumi.StringArrayInput
	// The ID of the remote virtual network. Changing this forces a new resource to be created.
	//
	// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
	RemoteVirtualNetworkId pulumi.StringInput
	// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
	//
	// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
	UseRemoteGateways pulumi.BoolPtrInput
	// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
	WorkspaceId pulumi.StringInput
}

func (VirtualNetworkPeeringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkPeeringArgs)(nil)).Elem()
}

type VirtualNetworkPeeringInput interface {
	pulumi.Input

	ToVirtualNetworkPeeringOutput() VirtualNetworkPeeringOutput
	ToVirtualNetworkPeeringOutputWithContext(ctx context.Context) VirtualNetworkPeeringOutput
}

func (*VirtualNetworkPeering) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkPeering)(nil)).Elem()
}

func (i *VirtualNetworkPeering) ToVirtualNetworkPeeringOutput() VirtualNetworkPeeringOutput {
	return i.ToVirtualNetworkPeeringOutputWithContext(context.Background())
}

func (i *VirtualNetworkPeering) ToVirtualNetworkPeeringOutputWithContext(ctx context.Context) VirtualNetworkPeeringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkPeeringOutput)
}

// VirtualNetworkPeeringArrayInput is an input type that accepts VirtualNetworkPeeringArray and VirtualNetworkPeeringArrayOutput values.
// You can construct a concrete instance of `VirtualNetworkPeeringArrayInput` via:
//
//	VirtualNetworkPeeringArray{ VirtualNetworkPeeringArgs{...} }
type VirtualNetworkPeeringArrayInput interface {
	pulumi.Input

	ToVirtualNetworkPeeringArrayOutput() VirtualNetworkPeeringArrayOutput
	ToVirtualNetworkPeeringArrayOutputWithContext(context.Context) VirtualNetworkPeeringArrayOutput
}

type VirtualNetworkPeeringArray []VirtualNetworkPeeringInput

func (VirtualNetworkPeeringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkPeering)(nil)).Elem()
}

func (i VirtualNetworkPeeringArray) ToVirtualNetworkPeeringArrayOutput() VirtualNetworkPeeringArrayOutput {
	return i.ToVirtualNetworkPeeringArrayOutputWithContext(context.Background())
}

func (i VirtualNetworkPeeringArray) ToVirtualNetworkPeeringArrayOutputWithContext(ctx context.Context) VirtualNetworkPeeringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkPeeringArrayOutput)
}

// VirtualNetworkPeeringMapInput is an input type that accepts VirtualNetworkPeeringMap and VirtualNetworkPeeringMapOutput values.
// You can construct a concrete instance of `VirtualNetworkPeeringMapInput` via:
//
//	VirtualNetworkPeeringMap{ "key": VirtualNetworkPeeringArgs{...} }
type VirtualNetworkPeeringMapInput interface {
	pulumi.Input

	ToVirtualNetworkPeeringMapOutput() VirtualNetworkPeeringMapOutput
	ToVirtualNetworkPeeringMapOutputWithContext(context.Context) VirtualNetworkPeeringMapOutput
}

type VirtualNetworkPeeringMap map[string]VirtualNetworkPeeringInput

func (VirtualNetworkPeeringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkPeering)(nil)).Elem()
}

func (i VirtualNetworkPeeringMap) ToVirtualNetworkPeeringMapOutput() VirtualNetworkPeeringMapOutput {
	return i.ToVirtualNetworkPeeringMapOutputWithContext(context.Background())
}

func (i VirtualNetworkPeeringMap) ToVirtualNetworkPeeringMapOutputWithContext(ctx context.Context) VirtualNetworkPeeringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkPeeringMapOutput)
}

type VirtualNetworkPeeringOutput struct{ *pulumi.OutputState }

func (VirtualNetworkPeeringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkPeering)(nil)).Elem()
}

func (o VirtualNetworkPeeringOutput) ToVirtualNetworkPeeringOutput() VirtualNetworkPeeringOutput {
	return o
}

func (o VirtualNetworkPeeringOutput) ToVirtualNetworkPeeringOutputWithContext(ctx context.Context) VirtualNetworkPeeringOutput {
	return o
}

// A list of address blocks reserved for this virtual network in CIDR notation.
func (o VirtualNetworkPeeringOutput) AddressSpacePrefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringArrayOutput { return v.AddressSpacePrefixes }).(pulumi.StringArrayOutput)
}

// Can the forwarded traffic from the VMs in the local virtual network be forwarded to the remote virtual network? Defaults to `false`.
func (o VirtualNetworkPeeringOutput) AllowForwardedTraffic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.BoolPtrOutput { return v.AllowForwardedTraffic }).(pulumi.BoolPtrOutput)
}

// Can the gateway links be used in the remote virtual network to link to the Databricks virtual network? Defaults to `false`.
func (o VirtualNetworkPeeringOutput) AllowGatewayTransit() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.BoolPtrOutput { return v.AllowGatewayTransit }).(pulumi.BoolPtrOutput)
}

// Can the VMs in the local virtual network space access the VMs in the remote virtual network space? Defaults to `true`.
func (o VirtualNetworkPeeringOutput) AllowVirtualNetworkAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.BoolPtrOutput { return v.AllowVirtualNetworkAccess }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the Databricks Virtual Network Peering resource. Changing this forces a new resource to be created.
func (o VirtualNetworkPeeringOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of address blocks reserved for the remote virtual network in CIDR notation. Changing this forces a new resource to be created.
func (o VirtualNetworkPeeringOutput) RemoteAddressSpacePrefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringArrayOutput { return v.RemoteAddressSpacePrefixes }).(pulumi.StringArrayOutput)
}

// The ID of the remote virtual network. Changing this forces a new resource to be created.
//
// > **Note:** The remote virtual network should be in the same region as the databricks workspace. Please see the [product documentation](https://learn.microsoft.com/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering) for more information.
func (o VirtualNetworkPeeringOutput) RemoteVirtualNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringOutput { return v.RemoteVirtualNetworkId }).(pulumi.StringOutput)
}

// The name of the Resource Group in which the Databricks Virtual Network Peering should exist. Changing this forces a new resource to be created.
func (o VirtualNetworkPeeringOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// Can remote gateways be used on the Databricks virtual network? Defaults to `false`.
//
// > **Note:** If the `useRemoteGateways` is set to `true`, and `allowGatewayTransit` on the remote peering is also `true`, the virtual network will use the gateways of the remote virtual network for transit. Only one peering can have this flag set to `true`. `useRemoteGateways` cannot be set if the virtual network already has a gateway.
func (o VirtualNetworkPeeringOutput) UseRemoteGateways() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.BoolPtrOutput { return v.UseRemoteGateways }).(pulumi.BoolPtrOutput)
}

// The ID of the internal Virtual Network used by the DataBricks Workspace.
//
// > **Note:** The `virtualNetworkId` field is the value you must supply to the `network.VirtualNetworkPeering` resources `remoteVirtualNetworkId` field to successfully peer the Databricks Virtual Network with the remote virtual network.
func (o VirtualNetworkPeeringOutput) VirtualNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringOutput { return v.VirtualNetworkId }).(pulumi.StringOutput)
}

// The ID of the Databricks Workspace that this Databricks Virtual Network Peering is bound. Changing this forces a new resource to be created.
func (o VirtualNetworkPeeringOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkPeering) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type VirtualNetworkPeeringArrayOutput struct{ *pulumi.OutputState }

func (VirtualNetworkPeeringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkPeering)(nil)).Elem()
}

func (o VirtualNetworkPeeringArrayOutput) ToVirtualNetworkPeeringArrayOutput() VirtualNetworkPeeringArrayOutput {
	return o
}

func (o VirtualNetworkPeeringArrayOutput) ToVirtualNetworkPeeringArrayOutputWithContext(ctx context.Context) VirtualNetworkPeeringArrayOutput {
	return o
}

func (o VirtualNetworkPeeringArrayOutput) Index(i pulumi.IntInput) VirtualNetworkPeeringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualNetworkPeering {
		return vs[0].([]*VirtualNetworkPeering)[vs[1].(int)]
	}).(VirtualNetworkPeeringOutput)
}

type VirtualNetworkPeeringMapOutput struct{ *pulumi.OutputState }

func (VirtualNetworkPeeringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkPeering)(nil)).Elem()
}

func (o VirtualNetworkPeeringMapOutput) ToVirtualNetworkPeeringMapOutput() VirtualNetworkPeeringMapOutput {
	return o
}

func (o VirtualNetworkPeeringMapOutput) ToVirtualNetworkPeeringMapOutputWithContext(ctx context.Context) VirtualNetworkPeeringMapOutput {
	return o
}

func (o VirtualNetworkPeeringMapOutput) MapIndex(k pulumi.StringInput) VirtualNetworkPeeringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualNetworkPeering {
		return vs[0].(map[string]*VirtualNetworkPeering)[vs[1].(string)]
	}).(VirtualNetworkPeeringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkPeeringInput)(nil)).Elem(), &VirtualNetworkPeering{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkPeeringArrayInput)(nil)).Elem(), VirtualNetworkPeeringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkPeeringMapInput)(nil)).Elem(), VirtualNetworkPeeringMap{})
	pulumi.RegisterOutputType(VirtualNetworkPeeringOutput{})
	pulumi.RegisterOutputType(VirtualNetworkPeeringArrayOutput{})
	pulumi.RegisterOutputType(VirtualNetworkPeeringMapOutput{})
}
