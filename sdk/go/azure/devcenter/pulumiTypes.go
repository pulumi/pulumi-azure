// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package devcenter

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type CatalogCatalogAdogit struct {
	Branch         string `pulumi:"branch"`
	KeyVaultKeyUrl string `pulumi:"keyVaultKeyUrl"`
	Path           string `pulumi:"path"`
	Uri            string `pulumi:"uri"`
}

// CatalogCatalogAdogitInput is an input type that accepts CatalogCatalogAdogitArgs and CatalogCatalogAdogitOutput values.
// You can construct a concrete instance of `CatalogCatalogAdogitInput` via:
//
//	CatalogCatalogAdogitArgs{...}
type CatalogCatalogAdogitInput interface {
	pulumi.Input

	ToCatalogCatalogAdogitOutput() CatalogCatalogAdogitOutput
	ToCatalogCatalogAdogitOutputWithContext(context.Context) CatalogCatalogAdogitOutput
}

type CatalogCatalogAdogitArgs struct {
	Branch         pulumi.StringInput `pulumi:"branch"`
	KeyVaultKeyUrl pulumi.StringInput `pulumi:"keyVaultKeyUrl"`
	Path           pulumi.StringInput `pulumi:"path"`
	Uri            pulumi.StringInput `pulumi:"uri"`
}

func (CatalogCatalogAdogitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogCatalogAdogit)(nil)).Elem()
}

func (i CatalogCatalogAdogitArgs) ToCatalogCatalogAdogitOutput() CatalogCatalogAdogitOutput {
	return i.ToCatalogCatalogAdogitOutputWithContext(context.Background())
}

func (i CatalogCatalogAdogitArgs) ToCatalogCatalogAdogitOutputWithContext(ctx context.Context) CatalogCatalogAdogitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogAdogitOutput)
}

func (i CatalogCatalogAdogitArgs) ToCatalogCatalogAdogitPtrOutput() CatalogCatalogAdogitPtrOutput {
	return i.ToCatalogCatalogAdogitPtrOutputWithContext(context.Background())
}

func (i CatalogCatalogAdogitArgs) ToCatalogCatalogAdogitPtrOutputWithContext(ctx context.Context) CatalogCatalogAdogitPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogAdogitOutput).ToCatalogCatalogAdogitPtrOutputWithContext(ctx)
}

// CatalogCatalogAdogitPtrInput is an input type that accepts CatalogCatalogAdogitArgs, CatalogCatalogAdogitPtr and CatalogCatalogAdogitPtrOutput values.
// You can construct a concrete instance of `CatalogCatalogAdogitPtrInput` via:
//
//	        CatalogCatalogAdogitArgs{...}
//
//	or:
//
//	        nil
type CatalogCatalogAdogitPtrInput interface {
	pulumi.Input

	ToCatalogCatalogAdogitPtrOutput() CatalogCatalogAdogitPtrOutput
	ToCatalogCatalogAdogitPtrOutputWithContext(context.Context) CatalogCatalogAdogitPtrOutput
}

type catalogCatalogAdogitPtrType CatalogCatalogAdogitArgs

func CatalogCatalogAdogitPtr(v *CatalogCatalogAdogitArgs) CatalogCatalogAdogitPtrInput {
	return (*catalogCatalogAdogitPtrType)(v)
}

func (*catalogCatalogAdogitPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogCatalogAdogit)(nil)).Elem()
}

func (i *catalogCatalogAdogitPtrType) ToCatalogCatalogAdogitPtrOutput() CatalogCatalogAdogitPtrOutput {
	return i.ToCatalogCatalogAdogitPtrOutputWithContext(context.Background())
}

func (i *catalogCatalogAdogitPtrType) ToCatalogCatalogAdogitPtrOutputWithContext(ctx context.Context) CatalogCatalogAdogitPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogAdogitPtrOutput)
}

type CatalogCatalogAdogitOutput struct{ *pulumi.OutputState }

func (CatalogCatalogAdogitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogCatalogAdogit)(nil)).Elem()
}

func (o CatalogCatalogAdogitOutput) ToCatalogCatalogAdogitOutput() CatalogCatalogAdogitOutput {
	return o
}

