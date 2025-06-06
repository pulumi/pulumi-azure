// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Azure Cosmos DB for PostgreSQL Firewall Rule.
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
 * const examplePostgresqlCluster = new azure.cosmosdb.PostgresqlCluster("example", {
 *     name: "examplecluster",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     administratorLoginPassword: "H@Sh1CoR3!",
 *     coordinatorStorageQuotaInMb: 131072,
 *     coordinatorVcoreCount: 2,
 *     nodeCount: 0,
 * });
 * const examplePostgresqlFirewallRule = new azure.cosmosdb.PostgresqlFirewallRule("example", {
 *     name: "example-firewallrule",
 *     clusterId: examplePostgresqlCluster.id,
 *     startIpAddress: "10.0.17.62",
 *     endIpAddress: "10.0.17.64",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DBforPostgreSQL`: 2022-11-08
 *
 * ## Import
 *
 * Azure Cosmos DB for PostgreSQL Firewall Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:cosmosdb/postgresqlFirewallRule:PostgresqlFirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/cluster1/firewallRules/firewallRule1
 * ```
 */
export class PostgresqlFirewallRule extends pulumi.CustomResource {
    /**
     * Get an existing PostgresqlFirewallRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PostgresqlFirewallRuleState, opts?: pulumi.CustomResourceOptions): PostgresqlFirewallRule {
        return new PostgresqlFirewallRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cosmosdb/postgresqlFirewallRule:PostgresqlFirewallRule';

    /**
     * Returns true if the given object is an instance of PostgresqlFirewallRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PostgresqlFirewallRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PostgresqlFirewallRule.__pulumiType;
    }

    /**
     * The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    public readonly endIpAddress!: pulumi.Output<string>;
    /**
     * The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    public readonly startIpAddress!: pulumi.Output<string>;

    /**
     * Create a PostgresqlFirewallRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PostgresqlFirewallRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PostgresqlFirewallRuleArgs | PostgresqlFirewallRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PostgresqlFirewallRuleState | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["endIpAddress"] = state ? state.endIpAddress : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["startIpAddress"] = state ? state.startIpAddress : undefined;
        } else {
            const args = argsOrState as PostgresqlFirewallRuleArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.endIpAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endIpAddress'");
            }
            if ((!args || args.startIpAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'startIpAddress'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["endIpAddress"] = args ? args.endIpAddress : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["startIpAddress"] = args ? args.startIpAddress : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PostgresqlFirewallRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PostgresqlFirewallRule resources.
 */
export interface PostgresqlFirewallRuleState {
    /**
     * The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    endIpAddress?: pulumi.Input<string>;
    /**
     * The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    startIpAddress?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PostgresqlFirewallRule resource.
 */
export interface PostgresqlFirewallRuleArgs {
    /**
     * The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The end IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    endIpAddress: pulumi.Input<string>;
    /**
     * The name which should be used for the Azure Cosmos DB for PostgreSQL Firewall Rule. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The start IP address of the Azure Cosmos DB for PostgreSQL Firewall Rule.
     */
    startIpAddress: pulumi.Input<string>;
}
