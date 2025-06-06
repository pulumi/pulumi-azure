// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bot

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type ChannelDirectLineSite struct {
	// Enables/Disables this site. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// Is the endpoint parameters enabled for this site?
	EndpointParametersEnabled *bool `pulumi:"endpointParametersEnabled"`
	// Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
	EnhancedAuthenticationEnabled *bool `pulumi:"enhancedAuthenticationEnabled"`
	// Id for the site
	Id *string `pulumi:"id"`
	// Primary key for accessing this site
	Key *string `pulumi:"key"`
	// Secondary key for accessing this site
	Key2 *string `pulumi:"key2"`
	// The name of the site
	Name string `pulumi:"name"`
	// Is the storage site enabled for detailed logging? Defaults to `true`.
	StorageEnabled *bool `pulumi:"storageEnabled"`
	// This field is required when `isSecureSiteEnabled` is enabled. Determines which origins can establish a Directline conversation for this site.
	TrustedOrigins []string `pulumi:"trustedOrigins"`
	// Is the user upload enabled for this site? Defaults to `true`.
	UserUploadEnabled *bool `pulumi:"userUploadEnabled"`
	// Enables v1 of the Directline protocol for this site. Defaults to `true`.
	V1Allowed *bool `pulumi:"v1Allowed"`
	// Enables v3 of the Directline protocol for this site. Defaults to `true`.
	V3Allowed *bool `pulumi:"v3Allowed"`
}

// ChannelDirectLineSiteInput is an input type that accepts ChannelDirectLineSiteArgs and ChannelDirectLineSiteOutput values.
// You can construct a concrete instance of `ChannelDirectLineSiteInput` via:
//
//	ChannelDirectLineSiteArgs{...}
type ChannelDirectLineSiteInput interface {
	pulumi.Input

	ToChannelDirectLineSiteOutput() ChannelDirectLineSiteOutput
	ToChannelDirectLineSiteOutputWithContext(context.Context) ChannelDirectLineSiteOutput
}

type ChannelDirectLineSiteArgs struct {
	// Enables/Disables this site. Defaults to `true`.
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// Is the endpoint parameters enabled for this site?
	EndpointParametersEnabled pulumi.BoolPtrInput `pulumi:"endpointParametersEnabled"`
	// Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
	EnhancedAuthenticationEnabled pulumi.BoolPtrInput `pulumi:"enhancedAuthenticationEnabled"`
	// Id for the site
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Primary key for accessing this site
	Key pulumi.StringPtrInput `pulumi:"key"`
	// Secondary key for accessing this site
	Key2 pulumi.StringPtrInput `pulumi:"key2"`
	// The name of the site
	Name pulumi.StringInput `pulumi:"name"`
	// Is the storage site enabled for detailed logging? Defaults to `true`.
	StorageEnabled pulumi.BoolPtrInput `pulumi:"storageEnabled"`
	// This field is required when `isSecureSiteEnabled` is enabled. Determines which origins can establish a Directline conversation for this site.
	TrustedOrigins pulumi.StringArrayInput `pulumi:"trustedOrigins"`
	// Is the user upload enabled for this site? Defaults to `true`.
	UserUploadEnabled pulumi.BoolPtrInput `pulumi:"userUploadEnabled"`
	// Enables v1 of the Directline protocol for this site. Defaults to `true`.
	V1Allowed pulumi.BoolPtrInput `pulumi:"v1Allowed"`
	// Enables v3 of the Directline protocol for this site. Defaults to `true`.
	V3Allowed pulumi.BoolPtrInput `pulumi:"v3Allowed"`
}

func (ChannelDirectLineSiteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelDirectLineSite)(nil)).Elem()
}

func (i ChannelDirectLineSiteArgs) ToChannelDirectLineSiteOutput() ChannelDirectLineSiteOutput {
	return i.ToChannelDirectLineSiteOutputWithContext(context.Background())
}

func (i ChannelDirectLineSiteArgs) ToChannelDirectLineSiteOutputWithContext(ctx context.Context) ChannelDirectLineSiteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelDirectLineSiteOutput)
}

