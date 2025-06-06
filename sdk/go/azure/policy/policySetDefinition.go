// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a policy set definition.
//
// > **Note:** Policy set definitions (also known as policy initiatives) do not take effect until they are assigned to a scope using a Policy Set Assignment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/policy"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := policy.NewPolicySetDefinition(ctx, "example", &policy.PolicySetDefinitionArgs{
//				Name:        pulumi.String("testPolicySet"),
//				PolicyType:  pulumi.String("Custom"),
//				DisplayName: pulumi.String("Test Policy Set"),
//				Parameters: pulumi.String(`    {
//	        "allowedLocations": {
//	            "type": "Array",
//	            "metadata": {
//	                "description": "The list of allowed locations for resources.",
//	                "displayName": "Allowed locations",
//	                "strongType": "location"
//	            }
//	        }
//	    }
//
// `),
//
//				PolicyDefinitionReferences: policy.PolicySetDefinitionPolicyDefinitionReferenceArray{
//					&policy.PolicySetDefinitionPolicyDefinitionReferenceArgs{
//						PolicyDefinitionId: pulumi.String("/providers/Microsoft.Authorization/policyDefinitions/e765b5de-1225-4ba3-bd56-1ac6695af988"),
//						ParameterValues:    pulumi.String("    {\n      \"listOfAllowedLocations\": {\"value\": \"[parameters('allowedLocations')]\"}\n    }\n"),
//					},
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
// ## Import
//
// Policy Set Definitions can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:policy/policySetDefinition:PolicySetDefinition example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Authorization/policySetDefinitions/testPolicySet
// ```
//
// or
//
// ```sh
// $ pulumi import azure:policy/policySetDefinition:PolicySetDefinition example /providers/Microsoft.Management/managementGroups/my-mgmt-group-id/providers/Microsoft.Authorization/policySetDefinitions/testPolicySet
// ```
type PolicySetDefinition struct {
	pulumi.CustomResourceState

	// The description of the policy set definition.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The display name of the policy set definition.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringPtrOutput `pulumi:"managementGroupId"`
	// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
	Metadata pulumi.StringOutput `pulumi:"metadata"`
	// The name of the policy set definition. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
	Parameters pulumi.StringPtrOutput `pulumi:"parameters"`
	// One or more `policyDefinitionGroup` blocks as defined below.
	PolicyDefinitionGroups PolicySetDefinitionPolicyDefinitionGroupArrayOutput `pulumi:"policyDefinitionGroups"`
	// One or more `policyDefinitionReference` blocks as defined below.
	PolicyDefinitionReferences PolicySetDefinitionPolicyDefinitionReferenceArrayOutput `pulumi:"policyDefinitionReferences"`
	// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
	PolicyType pulumi.StringOutput `pulumi:"policyType"`
}

