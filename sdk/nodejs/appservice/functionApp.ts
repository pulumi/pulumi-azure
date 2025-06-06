// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Function App.
 *
 * !> **NOTE:** This resource has been deprecated in version 5.0 of the provider and will be removed in version 6.0. Please use `azure.appservice.LinuxFunctionApp` and `azure.appservice.WindowsFunctionApp` resources instead.
 *
 * > **Note:** To connect an Azure Function App and a subnet within the same region `azure.appservice.VirtualNetworkSwiftConnection` can be used.
 * For an example, check the `azure.appservice.VirtualNetworkSwiftConnection` documentation.
 *
 * ## Example Usage
 *
 * ### With App Service Plan)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "azure-functions-test-rg",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "functionsapptestsa",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const examplePlan = new azure.appservice.Plan("example", {
 *     name: "azure-functions-test-service-plan",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: {
 *         tier: "Standard",
 *         size: "S1",
 *     },
 * });
 * const exampleFunctionApp = new azure.appservice.FunctionApp("example", {
 *     name: "test-azure-functions",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     appServicePlanId: examplePlan.id,
 *     storageAccountName: exampleAccount.name,
 *     storageAccountAccessKey: exampleAccount.primaryAccessKey,
 * });
 * ```
 *
 * ### In A Consumption Plan)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "azure-functions-cptest-rg",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "functionsapptestsa",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const examplePlan = new azure.appservice.Plan("example", {
 *     name: "azure-functions-test-service-plan",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     kind: "FunctionApp",
 *     sku: {
 *         tier: "Dynamic",
 *         size: "Y1",
 *     },
 * });
 * const exampleFunctionApp = new azure.appservice.FunctionApp("example", {
 *     name: "test-azure-functions",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     appServicePlanId: examplePlan.id,
 *     storageAccountName: exampleAccount.name,
 *     storageAccountAccessKey: exampleAccount.primaryAccessKey,
 * });
 * ```
 *
 * ### Linux)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "azure-functions-cptest-rg",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "functionsapptestsa",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const examplePlan = new azure.appservice.Plan("example", {
 *     name: "azure-functions-test-service-plan",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     kind: "Linux",
 *     reserved: true,
 *     sku: {
 *         tier: "Dynamic",
 *         size: "Y1",
 *     },
 * });
 * const exampleFunctionApp = new azure.appservice.FunctionApp("example", {
 *     name: "test-azure-functions",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     appServicePlanId: examplePlan.id,
 *     storageAccountName: exampleAccount.name,
 *     storageAccountAccessKey: exampleAccount.primaryAccessKey,
 *     osType: "linux",
 *     version: "~3",
 * });
 * ```
 *
 * > **Note:** Version `~3` or `~4` is required for Linux Function Apps.
 *
 * ## Import
 *
 * Function Apps can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:appservice/functionApp:FunctionApp functionapp1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/sites/functionapp1
 * ```
 */