// ChannelDirectLineSiteArrayInput is an input type that accepts ChannelDirectLineSiteArray and ChannelDirectLineSiteArrayOutput values.
// You can construct a concrete instance of `ChannelDirectLineSiteArrayInput` via:
//
//	ChannelDirectLineSiteArray{ ChannelDirectLineSiteArgs{...} }
type ChannelDirectLineSiteArrayInput interface {
	pulumi.Input

	ToChannelDirectLineSiteArrayOutput() ChannelDirectLineSiteArrayOutput
	ToChannelDirectLineSiteArrayOutputWithContext(context.Context) ChannelDirectLineSiteArrayOutput
}

type ChannelDirectLineSiteArray []ChannelDirectLineSiteInput

func (ChannelDirectLineSiteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelDirectLineSite)(nil)).Elem()
}

func (i ChannelDirectLineSiteArray) ToChannelDirectLineSiteArrayOutput() ChannelDirectLineSiteArrayOutput {
	return i.ToChannelDirectLineSiteArrayOutputWithContext(context.Background())
}

func (i ChannelDirectLineSiteArray) ToChannelDirectLineSiteArrayOutputWithContext(ctx context.Context) ChannelDirectLineSiteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelDirectLineSiteArrayOutput)
}

type ChannelDirectLineSiteOutput struct{ *pulumi.OutputState }

func (ChannelDirectLineSiteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelDirectLineSite)(nil)).Elem()
}

func (o ChannelDirectLineSiteOutput) ToChannelDirectLineSiteOutput() ChannelDirectLineSiteOutput {
	return o
}

func (o ChannelDirectLineSiteOutput) ToChannelDirectLineSiteOutputWithContext(ctx context.Context) ChannelDirectLineSiteOutput {
	return o
}

// Enables/Disables this site. Defaults to `true`.
func (o ChannelDirectLineSiteOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Is the endpoint parameters enabled for this site?
func (o ChannelDirectLineSiteOutput) EndpointParametersEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.EndpointParametersEnabled }).(pulumi.BoolPtrOutput)
}

// Enables additional security measures for this site, see [Enhanced Directline Authentication Features](https://blog.botframework.com/2018/09/25/enhanced-direct-line-authentication-features). Disabled by default.
func (o ChannelDirectLineSiteOutput) EnhancedAuthenticationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.EnhancedAuthenticationEnabled }).(pulumi.BoolPtrOutput)
}

// Id for the site
func (o ChannelDirectLineSiteOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// Primary key for accessing this site
func (o ChannelDirectLineSiteOutput) Key() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *string { return v.Key }).(pulumi.StringPtrOutput)
}

// Secondary key for accessing this site
func (o ChannelDirectLineSiteOutput) Key2() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *string { return v.Key2 }).(pulumi.StringPtrOutput)
}

// The name of the site
func (o ChannelDirectLineSiteOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) string { return v.Name }).(pulumi.StringOutput)
}

// Is the storage site enabled for detailed logging? Defaults to `true`.
func (o ChannelDirectLineSiteOutput) StorageEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.StorageEnabled }).(pulumi.BoolPtrOutput)
}

// This field is required when `isSecureSiteEnabled` is enabled. Determines which origins can establish a Directline conversation for this site.
func (o ChannelDirectLineSiteOutput) TrustedOrigins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) []string { return v.TrustedOrigins }).(pulumi.StringArrayOutput)
}

// Is the user upload enabled for this site? Defaults to `true`.
func (o ChannelDirectLineSiteOutput) UserUploadEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.UserUploadEnabled }).(pulumi.BoolPtrOutput)
}

// Enables v1 of the Directline protocol for this site. Defaults to `true`.
func (o ChannelDirectLineSiteOutput) V1Allowed() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.V1Allowed }).(pulumi.BoolPtrOutput)
}

// Enables v3 of the Directline protocol for this site. Defaults to `true`.
func (o ChannelDirectLineSiteOutput) V3Allowed() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelDirectLineSite) *bool { return v.V3Allowed }).(pulumi.BoolPtrOutput)
}

type ChannelDirectLineSiteArrayOutput struct{ *pulumi.OutputState }

