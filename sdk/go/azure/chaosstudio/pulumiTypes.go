// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chaosstudio

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type ExperimentIdentity struct {
	// A list of User Managed Identity IDs which should be assigned to the Policy Definition.
	//
	// > **Note:** This is required when `type` is set to `UserAssigned`.
	IdentityIds []string `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId *string `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId *string `pulumi:"tenantId"`
	// The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
	Type string `pulumi:"type"`
}

// ExperimentIdentityInput is an input type that accepts ExperimentIdentityArgs and ExperimentIdentityOutput values.
// You can construct a concrete instance of `ExperimentIdentityInput` via:
//
//	ExperimentIdentityArgs{...}
type ExperimentIdentityInput interface {
	pulumi.Input

	ToExperimentIdentityOutput() ExperimentIdentityOutput
	ToExperimentIdentityOutputWithContext(context.Context) ExperimentIdentityOutput
}

type ExperimentIdentityArgs struct {
	// A list of User Managed Identity IDs which should be assigned to the Policy Definition.
	//
	// > **Note:** This is required when `type` is set to `UserAssigned`.
	IdentityIds pulumi.StringArrayInput `pulumi:"identityIds"`
	// The Principal ID associated with this Managed Service Identity.
	PrincipalId pulumi.StringPtrInput `pulumi:"principalId"`
	// The Tenant ID associated with this Managed Service Identity.
	TenantId pulumi.StringPtrInput `pulumi:"tenantId"`
	// The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
	Type pulumi.StringInput `pulumi:"type"`
}

func (ExperimentIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentIdentity)(nil)).Elem()
}

func (i ExperimentIdentityArgs) ToExperimentIdentityOutput() ExperimentIdentityOutput {
	return i.ToExperimentIdentityOutputWithContext(context.Background())
}

func (i ExperimentIdentityArgs) ToExperimentIdentityOutputWithContext(ctx context.Context) ExperimentIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentIdentityOutput)
}

func (i ExperimentIdentityArgs) ToExperimentIdentityPtrOutput() ExperimentIdentityPtrOutput {
	return i.ToExperimentIdentityPtrOutputWithContext(context.Background())
}

func (i ExperimentIdentityArgs) ToExperimentIdentityPtrOutputWithContext(ctx context.Context) ExperimentIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentIdentityOutput).ToExperimentIdentityPtrOutputWithContext(ctx)
}

// ExperimentIdentityPtrInput is an input type that accepts ExperimentIdentityArgs, ExperimentIdentityPtr and ExperimentIdentityPtrOutput values.
// You can construct a concrete instance of `ExperimentIdentityPtrInput` via:
//
//	        ExperimentIdentityArgs{...}
//
//	or:
//
//	        nil
type ExperimentIdentityPtrInput interface {
	pulumi.Input

	ToExperimentIdentityPtrOutput() ExperimentIdentityPtrOutput
	ToExperimentIdentityPtrOutputWithContext(context.Context) ExperimentIdentityPtrOutput
}

type experimentIdentityPtrType ExperimentIdentityArgs

func ExperimentIdentityPtr(v *ExperimentIdentityArgs) ExperimentIdentityPtrInput {
	return (*experimentIdentityPtrType)(v)
}

func (*experimentIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ExperimentIdentity)(nil)).Elem()
}

func (i *experimentIdentityPtrType) ToExperimentIdentityPtrOutput() ExperimentIdentityPtrOutput {
	return i.ToExperimentIdentityPtrOutputWithContext(context.Background())
}

func (i *experimentIdentityPtrType) ToExperimentIdentityPtrOutputWithContext(ctx context.Context) ExperimentIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentIdentityPtrOutput)
}

type ExperimentIdentityOutput struct{ *pulumi.OutputState }

func (ExperimentIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentIdentity)(nil)).Elem()
}

func (o ExperimentIdentityOutput) ToExperimentIdentityOutput() ExperimentIdentityOutput {
	return o
}

