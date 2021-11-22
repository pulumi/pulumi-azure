// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Route in a Virtual Hub Route Table.
//
// > **Note:** Route table routes can managed with this resource, or in-line with the virtualHubRouteTable resource. Using both is not supported.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/network"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
// 			AddressSpaces: pulumi.StringArray{
// 				pulumi.String("10.5.0.0/16"),
// 			},
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleNetworkSecurityGroup, err := network.NewNetworkSecurityGroup(ctx, "exampleNetworkSecurityGroup", &network.NetworkSecurityGroupArgs{
// 			Location:          exampleResourceGroup.Location,
// 			ResourceGroupName: exampleResourceGroup.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleSubnet, err := network.NewSubnet(ctx, "exampleSubnet", &network.SubnetArgs{
// 			ResourceGroupName:  exampleResourceGroup.Name,
// 			VirtualNetworkName: exampleVirtualNetwork.Name,
// 			AddressPrefixes: pulumi.StringArray{
// 				pulumi.String("10.5.1.0/24"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = network.NewSubnetNetworkSecurityGroupAssociation(ctx, "exampleSubnetNetworkSecurityGroupAssociation", &network.SubnetNetworkSecurityGroupAssociationArgs{
// 			SubnetId:               exampleSubnet.ID(),
// 			NetworkSecurityGroupId: exampleNetworkSecurityGroup.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualWan, err := network.NewVirtualWan(ctx, "exampleVirtualWan", &network.VirtualWanArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualHub, err := network.NewVirtualHub(ctx, "exampleVirtualHub", &network.VirtualHubArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 			VirtualWanId:      exampleVirtualWan.ID(),
// 			AddressPrefix:     pulumi.String("10.0.2.0/24"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualHubRouteTable, err := network.NewVirtualHubRouteTable(ctx, "exampleVirtualHubRouteTable", &network.VirtualHubRouteTableArgs{
// 			VirtualHubId: exampleVirtualHub.ID(),
// 			Labels: pulumi.StringArray{
// 				pulumi.String("label1"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualHubConnection, err := network.NewVirtualHubConnection(ctx, "exampleVirtualHubConnection", &network.VirtualHubConnectionArgs{
// 			VirtualHubId:           exampleVirtualHub.ID(),
// 			RemoteVirtualNetworkId: exampleVirtualNetwork.ID(),
// 			Routing: &network.VirtualHubConnectionRoutingArgs{
// 				AssociatedRouteTableId: exampleVirtualHubRouteTable.ID(),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = network.NewVirtualHubRouteTableRoute(ctx, "exampleVirtualHubRouteTableRoute", &network.VirtualHubRouteTableRouteArgs{
// 			RouteTableId:     exampleVirtualHubRouteTable.ID(),
// 			DestinationsType: pulumi.String("CIDR"),
// 			Destinations: pulumi.StringArray{
// 				pulumi.String("10.0.0.0/16"),
// 			},
// 			NextHopType: pulumi.String("ResourceId"),
// 			NextHop:     exampleVirtualHubConnection.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Virtual Hub Route Table Routes can be imported using `<Route Table Resource Id>/routes/<Route Name>`, e.g.
//
// ```sh
//  $ pulumi import azure:network/virtualHubRouteTableRoute:VirtualHubRouteTableRoute example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/virtualHub1/hubRouteTables/routeTable1/routes/routeName
// ```
type VirtualHubRouteTableRoute struct {
	pulumi.CustomResourceState

	// A list of destination addresses for this route.
	Destinations pulumi.StringArrayOutput `pulumi:"destinations"`
	// The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
	DestinationsType pulumi.StringOutput `pulumi:"destinationsType"`
	// The name which should be used for this route. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The next hop's resource ID.
	NextHop pulumi.StringOutput `pulumi:"nextHop"`
	// The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
	NextHopType pulumi.StringPtrOutput `pulumi:"nextHopType"`
	// The ID of the Virtual Hub Route Table to link this route to. Changing this forces a new resource to be created.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
}

// NewVirtualHubRouteTableRoute registers a new resource with the given unique name, arguments, and options.
func NewVirtualHubRouteTableRoute(ctx *pulumi.Context,
	name string, args *VirtualHubRouteTableRouteArgs, opts ...pulumi.ResourceOption) (*VirtualHubRouteTableRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destinations == nil {
		return nil, errors.New("invalid value for required argument 'Destinations'")
	}
	if args.DestinationsType == nil {
		return nil, errors.New("invalid value for required argument 'DestinationsType'")
	}
	if args.NextHop == nil {
		return nil, errors.New("invalid value for required argument 'NextHop'")
	}
	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	var resource VirtualHubRouteTableRoute
	err := ctx.RegisterResource("azure:network/virtualHubRouteTableRoute:VirtualHubRouteTableRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualHubRouteTableRoute gets an existing VirtualHubRouteTableRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualHubRouteTableRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualHubRouteTableRouteState, opts ...pulumi.ResourceOption) (*VirtualHubRouteTableRoute, error) {
	var resource VirtualHubRouteTableRoute
	err := ctx.ReadResource("azure:network/virtualHubRouteTableRoute:VirtualHubRouteTableRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualHubRouteTableRoute resources.
type virtualHubRouteTableRouteState struct {
	// A list of destination addresses for this route.
	Destinations []string `pulumi:"destinations"`
	// The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
	DestinationsType *string `pulumi:"destinationsType"`
	// The name which should be used for this route. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The next hop's resource ID.
	NextHop *string `pulumi:"nextHop"`
	// The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
	NextHopType *string `pulumi:"nextHopType"`
	// The ID of the Virtual Hub Route Table to link this route to. Changing this forces a new resource to be created.
	RouteTableId *string `pulumi:"routeTableId"`
}

type VirtualHubRouteTableRouteState struct {
	// A list of destination addresses for this route.
	Destinations pulumi.StringArrayInput
	// The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
	DestinationsType pulumi.StringPtrInput
	// The name which should be used for this route. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The next hop's resource ID.
	NextHop pulumi.StringPtrInput
	// The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
	NextHopType pulumi.StringPtrInput
	// The ID of the Virtual Hub Route Table to link this route to. Changing this forces a new resource to be created.
	RouteTableId pulumi.StringPtrInput
}

func (VirtualHubRouteTableRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualHubRouteTableRouteState)(nil)).Elem()
}

type virtualHubRouteTableRouteArgs struct {
	// A list of destination addresses for this route.
	Destinations []string `pulumi:"destinations"`
	// The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
	DestinationsType string `pulumi:"destinationsType"`
	// The name which should be used for this route. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The next hop's resource ID.
	NextHop string `pulumi:"nextHop"`
	// The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
	NextHopType *string `pulumi:"nextHopType"`
	// The ID of the Virtual Hub Route Table to link this route to. Changing this forces a new resource to be created.
	RouteTableId string `pulumi:"routeTableId"`
}

// The set of arguments for constructing a VirtualHubRouteTableRoute resource.
type VirtualHubRouteTableRouteArgs struct {
	// A list of destination addresses for this route.
	Destinations pulumi.StringArrayInput
	// The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
	DestinationsType pulumi.StringInput
	// The name which should be used for this route. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The next hop's resource ID.
	NextHop pulumi.StringInput
	// The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
	NextHopType pulumi.StringPtrInput
	// The ID of the Virtual Hub Route Table to link this route to. Changing this forces a new resource to be created.
	RouteTableId pulumi.StringInput
}

func (VirtualHubRouteTableRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualHubRouteTableRouteArgs)(nil)).Elem()
}

type VirtualHubRouteTableRouteInput interface {
	pulumi.Input

	ToVirtualHubRouteTableRouteOutput() VirtualHubRouteTableRouteOutput
	ToVirtualHubRouteTableRouteOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteOutput
}

func (*VirtualHubRouteTableRoute) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualHubRouteTableRoute)(nil))
}

