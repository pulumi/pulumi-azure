// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a PostgreSQL Virtual Network Rule.
 *
 * > **Note:** PostgreSQL Virtual Network Rules [can only be used with SKU Tiers of `GeneralPurpose` or `MemoryOptimized`](https://docs.microsoft.com/azure/postgresql/concepts-data-access-and-security-vnet)
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
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example-vnet",
 *     addressSpaces: ["10.7.29.0/29"],
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const internal = new azure.network.Subnet("internal", {
 *     name: "internal",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.7.29.0/29"],
 *     serviceEndpoints: ["Microsoft.Sql"],
 * });
 * const exampleServer = new azure.postgresql.Server("example", {
 *     name: "postgresql-server-1",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "GP_Gen5_2",
 *     storageMb: 5120,
 *     backupRetentionDays: 7,
 *     administratorLogin: "psqladmin",
 *     administratorLoginPassword: "H@Sh1CoR3!",
 *     version: "9.5",
 *     sslEnforcementEnabled: true,
 * });
 * const exampleVirtualNetworkRule = new azure.postgresql.VirtualNetworkRule("example", {
 *     name: "postgresql-vnet-rule",
 *     resourceGroupName: example.name,
 *     serverName: exampleServer.name,
 *     subnetId: internal.id,
 *     ignoreMissingVnetServiceEndpoint: true,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.DBforPostgreSQL`: 2017-12-01
 *
 * ## Import
 *
 * PostgreSQL Virtual Network Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:postgresql/virtualNetworkRule:VirtualNetworkRule rule1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.DBforPostgreSQL/servers/myserver/virtualNetworkRules/vnetrulename
 * ```
 */
export class VirtualNetworkRule extends pulumi.CustomResource {
    /**
     * Get an existing VirtualNetworkRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions): VirtualNetworkRule {
        return new VirtualNetworkRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:postgresql/virtualNetworkRule:VirtualNetworkRule';

    /**
     * Returns true if the given object is an instance of VirtualNetworkRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualNetworkRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualNetworkRule.__pulumiType;
    }

    /**
     * Should the Virtual Network Rule be created before the Subnet has the Virtual Network Service Endpoint enabled?
     */
    public readonly ignoreMissingVnetServiceEndpoint!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the PostgreSQL virtual network rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **Note:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group where the PostgreSQL server resides. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The name of the SQL Server to which this PostgreSQL virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    public readonly serverName!: pulumi.Output<string>;
    /**
     * The ID of the subnet that the PostgreSQL server will be connected to.
     */
    public readonly subnetId!: pulumi.Output<string>;

    /**
     * Create a VirtualNetworkRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualNetworkRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualNetworkRuleArgs | VirtualNetworkRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualNetworkRuleState | undefined;
            resourceInputs["ignoreMissingVnetServiceEndpoint"] = state ? state.ignoreMissingVnetServiceEndpoint : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serverName"] = state ? state.serverName : undefined;
            resourceInputs["subnetId"] = state ? state.subnetId : undefined;
        } else {
            const args = argsOrState as VirtualNetworkRuleArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serverName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverName'");
            }
            if ((!args || args.subnetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetId'");
            }
            resourceInputs["ignoreMissingVnetServiceEndpoint"] = args ? args.ignoreMissingVnetServiceEndpoint : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serverName"] = args ? args.serverName : undefined;
            resourceInputs["subnetId"] = args ? args.subnetId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualNetworkRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualNetworkRule resources.
 */
export interface VirtualNetworkRuleState {
    /**
     * Should the Virtual Network Rule be created before the Subnet has the Virtual Network Service Endpoint enabled?
     */
    ignoreMissingVnetServiceEndpoint?: pulumi.Input<boolean>;
    /**
     * The name of the PostgreSQL virtual network rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **Note:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the PostgreSQL server resides. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The name of the SQL Server to which this PostgreSQL virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    serverName?: pulumi.Input<string>;
    /**
     * The ID of the subnet that the PostgreSQL server will be connected to.
     */
    subnetId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VirtualNetworkRule resource.
 */
export interface VirtualNetworkRuleArgs {
    /**
     * Should the Virtual Network Rule be created before the Subnet has the Virtual Network Service Endpoint enabled?
     */
    ignoreMissingVnetServiceEndpoint?: pulumi.Input<boolean>;
    /**
     * The name of the PostgreSQL virtual network rule. Cannot be empty and must only contain alphanumeric characters and hyphens. Cannot start with a number, and cannot start or end with a hyphen. Changing this forces a new resource to be created.
     *
     * > **Note:** `name` must be between 1-128 characters long and must satisfy all of the requirements below:
     *
     * 1. Contains only alphanumeric and hyphen characters
     * 2. Cannot start with a number or hyphen
     * 3. Cannot end with a hyphen
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the PostgreSQL server resides. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The name of the SQL Server to which this PostgreSQL virtual network rule will be applied to. Changing this forces a new resource to be created.
     */
    serverName: pulumi.Input<string>;
    /**
     * The ID of the subnet that the PostgreSQL server will be connected to.
     */
    subnetId: pulumi.Input<string>;
}
