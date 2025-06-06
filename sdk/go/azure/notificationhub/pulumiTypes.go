// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package notificationhub

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type HubApnsCredential struct {
	// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
	ApplicationMode string `pulumi:"applicationMode"`
	// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
	BundleId string `pulumi:"bundleId"`
	// The Apple Push Notifications Service (APNS) Key.
	KeyId string `pulumi:"keyId"`
	// The ID of the team the Token.
	TeamId string `pulumi:"teamId"`
	// The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
	Token string `pulumi:"token"`
}

// HubApnsCredentialInput is an input type that accepts HubApnsCredentialArgs and HubApnsCredentialOutput values.
// You can construct a concrete instance of `HubApnsCredentialInput` via:
//
//	HubApnsCredentialArgs{...}
type HubApnsCredentialInput interface {
	pulumi.Input

	ToHubApnsCredentialOutput() HubApnsCredentialOutput
	ToHubApnsCredentialOutputWithContext(context.Context) HubApnsCredentialOutput
}

type HubApnsCredentialArgs struct {
	// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
	ApplicationMode pulumi.StringInput `pulumi:"applicationMode"`
	// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
	BundleId pulumi.StringInput `pulumi:"bundleId"`
	// The Apple Push Notifications Service (APNS) Key.
	KeyId pulumi.StringInput `pulumi:"keyId"`
	// The ID of the team the Token.
	TeamId pulumi.StringInput `pulumi:"teamId"`
	// The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
	Token pulumi.StringInput `pulumi:"token"`
}

func (HubApnsCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*HubApnsCredential)(nil)).Elem()
}

func (i HubApnsCredentialArgs) ToHubApnsCredentialOutput() HubApnsCredentialOutput {
	return i.ToHubApnsCredentialOutputWithContext(context.Background())
}

func (i HubApnsCredentialArgs) ToHubApnsCredentialOutputWithContext(ctx context.Context) HubApnsCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubApnsCredentialOutput)
}

func (i HubApnsCredentialArgs) ToHubApnsCredentialPtrOutput() HubApnsCredentialPtrOutput {
	return i.ToHubApnsCredentialPtrOutputWithContext(context.Background())
}

func (i HubApnsCredentialArgs) ToHubApnsCredentialPtrOutputWithContext(ctx context.Context) HubApnsCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubApnsCredentialOutput).ToHubApnsCredentialPtrOutputWithContext(ctx)
}

// HubApnsCredentialPtrInput is an input type that accepts HubApnsCredentialArgs, HubApnsCredentialPtr and HubApnsCredentialPtrOutput values.
// You can construct a concrete instance of `HubApnsCredentialPtrInput` via:
//
//	        HubApnsCredentialArgs{...}
//
//	or:
//
//	        nil
type HubApnsCredentialPtrInput interface {
	pulumi.Input

	ToHubApnsCredentialPtrOutput() HubApnsCredentialPtrOutput
	ToHubApnsCredentialPtrOutputWithContext(context.Context) HubApnsCredentialPtrOutput
}

type hubApnsCredentialPtrType HubApnsCredentialArgs

func HubApnsCredentialPtr(v *HubApnsCredentialArgs) HubApnsCredentialPtrInput {
	return (*hubApnsCredentialPtrType)(v)
}

func (*hubApnsCredentialPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**HubApnsCredential)(nil)).Elem()
}

func (i *hubApnsCredentialPtrType) ToHubApnsCredentialPtrOutput() HubApnsCredentialPtrOutput {
	return i.ToHubApnsCredentialPtrOutputWithContext(context.Background())
}

func (i *hubApnsCredentialPtrType) ToHubApnsCredentialPtrOutputWithContext(ctx context.Context) HubApnsCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubApnsCredentialPtrOutput)
}

type HubApnsCredentialOutput struct{ *pulumi.OutputState }

func (HubApnsCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HubApnsCredential)(nil)).Elem()
}

func (o HubApnsCredentialOutput) ToHubApnsCredentialOutput() HubApnsCredentialOutput {
	return o
}

func (o HubApnsCredentialOutput) ToHubApnsCredentialOutputWithContext(ctx context.Context) HubApnsCredentialOutput {
	return o
}

