// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package policy

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Policy Assignment.
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
//			example, err := policy.GetPolicyAssignment(ctx, &policy.GetPolicyAssignmentArgs{
//				Name:    "existing",
//				ScopeId: exampleAzurermResourceGroup.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", example.Id)
//			return nil
//		})
//	}
//
// ```
//
// ## API Providers
//
// <!-- This section is generated, changes will be overwritten -->
// This data source uses the following Azure API Providers:
//
// * `Microsoft.Authorization`: 2022-06-01
func GetPolicyAssignment(ctx *pulumi.Context, args *GetPolicyAssignmentArgs, opts ...pulumi.InvokeOption) (*GetPolicyAssignmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPolicyAssignmentResult
	err := ctx.Invoke("azure:policy/getPolicyAssignment:getPolicyAssignment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPolicyAssignment.
type GetPolicyAssignmentArgs struct {
	// The name of this Policy Assignment. Changing this forces a new Policy Assignment to be created.
	Name string `pulumi:"name"`
	// The ID of the scope this Policy Assignment is assigned to. The `scopeId` can be a subscription id, a resource group id, a management group id, or an ID of any resource that is assigned with a policy. Changing this forces a new Policy Assignment to be created.
	ScopeId string `pulumi:"scopeId"`
}

// A collection of values returned by getPolicyAssignment.
type GetPolicyAssignmentResult struct {
	// The description of this Policy Assignment.
	Description string `pulumi:"description"`
	// The display name of this Policy Assignment.
	DisplayName string `pulumi:"displayName"`
	// Whether this Policy is enforced or not?
	Enforce bool `pulumi:"enforce"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A `identity` block as defined below.
	Identities []GetPolicyAssignmentIdentity `pulumi:"identities"`
	// The Azure Region where the Policy Assignment exists.
	Location string `pulumi:"location"`
	// A JSON mapping of any Metadata for this Policy.
	Metadata string `pulumi:"metadata"`
	Name     string `pulumi:"name"`
	// A `nonComplianceMessage` block as defined below.
	NonComplianceMessages []GetPolicyAssignmentNonComplianceMessage `pulumi:"nonComplianceMessages"`
	// A `notScopes` block as defined below.
	NotScopes []string `pulumi:"notScopes"`
	// A JSON mapping of any Parameters for this Policy.
	Parameters string `pulumi:"parameters"`
	// The ID of the assigned Policy Definition.
	PolicyDefinitionId string `pulumi:"policyDefinitionId"`
	ScopeId            string `pulumi:"scopeId"`
}

func GetPolicyAssignmentOutput(ctx *pulumi.Context, args GetPolicyAssignmentOutputArgs, opts ...pulumi.InvokeOption) GetPolicyAssignmentResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPolicyAssignmentResultOutput, error) {
			args := v.(GetPolicyAssignmentArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:policy/getPolicyAssignment:getPolicyAssignment", args, GetPolicyAssignmentResultOutput{}, options).(GetPolicyAssignmentResultOutput), nil
		}).(GetPolicyAssignmentResultOutput)
}

// A collection of arguments for invoking getPolicyAssignment.
type GetPolicyAssignmentOutputArgs struct {
	// The name of this Policy Assignment. Changing this forces a new Policy Assignment to be created.
	Name pulumi.StringInput `pulumi:"name"`
	// The ID of the scope this Policy Assignment is assigned to. The `scopeId` can be a subscription id, a resource group id, a management group id, or an ID of any resource that is assigned with a policy. Changing this forces a new Policy Assignment to be created.
	ScopeId pulumi.StringInput `pulumi:"scopeId"`
}

func (GetPolicyAssignmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPolicyAssignmentArgs)(nil)).Elem()
}

// A collection of values returned by getPolicyAssignment.
type GetPolicyAssignmentResultOutput struct{ *pulumi.OutputState }

func (GetPolicyAssignmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPolicyAssignmentResult)(nil)).Elem()
}

func (o GetPolicyAssignmentResultOutput) ToGetPolicyAssignmentResultOutput() GetPolicyAssignmentResultOutput {
	return o
}

func (o GetPolicyAssignmentResultOutput) ToGetPolicyAssignmentResultOutputWithContext(ctx context.Context) GetPolicyAssignmentResultOutput {
	return o
}

// The description of this Policy Assignment.
func (o GetPolicyAssignmentResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Description }).(pulumi.StringOutput)
}

// The display name of this Policy Assignment.
func (o GetPolicyAssignmentResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// Whether this Policy is enforced or not?
func (o GetPolicyAssignmentResultOutput) Enforce() pulumi.BoolOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) bool { return v.Enforce }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPolicyAssignmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// A `identity` block as defined below.
func (o GetPolicyAssignmentResultOutput) Identities() GetPolicyAssignmentIdentityArrayOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) []GetPolicyAssignmentIdentity { return v.Identities }).(GetPolicyAssignmentIdentityArrayOutput)
}

// The Azure Region where the Policy Assignment exists.
func (o GetPolicyAssignmentResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Location }).(pulumi.StringOutput)
}

// A JSON mapping of any Metadata for this Policy.
func (o GetPolicyAssignmentResultOutput) Metadata() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Metadata }).(pulumi.StringOutput)
}

func (o GetPolicyAssignmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Name }).(pulumi.StringOutput)
}

// A `nonComplianceMessage` block as defined below.
func (o GetPolicyAssignmentResultOutput) NonComplianceMessages() GetPolicyAssignmentNonComplianceMessageArrayOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) []GetPolicyAssignmentNonComplianceMessage {
		return v.NonComplianceMessages
	}).(GetPolicyAssignmentNonComplianceMessageArrayOutput)
}

// A `notScopes` block as defined below.
func (o GetPolicyAssignmentResultOutput) NotScopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) []string { return v.NotScopes }).(pulumi.StringArrayOutput)
}

// A JSON mapping of any Parameters for this Policy.
func (o GetPolicyAssignmentResultOutput) Parameters() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.Parameters }).(pulumi.StringOutput)
}

// The ID of the assigned Policy Definition.
func (o GetPolicyAssignmentResultOutput) PolicyDefinitionId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.PolicyDefinitionId }).(pulumi.StringOutput)
}

func (o GetPolicyAssignmentResultOutput) ScopeId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPolicyAssignmentResult) string { return v.ScopeId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPolicyAssignmentResultOutput{})
}
