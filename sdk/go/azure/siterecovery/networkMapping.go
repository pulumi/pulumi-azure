// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package siterecovery

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a site recovery network mapping on Azure. A network mapping decides how to translate connected networks when a VM is migrated from one region to another.
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
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/recoveryservices"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/siterecovery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			primary, err := core.NewResourceGroup(ctx, "primary", &core.ResourceGroupArgs{
//				Name:     pulumi.String("tfex-network-mapping-primary"),
//				Location: pulumi.String("West US"),
//			})
//			if err != nil {
//				return err
//			}
//			secondary, err := core.NewResourceGroup(ctx, "secondary", &core.ResourceGroupArgs{
//				Name:     pulumi.String("tfex-network-mapping-secondary"),
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			vault, err := recoveryservices.NewVault(ctx, "vault", &recoveryservices.VaultArgs{
//				Name:              pulumi.String("example-recovery-vault"),
//				Location:          secondary.Location,
//				ResourceGroupName: secondary.Name,
//				Sku:               pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			primaryFabric, err := siterecovery.NewFabric(ctx, "primary", &siterecovery.FabricArgs{
//				Name:              pulumi.String("primary-fabric"),
//				ResourceGroupName: secondary.Name,
//				RecoveryVaultName: vault.Name,
//				Location:          primary.Location,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = siterecovery.NewFabric(ctx, "secondary", &siterecovery.FabricArgs{
//				Name:              pulumi.String("secondary-fabric"),
//				ResourceGroupName: secondary.Name,
//				RecoveryVaultName: vault.Name,
//				Location:          secondary.Location,
//			}, pulumi.DependsOn([]pulumi.Resource{
//				primaryFabric,
//			}))
//			if err != nil {
//				return err
//			}
//			primaryVirtualNetwork, err := network.NewVirtualNetwork(ctx, "primary", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("network1"),
//				ResourceGroupName: primary.Name,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("192.168.1.0/24"),
//				},
//				Location: primary.Location,
//			})
//			if err != nil {
//				return err
//			}
//			secondaryVirtualNetwork, err := network.NewVirtualNetwork(ctx, "secondary", &network.VirtualNetworkArgs{
//				Name:              pulumi.String("network2"),
//				ResourceGroupName: secondary.Name,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("192.168.2.0/24"),
//				},
//				Location: secondary.Location,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = siterecovery.NewNetworkMapping(ctx, "recovery-mapping", &siterecovery.NetworkMappingArgs{
//				Name:                     pulumi.String("recovery-network-mapping-1"),
//				ResourceGroupName:        secondary.Name,
//				RecoveryVaultName:        vault.Name,
//				SourceRecoveryFabricName: pulumi.String("primary-fabric"),
//				TargetRecoveryFabricName: pulumi.String("secondary-fabric"),
//				SourceNetworkId:          primaryVirtualNetwork.ID(),
//				TargetNetworkId:          secondaryVirtualNetwork.ID(),
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
// * `Microsoft.RecoveryServices`: 2024-04-01
//
// ## Import
//
// Site Recovery Network Mapping can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:siterecovery/networkMapping:NetworkMapping mymapping /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/primary-fabric-name/replicationNetworks/azureNetwork/replicationNetworkMappings/mapping-name
// ```
type NetworkMapping struct {
	pulumi.CustomResourceState

	// The name of the network mapping. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultName pulumi.StringOutput `pulumi:"recoveryVaultName"`
	// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The id of the primary network. Changing this forces a new resource to be created.
	SourceNetworkId pulumi.StringOutput `pulumi:"sourceNetworkId"`
	// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
	SourceRecoveryFabricName pulumi.StringOutput `pulumi:"sourceRecoveryFabricName"`
	// The id of the recovery network. Changing this forces a new resource to be created.
	TargetNetworkId pulumi.StringOutput `pulumi:"targetNetworkId"`
	// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
	TargetRecoveryFabricName pulumi.StringOutput `pulumi:"targetRecoveryFabricName"`
}

// NewNetworkMapping registers a new resource with the given unique name, arguments, and options.
func NewNetworkMapping(ctx *pulumi.Context,
	name string, args *NetworkMappingArgs, opts ...pulumi.ResourceOption) (*NetworkMapping, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RecoveryVaultName == nil {
		return nil, errors.New("invalid value for required argument 'RecoveryVaultName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SourceNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'SourceNetworkId'")
	}
	if args.SourceRecoveryFabricName == nil {
		return nil, errors.New("invalid value for required argument 'SourceRecoveryFabricName'")
	}
	if args.TargetNetworkId == nil {
		return nil, errors.New("invalid value for required argument 'TargetNetworkId'")
	}
	if args.TargetRecoveryFabricName == nil {
		return nil, errors.New("invalid value for required argument 'TargetRecoveryFabricName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkMapping
	err := ctx.RegisterResource("azure:siterecovery/networkMapping:NetworkMapping", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkMapping gets an existing NetworkMapping resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkMapping(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkMappingState, opts ...pulumi.ResourceOption) (*NetworkMapping, error) {
	var resource NetworkMapping
	err := ctx.ReadResource("azure:siterecovery/networkMapping:NetworkMapping", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkMapping resources.
type networkMappingState struct {
	// The name of the network mapping. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultName *string `pulumi:"recoveryVaultName"`
	// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The id of the primary network. Changing this forces a new resource to be created.
	SourceNetworkId *string `pulumi:"sourceNetworkId"`
	// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
	SourceRecoveryFabricName *string `pulumi:"sourceRecoveryFabricName"`
	// The id of the recovery network. Changing this forces a new resource to be created.
	TargetNetworkId *string `pulumi:"targetNetworkId"`
	// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
	TargetRecoveryFabricName *string `pulumi:"targetRecoveryFabricName"`
}

type NetworkMappingState struct {
	// The name of the network mapping. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultName pulumi.StringPtrInput
	// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The id of the primary network. Changing this forces a new resource to be created.
	SourceNetworkId pulumi.StringPtrInput
	// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
	SourceRecoveryFabricName pulumi.StringPtrInput
	// The id of the recovery network. Changing this forces a new resource to be created.
	TargetNetworkId pulumi.StringPtrInput
	// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
	TargetRecoveryFabricName pulumi.StringPtrInput
}

func (NetworkMappingState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkMappingState)(nil)).Elem()
}

type networkMappingArgs struct {
	// The name of the network mapping. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The name of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultName string `pulumi:"recoveryVaultName"`
	// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The id of the primary network. Changing this forces a new resource to be created.
	SourceNetworkId string `pulumi:"sourceNetworkId"`
	// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
	SourceRecoveryFabricName string `pulumi:"sourceRecoveryFabricName"`
	// The id of the recovery network. Changing this forces a new resource to be created.
	TargetNetworkId string `pulumi:"targetNetworkId"`
	// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
	TargetRecoveryFabricName string `pulumi:"targetRecoveryFabricName"`
}

// The set of arguments for constructing a NetworkMapping resource.
type NetworkMappingArgs struct {
	// The name of the network mapping. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The name of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultName pulumi.StringInput
	// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The id of the primary network. Changing this forces a new resource to be created.
	SourceNetworkId pulumi.StringInput
	// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
	SourceRecoveryFabricName pulumi.StringInput
	// The id of the recovery network. Changing this forces a new resource to be created.
	TargetNetworkId pulumi.StringInput
	// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
	TargetRecoveryFabricName pulumi.StringInput
}

func (NetworkMappingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkMappingArgs)(nil)).Elem()
}

type NetworkMappingInput interface {
	pulumi.Input

	ToNetworkMappingOutput() NetworkMappingOutput
	ToNetworkMappingOutputWithContext(ctx context.Context) NetworkMappingOutput
}

func (*NetworkMapping) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkMapping)(nil)).Elem()
}

func (i *NetworkMapping) ToNetworkMappingOutput() NetworkMappingOutput {
	return i.ToNetworkMappingOutputWithContext(context.Background())
}

func (i *NetworkMapping) ToNetworkMappingOutputWithContext(ctx context.Context) NetworkMappingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkMappingOutput)
}

