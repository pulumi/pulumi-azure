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

// Manages an Azure Bot Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/appinsights"
//	"github.com/pulumi/pulumi-azure/sdk/v6/go/azure/bot"
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
//			exampleInsights, err := appinsights.NewInsights(ctx, "example", &appinsights.InsightsArgs{
//				Name:              pulumi.String("example-appinsights"),
//				Location:          example.Location,
//				ResourceGroupName: example.Name,
//				ApplicationType:   pulumi.String("web"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleApiKey, err := appinsights.NewApiKey(ctx, "example", &appinsights.ApiKeyArgs{
//				Name:                  pulumi.String("example-appinsightsapikey"),
//				ApplicationInsightsId: exampleInsights.ID(),
//				ReadPermissions: pulumi.StringArray{
//					pulumi.String("aggregate"),
//					pulumi.String("api"),
//					pulumi.String("draft"),
//					pulumi.String("extendqueries"),
//					pulumi.String("search"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			current, err := core.GetClientConfig(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = bot.NewServiceAzureBot(ctx, "example", &bot.ServiceAzureBotArgs{
//				Name:                              pulumi.String("exampleazurebot"),
//				ResourceGroupName:                 example.Name,
//				Location:                          pulumi.String("global"),
//				MicrosoftAppId:                    pulumi.String(current.ClientId),
//				Sku:                               pulumi.String("F0"),
//				Endpoint:                          pulumi.String("https://example.com"),
//				DeveloperAppInsightsApiKey:        exampleApiKey.ApiKey,
//				DeveloperAppInsightsApplicationId: exampleInsights.AppId,
//				Tags: pulumi.StringMap{
//					"environment": pulumi.String("test"),
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
// Azure Bot Services can be imported using the `resource id`, e.g.
//
// ```sh
// $ pulumi import azure:bot/serviceAzureBot:ServiceAzureBot example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.BotService/botServices/botService1
// ```
type ServiceAzureBot struct {
	pulumi.CustomResourceState

	// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
	//
	// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
	CmkKeyVaultKeyUrl pulumi.StringPtrOutput `pulumi:"cmkKeyVaultKeyUrl"`
	// The Application Insights API Key to associate with this Azure Bot Service.
	DeveloperAppInsightsApiKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsApiKey"`
	// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
	DeveloperAppInsightsApplicationId pulumi.StringPtrOutput `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insight Key to associate with this Azure Bot Service.
	DeveloperAppInsightsKey pulumi.StringPtrOutput `pulumi:"developerAppInsightsKey"`
	// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The Azure Bot Service endpoint.
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrOutput `pulumi:"iconUrl"`
	// Is local authentication enabled? Defaults to `true`.
	LocalAuthenticationEnabled pulumi.BoolPtrOutput `pulumi:"localAuthenticationEnabled"`
	// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// A list of LUIS App IDs to associate with this Azure Bot Service.
	LuisAppIds pulumi.StringArrayOutput `pulumi:"luisAppIds"`
	// The LUIS key to associate with this Azure Bot Service.
	LuisKey pulumi.StringPtrOutput `pulumi:"luisKey"`
	// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringOutput `pulumi:"microsoftAppId"`
	// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppMsiId pulumi.StringPtrOutput `pulumi:"microsoftAppMsiId"`
	// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppTenantId pulumi.StringPtrOutput `pulumi:"microsoftAppTenantId"`
	// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
	MicrosoftAppType pulumi.StringPtrOutput `pulumi:"microsoftAppType"`
	// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether public network access is enabled. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrOutput `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringOutput `pulumi:"sku"`
	// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrOutput `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags which should be assigned to this Azure Bot Service.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewServiceAzureBot registers a new resource with the given unique name, arguments, and options.
func NewServiceAzureBot(ctx *pulumi.Context,
	name string, args *ServiceAzureBotArgs, opts ...pulumi.ResourceOption) (*ServiceAzureBot, error) {
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
	var resource ServiceAzureBot
	err := ctx.RegisterResource("azure:bot/serviceAzureBot:ServiceAzureBot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceAzureBot gets an existing ServiceAzureBot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceAzureBot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceAzureBotState, opts ...pulumi.ResourceOption) (*ServiceAzureBot, error) {
	var resource ServiceAzureBot
	err := ctx.ReadResource("azure:bot/serviceAzureBot:ServiceAzureBot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceAzureBot resources.
type serviceAzureBotState struct {
	// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
	//
	// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
	CmkKeyVaultKeyUrl *string `pulumi:"cmkKeyVaultKeyUrl"`
	// The Application Insights API Key to associate with this Azure Bot Service.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insight Key to associate with this Azure Bot Service.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Azure Bot Service endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl *string `pulumi:"iconUrl"`
	// Is local authentication enabled? Defaults to `true`.
	LocalAuthenticationEnabled *bool `pulumi:"localAuthenticationEnabled"`
	// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A list of LUIS App IDs to associate with this Azure Bot Service.
	LuisAppIds []string `pulumi:"luisAppIds"`
	// The LUIS key to associate with this Azure Bot Service.
	LuisKey *string `pulumi:"luisKey"`
	// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppId *string `pulumi:"microsoftAppId"`
	// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppMsiId *string `pulumi:"microsoftAppMsiId"`
	// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppTenantId *string `pulumi:"microsoftAppTenantId"`
	// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
	MicrosoftAppType *string `pulumi:"microsoftAppType"`
	// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Whether public network access is enabled. Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
	Sku *string `pulumi:"sku"`
	// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
	StreamingEndpointEnabled *bool `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags which should be assigned to this Azure Bot Service.
	Tags map[string]string `pulumi:"tags"`
}

type ServiceAzureBotState struct {
	// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
	//
	// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
	CmkKeyVaultKeyUrl pulumi.StringPtrInput
	// The Application Insights API Key to associate with this Azure Bot Service.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insight Key to associate with this Azure Bot Service.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Azure Bot Service endpoint.
	Endpoint pulumi.StringPtrInput
	// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrInput
	// Is local authentication enabled? Defaults to `true`.
	LocalAuthenticationEnabled pulumi.BoolPtrInput
	// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A list of LUIS App IDs to associate with this Azure Bot Service.
	LuisAppIds pulumi.StringArrayInput
	// The LUIS key to associate with this Azure Bot Service.
	LuisKey pulumi.StringPtrInput
	// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringPtrInput
	// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppMsiId pulumi.StringPtrInput
	// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppTenantId pulumi.StringPtrInput
	// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
	MicrosoftAppType pulumi.StringPtrInput
	// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Whether public network access is enabled. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringPtrInput
	// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrInput
	// A mapping of tags which should be assigned to this Azure Bot Service.
	Tags pulumi.StringMapInput
}

func (ServiceAzureBotState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAzureBotState)(nil)).Elem()
}

type serviceAzureBotArgs struct {
	// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
	//
	// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
	CmkKeyVaultKeyUrl *string `pulumi:"cmkKeyVaultKeyUrl"`
	// The Application Insights API Key to associate with this Azure Bot Service.
	DeveloperAppInsightsApiKey *string `pulumi:"developerAppInsightsApiKey"`
	// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
	DeveloperAppInsightsApplicationId *string `pulumi:"developerAppInsightsApplicationId"`
	// The Application Insight Key to associate with this Azure Bot Service.
	DeveloperAppInsightsKey *string `pulumi:"developerAppInsightsKey"`
	// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
	DisplayName *string `pulumi:"displayName"`
	// The Azure Bot Service endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl *string `pulumi:"iconUrl"`
	// Is local authentication enabled? Defaults to `true`.
	LocalAuthenticationEnabled *bool `pulumi:"localAuthenticationEnabled"`
	// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	Location *string `pulumi:"location"`
	// A list of LUIS App IDs to associate with this Azure Bot Service.
	LuisAppIds []string `pulumi:"luisAppIds"`
	// The LUIS key to associate with this Azure Bot Service.
	LuisKey *string `pulumi:"luisKey"`
	// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppId string `pulumi:"microsoftAppId"`
	// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppMsiId *string `pulumi:"microsoftAppMsiId"`
	// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppTenantId *string `pulumi:"microsoftAppTenantId"`
	// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
	MicrosoftAppType *string `pulumi:"microsoftAppType"`
	// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// Whether public network access is enabled. Defaults to `true`.
	PublicNetworkAccessEnabled *bool `pulumi:"publicNetworkAccessEnabled"`
	// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
	Sku string `pulumi:"sku"`
	// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
	StreamingEndpointEnabled *bool `pulumi:"streamingEndpointEnabled"`
	// A mapping of tags which should be assigned to this Azure Bot Service.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ServiceAzureBot resource.
type ServiceAzureBotArgs struct {
	// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
	//
	// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
	CmkKeyVaultKeyUrl pulumi.StringPtrInput
	// The Application Insights API Key to associate with this Azure Bot Service.
	DeveloperAppInsightsApiKey pulumi.StringPtrInput
	// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
	DeveloperAppInsightsApplicationId pulumi.StringPtrInput
	// The Application Insight Key to associate with this Azure Bot Service.
	DeveloperAppInsightsKey pulumi.StringPtrInput
	// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
	DisplayName pulumi.StringPtrInput
	// The Azure Bot Service endpoint.
	Endpoint pulumi.StringPtrInput
	// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
	IconUrl pulumi.StringPtrInput
	// Is local authentication enabled? Defaults to `true`.
	LocalAuthenticationEnabled pulumi.BoolPtrInput
	// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	Location pulumi.StringPtrInput
	// A list of LUIS App IDs to associate with this Azure Bot Service.
	LuisAppIds pulumi.StringArrayInput
	// The LUIS key to associate with this Azure Bot Service.
	LuisKey pulumi.StringPtrInput
	// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppId pulumi.StringInput
	// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppMsiId pulumi.StringPtrInput
	// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
	MicrosoftAppTenantId pulumi.StringPtrInput
	// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
	MicrosoftAppType pulumi.StringPtrInput
	// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// Whether public network access is enabled. Defaults to `true`.
	PublicNetworkAccessEnabled pulumi.BoolPtrInput
	// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
	Sku pulumi.StringInput
	// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
	StreamingEndpointEnabled pulumi.BoolPtrInput
	// A mapping of tags which should be assigned to this Azure Bot Service.
	Tags pulumi.StringMapInput
}

func (ServiceAzureBotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAzureBotArgs)(nil)).Elem()
}

type ServiceAzureBotInput interface {
	pulumi.Input

	ToServiceAzureBotOutput() ServiceAzureBotOutput
	ToServiceAzureBotOutputWithContext(ctx context.Context) ServiceAzureBotOutput
}

func (*ServiceAzureBot) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAzureBot)(nil)).Elem()
}

func (i *ServiceAzureBot) ToServiceAzureBotOutput() ServiceAzureBotOutput {
	return i.ToServiceAzureBotOutputWithContext(context.Background())
}

func (i *ServiceAzureBot) ToServiceAzureBotOutputWithContext(ctx context.Context) ServiceAzureBotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAzureBotOutput)
}

// ServiceAzureBotArrayInput is an input type that accepts ServiceAzureBotArray and ServiceAzureBotArrayOutput values.
// You can construct a concrete instance of `ServiceAzureBotArrayInput` via:
//
//	ServiceAzureBotArray{ ServiceAzureBotArgs{...} }
type ServiceAzureBotArrayInput interface {
	pulumi.Input

	ToServiceAzureBotArrayOutput() ServiceAzureBotArrayOutput
	ToServiceAzureBotArrayOutputWithContext(context.Context) ServiceAzureBotArrayOutput
}

type ServiceAzureBotArray []ServiceAzureBotInput

func (ServiceAzureBotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAzureBot)(nil)).Elem()
}

func (i ServiceAzureBotArray) ToServiceAzureBotArrayOutput() ServiceAzureBotArrayOutput {
	return i.ToServiceAzureBotArrayOutputWithContext(context.Background())
}

func (i ServiceAzureBotArray) ToServiceAzureBotArrayOutputWithContext(ctx context.Context) ServiceAzureBotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAzureBotArrayOutput)
}

// ServiceAzureBotMapInput is an input type that accepts ServiceAzureBotMap and ServiceAzureBotMapOutput values.
// You can construct a concrete instance of `ServiceAzureBotMapInput` via:
//
//	ServiceAzureBotMap{ "key": ServiceAzureBotArgs{...} }
type ServiceAzureBotMapInput interface {
	pulumi.Input

	ToServiceAzureBotMapOutput() ServiceAzureBotMapOutput
	ToServiceAzureBotMapOutputWithContext(context.Context) ServiceAzureBotMapOutput
}

type ServiceAzureBotMap map[string]ServiceAzureBotInput

func (ServiceAzureBotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAzureBot)(nil)).Elem()
}

func (i ServiceAzureBotMap) ToServiceAzureBotMapOutput() ServiceAzureBotMapOutput {
	return i.ToServiceAzureBotMapOutputWithContext(context.Background())
}

func (i ServiceAzureBotMap) ToServiceAzureBotMapOutputWithContext(ctx context.Context) ServiceAzureBotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAzureBotMapOutput)
}

type ServiceAzureBotOutput struct{ *pulumi.OutputState }

func (ServiceAzureBotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAzureBot)(nil)).Elem()
}

func (o ServiceAzureBotOutput) ToServiceAzureBotOutput() ServiceAzureBotOutput {
	return o
}

func (o ServiceAzureBotOutput) ToServiceAzureBotOutputWithContext(ctx context.Context) ServiceAzureBotOutput {
	return o
}

// The CMK Key Vault Key URL that will be used to encrypt the Bot with the Customer Managed Encryption Key.
//
// > **Note:** In order to utilize CMEK, you must add the `Key Vault Crypto Service Encryption User` role to the Azure-defined `Bot Service CMEK Prod` Service Principal. You must also enable `softDeleteEnabled` and `purgeProtectionEnabled` on the `keyvault.KeyVault` that `cmkKeyVaultKeyUrl` refers to. [See Azure Documentation](https://learn.microsoft.com/en-us/azure/bot-service/bot-service-encryption?view=azure-bot-service-4.0#how-to-configure-your-azure-key-vault-instance)
func (o ServiceAzureBotOutput) CmkKeyVaultKeyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.CmkKeyVaultKeyUrl }).(pulumi.StringPtrOutput)
}

// The Application Insights API Key to associate with this Azure Bot Service.
func (o ServiceAzureBotOutput) DeveloperAppInsightsApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApiKey }).(pulumi.StringPtrOutput)
}

// The resource ID of the Application Insights instance to associate with this Azure Bot Service.
func (o ServiceAzureBotOutput) DeveloperAppInsightsApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.DeveloperAppInsightsApplicationId }).(pulumi.StringPtrOutput)
}

// The Application Insight Key to associate with this Azure Bot Service.
func (o ServiceAzureBotOutput) DeveloperAppInsightsKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.DeveloperAppInsightsKey }).(pulumi.StringPtrOutput)
}

// The name that the Azure Bot Service will be displayed as. This defaults to the value set for `name` if not specified.
func (o ServiceAzureBotOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The Azure Bot Service endpoint.
func (o ServiceAzureBotOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// The Icon Url of the Azure Bot Service. Defaults to `https://docs.botframework.com/static/devportal/client/images/bot-framework-default.png`.
func (o ServiceAzureBotOutput) IconUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.IconUrl }).(pulumi.StringPtrOutput)
}

// Is local authentication enabled? Defaults to `true`.
func (o ServiceAzureBotOutput) LocalAuthenticationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.BoolPtrOutput { return v.LocalAuthenticationEnabled }).(pulumi.BoolPtrOutput)
}

