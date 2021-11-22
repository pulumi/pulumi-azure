// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Cassandra Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     addressSpaces: ["10.0.0.0/16"],
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.1.0/24"],
 * });
 * const exampleAssignment = new azure.authorization.Assignment("exampleAssignment", {
 *     scope: exampleVirtualNetwork.id,
 *     roleDefinitionName: "Network Contributor",
 *     principalId: "e5007d2c-4b13-4a74-9b6a-605d99f03501",
 * });
 * const exampleCassandraCluster = new azure.cosmosdb.CassandraCluster("exampleCassandraCluster", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     delegatedManagementSubnetId: exampleSubnet.id,
 *     defaultAdminPassword: "Password1234",
 * });
 * ```
 *
 * ## Import
 *
 * Cassandra Clusters can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:cosmosdb/cassandraCluster:CassandraCluster example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1
 * ```
 */
export class CassandraCluster extends pulumi.CustomResource {
    /**
     * Get an existing CassandraCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CassandraClusterState, opts?: pulumi.CustomResourceOptions): CassandraCluster {
        return new CassandraCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cosmosdb/cassandraCluster:CassandraCluster';

    /**
     * Returns true if the given object is an instance of CassandraCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CassandraCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CassandraCluster.__pulumiType;
    }

    /**
     * The initial admin password for this Cassandra Cluster.
     */
    public readonly defaultAdminPassword!: pulumi.Output<string>;
    /**
     * The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    public readonly delegatedManagementSubnetId!: pulumi.Output<string>;
    /**
     * The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;

    /**
     * Create a CassandraCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CassandraClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CassandraClusterArgs | CassandraClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CassandraClusterState | undefined;
            inputs["defaultAdminPassword"] = state ? state.defaultAdminPassword : undefined;
            inputs["delegatedManagementSubnetId"] = state ? state.delegatedManagementSubnetId : undefined;
            inputs["location"] = state ? state.location : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
        } else {
            const args = argsOrState as CassandraClusterArgs | undefined;
            if ((!args || args.defaultAdminPassword === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultAdminPassword'");
            }
            if ((!args || args.delegatedManagementSubnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'delegatedManagementSubnetId'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            inputs["defaultAdminPassword"] = args ? args.defaultAdminPassword : undefined;
            inputs["delegatedManagementSubnetId"] = args ? args.delegatedManagementSubnetId : undefined;
            inputs["location"] = args ? args.location : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(CassandraCluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CassandraCluster resources.
 */
export interface CassandraClusterState {
    /**
     * The initial admin password for this Cassandra Cluster.
     */
    defaultAdminPassword?: pulumi.Input<string>;
    /**
     * The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    delegatedManagementSubnetId?: pulumi.Input<string>;
    /**
     * The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CassandraCluster resource.
 */
export interface CassandraClusterArgs {
    /**
     * The initial admin password for this Cassandra Cluster.
     */
    defaultAdminPassword: pulumi.Input<string>;
    /**
     * The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    delegatedManagementSubnetId: pulumi.Input<string>;
    /**
     * The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
     */
    resourceGroupName: pulumi.Input<string>;
}