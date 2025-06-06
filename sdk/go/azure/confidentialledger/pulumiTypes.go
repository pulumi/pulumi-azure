// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confidentialledger

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type LedgerAzureadBasedServicePrincipal struct {
	// Specifies the Ledger Role to grant this AzureAD Service Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
	LedgerRoleName string `pulumi:"ledgerRoleName"`
	// Specifies the Principal ID of the AzureAD Service Principal.
	PrincipalId string `pulumi:"principalId"`
	// Specifies the Tenant ID for this AzureAD Service Principal.
	TenantId string `pulumi:"tenantId"`
}

// LedgerAzureadBasedServicePrincipalInput is an input type that accepts LedgerAzureadBasedServicePrincipalArgs and LedgerAzureadBasedServicePrincipalOutput values.
// You can construct a concrete instance of `LedgerAzureadBasedServicePrincipalInput` via:
//
//	LedgerAzureadBasedServicePrincipalArgs{...}
type LedgerAzureadBasedServicePrincipalInput interface {
	pulumi.Input

	ToLedgerAzureadBasedServicePrincipalOutput() LedgerAzureadBasedServicePrincipalOutput
	ToLedgerAzureadBasedServicePrincipalOutputWithContext(context.Context) LedgerAzureadBasedServicePrincipalOutput
}

type LedgerAzureadBasedServicePrincipalArgs struct {
	// Specifies the Ledger Role to grant this AzureAD Service Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
	LedgerRoleName pulumi.StringInput `pulumi:"ledgerRoleName"`
	// Specifies the Principal ID of the AzureAD Service Principal.
	PrincipalId pulumi.StringInput `pulumi:"principalId"`
	// Specifies the Tenant ID for this AzureAD Service Principal.
	TenantId pulumi.StringInput `pulumi:"tenantId"`
}

func (LedgerAzureadBasedServicePrincipalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LedgerAzureadBasedServicePrincipal)(nil)).Elem()
}

func (i LedgerAzureadBasedServicePrincipalArgs) ToLedgerAzureadBasedServicePrincipalOutput() LedgerAzureadBasedServicePrincipalOutput {
	return i.ToLedgerAzureadBasedServicePrincipalOutputWithContext(context.Background())
}

func (i LedgerAzureadBasedServicePrincipalArgs) ToLedgerAzureadBasedServicePrincipalOutputWithContext(ctx context.Context) LedgerAzureadBasedServicePrincipalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerAzureadBasedServicePrincipalOutput)
}

// LedgerAzureadBasedServicePrincipalArrayInput is an input type that accepts LedgerAzureadBasedServicePrincipalArray and LedgerAzureadBasedServicePrincipalArrayOutput values.
// You can construct a concrete instance of `LedgerAzureadBasedServicePrincipalArrayInput` via:
//
//	LedgerAzureadBasedServicePrincipalArray{ LedgerAzureadBasedServicePrincipalArgs{...} }
type LedgerAzureadBasedServicePrincipalArrayInput interface {
	pulumi.Input

	ToLedgerAzureadBasedServicePrincipalArrayOutput() LedgerAzureadBasedServicePrincipalArrayOutput
	ToLedgerAzureadBasedServicePrincipalArrayOutputWithContext(context.Context) LedgerAzureadBasedServicePrincipalArrayOutput
}

type LedgerAzureadBasedServicePrincipalArray []LedgerAzureadBasedServicePrincipalInput

func (LedgerAzureadBasedServicePrincipalArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LedgerAzureadBasedServicePrincipal)(nil)).Elem()
}

func (i LedgerAzureadBasedServicePrincipalArray) ToLedgerAzureadBasedServicePrincipalArrayOutput() LedgerAzureadBasedServicePrincipalArrayOutput {
	return i.ToLedgerAzureadBasedServicePrincipalArrayOutputWithContext(context.Background())
}

func (i LedgerAzureadBasedServicePrincipalArray) ToLedgerAzureadBasedServicePrincipalArrayOutputWithContext(ctx context.Context) LedgerAzureadBasedServicePrincipalArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerAzureadBasedServicePrincipalArrayOutput)
}

type LedgerAzureadBasedServicePrincipalOutput struct{ *pulumi.OutputState }

func (LedgerAzureadBasedServicePrincipalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LedgerAzureadBasedServicePrincipal)(nil)).Elem()
}

func (o LedgerAzureadBasedServicePrincipalOutput) ToLedgerAzureadBasedServicePrincipalOutput() LedgerAzureadBasedServicePrincipalOutput {
	return o
}

