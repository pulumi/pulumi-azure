// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Web Application Firewall Policy.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/waf"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := waf.GetFirewallPolicy(ctx, &waf.GetFirewallPolicyArgs{
//				ResourceGroupName: "existing",
//				Name:              "existing",
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
// * `Microsoft.Network`: 2024-05-01
func GetFirewallPolicy(ctx *pulumi.Context, args *GetFirewallPolicyArgs, opts ...pulumi.InvokeOption) (*GetFirewallPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFirewallPolicyResult
	err := ctx.Invoke("azure:waf/getFirewallPolicy:getFirewallPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewallPolicy.
type GetFirewallPolicyArgs struct {
	// The name of the Web Application Firewall Policy
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Web Application Firewall Policy exists.
	ResourceGroupName string            `pulumi:"resourceGroupName"`
	Tags              map[string]string `pulumi:"tags"`
}

// A collection of values returned by getFirewallPolicy.
type GetFirewallPolicyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                string            `pulumi:"id"`
	Location          string            `pulumi:"location"`
	Name              string            `pulumi:"name"`
	ResourceGroupName string            `pulumi:"resourceGroupName"`
	Tags              map[string]string `pulumi:"tags"`
}

func GetFirewallPolicyOutput(ctx *pulumi.Context, args GetFirewallPolicyOutputArgs, opts ...pulumi.InvokeOption) GetFirewallPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetFirewallPolicyResultOutput, error) {
			args := v.(GetFirewallPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:waf/getFirewallPolicy:getFirewallPolicy", args, GetFirewallPolicyResultOutput{}, options).(GetFirewallPolicyResultOutput), nil
		}).(GetFirewallPolicyResultOutput)
}

// A collection of arguments for invoking getFirewallPolicy.
type GetFirewallPolicyOutputArgs struct {
	// The name of the Web Application Firewall Policy
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Web Application Firewall Policy exists.
	ResourceGroupName pulumi.StringInput    `pulumi:"resourceGroupName"`
	Tags              pulumi.StringMapInput `pulumi:"tags"`
}

func (GetFirewallPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getFirewallPolicy.
type GetFirewallPolicyResultOutput struct{ *pulumi.OutputState }

func (GetFirewallPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallPolicyResult)(nil)).Elem()
}

func (o GetFirewallPolicyResultOutput) ToGetFirewallPolicyResultOutput() GetFirewallPolicyResultOutput {
	return o
}

func (o GetFirewallPolicyResultOutput) ToGetFirewallPolicyResultOutputWithContext(ctx context.Context) GetFirewallPolicyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetFirewallPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFirewallPolicyResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallPolicyResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o GetFirewallPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetFirewallPolicyResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallPolicyResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func (o GetFirewallPolicyResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetFirewallPolicyResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFirewallPolicyResultOutput{})
}
