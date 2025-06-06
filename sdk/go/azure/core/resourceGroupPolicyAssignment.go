// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package core

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Resource Group Policy Assignment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/policy"
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
//			exampleDefinition, err := policy.NewDefinition(ctx, "example", &policy.DefinitionArgs{
//				Name:        pulumi.String("only-deploy-in-westeurope"),
//				PolicyType:  pulumi.String("Custom"),
//				Mode:        pulumi.String("All"),
//				DisplayName: pulumi.String("my-policy-definition"),
//				PolicyRule: pulumi.String(` {
//	    "if": {
//	      "not": {
//	        "field": "location",
//	        "equals": "westeurope"
//	      }
//	    },
//	    "then": {
//	      "effect": "Deny"
//	    }
//	  }
//
// `),
//
//			})
//			if err != nil {
//				return err
//			}
//			_, err = core.NewResourceGroupPolicyAssignment(ctx, "example", &core.ResourceGroupPolicyAssignmentArgs{
//				Name:               pulumi.String("example"),
//				ResourceGroupId:    example.ID(),
//				PolicyDefinitionId: exampleDefinition.ID(),
//				Parameters: pulumi.String(`    {
//	      "tagName": {
//	        "value": "Business Unit"
//	      },
//	      "tagValue": {
//	        "value": "BU"
//	      }
//	    }
//
// `),
//
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
// * `Microsoft.Authorization`: 2022-06-01
//
// ## Import
//
// Resource Group Policy Assignments can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:core/resourceGroupPolicyAssignment:ResourceGroupPolicyAssignment example /subscriptions/00000000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Authorization/policyAssignments/assignment1
// ```
type ResourceGroupPolicyAssignment struct {
	pulumi.CustomResourceState

	// A description which should be used for this Policy Assignment.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Display Name for this Policy Assignment.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Specifies if this Policy should be enforced or not? Defaults to `true`.
	Enforce pulumi.BoolPtrOutput `pulumi:"enforce"`
	// An `identity` block as defined below.
	//
	// > **Note:** The `location` field must also be specified when `identity` is specified.
	Identity ResourceGroupPolicyAssignmentIdentityPtrOutput `pulumi:"identity"`
	// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A JSON mapping of any Metadata for this Policy.
	Metadata pulumi.StringOutput `pulumi:"metadata"`
	// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
	Name pulumi.StringOutput `pulumi:"name"`
	// One or more `nonComplianceMessage` blocks as defined below.
	NonComplianceMessages ResourceGroupPolicyAssignmentNonComplianceMessageArrayOutput `pulumi:"nonComplianceMessages"`
	// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
	NotScopes pulumi.StringArrayOutput `pulumi:"notScopes"`
	// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
	Overrides ResourceGroupPolicyAssignmentOverrideArrayOutput `pulumi:"overrides"`
	// A JSON mapping of any Parameters for this Policy.
	Parameters pulumi.StringPtrOutput `pulumi:"parameters"`
	// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
	PolicyDefinitionId pulumi.StringOutput `pulumi:"policyDefinitionId"`
	// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
	ResourceSelectors ResourceGroupPolicyAssignmentResourceSelectorArrayOutput `pulumi:"resourceSelectors"`
}