func (o HubApnsCredentialOutput) ToHubApnsCredentialPtrOutput() HubApnsCredentialPtrOutput {
	return o.ToHubApnsCredentialPtrOutputWithContext(context.Background())
}

func (o HubApnsCredentialOutput) ToHubApnsCredentialPtrOutputWithContext(ctx context.Context) HubApnsCredentialPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v HubApnsCredential) *HubApnsCredential {
		return &v
	}).(HubApnsCredentialPtrOutput)
}

// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
func (o HubApnsCredentialOutput) ApplicationMode() pulumi.StringOutput {
	return o.ApplyT(func(v HubApnsCredential) string { return v.ApplicationMode }).(pulumi.StringOutput)
}

// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
func (o HubApnsCredentialOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v HubApnsCredential) string { return v.BundleId }).(pulumi.StringOutput)
}

// The Apple Push Notifications Service (APNS) Key.
func (o HubApnsCredentialOutput) KeyId() pulumi.StringOutput {
	return o.ApplyT(func(v HubApnsCredential) string { return v.KeyId }).(pulumi.StringOutput)
}

// The ID of the team the Token.
func (o HubApnsCredentialOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v HubApnsCredential) string { return v.TeamId }).(pulumi.StringOutput)
}

// The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
func (o HubApnsCredentialOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v HubApnsCredential) string { return v.Token }).(pulumi.StringOutput)
}

type HubApnsCredentialPtrOutput struct{ *pulumi.OutputState }

func (HubApnsCredentialPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HubApnsCredential)(nil)).Elem()
}

func (o HubApnsCredentialPtrOutput) ToHubApnsCredentialPtrOutput() HubApnsCredentialPtrOutput {
	return o
}

func (o HubApnsCredentialPtrOutput) ToHubApnsCredentialPtrOutputWithContext(ctx context.Context) HubApnsCredentialPtrOutput {
	return o
}

func (o HubApnsCredentialPtrOutput) Elem() HubApnsCredentialOutput {
	return o.ApplyT(func(v *HubApnsCredential) HubApnsCredential {
		if v != nil {
			return *v
		}
		var ret HubApnsCredential
		return ret
	}).(HubApnsCredentialOutput)
}

// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
func (o HubApnsCredentialPtrOutput) ApplicationMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubApnsCredential) *string {
		if v == nil {
			return nil
		}
		return &v.ApplicationMode
	}).(pulumi.StringPtrOutput)
}

// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
func (o HubApnsCredentialPtrOutput) BundleId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubApnsCredential) *string {
		if v == nil {
			return nil
		}
		return &v.BundleId
	}).(pulumi.StringPtrOutput)
}

// The Apple Push Notifications Service (APNS) Key.
func (o HubApnsCredentialPtrOutput) KeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubApnsCredential) *string {
		if v == nil {
			return nil
		}
		return &v.KeyId
	}).(pulumi.StringPtrOutput)
}

// The ID of the team the Token.
func (o HubApnsCredentialPtrOutput) TeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubApnsCredential) *string {
		if v == nil {
			return nil
		}
		return &v.TeamId
	}).(pulumi.StringPtrOutput)
}

// The Push Token associated with the Apple Developer Account. This is the contents of the `key` downloaded from [the Apple Developer Portal](https://developer.apple.com/account/ios/authkey/) between the `-----BEGIN PRIVATE KEY-----` and `-----END PRIVATE KEY-----` blocks.
func (o HubApnsCredentialPtrOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubApnsCredential) *string {
		if v == nil {
			return nil
		}
		return &v.Token
	}).(pulumi.StringPtrOutput)
}

type HubBrowserCredential struct {
	// The subject name of web push.
	Subject string `pulumi:"subject"`
	// The Voluntary Application Server Identification (VAPID) private key.
	VapidPrivateKey string `pulumi:"vapidPrivateKey"`
	// The Voluntary Application Server Identification (VAPID) public key.
	VapidPublicKey string `pulumi:"vapidPublicKey"`
}

