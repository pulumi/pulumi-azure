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

// Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/recoveryservices"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/siterecovery"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-rg"),
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVault, err := recoveryservices.NewVault(ctx, "example", &recoveryservices.VaultArgs{
//				Name:              pulumi.String("example-recovery-vault"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleHyperVSite, err := siterecovery.NewHyperVSite(ctx, "example", &siterecovery.HyperVSiteArgs{
//				RecoveryVaultId: exampleVault.ID(),
//				Name:            pulumi.String("example-site"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleHyperVReplicationPolicy, err := siterecovery.NewHyperVReplicationPolicy(ctx, "example", &siterecovery.HyperVReplicationPolicyArgs{
//				Name:                          pulumi.String("policy"),
//				RecoveryVaultId:               exampleVault.ID(),
//				RecoveryPointRetentionInHours: pulumi.Int(2),
//				ApplicationConsistentSnapshotFrequencyInHours: pulumi.Int(1),
//				ReplicationIntervalInSeconds:                  pulumi.Int(300),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = siterecovery.NewHyperVReplicationPolicyAssociation(ctx, "example", &siterecovery.HyperVReplicationPolicyAssociationArgs{
//				Name:         pulumi.String("example-association"),
//				HypervSiteId: exampleHyperVSite.ID(),
//				PolicyId:     exampleHyperVReplicationPolicy.ID(),
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
// Site Recovery Replication Policies can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation  azurerm_site_recovery_hyperv_replication_policy_association.mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationFabrics/site-name/replicationProtectionContainers/container-name/replicationProtectionContainerMappings/mapping-name
// ```
type HyperVReplicationPolicyAssociation struct {
	pulumi.CustomResourceState

	// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
	HypervSiteId pulumi.StringOutput `pulumi:"hypervSiteId"`
	// The name of the replication policy association. Changing this forces a new association to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
	PolicyId pulumi.StringOutput `pulumi:"policyId"`
}

// NewHyperVReplicationPolicyAssociation registers a new resource with the given unique name, arguments, and options.
func NewHyperVReplicationPolicyAssociation(ctx *pulumi.Context,
	name string, args *HyperVReplicationPolicyAssociationArgs, opts ...pulumi.ResourceOption) (*HyperVReplicationPolicyAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HypervSiteId == nil {
		return nil, errors.New("invalid value for required argument 'HypervSiteId'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HyperVReplicationPolicyAssociation
	err := ctx.RegisterResource("azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHyperVReplicationPolicyAssociation gets an existing HyperVReplicationPolicyAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHyperVReplicationPolicyAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HyperVReplicationPolicyAssociationState, opts ...pulumi.ResourceOption) (*HyperVReplicationPolicyAssociation, error) {
	var resource HyperVReplicationPolicyAssociation
	err := ctx.ReadResource("azure:siterecovery/hyperVReplicationPolicyAssociation:HyperVReplicationPolicyAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HyperVReplicationPolicyAssociation resources.
type hyperVReplicationPolicyAssociationState struct {
	// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
	HypervSiteId *string `pulumi:"hypervSiteId"`
	// The name of the replication policy association. Changing this forces a new association to be created.
	Name *string `pulumi:"name"`
	// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
	PolicyId *string `pulumi:"policyId"`
}

type HyperVReplicationPolicyAssociationState struct {
	// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
	HypervSiteId pulumi.StringPtrInput
	// The name of the replication policy association. Changing this forces a new association to be created.
	Name pulumi.StringPtrInput
	// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
	PolicyId pulumi.StringPtrInput
}

func (HyperVReplicationPolicyAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperVReplicationPolicyAssociationState)(nil)).Elem()
}

type hyperVReplicationPolicyAssociationArgs struct {
	// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
	HypervSiteId string `pulumi:"hypervSiteId"`
	// The name of the replication policy association. Changing this forces a new association to be created.
	Name *string `pulumi:"name"`
	// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
	PolicyId string `pulumi:"policyId"`
}

// The set of arguments for constructing a HyperVReplicationPolicyAssociation resource.
type HyperVReplicationPolicyAssociationArgs struct {
	// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
	HypervSiteId pulumi.StringInput
	// The name of the replication policy association. Changing this forces a new association to be created.
	Name pulumi.StringPtrInput
	// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
	PolicyId pulumi.StringInput
}

func (HyperVReplicationPolicyAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperVReplicationPolicyAssociationArgs)(nil)).Elem()
}

type HyperVReplicationPolicyAssociationInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyAssociationOutput() HyperVReplicationPolicyAssociationOutput
	ToHyperVReplicationPolicyAssociationOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationOutput
}

func (*HyperVReplicationPolicyAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (i *HyperVReplicationPolicyAssociation) ToHyperVReplicationPolicyAssociationOutput() HyperVReplicationPolicyAssociationOutput {
	return i.ToHyperVReplicationPolicyAssociationOutputWithContext(context.Background())
}

func (i *HyperVReplicationPolicyAssociation) ToHyperVReplicationPolicyAssociationOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyAssociationOutput)
}

// HyperVReplicationPolicyAssociationArrayInput is an input type that accepts HyperVReplicationPolicyAssociationArray and HyperVReplicationPolicyAssociationArrayOutput values.
// You can construct a concrete instance of `HyperVReplicationPolicyAssociationArrayInput` via:
//
//	HyperVReplicationPolicyAssociationArray{ HyperVReplicationPolicyAssociationArgs{...} }
type HyperVReplicationPolicyAssociationArrayInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyAssociationArrayOutput() HyperVReplicationPolicyAssociationArrayOutput
	ToHyperVReplicationPolicyAssociationArrayOutputWithContext(context.Context) HyperVReplicationPolicyAssociationArrayOutput
}