// NewResourceGroupPolicyAssignment registers a new resource with the given unique name, arguments, and options.
func NewResourceGroupPolicyAssignment(ctx *pulumi.Context,
	name string, args *ResourceGroupPolicyAssignmentArgs, opts ...pulumi.ResourceOption) (*ResourceGroupPolicyAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyDefinitionId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyDefinitionId'")
	}
	if args.ResourceGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceGroupPolicyAssignment
	err := ctx.RegisterResource("azure:core/resourceGroupPolicyAssignment:ResourceGroupPolicyAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceGroupPolicyAssignment gets an existing ResourceGroupPolicyAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceGroupPolicyAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceGroupPolicyAssignmentState, opts ...pulumi.ResourceOption) (*ResourceGroupPolicyAssignment, error) {
	var resource ResourceGroupPolicyAssignment
	err := ctx.ReadResource("azure:core/resourceGroupPolicyAssignment:ResourceGroupPolicyAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceGroupPolicyAssignment resources.
type resourceGroupPolicyAssignmentState struct {
	// A description which should be used for this Policy Assignment.
	Description *string `pulumi:"description"`
	// The Display Name for this Policy Assignment.
	DisplayName *string `pulumi:"displayName"`
	// Specifies if this Policy should be enforced or not? Defaults to `true`.
	Enforce *bool `pulumi:"enforce"`
	// An `identity` block as defined below.
	//
	// > **Note:** The `location` field must also be specified when `identity` is specified.
	Identity *ResourceGroupPolicyAssignmentIdentity `pulumi:"identity"`
	// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
	Location *string `pulumi:"location"`
	// A JSON mapping of any Metadata for this Policy.
	Metadata *string `pulumi:"metadata"`
	// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
	Name *string `pulumi:"name"`
	// One or more `nonComplianceMessage` blocks as defined below.
	NonComplianceMessages []ResourceGroupPolicyAssignmentNonComplianceMessage `pulumi:"nonComplianceMessages"`
	// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
	NotScopes []string `pulumi:"notScopes"`
	// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
	Overrides []ResourceGroupPolicyAssignmentOverride `pulumi:"overrides"`
	// A JSON mapping of any Parameters for this Policy.
	Parameters *string `pulumi:"parameters"`
	// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
	PolicyDefinitionId *string `pulumi:"policyDefinitionId"`
	// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
	ResourceSelectors []ResourceGroupPolicyAssignmentResourceSelector `pulumi:"resourceSelectors"`
}

type ResourceGroupPolicyAssignmentState struct {
	// A description which should be used for this Policy Assignment.
	Description pulumi.StringPtrInput
	// The Display Name for this Policy Assignment.
	DisplayName pulumi.StringPtrInput
	// Specifies if this Policy should be enforced or not? Defaults to `true`.
	Enforce pulumi.BoolPtrInput
	// An `identity` block as defined below.
	//
	// > **Note:** The `location` field must also be specified when `identity` is specified.
	Identity ResourceGroupPolicyAssignmentIdentityPtrInput
	// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
	Location pulumi.StringPtrInput
	// A JSON mapping of any Metadata for this Policy.
	Metadata pulumi.StringPtrInput
	// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
	Name pulumi.StringPtrInput
	// One or more `nonComplianceMessage` blocks as defined below.
	NonComplianceMessages ResourceGroupPolicyAssignmentNonComplianceMessageArrayInput
	// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
	NotScopes pulumi.StringArrayInput
	// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
	Overrides ResourceGroupPolicyAssignmentOverrideArrayInput
	// A JSON mapping of any Parameters for this Policy.
	Parameters pulumi.StringPtrInput
	// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
	PolicyDefinitionId pulumi.StringPtrInput
	// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
	ResourceGroupId pulumi.StringPtrInput
	// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
	ResourceSelectors ResourceGroupPolicyAssignmentResourceSelectorArrayInput
}

func (ResourceGroupPolicyAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGroupPolicyAssignmentState)(nil)).Elem()
}

