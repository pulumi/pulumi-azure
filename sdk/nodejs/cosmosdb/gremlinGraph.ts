// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Gremlin Graph within a Cosmos DB Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.cosmosdb.getAccount({
 *     name: "tfex-cosmosdb-account",
 *     resourceGroupName: "tfex-cosmosdb-account-rg",
 * });
 * const exampleGremlinDatabase = new azure.cosmosdb.GremlinDatabase("example", {
 *     name: "tfex-cosmos-gremlin-db",
 *     resourceGroupName: example.then(example => example.resourceGroupName),
 *     accountName: example.then(example => example.name),
 * });
 * const exampleGremlinGraph = new azure.cosmosdb.GremlinGraph("example", {
 *     name: "tfex-cosmos-gremlin-graph",
 *     resourceGroupName: example.then(example => example.resourceGroupName),
 *     accountName: example.then(example => example.name),
 *     databaseName: exampleGremlinDatabase.name,
 *     partitionKeyPath: "/Example",
 *     throughput: 400,
 *     indexPolicy: {
 *         automatic: true,
 *         indexingMode: "consistent",
 *         includedPaths: ["/*"],
 *         excludedPaths: ["/\"_etag\"/?"],
 *     },
 *     conflictResolutionPolicy: {
 *         mode: "LastWriterWins",
 *         conflictResolutionPath: "/_ts",
 *     },
 *     uniqueKeys: [{
 *         paths: [
 *             "/definition/id1",
 *             "/definition/id2",
 *         ],
 *     }],
 * });
 * ```
 *
 * > **Note:** The CosmosDB Account needs to have the `EnableGremlin` capability enabled to use this resource - which can be done by adding this to the `capabilities` list within the `azure.cosmosdb.Account` resource.
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DocumentDB`: 2024-08-15
 *
 * ## Import
 *
 * Cosmos Gremlin Graphs can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:cosmosdb/gremlinGraph:GremlinGraph example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/gremlinDatabases/db1/graphs/graphs1
 * ```
 */
export class GremlinGraph extends pulumi.CustomResource {
    /**
     * Get an existing GremlinGraph resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GremlinGraphState, opts?: pulumi.CustomResourceOptions): GremlinGraph {
        return new GremlinGraph(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cosmosdb/gremlinGraph:GremlinGraph';

    /**
     * Returns true if the given object is an instance of GremlinGraph.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GremlinGraph {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GremlinGraph.__pulumiType;
    }

    /**
     * The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
     *
     * > **Note:** Disabling `analyticalStorageTtl` will force a new resource to be created since it can't be disabled once it's enabled.
     */
    public readonly analyticalStorageTtl!: pulumi.Output<number | undefined>;
    public readonly autoscaleSettings!: pulumi.Output<outputs.cosmosdb.GremlinGraphAutoscaleSettings | undefined>;
    /**
     * A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     */
    public readonly conflictResolutionPolicy!: pulumi.Output<outputs.cosmosdb.GremlinGraphConflictResolutionPolicy>;
    /**
     * The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * The default time to live (TTL) of the Gremlin graph. If the value is missing or set to "-1", items don’t expire.
     */
    public readonly defaultTtl!: pulumi.Output<number | undefined>;
    /**
     * The configuration of the indexing policy. One or more `indexPolicy` blocks as defined below.
     */
    public readonly indexPolicy!: pulumi.Output<outputs.cosmosdb.GremlinGraphIndexPolicy>;
    /**
     * Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Define a partition key. Changing this forces a new resource to be created.
     */
    public readonly partitionKeyPath!: pulumi.Output<string>;
    /**
     * Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     */
    public readonly partitionKeyVersion!: pulumi.Output<number | undefined>;
    /**
     * The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     */
    public readonly throughput!: pulumi.Output<number>;
    /**
     * One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     */
    public readonly uniqueKeys!: pulumi.Output<outputs.cosmosdb.GremlinGraphUniqueKey[] | undefined>;

    /**
     * Create a GremlinGraph resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GremlinGraphArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GremlinGraphArgs | GremlinGraphState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GremlinGraphState | undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["analyticalStorageTtl"] = state ? state.analyticalStorageTtl : undefined;
            resourceInputs["autoscaleSettings"] = state ? state.autoscaleSettings : undefined;
            resourceInputs["conflictResolutionPolicy"] = state ? state.conflictResolutionPolicy : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["defaultTtl"] = state ? state.defaultTtl : undefined;
            resourceInputs["indexPolicy"] = state ? state.indexPolicy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partitionKeyPath"] = state ? state.partitionKeyPath : undefined;
            resourceInputs["partitionKeyVersion"] = state ? state.partitionKeyVersion : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["throughput"] = state ? state.throughput : undefined;
            resourceInputs["uniqueKeys"] = state ? state.uniqueKeys : undefined;
        } else {
            const args = argsOrState as GremlinGraphArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.partitionKeyPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'partitionKeyPath'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["analyticalStorageTtl"] = args ? args.analyticalStorageTtl : undefined;
            resourceInputs["autoscaleSettings"] = args ? args.autoscaleSettings : undefined;
            resourceInputs["conflictResolutionPolicy"] = args ? args.conflictResolutionPolicy : undefined;
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["defaultTtl"] = args ? args.defaultTtl : undefined;
            resourceInputs["indexPolicy"] = args ? args.indexPolicy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionKeyPath"] = args ? args.partitionKeyPath : undefined;
            resourceInputs["partitionKeyVersion"] = args ? args.partitionKeyVersion : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["throughput"] = args ? args.throughput : undefined;
            resourceInputs["uniqueKeys"] = args ? args.uniqueKeys : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GremlinGraph.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GremlinGraph resources.
 */
export interface GremlinGraphState {
    /**
     * The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
     */
    accountName?: pulumi.Input<string>;
    /**
     * The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
     *
     * > **Note:** Disabling `analyticalStorageTtl` will force a new resource to be created since it can't be disabled once it's enabled.
     */
    analyticalStorageTtl?: pulumi.Input<number>;
    autoscaleSettings?: pulumi.Input<inputs.cosmosdb.GremlinGraphAutoscaleSettings>;
    /**
     * A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     */
    conflictResolutionPolicy?: pulumi.Input<inputs.cosmosdb.GremlinGraphConflictResolutionPolicy>;
    /**
     * The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * The default time to live (TTL) of the Gremlin graph. If the value is missing or set to "-1", items don’t expire.
     */
    defaultTtl?: pulumi.Input<number>;
    /**
     * The configuration of the indexing policy. One or more `indexPolicy` blocks as defined below.
     */
    indexPolicy?: pulumi.Input<inputs.cosmosdb.GremlinGraphIndexPolicy>;
    /**
     * Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Define a partition key. Changing this forces a new resource to be created.
     */
    partitionKeyPath?: pulumi.Input<string>;
    /**
     * Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     */
    partitionKeyVersion?: pulumi.Input<number>;
    /**
     * The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     */
    throughput?: pulumi.Input<number>;
    /**
     * One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     */
    uniqueKeys?: pulumi.Input<pulumi.Input<inputs.cosmosdb.GremlinGraphUniqueKey>[]>;
}

/**
 * The set of arguments for constructing a GremlinGraph resource.
 */
export interface GremlinGraphArgs {
    /**
     * The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
     */
    accountName: pulumi.Input<string>;
    /**
     * The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
     *
     * > **Note:** Disabling `analyticalStorageTtl` will force a new resource to be created since it can't be disabled once it's enabled.
     */
    analyticalStorageTtl?: pulumi.Input<number>;
    autoscaleSettings?: pulumi.Input<inputs.cosmosdb.GremlinGraphAutoscaleSettings>;
    /**
     * A `conflictResolutionPolicy` blocks as defined below. Changing this forces a new resource to be created.
     */
    conflictResolutionPolicy?: pulumi.Input<inputs.cosmosdb.GremlinGraphConflictResolutionPolicy>;
    /**
     * The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    databaseName: pulumi.Input<string>;
    /**
     * The default time to live (TTL) of the Gremlin graph. If the value is missing or set to "-1", items don’t expire.
     */
    defaultTtl?: pulumi.Input<number>;
    /**
     * The configuration of the indexing policy. One or more `indexPolicy` blocks as defined below.
     */
    indexPolicy?: pulumi.Input<inputs.cosmosdb.GremlinGraphIndexPolicy>;
    /**
     * Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Define a partition key. Changing this forces a new resource to be created.
     */
    partitionKeyPath: pulumi.Input<string>;
    /**
     * Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     */
    partitionKeyVersion?: pulumi.Input<number>;
    /**
     * The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     */
    throughput?: pulumi.Input<number>;
    /**
     * One or more `uniqueKey` blocks as defined below. Changing this forces a new resource to be created.
     */
    uniqueKeys?: pulumi.Input<pulumi.Input<inputs.cosmosdb.GremlinGraphUniqueKey>[]>;
}
