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

// Manages a Web Chat integration for a Bot Channel
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
//				Name:              pulumi.String("example-bcr"),
//				Location:          pulumi.String("global"),
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("F0"),
//				MicrosoftAppId:    pulumi.String(current.ClientId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = bot.NewChannelWebChat(ctx, "example", &bot.ChannelWebChatArgs{
//				BotName:           exampleChannelsRegistration.Name,
//				Location:          exampleChannelsRegistration.Location,
//				ResourceGroupName: example.Name,
//				Sites: bot.ChannelWebChatSiteArray{
//					&bot.ChannelWebChatSiteArgs{
//						Name: pulumi.String("TestSite"),
//					},
//				},
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
// ## Import
//
// Web Chat Channels can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:bot/channelWebChat:ChannelWebChat example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/WebChatChannel
// ```
type ChannelWebChat struct {
	pulumi.CustomResourceState

	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringOutput `pulumi:"botName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
	Sites ChannelWebChatSiteArrayOutput `pulumi:"sites"`
}

// NewChannelWebChat registers a new resource with the given unique name, arguments, and options.
func NewChannelWebChat(ctx *pulumi.Context,
	name string, args *ChannelWebChatArgs, opts ...pulumi.ResourceOption) (*ChannelWebChat, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BotName == nil {
		return nil, errors.New("invalid value for required argument 'BotName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ChannelWebChat
	err := ctx.RegisterResource("azure:bot/channelWebChat:ChannelWebChat", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChannelWebChat gets an existing ChannelWebChat resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChannelWebChat(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChannelWebChatState, opts ...pulumi.ResourceOption) (*ChannelWebChat, error) {
	var resource ChannelWebChat
	err := ctx.ReadResource("azure:bot/channelWebChat:ChannelWebChat", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ChannelWebChat resources.
type channelWebChatState struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName *string `pulumi:"botName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
	Sites []ChannelWebChatSite `pulumi:"sites"`
}

type ChannelWebChatState struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringPtrInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
	Sites ChannelWebChatSiteArrayInput
}

func (ChannelWebChatState) ElementType() reflect.Type {
	return reflect.TypeOf((*channelWebChatState)(nil)).Elem()
}

type channelWebChatArgs struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName string `pulumi:"botName"`
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
	Sites []ChannelWebChatSite `pulumi:"sites"`
}

// The set of arguments for constructing a ChannelWebChat resource.
type ChannelWebChatArgs struct {
	// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
	BotName pulumi.StringInput
	// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
	Sites ChannelWebChatSiteArrayInput
}

func (ChannelWebChatArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*channelWebChatArgs)(nil)).Elem()
}

type ChannelWebChatInput interface {
	pulumi.Input

	ToChannelWebChatOutput() ChannelWebChatOutput
	ToChannelWebChatOutputWithContext(ctx context.Context) ChannelWebChatOutput
}

func (*ChannelWebChat) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelWebChat)(nil)).Elem()
}

func (i *ChannelWebChat) ToChannelWebChatOutput() ChannelWebChatOutput {
	return i.ToChannelWebChatOutputWithContext(context.Background())
}

func (i *ChannelWebChat) ToChannelWebChatOutputWithContext(ctx context.Context) ChannelWebChatOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelWebChatOutput)
}

// ChannelWebChatArrayInput is an input type that accepts ChannelWebChatArray and ChannelWebChatArrayOutput values.
// You can construct a concrete instance of `ChannelWebChatArrayInput` via:
//
//	ChannelWebChatArray{ ChannelWebChatArgs{...} }
type ChannelWebChatArrayInput interface {
	pulumi.Input

	ToChannelWebChatArrayOutput() ChannelWebChatArrayOutput
	ToChannelWebChatArrayOutputWithContext(context.Context) ChannelWebChatArrayOutput
}

type ChannelWebChatArray []ChannelWebChatInput

func (ChannelWebChatArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelWebChat)(nil)).Elem()
}

func (i ChannelWebChatArray) ToChannelWebChatArrayOutput() ChannelWebChatArrayOutput {
	return i.ToChannelWebChatArrayOutputWithContext(context.Background())
}

