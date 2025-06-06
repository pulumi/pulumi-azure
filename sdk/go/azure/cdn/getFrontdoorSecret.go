// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cdn

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Front Door (standard/premium) Secret.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/cdn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cdn.LookupFrontdoorSecret(ctx, &cdn.LookupFrontdoorSecretArgs{
//				Name:              "example-secret",
//				ProfileName:       "example-profile",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFrontdoorSecret(ctx *pulumi.Context, args *LookupFrontdoorSecretArgs, opts ...pulumi.InvokeOption) (*LookupFrontdoorSecretResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFrontdoorSecretResult
	err := ctx.Invoke("azure:cdn/getFrontdoorSecret:getFrontdoorSecret", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFrontdoorSecret.
type LookupFrontdoorSecretArgs struct {
	// Specifies the name of the Front Door Secret.
	Name string `pulumi:"name"`
	// The name of the Front Door Profile within which the Front Door Secret exists.
	ProfileName string `pulumi:"profileName"`
	// The name of the Resource Group where the Front Door Profile exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getFrontdoorSecret.
type LookupFrontdoorSecretResult struct {
	// Specifies the ID of the Front Door Profile within which this Front Door Secret exists.
	CdnFrontdoorProfileId string `pulumi:"cdnFrontdoorProfileId"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	Name              string `pulumi:"name"`
	ProfileName       string `pulumi:"profileName"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `secret` block as defined below.
	Secrets []GetFrontdoorSecretSecret `pulumi:"secrets"`
}

func LookupFrontdoorSecretOutput(ctx *pulumi.Context, args LookupFrontdoorSecretOutputArgs, opts ...pulumi.InvokeOption) LookupFrontdoorSecretResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFrontdoorSecretResultOutput, error) {
			args := v.(LookupFrontdoorSecretArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:cdn/getFrontdoorSecret:getFrontdoorSecret", args, LookupFrontdoorSecretResultOutput{}, options).(LookupFrontdoorSecretResultOutput), nil
		}).(LookupFrontdoorSecretResultOutput)
}

// A collection of arguments for invoking getFrontdoorSecret.
type LookupFrontdoorSecretOutputArgs struct {
	// Specifies the name of the Front Door Secret.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Front Door Profile within which the Front Door Secret exists.
	ProfileName pulumi.StringInput `pulumi:"profileName"`
	// The name of the Resource Group where the Front Door Profile exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupFrontdoorSecretOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFrontdoorSecretArgs)(nil)).Elem()
}

// A collection of values returned by getFrontdoorSecret.
type LookupFrontdoorSecretResultOutput struct{ *pulumi.OutputState }

func (LookupFrontdoorSecretResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFrontdoorSecretResult)(nil)).Elem()
}

func (o LookupFrontdoorSecretResultOutput) ToLookupFrontdoorSecretResultOutput() LookupFrontdoorSecretResultOutput {
	return o
}

func (o LookupFrontdoorSecretResultOutput) ToLookupFrontdoorSecretResultOutputWithContext(ctx context.Context) LookupFrontdoorSecretResultOutput {
	return o
}

// Specifies the ID of the Front Door Profile within which this Front Door Secret exists.
func (o LookupFrontdoorSecretResultOutput) CdnFrontdoorProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) string { return v.CdnFrontdoorProfileId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFrontdoorSecretResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupFrontdoorSecretResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupFrontdoorSecretResultOutput) ProfileName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) string { return v.ProfileName }).(pulumi.StringOutput)
}

func (o LookupFrontdoorSecretResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A `secret` block as defined below.
func (o LookupFrontdoorSecretResultOutput) Secrets() GetFrontdoorSecretSecretArrayOutput {
	return o.ApplyT(func(v LookupFrontdoorSecretResult) []GetFrontdoorSecretSecret { return v.Secrets }).(GetFrontdoorSecretSecretArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFrontdoorSecretResultOutput{})
}
