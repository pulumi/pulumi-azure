// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package webpubsub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Web Pubsub Custom Certificate.
//
// ## Import
//
// Custom Certificate for a Web Pubsub service can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:webpubsub/customCertificate:CustomCertificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/webPubSub/WebPubsub1/customCertificates/cert1
//
// ```
type CustomCertificate struct {
	pulumi.CustomResourceState

	// The certificate version of the Web Pubsub Custom Certificate.
	CertificateVersion pulumi.StringOutput `pulumi:"certificateVersion"`
	// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	CustomCertificateId pulumi.StringOutput `pulumi:"customCertificateId"`
	// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	WebPubsubId pulumi.StringOutput `pulumi:"webPubsubId"`
}

// NewCustomCertificate registers a new resource with the given unique name, arguments, and options.
func NewCustomCertificate(ctx *pulumi.Context,
	name string, args *CustomCertificateArgs, opts ...pulumi.ResourceOption) (*CustomCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomCertificateId == nil {
		return nil, errors.New("invalid value for required argument 'CustomCertificateId'")
	}
	if args.WebPubsubId == nil {
		return nil, errors.New("invalid value for required argument 'WebPubsubId'")
	}
	var resource CustomCertificate
	err := ctx.RegisterResource("azure:webpubsub/customCertificate:CustomCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomCertificate gets an existing CustomCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomCertificateState, opts ...pulumi.ResourceOption) (*CustomCertificate, error) {
	var resource CustomCertificate
	err := ctx.ReadResource("azure:webpubsub/customCertificate:CustomCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomCertificate resources.
type customCertificateState struct {
	// The certificate version of the Web Pubsub Custom Certificate.
	CertificateVersion *string `pulumi:"certificateVersion"`
	// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	CustomCertificateId *string `pulumi:"customCertificateId"`
	// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	WebPubsubId *string `pulumi:"webPubsubId"`
}

type CustomCertificateState struct {
	// The certificate version of the Web Pubsub Custom Certificate.
	CertificateVersion pulumi.StringPtrInput
	// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	CustomCertificateId pulumi.StringPtrInput
	// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	WebPubsubId pulumi.StringPtrInput
}

func (CustomCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*customCertificateState)(nil)).Elem()
}

type customCertificateArgs struct {
	// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	CustomCertificateId string `pulumi:"customCertificateId"`
	// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	WebPubsubId string `pulumi:"webPubsubId"`
}

// The set of arguments for constructing a CustomCertificate resource.
type CustomCertificateArgs struct {
	// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	CustomCertificateId pulumi.StringInput
	// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
	WebPubsubId pulumi.StringInput
}

func (CustomCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customCertificateArgs)(nil)).Elem()
}

type CustomCertificateInput interface {
	pulumi.Input

	ToCustomCertificateOutput() CustomCertificateOutput
	ToCustomCertificateOutputWithContext(ctx context.Context) CustomCertificateOutput
}

func (*CustomCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomCertificate)(nil)).Elem()
}

func (i *CustomCertificate) ToCustomCertificateOutput() CustomCertificateOutput {
	return i.ToCustomCertificateOutputWithContext(context.Background())
}

func (i *CustomCertificate) ToCustomCertificateOutputWithContext(ctx context.Context) CustomCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomCertificateOutput)
}

// CustomCertificateArrayInput is an input type that accepts CustomCertificateArray and CustomCertificateArrayOutput values.
// You can construct a concrete instance of `CustomCertificateArrayInput` via:
//
//	CustomCertificateArray{ CustomCertificateArgs{...} }
type CustomCertificateArrayInput interface {
	pulumi.Input

	ToCustomCertificateArrayOutput() CustomCertificateArrayOutput
	ToCustomCertificateArrayOutputWithContext(context.Context) CustomCertificateArrayOutput
}

type CustomCertificateArray []CustomCertificateInput

func (CustomCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomCertificate)(nil)).Elem()
}

func (i CustomCertificateArray) ToCustomCertificateArrayOutput() CustomCertificateArrayOutput {
	return i.ToCustomCertificateArrayOutputWithContext(context.Background())
}