type resourceGroupPolicyAssignmentArgs struct {
	// A description which should be used for this Policy Assignment.
	Description *string `pulumi:"description"`
	// The Display Name for this Policy Assignment.
	DisplayName *string `pulumi:"displayName"`
	// Specifies if this Policy should be enforced or not? Defaults to `true`.
	Enforce *bool `pulumi:"enforce"`
	// An `identity` block as defined below.
	//
	// > **Note:** The `location` field must also be specified when `identity` is specified.
	Identity *ResourceGroupPolicyAssignmentIdentity `pulumi:"identity"`
	// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
	Location *string `pulumi:"location"`
	// A JSON mapping of any Metadata for this Policy.
	Metadata *string `pulumi:"metadata"`
	// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
	Name *string `pulumi:"name"`
	// One or more `nonComplianceMessage` blocks as defined below.
	NonComplianceMessages []ResourceGroupPolicyAssignmentNonComplianceMessage `pulumi:"nonComplianceMessages"`
	// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
	NotScopes []string `pulumi:"notScopes"`
	// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
	Overrides []ResourceGroupPolicyAssignmentOverride `pulumi:"overrides"`
	// A JSON mapping of any Parameters for this Policy.
	Parameters *string `pulumi:"parameters"`
	// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
	PolicyDefinitionId string `pulumi:"policyDefinitionId"`
	// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
	ResourceGroupId string `pulumi:"resourceGroupId"`
	// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
	ResourceSelectors []ResourceGroupPolicyAssignmentResourceSelector `pulumi:"resourceSelectors"`
}

// The set of arguments for constructing a ResourceGroupPolicyAssignment resource.
type ResourceGroupPolicyAssignmentArgs struct {
	// A description which should be used for this Policy Assignment.
	Description pulumi.StringPtrInput
	// The Display Name for this Policy Assignment.
	DisplayName pulumi.StringPtrInput
	// Specifies if this Policy should be enforced or not? Defaults to `true`.
	Enforce pulumi.BoolPtrInput
	// An `identity` block as defined below.
	//
	// > **Note:** The `location` field must also be specified when `identity` is specified.
	Identity ResourceGroupPolicyAssignmentIdentityPtrInput
	// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
	Location pulumi.StringPtrInput
	// A JSON mapping of any Metadata for this Policy.
	Metadata pulumi.StringPtrInput
	// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
	Name pulumi.StringPtrInput
	// One or more `nonComplianceMessage` blocks as defined below.
	NonComplianceMessages ResourceGroupPolicyAssignmentNonComplianceMessageArrayInput
	// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
	NotScopes pulumi.StringArrayInput
	// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
	Overrides ResourceGroupPolicyAssignmentOverrideArrayInput
	// A JSON mapping of any Parameters for this Policy.
	Parameters pulumi.StringPtrInput
	// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
	PolicyDefinitionId pulumi.StringInput
	// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
	ResourceGroupId pulumi.StringInput
	// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
	ResourceSelectors ResourceGroupPolicyAssignmentResourceSelectorArrayInput
}

func (ResourceGroupPolicyAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceGroupPolicyAssignmentArgs)(nil)).Elem()
}

type ResourceGroupPolicyAssignmentInput interface {
	pulumi.Input

	ToResourceGroupPolicyAssignmentOutput() ResourceGroupPolicyAssignmentOutput
	ToResourceGroupPolicyAssignmentOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentOutput
}

func (*ResourceGroupPolicyAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (i *ResourceGroupPolicyAssignment) ToResourceGroupPolicyAssignmentOutput() ResourceGroupPolicyAssignmentOutput {
	return i.ToResourceGroupPolicyAssignmentOutputWithContext(context.Background())
}

func (i *ResourceGroupPolicyAssignment) ToResourceGroupPolicyAssignmentOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupPolicyAssignmentOutput)
}

// ResourceGroupPolicyAssignmentArrayInput is an input type that accepts ResourceGroupPolicyAssignmentArray and ResourceGroupPolicyAssignmentArrayOutput values.
// You can construct a concrete instance of `ResourceGroupPolicyAssignmentArrayInput` via:
//
//	ResourceGroupPolicyAssignmentArray{ ResourceGroupPolicyAssignmentArgs{...} }
type ResourceGroupPolicyAssignmentArrayInput interface {
	pulumi.Input

	ToResourceGroupPolicyAssignmentArrayOutput() ResourceGroupPolicyAssignmentArrayOutput
	ToResourceGroupPolicyAssignmentArrayOutputWithContext(context.Context) ResourceGroupPolicyAssignmentArrayOutput
}

type ResourceGroupPolicyAssignmentArray []ResourceGroupPolicyAssignmentInput