export class FunctionApp extends pulumi.CustomResource {
    /**
     * Get an existing FunctionApp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionAppState, opts?: pulumi.CustomResourceOptions): FunctionApp {
        return new FunctionApp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/functionApp:FunctionApp';

    /**
     * Returns true if the given object is an instance of FunctionApp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FunctionApp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FunctionApp.__pulumiType;
    }

    /**
     * The ID of the App Service Plan within which to create this Function App.
     */
    public readonly appServicePlanId!: pulumi.Output<string>;
    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     *
     * > **NOTE:** The values for `AzureWebJobsStorage` and `FUNCTIONS_EXTENSION_VERSION` will be filled by other input arguments and shouldn't be configured separately. `AzureWebJobsStorage` is filled based on `storageAccountName` and `storageAccountAccessKey`. `FUNCTIONS_EXTENSION_VERSION` is filled based on `version`.
     */
    public readonly appSettings!: pulumi.Output<{[key: string]: string}>;
    /**
     * A `authSettings` block as defined below.
     */
    public readonly authSettings!: pulumi.Output<outputs.appservice.FunctionAppAuthSettings>;
    /**
     * The mode of the Function App's client certificates requirement for incoming requests. Possible values are `Required` and `Optional`.
     */
    public readonly clientCertMode!: pulumi.Output<string | undefined>;
    /**
     * An `connectionString` block as defined below.
     */
    public readonly connectionStrings!: pulumi.Output<outputs.appservice.FunctionAppConnectionString[]>;
    /**
     * An identifier used by App Service to perform domain ownership verification via DNS TXT record.
     */
    public /*out*/ readonly customDomainVerificationId!: pulumi.Output<string>;
    /**
     * The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan.
     */
    public readonly dailyMemoryTimeQuota!: pulumi.Output<number | undefined>;
    /**
     * The default hostname associated with the Function App - such as `mysite.azurewebsites.net`
     */
    public /*out*/ readonly defaultHostname!: pulumi.Output<string>;
    /**
     * Should the built-in logging of this Function App be enabled? Defaults to `true`.
     */
    public readonly enableBuiltinLogging!: pulumi.Output<boolean | undefined>;
    /**
     * Is the Function App enabled? Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Can the Function App only be accessed via HTTPS? Defaults to `false`.
     */
    public readonly httpsOnly!: pulumi.Output<boolean | undefined>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.appservice.FunctionAppIdentity | undefined>;
    /**
     * The User Assigned Identity Id used for looking up KeyVault secrets. The identity must be assigned to the application. See [Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity) for more information.
     */
    public readonly keyVaultReferenceIdentityId!: pulumi.Output<string>;
    /**
     * The Function App kind - such as `functionapp,linux,container`
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the Function App. Changing this forces a new resource to be created. Limit the function name to 32 characters to avoid naming collisions. For more information about [Function App naming rule](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules#microsoftweb).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A string indicating the Operating System type for this function app. Possible values are `linux` and ``(empty string). Changing this forces a new resource to be created. Defaults to `""`.
     *
     * > **NOTE:** This value will be `linux` for Linux derivatives, or an empty string for Windows (default). When set to `linux` you must also set `azure.appservice.Plan` arguments as `kind = "Linux"` and `reserved = true`
     */
    public readonly osType!: pulumi.Output<string | undefined>;
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`
     */
    public /*out*/ readonly outboundIpAddresses!: pulumi.Output<string>;
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outboundIpAddresses`.
     */
    public /*out*/ readonly possibleOutboundIpAddresses!: pulumi.Output<string>;
    /**
     * The name of the resource group in which to create the Function App. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `siteConfig` object as defined below.
     */
    public readonly siteConfig!: pulumi.Output<outputs.appservice.FunctionAppSiteConfig>;
    /**
     * A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     */
    public /*out*/ readonly siteCredentials!: pulumi.Output<outputs.appservice.FunctionAppSiteCredential[]>;
    /**
     * A `sourceControl` block, as defined below.
     */
    public readonly sourceControl!: pulumi.Output<outputs.appservice.FunctionAppSourceControl>;
    /**
     * The access key which will be used to access the backend storage account for the Function App.
     *
     * > **Note:** When integrating a `CI/CD pipeline` and expecting to run from a deployed package in `Azure` you must seed your `app settings` as part of the application code for function app to be successfully deployed. `Important Default key pairs`: (`"WEBSITE_RUN_FROM_PACKAGE" = ""`, `"FUNCTIONS_WORKER_RUNTIME" = "node"` (or python, etc), `"WEBSITE_NODE_DEFAULT_VERSION" = "10.14.1"`, `"APPINSIGHTS_INSTRUMENTATIONKEY" = ""`).
     *
     * > **Note:**  When using an App Service Plan in the `Free` or `Shared` Tiers `use32BitWorkerProcess` must be set to `true`.
     */
    public readonly storageAccountAccessKey!: pulumi.Output<string>;
    /**
     * The backend storage account name which will be used by this Function App (such as the dashboard, logs). Changing this forces a new resource to be created.
     */
    public readonly storageAccountName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The runtime version associated with the Function App. Defaults to `~1`.
     */
    public readonly version!: pulumi.Output<string | undefined>;

