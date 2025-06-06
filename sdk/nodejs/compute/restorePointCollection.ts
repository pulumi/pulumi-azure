// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Virtual Machine Restore Point Collection.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as std from "@pulumi/std";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-network",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "internal",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("example", {
 *     name: "example-nic",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     ipConfigurations: [{
 *         name: "internal",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Dynamic",
 *     }],
 * });
 * const exampleLinuxVirtualMachine = new azure.compute.LinuxVirtualMachine("example", {
 *     name: "example-machine",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     size: "Standard_F2",
 *     adminUsername: "adminuser",
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 *     adminSshKeys: [{
 *         username: "adminuser",
 *         publicKey: std.file({
 *             input: "~/.ssh/id_rsa.pub",
 *         }).then(invoke => invoke.result),
 *     }],
 *     osDisk: {
 *         caching: "ReadWrite",
 *         storageAccountType: "Standard_LRS",
 *     },
 *     sourceImageReference: {
 *         publisher: "Canonical",
 *         offer: "0001-com-ubuntu-server-jammy",
 *         sku: "22_04-lts",
 *         version: "latest",
 *     },
 * });
 * const exampleRestorePointCollection = new azure.compute.RestorePointCollection("example", {
 *     name: "example-collection",
 *     resourceGroupName: example.name,
 *     location: exampleLinuxVirtualMachine.location,
 *     sourceVirtualMachineId: exampleLinuxVirtualMachine.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Compute`: 2024-03-01
 *
 * ## Import
 *
 * Virtual Machine Restore Point Collections can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:compute/restorePointCollection:RestorePointCollection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/restorePointCollections/collection1
 * ```
 */
export class RestorePointCollection extends pulumi.CustomResource {
    /**
     * Get an existing RestorePointCollection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RestorePointCollectionState, opts?: pulumi.CustomResourceOptions): RestorePointCollection {
        return new RestorePointCollection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/restorePointCollection:RestorePointCollection';

    /**
     * Returns true if the given object is an instance of RestorePointCollection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RestorePointCollection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RestorePointCollection.__pulumiType;
    }

    /**
     * The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    public readonly sourceVirtualMachineId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a RestorePointCollection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RestorePointCollectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RestorePointCollectionArgs | RestorePointCollectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RestorePointCollectionState | undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["sourceVirtualMachineId"] = state ? state.sourceVirtualMachineId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as RestorePointCollectionArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.sourceVirtualMachineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceVirtualMachineId'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["sourceVirtualMachineId"] = args ? args.sourceVirtualMachineId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:compute/virtualMachineRestorePointCollection:VirtualMachineRestorePointCollection" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(RestorePointCollection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RestorePointCollection resources.
 */
export interface RestorePointCollectionState {
    /**
     * The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    sourceVirtualMachineId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a RestorePointCollection resource.
 */
export interface RestorePointCollectionArgs {
    /**
     * The Azure location where the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the name of the Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Virtual Machine Restore Point Collection should exist. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The ID of the virtual machine that will be associated with this Virtual Machine Restore Point Collection. Changing this forces a new resource to be created.
     */
    sourceVirtualMachineId: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to this Virtual Machine Restore Point Collection.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