// NewPolicySetDefinition registers a new resource with the given unique name, arguments, and options.
func NewPolicySetDefinition(ctx *pulumi.Context,
	name string, args *PolicySetDefinitionArgs, opts ...pulumi.ResourceOption) (*PolicySetDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.PolicyDefinitionReferences == nil {
		return nil, errors.New("invalid value for required argument 'PolicyDefinitionReferences'")
	}
	if args.PolicyType == nil {
		return nil, errors.New("invalid value for required argument 'PolicyType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PolicySetDefinition
	err := ctx.RegisterResource("azure:policy/policySetDefinition:PolicySetDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPolicySetDefinition gets an existing PolicySetDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPolicySetDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PolicySetDefinitionState, opts ...pulumi.ResourceOption) (*PolicySetDefinition, error) {
	var resource PolicySetDefinition
	err := ctx.ReadResource("azure:policy/policySetDefinition:PolicySetDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PolicySetDefinition resources.
type policySetDefinitionState struct {
	// The description of the policy set definition.
	Description *string `pulumi:"description"`
	// The display name of the policy set definition.
	DisplayName *string `pulumi:"displayName"`
	// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
	ManagementGroupId *string `pulumi:"managementGroupId"`
	// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
	Metadata *string `pulumi:"metadata"`
	// The name of the policy set definition. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
	Parameters *string `pulumi:"parameters"`
	// One or more `policyDefinitionGroup` blocks as defined below.
	PolicyDefinitionGroups []PolicySetDefinitionPolicyDefinitionGroup `pulumi:"policyDefinitionGroups"`
	// One or more `policyDefinitionReference` blocks as defined below.
	PolicyDefinitionReferences []PolicySetDefinitionPolicyDefinitionReference `pulumi:"policyDefinitionReferences"`
	// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
	PolicyType *string `pulumi:"policyType"`
}

type PolicySetDefinitionState struct {
	// The description of the policy set definition.
	Description pulumi.StringPtrInput
	// The display name of the policy set definition.
	DisplayName pulumi.StringPtrInput
	// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringPtrInput
	// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
	Metadata pulumi.StringPtrInput
	// The name of the policy set definition. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
	Parameters pulumi.StringPtrInput
	// One or more `policyDefinitionGroup` blocks as defined below.
	PolicyDefinitionGroups PolicySetDefinitionPolicyDefinitionGroupArrayInput
	// One or more `policyDefinitionReference` blocks as defined below.
	PolicyDefinitionReferences PolicySetDefinitionPolicyDefinitionReferenceArrayInput
	// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
	PolicyType pulumi.StringPtrInput
}

func (PolicySetDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*policySetDefinitionState)(nil)).Elem()
}

type policySetDefinitionArgs struct {
	// The description of the policy set definition.
	Description *string `pulumi:"description"`
	// The display name of the policy set definition.
	DisplayName string `pulumi:"displayName"`
	// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
	ManagementGroupId *string `pulumi:"managementGroupId"`
	// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
	Metadata *string `pulumi:"metadata"`
	// The name of the policy set definition. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
	Parameters *string `pulumi:"parameters"`
	// One or more `policyDefinitionGroup` blocks as defined below.
	PolicyDefinitionGroups []PolicySetDefinitionPolicyDefinitionGroup `pulumi:"policyDefinitionGroups"`
	// One or more `policyDefinitionReference` blocks as defined below.
	PolicyDefinitionReferences []PolicySetDefinitionPolicyDefinitionReference `pulumi:"policyDefinitionReferences"`
	// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
	PolicyType string `pulumi:"policyType"`
}

// The set of arguments for constructing a PolicySetDefinition resource.
type PolicySetDefinitionArgs struct {
	// The description of the policy set definition.
	Description pulumi.StringPtrInput
	// The display name of the policy set definition.
	DisplayName pulumi.StringInput
	// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
	ManagementGroupId pulumi.StringPtrInput
	// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
	Metadata pulumi.StringPtrInput
	// The name of the policy set definition. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
	Parameters pulumi.StringPtrInput
	// One or more `policyDefinitionGroup` blocks as defined below.
	PolicyDefinitionGroups PolicySetDefinitionPolicyDefinitionGroupArrayInput
	// One or more `policyDefinitionReference` blocks as defined below.
	PolicyDefinitionReferences PolicySetDefinitionPolicyDefinitionReferenceArrayInput
	// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
	PolicyType pulumi.StringInput
}

func (PolicySetDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*policySetDefinitionArgs)(nil)).Elem()
}

type PolicySetDefinitionInput interface {
	pulumi.Input

	ToPolicySetDefinitionOutput() PolicySetDefinitionOutput
	ToPolicySetDefinitionOutputWithContext(ctx context.Context) PolicySetDefinitionOutput
}

func (*PolicySetDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicySetDefinition)(nil)).Elem()
}

func (i *PolicySetDefinition) ToPolicySetDefinitionOutput() PolicySetDefinitionOutput {
	return i.ToPolicySetDefinitionOutputWithContext(context.Background())
}

func (i *PolicySetDefinition) ToPolicySetDefinitionOutputWithContext(ctx context.Context) PolicySetDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicySetDefinitionOutput)
}

// PolicySetDefinitionArrayInput is an input type that accepts PolicySetDefinitionArray and PolicySetDefinitionArrayOutput values.
// You can construct a concrete instance of `PolicySetDefinitionArrayInput` via:
//
//	PolicySetDefinitionArray{ PolicySetDefinitionArgs{...} }
type PolicySetDefinitionArrayInput interface {
	pulumi.Input

	ToPolicySetDefinitionArrayOutput() PolicySetDefinitionArrayOutput
	ToPolicySetDefinitionArrayOutputWithContext(context.Context) PolicySetDefinitionArrayOutput
}

type PolicySetDefinitionArray []PolicySetDefinitionInput

func (PolicySetDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicySetDefinition)(nil)).Elem()
}

func (i PolicySetDefinitionArray) ToPolicySetDefinitionArrayOutput() PolicySetDefinitionArrayOutput {
	return i.ToPolicySetDefinitionArrayOutputWithContext(context.Background())
}

func (i PolicySetDefinitionArray) ToPolicySetDefinitionArrayOutputWithContext(ctx context.Context) PolicySetDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicySetDefinitionArrayOutput)
}

// PolicySetDefinitionMapInput is an input type that accepts PolicySetDefinitionMap and PolicySetDefinitionMapOutput values.
// You can construct a concrete instance of `PolicySetDefinitionMapInput` via:
//
//	PolicySetDefinitionMap{ "key": PolicySetDefinitionArgs{...} }
type PolicySetDefinitionMapInput interface {
	pulumi.Input

	ToPolicySetDefinitionMapOutput() PolicySetDefinitionMapOutput
	ToPolicySetDefinitionMapOutputWithContext(context.Context) PolicySetDefinitionMapOutput
}

type PolicySetDefinitionMap map[string]PolicySetDefinitionInput

func (PolicySetDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicySetDefinition)(nil)).Elem()
}

func (i PolicySetDefinitionMap) ToPolicySetDefinitionMapOutput() PolicySetDefinitionMapOutput {
	return i.ToPolicySetDefinitionMapOutputWithContext(context.Background())
}