    /**
     * Create a FunctionApp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionAppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionAppArgs | FunctionAppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionAppState | undefined;
            resourceInputs["appServicePlanId"] = state ? state.appServicePlanId : undefined;
            resourceInputs["appSettings"] = state ? state.appSettings : undefined;
            resourceInputs["authSettings"] = state ? state.authSettings : undefined;
            resourceInputs["clientCertMode"] = state ? state.clientCertMode : undefined;
            resourceInputs["connectionStrings"] = state ? state.connectionStrings : undefined;
            resourceInputs["customDomainVerificationId"] = state ? state.customDomainVerificationId : undefined;
            resourceInputs["dailyMemoryTimeQuota"] = state ? state.dailyMemoryTimeQuota : undefined;
            resourceInputs["defaultHostname"] = state ? state.defaultHostname : undefined;
            resourceInputs["enableBuiltinLogging"] = state ? state.enableBuiltinLogging : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["httpsOnly"] = state ? state.httpsOnly : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["keyVaultReferenceIdentityId"] = state ? state.keyVaultReferenceIdentityId : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["osType"] = state ? state.osType : undefined;
            resourceInputs["outboundIpAddresses"] = state ? state.outboundIpAddresses : undefined;
            resourceInputs["possibleOutboundIpAddresses"] = state ? state.possibleOutboundIpAddresses : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["siteConfig"] = state ? state.siteConfig : undefined;
            resourceInputs["siteCredentials"] = state ? state.siteCredentials : undefined;
            resourceInputs["sourceControl"] = state ? state.sourceControl : undefined;
            resourceInputs["storageAccountAccessKey"] = state ? state.storageAccountAccessKey : undefined;
            resourceInputs["storageAccountName"] = state ? state.storageAccountName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as FunctionAppArgs | undefined;
            if ((!args || args.appServicePlanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appServicePlanId'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.storageAccountAccessKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountAccessKey'");
            }
            if ((!args || args.storageAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountName'");
            }
            resourceInputs["appServicePlanId"] = args ? args.appServicePlanId : undefined;
            resourceInputs["appSettings"] = args ? args.appSettings : undefined;
            resourceInputs["authSettings"] = args ? args.authSettings : undefined;
            resourceInputs["clientCertMode"] = args ? args.clientCertMode : undefined;
            resourceInputs["connectionStrings"] = args ? args.connectionStrings : undefined;
            resourceInputs["dailyMemoryTimeQuota"] = args ? args.dailyMemoryTimeQuota : undefined;
            resourceInputs["enableBuiltinLogging"] = args ? args.enableBuiltinLogging : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["httpsOnly"] = args ? args.httpsOnly : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["keyVaultReferenceIdentityId"] = args ? args.keyVaultReferenceIdentityId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["osType"] = args ? args.osType : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["siteConfig"] = args ? args.siteConfig : undefined;
            resourceInputs["sourceControl"] = args ? args.sourceControl : undefined;
            resourceInputs["storageAccountAccessKey"] = args?.storageAccountAccessKey ? pulumi.secret(args.storageAccountAccessKey) : undefined;
            resourceInputs["storageAccountName"] = args ? args.storageAccountName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["customDomainVerificationId"] = undefined /*out*/;
            resourceInputs["defaultHostname"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["outboundIpAddresses"] = undefined /*out*/;
            resourceInputs["possibleOutboundIpAddresses"] = undefined /*out*/;
            resourceInputs["siteCredentials"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["storageAccountAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(FunctionApp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FunctionApp resources.
 */
export interface FunctionAppState {
    /**
     * The ID of the App Service Plan within which to create this Function App.
     */
    appServicePlanId?: pulumi.Input<string>;
    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     *
     * > **NOTE:** The values for `AzureWebJobsStorage` and `FUNCTIONS_EXTENSION_VERSION` will be filled by other input arguments and shouldn't be configured separately. `AzureWebJobsStorage` is filled based on `storageAccountName` and `storageAccountAccessKey`. `FUNCTIONS_EXTENSION_VERSION` is filled based on `version`.
     */
    appSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `authSettings` block as defined below.
     */
    authSettings?: pulumi.Input<inputs.appservice.FunctionAppAuthSettings>;
    /**
     * The mode of the Function App's client certificates requirement for incoming requests. Possible values are `Required` and `Optional`.
     */
    clientCertMode?: pulumi.Input<string>;
    /**
     * An `connectionString` block as defined below.
     */
    connectionStrings?: pulumi.Input<pulumi.Input<inputs.appservice.FunctionAppConnectionString>[]>;
    /**
     * An identifier used by App Service to perform domain ownership verification via DNS TXT record.
     */
    customDomainVerificationId?: pulumi.Input<string>;
    /**
     * The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan.
     */
    dailyMemoryTimeQuota?: pulumi.Input<number>;
    /**
     * The default hostname associated with the Function App - such as `mysite.azurewebsites.net`
     */
    defaultHostname?: pulumi.Input<string>;
    /**
     * Should the built-in logging of this Function App be enabled? Defaults to `true`.
     */
    enableBuiltinLogging?: pulumi.Input<boolean>;
    /**
     * Is the Function App enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Can the Function App only be accessed via HTTPS? Defaults to `false`.
     */
    httpsOnly?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.appservice.FunctionAppIdentity>;
    /**
     * The User Assigned Identity Id used for looking up KeyVault secrets. The identity must be assigned to the application. See [Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity) for more information.
     */
    keyVaultReferenceIdentityId?: pulumi.Input<string>;
    /**
     * The Function App kind - such as `functionapp,linux,container`
     */
    kind?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Function App. Changing this forces a new resource to be created. Limit the function name to 32 characters to avoid naming collisions. For more information about [Function App naming rule](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules#microsoftweb).
     */
    name?: pulumi.Input<string>;
    /**
     * A string indicating the Operating System type for this function app. Possible values are `linux` and ``(empty string). Changing this forces a new resource to be created. Defaults to `""`.
     *
     * > **NOTE:** This value will be `linux` for Linux derivatives, or an empty string for Windows (default). When set to `linux` you must also set `azure.appservice.Plan` arguments as `kind = "Linux"` and `reserved = true`
     */
    osType?: pulumi.Input<string>;
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`
     */
    outboundIpAddresses?: pulumi.Input<string>;
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outboundIpAddresses`.
     */
    possibleOutboundIpAddresses?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Function App. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `siteConfig` object as defined below.
     */
    siteConfig?: pulumi.Input<inputs.appservice.FunctionAppSiteConfig>;
    /**
     * A `siteCredential` block as defined below, which contains the site-level credentials used to publish to this App Service.
     */
    siteCredentials?: pulumi.Input<pulumi.Input<inputs.appservice.FunctionAppSiteCredential>[]>;
    /**
     * A `sourceControl` block, as defined below.
     */
    sourceControl?: pulumi.Input<inputs.appservice.FunctionAppSourceControl>;
    /**
     * The access key which will be used to access the backend storage account for the Function App.
     *
     * > **Note:** When integrating a `CI/CD pipeline` and expecting to run from a deployed package in `Azure` you must seed your `app settings` as part of the application code for function app to be successfully deployed. `Important Default key pairs`: (`"WEBSITE_RUN_FROM_PACKAGE" = ""`, `"FUNCTIONS_WORKER_RUNTIME" = "node"` (or python, etc), `"WEBSITE_NODE_DEFAULT_VERSION" = "10.14.1"`, `"APPINSIGHTS_INSTRUMENTATIONKEY" = ""`).
     *
     * > **Note:**  When using an App Service Plan in the `Free` or `Shared` Tiers `use32BitWorkerProcess` must be set to `true`.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * The backend storage account name which will be used by this Function App (such as the dashboard, logs). Changing this forces a new resource to be created.
     */
    storageAccountName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The runtime version associated with the Function App. Defaults to `~1`.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FunctionApp resource.
 */
export interface FunctionAppArgs {
    /**
     * The ID of the App Service Plan within which to create this Function App.
     */
    appServicePlanId: pulumi.Input<string>;
    /**
     * A map of key-value pairs for [App Settings](https://docs.microsoft.com/azure/azure-functions/functions-app-settings) and custom values.
     *
     * > **NOTE:** The values for `AzureWebJobsStorage` and `FUNCTIONS_EXTENSION_VERSION` will be filled by other input arguments and shouldn't be configured separately. `AzureWebJobsStorage` is filled based on `storageAccountName` and `storageAccountAccessKey`. `FUNCTIONS_EXTENSION_VERSION` is filled based on `version`.
     */
    appSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `authSettings` block as defined below.
     */
    authSettings?: pulumi.Input<inputs.appservice.FunctionAppAuthSettings>;
    /**
     * The mode of the Function App's client certificates requirement for incoming requests. Possible values are `Required` and `Optional`.
     */
    clientCertMode?: pulumi.Input<string>;
    /**
     * An `connectionString` block as defined below.
     */
    connectionStrings?: pulumi.Input<pulumi.Input<inputs.appservice.FunctionAppConnectionString>[]>;
    /**
     * The amount of memory in gigabyte-seconds that your application is allowed to consume per day. Setting this value only affects function apps under the consumption plan.
     */
    dailyMemoryTimeQuota?: pulumi.Input<number>;
    /**
     * Should the built-in logging of this Function App be enabled? Defaults to `true`.
     */
    enableBuiltinLogging?: pulumi.Input<boolean>;
    /**
     * Is the Function App enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Can the Function App only be accessed via HTTPS? Defaults to `false`.
     */
    httpsOnly?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.appservice.FunctionAppIdentity>;
    /**
     * The User Assigned Identity Id used for looking up KeyVault secrets. The identity must be assigned to the application. See [Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity) for more information.
     */
    keyVaultReferenceIdentityId?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Function App. Changing this forces a new resource to be created. Limit the function name to 32 characters to avoid naming collisions. For more information about [Function App naming rule](https://docs.microsoft.com/azure/azure-resource-manager/management/resource-name-rules#microsoftweb).
     */
    name?: pulumi.Input<string>;
    /**
     * A string indicating the Operating System type for this function app. Possible values are `linux` and ``(empty string). Changing this forces a new resource to be created. Defaults to `""`.
     *
     * > **NOTE:** This value will be `linux` for Linux derivatives, or an empty string for Windows (default). When set to `linux` you must also set `azure.appservice.Plan` arguments as `kind = "Linux"` and `reserved = true`
     */
    osType?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Function App. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `siteConfig` object as defined below.
     */
    siteConfig?: pulumi.Input<inputs.appservice.FunctionAppSiteConfig>;
    /**
     * A `sourceControl` block, as defined below.
     */
    sourceControl?: pulumi.Input<inputs.appservice.FunctionAppSourceControl>;
    /**
     * The access key which will be used to access the backend storage account for the Function App.
     *
     * > **Note:** When integrating a `CI/CD pipeline` and expecting to run from a deployed package in `Azure` you must seed your `app settings` as part of the application code for function app to be successfully deployed. `Important Default key pairs`: (`"WEBSITE_RUN_FROM_PACKAGE" = ""`, `"FUNCTIONS_WORKER_RUNTIME" = "node"` (or python, etc), `"WEBSITE_NODE_DEFAULT_VERSION" = "10.14.1"`, `"APPINSIGHTS_INSTRUMENTATIONKEY" = ""`).
     *
     * > **Note:**  When using an App Service Plan in the `Free` or `Shared` Tiers `use32BitWorkerProcess` must be set to `true`.
     */
    storageAccountAccessKey: pulumi.Input<string>;
    /**
     * The backend storage account name which will be used by this Function App (such as the dashboard, logs). Changing this forces a new resource to be created.
     */
    storageAccountName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The runtime version associated with the Function App. Defaults to `~1`.
     */
    version?: pulumi.Input<string>;
}