func (o CatalogCatalogAdogitOutput) ToCatalogCatalogAdogitOutputWithContext(ctx context.Context) CatalogCatalogAdogitOutput {
	return o
}

func (o CatalogCatalogAdogitOutput) ToCatalogCatalogAdogitPtrOutput() CatalogCatalogAdogitPtrOutput {
	return o.ToCatalogCatalogAdogitPtrOutputWithContext(context.Background())
}

func (o CatalogCatalogAdogitOutput) ToCatalogCatalogAdogitPtrOutputWithContext(ctx context.Context) CatalogCatalogAdogitPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v CatalogCatalogAdogit) *CatalogCatalogAdogit {
		return &v
	}).(CatalogCatalogAdogitPtrOutput)
}

func (o CatalogCatalogAdogitOutput) Branch() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogAdogit) string { return v.Branch }).(pulumi.StringOutput)
}

func (o CatalogCatalogAdogitOutput) KeyVaultKeyUrl() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogAdogit) string { return v.KeyVaultKeyUrl }).(pulumi.StringOutput)
}

func (o CatalogCatalogAdogitOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogAdogit) string { return v.Path }).(pulumi.StringOutput)
}

func (o CatalogCatalogAdogitOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogAdogit) string { return v.Uri }).(pulumi.StringOutput)
}

type CatalogCatalogAdogitPtrOutput struct{ *pulumi.OutputState }

func (CatalogCatalogAdogitPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogCatalogAdogit)(nil)).Elem()
}

func (o CatalogCatalogAdogitPtrOutput) ToCatalogCatalogAdogitPtrOutput() CatalogCatalogAdogitPtrOutput {
	return o
}

func (o CatalogCatalogAdogitPtrOutput) ToCatalogCatalogAdogitPtrOutputWithContext(ctx context.Context) CatalogCatalogAdogitPtrOutput {
	return o
}

func (o CatalogCatalogAdogitPtrOutput) Elem() CatalogCatalogAdogitOutput {
	return o.ApplyT(func(v *CatalogCatalogAdogit) CatalogCatalogAdogit {
		if v != nil {
			return *v
		}
		var ret CatalogCatalogAdogit
		return ret
	}).(CatalogCatalogAdogitOutput)
}

func (o CatalogCatalogAdogitPtrOutput) Branch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogAdogit) *string {
		if v == nil {
			return nil
		}
		return &v.Branch
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogAdogitPtrOutput) KeyVaultKeyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogAdogit) *string {
		if v == nil {
			return nil
		}
		return &v.KeyVaultKeyUrl
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogAdogitPtrOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogAdogit) *string {
		if v == nil {
			return nil
		}
		return &v.Path
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogAdogitPtrOutput) Uri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogAdogit) *string {
		if v == nil {
			return nil
		}
		return &v.Uri
	}).(pulumi.StringPtrOutput)
}

type CatalogCatalogGithub struct {
	Branch         string `pulumi:"branch"`
	KeyVaultKeyUrl string `pulumi:"keyVaultKeyUrl"`
	Path           string `pulumi:"path"`
	Uri            string `pulumi:"uri"`
}

// CatalogCatalogGithubInput is an input type that accepts CatalogCatalogGithubArgs and CatalogCatalogGithubOutput values.
// You can construct a concrete instance of `CatalogCatalogGithubInput` via:
//
//	CatalogCatalogGithubArgs{...}
type CatalogCatalogGithubInput interface {
	pulumi.Input

	ToCatalogCatalogGithubOutput() CatalogCatalogGithubOutput
	ToCatalogCatalogGithubOutputWithContext(context.Context) CatalogCatalogGithubOutput
}

type CatalogCatalogGithubArgs struct {
	Branch         pulumi.StringInput `pulumi:"branch"`
	KeyVaultKeyUrl pulumi.StringInput `pulumi:"keyVaultKeyUrl"`
	Path           pulumi.StringInput `pulumi:"path"`
	Uri            pulumi.StringInput `pulumi:"uri"`
}

func (CatalogCatalogGithubArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogCatalogGithub)(nil)).Elem()
}

func (i CatalogCatalogGithubArgs) ToCatalogCatalogGithubOutput() CatalogCatalogGithubOutput {
	return i.ToCatalogCatalogGithubOutputWithContext(context.Background())
}

