// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Storage Mover Target Endpoint.
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
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "examplestr",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 *     allowNestedItemsToBePublic: true,
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "example-sc",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "blob",
 * });
 * const exampleMover = new azure.storage.Mover("example", {
 *     name: "example-ssm",
 *     resourceGroupName: example.name,
 *     location: "West Europe",
 * });
 * const exampleMoverTargetEndpoint = new azure.storage.MoverTargetEndpoint("example", {
 *     name: "example-se",
 *     storageMoverId: exampleMover.id,
 *     storageAccountId: exampleAccount.id,
 *     storageContainerName: exampleContainer.name,
 *     description: "Example Storage Container Endpoint Description",
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
 * Storage Mover Target Endpoint can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:storage/moverTargetEndpoint:MoverTargetEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/endpoints/endpoint1
 * ```
 */
export class MoverTargetEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing MoverTargetEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MoverTargetEndpointState, opts?: pulumi.CustomResourceOptions): MoverTargetEndpoint {
        return new MoverTargetEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:storage/moverTargetEndpoint:MoverTargetEndpoint';

    /**
     * Returns true if the given object is an instance of MoverTargetEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MoverTargetEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MoverTargetEndpoint.__pulumiType;
    }

    /**
     * Specifies a description for the Storage Mover Target Endpoint.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name which should be used for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the ID of the storage account for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    public readonly storageAccountId!: pulumi.Output<string>;
    /**
     * Specifies the name of the storage blob container for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    public readonly storageContainerName!: pulumi.Output<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    public readonly storageMoverId!: pulumi.Output<string>;

    /**
     * Create a MoverTargetEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MoverTargetEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MoverTargetEndpointArgs | MoverTargetEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MoverTargetEndpointState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["storageAccountId"] = state ? state.storageAccountId : undefined;
            resourceInputs["storageContainerName"] = state ? state.storageContainerName : undefined;
            resourceInputs["storageMoverId"] = state ? state.storageMoverId : undefined;
        } else {
            const args = argsOrState as MoverTargetEndpointArgs | undefined;
            if ((!args || args.storageAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountId'");
            }
            if ((!args || args.storageContainerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageContainerName'");
            }
            if ((!args || args.storageMoverId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageMoverId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["storageAccountId"] = args ? args.storageAccountId : undefined;
            resourceInputs["storageContainerName"] = args ? args.storageContainerName : undefined;
            resourceInputs["storageMoverId"] = args ? args.storageMoverId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MoverTargetEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MoverTargetEndpoint resources.
 */
export interface MoverTargetEndpointState {
    /**
     * Specifies a description for the Storage Mover Target Endpoint.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage account for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageAccountId?: pulumi.Input<string>;
    /**
     * Specifies the name of the storage blob container for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageContainerName?: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageMoverId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MoverTargetEndpoint resource.
 */
export interface MoverTargetEndpointArgs {
    /**
     * Specifies a description for the Storage Mover Target Endpoint.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage account for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageAccountId: pulumi.Input<string>;
    /**
     * Specifies the name of the storage blob container for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageContainerName: pulumi.Input<string>;
    /**
     * Specifies the ID of the storage mover for this Storage Mover Target Endpoint. Changing this forces a new resource to be created.
     */
    storageMoverId: pulumi.Input<string>;
}