func (o LedgerAzureadBasedServicePrincipalOutput) ToLedgerAzureadBasedServicePrincipalOutputWithContext(ctx context.Context) LedgerAzureadBasedServicePrincipalOutput {
	return o
}

// Specifies the Ledger Role to grant this AzureAD Service Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
func (o LedgerAzureadBasedServicePrincipalOutput) LedgerRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v LedgerAzureadBasedServicePrincipal) string { return v.LedgerRoleName }).(pulumi.StringOutput)
}

// Specifies the Principal ID of the AzureAD Service Principal.
func (o LedgerAzureadBasedServicePrincipalOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v LedgerAzureadBasedServicePrincipal) string { return v.PrincipalId }).(pulumi.StringOutput)
}

// Specifies the Tenant ID for this AzureAD Service Principal.
func (o LedgerAzureadBasedServicePrincipalOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v LedgerAzureadBasedServicePrincipal) string { return v.TenantId }).(pulumi.StringOutput)
}

type LedgerAzureadBasedServicePrincipalArrayOutput struct{ *pulumi.OutputState }

func (LedgerAzureadBasedServicePrincipalArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LedgerAzureadBasedServicePrincipal)(nil)).Elem()
}

func (o LedgerAzureadBasedServicePrincipalArrayOutput) ToLedgerAzureadBasedServicePrincipalArrayOutput() LedgerAzureadBasedServicePrincipalArrayOutput {
	return o
}

func (o LedgerAzureadBasedServicePrincipalArrayOutput) ToLedgerAzureadBasedServicePrincipalArrayOutputWithContext(ctx context.Context) LedgerAzureadBasedServicePrincipalArrayOutput {
	return o
}

func (o LedgerAzureadBasedServicePrincipalArrayOutput) Index(i pulumi.IntInput) LedgerAzureadBasedServicePrincipalOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LedgerAzureadBasedServicePrincipal {
		return vs[0].([]LedgerAzureadBasedServicePrincipal)[vs[1].(int)]
	}).(LedgerAzureadBasedServicePrincipalOutput)
}

type LedgerCertificateBasedSecurityPrincipal struct {
	// Specifies the Ledger Role to grant this Certificate Security Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
	LedgerRoleName string `pulumi:"ledgerRoleName"`
	// The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
	PemPublicKey string `pulumi:"pemPublicKey"`
}

// LedgerCertificateBasedSecurityPrincipalInput is an input type that accepts LedgerCertificateBasedSecurityPrincipalArgs and LedgerCertificateBasedSecurityPrincipalOutput values.
// You can construct a concrete instance of `LedgerCertificateBasedSecurityPrincipalInput` via:
//
//	LedgerCertificateBasedSecurityPrincipalArgs{...}
type LedgerCertificateBasedSecurityPrincipalInput interface {
	pulumi.Input

	ToLedgerCertificateBasedSecurityPrincipalOutput() LedgerCertificateBasedSecurityPrincipalOutput
	ToLedgerCertificateBasedSecurityPrincipalOutputWithContext(context.Context) LedgerCertificateBasedSecurityPrincipalOutput
}

type LedgerCertificateBasedSecurityPrincipalArgs struct {
	// Specifies the Ledger Role to grant this Certificate Security Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
	LedgerRoleName pulumi.StringInput `pulumi:"ledgerRoleName"`
	// The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
	PemPublicKey pulumi.StringInput `pulumi:"pemPublicKey"`
}

func (LedgerCertificateBasedSecurityPrincipalArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LedgerCertificateBasedSecurityPrincipal)(nil)).Elem()
}

func (i LedgerCertificateBasedSecurityPrincipalArgs) ToLedgerCertificateBasedSecurityPrincipalOutput() LedgerCertificateBasedSecurityPrincipalOutput {
	return i.ToLedgerCertificateBasedSecurityPrincipalOutputWithContext(context.Background())
}

func (i LedgerCertificateBasedSecurityPrincipalArgs) ToLedgerCertificateBasedSecurityPrincipalOutputWithContext(ctx context.Context) LedgerCertificateBasedSecurityPrincipalOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerCertificateBasedSecurityPrincipalOutput)
}

// LedgerCertificateBasedSecurityPrincipalArrayInput is an input type that accepts LedgerCertificateBasedSecurityPrincipalArray and LedgerCertificateBasedSecurityPrincipalArrayOutput values.
// You can construct a concrete instance of `LedgerCertificateBasedSecurityPrincipalArrayInput` via:
//
//	LedgerCertificateBasedSecurityPrincipalArray{ LedgerCertificateBasedSecurityPrincipalArgs{...} }
type LedgerCertificateBasedSecurityPrincipalArrayInput interface {
	pulumi.Input

	ToLedgerCertificateBasedSecurityPrincipalArrayOutput() LedgerCertificateBasedSecurityPrincipalArrayOutput
	ToLedgerCertificateBasedSecurityPrincipalArrayOutputWithContext(context.Context) LedgerCertificateBasedSecurityPrincipalArrayOutput
}