// HubBrowserCredentialInput is an input type that accepts HubBrowserCredentialArgs and HubBrowserCredentialOutput values.
// You can construct a concrete instance of `HubBrowserCredentialInput` via:
//
//	HubBrowserCredentialArgs{...}
type HubBrowserCredentialInput interface {
	pulumi.Input

	ToHubBrowserCredentialOutput() HubBrowserCredentialOutput
	ToHubBrowserCredentialOutputWithContext(context.Context) HubBrowserCredentialOutput
}

type HubBrowserCredentialArgs struct {
	// The subject name of web push.
	Subject pulumi.StringInput `pulumi:"subject"`
	// The Voluntary Application Server Identification (VAPID) private key.
	VapidPrivateKey pulumi.StringInput `pulumi:"vapidPrivateKey"`
	// The Voluntary Application Server Identification (VAPID) public key.
	VapidPublicKey pulumi.StringInput `pulumi:"vapidPublicKey"`
}

func (HubBrowserCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*HubBrowserCredential)(nil)).Elem()
}

func (i HubBrowserCredentialArgs) ToHubBrowserCredentialOutput() HubBrowserCredentialOutput {
	return i.ToHubBrowserCredentialOutputWithContext(context.Background())
}

func (i HubBrowserCredentialArgs) ToHubBrowserCredentialOutputWithContext(ctx context.Context) HubBrowserCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubBrowserCredentialOutput)
}

func (i HubBrowserCredentialArgs) ToHubBrowserCredentialPtrOutput() HubBrowserCredentialPtrOutput {
	return i.ToHubBrowserCredentialPtrOutputWithContext(context.Background())
}

func (i HubBrowserCredentialArgs) ToHubBrowserCredentialPtrOutputWithContext(ctx context.Context) HubBrowserCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubBrowserCredentialOutput).ToHubBrowserCredentialPtrOutputWithContext(ctx)
}

// HubBrowserCredentialPtrInput is an input type that accepts HubBrowserCredentialArgs, HubBrowserCredentialPtr and HubBrowserCredentialPtrOutput values.
// You can construct a concrete instance of `HubBrowserCredentialPtrInput` via:
//
//	        HubBrowserCredentialArgs{...}
//
//	or:
//
//	        nil
type HubBrowserCredentialPtrInput interface {
	pulumi.Input

	ToHubBrowserCredentialPtrOutput() HubBrowserCredentialPtrOutput
	ToHubBrowserCredentialPtrOutputWithContext(context.Context) HubBrowserCredentialPtrOutput
}

type hubBrowserCredentialPtrType HubBrowserCredentialArgs

func HubBrowserCredentialPtr(v *HubBrowserCredentialArgs) HubBrowserCredentialPtrInput {
	return (*hubBrowserCredentialPtrType)(v)
}

func (*hubBrowserCredentialPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**HubBrowserCredential)(nil)).Elem()
}

func (i *hubBrowserCredentialPtrType) ToHubBrowserCredentialPtrOutput() HubBrowserCredentialPtrOutput {
	return i.ToHubBrowserCredentialPtrOutputWithContext(context.Background())
}

func (i *hubBrowserCredentialPtrType) ToHubBrowserCredentialPtrOutputWithContext(ctx context.Context) HubBrowserCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubBrowserCredentialPtrOutput)
}

type HubBrowserCredentialOutput struct{ *pulumi.OutputState }

func (HubBrowserCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HubBrowserCredential)(nil)).Elem()
}

func (o HubBrowserCredentialOutput) ToHubBrowserCredentialOutput() HubBrowserCredentialOutput {
	return o
}

func (o HubBrowserCredentialOutput) ToHubBrowserCredentialOutputWithContext(ctx context.Context) HubBrowserCredentialOutput {
	return o
}

func (o HubBrowserCredentialOutput) ToHubBrowserCredentialPtrOutput() HubBrowserCredentialPtrOutput {
	return o.ToHubBrowserCredentialPtrOutputWithContext(context.Background())
}

func (o HubBrowserCredentialOutput) ToHubBrowserCredentialPtrOutputWithContext(ctx context.Context) HubBrowserCredentialPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v HubBrowserCredential) *HubBrowserCredential {
		return &v
	}).(HubBrowserCredentialPtrOutput)
}

