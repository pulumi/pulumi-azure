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

// Manages a Azure Site Recovery replication policy for HyperV within a Recovery Vault. Replication policies define the frequency at which recovery points are created and how long they are stored.
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
//			vault, err := recoveryservices.NewVault(ctx, "vault", &recoveryservices.VaultArgs{
//				Name:              pulumi.String("example-recovery-vault"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = siterecovery.NewHyperVReplicationPolicy(ctx, "policy", &siterecovery.HyperVReplicationPolicyArgs{
//				Name:                          pulumi.String("policy"),
//				RecoveryVaultId:               vault.ID(),
//				RecoveryPointRetentionInHours: pulumi.Int(2),
//				ApplicationConsistentSnapshotFrequencyInHours: pulumi.Int(1),
//				ReplicationIntervalInSeconds:                  pulumi.Int(300),
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
// $ pulumi import azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy mypolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-group-name/providers/Microsoft.RecoveryServices/vaults/recovery-vault-name/replicationPolicies/policy-name
// ```
type HyperVReplicationPolicy struct {
	pulumi.CustomResourceState

	// Specifies the frequency at which to create application consistent recovery points.
	ApplicationConsistentSnapshotFrequencyInHours pulumi.IntOutput `pulumi:"applicationConsistentSnapshotFrequencyInHours"`
	// The name of the replication policy. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The duration in hours for which the recovery points need to be stored.
	RecoveryPointRetentionInHours pulumi.IntOutput `pulumi:"recoveryPointRetentionInHours"`
	// The id of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultId pulumi.StringOutput `pulumi:"recoveryVaultId"`
	// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
	ReplicationIntervalInSeconds pulumi.IntOutput `pulumi:"replicationIntervalInSeconds"`
}

// NewHyperVReplicationPolicy registers a new resource with the given unique name, arguments, and options.
func NewHyperVReplicationPolicy(ctx *pulumi.Context,
	name string, args *HyperVReplicationPolicyArgs, opts ...pulumi.ResourceOption) (*HyperVReplicationPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationConsistentSnapshotFrequencyInHours == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationConsistentSnapshotFrequencyInHours'")
	}
	if args.RecoveryPointRetentionInHours == nil {
		return nil, errors.New("invalid value for required argument 'RecoveryPointRetentionInHours'")
	}
	if args.RecoveryVaultId == nil {
		return nil, errors.New("invalid value for required argument 'RecoveryVaultId'")
	}
	if args.ReplicationIntervalInSeconds == nil {
		return nil, errors.New("invalid value for required argument 'ReplicationIntervalInSeconds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HyperVReplicationPolicy
	err := ctx.RegisterResource("azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHyperVReplicationPolicy gets an existing HyperVReplicationPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHyperVReplicationPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HyperVReplicationPolicyState, opts ...pulumi.ResourceOption) (*HyperVReplicationPolicy, error) {
	var resource HyperVReplicationPolicy
	err := ctx.ReadResource("azure:siterecovery/hyperVReplicationPolicy:HyperVReplicationPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HyperVReplicationPolicy resources.
type hyperVReplicationPolicyState struct {
	// Specifies the frequency at which to create application consistent recovery points.
	ApplicationConsistentSnapshotFrequencyInHours *int `pulumi:"applicationConsistentSnapshotFrequencyInHours"`
	// The name of the replication policy. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The duration in hours for which the recovery points need to be stored.
	RecoveryPointRetentionInHours *int `pulumi:"recoveryPointRetentionInHours"`
	// The id of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultId *string `pulumi:"recoveryVaultId"`
	// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
	ReplicationIntervalInSeconds *int `pulumi:"replicationIntervalInSeconds"`
}

type HyperVReplicationPolicyState struct {
	// Specifies the frequency at which to create application consistent recovery points.
	ApplicationConsistentSnapshotFrequencyInHours pulumi.IntPtrInput
	// The name of the replication policy. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The duration in hours for which the recovery points need to be stored.
	RecoveryPointRetentionInHours pulumi.IntPtrInput
	// The id of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultId pulumi.StringPtrInput
	// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
	ReplicationIntervalInSeconds pulumi.IntPtrInput
}

func (HyperVReplicationPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperVReplicationPolicyState)(nil)).Elem()
}

type hyperVReplicationPolicyArgs struct {
	// Specifies the frequency at which to create application consistent recovery points.
	ApplicationConsistentSnapshotFrequencyInHours int `pulumi:"applicationConsistentSnapshotFrequencyInHours"`
	// The name of the replication policy. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The duration in hours for which the recovery points need to be stored.
	RecoveryPointRetentionInHours int `pulumi:"recoveryPointRetentionInHours"`
	// The id of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultId string `pulumi:"recoveryVaultId"`
	// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
	ReplicationIntervalInSeconds int `pulumi:"replicationIntervalInSeconds"`
}

// The set of arguments for constructing a HyperVReplicationPolicy resource.
type HyperVReplicationPolicyArgs struct {
	// Specifies the frequency at which to create application consistent recovery points.
	ApplicationConsistentSnapshotFrequencyInHours pulumi.IntInput
	// The name of the replication policy. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The duration in hours for which the recovery points need to be stored.
	RecoveryPointRetentionInHours pulumi.IntInput
	// The id of the vault that should be updated. Changing this forces a new resource to be created.
	RecoveryVaultId pulumi.StringInput
	// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
	ReplicationIntervalInSeconds pulumi.IntInput
}

func (HyperVReplicationPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperVReplicationPolicyArgs)(nil)).Elem()
}

type HyperVReplicationPolicyInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyOutput() HyperVReplicationPolicyOutput
	ToHyperVReplicationPolicyOutputWithContext(ctx context.Context) HyperVReplicationPolicyOutput
}

func (*HyperVReplicationPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperVReplicationPolicy)(nil)).Elem()
}

func (i *HyperVReplicationPolicy) ToHyperVReplicationPolicyOutput() HyperVReplicationPolicyOutput {
	return i.ToHyperVReplicationPolicyOutputWithContext(context.Background())
}

func (i *HyperVReplicationPolicy) ToHyperVReplicationPolicyOutputWithContext(ctx context.Context) HyperVReplicationPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyOutput)
}

// HyperVReplicationPolicyArrayInput is an input type that accepts HyperVReplicationPolicyArray and HyperVReplicationPolicyArrayOutput values.
// You can construct a concrete instance of `HyperVReplicationPolicyArrayInput` via:
//
//	HyperVReplicationPolicyArray{ HyperVReplicationPolicyArgs{...} }
type HyperVReplicationPolicyArrayInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyArrayOutput() HyperVReplicationPolicyArrayOutput
	ToHyperVReplicationPolicyArrayOutputWithContext(context.Context) HyperVReplicationPolicyArrayOutput
}

type HyperVReplicationPolicyArray []HyperVReplicationPolicyInput

func (HyperVReplicationPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperVReplicationPolicy)(nil)).Elem()
}

func (i HyperVReplicationPolicyArray) ToHyperVReplicationPolicyArrayOutput() HyperVReplicationPolicyArrayOutput {
	return i.ToHyperVReplicationPolicyArrayOutputWithContext(context.Background())
}

func (i HyperVReplicationPolicyArray) ToHyperVReplicationPolicyArrayOutputWithContext(ctx context.Context) HyperVReplicationPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyArrayOutput)
}

// HyperVReplicationPolicyMapInput is an input type that accepts HyperVReplicationPolicyMap and HyperVReplicationPolicyMapOutput values.
// You can construct a concrete instance of `HyperVReplicationPolicyMapInput` via:
//
//	HyperVReplicationPolicyMap{ "key": HyperVReplicationPolicyArgs{...} }
type HyperVReplicationPolicyMapInput interface {
	pulumi.Input

	ToHyperVReplicationPolicyMapOutput() HyperVReplicationPolicyMapOutput
	ToHyperVReplicationPolicyMapOutputWithContext(context.Context) HyperVReplicationPolicyMapOutput
}

type HyperVReplicationPolicyMap map[string]HyperVReplicationPolicyInput

func (HyperVReplicationPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperVReplicationPolicy)(nil)).Elem()
}