// NetworkMappingArrayInput is an input type that accepts NetworkMappingArray and NetworkMappingArrayOutput values.
// You can construct a concrete instance of `NetworkMappingArrayInput` via:
//
//	NetworkMappingArray{ NetworkMappingArgs{...} }
type NetworkMappingArrayInput interface {
	pulumi.Input

	ToNetworkMappingArrayOutput() NetworkMappingArrayOutput
	ToNetworkMappingArrayOutputWithContext(context.Context) NetworkMappingArrayOutput
}

type NetworkMappingArray []NetworkMappingInput

func (NetworkMappingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkMapping)(nil)).Elem()
}

func (i NetworkMappingArray) ToNetworkMappingArrayOutput() NetworkMappingArrayOutput {
	return i.ToNetworkMappingArrayOutputWithContext(context.Background())
}

func (i NetworkMappingArray) ToNetworkMappingArrayOutputWithContext(ctx context.Context) NetworkMappingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkMappingArrayOutput)
}

// NetworkMappingMapInput is an input type that accepts NetworkMappingMap and NetworkMappingMapOutput values.
// You can construct a concrete instance of `NetworkMappingMapInput` via:
//
//	NetworkMappingMap{ "key": NetworkMappingArgs{...} }
type NetworkMappingMapInput interface {
	pulumi.Input

	ToNetworkMappingMapOutput() NetworkMappingMapOutput
	ToNetworkMappingMapOutputWithContext(context.Context) NetworkMappingMapOutput
}

