// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages an App Service Static Site.
 *
 * > **Note:** The `azure.appservice.StaticSite` resource is deprecated in favour of `azure.appservice.StaticWebApp` and will be removed in a future major release.
 *
 * > **Note:** After the Static Site is provisioned, you'll need to associate your target repository, which contains your web app, to the Static Site, by following the [Azure Static Site document](https://docs.microsoft.com/azure/static-web-apps/github-actions-workflow).
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
 * const exampleStaticSite = new azure.appservice.StaticSite("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * ```
 *
 * ## Import
 *
 * Static Web Apps can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:appservice/staticSite:StaticSite example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/staticSites/my-static-site1
 * ```
 */
export class StaticSite extends pulumi.CustomResource {
    /**
     * Get an existing StaticSite resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StaticSiteState, opts?: pulumi.CustomResourceOptions): StaticSite {
        return new StaticSite(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/staticSite:StaticSite';

    /**
     * Returns true if the given object is an instance of StaticSite.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StaticSite {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StaticSite.__pulumiType;
    }

    /**
     * The API key of this Static Web App, which is used for later interacting with this Static Web App from other clients, e.g. GitHub Action.
     */
    public /*out*/ readonly apiKey!: pulumi.Output<string>;
    /**
     * A key-value pair of App Settings.
     */
    public readonly appSettings!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The default host name of the Static Web App.
     */
    public /*out*/ readonly defaultHostName!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.appservice.StaticSiteIdentity | undefined>;
    /**
     * The Azure Region where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Static Web App. Changing this forces a new Static Web App to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the SKU size of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    public readonly skuSize!: pulumi.Output<string | undefined>;
    /**
     * Specifies the SKU tier of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    public readonly skuTier!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a StaticSite resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StaticSiteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StaticSiteArgs | StaticSiteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StaticSiteState | undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["appSettings"] = state ? state.appSettings : undefined;
            resourceInputs["defaultHostName"] = state ? state.defaultHostName : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["skuSize"] = state ? state.skuSize : undefined;
            resourceInputs["skuTier"] = state ? state.skuTier : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as StaticSiteArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["appSettings"] = args ? args.appSettings : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuSize"] = args ? args.skuSize : undefined;
            resourceInputs["skuTier"] = args ? args.skuTier : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["apiKey"] = undefined /*out*/;
            resourceInputs["defaultHostName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StaticSite.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StaticSite resources.
 */
export interface StaticSiteState {
    /**
     * The API key of this Static Web App, which is used for later interacting with this Static Web App from other clients, e.g. GitHub Action.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * A key-value pair of App Settings.
     */
    appSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The default host name of the Static Web App.
     */
    defaultHostName?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.appservice.StaticSiteIdentity>;
    /**
     * The Azure Region where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Static Web App. Changing this forces a new Static Web App to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the SKU size of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    skuSize?: pulumi.Input<string>;
    /**
     * Specifies the SKU tier of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    skuTier?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a StaticSite resource.
 */
export interface StaticSiteArgs {
    /**
     * A key-value pair of App Settings.
     */
    appSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.appservice.StaticSiteIdentity>;
    /**
     * The Azure Region where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Static Web App. Changing this forces a new Static Web App to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Static Web App should exist. Changing this forces a new Static Web App to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the SKU size of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    skuSize?: pulumi.Input<string>;
    /**
     * Specifies the SKU tier of the Static Web App. Possible values are `Free` or `Standard`. Defaults to `Free`.
     */
    skuTier?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
