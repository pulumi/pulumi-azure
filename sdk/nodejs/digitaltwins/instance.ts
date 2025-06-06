// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Digital Twins instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example_resources",
 *     location: "West Europe",
 * });
 * const exampleInstance = new azure.digitaltwins.Instance("example", {
 *     name: "example-DT",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DigitalTwins`: 2023-01-31
 *
 * ## Import
 *
 * Digital Twins instances can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:digitaltwins/instance:Instance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1
 * ```
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:digitaltwins/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The API endpoint to work with this Digital Twins instance.
     */
    public /*out*/ readonly hostName!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.digitaltwins.InstanceIdentity | undefined>;
    /**
     * The Azure Region where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Digital Twins instance. Changing this forces a new Digital Twins instance to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Digital Twins instance.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["hostName"] = state ? state.hostName : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["hostName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The API endpoint to work with this Digital Twins instance.
     */
    hostName?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.digitaltwins.InstanceIdentity>;
    /**
     * The Azure Region where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Digital Twins instance. Changing this forces a new Digital Twins instance to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Digital Twins instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.digitaltwins.InstanceIdentity>;
    /**
     * The Azure Region where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Digital Twins instance. Changing this forces a new Digital Twins instance to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Digital Twins instance should exist. Changing this forces a new Digital Twins instance to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Digital Twins instance.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
