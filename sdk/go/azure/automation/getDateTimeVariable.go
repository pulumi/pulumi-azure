// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package automation

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Automation Datetime Variable.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/automation"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := automation.LookupDateTimeVariable(ctx, &automation.LookupDateTimeVariableArgs{
//				Name:                  "tfex-example-var",
//				ResourceGroupName:     "tfex-example-rg",
//				AutomationAccountName: "tfex-example-account",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("variableId", example.Id)
//			return nil
//		})
//	}
//
// ```
func LookupDateTimeVariable(ctx *pulumi.Context, args *LookupDateTimeVariableArgs, opts ...pulumi.InvokeOption) (*LookupDateTimeVariableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDateTimeVariableResult
	err := ctx.Invoke("azure:automation/getDateTimeVariable:getDateTimeVariable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDateTimeVariable.
type LookupDateTimeVariableArgs struct {
	// The name of the automation account in which the Automation Variable exists.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The name of the Automation Variable.
	Name string `pulumi:"name"`
	// The Name of the Resource Group where the automation account exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getDateTimeVariable.
type LookupDateTimeVariableResult struct {
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The description of the Automation Variable.
	Description string `pulumi:"description"`
	// Specifies if the Automation Variable is encrypted. Defaults to `false`.
	Encrypted bool `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The value of the Automation Variable in the [RFC3339 Section 5.6 Internet Date/Time Format](https://tools.ietf.org/html/rfc3339#section-5.6).
	Value string `pulumi:"value"`
}

func LookupDateTimeVariableOutput(ctx *pulumi.Context, args LookupDateTimeVariableOutputArgs, opts ...pulumi.InvokeOption) LookupDateTimeVariableResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDateTimeVariableResultOutput, error) {
			args := v.(LookupDateTimeVariableArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:automation/getDateTimeVariable:getDateTimeVariable", args, LookupDateTimeVariableResultOutput{}, options).(LookupDateTimeVariableResultOutput), nil
		}).(LookupDateTimeVariableResultOutput)
}

// A collection of arguments for invoking getDateTimeVariable.
type LookupDateTimeVariableOutputArgs struct {
	// The name of the automation account in which the Automation Variable exists.
	AutomationAccountName pulumi.StringInput `pulumi:"automationAccountName"`
	// The name of the Automation Variable.
	Name pulumi.StringInput `pulumi:"name"`
	// The Name of the Resource Group where the automation account exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupDateTimeVariableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDateTimeVariableArgs)(nil)).Elem()
}

// A collection of values returned by getDateTimeVariable.
type LookupDateTimeVariableResultOutput struct{ *pulumi.OutputState }

func (LookupDateTimeVariableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDateTimeVariableResult)(nil)).Elem()
}

func (o LookupDateTimeVariableResultOutput) ToLookupDateTimeVariableResultOutput() LookupDateTimeVariableResultOutput {
	return o
}

func (o LookupDateTimeVariableResultOutput) ToLookupDateTimeVariableResultOutputWithContext(ctx context.Context) LookupDateTimeVariableResultOutput {
	return o
}

func (o LookupDateTimeVariableResultOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// The description of the Automation Variable.
func (o LookupDateTimeVariableResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.Description }).(pulumi.StringOutput)
}

// Specifies if the Automation Variable is encrypted. Defaults to `false`.
func (o LookupDateTimeVariableResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDateTimeVariableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDateTimeVariableResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDateTimeVariableResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The value of the Automation Variable in the [RFC3339 Section 5.6 Internet Date/Time Format](https://tools.ietf.org/html/rfc3339#section-5.6).
func (o LookupDateTimeVariableResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDateTimeVariableResult) string { return v.Value }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDateTimeVariableResultOutput{})
}