func (o ExperimentIdentityOutput) ToExperimentIdentityOutputWithContext(ctx context.Context) ExperimentIdentityOutput {
	return o
}

func (o ExperimentIdentityOutput) ToExperimentIdentityPtrOutput() ExperimentIdentityPtrOutput {
	return o.ToExperimentIdentityPtrOutputWithContext(context.Background())
}

func (o ExperimentIdentityOutput) ToExperimentIdentityPtrOutputWithContext(ctx context.Context) ExperimentIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ExperimentIdentity) *ExperimentIdentity {
		return &v
	}).(ExperimentIdentityPtrOutput)
}

// A list of User Managed Identity IDs which should be assigned to the Policy Definition.
//
// > **Note:** This is required when `type` is set to `UserAssigned`.
func (o ExperimentIdentityOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ExperimentIdentity) []string { return v.IdentityIds }).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o ExperimentIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ExperimentIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o ExperimentIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ExperimentIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

// The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
func (o ExperimentIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v ExperimentIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type ExperimentIdentityPtrOutput struct{ *pulumi.OutputState }

func (ExperimentIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExperimentIdentity)(nil)).Elem()
}

func (o ExperimentIdentityPtrOutput) ToExperimentIdentityPtrOutput() ExperimentIdentityPtrOutput {
	return o
}

func (o ExperimentIdentityPtrOutput) ToExperimentIdentityPtrOutputWithContext(ctx context.Context) ExperimentIdentityPtrOutput {
	return o
}

func (o ExperimentIdentityPtrOutput) Elem() ExperimentIdentityOutput {
	return o.ApplyT(func(v *ExperimentIdentity) ExperimentIdentity {
		if v != nil {
			return *v
		}
		var ret ExperimentIdentity
		return ret
	}).(ExperimentIdentityOutput)
}

// A list of User Managed Identity IDs which should be assigned to the Policy Definition.
//
// > **Note:** This is required when `type` is set to `UserAssigned`.
func (o ExperimentIdentityPtrOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExperimentIdentity) []string {
		if v == nil {
			return nil
		}
		return v.IdentityIds
	}).(pulumi.StringArrayOutput)
}

// The Principal ID associated with this Managed Service Identity.
func (o ExperimentIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExperimentIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

// The Tenant ID associated with this Managed Service Identity.
func (o ExperimentIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExperimentIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

// The Type of Managed Identity which should be added to this Policy Definition. Possible values are `SystemAssigned` and `UserAssigned`.
func (o ExperimentIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExperimentIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

type ExperimentSelector struct {
	// A list of Chaos Studio Target IDs that should be part of this Selector.
	ChaosStudioTargetIds []string `pulumi:"chaosStudioTargetIds"`
	// The name of this Selector.
	Name string `pulumi:"name"`
}

// ExperimentSelectorInput is an input type that accepts ExperimentSelectorArgs and ExperimentSelectorOutput values.
// You can construct a concrete instance of `ExperimentSelectorInput` via:
//
//	ExperimentSelectorArgs{...}
type ExperimentSelectorInput interface {
	pulumi.Input

	ToExperimentSelectorOutput() ExperimentSelectorOutput
	ToExperimentSelectorOutputWithContext(context.Context) ExperimentSelectorOutput
}

type ExperimentSelectorArgs struct {
	// A list of Chaos Studio Target IDs that should be part of this Selector.
	ChaosStudioTargetIds pulumi.StringArrayInput `pulumi:"chaosStudioTargetIds"`
	// The name of this Selector.
	Name pulumi.StringInput `pulumi:"name"`
}

func (ExperimentSelectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentSelector)(nil)).Elem()
}

func (i ExperimentSelectorArgs) ToExperimentSelectorOutput() ExperimentSelectorOutput {
	return i.ToExperimentSelectorOutputWithContext(context.Background())
}

func (i ExperimentSelectorArgs) ToExperimentSelectorOutputWithContext(ctx context.Context) ExperimentSelectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentSelectorOutput)
}

