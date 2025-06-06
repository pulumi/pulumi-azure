// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Redis Enterprise Database.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-redisenterprise",
 *     location: "West Europe",
 * });
 * const exampleEnterpriseCluster = new azure.redis.EnterpriseCluster("example", {
 *     name: "example-redisenterprise",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     skuName: "Enterprise_E20-4",
 * });
 * const example1 = new azure.redis.EnterpriseCluster("example1", {
 *     name: "example-redisenterprise1",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     skuName: "Enterprise_E20-4",
 * });
 * const exampleEnterpriseDatabase = new azure.redis.EnterpriseDatabase("example", {
 *     name: "default",
 *     clusterId: exampleEnterpriseCluster.id,
 *     clientProtocol: "Encrypted",
 *     clusteringPolicy: "EnterpriseCluster",
 *     evictionPolicy: "NoEviction",
 *     port: 10000,
 *     linkedDatabaseIds: [
 *         pulumi.interpolate`${exampleEnterpriseCluster.id}/databases/default`,
 *         pulumi.interpolate`${example1.id}/databases/default`,
 *     ],
 *     linkedDatabaseGroupNickname: "tftestGeoGroup",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Cache`: 2024-10-01
 *
 * ## Import
 *
 * Redis Enterprise Databases can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:redis/enterpriseDatabase:EnterpriseDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redisEnterprise/cluster1/databases/database1
 * ```
 */
export class EnterpriseDatabase extends pulumi.CustomResource {
    /**
     * Get an existing EnterpriseDatabase resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnterpriseDatabaseState, opts?: pulumi.CustomResourceOptions): EnterpriseDatabase {
        return new EnterpriseDatabase(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:redis/enterpriseDatabase:EnterpriseDatabase';

    /**
     * Returns true if the given object is an instance of EnterpriseDatabase.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnterpriseDatabase {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnterpriseDatabase.__pulumiType;
    }

    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     */
    public readonly clientProtocol!: pulumi.Output<string | undefined>;
    /**
     * The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * Clustering policy Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     */
    public readonly clusteringPolicy!: pulumi.Output<string | undefined>;
    /**
     * Redis eviction policy possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created. Defaults to `VolatileLRU`.
     */
    public readonly evictionPolicy!: pulumi.Output<string | undefined>;
    /**
     * Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     */
    public readonly linkedDatabaseGroupNickname!: pulumi.Output<string | undefined>;
    /**
     * A list of database resources to link with this database with a maximum of 5.
     *
     * > **Note:** Only the newly created databases can be added to an existing geo-replication group. Existing regular databases or recreated databases cannot be added to the existing geo-replication group. Any linked database be removed from the list will be forcefully unlinked.The only recommended operation is to delete after force-unlink and the recommended scenario of force-unlink is region outrage. The database cannot be linked again after force-unlink.
     */
    public readonly linkedDatabaseIds!: pulumi.Output<string[] | undefined>;
    /**
     * A `module` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     */
    public readonly modules!: pulumi.Output<outputs.redis.EnterpriseDatabaseModule[] | undefined>;
    /**
     * The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created. Defaults to `10000`.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The Primary Access Key for the Redis Enterprise Database Instance.
     */
    public /*out*/ readonly primaryAccessKey!: pulumi.Output<string>;
    /**
     * The Secondary Access Key for the Redis Enterprise Database Instance.
     */
    public /*out*/ readonly secondaryAccessKey!: pulumi.Output<string>;

    /**
     * Create a EnterpriseDatabase resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnterpriseDatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnterpriseDatabaseArgs | EnterpriseDatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnterpriseDatabaseState | undefined;
            resourceInputs["clientProtocol"] = state ? state.clientProtocol : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusteringPolicy"] = state ? state.clusteringPolicy : undefined;
            resourceInputs["evictionPolicy"] = state ? state.evictionPolicy : undefined;
            resourceInputs["linkedDatabaseGroupNickname"] = state ? state.linkedDatabaseGroupNickname : undefined;
            resourceInputs["linkedDatabaseIds"] = state ? state.linkedDatabaseIds : undefined;
            resourceInputs["modules"] = state ? state.modules : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["primaryAccessKey"] = state ? state.primaryAccessKey : undefined;
            resourceInputs["secondaryAccessKey"] = state ? state.secondaryAccessKey : undefined;
        } else {
            const args = argsOrState as EnterpriseDatabaseArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            resourceInputs["clientProtocol"] = args ? args.clientProtocol : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusteringPolicy"] = args ? args.clusteringPolicy : undefined;
            resourceInputs["evictionPolicy"] = args ? args.evictionPolicy : undefined;
            resourceInputs["linkedDatabaseGroupNickname"] = args ? args.linkedDatabaseGroupNickname : undefined;
            resourceInputs["linkedDatabaseIds"] = args ? args.linkedDatabaseIds : undefined;
            resourceInputs["modules"] = args ? args.modules : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["primaryAccessKey"] = undefined /*out*/;
            resourceInputs["secondaryAccessKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["primaryAccessKey", "secondaryAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(EnterpriseDatabase.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnterpriseDatabase resources.
 */
export interface EnterpriseDatabaseState {
    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     */
    clientProtocol?: pulumi.Input<string>;
    /**
     * The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Clustering policy Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     */
    clusteringPolicy?: pulumi.Input<string>;
    /**
     * Redis eviction policy possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created. Defaults to `VolatileLRU`.
     */
    evictionPolicy?: pulumi.Input<string>;
    /**
     * Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     */
    linkedDatabaseGroupNickname?: pulumi.Input<string>;
    /**
     * A list of database resources to link with this database with a maximum of 5.
     *
     * > **Note:** Only the newly created databases can be added to an existing geo-replication group. Existing regular databases or recreated databases cannot be added to the existing geo-replication group. Any linked database be removed from the list will be forcefully unlinked.The only recommended operation is to delete after force-unlink and the recommended scenario of force-unlink is region outrage. The database cannot be linked again after force-unlink.
     */
    linkedDatabaseIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A `module` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     */
    modules?: pulumi.Input<pulumi.Input<inputs.redis.EnterpriseDatabaseModule>[]>;
    /**
     * The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created. Defaults to `10000`.
     */
    port?: pulumi.Input<number>;
    /**
     * The Primary Access Key for the Redis Enterprise Database Instance.
     */
    primaryAccessKey?: pulumi.Input<string>;
    /**
     * The Secondary Access Key for the Redis Enterprise Database Instance.
     */
    secondaryAccessKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnterpriseDatabase resource.
 */
export interface EnterpriseDatabaseArgs {
    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     */
    clientProtocol?: pulumi.Input<string>;
    /**
     * The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     */
    clusterId: pulumi.Input<string>;
    /**
     * Clustering policy Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     */
    clusteringPolicy?: pulumi.Input<string>;
    /**
     * Redis eviction policy possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created. Defaults to `VolatileLRU`.
     */
    evictionPolicy?: pulumi.Input<string>;
    /**
     * Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     */
    linkedDatabaseGroupNickname?: pulumi.Input<string>;
    /**
     * A list of database resources to link with this database with a maximum of 5.
     *
     * > **Note:** Only the newly created databases can be added to an existing geo-replication group. Existing regular databases or recreated databases cannot be added to the existing geo-replication group. Any linked database be removed from the list will be forcefully unlinked.The only recommended operation is to delete after force-unlink and the recommended scenario of force-unlink is region outrage. The database cannot be linked again after force-unlink.
     */
    linkedDatabaseIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A `module` block as defined below. Changing this forces a new resource to be created.
     *
     * > **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     */
    modules?: pulumi.Input<pulumi.Input<inputs.redis.EnterpriseDatabaseModule>[]>;
    /**
     * The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created. Defaults to `10000`.
     */
    port?: pulumi.Input<number>;
}
