// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package management

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Management Group Policy Remediation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/management"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/policy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleGroup, err := management.NewGroup(ctx, "example", &management.GroupArgs{
//				DisplayName: pulumi.String("Example Management Group"),
//			})
//			if err != nil {
//				return err
//			}
//			example, err := policy.GetPolicyDefintion(ctx, &policy.GetPolicyDefintionArgs{
//				DisplayName: pulumi.StringRef("Allowed locations"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"listOfAllowedLocations": map[string]interface{}{
//					"value": []string{
//						"East US",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			exampleGroupPolicyAssignment, err := management.NewGroupPolicyAssignment(ctx, "example", &management.GroupPolicyAssignmentArgs{
//				Name:               pulumi.String("exampleAssignment"),
//				ManagementGroupId:  exampleGroup.ID(),
//				PolicyDefinitionId: pulumi.String(example.Id),
//				Parameters:         pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = management.NewGroupPolicyRemediation(ctx, "example", &management.GroupPolicyRemediationArgs{
//				Name:               pulumi.String("example"),
//				ManagementGroupId:  exampleGroup.ID(),
//				PolicyAssignmentId: exampleGroupPolicyAssignment.ID(),
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
// * `Microsoft.Management`: 2021-10-01
//
// ## Import
//
// Policy Remediations can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:management/groupPolicyRemediation:GroupPolicyRemediation example /providers/Microsoft.Management/managementGroups/my-mgmt-group-id/providers/Microsoft.PolicyInsights/remediations/remediation1
// ```
type GroupPolicyRemediation struct {
	pulumi.CustomResourceState

	// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
	FailurePercentage pulumi.Float64PtrOutput `pulumi:"failurePercentage"`
	// A list of the resource locations that will be remediated.
	LocationFilters pulumi.StringArrayOutput `pulumi:"locationFilters"`
	// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringOutput `pulumi:"managementGroupId"`
	// The name of the Policy Remediation. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
	ParallelDeployments pulumi.IntPtrOutput `pulumi:"parallelDeployments"`
	// The ID of the Policy Assignment that should be remediated.
	PolicyAssignmentId pulumi.StringOutput `pulumi:"policyAssignmentId"`
	// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
	PolicyDefinitionReferenceId pulumi.StringPtrOutput `pulumi:"policyDefinitionReferenceId"`
	// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
	ResourceCount pulumi.IntPtrOutput `pulumi:"resourceCount"`
}

// NewGroupPolicyRemediation registers a new resource with the given unique name, arguments, and options.
func NewGroupPolicyRemediation(ctx *pulumi.Context,
	name string, args *GroupPolicyRemediationArgs, opts ...pulumi.ResourceOption) (*GroupPolicyRemediation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ManagementGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ManagementGroupId'")
	}
	if args.PolicyAssignmentId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyAssignmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GroupPolicyRemediation
	err := ctx.RegisterResource("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupPolicyRemediation gets an existing GroupPolicyRemediation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupPolicyRemediation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupPolicyRemediationState, opts ...pulumi.ResourceOption) (*GroupPolicyRemediation, error) {
	var resource GroupPolicyRemediation
	err := ctx.ReadResource("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupPolicyRemediation resources.
type groupPolicyRemediationState struct {
	// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
	FailurePercentage *float64 `pulumi:"failurePercentage"`
	// A list of the resource locations that will be remediated.
	LocationFilters []string `pulumi:"locationFilters"`
	// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
	ManagementGroupId *string `pulumi:"managementGroupId"`
	// The name of the Policy Remediation. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
	ParallelDeployments *int `pulumi:"parallelDeployments"`
	// The ID of the Policy Assignment that should be remediated.
	PolicyAssignmentId *string `pulumi:"policyAssignmentId"`
	// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
	PolicyDefinitionReferenceId *string `pulumi:"policyDefinitionReferenceId"`
	// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
	ResourceCount *int `pulumi:"resourceCount"`
}

type GroupPolicyRemediationState struct {
	// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
	FailurePercentage pulumi.Float64PtrInput
	// A list of the resource locations that will be remediated.
	LocationFilters pulumi.StringArrayInput
	// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringPtrInput
	// The name of the Policy Remediation. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
	ParallelDeployments pulumi.IntPtrInput
	// The ID of the Policy Assignment that should be remediated.
	PolicyAssignmentId pulumi.StringPtrInput
	// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
	PolicyDefinitionReferenceId pulumi.StringPtrInput
	// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
	ResourceCount pulumi.IntPtrInput
}

func (GroupPolicyRemediationState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyRemediationState)(nil)).Elem()
}