func (i CustomCertificateArray) ToCustomCertificateArrayOutputWithContext(ctx context.Context) CustomCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomCertificateArrayOutput)
}

// CustomCertificateMapInput is an input type that accepts CustomCertificateMap and CustomCertificateMapOutput values.
// You can construct a concrete instance of `CustomCertificateMapInput` via:
//
//	CustomCertificateMap{ "key": CustomCertificateArgs{...} }
type CustomCertificateMapInput interface {
	pulumi.Input

	ToCustomCertificateMapOutput() CustomCertificateMapOutput
	ToCustomCertificateMapOutputWithContext(context.Context) CustomCertificateMapOutput
}

type CustomCertificateMap map[string]CustomCertificateInput

func (CustomCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomCertificate)(nil)).Elem()
}

func (i CustomCertificateMap) ToCustomCertificateMapOutput() CustomCertificateMapOutput {
	return i.ToCustomCertificateMapOutputWithContext(context.Background())
}

func (i CustomCertificateMap) ToCustomCertificateMapOutputWithContext(ctx context.Context) CustomCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomCertificateMapOutput)
}

type CustomCertificateOutput struct{ *pulumi.OutputState }

func (CustomCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomCertificate)(nil)).Elem()
}

func (o CustomCertificateOutput) ToCustomCertificateOutput() CustomCertificateOutput {
	return o
}

func (o CustomCertificateOutput) ToCustomCertificateOutputWithContext(ctx context.Context) CustomCertificateOutput {
	return o
}

// The certificate version of the Web Pubsub Custom Certificate.
func (o CustomCertificateOutput) CertificateVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomCertificate) pulumi.StringOutput { return v.CertificateVersion }).(pulumi.StringOutput)
}

// The certificate id of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
func (o CustomCertificateOutput) CustomCertificateId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomCertificate) pulumi.StringOutput { return v.CustomCertificateId }).(pulumi.StringOutput)
}

// The name of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
func (o CustomCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Web Pubsub ID of the Web Pubsub Custom Certificate. Changing this forces a new resource to be created.
func (o CustomCertificateOutput) WebPubsubId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomCertificate) pulumi.StringOutput { return v.WebPubsubId }).(pulumi.StringOutput)
}

type CustomCertificateArrayOutput struct{ *pulumi.OutputState }

func (CustomCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomCertificate)(nil)).Elem()
}

func (o CustomCertificateArrayOutput) ToCustomCertificateArrayOutput() CustomCertificateArrayOutput {
	return o
}

func (o CustomCertificateArrayOutput) ToCustomCertificateArrayOutputWithContext(ctx context.Context) CustomCertificateArrayOutput {
	return o
}

func (o CustomCertificateArrayOutput) Index(i pulumi.IntInput) CustomCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomCertificate {
		return vs[0].([]*CustomCertificate)[vs[1].(int)]
	}).(CustomCertificateOutput)
}

type CustomCertificateMapOutput struct{ *pulumi.OutputState }

func (CustomCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomCertificate)(nil)).Elem()
}

func (o CustomCertificateMapOutput) ToCustomCertificateMapOutput() CustomCertificateMapOutput {
	return o
}

func (o CustomCertificateMapOutput) ToCustomCertificateMapOutputWithContext(ctx context.Context) CustomCertificateMapOutput {
	return o
}

func (o CustomCertificateMapOutput) MapIndex(k pulumi.StringInput) CustomCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomCertificate {
		return vs[0].(map[string]*CustomCertificate)[vs[1].(string)]
	}).(CustomCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomCertificateInput)(nil)).Elem(), &CustomCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomCertificateArrayInput)(nil)).Elem(), CustomCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomCertificateMapInput)(nil)).Elem(), CustomCertificateMap{})
	pulumi.RegisterOutputType(CustomCertificateOutput{})
	pulumi.RegisterOutputType(CustomCertificateArrayOutput{})
	pulumi.RegisterOutputType(CustomCertificateMapOutput{})
}