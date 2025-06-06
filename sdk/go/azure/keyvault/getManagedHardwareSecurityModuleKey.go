// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package keyvault

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Managed Hardware Security Module Key.
//
// > **Note:** All arguments including the secret value will be stored in the raw state as plain-text.
// [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/keyvault"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := keyvault.LookupManagedHardwareSecurityModuleKey(ctx, &keyvault.LookupManagedHardwareSecurityModuleKeyArgs{
//				ManagedHsmId: exampleAzurermKeyVaultManagedHardwareSecurityModule.Id,
//				Name:         exampleAzurermKeyVaultManagedHardwareSecurityModuleKey.Name,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("hsm-key-vesrion", example.Version)
//			return nil
//		})
//	}
//
// ```
func LookupManagedHardwareSecurityModuleKey(ctx *pulumi.Context, args *LookupManagedHardwareSecurityModuleKeyArgs, opts ...pulumi.InvokeOption) (*LookupManagedHardwareSecurityModuleKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupManagedHardwareSecurityModuleKeyResult
	err := ctx.Invoke("azure:keyvault/getManagedHardwareSecurityModuleKey:getManagedHardwareSecurityModuleKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getManagedHardwareSecurityModuleKey.
type LookupManagedHardwareSecurityModuleKeyArgs struct {
	// Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
	//
	// > **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
	ManagedHsmId string `pulumi:"managedHsmId"`
	// Specifies the name of the Managed Hardware Security Module Key.
	Name string `pulumi:"name"`
}

// A collection of values returned by getManagedHardwareSecurityModuleKey.
type LookupManagedHardwareSecurityModuleKeyResult struct {
	// The EC Curve name of this Managed Hardware Security Module Key.
	Curve          string `pulumi:"curve"`
	ExpirationDate string `pulumi:"expirationDate"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of JSON web key operations assigned to this Managed Hardware Security Module Key
	KeyOpts []string `pulumi:"keyOpts"`
	// Specifies the Size of this Managed Hardware Security Module Key.
	KeySize int `pulumi:"keySize"`
	// Specifies the Key Type of this Managed Hardware Security Module Key
	KeyType       string `pulumi:"keyType"`
	ManagedHsmId  string `pulumi:"managedHsmId"`
	Name          string `pulumi:"name"`
	NotBeforeDate string `pulumi:"notBeforeDate"`
	// A mapping of tags assigned to this Managed Hardware Security Module Key.
	Tags map[string]string `pulumi:"tags"`
	// The current version of the Managed Hardware Security Module Key.
	Version string `pulumi:"version"`
	// The versioned ID of the Managed Hardware Security Module Key.
	VersionedId string `pulumi:"versionedId"`
}

func LookupManagedHardwareSecurityModuleKeyOutput(ctx *pulumi.Context, args LookupManagedHardwareSecurityModuleKeyOutputArgs, opts ...pulumi.InvokeOption) LookupManagedHardwareSecurityModuleKeyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupManagedHardwareSecurityModuleKeyResultOutput, error) {
			args := v.(LookupManagedHardwareSecurityModuleKeyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:keyvault/getManagedHardwareSecurityModuleKey:getManagedHardwareSecurityModuleKey", args, LookupManagedHardwareSecurityModuleKeyResultOutput{}, options).(LookupManagedHardwareSecurityModuleKeyResultOutput), nil
		}).(LookupManagedHardwareSecurityModuleKeyResultOutput)
}

// A collection of arguments for invoking getManagedHardwareSecurityModuleKey.
type LookupManagedHardwareSecurityModuleKeyOutputArgs struct {
	// Specifies the ID of the Managed Hardware Security Module instance where the Secret resides, available on the `keyvault.ManagedHardwareSecurityModuleKey` Data Source / Resource.
	//
	// > **Note:** The Managed Hardware Security Module must be in the same subscription as the provider. If the Managed Hardware Security Module is in another subscription, you must create an aliased provider for that subscription.
	ManagedHsmId pulumi.StringInput `pulumi:"managedHsmId"`
	// Specifies the name of the Managed Hardware Security Module Key.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupManagedHardwareSecurityModuleKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManagedHardwareSecurityModuleKeyArgs)(nil)).Elem()
}

// A collection of values returned by getManagedHardwareSecurityModuleKey.
type LookupManagedHardwareSecurityModuleKeyResultOutput struct{ *pulumi.OutputState }

func (LookupManagedHardwareSecurityModuleKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupManagedHardwareSecurityModuleKeyResult)(nil)).Elem()
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) ToLookupManagedHardwareSecurityModuleKeyResultOutput() LookupManagedHardwareSecurityModuleKeyResultOutput {
	return o
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) ToLookupManagedHardwareSecurityModuleKeyResultOutputWithContext(ctx context.Context) LookupManagedHardwareSecurityModuleKeyResultOutput {
	return o
}

// The EC Curve name of this Managed Hardware Security Module Key.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) Curve() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.Curve }).(pulumi.StringOutput)
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) ExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.ExpirationDate }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of JSON web key operations assigned to this Managed Hardware Security Module Key
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) KeyOpts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) []string { return v.KeyOpts }).(pulumi.StringArrayOutput)
}

// Specifies the Size of this Managed Hardware Security Module Key.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) KeySize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) int { return v.KeySize }).(pulumi.IntOutput)
}

// Specifies the Key Type of this Managed Hardware Security Module Key
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) KeyType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.KeyType }).(pulumi.StringOutput)
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) ManagedHsmId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.ManagedHsmId }).(pulumi.StringOutput)
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupManagedHardwareSecurityModuleKeyResultOutput) NotBeforeDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.NotBeforeDate }).(pulumi.StringOutput)
}

// A mapping of tags assigned to this Managed Hardware Security Module Key.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The current version of the Managed Hardware Security Module Key.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.Version }).(pulumi.StringOutput)
}

// The versioned ID of the Managed Hardware Security Module Key.
func (o LookupManagedHardwareSecurityModuleKeyResultOutput) VersionedId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupManagedHardwareSecurityModuleKeyResult) string { return v.VersionedId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupManagedHardwareSecurityModuleKeyResultOutput{})
}
