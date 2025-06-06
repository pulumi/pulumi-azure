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

// Manages a Bot Web App.
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
//			_, err = bot.NewWebApp(ctx, "example", &bot.WebAppArgs{
//				Name:              pulumi.String("example"),
//				Location:          pulumi.String("global"),
//				ResourceGroupName: example.Name,
//				Sku:               pulumi.String("F0"),
//				MicrosoftAppId:    pulumi.String(current.ClientId),
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
// Bot Web App's can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:bot/webApp:WebApp example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example
// ```
type WebApp struct {
	pulumi.CustomResourceState

	// The Application Insights API Key to associate with the Web App Bot.
	DeveloperAppInsightsApiKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Web App Bot.
	DeveloperAppInsightsApplicationId pulumi.StringPtrOutput `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Web App Bot.
	DeveloperAppInsightsKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsKey"`
	// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The Web App Bot endpoint.
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A list of LUIS App IDs to associate with the Web App Bot.
	LuisAppIds pulumi.StringArrayOutput `pulumi:"luisAppIds"`
	// The LUIS key to associate with the Web App Bot.
	LuisKey pulumi.StringPtrOutput `pulumi:"luisKey"`
	// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringOutput `pulumi:"microsoftAppId"`
	// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewWebApp registers a new resource with the given unique name, arguments, and options.
func NewWebApp(ctx *pulumi.Context,
	name string, args *WebAppArgs, opts ...pulumi.ResourceOption) (*WebApp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MicrosoftAppId == nil {
		return nil, errors.New("invalid value for required argument 'MicrosoftAppId'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Sku == nil {
		return nil, errors.New("invalid value for required argument 'Sku'")
	}
	if args.DeveloperAppInsightsApiKey != nil {
		args.DeveloperAppInsightsApiKey = pulumi.ToSecret(args.DeveloperAppInsightsApiKey).(pulumi.StringPtrInput)
	}
	if args.LuisKey != nil {
		args.LuisKey = pulumi.ToSecret(args.LuisKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"developerAppInsightsApiKey",
		"luisKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WebApp
	err := ctx.RegisterResource("azure:bot/webApp:WebApp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebApp gets an existing WebApp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebAppState, opts ...pulumi.ResourceOption) (*WebApp, error) {
	var resource WebApp
	err := ctx.ReadResource("azure:bot/webApp:WebApp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebApp resources.
type webAppState struct {
	// The Application Insights API Key to associate with the Web App Bot.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Web App Bot.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Web App Bot.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Web App Bot endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A list of LUIS App IDs to associate with the Web App Bot.
	LuisAppIds []string `pulumi:"luisAppIds"`
	// The LUIS key to associate with the Web App Bot.
	LuisKey *string `pulumi:"luisKey"`
	// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
	MicrosoftAppId *string `pulumi:"microsoftAppId"`
	// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku *string `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type WebAppState struct {
	// The Application Insights API Key to associate with the Web App Bot.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The Application Insights Application ID to associate with the Web App Bot.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insights Key to associate with the Web App Bot.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Web App Bot endpoint.
	Endpoint pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A list of LUIS App IDs to associate with the Web App Bot.
	LuisAppIds pulumi.StringArrayInput
	// The LUIS key to associate with the Web App Bot.
	LuisKey pulumi.StringPtrInput
	// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringPtrInput
	// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (WebAppState) ElementType() reflect.Type {
	return reflect.TypeOf((*webAppState)(nil)).Elem()
}

type webAppArgs struct {
	// The Application Insights API Key to associate with the Web App Bot.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Web App Bot.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Web App Bot.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Web App Bot endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A list of LUIS App IDs to associate with the Web App Bot.
	LuisAppIds []string `pulumi:"luisAppIds"`
	// The LUIS key to associate with the Web App Bot.
	LuisKey *string `pulumi:"luisKey"`
	// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
	MicrosoftAppId string `pulumi:"microsoftAppId"`
	// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
	Name *string `pulumi:"name"`
	// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku string `pulumi:"sku"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a WebApp resource.
type WebAppArgs struct {
	// The Application Insights API Key to associate with the Web App Bot.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The Application Insights Application ID to associate with the Web App Bot.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insights Key to associate with the Web App Bot.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Web App Bot endpoint.
	Endpoint pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A list of LUIS App IDs to associate with the Web App Bot.
	LuisAppIds pulumi.StringArrayInput
	// The LUIS key to associate with the Web App Bot.
	LuisKey pulumi.StringPtrInput
	// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringInput
	// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringPtrInput
	// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (WebAppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webAppArgs)(nil)).Elem()
}

type WebAppInput interface {
	pulumi.Input

	ToWebAppOutput() WebAppOutput
	ToWebAppOutputWithContext(ctx context.Context) WebAppOutput
}

func (*WebApp) ElementType() reflect.Type {
	return reflect.TypeOf((**WebApp)(nil)).Elem()
}

func (i *WebApp) ToWebAppOutput() WebAppOutput {
	return i.ToWebAppOutputWithContext(context.Background())
}

func (i *WebApp) ToWebAppOutputWithContext(ctx context.Context) WebAppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppOutput)
}

// WebAppArrayInput is an input type that accepts WebAppArray and WebAppArrayOutput values.
// You can construct a concrete instance of `WebAppArrayInput` via:
//
//	WebAppArray{ WebAppArgs{...} }
type WebAppArrayInput interface {
	pulumi.Input

	ToWebAppArrayOutput() WebAppArrayOutput
	ToWebAppArrayOutputWithContext(context.Context) WebAppArrayOutput
}

type WebAppArray []WebAppInput

func (WebAppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebApp)(nil)).Elem()
}

func (i WebAppArray) ToWebAppArrayOutput() WebAppArrayOutput {
	return i.ToWebAppArrayOutputWithContext(context.Background())
}

func (i WebAppArray) ToWebAppArrayOutputWithContext(ctx context.Context) WebAppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppArrayOutput)
}

// WebAppMapInput is an input type that accepts WebAppMap and WebAppMapOutput values.
// You can construct a concrete instance of `WebAppMapInput` via:
//
//	WebAppMap{ "key": WebAppArgs{...} }
type WebAppMapInput interface {
	pulumi.Input

	ToWebAppMapOutput() WebAppMapOutput
	ToWebAppMapOutputWithContext(context.Context) WebAppMapOutput
}

type WebAppMap map[string]WebAppInput

func (WebAppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebApp)(nil)).Elem()
}

