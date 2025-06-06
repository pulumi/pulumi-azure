// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Azure Relay Namespace.
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
 * const exampleNamespace = new azure.relay.Namespace("example", {
 *     name: "example-relay",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "Standard",
 *     tags: {
 *         source: "example",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Relay`: 2021-11-01
 *
 * ## Import
 *
 * Azure Relay Namespace's can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:relay/namespace:Namespace relay1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Relay/namespaces/relay1
 * ```
 */
export class Namespace extends pulumi.CustomResource {
    /**
     * Get an existing Namespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NamespaceState, opts?: pulumi.CustomResourceOptions): Namespace {
        return new Namespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:relay/namespace:Namespace';

    /**
     * Returns true if the given object is an instance of Namespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Namespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Namespace.__pulumiType;
    }

    /**
     * Specifies the supported Azure location where the Azure Relay Namespace exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The Identifier for Azure Insights metrics.
     */
    public /*out*/ readonly metricId!: pulumi.Output<string>;
    /**
     * Specifies the name of the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The primary connection string for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly primaryConnectionString!: pulumi.Output<string>;
    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly primaryKey!: pulumi.Output<string>;
    /**
     * The name of the resource group in which to create the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The secondary connection string for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly secondaryConnectionString!: pulumi.Output<string>;
    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    public /*out*/ readonly secondaryKey!: pulumi.Output<string>;
    /**
     * The name of the SKU to use. At this time the only supported value is `Standard`.
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Namespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NamespaceArgs | NamespaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NamespaceState | undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["metricId"] = state ? state.metricId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryConnectionString"] = state ? state.primaryConnectionString : undefined;
            resourceInputs["primaryKey"] = state ? state.primaryKey : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["secondaryConnectionString"] = state ? state.secondaryConnectionString : undefined;
            resourceInputs["secondaryKey"] = state ? state.secondaryKey : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as NamespaceArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["metricId"] = undefined /*out*/;
            resourceInputs["primaryConnectionString"] = undefined /*out*/;
            resourceInputs["primaryKey"] = undefined /*out*/;
            resourceInputs["secondaryConnectionString"] = undefined /*out*/;
            resourceInputs["secondaryKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["primaryConnectionString", "primaryKey", "secondaryConnectionString", "secondaryKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Namespace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Namespace resources.
 */
export interface NamespaceState {
    /**
     * Specifies the supported Azure location where the Azure Relay Namespace exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Identifier for Azure Insights metrics.
     */
    metricId?: pulumi.Input<string>;
    /**
     * Specifies the name of the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The primary connection string for the authorization rule `RootManageSharedAccessKey`.
     */
    primaryConnectionString?: pulumi.Input<string>;
    /**
     * The primary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    primaryKey?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The secondary connection string for the authorization rule `RootManageSharedAccessKey`.
     */
    secondaryConnectionString?: pulumi.Input<string>;
    /**
     * The secondary access key for the authorization rule `RootManageSharedAccessKey`.
     */
    secondaryKey?: pulumi.Input<string>;
    /**
     * The name of the SKU to use. At this time the only supported value is `Standard`.
     */
    skuName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Namespace resource.
 */
export interface NamespaceArgs {
    /**
     * Specifies the supported Azure location where the Azure Relay Namespace exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Azure Relay Namespace. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The name of the SKU to use. At this time the only supported value is `Standard`.
     */
    skuName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
