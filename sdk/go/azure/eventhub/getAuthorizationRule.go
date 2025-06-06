// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventhub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Event Hubs Authorization Rule within an Event Hub.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/eventhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := eventhub.LookupAuthorizationRule(ctx, &eventhub.LookupAuthorizationRuleArgs{
//				Name:              "test",
//				NamespaceName:     testAzurermEventhubNamespace.Name,
//				EventhubName:      testAzurermEventhub.Name,
//				ResourceGroupName: testAzurermResourceGroup.Name,
//			}, nil)
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
// This data source uses the following Azure API Providers:
//
// * `Microsoft.EventHub`: 2024-01-01
func LookupAuthorizationRule(ctx *pulumi.Context, args *LookupAuthorizationRuleArgs, opts ...pulumi.InvokeOption) (*LookupAuthorizationRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAuthorizationRuleResult
	err := ctx.Invoke("azure:eventhub/getAuthorizationRule:getAuthorizationRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthorizationRule.
type LookupAuthorizationRuleArgs struct {
	// Specifies the name of the EventHub.
	EventhubName string `pulumi:"eventhubName"`
	Listen       *bool  `pulumi:"listen"`
	Manage       *bool  `pulumi:"manage"`
	// Specifies the name of the EventHub Authorization Rule resource. be created.
	Name string `pulumi:"name"`
	// Specifies the name of the grandparent EventHub Namespace.
	NamespaceName string `pulumi:"namespaceName"`
	// The name of the resource group in which the EventHub Authorization Rule's grandparent Namespace exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	Send              *bool  `pulumi:"send"`
}

// A collection of values returned by getAuthorizationRule.
type LookupAuthorizationRuleResult struct {
	EventhubName string `pulumi:"eventhubName"`
	// The provider-assigned unique ID for this managed resource.
	Id            string `pulumi:"id"`
	Listen        *bool  `pulumi:"listen"`
	Manage        *bool  `pulumi:"manage"`
	Name          string `pulumi:"name"`
	NamespaceName string `pulumi:"namespaceName"`
	// The Primary Connection String for the Event Hubs Authorization Rule.
	PrimaryConnectionString string `pulumi:"primaryConnectionString"`
	// The alias of the Primary Connection String for the Event Hubs Authorization Rule.
	PrimaryConnectionStringAlias string `pulumi:"primaryConnectionStringAlias"`
	// The Primary Key for the Event Hubs Authorization Rule.
	PrimaryKey        string `pulumi:"primaryKey"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The Secondary Connection String for the Event Hubs Authorization Rule.
	SecondaryConnectionString string `pulumi:"secondaryConnectionString"`
	// The alias of the Secondary Connection String for the Event Hubs Authorization Rule.
	SecondaryConnectionStringAlias string `pulumi:"secondaryConnectionStringAlias"`
	// The Secondary Key for the Event Hubs Authorization Rule.
	SecondaryKey string `pulumi:"secondaryKey"`
	Send         *bool  `pulumi:"send"`
}

func LookupAuthorizationRuleOutput(ctx *pulumi.Context, args LookupAuthorizationRuleOutputArgs, opts ...pulumi.InvokeOption) LookupAuthorizationRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAuthorizationRuleResultOutput, error) {
			args := v.(LookupAuthorizationRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:eventhub/getAuthorizationRule:getAuthorizationRule", args, LookupAuthorizationRuleResultOutput{}, options).(LookupAuthorizationRuleResultOutput), nil
		}).(LookupAuthorizationRuleResultOutput)
}

// A collection of arguments for invoking getAuthorizationRule.
type LookupAuthorizationRuleOutputArgs struct {
	// Specifies the name of the EventHub.
	EventhubName pulumi.StringInput  `pulumi:"eventhubName"`
	Listen       pulumi.BoolPtrInput `pulumi:"listen"`
	Manage       pulumi.BoolPtrInput `pulumi:"manage"`
	// Specifies the name of the EventHub Authorization Rule resource. be created.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the name of the grandparent EventHub Namespace.
	NamespaceName pulumi.StringInput `pulumi:"namespaceName"`
	// The name of the resource group in which the EventHub Authorization Rule's grandparent Namespace exists.
	ResourceGroupName pulumi.StringInput  `pulumi:"resourceGroupName"`
	Send              pulumi.BoolPtrInput `pulumi:"send"`
}

func (LookupAuthorizationRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthorizationRuleArgs)(nil)).Elem()
}

// A collection of values returned by getAuthorizationRule.
type LookupAuthorizationRuleResultOutput struct{ *pulumi.OutputState }

func (LookupAuthorizationRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthorizationRuleResult)(nil)).Elem()
}

func (o LookupAuthorizationRuleResultOutput) ToLookupAuthorizationRuleResultOutput() LookupAuthorizationRuleResultOutput {
	return o
}

func (o LookupAuthorizationRuleResultOutput) ToLookupAuthorizationRuleResultOutputWithContext(ctx context.Context) LookupAuthorizationRuleResultOutput {
	return o
}

func (o LookupAuthorizationRuleResultOutput) EventhubName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.EventhubName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAuthorizationRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAuthorizationRuleResultOutput) Listen() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) *bool { return v.Listen }).(pulumi.BoolPtrOutput)
}

func (o LookupAuthorizationRuleResultOutput) Manage() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) *bool { return v.Manage }).(pulumi.BoolPtrOutput)
}

func (o LookupAuthorizationRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAuthorizationRuleResultOutput) NamespaceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.NamespaceName }).(pulumi.StringOutput)
}

// The Primary Connection String for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) PrimaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.PrimaryConnectionString }).(pulumi.StringOutput)
}

// The alias of the Primary Connection String for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) PrimaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.PrimaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The Primary Key for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) PrimaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.PrimaryKey }).(pulumi.StringOutput)
}

func (o LookupAuthorizationRuleResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The Secondary Connection String for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) SecondaryConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.SecondaryConnectionString }).(pulumi.StringOutput)
}

// The alias of the Secondary Connection String for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) SecondaryConnectionStringAlias() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.SecondaryConnectionStringAlias }).(pulumi.StringOutput)
}

// The Secondary Key for the Event Hubs Authorization Rule.
func (o LookupAuthorizationRuleResultOutput) SecondaryKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) string { return v.SecondaryKey }).(pulumi.StringOutput)
}

func (o LookupAuthorizationRuleResultOutput) Send() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupAuthorizationRuleResult) *bool { return v.Send }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuthorizationRuleResultOutput{})
}