// The subject name of web push.
func (o HubBrowserCredentialOutput) Subject() pulumi.StringOutput {
	return o.ApplyT(func(v HubBrowserCredential) string { return v.Subject }).(pulumi.StringOutput)
}

// The Voluntary Application Server Identification (VAPID) private key.
func (o HubBrowserCredentialOutput) VapidPrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v HubBrowserCredential) string { return v.VapidPrivateKey }).(pulumi.StringOutput)
}

// The Voluntary Application Server Identification (VAPID) public key.
func (o HubBrowserCredentialOutput) VapidPublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v HubBrowserCredential) string { return v.VapidPublicKey }).(pulumi.StringOutput)
}

type HubBrowserCredentialPtrOutput struct{ *pulumi.OutputState }

func (HubBrowserCredentialPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HubBrowserCredential)(nil)).Elem()
}

func (o HubBrowserCredentialPtrOutput) ToHubBrowserCredentialPtrOutput() HubBrowserCredentialPtrOutput {
	return o
}

func (o HubBrowserCredentialPtrOutput) ToHubBrowserCredentialPtrOutputWithContext(ctx context.Context) HubBrowserCredentialPtrOutput {
	return o
}

func (o HubBrowserCredentialPtrOutput) Elem() HubBrowserCredentialOutput {
	return o.ApplyT(func(v *HubBrowserCredential) HubBrowserCredential {
		if v != nil {
			return *v
		}
		var ret HubBrowserCredential
		return ret
	}).(HubBrowserCredentialOutput)
}

// The subject name of web push.
func (o HubBrowserCredentialPtrOutput) Subject() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubBrowserCredential) *string {
		if v == nil {
			return nil
		}
		return &v.Subject
	}).(pulumi.StringPtrOutput)
}

// The Voluntary Application Server Identification (VAPID) private key.
func (o HubBrowserCredentialPtrOutput) VapidPrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubBrowserCredential) *string {
		if v == nil {
			return nil
		}
		return &v.VapidPrivateKey
	}).(pulumi.StringPtrOutput)
}

// The Voluntary Application Server Identification (VAPID) public key.
func (o HubBrowserCredentialPtrOutput) VapidPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubBrowserCredential) *string {
		if v == nil {
			return nil
		}
		return &v.VapidPublicKey
	}).(pulumi.StringPtrOutput)
}

type HubGcmCredential struct {
	// The API Key associated with the Google Cloud Messaging service.
	ApiKey string `pulumi:"apiKey"`
}

// HubGcmCredentialInput is an input type that accepts HubGcmCredentialArgs and HubGcmCredentialOutput values.
// You can construct a concrete instance of `HubGcmCredentialInput` via:
//
//	HubGcmCredentialArgs{...}
type HubGcmCredentialInput interface {
	pulumi.Input

	ToHubGcmCredentialOutput() HubGcmCredentialOutput
	ToHubGcmCredentialOutputWithContext(context.Context) HubGcmCredentialOutput
}

type HubGcmCredentialArgs struct {
	// The API Key associated with the Google Cloud Messaging service.
	ApiKey pulumi.StringInput `pulumi:"apiKey"`
}

func (HubGcmCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*HubGcmCredential)(nil)).Elem()
}

func (i HubGcmCredentialArgs) ToHubGcmCredentialOutput() HubGcmCredentialOutput {
	return i.ToHubGcmCredentialOutputWithContext(context.Background())
}

func (i HubGcmCredentialArgs) ToHubGcmCredentialOutputWithContext(ctx context.Context) HubGcmCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubGcmCredentialOutput)
}

func (i HubGcmCredentialArgs) ToHubGcmCredentialPtrOutput() HubGcmCredentialPtrOutput {
	return i.ToHubGcmCredentialPtrOutputWithContext(context.Background())
}

func (i HubGcmCredentialArgs) ToHubGcmCredentialPtrOutputWithContext(ctx context.Context) HubGcmCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubGcmCredentialOutput).ToHubGcmCredentialPtrOutputWithContext(ctx)
}