type NetworkMappingMap map[string]NetworkMappingInput

func (NetworkMappingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkMapping)(nil)).Elem()
}

func (i NetworkMappingMap) ToNetworkMappingMapOutput() NetworkMappingMapOutput {
	return i.ToNetworkMappingMapOutputWithContext(context.Background())
}

func (i NetworkMappingMap) ToNetworkMappingMapOutputWithContext(ctx context.Context) NetworkMappingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkMappingMapOutput)
}

type NetworkMappingOutput struct{ *pulumi.OutputState }

func (NetworkMappingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkMapping)(nil)).Elem()
}

func (o NetworkMappingOutput) ToNetworkMappingOutput() NetworkMappingOutput {
	return o
}

func (o NetworkMappingOutput) ToNetworkMappingOutputWithContext(ctx context.Context) NetworkMappingOutput {
	return o
}

// The name of the network mapping. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the vault that should be updated. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) RecoveryVaultName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.RecoveryVaultName }).(pulumi.StringOutput)
}

// Name of the resource group where the vault that should be updated is located. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The id of the primary network. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) SourceNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.SourceNetworkId }).(pulumi.StringOutput)
}

// Specifies the ASR fabric where mapping should be created. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) SourceRecoveryFabricName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.SourceRecoveryFabricName }).(pulumi.StringOutput)
}

// The id of the recovery network. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) TargetNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.TargetNetworkId }).(pulumi.StringOutput)
}

// The Azure Site Recovery fabric object corresponding to the recovery Azure region. Changing this forces a new resource to be created.
func (o NetworkMappingOutput) TargetRecoveryFabricName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkMapping) pulumi.StringOutput { return v.TargetRecoveryFabricName }).(pulumi.StringOutput)
}

type NetworkMappingArrayOutput struct{ *pulumi.OutputState }

func (NetworkMappingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkMapping)(nil)).Elem()
}

func (o NetworkMappingArrayOutput) ToNetworkMappingArrayOutput() NetworkMappingArrayOutput {
	return o
}

func (o NetworkMappingArrayOutput) ToNetworkMappingArrayOutputWithContext(ctx context.Context) NetworkMappingArrayOutput {
	return o
}

func (o NetworkMappingArrayOutput) Index(i pulumi.IntInput) NetworkMappingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkMapping {
		return vs[0].([]*NetworkMapping)[vs[1].(int)]
	}).(NetworkMappingOutput)
}

type NetworkMappingMapOutput struct{ *pulumi.OutputState }

func (NetworkMappingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkMapping)(nil)).Elem()
}

func (o NetworkMappingMapOutput) ToNetworkMappingMapOutput() NetworkMappingMapOutput {
	return o
}

func (o NetworkMappingMapOutput) ToNetworkMappingMapOutputWithContext(ctx context.Context) NetworkMappingMapOutput {
	return o
}

func (o NetworkMappingMapOutput) MapIndex(k pulumi.StringInput) NetworkMappingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkMapping {
		return vs[0].(map[string]*NetworkMapping)[vs[1].(string)]
	}).(NetworkMappingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkMappingInput)(nil)).Elem(), &NetworkMapping{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkMappingArrayInput)(nil)).Elem(), NetworkMappingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkMappingMapInput)(nil)).Elem(), NetworkMappingMap{})
	pulumi.RegisterOutputType(NetworkMappingOutput{})
	pulumi.RegisterOutputType(NetworkMappingArrayOutput{})
	pulumi.RegisterOutputType(NetworkMappingMapOutput{})
}
