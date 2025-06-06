// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Azure Spatial Anchors Account.
 *
 * > **Note:** The `azure.mixedreality.SpatialAnchorsAccount` resource has been deprecated because the service is retiring from 2024-11-20 and will be removed in v5.0 of the AzureRM Provider.
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
 * const exampleSpatialAnchorsAccount = new azure.mixedreality.SpatialAnchorsAccount("example", {
 *     name: "example",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.MixedReality`: 2021-01-01
 *
 * ## Import
 *
 * Spatial Anchors Account can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.MixedReality/spatialAnchorsAccounts/example
 * ```
 */
export class SpatialAnchorsAccount extends pulumi.CustomResource {
    /**
     * Get an existing SpatialAnchorsAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpatialAnchorsAccountState, opts?: pulumi.CustomResourceOptions): SpatialAnchorsAccount {
        return new SpatialAnchorsAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mixedreality/spatialAnchorsAccount:SpatialAnchorsAccount';

    /**
     * Returns true if the given object is an instance of SpatialAnchorsAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpatialAnchorsAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpatialAnchorsAccount.__pulumiType;
    }

    /**
     * The domain of the Spatial Anchors Account.
     */
    public /*out*/ readonly accountDomain!: pulumi.Output<string>;
    /**
     * The account ID of the Spatial Anchors Account.
     */
    public /*out*/ readonly accountId!: pulumi.Output<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group in which to create the Spatial Anchors Account. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a SpatialAnchorsAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpatialAnchorsAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpatialAnchorsAccountArgs | SpatialAnchorsAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpatialAnchorsAccountState | undefined;
            resourceInputs["accountDomain"] = state ? state.accountDomain : undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SpatialAnchorsAccountArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["accountDomain"] = undefined /*out*/;
            resourceInputs["accountId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpatialAnchorsAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpatialAnchorsAccount resources.
 */
export interface SpatialAnchorsAccountState {
    /**
     * The domain of the Spatial Anchors Account.
     */
    accountDomain?: pulumi.Input<string>;
    /**
     * The account ID of the Spatial Anchors Account.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Spatial Anchors Account. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a SpatialAnchorsAccount resource.
 */
export interface SpatialAnchorsAccountArgs {
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which to create the Spatial Anchors Account. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
