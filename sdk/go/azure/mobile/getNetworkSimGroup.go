// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mobile

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a Mobile Network Sim Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/mobile"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := mobile.LookupNetwork(ctx, &mobile.LookupNetworkArgs{
//				Name:              "example-mn",
//				ResourceGroupName: exampleAzurermResourceGroup.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = mobile.LookupNetworkSimGroup(ctx, &mobile.LookupNetworkSimGroupArgs{
//				Name:            "example-mnsg",
//				MobileNetworkId: example.Id,
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
// * `Microsoft.MobileNetwork`: 2022-11-01
func LookupNetworkSimGroup(ctx *pulumi.Context, args *LookupNetworkSimGroupArgs, opts ...pulumi.InvokeOption) (*LookupNetworkSimGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkSimGroupResult
	err := ctx.Invoke("azure:mobile/getNetworkSimGroup:getNetworkSimGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkSimGroup.
type LookupNetworkSimGroupArgs struct {
	// The ID of Mobile Network which the Mobile Network Sim Group belongs to.
	MobileNetworkId string `pulumi:"mobileNetworkId"`
	// Specifies the name which should be used for this Mobile Network Sim Groups.
	Name string `pulumi:"name"`
}

// A collection of values returned by getNetworkSimGroup.
type LookupNetworkSimGroupResult struct {
	// A key to encrypt the SIM data that belongs to this SIM group.
	EncryptionKeyUrl string `pulumi:"encryptionKeyUrl"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `identity` block as defined below.
	Identities []GetNetworkSimGroupIdentity `pulumi:"identities"`
	// The Azure Region where the Mobile Network Sim Groups should exist.
	Location        string `pulumi:"location"`
	MobileNetworkId string `pulumi:"mobileNetworkId"`
	Name            string `pulumi:"name"`
	// A mapping of tags which should be assigned to the Mobile Network Sim Groups.
	Tags map[string]string `pulumi:"tags"`
}

func LookupNetworkSimGroupOutput(ctx *pulumi.Context, args LookupNetworkSimGroupOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkSimGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkSimGroupResultOutput, error) {
			args := v.(LookupNetworkSimGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:mobile/getNetworkSimGroup:getNetworkSimGroup", args, LookupNetworkSimGroupResultOutput{}, options).(LookupNetworkSimGroupResultOutput), nil
		}).(LookupNetworkSimGroupResultOutput)
}

// A collection of arguments for invoking getNetworkSimGroup.
type LookupNetworkSimGroupOutputArgs struct {
	// The ID of Mobile Network which the Mobile Network Sim Group belongs to.
	MobileNetworkId pulumi.StringInput `pulumi:"mobileNetworkId"`
	// Specifies the name which should be used for this Mobile Network Sim Groups.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNetworkSimGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkSimGroupArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkSimGroup.
type LookupNetworkSimGroupResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkSimGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkSimGroupResult)(nil)).Elem()
}

func (o LookupNetworkSimGroupResultOutput) ToLookupNetworkSimGroupResultOutput() LookupNetworkSimGroupResultOutput {
	return o
}

func (o LookupNetworkSimGroupResultOutput) ToLookupNetworkSimGroupResultOutputWithContext(ctx context.Context) LookupNetworkSimGroupResultOutput {
	return o
}

// A key to encrypt the SIM data that belongs to this SIM group.
func (o LookupNetworkSimGroupResultOutput) EncryptionKeyUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) string { return v.EncryptionKeyUrl }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkSimGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// An `identity` block as defined below.
func (o LookupNetworkSimGroupResultOutput) Identities() GetNetworkSimGroupIdentityArrayOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) []GetNetworkSimGroupIdentity { return v.Identities }).(GetNetworkSimGroupIdentityArrayOutput)
}

// The Azure Region where the Mobile Network Sim Groups should exist.
func (o LookupNetworkSimGroupResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupNetworkSimGroupResultOutput) MobileNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) string { return v.MobileNetworkId }).(pulumi.StringOutput)
}

func (o LookupNetworkSimGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Mobile Network Sim Groups.
func (o LookupNetworkSimGroupResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkSimGroupResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkSimGroupResultOutput{})
}
