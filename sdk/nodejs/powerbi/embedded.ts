// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a PowerBI Embedded.
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
 * const exampleEmbedded = new azure.powerbi.Embedded("example", {
 *     name: "examplepowerbi",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "A1",
 *     administrators: ["azsdktest@microsoft.com"],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.PowerBIDedicated`: 2021-01-01
 *
 * ## Import
 *
 * PowerBI Embedded can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:powerbi/embedded:Embedded example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.PowerBIDedicated/capacities/capacity1
 * ```
 */
export class Embedded extends pulumi.CustomResource {
    /**
     * Get an existing Embedded resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmbeddedState, opts?: pulumi.CustomResourceOptions): Embedded {
        return new Embedded(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:powerbi/embedded:Embedded';

    /**
     * Returns true if the given object is an instance of Embedded.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Embedded {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Embedded.__pulumiType;
    }

    /**
     * A set of administrator user identities, which manages the Power BI Embedded and must be a member user or a service principal in your AAD tenant.
     */
    public readonly administrators!: pulumi.Output<string[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Sets the PowerBI Embedded's mode. Possible values include: `Gen1`, `Gen2`. Defaults to `Gen1`. Changing this forces a new resource to be created.
     */
    public readonly mode!: pulumi.Output<string | undefined>;
    /**
     * The name of the PowerBI Embedded. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the PowerBI Embedded should be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Sets the PowerBI Embedded's pricing level's SKU. Possible values include: `A1`, `A2`, `A3`, `A4`, `A5`, `A6`, `A7` and `A8`.
     */
    public readonly skuName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Embedded resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmbeddedArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmbeddedArgs | EmbeddedState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmbeddedState | undefined;
            resourceInputs["administrators"] = state ? state.administrators : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["skuName"] = state ? state.skuName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as EmbeddedArgs | undefined;
            if ((!args || args.administrators === undefined) && !opts.urn) {
                throw new Error("Missing required property 'administrators'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.skuName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'skuName'");
            }
            resourceInputs["administrators"] = args ? args.administrators : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["skuName"] = args ? args.skuName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Embedded.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Embedded resources.
 */
export interface EmbeddedState {
    /**
     * A set of administrator user identities, which manages the Power BI Embedded and must be a member user or a service principal in your AAD tenant.
     */
    administrators?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Sets the PowerBI Embedded's mode. Possible values include: `Gen1`, `Gen2`. Defaults to `Gen1`. Changing this forces a new resource to be created.
     */
    mode?: pulumi.Input<string>;
    /**
     * The name of the PowerBI Embedded. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the PowerBI Embedded should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Sets the PowerBI Embedded's pricing level's SKU. Possible values include: `A1`, `A2`, `A3`, `A4`, `A5`, `A6`, `A7` and `A8`.
     */
    skuName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Embedded resource.
 */
export interface EmbeddedArgs {
    /**
     * A set of administrator user identities, which manages the Power BI Embedded and must be a member user or a service principal in your AAD tenant.
     */
    administrators: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Sets the PowerBI Embedded's mode. Possible values include: `Gen1`, `Gen2`. Defaults to `Gen1`. Changing this forces a new resource to be created.
     */
    mode?: pulumi.Input<string>;
    /**
     * The name of the PowerBI Embedded. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the PowerBI Embedded should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Sets the PowerBI Embedded's pricing level's SKU. Possible values include: `A1`, `A2`, `A3`, `A4`, `A5`, `A6`, `A7` and `A8`.
     */
    skuName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
