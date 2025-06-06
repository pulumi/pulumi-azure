// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Storage Mover Project.
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
 * const exampleMover = new azure.storage.Mover("example", {
 *     name: "example-ssm",
 *     resourceGroupName: example.name,
 *     location: example.location,
 * });
 * const exampleMoverProject = new azure.storage.MoverProject("example", {
 *     name: "example-sp",
 *     storageMoverId: exampleMover.id,
 *     description: "Example Project Description",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.StorageMover`: 2023-03-01
 *
 * ## Import
 *
 * Storage Mover Project can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:storage/moverProject:MoverProject example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/projects/project1
 * ```
 */
export class MoverProject extends pulumi.CustomResource {
    /**
     * Get an existing MoverProject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MoverProjectState, opts?: pulumi.CustomResourceOptions): MoverProject {
        return new MoverProject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:storage/moverProject:MoverProject';

    /**
     * Returns true if the given object is an instance of MoverProject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MoverProject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MoverProject.__pulumiType;
    }

    /**
     * Specifies a description for this Storage Mover Project.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name which should be used for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    public readonly storageMoverId!: pulumi.Output<string>;

    /**
     * Create a MoverProject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MoverProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MoverProjectArgs | MoverProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MoverProjectState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["storageMoverId"] = state ? state.storageMoverId : undefined;
        } else {
            const args = argsOrState as MoverProjectArgs | undefined;
            if ((!args || args.storageMoverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageMoverId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["storageMoverId"] = args ? args.storageMoverId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MoverProject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MoverProject resources.
 */
export interface MoverProjectState {
    /**
     * Specifies a description for this Storage Mover Project.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    storageMoverId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MoverProject resource.
 */
export interface MoverProjectArgs {
    /**
     * Specifies a description for this Storage Mover Project.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Project. Changing this forces a new resource to be created.
     */
    storageMoverId: pulumi.Input<string>;
}