// HubGcmCredentialPtrInput is an input type that accepts HubGcmCredentialArgs, HubGcmCredentialPtr and HubGcmCredentialPtrOutput values.
// You can construct a concrete instance of `HubGcmCredentialPtrInput` via:
//
//	        HubGcmCredentialArgs{...}
//
//	or:
//
//	        nil
type HubGcmCredentialPtrInput interface {
	pulumi.Input

	ToHubGcmCredentialPtrOutput() HubGcmCredentialPtrOutput
	ToHubGcmCredentialPtrOutputWithContext(context.Context) HubGcmCredentialPtrOutput
}

type hubGcmCredentialPtrType HubGcmCredentialArgs

func HubGcmCredentialPtr(v *HubGcmCredentialArgs) HubGcmCredentialPtrInput {
	return (*hubGcmCredentialPtrType)(v)
}

func (*hubGcmCredentialPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**HubGcmCredential)(nil)).Elem()
}

func (i *hubGcmCredentialPtrType) ToHubGcmCredentialPtrOutput() HubGcmCredentialPtrOutput {
	return i.ToHubGcmCredentialPtrOutputWithContext(context.Background())
}

func (i *hubGcmCredentialPtrType) ToHubGcmCredentialPtrOutputWithContext(ctx context.Context) HubGcmCredentialPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HubGcmCredentialPtrOutput)
}

type HubGcmCredentialOutput struct{ *pulumi.OutputState }

func (HubGcmCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HubGcmCredential)(nil)).Elem()
}

func (o HubGcmCredentialOutput) ToHubGcmCredentialOutput() HubGcmCredentialOutput {
	return o
}

func (o HubGcmCredentialOutput) ToHubGcmCredentialOutputWithContext(ctx context.Context) HubGcmCredentialOutput {
	return o
}

func (o HubGcmCredentialOutput) ToHubGcmCredentialPtrOutput() HubGcmCredentialPtrOutput {
	return o.ToHubGcmCredentialPtrOutputWithContext(context.Background())
}

func (o HubGcmCredentialOutput) ToHubGcmCredentialPtrOutputWithContext(ctx context.Context) HubGcmCredentialPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v HubGcmCredential) *HubGcmCredential {
		return &v
	}).(HubGcmCredentialPtrOutput)
}

// The API Key associated with the Google Cloud Messaging service.
func (o HubGcmCredentialOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v HubGcmCredential) string { return v.ApiKey }).(pulumi.StringOutput)
}

type HubGcmCredentialPtrOutput struct{ *pulumi.OutputState }

func (HubGcmCredentialPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HubGcmCredential)(nil)).Elem()
}

func (o HubGcmCredentialPtrOutput) ToHubGcmCredentialPtrOutput() HubGcmCredentialPtrOutput {
	return o
}

func (o HubGcmCredentialPtrOutput) ToHubGcmCredentialPtrOutputWithContext(ctx context.Context) HubGcmCredentialPtrOutput {
	return o
}

func (o HubGcmCredentialPtrOutput) Elem() HubGcmCredentialOutput {
	return o.ApplyT(func(v *HubGcmCredential) HubGcmCredential {
		if v != nil {
			return *v
		}
		var ret HubGcmCredential
		return ret
	}).(HubGcmCredentialOutput)
}

// The API Key associated with the Google Cloud Messaging service.
func (o HubGcmCredentialPtrOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HubGcmCredential) *string {
		if v == nil {
			return nil
		}
		return &v.ApiKey
	}).(pulumi.StringPtrOutput)
}

type GetHubApnsCredential struct {
	// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
	ApplicationMode string `pulumi:"applicationMode"`
	// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
	BundleId string `pulumi:"bundleId"`
	// The Apple Push Notifications Service (APNS) Key.
	KeyId string `pulumi:"keyId"`
	// The ID of the team the Token.
	TeamId string `pulumi:"teamId"`
	// The Push Token associated with the Apple Developer Account.
	Token string `pulumi:"token"`
}

// GetHubApnsCredentialInput is an input type that accepts GetHubApnsCredentialArgs and GetHubApnsCredentialOutput values.
// You can construct a concrete instance of `GetHubApnsCredentialInput` via:
//
//	GetHubApnsCredentialArgs{...}
type GetHubApnsCredentialInput interface {
	pulumi.Input

	ToGetHubApnsCredentialOutput() GetHubApnsCredentialOutput
	ToGetHubApnsCredentialOutputWithContext(context.Context) GetHubApnsCredentialOutput
}