func (i ChannelWebChatArray) ToChannelWebChatArrayOutputWithContext(ctx context.Context) ChannelWebChatArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelWebChatArrayOutput)
}

// ChannelWebChatMapInput is an input type that accepts ChannelWebChatMap and ChannelWebChatMapOutput values.
// You can construct a concrete instance of `ChannelWebChatMapInput` via:
//
//	ChannelWebChatMap{ "key": ChannelWebChatArgs{...} }
type ChannelWebChatMapInput interface {
	pulumi.Input

	ToChannelWebChatMapOutput() ChannelWebChatMapOutput
	ToChannelWebChatMapOutputWithContext(context.Context) ChannelWebChatMapOutput
}

type ChannelWebChatMap map[string]ChannelWebChatInput

func (ChannelWebChatMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelWebChat)(nil)).Elem()
}

func (i ChannelWebChatMap) ToChannelWebChatMapOutput() ChannelWebChatMapOutput {
	return i.ToChannelWebChatMapOutputWithContext(context.Background())
}

func (i ChannelWebChatMap) ToChannelWebChatMapOutputWithContext(ctx context.Context) ChannelWebChatMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelWebChatMapOutput)
}

type ChannelWebChatOutput struct{ *pulumi.OutputState }

func (ChannelWebChatOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelWebChat)(nil)).Elem()
}

func (o ChannelWebChatOutput) ToChannelWebChatOutput() ChannelWebChatOutput {
	return o
}

func (o ChannelWebChatOutput) ToChannelWebChatOutputWithContext(ctx context.Context) ChannelWebChatOutput {
	return o
}

// The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
func (o ChannelWebChatOutput) BotName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelWebChat) pulumi.StringOutput { return v.BotName }).(pulumi.StringOutput)
}

// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o ChannelWebChatOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelWebChat) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
func (o ChannelWebChatOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelWebChat) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A site represents a client application that you want to connect to your bot. One or more `site` blocks as defined below.
func (o ChannelWebChatOutput) Sites() ChannelWebChatSiteArrayOutput {
	return o.ApplyT(func(v *ChannelWebChat) ChannelWebChatSiteArrayOutput { return v.Sites }).(ChannelWebChatSiteArrayOutput)
}

type ChannelWebChatArrayOutput struct{ *pulumi.OutputState }

func (ChannelWebChatArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelWebChat)(nil)).Elem()
}

func (o ChannelWebChatArrayOutput) ToChannelWebChatArrayOutput() ChannelWebChatArrayOutput {
	return o
}

func (o ChannelWebChatArrayOutput) ToChannelWebChatArrayOutputWithContext(ctx context.Context) ChannelWebChatArrayOutput {
	return o
}

func (o ChannelWebChatArrayOutput) Index(i pulumi.IntInput) ChannelWebChatOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ChannelWebChat {
		return vs[0].([]*ChannelWebChat)[vs[1].(int)]
	}).(ChannelWebChatOutput)
}

type ChannelWebChatMapOutput struct{ *pulumi.OutputState }

func (ChannelWebChatMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelWebChat)(nil)).Elem()
}

func (o ChannelWebChatMapOutput) ToChannelWebChatMapOutput() ChannelWebChatMapOutput {
	return o
}

func (o ChannelWebChatMapOutput) ToChannelWebChatMapOutputWithContext(ctx context.Context) ChannelWebChatMapOutput {
	return o
}

func (o ChannelWebChatMapOutput) MapIndex(k pulumi.StringInput) ChannelWebChatOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ChannelWebChat {
		return vs[0].(map[string]*ChannelWebChat)[vs[1].(string)]
	}).(ChannelWebChatOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelWebChatInput)(nil)).Elem(), &ChannelWebChat{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelWebChatArrayInput)(nil)).Elem(), ChannelWebChatArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelWebChatMapInput)(nil)).Elem(), ChannelWebChatMap{})
	pulumi.RegisterOutputType(ChannelWebChatOutput{})
	pulumi.RegisterOutputType(ChannelWebChatArrayOutput{})
	pulumi.RegisterOutputType(ChannelWebChatMapOutput{})
}