type groupPolicyRemediationArgs struct {
	// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
	FailurePercentage *float64 `pulumi:"failurePercentage"`
	// A list of the resource locations that will be remediated.
	LocationFilters []string `pulumi:"locationFilters"`
	// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
	ManagementGroupId string `pulumi:"managementGroupId"`
	// The name of the Policy Remediation. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
	ParallelDeployments *int `pulumi:"parallelDeployments"`
	// The ID of the Policy Assignment that should be remediated.
	PolicyAssignmentId string `pulumi:"policyAssignmentId"`
	// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
	PolicyDefinitionReferenceId *string `pulumi:"policyDefinitionReferenceId"`
	// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
	ResourceCount *int `pulumi:"resourceCount"`
}

// The set of arguments for constructing a GroupPolicyRemediation resource.
type GroupPolicyRemediationArgs struct {
	// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
	FailurePercentage pulumi.Float64PtrInput
	// A list of the resource locations that will be remediated.
	LocationFilters pulumi.StringArrayInput
	// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringInput
	// The name of the Policy Remediation. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
	ParallelDeployments pulumi.IntPtrInput
	// The ID of the Policy Assignment that should be remediated.
	PolicyAssignmentId pulumi.StringInput
	// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
	PolicyDefinitionReferenceId pulumi.StringPtrInput
	// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
	ResourceCount pulumi.IntPtrInput
}

func (GroupPolicyRemediationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupPolicyRemediationArgs)(nil)).Elem()
}

type GroupPolicyRemediationInput interface {
	pulumi.Input

	ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput
	ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput
}

func (*GroupPolicyRemediation) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicyRemediation)(nil)).Elem()
}

func (i *GroupPolicyRemediation) ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput {
	return i.ToGroupPolicyRemediationOutputWithContext(context.Background())
}

func (i *GroupPolicyRemediation) ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationOutput)
}

// GroupPolicyRemediationArrayInput is an input type that accepts GroupPolicyRemediationArray and GroupPolicyRemediationArrayOutput values.
// You can construct a concrete instance of `GroupPolicyRemediationArrayInput` via:
//
//	GroupPolicyRemediationArray{ GroupPolicyRemediationArgs{...} }
type GroupPolicyRemediationArrayInput interface {
	pulumi.Input

	ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput
	ToGroupPolicyRemediationArrayOutputWithContext(context.Context) GroupPolicyRemediationArrayOutput
}

type GroupPolicyRemediationArray []GroupPolicyRemediationInput

func (GroupPolicyRemediationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicyRemediation)(nil)).Elem()
}

func (i GroupPolicyRemediationArray) ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput {
	return i.ToGroupPolicyRemediationArrayOutputWithContext(context.Background())
}

func (i GroupPolicyRemediationArray) ToGroupPolicyRemediationArrayOutputWithContext(ctx context.Context) GroupPolicyRemediationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationArrayOutput)
}

// GroupPolicyRemediationMapInput is an input type that accepts GroupPolicyRemediationMap and GroupPolicyRemediationMapOutput values.
// You can construct a concrete instance of `GroupPolicyRemediationMapInput` via:
//
//	GroupPolicyRemediationMap{ "key": GroupPolicyRemediationArgs{...} }
type GroupPolicyRemediationMapInput interface {
	pulumi.Input

	ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput
	ToGroupPolicyRemediationMapOutputWithContext(context.Context) GroupPolicyRemediationMapOutput
}

type GroupPolicyRemediationMap map[string]GroupPolicyRemediationInput

func (GroupPolicyRemediationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicyRemediation)(nil)).Elem()
}

func (i GroupPolicyRemediationMap) ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput {
	return i.ToGroupPolicyRemediationMapOutputWithContext(context.Background())
}

func (i GroupPolicyRemediationMap) ToGroupPolicyRemediationMapOutputWithContext(ctx context.Context) GroupPolicyRemediationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupPolicyRemediationMapOutput)
}

type GroupPolicyRemediationOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationOutput) ToGroupPolicyRemediationOutput() GroupPolicyRemediationOutput {
	return o
}

func (o GroupPolicyRemediationOutput) ToGroupPolicyRemediationOutputWithContext(ctx context.Context) GroupPolicyRemediationOutput {
	return o
}

// A number between 0.0 to 1.0 representing the percentage failure threshold. The remediation will fail if the percentage of failed remediation operations (i.e. failed deployments) exceeds this threshold.
func (o GroupPolicyRemediationOutput) FailurePercentage() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.Float64PtrOutput { return v.FailurePercentage }).(pulumi.Float64PtrOutput)
}

// A list of the resource locations that will be remediated.
func (o GroupPolicyRemediationOutput) LocationFilters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringArrayOutput { return v.LocationFilters }).(pulumi.StringArrayOutput)
}

// The Management Group ID at which the Policy Remediation should be applied. Changing this forces a new resource to be created.
func (o GroupPolicyRemediationOutput) ManagementGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.ManagementGroupId }).(pulumi.StringOutput)
}

// The name of the Policy Remediation. Changing this forces a new resource to be created.
func (o GroupPolicyRemediationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Determines how many resources to remediate at any given time. Can be used to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is used.
func (o GroupPolicyRemediationOutput) ParallelDeployments() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.IntPtrOutput { return v.ParallelDeployments }).(pulumi.IntPtrOutput)
}

// The ID of the Policy Assignment that should be remediated.
func (o GroupPolicyRemediationOutput) PolicyAssignmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringOutput { return v.PolicyAssignmentId }).(pulumi.StringOutput)
}

// The unique ID for the policy definition reference within the policy set definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
func (o GroupPolicyRemediationOutput) PolicyDefinitionReferenceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.StringPtrOutput { return v.PolicyDefinitionReferenceId }).(pulumi.StringPtrOutput)
}

// Determines the max number of resources that can be remediated by the remediation job. If not provided, the default resource count is used.
func (o GroupPolicyRemediationOutput) ResourceCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *GroupPolicyRemediation) pulumi.IntPtrOutput { return v.ResourceCount }).(pulumi.IntPtrOutput)
}

type GroupPolicyRemediationArrayOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationArrayOutput) ToGroupPolicyRemediationArrayOutput() GroupPolicyRemediationArrayOutput {
	return o
}

func (o GroupPolicyRemediationArrayOutput) ToGroupPolicyRemediationArrayOutputWithContext(ctx context.Context) GroupPolicyRemediationArrayOutput {
	return o
}

func (o GroupPolicyRemediationArrayOutput) Index(i pulumi.IntInput) GroupPolicyRemediationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupPolicyRemediation {
		return vs[0].([]*GroupPolicyRemediation)[vs[1].(int)]
	}).(GroupPolicyRemediationOutput)
}

type GroupPolicyRemediationMapOutput struct{ *pulumi.OutputState }

func (GroupPolicyRemediationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupPolicyRemediation)(nil)).Elem()
}

func (o GroupPolicyRemediationMapOutput) ToGroupPolicyRemediationMapOutput() GroupPolicyRemediationMapOutput {
	return o
}

func (o GroupPolicyRemediationMapOutput) ToGroupPolicyRemediationMapOutputWithContext(ctx context.Context) GroupPolicyRemediationMapOutput {
	return o
}

func (o GroupPolicyRemediationMapOutput) MapIndex(k pulumi.StringInput) GroupPolicyRemediationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupPolicyRemediation {
		return vs[0].(map[string]*GroupPolicyRemediation)[vs[1].(string)]
	}).(GroupPolicyRemediationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationInput)(nil)).Elem(), &GroupPolicyRemediation{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationArrayInput)(nil)).Elem(), GroupPolicyRemediationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupPolicyRemediationMapInput)(nil)).Elem(), GroupPolicyRemediationMap{})
	pulumi.RegisterOutputType(GroupPolicyRemediationOutput{})
	pulumi.RegisterOutputType(GroupPolicyRemediationArrayOutput{})
	pulumi.RegisterOutputType(GroupPolicyRemediationMapOutput{})
}