// The supported Azure location where the Azure Bot Service should exist. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// A list of LUIS App IDs to associate with this Azure Bot Service.
func (o ServiceAzureBotOutput) LuisAppIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringArrayOutput { return v.LuisAppIds }).(pulumi.StringArrayOutput)
}

// The LUIS key to associate with this Azure Bot Service.
func (o ServiceAzureBotOutput) LuisKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.LuisKey }).(pulumi.StringPtrOutput)
}

// The Microsoft Application ID for the Azure Bot Service. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) MicrosoftAppId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.MicrosoftAppId }).(pulumi.StringOutput)
}

// The ID of the Microsoft App Managed Identity for this Azure Bot Service. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) MicrosoftAppMsiId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.MicrosoftAppMsiId }).(pulumi.StringPtrOutput)
}

// The Tenant ID of the Microsoft App for this Azure Bot Service. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) MicrosoftAppTenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.MicrosoftAppTenantId }).(pulumi.StringPtrOutput)
}

// The Microsoft App Type for this Azure Bot Service. Possible values are `MultiTenant`, `SingleTenant` and `UserAssignedMSI`. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) MicrosoftAppType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringPtrOutput { return v.MicrosoftAppType }).(pulumi.StringPtrOutput)
}

// The name which should be used for this Azure Bot Service. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether public network access is enabled. Defaults to `true`.
func (o ServiceAzureBotOutput) PublicNetworkAccessEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.BoolPtrOutput { return v.PublicNetworkAccessEnabled }).(pulumi.BoolPtrOutput)
}

