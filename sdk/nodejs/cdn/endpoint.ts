// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A CDN Endpoint is the entity within a CDN Profile containing configuration information regarding caching behaviours and origins. The CDN Endpoint is exposed using the URL format `<endpointname>.azureedge.net`.
 *
 * !> **Note:** Azure rolled out a breaking change on Friday 9th April 2021 which may cause issues with the CDN/FrontDoor resources. More information is available in this GitHub issue - unfortunately this may necessitate a breaking change to the CDN and FrontDoor resources, more information will be posted in the GitHub issue as the necessary changes are identified.
 *
 * !> **Note:** The CDN services from Edgio(formerly Verizon) was shut down on 15 January 2025 and is no longer available.
 *
 * !> **Note:** Support for CDN services from Akamai was removed on 31 October 2023.
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
 * const exampleProfile = new azure.cdn.Profile("example", {
 *     name: "example-cdn",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "Standard_Microsoft",
 * });
 * const exampleEndpoint = new azure.cdn.Endpoint("example", {
 *     name: "example",
 *     profileName: exampleProfile.name,
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     origins: [{
 *         name: "example",
 *         hostName: "www.contoso.com",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * CDN Endpoints can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:cdn/endpoint:Endpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Cdn/profiles/myprofile1/endpoints/myendpoint1
 * ```
 */
export class Endpoint extends pulumi.CustomResource {
    /**
     * Get an existing Endpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EndpointState, opts?: pulumi.CustomResourceOptions): Endpoint {
        return new Endpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cdn/endpoint:Endpoint';

    /**
     * Returns true if the given object is an instance of Endpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Endpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Endpoint.__pulumiType;
    }

    /**
     * An array of strings that indicates a content types on which compression will be applied. The value for the elements should be MIME types.
     */
    public readonly contentTypesToCompresses!: pulumi.Output<string[] | undefined>;
    /**
     * Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     */
    public readonly deliveryRules!: pulumi.Output<outputs.cdn.EndpointDeliveryRule[] | undefined>;
    /**
     * The Fully Qualified Domain Name of the CDN Endpoint.
     */
    public /*out*/ readonly fqdn!: pulumi.Output<string>;
    /**
     * A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     */
    public readonly geoFilters!: pulumi.Output<outputs.cdn.EndpointGeoFilter[] | undefined>;
    /**
     * Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     */
    public readonly globalDeliveryRule!: pulumi.Output<outputs.cdn.EndpointGlobalDeliveryRule | undefined>;
    /**
     * Indicates whether compression is to be enabled.
     */
    public readonly isCompressionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies if http allowed. Defaults to `true`.
     */
    public readonly isHttpAllowed!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies if https allowed. Defaults to `true`.
     */
    public readonly isHttpsAllowed!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the CDN Endpoint. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * What types of optimization should this CDN Endpoint optimize for? Possible values include `DynamicSiteAcceleration`, `GeneralMediaStreaming`, `GeneralWebDelivery`, `LargeFileDownload` and `VideoOnDemandMediaStreaming`.
     */
    public readonly optimizationType!: pulumi.Output<string | undefined>;
    /**
     * The host header CDN provider will send along with content requests to origins.
     */
    public readonly originHostHeader!: pulumi.Output<string | undefined>;
    /**
     * The path used at for origin requests.
     */
    public readonly originPath!: pulumi.Output<string | undefined>;
    /**
     * The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     */
    public readonly origins!: pulumi.Output<outputs.cdn.EndpointOrigin[]>;
    /**
     * the path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the `originPath`.
     *
     * > **Note:** `globalDeliveryRule` and `deliveryRule` are currently only available for `Microsoft_Standard` CDN profiles.
     */
    public readonly probePath!: pulumi.Output<string | undefined>;
    /**
     * The CDN Profile to which to attach the CDN Endpoint. Changing this forces a new resource to be created.
     */
    public readonly profileName!: pulumi.Output<string>;
    /**
     * Sets query string caching behavior. Allowed values are `IgnoreQueryString`, `BypassCaching` and `UseQueryString`. `NotSet` value can be used for `Premium Verizon` CDN profile. Defaults to `IgnoreQueryString`.
     */
    public readonly querystringCachingBehaviour!: pulumi.Output<string | undefined>;
    /**
     * The name of the resource group in which to create the CDN Endpoint. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Endpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EndpointArgs | EndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EndpointState | undefined;
            resourceInputs["contentTypesToCompresses"] = state ? state.contentTypesToCompresses : undefined;
            resourceInputs["deliveryRules"] = state ? state.deliveryRules : undefined;
            resourceInputs["fqdn"] = state ? state.fqdn : undefined;
            resourceInputs["geoFilters"] = state ? state.geoFilters : undefined;
            resourceInputs["globalDeliveryRule"] = state ? state.globalDeliveryRule : undefined;
            resourceInputs["isCompressionEnabled"] = state ? state.isCompressionEnabled : undefined;
            resourceInputs["isHttpAllowed"] = state ? state.isHttpAllowed : undefined;
            resourceInputs["isHttpsAllowed"] = state ? state.isHttpsAllowed : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["optimizationType"] = state ? state.optimizationType : undefined;
            resourceInputs["originHostHeader"] = state ? state.originHostHeader : undefined;
            resourceInputs["originPath"] = state ? state.originPath : undefined;
            resourceInputs["origins"] = state ? state.origins : undefined;
            resourceInputs["probePath"] = state ? state.probePath : undefined;
            resourceInputs["profileName"] = state ? state.profileName : undefined;
            resourceInputs["querystringCachingBehaviour"] = state ? state.querystringCachingBehaviour : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as EndpointArgs | undefined;
            if ((!args || args.origins === undefined) && !opts.urn) {
                throw new Error("Missing required property 'origins'");
            }
            if ((!args || args.profileName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'profileName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["contentTypesToCompresses"] = args ? args.contentTypesToCompresses : undefined;
            resourceInputs["deliveryRules"] = args ? args.deliveryRules : undefined;
            resourceInputs["geoFilters"] = args ? args.geoFilters : undefined;
            resourceInputs["globalDeliveryRule"] = args ? args.globalDeliveryRule : undefined;
            resourceInputs["isCompressionEnabled"] = args ? args.isCompressionEnabled : undefined;
            resourceInputs["isHttpAllowed"] = args ? args.isHttpAllowed : undefined;
            resourceInputs["isHttpsAllowed"] = args ? args.isHttpsAllowed : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["optimizationType"] = args ? args.optimizationType : undefined;
            resourceInputs["originHostHeader"] = args ? args.originHostHeader : undefined;
            resourceInputs["originPath"] = args ? args.originPath : undefined;
            resourceInputs["origins"] = args ? args.origins : undefined;
            resourceInputs["probePath"] = args ? args.probePath : undefined;
            resourceInputs["profileName"] = args ? args.profileName : undefined;
            resourceInputs["querystringCachingBehaviour"] = args ? args.querystringCachingBehaviour : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["fqdn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Endpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Endpoint resources.
 */
export interface EndpointState {
    /**
     * An array of strings that indicates a content types on which compression will be applied. The value for the elements should be MIME types.
     */
    contentTypesToCompresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     */
    deliveryRules?: pulumi.Input<pulumi.Input<inputs.cdn.EndpointDeliveryRule>[]>;
    /**
     * The Fully Qualified Domain Name of the CDN Endpoint.
     */
    fqdn?: pulumi.Input<string>;
    /**
     * A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     */
    geoFilters?: pulumi.Input<pulumi.Input<inputs.cdn.EndpointGeoFilter>[]>;
    /**
     * Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     */
    globalDeliveryRule?: pulumi.Input<inputs.cdn.EndpointGlobalDeliveryRule>;
    /**
     * Indicates whether compression is to be enabled.
     */
    isCompressionEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies if http allowed. Defaults to `true`.
     */
    isHttpAllowed?: pulumi.Input<boolean>;
    /**
     * Specifies if https allowed. Defaults to `true`.
     */
    isHttpsAllowed?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the CDN Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * What types of optimization should this CDN Endpoint optimize for? Possible values include `DynamicSiteAcceleration`, `GeneralMediaStreaming`, `GeneralWebDelivery`, `LargeFileDownload` and `VideoOnDemandMediaStreaming`.
     */
    optimizationType?: pulumi.Input<string>;
    /**
     * The host header CDN provider will send along with content requests to origins.
     */
    originHostHeader?: pulumi.Input<string>;
    /**
     * The path used at for origin requests.
     */
    originPath?: pulumi.Input<string>;
    /**
     * The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     */
    origins?: pulumi.Input<pulumi.Input<inputs.cdn.EndpointOrigin>[]>;
    /**
     * the path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the `originPath`.
     *
     * > **Note:** `globalDeliveryRule` and `deliveryRule` are currently only available for `Microsoft_Standard` CDN profiles.
     */
    probePath?: pulumi.Input<string>;
    /**
     * The CDN Profile to which to attach the CDN Endpoint. Changing this forces a new resource to be created.
     */
    profileName?: pulumi.Input<string>;
    /**
     * Sets query string caching behavior. Allowed values are `IgnoreQueryString`, `BypassCaching` and `UseQueryString`. `NotSet` value can be used for `Premium Verizon` CDN profile. Defaults to `IgnoreQueryString`.
     */
    querystringCachingBehaviour?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the CDN Endpoint. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Endpoint resource.
 */
export interface EndpointArgs {
    /**
     * An array of strings that indicates a content types on which compression will be applied. The value for the elements should be MIME types.
     */
    contentTypesToCompresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Rules for the rules engine. An endpoint can contain up until 4 of those rules that consist of conditions and actions. A `deliveryRule` blocks as defined below.
     */
    deliveryRules?: pulumi.Input<pulumi.Input<inputs.cdn.EndpointDeliveryRule>[]>;
    /**
     * A set of Geo Filters for this CDN Endpoint. Each `geoFilter` block supports fields documented below.
     */
    geoFilters?: pulumi.Input<pulumi.Input<inputs.cdn.EndpointGeoFilter>[]>;
    /**
     * Actions that are valid for all resources regardless of any conditions. A `globalDeliveryRule` block as defined below.
     */
    globalDeliveryRule?: pulumi.Input<inputs.cdn.EndpointGlobalDeliveryRule>;
    /**
     * Indicates whether compression is to be enabled.
     */
    isCompressionEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies if http allowed. Defaults to `true`.
     */
    isHttpAllowed?: pulumi.Input<boolean>;
    /**
     * Specifies if https allowed. Defaults to `true`.
     */
    isHttpsAllowed?: pulumi.Input<boolean>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the CDN Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * What types of optimization should this CDN Endpoint optimize for? Possible values include `DynamicSiteAcceleration`, `GeneralMediaStreaming`, `GeneralWebDelivery`, `LargeFileDownload` and `VideoOnDemandMediaStreaming`.
     */
    optimizationType?: pulumi.Input<string>;
    /**
     * The host header CDN provider will send along with content requests to origins.
     */
    originHostHeader?: pulumi.Input<string>;
    /**
     * The path used at for origin requests.
     */
    originPath?: pulumi.Input<string>;
    /**
     * The set of origins of the CDN endpoint. When multiple origins exist, the first origin will be used as primary and rest will be used as failover options. Each `origin` block supports fields documented below. Changing this forces a new resource to be created.
     */
    origins: pulumi.Input<pulumi.Input<inputs.cdn.EndpointOrigin>[]>;
    /**
     * the path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the `originPath`.
     *
     * > **Note:** `globalDeliveryRule` and `deliveryRule` are currently only available for `Microsoft_Standard` CDN profiles.
     */
    probePath?: pulumi.Input<string>;
    /**
     * The CDN Profile to which to attach the CDN Endpoint. Changing this forces a new resource to be created.
     */
    profileName: pulumi.Input<string>;
    /**
     * Sets query string caching behavior. Allowed values are `IgnoreQueryString`, `BypassCaching` and `UseQueryString`. `NotSet` value can be used for `Premium Verizon` CDN profile. Defaults to `IgnoreQueryString`.
     */
    querystringCachingBehaviour?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the CDN Endpoint. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