type HyperVReplicationPolicyAssociationArray []HyperVReplicationPolicyAssociationInput

func (HyperVReplicationPolicyAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (i HyperVReplicationPolicyAssociationArray) ToHyperVReplicationPolicyAssociationArrayOutput() HyperVReplicationPolicyAssociationArrayOutput {
	return i.ToHyperVReplicationPolicyAssociationArrayOutputWithContext(context.Background())
}

func (i HyperVReplicationPolicyAssociationArray) ToHyperVReplicationPolicyAssociationArrayOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyAssociationArrayOutput)
}

// HyperVReplicationPolicyAssociationMapInput is an input type that accepts HyperVReplicationPolicyAssociationMap and HyperVReplicationPolicyAssociationMapOutput values.
// You can construct a concrete instance of `HyperVReplicationPolicyAssociationMapInput` via:
//
//	HyperVReplicationPolicyAssociationMap{ "key": HyperVReplicationPolicyAssociationArgs{...} }
type HyperVReplicationPolicyAssociationMapInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyAssociationMapOutput() HyperVReplicationPolicyAssociationMapOutput
	ToHyperVReplicationPolicyAssociationMapOutputWithContext(context.Context) HyperVReplicationPolicyAssociationMapOutput
}

type HyperVReplicationPolicyAssociationMap map[string]HyperVReplicationPolicyAssociationInput

func (HyperVReplicationPolicyAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (i HyperVReplicationPolicyAssociationMap) ToHyperVReplicationPolicyAssociationMapOutput() HyperVReplicationPolicyAssociationMapOutput {
	return i.ToHyperVReplicationPolicyAssociationMapOutputWithContext(context.Background())
}

func (i HyperVReplicationPolicyAssociationMap) ToHyperVReplicationPolicyAssociationMapOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyAssociationMapOutput)
}

type HyperVReplicationPolicyAssociationOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (o HyperVReplicationPolicyAssociationOutput) ToHyperVReplicationPolicyAssociationOutput() HyperVReplicationPolicyAssociationOutput {
	return o
}

func (o HyperVReplicationPolicyAssociationOutput) ToHyperVReplicationPolicyAssociationOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationOutput {
	return o
}

// The ID of the HyperV site to which the policy should be associated. Changing this forces a new association to be created.
func (o HyperVReplicationPolicyAssociationOutput) HypervSiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicyAssociation) pulumi.StringOutput { return v.HypervSiteId }).(pulumi.StringOutput)
}

// The name of the replication policy association. Changing this forces a new association to be created.
func (o HyperVReplicationPolicyAssociationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicyAssociation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the HyperV replication policy which to be associated. Changing this forces a new association to be created.
func (o HyperVReplicationPolicyAssociationOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicyAssociation) pulumi.StringOutput { return v.PolicyId }).(pulumi.StringOutput)
}

type HyperVReplicationPolicyAssociationArrayOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (o HyperVReplicationPolicyAssociationArrayOutput) ToHyperVReplicationPolicyAssociationArrayOutput() HyperVReplicationPolicyAssociationArrayOutput {
	return o
}

func (o HyperVReplicationPolicyAssociationArrayOutput) ToHyperVReplicationPolicyAssociationArrayOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationArrayOutput {
	return o
}

func (o HyperVReplicationPolicyAssociationArrayOutput) Index(i pulumi.IntInput) HyperVReplicationPolicyAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HyperVReplicationPolicyAssociation {
		return vs[0].([]*HyperVReplicationPolicyAssociation)[vs[1].(int)]
	}).(HyperVReplicationPolicyAssociationOutput)
}

type HyperVReplicationPolicyAssociationMapOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperVReplicationPolicyAssociation)(nil)).Elem()
}

func (o HyperVReplicationPolicyAssociationMapOutput) ToHyperVReplicationPolicyAssociationMapOutput() HyperVReplicationPolicyAssociationMapOutput {
	return o
}

func (o HyperVReplicationPolicyAssociationMapOutput) ToHyperVReplicationPolicyAssociationMapOutputWithContext(ctx context.Context) HyperVReplicationPolicyAssociationMapOutput {
	return o
}

func (o HyperVReplicationPolicyAssociationMapOutput) MapIndex(k pulumi.StringInput) HyperVReplicationPolicyAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HyperVReplicationPolicyAssociation {
		return vs[0].(map[string]*HyperVReplicationPolicyAssociation)[vs[1].(string)]
	}).(HyperVReplicationPolicyAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyAssociationInput)(nil)).Elem(), &HyperVReplicationPolicyAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyAssociationArrayInput)(nil)).Elem(), HyperVReplicationPolicyAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyAssociationMapInput)(nil)).Elem(), HyperVReplicationPolicyAssociationMap{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyAssociationOutput{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyAssociationArrayOutput{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyAssociationMapOutput{})
}