func (ChannelDirectLineSiteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelDirectLineSite)(nil)).Elem()
}

func (o ChannelDirectLineSiteArrayOutput) ToChannelDirectLineSiteArrayOutput() ChannelDirectLineSiteArrayOutput {
	return o
}

func (o ChannelDirectLineSiteArrayOutput) ToChannelDirectLineSiteArrayOutputWithContext(ctx context.Context) ChannelDirectLineSiteArrayOutput {
	return o
}

func (o ChannelDirectLineSiteArrayOutput) Index(i pulumi.IntInput) ChannelDirectLineSiteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ChannelDirectLineSite {
		return vs[0].([]ChannelDirectLineSite)[vs[1].(int)]
	}).(ChannelDirectLineSiteOutput)
}

type ChannelFacebookPage struct {
	// The Facebook Page Access Token for the Facebook Channel.
	AccessToken string `pulumi:"accessToken"`
	// The Facebook Page ID for the Facebook Channel.
	Id string `pulumi:"id"`
}

// ChannelFacebookPageInput is an input type that accepts ChannelFacebookPageArgs and ChannelFacebookPageOutput values.
// You can construct a concrete instance of `ChannelFacebookPageInput` via:
//
//	ChannelFacebookPageArgs{...}
type ChannelFacebookPageInput interface {
	pulumi.Input

	ToChannelFacebookPageOutput() ChannelFacebookPageOutput
	ToChannelFacebookPageOutputWithContext(context.Context) ChannelFacebookPageOutput
}

type ChannelFacebookPageArgs struct {
	// The Facebook Page Access Token for the Facebook Channel.
	AccessToken pulumi.StringInput `pulumi:"accessToken"`
	// The Facebook Page ID for the Facebook Channel.
	Id pulumi.StringInput `pulumi:"id"`
}

func (ChannelFacebookPageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelFacebookPage)(nil)).Elem()
}

func (i ChannelFacebookPageArgs) ToChannelFacebookPageOutput() ChannelFacebookPageOutput {
	return i.ToChannelFacebookPageOutputWithContext(context.Background())
}

func (i ChannelFacebookPageArgs) ToChannelFacebookPageOutputWithContext(ctx context.Context) ChannelFacebookPageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelFacebookPageOutput)
}

// ChannelFacebookPageArrayInput is an input type that accepts ChannelFacebookPageArray and ChannelFacebookPageArrayOutput values.
// You can construct a concrete instance of `ChannelFacebookPageArrayInput` via:
//
//	ChannelFacebookPageArray{ ChannelFacebookPageArgs{...} }
type ChannelFacebookPageArrayInput interface {
	pulumi.Input

	ToChannelFacebookPageArrayOutput() ChannelFacebookPageArrayOutput
	ToChannelFacebookPageArrayOutputWithContext(context.Context) ChannelFacebookPageArrayOutput
}

type ChannelFacebookPageArray []ChannelFacebookPageInput

func (ChannelFacebookPageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelFacebookPage)(nil)).Elem()
}

func (i ChannelFacebookPageArray) ToChannelFacebookPageArrayOutput() ChannelFacebookPageArrayOutput {
	return i.ToChannelFacebookPageArrayOutputWithContext(context.Background())
}

func (i ChannelFacebookPageArray) ToChannelFacebookPageArrayOutputWithContext(ctx context.Context) ChannelFacebookPageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelFacebookPageArrayOutput)
}

type ChannelFacebookPageOutput struct{ *pulumi.OutputState }

func (ChannelFacebookPageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelFacebookPage)(nil)).Elem()
}

func (o ChannelFacebookPageOutput) ToChannelFacebookPageOutput() ChannelFacebookPageOutput {
	return o
}

func (o ChannelFacebookPageOutput) ToChannelFacebookPageOutputWithContext(ctx context.Context) ChannelFacebookPageOutput {
	return o
}

// The Facebook Page Access Token for the Facebook Channel.
func (o ChannelFacebookPageOutput) AccessToken() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelFacebookPage) string { return v.AccessToken }).(pulumi.StringOutput)
}

