// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package netapp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing NetApp Account Encryption Resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/netapp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := netapp.LookupAccountEncryption(ctx, &netapp.LookupAccountEncryptionArgs{
//				NetappAccountId: "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1",
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
// * `Microsoft.NetApp`: 2025-01-01
func LookupAccountEncryption(ctx *pulumi.Context, args *LookupAccountEncryptionArgs, opts ...pulumi.InvokeOption) (*LookupAccountEncryptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountEncryptionResult
	err := ctx.Invoke("azure:netapp/getAccountEncryption:getAccountEncryption", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountEncryption.
type LookupAccountEncryptionArgs struct {
	// The ID of the NetApp account where customer managed keys-based encryption is enabled.
	NetappAccountId string `pulumi:"netappAccountId"`
}

// A collection of values returned by getAccountEncryption.
type LookupAccountEncryptionResult struct {
	EncryptionKey string `pulumi:"encryptionKey"`
	// The provider-assigned unique ID for this managed resource.
	Id                                string `pulumi:"id"`
	NetappAccountId                   string `pulumi:"netappAccountId"`
	SystemAssignedIdentityPrincipalId string `pulumi:"systemAssignedIdentityPrincipalId"`
	UserAssignedIdentityId            string `pulumi:"userAssignedIdentityId"`
}

func LookupAccountEncryptionOutput(ctx *pulumi.Context, args LookupAccountEncryptionOutputArgs, opts ...pulumi.InvokeOption) LookupAccountEncryptionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAccountEncryptionResultOutput, error) {
			args := v.(LookupAccountEncryptionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("azure:netapp/getAccountEncryption:getAccountEncryption", args, LookupAccountEncryptionResultOutput{}, options).(LookupAccountEncryptionResultOutput), nil
		}).(LookupAccountEncryptionResultOutput)
}

// A collection of arguments for invoking getAccountEncryption.
type LookupAccountEncryptionOutputArgs struct {
	// The ID of the NetApp account where customer managed keys-based encryption is enabled.
	NetappAccountId pulumi.StringInput `pulumi:"netappAccountId"`
}

func (LookupAccountEncryptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountEncryptionArgs)(nil)).Elem()
}

// A collection of values returned by getAccountEncryption.
type LookupAccountEncryptionResultOutput struct{ *pulumi.OutputState }

func (LookupAccountEncryptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountEncryptionResult)(nil)).Elem()
}

func (o LookupAccountEncryptionResultOutput) ToLookupAccountEncryptionResultOutput() LookupAccountEncryptionResultOutput {
	return o
}

func (o LookupAccountEncryptionResultOutput) ToLookupAccountEncryptionResultOutputWithContext(ctx context.Context) LookupAccountEncryptionResultOutput {
	return o
}

func (o LookupAccountEncryptionResultOutput) EncryptionKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountEncryptionResult) string { return v.EncryptionKey }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountEncryptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountEncryptionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccountEncryptionResultOutput) NetappAccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountEncryptionResult) string { return v.NetappAccountId }).(pulumi.StringOutput)
}

func (o LookupAccountEncryptionResultOutput) SystemAssignedIdentityPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountEncryptionResult) string { return v.SystemAssignedIdentityPrincipalId }).(pulumi.StringOutput)
}

func (o LookupAccountEncryptionResultOutput) UserAssignedIdentityId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountEncryptionResult) string { return v.UserAssignedIdentityId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountEncryptionResultOutput{})
}