// ExperimentSelectorArrayInput is an input type that accepts ExperimentSelectorArray and ExperimentSelectorArrayOutput values.
// You can construct a concrete instance of `ExperimentSelectorArrayInput` via:
//
//	ExperimentSelectorArray{ ExperimentSelectorArgs{...} }
type ExperimentSelectorArrayInput interface {
	pulumi.Input

	ToExperimentSelectorArrayOutput() ExperimentSelectorArrayOutput
	ToExperimentSelectorArrayOutputWithContext(context.Context) ExperimentSelectorArrayOutput
}

type ExperimentSelectorArray []ExperimentSelectorInput

func (ExperimentSelectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentSelector)(nil)).Elem()
}

func (i ExperimentSelectorArray) ToExperimentSelectorArrayOutput() ExperimentSelectorArrayOutput {
	return i.ToExperimentSelectorArrayOutputWithContext(context.Background())
}

func (i ExperimentSelectorArray) ToExperimentSelectorArrayOutputWithContext(ctx context.Context) ExperimentSelectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentSelectorArrayOutput)
}

type ExperimentSelectorOutput struct{ *pulumi.OutputState }

func (ExperimentSelectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentSelector)(nil)).Elem()
}

func (o ExperimentSelectorOutput) ToExperimentSelectorOutput() ExperimentSelectorOutput {
	return o
}

func (o ExperimentSelectorOutput) ToExperimentSelectorOutputWithContext(ctx context.Context) ExperimentSelectorOutput {
	return o
}

// A list of Chaos Studio Target IDs that should be part of this Selector.
func (o ExperimentSelectorOutput) ChaosStudioTargetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ExperimentSelector) []string { return v.ChaosStudioTargetIds }).(pulumi.StringArrayOutput)
}

// The name of this Selector.
func (o ExperimentSelectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ExperimentSelector) string { return v.Name }).(pulumi.StringOutput)
}

type ExperimentSelectorArrayOutput struct{ *pulumi.OutputState }

func (ExperimentSelectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentSelector)(nil)).Elem()
}

func (o ExperimentSelectorArrayOutput) ToExperimentSelectorArrayOutput() ExperimentSelectorArrayOutput {
	return o
}

func (o ExperimentSelectorArrayOutput) ToExperimentSelectorArrayOutputWithContext(ctx context.Context) ExperimentSelectorArrayOutput {
	return o
}

func (o ExperimentSelectorArrayOutput) Index(i pulumi.IntInput) ExperimentSelectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExperimentSelector {
		return vs[0].([]ExperimentSelector)[vs[1].(int)]
	}).(ExperimentSelectorOutput)
}

type ExperimentStep struct {
	// One or more `branch` blocks as defined above.
	Branches []ExperimentStepBranch `pulumi:"branches"`
	// The name of the Step.
	Name string `pulumi:"name"`
}

// ExperimentStepInput is an input type that accepts ExperimentStepArgs and ExperimentStepOutput values.
// You can construct a concrete instance of `ExperimentStepInput` via:
//
//	ExperimentStepArgs{...}
type ExperimentStepInput interface {
	pulumi.Input

	ToExperimentStepOutput() ExperimentStepOutput
	ToExperimentStepOutputWithContext(context.Context) ExperimentStepOutput
}

type ExperimentStepArgs struct {
	// One or more `branch` blocks as defined above.
	Branches ExperimentStepBranchArrayInput `pulumi:"branches"`
	// The name of the Step.
	Name pulumi.StringInput `pulumi:"name"`
}

func (ExperimentStepArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStep)(nil)).Elem()
}

func (i ExperimentStepArgs) ToExperimentStepOutput() ExperimentStepOutput {
	return i.ToExperimentStepOutputWithContext(context.Background())
}

func (i ExperimentStepArgs) ToExperimentStepOutputWithContext(ctx context.Context) ExperimentStepOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepOutput)
}

