// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Disk Encryption Set.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			existing, err := compute.LookupDiskEncryptionSet(ctx, &compute.LookupDiskEncryptionSetArgs{
//				Name:              "example-des",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", existing.Id)
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
// * `Microsoft.Compute`: 2022-03-02
func LookupDiskEncryptionSet(ctx *pulumi.Context, args *LookupDiskEncryptionSetArgs, opts ...pulumi.InvokeOption) (*LookupDiskEncryptionSetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDiskEncryptionSetResult
	err := ctx.Invoke("azure:compute/getDiskEncryptionSet:getDiskEncryptionSet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDiskEncryptionSet.
type LookupDiskEncryptionSetArgs struct {
	// The name of the existing Disk Encryption Set.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Disk Encryption Set exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getDiskEncryptionSet.
type LookupDiskEncryptionSetResult struct {
	// Is the Azure Disk Encryption Set Key automatically rotated to latest version?
	AutoKeyRotationEnabled bool `pulumi:"autoKeyRotationEnabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An `identity` block as defined below.
	Identities []GetDiskEncryptionSetIdentity `pulumi:"identities"`
	// The URL for the Key Vault Key or Key Vault Secret that is currently being used by the service.
	KeyVaultKeyUrl string `pulumi:"keyVaultKeyUrl"`
	// The location where the Disk Encryption Set exists.
	Location          string `pulumi:"location"`
	Name              string `pulumi:"name"`
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the Disk Encryption Set.
	Tags map[string]string `pulumi:"tags"`
}

func LookupDiskEncryptionSetOutput(ctx *pulumi.Context, args LookupDiskEncryptionSetOutputArgs, opts ...pulumi.InvokeOption) LookupDiskEncryptionSetResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDiskEncryptionSetResultOutput, error) {
			args := v.(LookupDiskEncryptionSetArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:compute/getDiskEncryptionSet:getDiskEncryptionSet", args, LookupDiskEncryptionSetResultOutput{}, options).(LookupDiskEncryptionSetResultOutput), nil
		}).(LookupDiskEncryptionSetResultOutput)
}

// A collection of arguments for invoking getDiskEncryptionSet.
type LookupDiskEncryptionSetOutputArgs struct {
	// The name of the existing Disk Encryption Set.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where the Disk Encryption Set exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupDiskEncryptionSetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDiskEncryptionSetArgs)(nil)).Elem()
}

// A collection of values returned by getDiskEncryptionSet.
type LookupDiskEncryptionSetResultOutput struct{ *pulumi.OutputState }

func (LookupDiskEncryptionSetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDiskEncryptionSetResult)(nil)).Elem()
}

func (o LookupDiskEncryptionSetResultOutput) ToLookupDiskEncryptionSetResultOutput() LookupDiskEncryptionSetResultOutput {
	return o
}

func (o LookupDiskEncryptionSetResultOutput) ToLookupDiskEncryptionSetResultOutputWithContext(ctx context.Context) LookupDiskEncryptionSetResultOutput {
	return o
}

// Is the Azure Disk Encryption Set Key automatically rotated to latest version?
func (o LookupDiskEncryptionSetResultOutput) AutoKeyRotationEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) bool { return v.AutoKeyRotationEnabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDiskEncryptionSetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) string { return v.Id }).(pulumi.StringOutput)
}

// An `identity` block as defined below.
func (o LookupDiskEncryptionSetResultOutput) Identities() GetDiskEncryptionSetIdentityArrayOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) []GetDiskEncryptionSetIdentity { return v.Identities }).(GetDiskEncryptionSetIdentityArrayOutput)
}

// The URL for the Key Vault Key or Key Vault Secret that is currently being used by the service.
func (o LookupDiskEncryptionSetResultOutput) KeyVaultKeyUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) string { return v.KeyVaultKeyUrl }).(pulumi.StringOutput)
}

// The location where the Disk Encryption Set exists.
func (o LookupDiskEncryptionSetResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) string { return v.Location }).(pulumi.StringOutput)
}

func (o LookupDiskEncryptionSetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDiskEncryptionSetResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the Disk Encryption Set.
func (o LookupDiskEncryptionSetResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupDiskEncryptionSetResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDiskEncryptionSetResultOutput{})
}
