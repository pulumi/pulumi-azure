// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a NetApp Snapshot.
 *
 * ## NetApp Snapshot Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-virtualnetwork",
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "example-subnet",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 *     delegations: [{
 *         name: "netapp",
 *         serviceDelegation: {
 *             name: "Microsoft.Netapp/volumes",
 *             actions: [
 *                 "Microsoft.Network/networkinterfaces/*",
 *                 "Microsoft.Network/virtualNetworks/subnets/join/action",
 *             ],
 *         },
 *     }],
 * });
 * const exampleAccount = new azure.netapp.Account("example", {
 *     name: "example-netappaccount",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const examplePool = new azure.netapp.Pool("example", {
 *     name: "example-netapppool",
 *     accountName: exampleAccount.name,
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     serviceLevel: "Premium",
 *     sizeInTb: 4,
 * });
 * const exampleVolume = new azure.netapp.Volume("example", {
 *     name: "example-netappvolume",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     accountName: exampleAccount.name,
 *     poolName: examplePool.name,
 *     volumePath: "my-unique-file-path",
 *     serviceLevel: "Premium",
 *     subnetId: exampleSubnet.id,
 *     storageQuotaInGb: 100,
 * });
 * const exampleSnapshot = new azure.netapp.Snapshot("example", {
 *     name: "example-netappsnapshot",
 *     accountName: exampleAccount.name,
 *     poolName: examplePool.name,
 *     volumeName: exampleVolume.name,
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
 * * `Microsoft.NetApp`: 2025-01-01
 *
 * ## Import
 *
 * NetApp Snapshot can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:netapp/snapshot:Snapshot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1/snapshots/snapshot1
 * ```
 */
export class Snapshot extends pulumi.CustomResource {
    /**
     * Get an existing Snapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotState, opts?: pulumi.CustomResourceOptions): Snapshot {
        return new Snapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:netapp/snapshot:Snapshot';

    /**
     * Returns true if the given object is an instance of Snapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Snapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Snapshot.__pulumiType;
    }

    /**
     * The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the NetApp Snapshot. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
     */
    public readonly poolName!: pulumi.Output<string>;
    /**
     * The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    public readonly volumeName!: pulumi.Output<string>;

    /**
     * Create a Snapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotArgs | SnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotState | undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["poolName"] = state ? state.poolName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["volumeName"] = state ? state.volumeName : undefined;
        } else {
            const args = argsOrState as SnapshotArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.poolName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'poolName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.volumeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'volumeName'");
            }
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["poolName"] = args ? args.poolName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["volumeName"] = args ? args.volumeName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Snapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Snapshot resources.
 */
export interface SnapshotState {
    /**
     * The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the NetApp Snapshot. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
     */
    poolName?: pulumi.Input<string>;
    /**
     * The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    volumeName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Snapshot resource.
 */
export interface SnapshotArgs {
    /**
     * The name of the NetApp account in which the NetApp Pool should be created. Changing this forces a new resource to be created.
     */
    accountName: pulumi.Input<string>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the NetApp Snapshot. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the NetApp pool in which the NetApp Volume should be created. Changing this forces a new resource to be created.
     */
    poolName: pulumi.Input<string>;
    /**
     * The name of the resource group where the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The name of the NetApp volume in which the NetApp Snapshot should be created. Changing this forces a new resource to be created.
     */
    volumeName: pulumi.Input<string>;
}