// ExperimentStepArrayInput is an input type that accepts ExperimentStepArray and ExperimentStepArrayOutput values.
// You can construct a concrete instance of `ExperimentStepArrayInput` via:
//
//	ExperimentStepArray{ ExperimentStepArgs{...} }
type ExperimentStepArrayInput interface {
	pulumi.Input

	ToExperimentStepArrayOutput() ExperimentStepArrayOutput
	ToExperimentStepArrayOutputWithContext(context.Context) ExperimentStepArrayOutput
}

type ExperimentStepArray []ExperimentStepInput

func (ExperimentStepArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStep)(nil)).Elem()
}

func (i ExperimentStepArray) ToExperimentStepArrayOutput() ExperimentStepArrayOutput {
	return i.ToExperimentStepArrayOutputWithContext(context.Background())
}

func (i ExperimentStepArray) ToExperimentStepArrayOutputWithContext(ctx context.Context) ExperimentStepArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepArrayOutput)
}

type ExperimentStepOutput struct{ *pulumi.OutputState }

func (ExperimentStepOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStep)(nil)).Elem()
}

func (o ExperimentStepOutput) ToExperimentStepOutput() ExperimentStepOutput {
	return o
}

func (o ExperimentStepOutput) ToExperimentStepOutputWithContext(ctx context.Context) ExperimentStepOutput {
	return o
}

// One or more `branch` blocks as defined above.
func (o ExperimentStepOutput) Branches() ExperimentStepBranchArrayOutput {
	return o.ApplyT(func(v ExperimentStep) []ExperimentStepBranch { return v.Branches }).(ExperimentStepBranchArrayOutput)
}

// The name of the Step.
func (o ExperimentStepOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ExperimentStep) string { return v.Name }).(pulumi.StringOutput)
}

type ExperimentStepArrayOutput struct{ *pulumi.OutputState }

func (ExperimentStepArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStep)(nil)).Elem()
}

func (o ExperimentStepArrayOutput) ToExperimentStepArrayOutput() ExperimentStepArrayOutput {
	return o
}

func (o ExperimentStepArrayOutput) ToExperimentStepArrayOutputWithContext(ctx context.Context) ExperimentStepArrayOutput {
	return o
}

func (o ExperimentStepArrayOutput) Index(i pulumi.IntInput) ExperimentStepOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExperimentStep {
		return vs[0].([]ExperimentStep)[vs[1].(int)]
	}).(ExperimentStepOutput)
}

type ExperimentStepBranch struct {
	// One or more `actions` blocks as defined above.
	Actions []ExperimentStepBranchAction `pulumi:"actions"`
	// The name of the branch.
	Name string `pulumi:"name"`
}

// ExperimentStepBranchInput is an input type that accepts ExperimentStepBranchArgs and ExperimentStepBranchOutput values.
// You can construct a concrete instance of `ExperimentStepBranchInput` via:
//
//	ExperimentStepBranchArgs{...}
type ExperimentStepBranchInput interface {
	pulumi.Input

	ToExperimentStepBranchOutput() ExperimentStepBranchOutput
	ToExperimentStepBranchOutputWithContext(context.Context) ExperimentStepBranchOutput
}

type ExperimentStepBranchArgs struct {
	// One or more `actions` blocks as defined above.
	Actions ExperimentStepBranchActionArrayInput `pulumi:"actions"`
	// The name of the branch.
	Name pulumi.StringInput `pulumi:"name"`
}

func (ExperimentStepBranchArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStepBranch)(nil)).Elem()
}

func (i ExperimentStepBranchArgs) ToExperimentStepBranchOutput() ExperimentStepBranchOutput {
	return i.ToExperimentStepBranchOutputWithContext(context.Background())
}

func (i ExperimentStepBranchArgs) ToExperimentStepBranchOutputWithContext(ctx context.Context) ExperimentStepBranchOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepBranchOutput)
}