type GetHubApnsCredentialArgs struct {
	// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
	ApplicationMode pulumi.StringInput `pulumi:"applicationMode"`
	// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
	BundleId pulumi.StringInput `pulumi:"bundleId"`
	// The Apple Push Notifications Service (APNS) Key.
	KeyId pulumi.StringInput `pulumi:"keyId"`
	// The ID of the team the Token.
	TeamId pulumi.StringInput `pulumi:"teamId"`
	// The Push Token associated with the Apple Developer Account.
	Token pulumi.StringInput `pulumi:"token"`
}

func (GetHubApnsCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHubApnsCredential)(nil)).Elem()
}

func (i GetHubApnsCredentialArgs) ToGetHubApnsCredentialOutput() GetHubApnsCredentialOutput {
	return i.ToGetHubApnsCredentialOutputWithContext(context.Background())
}

func (i GetHubApnsCredentialArgs) ToGetHubApnsCredentialOutputWithContext(ctx context.Context) GetHubApnsCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHubApnsCredentialOutput)
}

// GetHubApnsCredentialArrayInput is an input type that accepts GetHubApnsCredentialArray and GetHubApnsCredentialArrayOutput values.
// You can construct a concrete instance of `GetHubApnsCredentialArrayInput` via:
//
//	GetHubApnsCredentialArray{ GetHubApnsCredentialArgs{...} }
type GetHubApnsCredentialArrayInput interface {
	pulumi.Input

	ToGetHubApnsCredentialArrayOutput() GetHubApnsCredentialArrayOutput
	ToGetHubApnsCredentialArrayOutputWithContext(context.Context) GetHubApnsCredentialArrayOutput
}

type GetHubApnsCredentialArray []GetHubApnsCredentialInput

func (GetHubApnsCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHubApnsCredential)(nil)).Elem()
}

func (i GetHubApnsCredentialArray) ToGetHubApnsCredentialArrayOutput() GetHubApnsCredentialArrayOutput {
	return i.ToGetHubApnsCredentialArrayOutputWithContext(context.Background())
}

func (i GetHubApnsCredentialArray) ToGetHubApnsCredentialArrayOutputWithContext(ctx context.Context) GetHubApnsCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHubApnsCredentialArrayOutput)
}

type GetHubApnsCredentialOutput struct{ *pulumi.OutputState }

func (GetHubApnsCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHubApnsCredential)(nil)).Elem()
}

func (o GetHubApnsCredentialOutput) ToGetHubApnsCredentialOutput() GetHubApnsCredentialOutput {
	return o
}

func (o GetHubApnsCredentialOutput) ToGetHubApnsCredentialOutputWithContext(ctx context.Context) GetHubApnsCredentialOutput {
	return o
}

// The Application Mode which defines which server the APNS Messages should be sent to. Possible values are `Production` and `Sandbox`.
func (o GetHubApnsCredentialOutput) ApplicationMode() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubApnsCredential) string { return v.ApplicationMode }).(pulumi.StringOutput)
}

// The Bundle ID of the iOS/macOS application to send push notifications for, such as `com.org.example`.
func (o GetHubApnsCredentialOutput) BundleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubApnsCredential) string { return v.BundleId }).(pulumi.StringOutput)
}

// The Apple Push Notifications Service (APNS) Key.
func (o GetHubApnsCredentialOutput) KeyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubApnsCredential) string { return v.KeyId }).(pulumi.StringOutput)
}

// The ID of the team the Token.
func (o GetHubApnsCredentialOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubApnsCredential) string { return v.TeamId }).(pulumi.StringOutput)
}

// The Push Token associated with the Apple Developer Account.
func (o GetHubApnsCredentialOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubApnsCredential) string { return v.Token }).(pulumi.StringOutput)
}

type GetHubApnsCredentialArrayOutput struct{ *pulumi.OutputState }

func (GetHubApnsCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHubApnsCredential)(nil)).Elem()
}