func (i HyperVReplicationPolicyMap) ToHyperVReplicationPolicyMapOutput() HyperVReplicationPolicyMapOutput {
	return i.ToHyperVReplicationPolicyMapOutputWithContext(context.Background())
}

func (i HyperVReplicationPolicyMap) ToHyperVReplicationPolicyMapOutputWithContext(ctx context.Context) HyperVReplicationPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperVReplicationPolicyMapOutput)
}

type HyperVReplicationPolicyOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperVReplicationPolicy)(nil)).Elem()
}

func (o HyperVReplicationPolicyOutput) ToHyperVReplicationPolicyOutput() HyperVReplicationPolicyOutput {
	return o
}

func (o HyperVReplicationPolicyOutput) ToHyperVReplicationPolicyOutputWithContext(ctx context.Context) HyperVReplicationPolicyOutput {
	return o
}

// Specifies the frequency at which to create application consistent recovery points.
func (o HyperVReplicationPolicyOutput) ApplicationConsistentSnapshotFrequencyInHours() pulumi.IntOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicy) pulumi.IntOutput {
		return v.ApplicationConsistentSnapshotFrequencyInHours
	}).(pulumi.IntOutput)
}

// The name of the replication policy. Changing this forces a new resource to be created.
func (o HyperVReplicationPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The duration in hours for which the recovery points need to be stored.
func (o HyperVReplicationPolicyOutput) RecoveryPointRetentionInHours() pulumi.IntOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicy) pulumi.IntOutput { return v.RecoveryPointRetentionInHours }).(pulumi.IntOutput)
}

// The id of the vault that should be updated. Changing this forces a new resource to be created.
func (o HyperVReplicationPolicyOutput) RecoveryVaultId() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicy) pulumi.StringOutput { return v.RecoveryVaultId }).(pulumi.StringOutput)
}

// Specifies how frequently data should be synchronized between source and target locations. Possible values are `30` and `300`.
func (o HyperVReplicationPolicyOutput) ReplicationIntervalInSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *HyperVReplicationPolicy) pulumi.IntOutput { return v.ReplicationIntervalInSeconds }).(pulumi.IntOutput)
}

type HyperVReplicationPolicyArrayOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperVReplicationPolicy)(nil)).Elem()
}

func (o HyperVReplicationPolicyArrayOutput) ToHyperVReplicationPolicyArrayOutput() HyperVReplicationPolicyArrayOutput {
	return o
}

func (o HyperVReplicationPolicyArrayOutput) ToHyperVReplicationPolicyArrayOutputWithContext(ctx context.Context) HyperVReplicationPolicyArrayOutput {
	return o
}

func (o HyperVReplicationPolicyArrayOutput) Index(i pulumi.IntInput) HyperVReplicationPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HyperVReplicationPolicy {
		return vs[0].([]*HyperVReplicationPolicy)[vs[1].(int)]
	}).(HyperVReplicationPolicyOutput)
}

type HyperVReplicationPolicyMapOutput struct{ *pulumi.OutputState }

func (HyperVReplicationPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperVReplicationPolicy)(nil)).Elem()
}

func (o HyperVReplicationPolicyMapOutput) ToHyperVReplicationPolicyMapOutput() HyperVReplicationPolicyMapOutput {
	return o
}

func (o HyperVReplicationPolicyMapOutput) ToHyperVReplicationPolicyMapOutputWithContext(ctx context.Context) HyperVReplicationPolicyMapOutput {
	return o
}

func (o HyperVReplicationPolicyMapOutput) MapIndex(k pulumi.StringInput) HyperVReplicationPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HyperVReplicationPolicy {
		return vs[0].(map[string]*HyperVReplicationPolicy)[vs[1].(string)]
	}).(HyperVReplicationPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyInput)(nil)).Elem(), &HyperVReplicationPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyArrayInput)(nil)).Elem(), HyperVReplicationPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperVReplicationPolicyMapInput)(nil)).Elem(), HyperVReplicationPolicyMap{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyOutput{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyArrayOutput{})
	pulumi.RegisterOutputType(HyperVReplicationPolicyMapOutput{})
}