// ExperimentStepBranchArrayInput is an input type that accepts ExperimentStepBranchArray and ExperimentStepBranchArrayOutput values.
// You can construct a concrete instance of `ExperimentStepBranchArrayInput` via:
//
//	ExperimentStepBranchArray{ ExperimentStepBranchArgs{...} }
type ExperimentStepBranchArrayInput interface {
	pulumi.Input

	ToExperimentStepBranchArrayOutput() ExperimentStepBranchArrayOutput
	ToExperimentStepBranchArrayOutputWithContext(context.Context) ExperimentStepBranchArrayOutput
}

type ExperimentStepBranchArray []ExperimentStepBranchInput

func (ExperimentStepBranchArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStepBranch)(nil)).Elem()
}

func (i ExperimentStepBranchArray) ToExperimentStepBranchArrayOutput() ExperimentStepBranchArrayOutput {
	return i.ToExperimentStepBranchArrayOutputWithContext(context.Background())
}

func (i ExperimentStepBranchArray) ToExperimentStepBranchArrayOutputWithContext(ctx context.Context) ExperimentStepBranchArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepBranchArrayOutput)
}

type ExperimentStepBranchOutput struct{ *pulumi.OutputState }

func (ExperimentStepBranchOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStepBranch)(nil)).Elem()
}

func (o ExperimentStepBranchOutput) ToExperimentStepBranchOutput() ExperimentStepBranchOutput {
	return o
}

func (o ExperimentStepBranchOutput) ToExperimentStepBranchOutputWithContext(ctx context.Context) ExperimentStepBranchOutput {
	return o
}

// One or more `actions` blocks as defined above.
func (o ExperimentStepBranchOutput) Actions() ExperimentStepBranchActionArrayOutput {
	return o.ApplyT(func(v ExperimentStepBranch) []ExperimentStepBranchAction { return v.Actions }).(ExperimentStepBranchActionArrayOutput)
}

// The name of the branch.
func (o ExperimentStepBranchOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ExperimentStepBranch) string { return v.Name }).(pulumi.StringOutput)
}

type ExperimentStepBranchArrayOutput struct{ *pulumi.OutputState }

func (ExperimentStepBranchArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStepBranch)(nil)).Elem()
}

func (o ExperimentStepBranchArrayOutput) ToExperimentStepBranchArrayOutput() ExperimentStepBranchArrayOutput {
	return o
}

func (o ExperimentStepBranchArrayOutput) ToExperimentStepBranchArrayOutputWithContext(ctx context.Context) ExperimentStepBranchArrayOutput {
	return o
}

func (o ExperimentStepBranchArrayOutput) Index(i pulumi.IntInput) ExperimentStepBranchOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExperimentStepBranch {
		return vs[0].([]ExperimentStepBranch)[vs[1].(int)]
	}).(ExperimentStepBranchOutput)
}

type ExperimentStepBranchAction struct {
	// The type of action that should be added to the experiment. Possible values are `continuous`, `delay` and `discrete`.
	ActionType string `pulumi:"actionType"`
	// An ISO8601 formatted string specifying the duration for a `delay` or `continuous` action.
	Duration *string `pulumi:"duration"`
	// A key-value map of additional parameters to configure the action. The values that are accepted by this depend on the `urn` i.e. the capability/fault that is applied. Possible parameter values can be found in this [documentation](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-library)
	Parameters map[string]string `pulumi:"parameters"`
	// The name of the Selector to which this action should apply to. This must be specified if the `actionType` is `continuous` or `discrete`.
	SelectorName *string `pulumi:"selectorName"`
	// The Unique Resource Name of the action, this value is provided by the `chaosstudio.Capability` resource e.g. `azurerm_chaos_studio_capability.example.urn`. This must be specified if the `actionType` is `continuous` or `discrete`.
	Urn *string `pulumi:"urn"`
}