// The Facebook Page ID for the Facebook Channel.
func (o ChannelFacebookPageOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelFacebookPage) string { return v.Id }).(pulumi.StringOutput)
}

type ChannelFacebookPageArrayOutput struct{ *pulumi.OutputState }

func (ChannelFacebookPageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelFacebookPage)(nil)).Elem()
}

func (o ChannelFacebookPageArrayOutput) ToChannelFacebookPageArrayOutput() ChannelFacebookPageArrayOutput {
	return o
}

func (o ChannelFacebookPageArrayOutput) ToChannelFacebookPageArrayOutputWithContext(ctx context.Context) ChannelFacebookPageArrayOutput {
	return o
}

func (o ChannelFacebookPageArrayOutput) Index(i pulumi.IntInput) ChannelFacebookPageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ChannelFacebookPage {
		return vs[0].([]ChannelFacebookPage)[vs[1].(int)]
	}).(ChannelFacebookPageOutput)
}

type ChannelLineLineChannel struct {
	// The access token which is used to call the Line Channel API.
	AccessToken string `pulumi:"accessToken"`
	// The secret which is used to access the Line Channel.
	Secret string `pulumi:"secret"`
}

// ChannelLineLineChannelInput is an input type that accepts ChannelLineLineChannelArgs and ChannelLineLineChannelOutput values.
// You can construct a concrete instance of `ChannelLineLineChannelInput` via:
//
//	ChannelLineLineChannelArgs{...}
type ChannelLineLineChannelInput interface {
	pulumi.Input

	ToChannelLineLineChannelOutput() ChannelLineLineChannelOutput
	ToChannelLineLineChannelOutputWithContext(context.Context) ChannelLineLineChannelOutput
}

type ChannelLineLineChannelArgs struct {
	// The access token which is used to call the Line Channel API.
	AccessToken pulumi.StringInput `pulumi:"accessToken"`
	// The secret which is used to access the Line Channel.
	Secret pulumi.StringInput `pulumi:"secret"`
}

func (ChannelLineLineChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelLineLineChannel)(nil)).Elem()
}

func (i ChannelLineLineChannelArgs) ToChannelLineLineChannelOutput() ChannelLineLineChannelOutput {
	return i.ToChannelLineLineChannelOutputWithContext(context.Background())
}

func (i ChannelLineLineChannelArgs) ToChannelLineLineChannelOutputWithContext(ctx context.Context) ChannelLineLineChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelLineLineChannelOutput)
}

// ChannelLineLineChannelArrayInput is an input type that accepts ChannelLineLineChannelArray and ChannelLineLineChannelArrayOutput values.
// You can construct a concrete instance of `ChannelLineLineChannelArrayInput` via:
//
//	ChannelLineLineChannelArray{ ChannelLineLineChannelArgs{...} }
type ChannelLineLineChannelArrayInput interface {
	pulumi.Input

	ToChannelLineLineChannelArrayOutput() ChannelLineLineChannelArrayOutput
	ToChannelLineLineChannelArrayOutputWithContext(context.Context) ChannelLineLineChannelArrayOutput
}

type ChannelLineLineChannelArray []ChannelLineLineChannelInput

func (ChannelLineLineChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelLineLineChannel)(nil)).Elem()
}

func (i ChannelLineLineChannelArray) ToChannelLineLineChannelArrayOutput() ChannelLineLineChannelArrayOutput {
	return i.ToChannelLineLineChannelArrayOutputWithContext(context.Background())
}

func (i ChannelLineLineChannelArray) ToChannelLineLineChannelArrayOutputWithContext(ctx context.Context) ChannelLineLineChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelLineLineChannelArrayOutput)
}

type ChannelLineLineChannelOutput struct{ *pulumi.OutputState }

func (ChannelLineLineChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelLineLineChannel)(nil)).Elem()
}

func (o ChannelLineLineChannelOutput) ToChannelLineLineChannelOutput() ChannelLineLineChannelOutput {
	return o
}