func (i WebAppMap) ToWebAppMapOutput() WebAppMapOutput {
	return i.ToWebAppMapOutputWithContext(context.Background())
}

func (i WebAppMap) ToWebAppMapOutputWithContext(ctx context.Context) WebAppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAppMapOutput)
}

type WebAppOutput struct{ *pulumi.OutputState }

func (WebAppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebApp)(nil)).Elem()
}

func (o WebAppOutput) ToWebAppOutput() WebAppOutput {
	return o
}

func (o WebAppOutput) ToWebAppOutputWithContext(ctx context.Context) WebAppOutput {
	return o
}

// The Application Insights API Key to associate with the Web App Bot.
func (o WebAppOutput) DeveloperAppInsightsApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApiKey }).(pulumi.StringPtrOutput)
}

// The Application Insights Application ID to associate with the Web App Bot.
func (o WebAppOutput) DeveloperAppInsightsApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApplicationId }).(pulumi.StringPtrOutput)
}

// The Application Insights Key to associate with the Web App Bot.
func (o WebAppOutput) DeveloperAppInsightsKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringPtrOutput { return v.DeveloperAppInsightsKey }).(pulumi.StringPtrOutput)
}

// The name of the Web App Bot will be displayed as. This defaults to `name` if not specified.
func (o WebAppOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The Web App Bot endpoint.
func (o WebAppOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o WebAppOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A list of LUIS App IDs to associate with the Web App Bot.
func (o WebAppOutput) LuisAppIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringArrayOutput { return v.LuisAppIds }).(pulumi.StringArrayOutput)
}

// The LUIS key to associate with the Web App Bot.
func (o WebAppOutput) LuisKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringPtrOutput { return v.LuisKey }).(pulumi.StringPtrOutput)
}

// The Microsoft Application ID for the Web App Bot. Changing this forces a new resource to be created.
func (o WebAppOutput) MicrosoftAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.MicrosoftAppId }).(pulumi.StringOutput)
}

// Specifies the name of the Web App Bot. Changing this forces a new resource to be created. Must be globally unique.
func (o WebAppOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the resource group in which to create the Web App Bot. Changing this forces a new resource to be created.
func (o WebAppOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The SKU of the Web App Bot. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
func (o WebAppOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o WebAppOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *WebApp) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type WebAppArrayOutput struct{ *pulumi.OutputState }

func (WebAppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebApp)(nil)).Elem()
}

func (o WebAppArrayOutput) ToWebAppArrayOutput() WebAppArrayOutput {
	return o
}

func (o WebAppArrayOutput) ToWebAppArrayOutputWithContext(ctx context.Context) WebAppArrayOutput {
	return o
}

func (o WebAppArrayOutput) Index(i pulumi.IntInput) WebAppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebApp {
		return vs[0].([]*WebApp)[vs[1].(int)]
	}).(WebAppOutput)
}

type WebAppMapOutput struct{ *pulumi.OutputState }

func (WebAppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebApp)(nil)).Elem()
}

func (o WebAppMapOutput) ToWebAppMapOutput() WebAppMapOutput {
	return o
}

func (o WebAppMapOutput) ToWebAppMapOutputWithContext(ctx context.Context) WebAppMapOutput {
	return o
}

func (o WebAppMapOutput) MapIndex(k pulumi.StringInput) WebAppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebApp {
		return vs[0].(map[string]*WebApp)[vs[1].(string)]
	}).(WebAppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppInput)(nil)).Elem(), &WebApp{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppArrayInput)(nil)).Elem(), WebAppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAppMapInput)(nil)).Elem(), WebAppMap{})
	pulumi.RegisterOutputType(WebAppOutput{})
	pulumi.RegisterOutputType(WebAppArrayOutput{})
	pulumi.RegisterOutputType(WebAppMapOutput{})
}