// The name of the Resource Group where the Azure Bot Service should exist. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The SKU of the Azure Bot Service. Accepted values are `F0` or `S1`. Changing this forces a new resource to be created.
func (o ServiceAzureBotOutput) Sku() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringOutput { return v.Sku }).(pulumi.StringOutput)
}

// Is the streaming endpoint enabled for this Azure Bot Service. Defaults to `false`.
func (o ServiceAzureBotOutput) StreamingEndpointEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.BoolPtrOutput { return v.StreamingEndpointEnabled }).(pulumi.BoolPtrOutput)
}

// A mapping of tags which should be assigned to this Azure Bot Service.
func (o ServiceAzureBotOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServiceAzureBot) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ServiceAzureBotArrayOutput struct{ *pulumi.OutputState }

func (ServiceAzureBotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAzureBot)(nil)).Elem()
}

func (o ServiceAzureBotArrayOutput) ToServiceAzureBotArrayOutput() ServiceAzureBotArrayOutput {
	return o
}

func (o ServiceAzureBotArrayOutput) ToServiceAzureBotArrayOutputWithContext(ctx context.Context) ServiceAzureBotArrayOutput {
	return o
}

func (o ServiceAzureBotArrayOutput) Index(i pulumi.IntInput) ServiceAzureBotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceAzureBot {
		return vs[0].([]*ServiceAzureBot)[vs[1].(int)]
	}).(ServiceAzureBotOutput)
}

type ServiceAzureBotMapOutput struct{ *pulumi.OutputState }

func (ServiceAzureBotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAzureBot)(nil)).Elem()
}

func (o ServiceAzureBotMapOutput) ToServiceAzureBotMapOutput() ServiceAzureBotMapOutput {
	return o
}

func (o ServiceAzureBotMapOutput) ToServiceAzureBotMapOutputWithContext(ctx context.Context) ServiceAzureBotMapOutput {
	return o
}

func (o ServiceAzureBotMapOutput) MapIndex(k pulumi.StringInput) ServiceAzureBotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceAzureBot {
		return vs[0].(map[string]*ServiceAzureBot)[vs[1].(string)]
	}).(ServiceAzureBotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAzureBotInput)(nil)).Elem(), &ServiceAzureBot{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAzureBotArrayInput)(nil)).Elem(), ServiceAzureBotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAzureBotMapInput)(nil)).Elem(), ServiceAzureBotMap{})
	pulumi.RegisterOutputType(ServiceAzureBotOutput{})
	pulumi.RegisterOutputType(ServiceAzureBotArrayOutput{})
	pulumi.RegisterOutputType(ServiceAzureBotMapOutput{})
}