func (i CatalogCatalogGithubArgs) ToCatalogCatalogGithubOutputWithContext(ctx context.Context) CatalogCatalogGithubOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogGithubOutput)
}

func (i CatalogCatalogGithubArgs) ToCatalogCatalogGithubPtrOutput() CatalogCatalogGithubPtrOutput {
	return i.ToCatalogCatalogGithubPtrOutputWithContext(context.Background())
}

func (i CatalogCatalogGithubArgs) ToCatalogCatalogGithubPtrOutputWithContext(ctx context.Context) CatalogCatalogGithubPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogGithubOutput).ToCatalogCatalogGithubPtrOutputWithContext(ctx)
}

// CatalogCatalogGithubPtrInput is an input type that accepts CatalogCatalogGithubArgs, CatalogCatalogGithubPtr and CatalogCatalogGithubPtrOutput values.
// You can construct a concrete instance of `CatalogCatalogGithubPtrInput` via:
//
//	        CatalogCatalogGithubArgs{...}
//
//	or:
//
//	        nil
type CatalogCatalogGithubPtrInput interface {
	pulumi.Input

	ToCatalogCatalogGithubPtrOutput() CatalogCatalogGithubPtrOutput
	ToCatalogCatalogGithubPtrOutputWithContext(context.Context) CatalogCatalogGithubPtrOutput
}

type catalogCatalogGithubPtrType CatalogCatalogGithubArgs

func CatalogCatalogGithubPtr(v *CatalogCatalogGithubArgs) CatalogCatalogGithubPtrInput {
	return (*catalogCatalogGithubPtrType)(v)
}

func (*catalogCatalogGithubPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogCatalogGithub)(nil)).Elem()
}

func (i *catalogCatalogGithubPtrType) ToCatalogCatalogGithubPtrOutput() CatalogCatalogGithubPtrOutput {
	return i.ToCatalogCatalogGithubPtrOutputWithContext(context.Background())
}

func (i *catalogCatalogGithubPtrType) ToCatalogCatalogGithubPtrOutputWithContext(ctx context.Context) CatalogCatalogGithubPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CatalogCatalogGithubPtrOutput)
}

type CatalogCatalogGithubOutput struct{ *pulumi.OutputState }

func (CatalogCatalogGithubOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CatalogCatalogGithub)(nil)).Elem()
}

func (o CatalogCatalogGithubOutput) ToCatalogCatalogGithubOutput() CatalogCatalogGithubOutput {
	return o
}

func (o CatalogCatalogGithubOutput) ToCatalogCatalogGithubOutputWithContext(ctx context.Context) CatalogCatalogGithubOutput {
	return o
}

func (o CatalogCatalogGithubOutput) ToCatalogCatalogGithubPtrOutput() CatalogCatalogGithubPtrOutput {
	return o.ToCatalogCatalogGithubPtrOutputWithContext(context.Background())
}

func (o CatalogCatalogGithubOutput) ToCatalogCatalogGithubPtrOutputWithContext(ctx context.Context) CatalogCatalogGithubPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v CatalogCatalogGithub) *CatalogCatalogGithub {
		return &v
	}).(CatalogCatalogGithubPtrOutput)
}

func (o CatalogCatalogGithubOutput) Branch() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogGithub) string { return v.Branch }).(pulumi.StringOutput)
}

func (o CatalogCatalogGithubOutput) KeyVaultKeyUrl() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogGithub) string { return v.KeyVaultKeyUrl }).(pulumi.StringOutput)
}

func (o CatalogCatalogGithubOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogGithub) string { return v.Path }).(pulumi.StringOutput)
}

func (o CatalogCatalogGithubOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v CatalogCatalogGithub) string { return v.Uri }).(pulumi.StringOutput)
}

type CatalogCatalogGithubPtrOutput struct{ *pulumi.OutputState }

func (CatalogCatalogGithubPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CatalogCatalogGithub)(nil)).Elem()
}

func (o CatalogCatalogGithubPtrOutput) ToCatalogCatalogGithubPtrOutput() CatalogCatalogGithubPtrOutput {
	return o
}

func (o CatalogCatalogGithubPtrOutput) ToCatalogCatalogGithubPtrOutputWithContext(ctx context.Context) CatalogCatalogGithubPtrOutput {
	return o
}