func (i *VirtualHubRouteTableRoute) ToVirtualHubRouteTableRouteOutput() VirtualHubRouteTableRouteOutput {
	return i.ToVirtualHubRouteTableRouteOutputWithContext(context.Background())
}

func (i *VirtualHubRouteTableRoute) ToVirtualHubRouteTableRouteOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHubRouteTableRouteOutput)
}

func (i *VirtualHubRouteTableRoute) ToVirtualHubRouteTableRoutePtrOutput() VirtualHubRouteTableRoutePtrOutput {
	return i.ToVirtualHubRouteTableRoutePtrOutputWithContext(context.Background())
}

func (i *VirtualHubRouteTableRoute) ToVirtualHubRouteTableRoutePtrOutputWithContext(ctx context.Context) VirtualHubRouteTableRoutePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHubRouteTableRoutePtrOutput)
}

type VirtualHubRouteTableRoutePtrInput interface {
	pulumi.Input

	ToVirtualHubRouteTableRoutePtrOutput() VirtualHubRouteTableRoutePtrOutput
	ToVirtualHubRouteTableRoutePtrOutputWithContext(ctx context.Context) VirtualHubRouteTableRoutePtrOutput
}

type virtualHubRouteTableRoutePtrType VirtualHubRouteTableRouteArgs

func (*virtualHubRouteTableRoutePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualHubRouteTableRoute)(nil))
}

func (i *virtualHubRouteTableRoutePtrType) ToVirtualHubRouteTableRoutePtrOutput() VirtualHubRouteTableRoutePtrOutput {
	return i.ToVirtualHubRouteTableRoutePtrOutputWithContext(context.Background())
}

func (i *virtualHubRouteTableRoutePtrType) ToVirtualHubRouteTableRoutePtrOutputWithContext(ctx context.Context) VirtualHubRouteTableRoutePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHubRouteTableRoutePtrOutput)
}

// VirtualHubRouteTableRouteArrayInput is an input type that accepts VirtualHubRouteTableRouteArray and VirtualHubRouteTableRouteArrayOutput values.
// You can construct a concrete instance of `VirtualHubRouteTableRouteArrayInput` via:
//
//          VirtualHubRouteTableRouteArray{ VirtualHubRouteTableRouteArgs{...} }
type VirtualHubRouteTableRouteArrayInput interface {
	pulumi.Input

	ToVirtualHubRouteTableRouteArrayOutput() VirtualHubRouteTableRouteArrayOutput
	ToVirtualHubRouteTableRouteArrayOutputWithContext(context.Context) VirtualHubRouteTableRouteArrayOutput
}

type VirtualHubRouteTableRouteArray []VirtualHubRouteTableRouteInput

func (VirtualHubRouteTableRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualHubRouteTableRoute)(nil)).Elem()
}

func (i VirtualHubRouteTableRouteArray) ToVirtualHubRouteTableRouteArrayOutput() VirtualHubRouteTableRouteArrayOutput {
	return i.ToVirtualHubRouteTableRouteArrayOutputWithContext(context.Background())
}

func (i VirtualHubRouteTableRouteArray) ToVirtualHubRouteTableRouteArrayOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHubRouteTableRouteArrayOutput)
}

// VirtualHubRouteTableRouteMapInput is an input type that accepts VirtualHubRouteTableRouteMap and VirtualHubRouteTableRouteMapOutput values.
// You can construct a concrete instance of `VirtualHubRouteTableRouteMapInput` via:
//
//          VirtualHubRouteTableRouteMap{ "key": VirtualHubRouteTableRouteArgs{...} }
type VirtualHubRouteTableRouteMapInput interface {
	pulumi.Input

	ToVirtualHubRouteTableRouteMapOutput() VirtualHubRouteTableRouteMapOutput
	ToVirtualHubRouteTableRouteMapOutputWithContext(context.Context) VirtualHubRouteTableRouteMapOutput
}

type VirtualHubRouteTableRouteMap map[string]VirtualHubRouteTableRouteInput

func (VirtualHubRouteTableRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualHubRouteTableRoute)(nil)).Elem()
}

func (i VirtualHubRouteTableRouteMap) ToVirtualHubRouteTableRouteMapOutput() VirtualHubRouteTableRouteMapOutput {
	return i.ToVirtualHubRouteTableRouteMapOutputWithContext(context.Background())
}

func (i VirtualHubRouteTableRouteMap) ToVirtualHubRouteTableRouteMapOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualHubRouteTableRouteMapOutput)
}

type VirtualHubRouteTableRouteOutput struct{ *pulumi.OutputState }

func (VirtualHubRouteTableRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VirtualHubRouteTableRoute)(nil))
}

func (o VirtualHubRouteTableRouteOutput) ToVirtualHubRouteTableRouteOutput() VirtualHubRouteTableRouteOutput {
	return o
}

