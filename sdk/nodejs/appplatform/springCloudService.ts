// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an Azure Spring Cloud Service.
 *
 * !> **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudService` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleInsights = new azure.appinsights.Insights("example", {
 *     name: "tf-test-appinsights",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     applicationType: "web",
 * });
 * const exampleSpringCloudService = new azure.appplatform.SpringCloudService("example", {
 *     name: "example-springcloud",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     skuName: "S0",
 *     configServerGitSetting: {
 *         uri: "https://github.com/Azure-Samples/piggymetrics",
 *         label: "config",
 *         searchPaths: [
 *             "dir1",
 *             "dir2",
 *         ],
 *     },
 *     trace: {
 *         connectionString: exampleInsights.connectionString,
 *         sampleRate: 10,
 *     },
 *     tags: {
 *         Env: "staging",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Spring Cloud services can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:appplatform/springCloudService:SpringCloudService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AppPlatform/spring/spring1
 * ```
 */
export class SpringCloudService extends pulumi.CustomResource {
    /**
     * Get an existing SpringCloudService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpringCloudServiceState, opts?: pulumi.CustomResourceOptions): SpringCloudService {
        return new SpringCloudService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appplatform/springCloudService:SpringCloudService';

    /**
     * Returns true if the given object is an instance of SpringCloudService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpringCloudService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpringCloudService.__pulumiType;
    }

    /**
     * Specifies the size for this Spring Cloud Service's default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    public readonly buildAgentPoolSize!: pulumi.Output<string | undefined>;
    /**
     * A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     */
    public readonly configServerGitSetting!: pulumi.Output<outputs.appplatform.SpringCloudServiceConfigServerGitSetting | undefined>;
    /**
     * One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    public readonly containerRegistries!: pulumi.Output<outputs.appplatform.SpringCloudServiceContainerRegistry[] | undefined>;
    /**
     * A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    public readonly defaultBuildService!: pulumi.Output<outputs.appplatform.SpringCloudServiceDefaultBuildService | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Should the log stream in vnet injection instance could be accessed from Internet?
     */
    public readonly logStreamPublicEndpointEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The resource Id of the Managed Environment that the Spring Apps instance builds on. Can only be specified when `skuTier` is set to `StandardGen2`.
     */
    public readonly managedEnvironmentId!: pulumi.Output<string | undefined>;
    /**
     * A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     */
    public readonly marketplace!: pulumi.Output<outputs.appplatform.SpringCloudServiceMarketplace>;
    /**
     * Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A `network` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly network!: pulumi.Output<outputs.appplatform.SpringCloudServiceNetwork | undefined>;
    /**
     * A list of the outbound Public IP Addresses used by this Spring Cloud Service.
     */
    public /*out*/ readonly outboundPublicIpAddresses!: pulumi.Output<string[]>;
    /**
     * A list of `requiredNetworkTrafficRules` blocks as defined below.
     */
    public /*out*/ readonly requiredNetworkTrafficRules!: pulumi.Output<outputs.appplatform.SpringCloudServiceRequiredNetworkTrafficRule[]>;
    /**
     * Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Whether enable the default Service Registry. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    public readonly serviceRegistryEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the Spring Cloud Service Registry.
     */
    public /*out*/ readonly serviceRegistryId!: pulumi.Output<string>;
    /**
     * Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`. Changing this forces a new resource to be created.
     */
    public readonly skuName!: pulumi.Output<string | undefined>;
    /**
     * Specifies the SKU Tier for this Spring Cloud Service. Possible values are `Basic`, `Enterprise`, `Standard` and `StandardGen2`. The attribute is automatically computed from API response except when `managedEnvironmentId` is defined. Changing this forces a new resource to be created.
     */
    public readonly skuTier!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A `trace` block as defined below.
     */
    public readonly trace!: pulumi.Output<outputs.appplatform.SpringCloudServiceTrace | undefined>;
    /**
     * Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
     */
    public readonly zoneRedundant!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SpringCloudService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpringCloudServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpringCloudServiceArgs | SpringCloudServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpringCloudServiceState | undefined;
            resourceInputs["buildAgentPoolSize"] = state ? state.buildAgentPoolSize : undefined;
            resourceInputs["configServerGitSetting"] = state ? state.configServerGitSetting : undefined;
            resourceInputs["containerRegistries"] = state ? state.containerRegistries : undefined;
            resourceInputs["defaultBuildService"] = state ? state.defaultBuildService : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["logStreamPublicEndpointEnabled"] = state ? state.logStreamPublicEndpointEnabled : undefined;
            resourceInputs["managedEnvironmentId"] = state ? state.managedEnvironmentId : undefined;
            resourceInputs["marketplace"] = state ? state.marketplace : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["outboundPublicIpAddresses"] = state ? state.outboundPublicIpAddresses : undefined;
            resourceInputs["requiredNetworkTrafficRules"] = state ? state.requiredNetworkTrafficRules : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serviceRegistryEnabled"] = state ? state.serviceRegistryEnabled : undefined;
            resourceInputs["serviceRegistryId"] = state ? state.serviceRegistryId : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["skuTier"] = state ? state.skuTier : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["trace"] = state ? state.trace : undefined;
            resourceInputs["zoneRedundant"] = state ? state.zoneRedundant : undefined;
        } else {
            const args = argsOrState as SpringCloudServiceArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["buildAgentPoolSize"] = args ? args.buildAgentPoolSize : undefined;
            resourceInputs["configServerGitSetting"] = args ? args.configServerGitSetting : undefined;
            resourceInputs["containerRegistries"] = args ? args.containerRegistries : undefined;
            resourceInputs["defaultBuildService"] = args ? args.defaultBuildService : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["logStreamPublicEndpointEnabled"] = args ? args.logStreamPublicEndpointEnabled : undefined;
            resourceInputs["managedEnvironmentId"] = args ? args.managedEnvironmentId : undefined;
            resourceInputs["marketplace"] = args ? args.marketplace : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serviceRegistryEnabled"] = args ? args.serviceRegistryEnabled : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["skuTier"] = args ? args.skuTier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["trace"] = args ? args.trace : undefined;
            resourceInputs["zoneRedundant"] = args ? args.zoneRedundant : undefined;
            resourceInputs["outboundPublicIpAddresses"] = undefined /*out*/;
            resourceInputs["requiredNetworkTrafficRules"] = undefined /*out*/;
            resourceInputs["serviceRegistryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpringCloudService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpringCloudService resources.
 */
export interface SpringCloudServiceState {
    /**
     * Specifies the size for this Spring Cloud Service's default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    buildAgentPoolSize?: pulumi.Input<string>;
    /**
     * A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     */
    configServerGitSetting?: pulumi.Input<inputs.appplatform.SpringCloudServiceConfigServerGitSetting>;
    /**
     * One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    containerRegistries?: pulumi.Input<pulumi.Input<inputs.appplatform.SpringCloudServiceContainerRegistry>[]>;
    /**
     * A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    defaultBuildService?: pulumi.Input<inputs.appplatform.SpringCloudServiceDefaultBuildService>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Should the log stream in vnet injection instance could be accessed from Internet?
     */
    logStreamPublicEndpointEnabled?: pulumi.Input<boolean>;
    /**
     * The resource Id of the Managed Environment that the Spring Apps instance builds on. Can only be specified when `skuTier` is set to `StandardGen2`.
     */
    managedEnvironmentId?: pulumi.Input<string>;
    /**
     * A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     */
    marketplace?: pulumi.Input<inputs.appplatform.SpringCloudServiceMarketplace>;
    /**
     * Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `network` block as defined below. Changing this forces a new resource to be created.
     */
    network?: pulumi.Input<inputs.appplatform.SpringCloudServiceNetwork>;
    /**
     * A list of the outbound Public IP Addresses used by this Spring Cloud Service.
     */
    outboundPublicIpAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of `requiredNetworkTrafficRules` blocks as defined below.
     */
    requiredNetworkTrafficRules?: pulumi.Input<pulumi.Input<inputs.appplatform.SpringCloudServiceRequiredNetworkTrafficRule>[]>;
    /**
     * Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Whether enable the default Service Registry. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    serviceRegistryEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Spring Cloud Service Registry.
     */
    serviceRegistryId?: pulumi.Input<string>;
    /**
     * Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`. Changing this forces a new resource to be created.
     */
    skuName?: pulumi.Input<string>;
    /**
     * Specifies the SKU Tier for this Spring Cloud Service. Possible values are `Basic`, `Enterprise`, `Standard` and `StandardGen2`. The attribute is automatically computed from API response except when `managedEnvironmentId` is defined. Changing this forces a new resource to be created.
     */
    skuTier?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `trace` block as defined below.
     */
    trace?: pulumi.Input<inputs.appplatform.SpringCloudServiceTrace>;
    /**
     * Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
     */
    zoneRedundant?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SpringCloudService resource.
 */
export interface SpringCloudServiceArgs {
    /**
     * Specifies the size for this Spring Cloud Service's default build agent pool. Possible values are `S1`, `S2`, `S3`, `S4` and `S5`. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    buildAgentPoolSize?: pulumi.Input<string>;
    /**
     * A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     */
    configServerGitSetting?: pulumi.Input<inputs.appplatform.SpringCloudServiceConfigServerGitSetting>;
    /**
     * One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    containerRegistries?: pulumi.Input<pulumi.Input<inputs.appplatform.SpringCloudServiceContainerRegistry>[]>;
    /**
     * A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    defaultBuildService?: pulumi.Input<inputs.appplatform.SpringCloudServiceDefaultBuildService>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Should the log stream in vnet injection instance could be accessed from Internet?
     */
    logStreamPublicEndpointEnabled?: pulumi.Input<boolean>;
    /**
     * The resource Id of the Managed Environment that the Spring Apps instance builds on. Can only be specified when `skuTier` is set to `StandardGen2`.
     */
    managedEnvironmentId?: pulumi.Input<string>;
    /**
     * A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     */
    marketplace?: pulumi.Input<inputs.appplatform.SpringCloudServiceMarketplace>;
    /**
     * Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A `network` block as defined below. Changing this forces a new resource to be created.
     */
    network?: pulumi.Input<inputs.appplatform.SpringCloudServiceNetwork>;
    /**
     * Specifies The name of the resource group in which to create the Spring Cloud Service. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Whether enable the default Service Registry. This field is applicable only for Spring Cloud Service with enterprise tier.
     */
    serviceRegistryEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the SKU Name for this Spring Cloud Service. Possible values are `B0`, `S0` and `E0`. Defaults to `S0`. Changing this forces a new resource to be created.
     */
    skuName?: pulumi.Input<string>;
    /**
     * Specifies the SKU Tier for this Spring Cloud Service. Possible values are `Basic`, `Enterprise`, `Standard` and `StandardGen2`. The attribute is automatically computed from API response except when `managedEnvironmentId` is defined. Changing this forces a new resource to be created.
     */
    skuTier?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `trace` block as defined below.
     */
    trace?: pulumi.Input<inputs.appplatform.SpringCloudServiceTrace>;
    /**
     * Whether zone redundancy is enabled for this Spring Cloud Service. Defaults to `false`.
     */
    zoneRedundant?: pulumi.Input<boolean>;
}
