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

// Manages a Bot Channels Registration.
//
// > **Note:** Bot Channels Registration has been [deprecated by Azure](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-resources-faq-azure?view=azure-bot-service-4.0#why-are-web-app-bot-and-bot-channel-registration-being-deprecated). New implementations should use the `bot.ServiceAzureBot` resource.
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
//			_, err = bot.NewChannelsRegistration(ctx, "example", &bot.ChannelsRegistrationArgs{
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
// Bot Channels Registration can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:bot/channelsRegistration:ChannelsRegistration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.BotService/botServices/example
// ```
type ChannelsRegistration struct {
	pulumi.CustomResourceState

	// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
	//
	// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
	//
	// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
	CmkKeyVaultUrl pulumi.StringPtrOutput `pulumi:"cmkKeyVaultUrl"`
	// The description of the Bot Channels Registration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Application Insights API Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsApiKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Bot Channels Registration.
	DeveloperAppInsightsApplicationId pulumi.StringPtrOutput `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsKey"`
	// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The Bot Channels Registration endpoint.
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrOutput `pulumi:"iconUrl"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringOutput `pulumi:"microsoftAppId"`
	// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringOutput `pulumi:"name"`
	// Is the Bot Channels Registration in an isolated network?
	PublicNetworkAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicNetworkAccessEnabled"`
	// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrOutput `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewChannelsRegistration registers a new resource with the given unique name, arguments, and options.
func NewChannelsRegistration(ctx *pulumi.Context,
	name string, args *ChannelsRegistrationArgs, opts ...pulumi.ResourceOption) (*ChannelsRegistration, error) {
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
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"developerAppInsightsApiKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ChannelsRegistration
	err := ctx.RegisterResource("azure:bot/channelsRegistration:ChannelsRegistration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChannelsRegistration gets an existing ChannelsRegistration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChannelsRegistration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChannelsRegistrationState, opts ...pulumi.ResourceOption) (*ChannelsRegistration, error) {
	var resource ChannelsRegistration
	err := ctx.ReadResource("azure:bot/channelsRegistration:ChannelsRegistration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ChannelsRegistration resources.
type channelsRegistrationState struct {
	// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
	//
	// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
	//
	// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
	CmkKeyVaultUrl *string `pulumi:"cmkKeyVaultUrl"`
	// The description of the Bot Channels Registration.
	Description *string `pulumi:"description"`
	// The Application Insights API Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Bot Channels Registration.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Bot Channels Registration endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl *string `pulumi:"iconUrl"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
	MicrosoftAppId *string `pulumi:"microsoftAppId"`
	// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
	Name *string `pulumi:"name"`
	// Is the Bot Channels Registration in an isolated network?
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku *string `pulumi:"sku"`
	// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
	StreamingEndpointEnabled *bool `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

type ChannelsRegistrationState struct {
	// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
	//
	// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
	//
	// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
	CmkKeyVaultUrl pulumi.StringPtrInput
	// The description of the Bot Channels Registration.
	Description pulumi.StringPtrInput
	// The Application Insights API Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The Application Insights Application ID to associate with the Bot Channels Registration.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insights Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Bot Channels Registration endpoint.
	Endpoint pulumi.StringPtrInput
	// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringPtrInput
	// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringPtrInput
	// Is the Bot Channels Registration in an isolated network?
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringPtrInput
	// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ChannelsRegistrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*channelsRegistrationState)(nil)).Elem()
}

type channelsRegistrationArgs struct {
	// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
	//
	// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
	//
	// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
	CmkKeyVaultUrl *string `pulumi:"cmkKeyVaultUrl"`
	// The description of the Bot Channels Registration.
	Description *string `pulumi:"description"`
	// The Application Insights API Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The Application Insights Application ID to associate with the Bot Channels Registration.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insights Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Bot Channels Registration endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl *string `pulumi:"iconUrl"`
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
	MicrosoftAppId string `pulumi:"microsoftAppId"`
	// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
	Name *string `pulumi:"name"`
	// Is the Bot Channels Registration in an isolated network?
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku string `pulumi:"sku"`
	// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
	StreamingEndpointEnabled *bool `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ChannelsRegistration resource.
type ChannelsRegistrationArgs struct {
	// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
	//
	// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
	//
	// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
	CmkKeyVaultUrl pulumi.StringPtrInput
	// The description of the Bot Channels Registration.
	Description pulumi.StringPtrInput
	// The Application Insights API Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The Application Insights Application ID to associate with the Bot Channels Registration.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insights Key to associate with the Bot Channels Registration.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Bot Channels Registration endpoint.
	Endpoint pulumi.StringPtrInput
	// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrInput
	// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringInput
	// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
	Name pulumi.StringPtrInput
	// Is the Bot Channels Registration in an isolated network?
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringInput
	// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.StringMapInput
}

func (ChannelsRegistrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*channelsRegistrationArgs)(nil)).Elem()
}

type ChannelsRegistrationInput interface {
	pulumi.Input

	ToChannelsRegistrationOutput() ChannelsRegistrationOutput
	ToChannelsRegistrationOutputWithContext(ctx context.Context) ChannelsRegistrationOutput
}

func (*ChannelsRegistration) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelsRegistration)(nil)).Elem()
}

