// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticsan

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Elastic SAN Volume Group.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/elasticsan"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := elasticsan.Get(ctx, &elasticsan.GetArgs{
//				Name:              "existing",
//				ResourceGroupName: "existing",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleGetVolumeGroup, err := elasticsan.LookupVolumeGroup(ctx, &elasticsan.LookupVolumeGroupArgs{
//				Name:         "existing",
//				ElasticSanId: example.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", exampleGetVolumeGroup.Id)
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
// * `Microsoft.ElasticSan`: 2023-01-01
func LookupVolumeGroup(ctx *pulumi.Context, args *LookupVolumeGroupArgs, opts ...pulumi.InvokeOption) (*LookupVolumeGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVolumeGroupResult
	err := ctx.Invoke("azure:elasticsan/getVolumeGroup:getVolumeGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumeGroup.
type LookupVolumeGroupArgs struct {
	// The Elastic SAN ID within which the Elastic SAN Volume Group exists.
	ElasticSanId string `pulumi:"elasticSanId"`
	// The name of the Elastic SAN Volume Group.
	Name string `pulumi:"name"`
}

// A collection of values returned by getVolumeGroup.
type LookupVolumeGroupResult struct {
	ElasticSanId string `pulumi:"elasticSanId"`
	// The type of the key used to encrypt the data of the disk.
	EncryptionType string `pulumi:"encryptionType"`
	// An `encryption` block as defined below.
	Encryptions []GetVolumeGroupEncryption `pulumi:"encryptions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `identity` block as defined below.
	Identities []GetVolumeGroupIdentity `pulumi:"identities"`
	Name       string                   `pulumi:"name"`
	// One or more `networkRule` blocks as defined below.
	NetworkRules []GetVolumeGroupNetworkRule `pulumi:"networkRules"`
	// The type of the storage target.
	ProtocolType string `pulumi:"protocolType"`
}

func LookupVolumeGroupOutput(ctx *pulumi.Context, args LookupVolumeGroupOutputArgs, opts ...pulumi.InvokeOption) LookupVolumeGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupVolumeGroupResultOutput, error) {
			args := v.(LookupVolumeGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:elasticsan/getVolumeGroup:getVolumeGroup", args, LookupVolumeGroupResultOutput{}, options).(LookupVolumeGroupResultOutput), nil
		}).(LookupVolumeGroupResultOutput)
}

// A collection of arguments for invoking getVolumeGroup.
type LookupVolumeGroupOutputArgs struct {
	// The Elastic SAN ID within which the Elastic SAN Volume Group exists.
	ElasticSanId pulumi.StringInput `pulumi:"elasticSanId"`
	// The name of the Elastic SAN Volume Group.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupVolumeGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeGroupArgs)(nil)).Elem()
}

// A collection of values returned by getVolumeGroup.
type LookupVolumeGroupResultOutput struct{ *pulumi.OutputState }

func (LookupVolumeGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeGroupResult)(nil)).Elem()
}

func (o LookupVolumeGroupResultOutput) ToLookupVolumeGroupResultOutput() LookupVolumeGroupResultOutput {
	return o
}

func (o LookupVolumeGroupResultOutput) ToLookupVolumeGroupResultOutputWithContext(ctx context.Context) LookupVolumeGroupResultOutput {
	return o
}

func (o LookupVolumeGroupResultOutput) ElasticSanId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) string { return v.ElasticSanId }).(pulumi.StringOutput)
}

// The type of the key used to encrypt the data of the disk.
func (o LookupVolumeGroupResultOutput) EncryptionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) string { return v.EncryptionType }).(pulumi.StringOutput)
}

// An `encryption` block as defined below.
func (o LookupVolumeGroupResultOutput) Encryptions() GetVolumeGroupEncryptionArrayOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) []GetVolumeGroupEncryption { return v.Encryptions }).(GetVolumeGroupEncryptionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupVolumeGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// An `identity` block as defined below.
func (o LookupVolumeGroupResultOutput) Identities() GetVolumeGroupIdentityArrayOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) []GetVolumeGroupIdentity { return v.Identities }).(GetVolumeGroupIdentityArrayOutput)
}

func (o LookupVolumeGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

// One or more `networkRule` blocks as defined below.
func (o LookupVolumeGroupResultOutput) NetworkRules() GetVolumeGroupNetworkRuleArrayOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) []GetVolumeGroupNetworkRule { return v.NetworkRules }).(GetVolumeGroupNetworkRuleArrayOutput)
}

// The type of the storage target.
func (o LookupVolumeGroupResultOutput) ProtocolType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeGroupResult) string { return v.ProtocolType }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVolumeGroupResultOutput{})
}