func (o CatalogCatalogGithubPtrOutput) Elem() CatalogCatalogGithubOutput {
	return o.ApplyT(func(v *CatalogCatalogGithub) CatalogCatalogGithub {
		if v != nil {
			return *v
		}
		var ret CatalogCatalogGithub
		return ret
	}).(CatalogCatalogGithubOutput)
}

func (o CatalogCatalogGithubPtrOutput) Branch() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogGithub) *string {
		if v == nil {
			return nil
		}
		return &v.Branch
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogGithubPtrOutput) KeyVaultKeyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogGithub) *string {
		if v == nil {
			return nil
		}
		return &v.KeyVaultKeyUrl
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogGithubPtrOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogGithub) *string {
		if v == nil {
			return nil
		}
		return &v.Path
	}).(pulumi.StringPtrOutput)
}

func (o CatalogCatalogGithubPtrOutput) Uri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CatalogCatalogGithub) *string {
		if v == nil {
			return nil
		}
		return &v.Uri
	}).(pulumi.StringPtrOutput)
}

type DevCenterIdentity struct {
	IdentityIds []string `pulumi:"identityIds"`
	PrincipalId *string  `pulumi:"principalId"`
	TenantId    *string  `pulumi:"tenantId"`
	Type        string   `pulumi:"type"`
}

// DevCenterIdentityInput is an input type that accepts DevCenterIdentityArgs and DevCenterIdentityOutput values.
// You can construct a concrete instance of `DevCenterIdentityInput` via:
//
//	DevCenterIdentityArgs{...}
type DevCenterIdentityInput interface {
	pulumi.Input

	ToDevCenterIdentityOutput() DevCenterIdentityOutput
	ToDevCenterIdentityOutputWithContext(context.Context) DevCenterIdentityOutput
}

type DevCenterIdentityArgs struct {
	IdentityIds pulumi.StringArrayInput `pulumi:"identityIds"`
	PrincipalId pulumi.StringPtrInput   `pulumi:"principalId"`
	TenantId    pulumi.StringPtrInput   `pulumi:"tenantId"`
	Type        pulumi.StringInput      `pulumi:"type"`
}

func (DevCenterIdentityArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*DevCenterIdentity)(nil)).Elem()
}

func (i DevCenterIdentityArgs) ToDevCenterIdentityOutput() DevCenterIdentityOutput {
	return i.ToDevCenterIdentityOutputWithContext(context.Background())
}

func (i DevCenterIdentityArgs) ToDevCenterIdentityOutputWithContext(ctx context.Context) DevCenterIdentityOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterIdentityOutput)
}

func (i DevCenterIdentityArgs) ToDevCenterIdentityPtrOutput() DevCenterIdentityPtrOutput {
	return i.ToDevCenterIdentityPtrOutputWithContext(context.Background())
}

func (i DevCenterIdentityArgs) ToDevCenterIdentityPtrOutputWithContext(ctx context.Context) DevCenterIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterIdentityOutput).ToDevCenterIdentityPtrOutputWithContext(ctx)
}

// DevCenterIdentityPtrInput is an input type that accepts DevCenterIdentityArgs, DevCenterIdentityPtr and DevCenterIdentityPtrOutput values.
// You can construct a concrete instance of `DevCenterIdentityPtrInput` via:
//
//	        DevCenterIdentityArgs{...}
//
//	or:
//
//	        nil
type DevCenterIdentityPtrInput interface {
	pulumi.Input

	ToDevCenterIdentityPtrOutput() DevCenterIdentityPtrOutput
	ToDevCenterIdentityPtrOutputWithContext(context.Context) DevCenterIdentityPtrOutput
}

type devCenterIdentityPtrType DevCenterIdentityArgs

func DevCenterIdentityPtr(v *DevCenterIdentityArgs) DevCenterIdentityPtrInput {
	return (*devCenterIdentityPtrType)(v)
}

func (*devCenterIdentityPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DevCenterIdentity)(nil)).Elem()
}

func (i *devCenterIdentityPtrType) ToDevCenterIdentityPtrOutput() DevCenterIdentityPtrOutput {
	return i.ToDevCenterIdentityPtrOutputWithContext(context.Background())
}

