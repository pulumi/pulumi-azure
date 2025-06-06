// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bot

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Email integration for a Bot Channel
//
// > **Note:** A bot can only have a single Email Channel associated with it.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/bot"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			example, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Name:     pulumi.String("example-resources"),
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleChannelsRegistration, err := bot.NewChannelsRegistration(ctx, "example", &bot.ChannelsRegistrationArgs{
//				Name:              pulumi.String("example"),
//				Location:          pulumi.String("global"),
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("F0"),
//				MicrosoftAppId:    pulumi.String(current.ClientId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bot.NewChannelEmail(ctx, "example", &bot.ChannelEmailArgs{
//				BotName:           exampleChannelsRegistration.Name,
//				Location:          exampleChannelsRegistration.Location,
//				ResourceGroupName: example.Name,
//				EmailAddress:      pulumi.String("example.com"),
//				EmailPassword:     pulumi.String("123456"),
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
// * `Microsoft.BotService`: 2022-09-15
//
// ## Import
//
// The Email Integration for a Bot Channel can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:bot/channelEmail:ChannelEmail example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example/channels/EmailChannel
// ```
type ChannelEmail struct {
	pulumi.CustomResourceState

	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringOutput `pulumi:"botName"`
	// The email address that the Bot will authenticate with.
	EmailAddress pulumi.StringOutput `pulumi:"emailAddress"`
	// The email password that the Bot will authenticate with.
	EmailPassword pulumi.StringPtrOutput `pulumi:"emailPassword"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The magic code used to set up OAUTH authentication.
	MagicCode pulumi.StringPtrOutput `pulumi:"magicCode"`
	// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
}

// NewChannelEmail registers a new resource with the given unique name, arguments, and options.
func NewChannelEmail(ctx *pulumi.Context,
	name string, args *ChannelEmailArgs, opts ...pulumi.ResourceOption) (*ChannelEmail, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BotName == nil {
		return nil, errors.New("invalid value for required argument 'BotName'")
	}
	if args.EmailAddress == nil {
		return nil, errors.New("invalid value for required argument 'EmailAddress'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.EmailPassword != nil {
		args.EmailPassword = pulumi.ToSecret(args.EmailPassword).(pulumi.StringPtrInput)
	}
	if args.MagicCode != nil {
		args.MagicCode = pulumi.ToSecret(args.MagicCode).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"emailPassword",
		"magicCode",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ChannelEmail
	err := ctx.RegisterResource("azure:bot/channelEmail:ChannelEmail", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChannelEmail gets an existing ChannelEmail resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChannelEmail(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChannelEmailState, opts ...pulumi.ResourceOption) (*ChannelEmail, error) {
	var resource ChannelEmail
	err := ctx.ReadResource("azure:bot/channelEmail:ChannelEmail", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ChannelEmail resources.
type channelEmailState struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName *string `pulumi:"botName"`
	// The email address that the Bot will authenticate with.
	EmailAddress *string `pulumi:"emailAddress"`
	// The email password that the Bot will authenticate with.
	EmailPassword *string `pulumi:"emailPassword"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The magic code used to set up OAUTH authentication.
	MagicCode *string `pulumi:"magicCode"`
	// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
}

type ChannelEmailState struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringPtrInput
	// The email address that the Bot will authenticate with.
	EmailAddress pulumi.StringPtrInput
	// The email password that the Bot will authenticate with.
	EmailPassword pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The magic code used to set up OAUTH authentication.
	MagicCode pulumi.StringPtrInput
	// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
}

func (ChannelEmailState) ElementType() reflect.Type {
	return reflect.TypeOf((*channelEmailState)(nil)).Elem()
}

type channelEmailArgs struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName string `pulumi:"botName"`
	// The email address that the Bot will authenticate with.
	EmailAddress string `pulumi:"emailAddress"`
	// The email password that the Bot will authenticate with.
	EmailPassword *string `pulumi:"emailPassword"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The magic code used to set up OAUTH authentication.
	MagicCode *string `pulumi:"magicCode"`
	// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// The set of arguments for constructing a ChannelEmail resource.
type ChannelEmailArgs struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringInput
	// The email address that the Bot will authenticate with.
	EmailAddress pulumi.StringInput
	// The email password that the Bot will authenticate with.
	EmailPassword pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The magic code used to set up OAUTH authentication.
	MagicCode pulumi.StringPtrInput
	// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
}

func (ChannelEmailArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*channelEmailArgs)(nil)).Elem()
}

type ChannelEmailInput interface {
	pulumi.Input

	ToChannelEmailOutput() ChannelEmailOutput
	ToChannelEmailOutputWithContext(ctx context.Context) ChannelEmailOutput
}

func (*ChannelEmail) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelEmail)(nil)).Elem()
}

func (i *ChannelEmail) ToChannelEmailOutput() ChannelEmailOutput {
	return i.ToChannelEmailOutputWithContext(context.Background())
}

func (i *ChannelEmail) ToChannelEmailOutputWithContext(ctx context.Context) ChannelEmailOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelEmailOutput)
}

// ChannelEmailArrayInput is an input type that accepts ChannelEmailArray and ChannelEmailArrayOutput values.
// You can construct a concrete instance of `ChannelEmailArrayInput` via:
//
//	ChannelEmailArray{ ChannelEmailArgs{...} }
type ChannelEmailArrayInput interface {
	pulumi.Input

	ToChannelEmailArrayOutput() ChannelEmailArrayOutput
	ToChannelEmailArrayOutputWithContext(context.Context) ChannelEmailArrayOutput
}

type ChannelEmailArray []ChannelEmailInput

func (ChannelEmailArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelEmail)(nil)).Elem()
}

func (i ChannelEmailArray) ToChannelEmailArrayOutput() ChannelEmailArrayOutput {
	return i.ToChannelEmailArrayOutputWithContext(context.Background())
}

func (i ChannelEmailArray) ToChannelEmailArrayOutputWithContext(ctx context.Context) ChannelEmailArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelEmailArrayOutput)
}

// ChannelEmailMapInput is an input type that accepts ChannelEmailMap and ChannelEmailMapOutput values.
// You can construct a concrete instance of `ChannelEmailMapInput` via:
//
//	ChannelEmailMap{ "key": ChannelEmailArgs{...} }
type ChannelEmailMapInput interface {
	pulumi.Input

	ToChannelEmailMapOutput() ChannelEmailMapOutput
	ToChannelEmailMapOutputWithContext(context.Context) ChannelEmailMapOutput
}

type ChannelEmailMap map[string]ChannelEmailInput

func (ChannelEmailMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelEmail)(nil)).Elem()
}

func (i ChannelEmailMap) ToChannelEmailMapOutput() ChannelEmailMapOutput {
	return i.ToChannelEmailMapOutputWithContext(context.Background())
}

func (i ChannelEmailMap) ToChannelEmailMapOutputWithContext(ctx context.Context) ChannelEmailMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelEmailMapOutput)
}

type ChannelEmailOutput struct{ *pulumi.OutputState }

func (ChannelEmailOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelEmail)(nil)).Elem()
}

func (o ChannelEmailOutput) ToChannelEmailOutput() ChannelEmailOutput {
	return o
}

func (o ChannelEmailOutput) ToChannelEmailOutputWithContext(ctx context.Context) ChannelEmailOutput {
	return o
}

// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
func (o ChannelEmailOutput) BotName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringOutput { return v.BotName }).(pulumi.StringOutput)
}

// The email address that the Bot will authenticate with.
func (o ChannelEmailOutput) EmailAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringOutput { return v.EmailAddress }).(pulumi.StringOutput)
}

// The email password that the Bot will authenticate with.
func (o ChannelEmailOutput) EmailPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringPtrOutput { return v.EmailPassword }).(pulumi.StringPtrOutput)
}

// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o ChannelEmailOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The magic code used to set up OAUTH authentication.
func (o ChannelEmailOutput) MagicCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringPtrOutput { return v.MagicCode }).(pulumi.StringPtrOutput)
}

// The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
func (o ChannelEmailOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelEmail) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

type ChannelEmailArrayOutput struct{ *pulumi.OutputState }

func (ChannelEmailArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelEmail)(nil)).Elem()
}

func (o ChannelEmailArrayOutput) ToChannelEmailArrayOutput() ChannelEmailArrayOutput {
	return o
}

func (o ChannelEmailArrayOutput) ToChannelEmailArrayOutputWithContext(ctx context.Context) ChannelEmailArrayOutput {
	return o
}

func (o ChannelEmailArrayOutput) Index(i pulumi.IntInput) ChannelEmailOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ChannelEmail {
		return vs[0].([]*ChannelEmail)[vs[1].(int)]
	}).(ChannelEmailOutput)
}

type ChannelEmailMapOutput struct{ *pulumi.OutputState }

func (ChannelEmailMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelEmail)(nil)).Elem()
}

func (o ChannelEmailMapOutput) ToChannelEmailMapOutput() ChannelEmailMapOutput {
	return o
}

func (o ChannelEmailMapOutput) ToChannelEmailMapOutputWithContext(ctx context.Context) ChannelEmailMapOutput {
	return o
}

func (o ChannelEmailMapOutput) MapIndex(k pulumi.StringInput) ChannelEmailOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ChannelEmail {
		return vs[0].(map[string]*ChannelEmail)[vs[1].(string)]
	}).(ChannelEmailOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelEmailInput)(nil)).Elem(), &ChannelEmail{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelEmailArrayInput)(nil)).Elem(), ChannelEmailArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelEmailMapInput)(nil)).Elem(), ChannelEmailMap{})
	pulumi.RegisterOutputType(ChannelEmailOutput{})
	pulumi.RegisterOutputType(ChannelEmailArrayOutput{})
	pulumi.RegisterOutputType(ChannelEmailMapOutput{})
}