func (o ChannelLineLineChannelOutput) ToChannelLineLineChannelOutputWithContext(ctx context.Context) ChannelLineLineChannelOutput {
	return o
}

// The access token which is used to call the Line Channel API.
func (o ChannelLineLineChannelOutput) AccessToken() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelLineLineChannel) string { return v.AccessToken }).(pulumi.StringOutput)
}

// The secret which is used to access the Line Channel.
func (o ChannelLineLineChannelOutput) Secret() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelLineLineChannel) string { return v.Secret }).(pulumi.StringOutput)
}

type ChannelLineLineChannelArrayOutput struct{ *pulumi.OutputState }

func (ChannelLineLineChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelLineLineChannel)(nil)).Elem()
}

func (o ChannelLineLineChannelArrayOutput) ToChannelLineLineChannelArrayOutput() ChannelLineLineChannelArrayOutput {
	return o
}

func (o ChannelLineLineChannelArrayOutput) ToChannelLineLineChannelArrayOutputWithContext(ctx context.Context) ChannelLineLineChannelArrayOutput {
	return o
}

func (o ChannelLineLineChannelArrayOutput) Index(i pulumi.IntInput) ChannelLineLineChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ChannelLineLineChannel {
		return vs[0].([]ChannelLineLineChannel)[vs[1].(int)]
	}).(ChannelLineLineChannelOutput)
}

type ChannelWebChatSite struct {
	// Is the endpoint parameters enabled for this site?
	EndpointParametersEnabled *bool `pulumi:"endpointParametersEnabled"`
	// The name of the site.
	Name string `pulumi:"name"`
	// Is the storage site enabled for detailed logging? Defaults to `true`.
	StorageEnabled *bool `pulumi:"storageEnabled"`
	// Is the user upload enabled for this site? Defaults to `true`.
	UserUploadEnabled *bool `pulumi:"userUploadEnabled"`
}

// ChannelWebChatSiteInput is an input type that accepts ChannelWebChatSiteArgs and ChannelWebChatSiteOutput values.
// You can construct a concrete instance of `ChannelWebChatSiteInput` via:
//
//	ChannelWebChatSiteArgs{...}
type ChannelWebChatSiteInput interface {
	pulumi.Input

	ToChannelWebChatSiteOutput() ChannelWebChatSiteOutput
	ToChannelWebChatSiteOutputWithContext(context.Context) ChannelWebChatSiteOutput
}

type ChannelWebChatSiteArgs struct {
	// Is the endpoint parameters enabled for this site?
	EndpointParametersEnabled pulumi.BoolPtrInput `pulumi:"endpointParametersEnabled"`
	// The name of the site.
	Name pulumi.StringInput `pulumi:"name"`
	// Is the storage site enabled for detailed logging? Defaults to `true`.
	StorageEnabled pulumi.BoolPtrInput `pulumi:"storageEnabled"`
	// Is the user upload enabled for this site? Defaults to `true`.
	UserUploadEnabled pulumi.BoolPtrInput `pulumi:"userUploadEnabled"`
}

func (ChannelWebChatSiteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelWebChatSite)(nil)).Elem()
}

func (i ChannelWebChatSiteArgs) ToChannelWebChatSiteOutput() ChannelWebChatSiteOutput {
	return i.ToChannelWebChatSiteOutputWithContext(context.Background())
}

func (i ChannelWebChatSiteArgs) ToChannelWebChatSiteOutputWithContext(ctx context.Context) ChannelWebChatSiteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelWebChatSiteOutput)
}

// ChannelWebChatSiteArrayInput is an input type that accepts ChannelWebChatSiteArray and ChannelWebChatSiteArrayOutput values.
// You can construct a concrete instance of `ChannelWebChatSiteArrayInput` via:
//
//	ChannelWebChatSiteArray{ ChannelWebChatSiteArgs{...} }
type ChannelWebChatSiteArrayInput interface {
	pulumi.Input

	ToChannelWebChatSiteArrayOutput() ChannelWebChatSiteArrayOutput
	ToChannelWebChatSiteArrayOutputWithContext(context.Context) ChannelWebChatSiteArrayOutput
}