func (i *devCenterIdentityPtrType) ToDevCenterIdentityPtrOutputWithContext(ctx context.Context) DevCenterIdentityPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevCenterIdentityPtrOutput)
}

type DevCenterIdentityOutput struct{ *pulumi.OutputState }

func (DevCenterIdentityOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DevCenterIdentity)(nil)).Elem()
}

func (o DevCenterIdentityOutput) ToDevCenterIdentityOutput() DevCenterIdentityOutput {
	return o
}

func (o DevCenterIdentityOutput) ToDevCenterIdentityOutputWithContext(ctx context.Context) DevCenterIdentityOutput {
	return o
}

func (o DevCenterIdentityOutput) ToDevCenterIdentityPtrOutput() DevCenterIdentityPtrOutput {
	return o.ToDevCenterIdentityPtrOutputWithContext(context.Background())
}

func (o DevCenterIdentityOutput) ToDevCenterIdentityPtrOutputWithContext(ctx context.Context) DevCenterIdentityPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DevCenterIdentity) *DevCenterIdentity {
		return &v
	}).(DevCenterIdentityPtrOutput)
}

func (o DevCenterIdentityOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v DevCenterIdentity) []string { return v.IdentityIds }).(pulumi.StringArrayOutput)
}

func (o DevCenterIdentityOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DevCenterIdentity) *string { return v.PrincipalId }).(pulumi.StringPtrOutput)
}

func (o DevCenterIdentityOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v DevCenterIdentity) *string { return v.TenantId }).(pulumi.StringPtrOutput)
}

func (o DevCenterIdentityOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v DevCenterIdentity) string { return v.Type }).(pulumi.StringOutput)
}

type DevCenterIdentityPtrOutput struct{ *pulumi.OutputState }

func (DevCenterIdentityPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevCenterIdentity)(nil)).Elem()
}

func (o DevCenterIdentityPtrOutput) ToDevCenterIdentityPtrOutput() DevCenterIdentityPtrOutput {
	return o
}

func (o DevCenterIdentityPtrOutput) ToDevCenterIdentityPtrOutputWithContext(ctx context.Context) DevCenterIdentityPtrOutput {
	return o
}

func (o DevCenterIdentityPtrOutput) Elem() DevCenterIdentityOutput {
	return o.ApplyT(func(v *DevCenterIdentity) DevCenterIdentity {
		if v != nil {
			return *v
		}
		var ret DevCenterIdentity
		return ret
	}).(DevCenterIdentityOutput)
}

func (o DevCenterIdentityPtrOutput) IdentityIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DevCenterIdentity) []string {
		if v == nil {
			return nil
		}
		return v.IdentityIds
	}).(pulumi.StringArrayOutput)
}

func (o DevCenterIdentityPtrOutput) PrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevCenterIdentity) *string {
		if v == nil {
			return nil
		}
		return v.PrincipalId
	}).(pulumi.StringPtrOutput)
}

func (o DevCenterIdentityPtrOutput) TenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevCenterIdentity) *string {
		if v == nil {
			return nil
		}
		return v.TenantId
	}).(pulumi.StringPtrOutput)
}

func (o DevCenterIdentityPtrOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevCenterIdentity) *string {
		if v == nil {
			return nil
		}
		return &v.Type
	}).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogCatalogAdogitInput)(nil)).Elem(), CatalogCatalogAdogitArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogCatalogAdogitPtrInput)(nil)).Elem(), CatalogCatalogAdogitArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogCatalogGithubInput)(nil)).Elem(), CatalogCatalogGithubArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*CatalogCatalogGithubPtrInput)(nil)).Elem(), CatalogCatalogGithubArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevCenterIdentityInput)(nil)).Elem(), DevCenterIdentityArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevCenterIdentityPtrInput)(nil)).Elem(), DevCenterIdentityArgs{})
	pulumi.RegisterOutputType(CatalogCatalogAdogitOutput{})
	pulumi.RegisterOutputType(CatalogCatalogAdogitPtrOutput{})
	pulumi.RegisterOutputType(CatalogCatalogGithubOutput{})
	pulumi.RegisterOutputType(CatalogCatalogGithubPtrOutput{})
	pulumi.RegisterOutputType(DevCenterIdentityOutput{})
	pulumi.RegisterOutputType(DevCenterIdentityPtrOutput{})
}