func (i *ChannelsRegistration) ToChannelsRegistrationOutput() ChannelsRegistrationOutput {
	return i.ToChannelsRegistrationOutputWithContext(context.Background())
}

func (i *ChannelsRegistration) ToChannelsRegistrationOutputWithContext(ctx context.Context) ChannelsRegistrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelsRegistrationOutput)
}

// ChannelsRegistrationArrayInput is an input type that accepts ChannelsRegistrationArray and ChannelsRegistrationArrayOutput values.
// You can construct a concrete instance of `ChannelsRegistrationArrayInput` via:
//
//	ChannelsRegistrationArray{ ChannelsRegistrationArgs{...} }
type ChannelsRegistrationArrayInput interface {
	pulumi.Input

	ToChannelsRegistrationArrayOutput() ChannelsRegistrationArrayOutput
	ToChannelsRegistrationArrayOutputWithContext(context.Context) ChannelsRegistrationArrayOutput
}

type ChannelsRegistrationArray []ChannelsRegistrationInput

func (ChannelsRegistrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelsRegistration)(nil)).Elem()
}

func (i ChannelsRegistrationArray) ToChannelsRegistrationArrayOutput() ChannelsRegistrationArrayOutput {
	return i.ToChannelsRegistrationArrayOutputWithContext(context.Background())
}

func (i ChannelsRegistrationArray) ToChannelsRegistrationArrayOutputWithContext(ctx context.Context) ChannelsRegistrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelsRegistrationArrayOutput)
}

// ChannelsRegistrationMapInput is an input type that accepts ChannelsRegistrationMap and ChannelsRegistrationMapOutput values.
// You can construct a concrete instance of `ChannelsRegistrationMapInput` via:
//
//	ChannelsRegistrationMap{ "key": ChannelsRegistrationArgs{...} }
type ChannelsRegistrationMapInput interface {
	pulumi.Input

	ToChannelsRegistrationMapOutput() ChannelsRegistrationMapOutput
	ToChannelsRegistrationMapOutputWithContext(context.Context) ChannelsRegistrationMapOutput
}

type ChannelsRegistrationMap map[string]ChannelsRegistrationInput

func (ChannelsRegistrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelsRegistration)(nil)).Elem()
}

func (i ChannelsRegistrationMap) ToChannelsRegistrationMapOutput() ChannelsRegistrationMapOutput {
	return i.ToChannelsRegistrationMapOutputWithContext(context.Background())
}

func (i ChannelsRegistrationMap) ToChannelsRegistrationMapOutputWithContext(ctx context.Context) ChannelsRegistrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChannelsRegistrationMapOutput)
}

type ChannelsRegistrationOutput struct{ *pulumi.OutputState }

func (ChannelsRegistrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ChannelsRegistration)(nil)).Elem()
}

func (o ChannelsRegistrationOutput) ToChannelsRegistrationOutput() ChannelsRegistrationOutput {
	return o
}

func (o ChannelsRegistrationOutput) ToChannelsRegistrationOutputWithContext(ctx context.Context) ChannelsRegistrationOutput {
	return o
}

// The CMK Key Vault Key URL to encrypt the Bot Channels Registration with the Customer Managed Encryption Key.
//
// > **Note:** It has to add the Key Vault Access Policy for the `Bot Service CMEK Prod` Service Principal and the `softDeleteEnabled` and the `purgeProtectionEnabled` is enabled on the `keyvault.KeyVault` resource while using `cmkKeyVaultUrl`.
//
// > **Note:** It has to turn off the CMK feature before revoking Key Vault Access Policy. For more information, please refer to [Revoke access to customer-managed keys](https://docs.microsoft.com/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0&WT.mc_id=Portal-Microsoft_Azure_BotService#revoke-access-to-customer-managed-keys).
func (o ChannelsRegistrationOutput) CmkKeyVaultUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.CmkKeyVaultUrl }).(pulumi.StringPtrOutput)
}