// ExperimentStepBranchActionInput is an input type that accepts ExperimentStepBranchActionArgs and ExperimentStepBranchActionOutput values.
// You can construct a concrete instance of `ExperimentStepBranchActionInput` via:
//
//	ExperimentStepBranchActionArgs{...}
type ExperimentStepBranchActionInput interface {
	pulumi.Input

	ToExperimentStepBranchActionOutput() ExperimentStepBranchActionOutput
	ToExperimentStepBranchActionOutputWithContext(context.Context) ExperimentStepBranchActionOutput
}

type ExperimentStepBranchActionArgs struct {
	// The type of action that should be added to the experiment. Possible values are `continuous`, `delay` and `discrete`.
	ActionType pulumi.StringInput `pulumi:"actionType"`
	// An ISO8601 formatted string specifying the duration for a `delay` or `continuous` action.
	Duration pulumi.StringPtrInput `pulumi:"duration"`
	// A key-value map of additional parameters to configure the action. The values that are accepted by this depend on the `urn` i.e. the capability/fault that is applied. Possible parameter values can be found in this [documentation](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-library)
	Parameters pulumi.StringMapInput `pulumi:"parameters"`
	// The name of the Selector to which this action should apply to. This must be specified if the `actionType` is `continuous` or `discrete`.
	SelectorName pulumi.StringPtrInput `pulumi:"selectorName"`
	// The Unique Resource Name of the action, this value is provided by the `chaosstudio.Capability` resource e.g. `azurerm_chaos_studio_capability.example.urn`. This must be specified if the `actionType` is `continuous` or `discrete`.
	Urn pulumi.StringPtrInput `pulumi:"urn"`
}

func (ExperimentStepBranchActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStepBranchAction)(nil)).Elem()
}

func (i ExperimentStepBranchActionArgs) ToExperimentStepBranchActionOutput() ExperimentStepBranchActionOutput {
	return i.ToExperimentStepBranchActionOutputWithContext(context.Background())
}

func (i ExperimentStepBranchActionArgs) ToExperimentStepBranchActionOutputWithContext(ctx context.Context) ExperimentStepBranchActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepBranchActionOutput)
}

// ExperimentStepBranchActionArrayInput is an input type that accepts ExperimentStepBranchActionArray and ExperimentStepBranchActionArrayOutput values.
// You can construct a concrete instance of `ExperimentStepBranchActionArrayInput` via:
//
//	ExperimentStepBranchActionArray{ ExperimentStepBranchActionArgs{...} }
type ExperimentStepBranchActionArrayInput interface {
	pulumi.Input

	ToExperimentStepBranchActionArrayOutput() ExperimentStepBranchActionArrayOutput
	ToExperimentStepBranchActionArrayOutputWithContext(context.Context) ExperimentStepBranchActionArrayOutput
}

type ExperimentStepBranchActionArray []ExperimentStepBranchActionInput

func (ExperimentStepBranchActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStepBranchAction)(nil)).Elem()
}

func (i ExperimentStepBranchActionArray) ToExperimentStepBranchActionArrayOutput() ExperimentStepBranchActionArrayOutput {
	return i.ToExperimentStepBranchActionArrayOutputWithContext(context.Background())
}

func (i ExperimentStepBranchActionArray) ToExperimentStepBranchActionArrayOutputWithContext(ctx context.Context) ExperimentStepBranchActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExperimentStepBranchActionArrayOutput)
}

type ExperimentStepBranchActionOutput struct{ *pulumi.OutputState }

func (ExperimentStepBranchActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ExperimentStepBranchAction)(nil)).Elem()
}

func (o ExperimentStepBranchActionOutput) ToExperimentStepBranchActionOutput() ExperimentStepBranchActionOutput {
	return o
}

func (o ExperimentStepBranchActionOutput) ToExperimentStepBranchActionOutputWithContext(ctx context.Context) ExperimentStepBranchActionOutput {
	return o
}

// The type of action that should be added to the experiment. Possible values are `continuous`, `delay` and `discrete`.
func (o ExperimentStepBranchActionOutput) ActionType() pulumi.StringOutput {
	return o.ApplyT(func(v ExperimentStepBranchAction) string { return v.ActionType }).(pulumi.StringOutput)
}