func (o GetHubApnsCredentialArrayOutput) ToGetHubApnsCredentialArrayOutput() GetHubApnsCredentialArrayOutput {
	return o
}

func (o GetHubApnsCredentialArrayOutput) ToGetHubApnsCredentialArrayOutputWithContext(ctx context.Context) GetHubApnsCredentialArrayOutput {
	return o
}

func (o GetHubApnsCredentialArrayOutput) Index(i pulumi.IntInput) GetHubApnsCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetHubApnsCredential {
		return vs[0].([]GetHubApnsCredential)[vs[1].(int)]
	}).(GetHubApnsCredentialOutput)
}

type GetHubGcmCredential struct {
	// The API Key associated with the Google Cloud Messaging service.
	ApiKey string `pulumi:"apiKey"`
}

// GetHubGcmCredentialInput is an input type that accepts GetHubGcmCredentialArgs and GetHubGcmCredentialOutput values.
// You can construct a concrete instance of `GetHubGcmCredentialInput` via:
//
//	GetHubGcmCredentialArgs{...}
type GetHubGcmCredentialInput interface {
	pulumi.Input

	ToGetHubGcmCredentialOutput() GetHubGcmCredentialOutput
	ToGetHubGcmCredentialOutputWithContext(context.Context) GetHubGcmCredentialOutput
}

type GetHubGcmCredentialArgs struct {
	// The API Key associated with the Google Cloud Messaging service.
	ApiKey pulumi.StringInput `pulumi:"apiKey"`
}

func (GetHubGcmCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHubGcmCredential)(nil)).Elem()
}

func (i GetHubGcmCredentialArgs) ToGetHubGcmCredentialOutput() GetHubGcmCredentialOutput {
	return i.ToGetHubGcmCredentialOutputWithContext(context.Background())
}

func (i GetHubGcmCredentialArgs) ToGetHubGcmCredentialOutputWithContext(ctx context.Context) GetHubGcmCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHubGcmCredentialOutput)
}

// GetHubGcmCredentialArrayInput is an input type that accepts GetHubGcmCredentialArray and GetHubGcmCredentialArrayOutput values.
// You can construct a concrete instance of `GetHubGcmCredentialArrayInput` via:
//
//	GetHubGcmCredentialArray{ GetHubGcmCredentialArgs{...} }
type GetHubGcmCredentialArrayInput interface {
	pulumi.Input

	ToGetHubGcmCredentialArrayOutput() GetHubGcmCredentialArrayOutput
	ToGetHubGcmCredentialArrayOutputWithContext(context.Context) GetHubGcmCredentialArrayOutput
}

type GetHubGcmCredentialArray []GetHubGcmCredentialInput

func (GetHubGcmCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHubGcmCredential)(nil)).Elem()
}

func (i GetHubGcmCredentialArray) ToGetHubGcmCredentialArrayOutput() GetHubGcmCredentialArrayOutput {
	return i.ToGetHubGcmCredentialArrayOutputWithContext(context.Background())
}

func (i GetHubGcmCredentialArray) ToGetHubGcmCredentialArrayOutputWithContext(ctx context.Context) GetHubGcmCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHubGcmCredentialArrayOutput)
}

type GetHubGcmCredentialOutput struct{ *pulumi.OutputState }

func (GetHubGcmCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHubGcmCredential)(nil)).Elem()
}

func (o GetHubGcmCredentialOutput) ToGetHubGcmCredentialOutput() GetHubGcmCredentialOutput {
	return o
}

func (o GetHubGcmCredentialOutput) ToGetHubGcmCredentialOutputWithContext(ctx context.Context) GetHubGcmCredentialOutput {
	return o
}

// The API Key associated with the Google Cloud Messaging service.
func (o GetHubGcmCredentialOutput) ApiKey() pulumi.StringOutput {
	return o.ApplyT(func(v GetHubGcmCredential) string { return v.ApiKey }).(pulumi.StringOutput)
}

type GetHubGcmCredentialArrayOutput struct{ *pulumi.OutputState }

func (GetHubGcmCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHubGcmCredential)(nil)).Elem()
}

func (o GetHubGcmCredentialArrayOutput) ToGetHubGcmCredentialArrayOutput() GetHubGcmCredentialArrayOutput {
	return o
}