// The description of the Bot Channels Registration.
func (o ChannelsRegistrationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Application Insights API Key to associate with the Bot Channels Registration.
func (o ChannelsRegistrationOutput) DeveloperAppInsightsApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApiKey }).(pulumi.StringPtrOutput)
}

// The Application Insights Application ID to associate with the Bot Channels Registration.
func (o ChannelsRegistrationOutput) DeveloperAppInsightsApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApplicationId }).(pulumi.StringPtrOutput)
}

// The Application Insights Key to associate with the Bot Channels Registration.
func (o ChannelsRegistrationOutput) DeveloperAppInsightsKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.DeveloperAppInsightsKey }).(pulumi.StringPtrOutput)
}

// The name of the Bot Channels Registration will be displayed as. This defaults to `name` if not specified.
func (o ChannelsRegistrationOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The Bot Channels Registration endpoint.
func (o ChannelsRegistrationOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// The icon URL to visually identify the Bot Channels Registration. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
func (o ChannelsRegistrationOutput) IconUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringPtrOutput { return v.IconUrl }).(pulumi.StringPtrOutput)
}

// The supported Azure location where the resource exists. Changing this forces a new resource to be created.
func (o ChannelsRegistrationOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The Microsoft Application ID for the Bot Channels Registration. Changing this forces a new resource to be created.
func (o ChannelsRegistrationOutput) MicrosoftAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.MicrosoftAppId }).(pulumi.StringOutput)
}

// Specifies the name of the Bot Channels Registration. Changing this forces a new resource to be created. Must be globally unique.
func (o ChannelsRegistrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Is the Bot Channels Registration in an isolated network?
func (o ChannelsRegistrationOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.BoolPtrOutput { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

// The name of the resource group in which to create the Bot Channels Registration. Changing this forces a new resource to be created.
func (o ChannelsRegistrationOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The SKU of the Bot Channels Registration. Valid values include `F0` or `S1`. Changing this forces a new resource to be created.
func (o ChannelsRegistrationOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// Is the streaming endpoint enabled for the Bot Channels Registration. Defaults to `false`.
func (o ChannelsRegistrationOutput) StreamingEndpointEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.BoolPtrOutput { return v.StreamingEndpointEnabled }).(pulumi.BoolPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o ChannelsRegistrationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ChannelsRegistration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ChannelsRegistrationArrayOutput struct{ *pulumi.OutputState }

func (ChannelsRegistrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChannelsRegistration)(nil)).Elem()
}

func (o ChannelsRegistrationArrayOutput) ToChannelsRegistrationArrayOutput() ChannelsRegistrationArrayOutput {
	return o
}

func (o ChannelsRegistrationArrayOutput) ToChannelsRegistrationArrayOutputWithContext(ctx context.Context) ChannelsRegistrationArrayOutput {
	return o
}

func (o ChannelsRegistrationArrayOutput) Index(i pulumi.IntInput) ChannelsRegistrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ChannelsRegistration {
		return vs[0].([]*ChannelsRegistration)[vs[1].(int)]
	}).(ChannelsRegistrationOutput)
}

type ChannelsRegistrationMapOutput struct{ *pulumi.OutputState }

func (ChannelsRegistrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChannelsRegistration)(nil)).Elem()
}

func (o ChannelsRegistrationMapOutput) ToChannelsRegistrationMapOutput() ChannelsRegistrationMapOutput {
	return o
}

func (o ChannelsRegistrationMapOutput) ToChannelsRegistrationMapOutputWithContext(ctx context.Context) ChannelsRegistrationMapOutput {
	return o
}

func (o ChannelsRegistrationMapOutput) MapIndex(k pulumi.StringInput) ChannelsRegistrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ChannelsRegistration {
		return vs[0].(map[string]*ChannelsRegistration)[vs[1].(string)]
	}).(ChannelsRegistrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelsRegistrationInput)(nil)).Elem(), &ChannelsRegistration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelsRegistrationArrayInput)(nil)).Elem(), ChannelsRegistrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChannelsRegistrationMapInput)(nil)).Elem(), ChannelsRegistrationMap{})
	pulumi.RegisterOutputType(ChannelsRegistrationOutput{})
	pulumi.RegisterOutputType(ChannelsRegistrationArrayOutput{})
	pulumi.RegisterOutputType(ChannelsRegistrationMapOutput{})
}