// An ISO8601 formatted string specifying the duration for a `delay` or `continuous` action.
func (o ExperimentStepBranchActionOutput) Duration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ExperimentStepBranchAction) *string { return v.Duration }).(pulumi.StringPtrOutput)
}

// A key-value map of additional parameters to configure the action. The values that are accepted by this depend on the `urn` i.e. the capability/fault that is applied. Possible parameter values can be found in this [documentation](https://learn.microsoft.com/azure/chaos-studio/chaos-studio-fault-library)
func (o ExperimentStepBranchActionOutput) Parameters() pulumi.StringMapOutput {
	return o.ApplyT(func(v ExperimentStepBranchAction) map[string]string { return v.Parameters }).(pulumi.StringMapOutput)
}

// The name of the Selector to which this action should apply to. This must be specified if the `actionType` is `continuous` or `discrete`.
func (o ExperimentStepBranchActionOutput) SelectorName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ExperimentStepBranchAction) *string { return v.SelectorName }).(pulumi.StringPtrOutput)
}

// The Unique Resource Name of the action, this value is provided by the `chaosstudio.Capability` resource e.g. `azurerm_chaos_studio_capability.example.urn`. This must be specified if the `actionType` is `continuous` or `discrete`.
func (o ExperimentStepBranchActionOutput) Urn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ExperimentStepBranchAction) *string { return v.Urn }).(pulumi.StringPtrOutput)
}

type ExperimentStepBranchActionArrayOutput struct{ *pulumi.OutputState }

func (ExperimentStepBranchActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ExperimentStepBranchAction)(nil)).Elem()
}

func (o ExperimentStepBranchActionArrayOutput) ToExperimentStepBranchActionArrayOutput() ExperimentStepBranchActionArrayOutput {
	return o
}

func (o ExperimentStepBranchActionArrayOutput) ToExperimentStepBranchActionArrayOutputWithContext(ctx context.Context) ExperimentStepBranchActionArrayOutput {
	return o
}

func (o ExperimentStepBranchActionArrayOutput) Index(i pulumi.IntInput) ExperimentStepBranchActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ExperimentStepBranchAction {
		return vs[0].([]ExperimentStepBranchAction)[vs[1].(int)]
	}).(ExperimentStepBranchActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentIdentityInput)(nil)).Elem(), ExperimentIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentIdentityPtrInput)(nil)).Elem(), ExperimentIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentSelectorInput)(nil)).Elem(), ExperimentSelectorArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentSelectorArrayInput)(nil)).Elem(), ExperimentSelectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepInput)(nil)).Elem(), ExperimentStepArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepArrayInput)(nil)).Elem(), ExperimentStepArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepBranchInput)(nil)).Elem(), ExperimentStepBranchArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepBranchArrayInput)(nil)).Elem(), ExperimentStepBranchArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepBranchActionInput)(nil)).Elem(), ExperimentStepBranchActionArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExperimentStepBranchActionArrayInput)(nil)).Elem(), ExperimentStepBranchActionArray{})
	pulumi.RegisterOutputType(ExperimentIdentityOutput{})
	pulumi.RegisterOutputType(ExperimentIdentityPtrOutput{})
	pulumi.RegisterOutputType(ExperimentSelectorOutput{})
	pulumi.RegisterOutputType(ExperimentSelectorArrayOutput{})
	pulumi.RegisterOutputType(ExperimentStepOutput{})
	pulumi.RegisterOutputType(ExperimentStepArrayOutput{})
	pulumi.RegisterOutputType(ExperimentStepBranchOutput{})
	pulumi.RegisterOutputType(ExperimentStepBranchArrayOutput{})
	pulumi.RegisterOutputType(ExperimentStepBranchActionOutput{})
	pulumi.RegisterOutputType(ExperimentStepBranchActionArrayOutput{})
}