func (o VirtualHubRouteTableRouteOutput) ToVirtualHubRouteTableRouteOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteOutput {
	return o
}

func (o VirtualHubRouteTableRouteOutput) ToVirtualHubRouteTableRoutePtrOutput() VirtualHubRouteTableRoutePtrOutput {
	return o.ToVirtualHubRouteTableRoutePtrOutputWithContext(context.Background())
}

func (o VirtualHubRouteTableRouteOutput) ToVirtualHubRouteTableRoutePtrOutputWithContext(ctx context.Context) VirtualHubRouteTableRoutePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VirtualHubRouteTableRoute) *VirtualHubRouteTableRoute {
		return &v
	}).(VirtualHubRouteTableRoutePtrOutput)
}

type VirtualHubRouteTableRoutePtrOutput struct{ *pulumi.OutputState }

func (VirtualHubRouteTableRoutePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualHubRouteTableRoute)(nil))
}

func (o VirtualHubRouteTableRoutePtrOutput) ToVirtualHubRouteTableRoutePtrOutput() VirtualHubRouteTableRoutePtrOutput {
	return o
}

func (o VirtualHubRouteTableRoutePtrOutput) ToVirtualHubRouteTableRoutePtrOutputWithContext(ctx context.Context) VirtualHubRouteTableRoutePtrOutput {
	return o
}

func (o VirtualHubRouteTableRoutePtrOutput) Elem() VirtualHubRouteTableRouteOutput {
	return o.ApplyT(func(v *VirtualHubRouteTableRoute) VirtualHubRouteTableRoute {
		if v != nil {
			return *v
		}
		var ret VirtualHubRouteTableRoute
		return ret
	}).(VirtualHubRouteTableRouteOutput)
}

type VirtualHubRouteTableRouteArrayOutput struct{ *pulumi.OutputState }

func (VirtualHubRouteTableRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VirtualHubRouteTableRoute)(nil))
}

func (o VirtualHubRouteTableRouteArrayOutput) ToVirtualHubRouteTableRouteArrayOutput() VirtualHubRouteTableRouteArrayOutput {
	return o
}

func (o VirtualHubRouteTableRouteArrayOutput) ToVirtualHubRouteTableRouteArrayOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteArrayOutput {
	return o
}

func (o VirtualHubRouteTableRouteArrayOutput) Index(i pulumi.IntInput) VirtualHubRouteTableRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VirtualHubRouteTableRoute {
		return vs[0].([]VirtualHubRouteTableRoute)[vs[1].(int)]
	}).(VirtualHubRouteTableRouteOutput)
}

type VirtualHubRouteTableRouteMapOutput struct{ *pulumi.OutputState }

func (VirtualHubRouteTableRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]VirtualHubRouteTableRoute)(nil))
}

func (o VirtualHubRouteTableRouteMapOutput) ToVirtualHubRouteTableRouteMapOutput() VirtualHubRouteTableRouteMapOutput {
	return o
}

func (o VirtualHubRouteTableRouteMapOutput) ToVirtualHubRouteTableRouteMapOutputWithContext(ctx context.Context) VirtualHubRouteTableRouteMapOutput {
	return o
}

func (o VirtualHubRouteTableRouteMapOutput) MapIndex(k pulumi.StringInput) VirtualHubRouteTableRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) VirtualHubRouteTableRoute {
		return vs[0].(map[string]VirtualHubRouteTableRoute)[vs[1].(string)]
	}).(VirtualHubRouteTableRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHubRouteTableRouteInput)(nil)).Elem(), &VirtualHubRouteTableRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHubRouteTableRoutePtrInput)(nil)).Elem(), &VirtualHubRouteTableRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHubRouteTableRouteArrayInput)(nil)).Elem(), VirtualHubRouteTableRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualHubRouteTableRouteMapInput)(nil)).Elem(), VirtualHubRouteTableRouteMap{})
	pulumi.RegisterOutputType(VirtualHubRouteTableRouteOutput{})
	pulumi.RegisterOutputType(VirtualHubRouteTableRoutePtrOutput{})
	pulumi.RegisterOutputType(VirtualHubRouteTableRouteArrayOutput{})
	pulumi.RegisterOutputType(VirtualHubRouteTableRouteMapOutput{})
}