type ChannelWebChatSiteArray []ChannelWebChatSiteInput

func (ChannelWebChatSiteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelWebChatSite)(nil)).Elem()
}

func (i ChannelWebChatSiteArray) ToChannelWebChatSiteArrayOutput() ChannelWebChatSiteArrayOutput {
	return i.ToChannelWebChatSiteArrayOutputWithContext(context.Background())
}

func (i ChannelWebChatSiteArray) ToChannelWebChatSiteArrayOutputWithContext(ctx context.Context) ChannelWebChatSiteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelWebChatSiteArrayOutput)
}

type ChannelWebChatSiteOutput struct{ *pulumi.OutputState }

func (ChannelWebChatSiteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ChannelWebChatSite)(nil)).Elem()
}

func (o ChannelWebChatSiteOutput) ToChannelWebChatSiteOutput() ChannelWebChatSiteOutput {
	return o
}

func (o ChannelWebChatSiteOutput) ToChannelWebChatSiteOutputWithContext(ctx context.Context) ChannelWebChatSiteOutput {
	return o
}

// Is the endpoint parameters enabled for this site?
func (o ChannelWebChatSiteOutput) EndpointParametersEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelWebChatSite) *bool { return v.EndpointParametersEnabled }).(pulumi.BoolPtrOutput)
}

// The name of the site.
func (o ChannelWebChatSiteOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ChannelWebChatSite) string { return v.Name }).(pulumi.StringOutput)
}

// Is the storage site enabled for detailed logging? Defaults to `true`.
func (o ChannelWebChatSiteOutput) StorageEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelWebChatSite) *bool { return v.StorageEnabled }).(pulumi.BoolPtrOutput)
}

// Is the user upload enabled for this site? Defaults to `true`.
func (o ChannelWebChatSiteOutput) UserUploadEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ChannelWebChatSite) *bool { return v.UserUploadEnabled }).(pulumi.BoolPtrOutput)
}

type ChannelWebChatSiteArrayOutput struct{ *pulumi.OutputState }

func (ChannelWebChatSiteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ChannelWebChatSite)(nil)).Elem()
}

func (o ChannelWebChatSiteArrayOutput) ToChannelWebChatSiteArrayOutput() ChannelWebChatSiteArrayOutput {
	return o
}

func (o ChannelWebChatSiteArrayOutput) ToChannelWebChatSiteArrayOutputWithContext(ctx context.Context) ChannelWebChatSiteArrayOutput {
	return o
}

func (o ChannelWebChatSiteArrayOutput) Index(i pulumi.IntInput) ChannelWebChatSiteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ChannelWebChatSite {
		return vs[0].([]ChannelWebChatSite)[vs[1].(int)]
	}).(ChannelWebChatSiteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelDirectLineSiteInput)(nil)).Elem(), ChannelDirectLineSiteArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelDirectLineSiteArrayInput)(nil)).Elem(), ChannelDirectLineSiteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelFacebookPageInput)(nil)).Elem(), ChannelFacebookPageArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelFacebookPageArrayInput)(nil)).Elem(), ChannelFacebookPageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelLineLineChannelInput)(nil)).Elem(), ChannelLineLineChannelArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelLineLineChannelArrayInput)(nil)).Elem(), ChannelLineLineChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelWebChatSiteInput)(nil)).Elem(), ChannelWebChatSiteArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelWebChatSiteArrayInput)(nil)).Elem(), ChannelWebChatSiteArray{})
	pulumi.RegisterOutputType(ChannelDirectLineSiteOutput{})
	pulumi.RegisterOutputType(ChannelDirectLineSiteArrayOutput{})
	pulumi.RegisterOutputType(ChannelFacebookPageOutput{})
	pulumi.RegisterOutputType(ChannelFacebookPageArrayOutput{})
	pulumi.RegisterOutputType(ChannelLineLineChannelOutput{})
	pulumi.RegisterOutputType(ChannelLineLineChannelArrayOutput{})
	pulumi.RegisterOutputType(ChannelWebChatSiteOutput{})
	pulumi.RegisterOutputType(ChannelWebChatSiteArrayOutput{})
}