func (i PolicySetDefinitionMap) ToPolicySetDefinitionMapOutputWithContext(ctx context.Context) PolicySetDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PolicySetDefinitionMapOutput)
}

type PolicySetDefinitionOutput struct{ *pulumi.OutputState }

func (PolicySetDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PolicySetDefinition)(nil)).Elem()
}

func (o PolicySetDefinitionOutput) ToPolicySetDefinitionOutput() PolicySetDefinitionOutput {
	return o
}

func (o PolicySetDefinitionOutput) ToPolicySetDefinitionOutputWithContext(ctx context.Context) PolicySetDefinitionOutput {
	return o
}

// The description of the policy set definition.
func (o PolicySetDefinitionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The display name of the policy set definition.
func (o PolicySetDefinitionOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The id of the Management Group where this policy set definition should be defined. Changing this forces a new resource to be created.
func (o PolicySetDefinitionOutput) ManagementGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringPtrOutput { return v.ManagementGroupId }).(pulumi.StringPtrOutput)
}

// The metadata for the policy set definition. This is a JSON object representing additional metadata that should be stored with the policy definition.
func (o PolicySetDefinitionOutput) Metadata() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringOutput { return v.Metadata }).(pulumi.StringOutput)
}

// The name of the policy set definition. Changing this forces a new resource to be created.
func (o PolicySetDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Parameters for the policy set definition. This field is a JSON object that allows you to parameterize your policy definition.
func (o PolicySetDefinitionOutput) Parameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringPtrOutput { return v.Parameters }).(pulumi.StringPtrOutput)
}

// One or more `policyDefinitionGroup` blocks as defined below.
func (o PolicySetDefinitionOutput) PolicyDefinitionGroups() PolicySetDefinitionPolicyDefinitionGroupArrayOutput {
	return o.ApplyT(func(v *PolicySetDefinition) PolicySetDefinitionPolicyDefinitionGroupArrayOutput {
		return v.PolicyDefinitionGroups
	}).(PolicySetDefinitionPolicyDefinitionGroupArrayOutput)
}

// One or more `policyDefinitionReference` blocks as defined below.
func (o PolicySetDefinitionOutput) PolicyDefinitionReferences() PolicySetDefinitionPolicyDefinitionReferenceArrayOutput {
	return o.ApplyT(func(v *PolicySetDefinition) PolicySetDefinitionPolicyDefinitionReferenceArrayOutput {
		return v.PolicyDefinitionReferences
	}).(PolicySetDefinitionPolicyDefinitionReferenceArrayOutput)
}

// The policy set type. Possible values are `BuiltIn`, `Custom`, `NotSpecified` and `Static`. Changing this forces a new resource to be created.
func (o PolicySetDefinitionOutput) PolicyType() pulumi.StringOutput {
	return o.ApplyT(func(v *PolicySetDefinition) pulumi.StringOutput { return v.PolicyType }).(pulumi.StringOutput)
}

type PolicySetDefinitionArrayOutput struct{ *pulumi.OutputState }

func (PolicySetDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PolicySetDefinition)(nil)).Elem()
}

func (o PolicySetDefinitionArrayOutput) ToPolicySetDefinitionArrayOutput() PolicySetDefinitionArrayOutput {
	return o
}

func (o PolicySetDefinitionArrayOutput) ToPolicySetDefinitionArrayOutputWithContext(ctx context.Context) PolicySetDefinitionArrayOutput {
	return o
}

func (o PolicySetDefinitionArrayOutput) Index(i pulumi.IntInput) PolicySetDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PolicySetDefinition {
		return vs[0].([]*PolicySetDefinition)[vs[1].(int)]
	}).(PolicySetDefinitionOutput)
}

type PolicySetDefinitionMapOutput struct{ *pulumi.OutputState }

func (PolicySetDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PolicySetDefinition)(nil)).Elem()
}

func (o PolicySetDefinitionMapOutput) ToPolicySetDefinitionMapOutput() PolicySetDefinitionMapOutput {
	return o
}

func (o PolicySetDefinitionMapOutput) ToPolicySetDefinitionMapOutputWithContext(ctx context.Context) PolicySetDefinitionMapOutput {
	return o
}

func (o PolicySetDefinitionMapOutput) MapIndex(k pulumi.StringInput) PolicySetDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PolicySetDefinition {
		return vs[0].(map[string]*PolicySetDefinition)[vs[1].(string)]
	}).(PolicySetDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PolicySetDefinitionInput)(nil)).Elem(), &PolicySetDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicySetDefinitionArrayInput)(nil)).Elem(), PolicySetDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PolicySetDefinitionMapInput)(nil)).Elem(), PolicySetDefinitionMap{})
	pulumi.RegisterOutputType(PolicySetDefinitionOutput{})
	pulumi.RegisterOutputType(PolicySetDefinitionArrayOutput{})
	pulumi.RegisterOutputType(PolicySetDefinitionMapOutput{})
}