func (ResourceGroupPolicyAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (i ResourceGroupPolicyAssignmentArray) ToResourceGroupPolicyAssignmentArrayOutput() ResourceGroupPolicyAssignmentArrayOutput {
	return i.ToResourceGroupPolicyAssignmentArrayOutputWithContext(context.Background())
}

func (i ResourceGroupPolicyAssignmentArray) ToResourceGroupPolicyAssignmentArrayOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupPolicyAssignmentArrayOutput)
}

// ResourceGroupPolicyAssignmentMapInput is an input type that accepts ResourceGroupPolicyAssignmentMap and ResourceGroupPolicyAssignmentMapOutput values.
// You can construct a concrete instance of `ResourceGroupPolicyAssignmentMapInput` via:
//
//	ResourceGroupPolicyAssignmentMap{ "key": ResourceGroupPolicyAssignmentArgs{...} }
type ResourceGroupPolicyAssignmentMapInput interface {
	pulumi.Input

	ToResourceGroupPolicyAssignmentMapOutput() ResourceGroupPolicyAssignmentMapOutput
	ToResourceGroupPolicyAssignmentMapOutputWithContext(context.Context) ResourceGroupPolicyAssignmentMapOutput
}

type ResourceGroupPolicyAssignmentMap map[string]ResourceGroupPolicyAssignmentInput

func (ResourceGroupPolicyAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (i ResourceGroupPolicyAssignmentMap) ToResourceGroupPolicyAssignmentMapOutput() ResourceGroupPolicyAssignmentMapOutput {
	return i.ToResourceGroupPolicyAssignmentMapOutputWithContext(context.Background())
}

func (i ResourceGroupPolicyAssignmentMap) ToResourceGroupPolicyAssignmentMapOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceGroupPolicyAssignmentMapOutput)
}

type ResourceGroupPolicyAssignmentOutput struct{ *pulumi.OutputState }

func (ResourceGroupPolicyAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (o ResourceGroupPolicyAssignmentOutput) ToResourceGroupPolicyAssignmentOutput() ResourceGroupPolicyAssignmentOutput {
	return o
}

func (o ResourceGroupPolicyAssignmentOutput) ToResourceGroupPolicyAssignmentOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentOutput {
	return o
}

// A description which should be used for this Policy Assignment.
func (o ResourceGroupPolicyAssignmentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Display Name for this Policy Assignment.
func (o ResourceGroupPolicyAssignmentOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Specifies if this Policy should be enforced or not? Defaults to `true`.
func (o ResourceGroupPolicyAssignmentOutput) Enforce() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.BoolPtrOutput { return v.Enforce }).(pulumi.BoolPtrOutput)
}

// An `identity` block as defined below.
//
// > **Note:** The `location` field must also be specified when `identity` is specified.
func (o ResourceGroupPolicyAssignmentOutput) Identity() ResourceGroupPolicyAssignmentIdentityPtrOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) ResourceGroupPolicyAssignmentIdentityPtrOutput {
		return v.Identity
	}).(ResourceGroupPolicyAssignmentIdentityPtrOutput)
}

// The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
func (o ResourceGroupPolicyAssignmentOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A JSON mapping of any Metadata for this Policy.
func (o ResourceGroupPolicyAssignmentOutput) Metadata() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringOutput { return v.Metadata }).(pulumi.StringOutput)
}

// The name which should be used for this Policy Assignment. Changing this forces a new Policy Assignment to be created. Cannot exceed 64 characters in length.
func (o ResourceGroupPolicyAssignmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// One or more `nonComplianceMessage` blocks as defined below.
func (o ResourceGroupPolicyAssignmentOutput) NonComplianceMessages() ResourceGroupPolicyAssignmentNonComplianceMessageArrayOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) ResourceGroupPolicyAssignmentNonComplianceMessageArrayOutput {
		return v.NonComplianceMessages
	}).(ResourceGroupPolicyAssignmentNonComplianceMessageArrayOutput)
}

// Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
func (o ResourceGroupPolicyAssignmentOutput) NotScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringArrayOutput { return v.NotScopes }).(pulumi.StringArrayOutput)
}

// One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure#resource-selectors-preview)
func (o ResourceGroupPolicyAssignmentOutput) Overrides() ResourceGroupPolicyAssignmentOverrideArrayOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) ResourceGroupPolicyAssignmentOverrideArrayOutput {
		return v.Overrides
	}).(ResourceGroupPolicyAssignmentOverrideArrayOutput)
}

// A JSON mapping of any Parameters for this Policy.
func (o ResourceGroupPolicyAssignmentOutput) Parameters() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringPtrOutput { return v.Parameters }).(pulumi.StringPtrOutput)
}

// The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
func (o ResourceGroupPolicyAssignmentOutput) PolicyDefinitionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringOutput { return v.PolicyDefinitionId }).(pulumi.StringOutput)
}

// The ID of the Resource Group where this Policy Assignment should be created. Changing this forces a new Policy Assignment to be created.
func (o ResourceGroupPolicyAssignmentOutput) ResourceGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) pulumi.StringOutput { return v.ResourceGroupId }).(pulumi.StringOutput)
}

// One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
func (o ResourceGroupPolicyAssignmentOutput) ResourceSelectors() ResourceGroupPolicyAssignmentResourceSelectorArrayOutput {
	return o.ApplyT(func(v *ResourceGroupPolicyAssignment) ResourceGroupPolicyAssignmentResourceSelectorArrayOutput {
		return v.ResourceSelectors
	}).(ResourceGroupPolicyAssignmentResourceSelectorArrayOutput)
}

type ResourceGroupPolicyAssignmentArrayOutput struct{ *pulumi.OutputState }

func (ResourceGroupPolicyAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (o ResourceGroupPolicyAssignmentArrayOutput) ToResourceGroupPolicyAssignmentArrayOutput() ResourceGroupPolicyAssignmentArrayOutput {
	return o
}

func (o ResourceGroupPolicyAssignmentArrayOutput) ToResourceGroupPolicyAssignmentArrayOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentArrayOutput {
	return o
}

func (o ResourceGroupPolicyAssignmentArrayOutput) Index(i pulumi.IntInput) ResourceGroupPolicyAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceGroupPolicyAssignment {
		return vs[0].([]*ResourceGroupPolicyAssignment)[vs[1].(int)]
	}).(ResourceGroupPolicyAssignmentOutput)
}

type ResourceGroupPolicyAssignmentMapOutput struct{ *pulumi.OutputState }

func (ResourceGroupPolicyAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceGroupPolicyAssignment)(nil)).Elem()
}

func (o ResourceGroupPolicyAssignmentMapOutput) ToResourceGroupPolicyAssignmentMapOutput() ResourceGroupPolicyAssignmentMapOutput {
	return o
}

func (o ResourceGroupPolicyAssignmentMapOutput) ToResourceGroupPolicyAssignmentMapOutputWithContext(ctx context.Context) ResourceGroupPolicyAssignmentMapOutput {
	return o
}

func (o ResourceGroupPolicyAssignmentMapOutput) MapIndex(k pulumi.StringInput) ResourceGroupPolicyAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceGroupPolicyAssignment {
		return vs[0].(map[string]*ResourceGroupPolicyAssignment)[vs[1].(string)]
	}).(ResourceGroupPolicyAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupPolicyAssignmentInput)(nil)).Elem(), &ResourceGroupPolicyAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupPolicyAssignmentArrayInput)(nil)).Elem(), ResourceGroupPolicyAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceGroupPolicyAssignmentMapInput)(nil)).Elem(), ResourceGroupPolicyAssignmentMap{})
	pulumi.RegisterOutputType(ResourceGroupPolicyAssignmentOutput{})
	pulumi.RegisterOutputType(ResourceGroupPolicyAssignmentArrayOutput{})
	pulumi.RegisterOutputType(ResourceGroupPolicyAssignmentMapOutput{})
}