type LedgerCertificateBasedSecurityPrincipalArray []LedgerCertificateBasedSecurityPrincipalInput

func (LedgerCertificateBasedSecurityPrincipalArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LedgerCertificateBasedSecurityPrincipal)(nil)).Elem()
}

func (i LedgerCertificateBasedSecurityPrincipalArray) ToLedgerCertificateBasedSecurityPrincipalArrayOutput() LedgerCertificateBasedSecurityPrincipalArrayOutput {
	return i.ToLedgerCertificateBasedSecurityPrincipalArrayOutputWithContext(context.Background())
}

func (i LedgerCertificateBasedSecurityPrincipalArray) ToLedgerCertificateBasedSecurityPrincipalArrayOutputWithContext(ctx context.Context) LedgerCertificateBasedSecurityPrincipalArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LedgerCertificateBasedSecurityPrincipalArrayOutput)
}

type LedgerCertificateBasedSecurityPrincipalOutput struct{ *pulumi.OutputState }

func (LedgerCertificateBasedSecurityPrincipalOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LedgerCertificateBasedSecurityPrincipal)(nil)).Elem()
}

func (o LedgerCertificateBasedSecurityPrincipalOutput) ToLedgerCertificateBasedSecurityPrincipalOutput() LedgerCertificateBasedSecurityPrincipalOutput {
	return o
}

func (o LedgerCertificateBasedSecurityPrincipalOutput) ToLedgerCertificateBasedSecurityPrincipalOutputWithContext(ctx context.Context) LedgerCertificateBasedSecurityPrincipalOutput {
	return o
}

// Specifies the Ledger Role to grant this Certificate Security Principal. Possible values are `Administrator`, `Contributor` and `Reader`.
func (o LedgerCertificateBasedSecurityPrincipalOutput) LedgerRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v LedgerCertificateBasedSecurityPrincipal) string { return v.LedgerRoleName }).(pulumi.StringOutput)
}

// The public key, in PEM format, of the certificate used by this identity to authenticate with the Confidential Ledger.
func (o LedgerCertificateBasedSecurityPrincipalOutput) PemPublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LedgerCertificateBasedSecurityPrincipal) string { return v.PemPublicKey }).(pulumi.StringOutput)
}

type LedgerCertificateBasedSecurityPrincipalArrayOutput struct{ *pulumi.OutputState }

func (LedgerCertificateBasedSecurityPrincipalArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LedgerCertificateBasedSecurityPrincipal)(nil)).Elem()
}

func (o LedgerCertificateBasedSecurityPrincipalArrayOutput) ToLedgerCertificateBasedSecurityPrincipalArrayOutput() LedgerCertificateBasedSecurityPrincipalArrayOutput {
	return o
}

func (o LedgerCertificateBasedSecurityPrincipalArrayOutput) ToLedgerCertificateBasedSecurityPrincipalArrayOutputWithContext(ctx context.Context) LedgerCertificateBasedSecurityPrincipalArrayOutput {
	return o
}

func (o LedgerCertificateBasedSecurityPrincipalArrayOutput) Index(i pulumi.IntInput) LedgerCertificateBasedSecurityPrincipalOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LedgerCertificateBasedSecurityPrincipal {
		return vs[0].([]LedgerCertificateBasedSecurityPrincipal)[vs[1].(int)]
	}).(LedgerCertificateBasedSecurityPrincipalOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LedgerAzureadBasedServicePrincipalInput)(nil)).Elem(), LedgerAzureadBasedServicePrincipalArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LedgerAzureadBasedServicePrincipalArrayInput)(nil)).Elem(), LedgerAzureadBasedServicePrincipalArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LedgerCertificateBasedSecurityPrincipalInput)(nil)).Elem(), LedgerCertificateBasedSecurityPrincipalArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*LedgerCertificateBasedSecurityPrincipalArrayInput)(nil)).Elem(), LedgerCertificateBasedSecurityPrincipalArray{})
	pulumi.RegisterOutputType(LedgerAzureadBasedServicePrincipalOutput{})
	pulumi.RegisterOutputType(LedgerAzureadBasedServicePrincipalArrayOutput{})
	pulumi.RegisterOutputType(LedgerCertificateBasedSecurityPrincipalOutput{})
	pulumi.RegisterOutputType(LedgerCertificateBasedSecurityPrincipalArrayOutput{})
}
