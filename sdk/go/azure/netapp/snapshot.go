// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package netapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a NetApp Snapshot.
//
// ## NetApp Snapshot Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/netapp"
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
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "example", &network.VirtualNetworkArgs{
//				Name: pulumi.String("example-virtualnetwork"),
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "example", &network.SubnetArgs{
//				Name:               pulumi.String("example-subnet"),
//				ResourceGroupName:  example.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.2.0/24"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("netapp"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Name: pulumi.String("Microsoft.Netapp/volumes"),
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/networkinterfaces/*"),
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAccount, err := netapp.NewAccount(ctx, "example", &netapp.AccountArgs{
//				Name:              pulumi.String("example-netappaccount"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//			})
//			if err != nil {
//				return err
//			}
//			examplePool, err := netapp.NewPool(ctx, "example", &netapp.PoolArgs{
//				Name:              pulumi.String("example-netapppool"),
//				AccountName:       exampleAccount.Name,
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				ServiceLevel:      pulumi.String("Premium"),
//				SizeInTb:          pulumi.Int(4),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVolume, err := netapp.NewVolume(ctx, "example", &netapp.VolumeArgs{
//				Name:              pulumi.String("example-netappvolume"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				AccountName:       exampleAccount.Name,
//				PoolName:          examplePool.Name,
//				VolumePath:        pulumi.String("my-unique-file-path"),
//				ServiceLevel:      pulumi.String("Premium"),
//				SubnetId:          exampleSubnet.ID(),
//				StorageQuotaInGb:  pulumi.Int(100),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = netapp.NewSnapshot(ctx, "example", &netapp.SnapshotArgs{
//				Name:              pulumi.String("example-netappsnapshot"),
//				AccountName:       exampleAccount.Name,
//				PoolName:          examplePool.Name,
//				VolumeName:        exampleVolume.Name,
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
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
// * `Microsoft.NetApp`: 2025-01-01
//
// ## Import
//
// NetApp Snapshot can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:netapp/snapshot:Snapshot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1/snapshots/snapshot1
// ```
type Snapshot struct {
	pulumi.CustomResourceState

	// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
	PoolName pulumi.StringOutput `pulumi:"poolName"`
	// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	VolumeName pulumi.StringOutput `pulumi:"volumeName"`
}

// NewSnapshot registers a new resource with the given unique name, arguments, and options.
func NewSnapshot(ctx *pulumi.Context,
	name string, args *SnapshotArgs, opts ...pulumi.ResourceOption) (*Snapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.PoolName == nil {
		return nil, errors.New("invalid value for required argument 'PoolName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.VolumeName == nil {
		return nil, errors.New("invalid value for required argument 'VolumeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Snapshot
	err := ctx.RegisterResource("azure:netapp/snapshot:Snapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSnapshot gets an existing Snapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SnapshotState, opts ...pulumi.ResourceOption) (*Snapshot, error) {
	var resource Snapshot
	err := ctx.ReadResource("azure:netapp/snapshot:Snapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Snapshot resources.
type snapshotState struct {
	// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
	AccountName *string `pulumi:"accountName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
	PoolName *string `pulumi:"poolName"`
	// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	VolumeName *string `pulumi:"volumeName"`
}

type SnapshotState struct {
	// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
	AccountName pulumi.StringPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
	PoolName pulumi.StringPtrInput
	// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	VolumeName pulumi.StringPtrInput
}

func (SnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotState)(nil)).Elem()
}

type snapshotArgs struct {
	// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
	AccountName string `pulumi:"accountName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
	PoolName string `pulumi:"poolName"`
	// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	VolumeName string `pulumi:"volumeName"`
}

// The set of arguments for constructing a Snapshot resource.
type SnapshotArgs struct {
	// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
	AccountName pulumi.StringInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
	PoolName pulumi.StringInput
	// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
	VolumeName pulumi.StringInput
}

func (SnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotArgs)(nil)).Elem()
}

type SnapshotInput interface {
	pulumi.Input

	ToSnapshotOutput() SnapshotOutput
	ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput
}

func (*Snapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**Snapshot)(nil)).Elem()
}

func (i *Snapshot) ToSnapshotOutput() SnapshotOutput {
	return i.ToSnapshotOutputWithContext(context.Background())
}

func (i *Snapshot) ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotOutput)
}

// SnapshotArrayInput is an input type that accepts SnapshotArray and SnapshotArrayOutput values.
// You can construct a concrete instance of `SnapshotArrayInput` via:
//
//	SnapshotArray{ SnapshotArgs{...} }
type SnapshotArrayInput interface {
	pulumi.Input

	ToSnapshotArrayOutput() SnapshotArrayOutput
	ToSnapshotArrayOutputWithContext(context.Context) SnapshotArrayOutput
}

type SnapshotArray []SnapshotInput

func (SnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Snapshot)(nil)).Elem()
}

func (i SnapshotArray) ToSnapshotArrayOutput() SnapshotArrayOutput {
	return i.ToSnapshotArrayOutputWithContext(context.Background())
}

func (i SnapshotArray) ToSnapshotArrayOutputWithContext(ctx context.Context) SnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotArrayOutput)
}

// SnapshotMapInput is an input type that accepts SnapshotMap and SnapshotMapOutput values.
// You can construct a concrete instance of `SnapshotMapInput` via:
//
//	SnapshotMap{ "key": SnapshotArgs{...} }
type SnapshotMapInput interface {
	pulumi.Input

	ToSnapshotMapOutput() SnapshotMapOutput
	ToSnapshotMapOutputWithContext(context.Context) SnapshotMapOutput
}

type SnapshotMap map[string]SnapshotInput

func (SnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Snapshot)(nil)).Elem()
}

func (i SnapshotMap) ToSnapshotMapOutput() SnapshotMapOutput {
	return i.ToSnapshotMapOutputWithContext(context.Background())
}

func (i SnapshotMap) ToSnapshotMapOutputWithContext(ctx context.Context) SnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotMapOutput)
}

type SnapshotOutput struct{ *pulumi.OutputState }

func (SnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Snapshot)(nil)).Elem()
}

func (o SnapshotOutput) ToSnapshotOutput() SnapshotOutput {
	return o
}

func (o SnapshotOutput) ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput {
	return o
}

// The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
func (o SnapshotOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o SnapshotOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the NetApp Snapshot. Changing this forces a new resource to be created.
func (o SnapshotOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
func (o SnapshotOutput) PoolName() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.PoolName }).(pulumi.StringOutput)
}

// The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
func (o SnapshotOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
func (o SnapshotOutput) VolumeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.VolumeName }).(pulumi.StringOutput)
}

type SnapshotArrayOutput struct{ *pulumi.OutputState }

func (SnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Snapshot)(nil)).Elem()
}

func (o SnapshotArrayOutput) ToSnapshotArrayOutput() SnapshotArrayOutput {
	return o
}

func (o SnapshotArrayOutput) ToSnapshotArrayOutputWithContext(ctx context.Context) SnapshotArrayOutput {
	return o
}

func (o SnapshotArrayOutput) Index(i pulumi.IntInput) SnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Snapshot {
		return vs[0].([]*Snapshot)[vs[1].(int)]
	}).(SnapshotOutput)
}

type SnapshotMapOutput struct{ *pulumi.OutputState }

func (SnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Snapshot)(nil)).Elem()
}

func (o SnapshotMapOutput) ToSnapshotMapOutput() SnapshotMapOutput {
	return o
}

func (o SnapshotMapOutput) ToSnapshotMapOutputWithContext(ctx context.Context) SnapshotMapOutput {
	return o
}

func (o SnapshotMapOutput) MapIndex(k pulumi.StringInput) SnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Snapshot {
		return vs[0].(map[string]*Snapshot)[vs[1].(string)]
	}).(SnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotInput)(nil)).Elem(), &Snapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotArrayInput)(nil)).Elem(), SnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotMapInput)(nil)).Elem(), SnapshotMap{})
	pulumi.RegisterOutputType(SnapshotOutput{})
	pulumi.RegisterOutputType(SnapshotArrayOutput{})
	pulumi.RegisterOutputType(SnapshotMapOutput{})
}