func (o GetHubGcmCredentialArrayOutput) ToGetHubGcmCredentialArrayOutputWithContext(ctx context.Context) GetHubGcmCredentialArrayOutput {
	return o
}

func (o GetHubGcmCredentialArrayOutput) Index(i pulumi.IntInput) GetHubGcmCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetHubGcmCredential {
		return vs[0].([]GetHubGcmCredential)[vs[1].(int)]
	}).(GetHubGcmCredentialOutput)
}

type GetNamespaceSku struct {
	// Specifies the Name of the Notification Hub Namespace.
	Name string `pulumi:"name"`
}

// GetNamespaceSkuInput is an input type that accepts GetNamespaceSkuArgs and GetNamespaceSkuOutput values.
// You can construct a concrete instance of `GetNamespaceSkuInput` via:
//
//	GetNamespaceSkuArgs{...}
type GetNamespaceSkuInput interface {
	pulumi.Input

	ToGetNamespaceSkuOutput() GetNamespaceSkuOutput
	ToGetNamespaceSkuOutputWithContext(context.Context) GetNamespaceSkuOutput
}

type GetNamespaceSkuArgs struct {
	// Specifies the Name of the Notification Hub Namespace.
	Name pulumi.StringInput `pulumi:"name"`
}

func (GetNamespaceSkuArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNamespaceSku)(nil)).Elem()
}

func (i GetNamespaceSkuArgs) ToGetNamespaceSkuOutput() GetNamespaceSkuOutput {
	return i.ToGetNamespaceSkuOutputWithContext(context.Background())
}

func (i GetNamespaceSkuArgs) ToGetNamespaceSkuOutputWithContext(ctx context.Context) GetNamespaceSkuOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetNamespaceSkuOutput)
}

type GetNamespaceSkuOutput struct{ *pulumi.OutputState }

func (GetNamespaceSkuOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNamespaceSku)(nil)).Elem()
}

func (o GetNamespaceSkuOutput) ToGetNamespaceSkuOutput() GetNamespaceSkuOutput {
	return o
}

func (o GetNamespaceSkuOutput) ToGetNamespaceSkuOutputWithContext(ctx context.Context) GetNamespaceSkuOutput {
	return o
}

// Specifies the Name of the Notification Hub Namespace.
func (o GetNamespaceSkuOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetNamespaceSku) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HubApnsCredentialInput)(nil)).Elem(), HubApnsCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HubApnsCredentialPtrInput)(nil)).Elem(), HubApnsCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HubBrowserCredentialInput)(nil)).Elem(), HubBrowserCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HubBrowserCredentialPtrInput)(nil)).Elem(), HubBrowserCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HubGcmCredentialInput)(nil)).Elem(), HubGcmCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HubGcmCredentialPtrInput)(nil)).Elem(), HubGcmCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHubApnsCredentialInput)(nil)).Elem(), GetHubApnsCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHubApnsCredentialArrayInput)(nil)).Elem(), GetHubApnsCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHubGcmCredentialInput)(nil)).Elem(), GetHubGcmCredentialArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHubGcmCredentialArrayInput)(nil)).Elem(), GetHubGcmCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetNamespaceSkuInput)(nil)).Elem(), GetNamespaceSkuArgs{})
	pulumi.RegisterOutputType(HubApnsCredentialOutput{})
	pulumi.RegisterOutputType(HubApnsCredentialPtrOutput{})
	pulumi.RegisterOutputType(HubBrowserCredentialOutput{})
	pulumi.RegisterOutputType(HubBrowserCredentialPtrOutput{})
	pulumi.RegisterOutputType(HubGcmCredentialOutput{})
	pulumi.RegisterOutputType(HubGcmCredentialPtrOutput{})
	pulumi.RegisterOutputType(GetHubApnsCredentialOutput{})
	pulumi.RegisterOutputType(GetHubApnsCredentialArrayOutput{})
	pulumi.RegisterOutputType(GetHubGcmCredentialOutput{})
	pulumi.RegisterOutputType(GetHubGcmCredentialArrayOutput{})
	pulumi.RegisterOutputType(GetNamespaceSkuOutput{})
}
