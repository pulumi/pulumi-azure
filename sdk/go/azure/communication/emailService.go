// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package communication

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Email Communication Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/communication"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = communication.NewEmailService(ctx, "example", &communication.EmailServiceArgs{
//				Name:              pulumi.String("example-emailcommunicationservice"),
//				ResourceGroupName: example.Name,
//				DataLocation:      pulumi.String("United States"),
//			})
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
// This resource uses the following Azure API Providers:
//
// * `Microsoft.Communication`: 2023-03-31
//
// ## Import
//
// Communication Services can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:communication/emailService:EmailService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Communication/emailServices/emailCommunicationService1
// ```
type EmailService struct {
	pulumi.CustomResourceState

	// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
	DataLocation pulumi.StringOutput `pulumi:"dataLocation"`
	// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Email Communication Service.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewEmailService registers a new resource with the given unique name, arguments, and options.
func NewEmailService(ctx *pulumi.Context,
	name string, args *EmailServiceArgs, opts ...pulumi.ResourceOption) (*EmailService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataLocation == nil {
		return nil, errors.New("invalid value for required argument 'DataLocation'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailService
	err := ctx.RegisterResource("azure:communication/emailService:EmailService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailService gets an existing EmailService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailServiceState, opts ...pulumi.ResourceOption) (*EmailService, error) {
	var resource EmailService
	err := ctx.ReadResource("azure:communication/emailService:EmailService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailService resources.
type emailServiceState struct {
	// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
	DataLocation *string `pulumi:"dataLocation"`
	// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Email Communication Service.
	Tags map[string]string `pulumi:"tags"`
}

type EmailServiceState struct {
	// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
	DataLocation pulumi.StringPtrInput
	// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Email Communication Service.
	Tags pulumi.StringMapInput
}

func (EmailServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailServiceState)(nil)).Elem()
}

type emailServiceArgs struct {
	// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
	DataLocation string `pulumi:"dataLocation"`
	// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Email Communication Service.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a EmailService resource.
type EmailServiceArgs struct {
	// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
	DataLocation pulumi.StringInput
	// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Email Communication Service.
	Tags pulumi.StringMapInput
}

func (EmailServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailServiceArgs)(nil)).Elem()
}

type EmailServiceInput interface {
	pulumi.Input

	ToEmailServiceOutput() EmailServiceOutput
	ToEmailServiceOutputWithContext(ctx context.Context) EmailServiceOutput
}

func (*EmailService) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailService)(nil)).Elem()
}

func (i *EmailService) ToEmailServiceOutput() EmailServiceOutput {
	return i.ToEmailServiceOutputWithContext(context.Background())
}

func (i *EmailService) ToEmailServiceOutputWithContext(ctx context.Context) EmailServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailServiceOutput)
}

// EmailServiceArrayInput is an input type that accepts EmailServiceArray and EmailServiceArrayOutput values.
// You can construct a concrete instance of `EmailServiceArrayInput` via:
//
//	EmailServiceArray{ EmailServiceArgs{...} }
type EmailServiceArrayInput interface {
	pulumi.Input

	ToEmailServiceArrayOutput() EmailServiceArrayOutput
	ToEmailServiceArrayOutputWithContext(context.Context) EmailServiceArrayOutput
}

type EmailServiceArray []EmailServiceInput

func (EmailServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailService)(nil)).Elem()
}

func (i EmailServiceArray) ToEmailServiceArrayOutput() EmailServiceArrayOutput {
	return i.ToEmailServiceArrayOutputWithContext(context.Background())
}

func (i EmailServiceArray) ToEmailServiceArrayOutputWithContext(ctx context.Context) EmailServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailServiceArrayOutput)
}

// EmailServiceMapInput is an input type that accepts EmailServiceMap and EmailServiceMapOutput values.
// You can construct a concrete instance of `EmailServiceMapInput` via:
//
//	EmailServiceMap{ "key": EmailServiceArgs{...} }
type EmailServiceMapInput interface {
	pulumi.Input

	ToEmailServiceMapOutput() EmailServiceMapOutput
	ToEmailServiceMapOutputWithContext(context.Context) EmailServiceMapOutput
}

type EmailServiceMap map[string]EmailServiceInput

func (EmailServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailService)(nil)).Elem()
}

func (i EmailServiceMap) ToEmailServiceMapOutput() EmailServiceMapOutput {
	return i.ToEmailServiceMapOutputWithContext(context.Background())
}

func (i EmailServiceMap) ToEmailServiceMapOutputWithContext(ctx context.Context) EmailServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailServiceMapOutput)
}

type EmailServiceOutput struct{ *pulumi.OutputState }

func (EmailServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailService)(nil)).Elem()
}

func (o EmailServiceOutput) ToEmailServiceOutput() EmailServiceOutput {
	return o
}

func (o EmailServiceOutput) ToEmailServiceOutputWithContext(ctx context.Context) EmailServiceOutput {
	return o
}

// The location where the Email Communication service stores its data at rest. Possible values are `Africa`, `Asia Pacific`, `Australia`, `Brazil`, `Canada`, `Europe`, `France`, `Germany`, `India`, `Japan`, `Korea`, `Norway`, `Switzerland`, `UAE`, `UK` `usgov` and `United States`. Changing this forces a new Email Communication Service to be created.
func (o EmailServiceOutput) DataLocation() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailService) pulumi.StringOutput { return v.DataLocation }).(pulumi.StringOutput)
}

// The name of the Email Communication Service resource. Changing this forces a new Email Communication Service to be created.
func (o EmailServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Email Communication Service should exist. Changing this forces a new Email Communication Service to be created.
func (o EmailServiceOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailService) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Email Communication Service.
func (o EmailServiceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EmailService) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type EmailServiceArrayOutput struct{ *pulumi.OutputState }

func (EmailServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailService)(nil)).Elem()
}

func (o EmailServiceArrayOutput) ToEmailServiceArrayOutput() EmailServiceArrayOutput {
	return o
}

func (o EmailServiceArrayOutput) ToEmailServiceArrayOutputWithContext(ctx context.Context) EmailServiceArrayOutput {
	return o
}

func (o EmailServiceArrayOutput) Index(i pulumi.IntInput) EmailServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailService {
		return vs[0].([]*EmailService)[vs[1].(int)]
	}).(EmailServiceOutput)
}

type EmailServiceMapOutput struct{ *pulumi.OutputState }

func (EmailServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailService)(nil)).Elem()
}

func (o EmailServiceMapOutput) ToEmailServiceMapOutput() EmailServiceMapOutput {
	return o
}

func (o EmailServiceMapOutput) ToEmailServiceMapOutputWithContext(ctx context.Context) EmailServiceMapOutput {
	return o
}

func (o EmailServiceMapOutput) MapIndex(k pulumi.StringInput) EmailServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailService {
		return vs[0].(map[string]*EmailService)[vs[1].(string)]
	}).(EmailServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailServiceInput)(nil)).Elem(), &EmailService{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailServiceArrayInput)(nil)).Elem(), EmailServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailServiceMapInput)(nil)).Elem(), EmailServiceMap{})
	pulumi.RegisterOutputType(EmailServiceOutput{})
	pulumi.RegisterOutputType(EmailServiceArrayOutput{})
	pulumi.RegisterOutputType(EmailServiceMapOutput{})
}
