// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Synapse Azure Integration Runtime.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example",
 *     location: "West Europe",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "example",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "content",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "private",
 * });
 * const exampleDataLakeGen2Filesystem = new azure.storage.DataLakeGen2Filesystem("example", {
 *     name: "example",
 *     storageAccountId: exampleAccount.id,
 * });
 * const exampleWorkspace = new azure.synapse.Workspace("example", {
 *     name: "example",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     storageDataLakeGen2FilesystemId: exampleDataLakeGen2Filesystem.id,
 *     sqlAdministratorLogin: "sqladminuser",
 *     sqlAdministratorLoginPassword: "H@Sh1CoR3!",
 *     managedVirtualNetworkEnabled: true,
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 * });
 * const exampleFirewallRule = new azure.synapse.FirewallRule("example", {
 *     name: "AllowAll",
 *     synapseWorkspaceId: exampleWorkspace.id,
 *     startIpAddress: "0.0.0.0",
 *     endIpAddress: "255.255.255.255",
 * });
 * const exampleIntegrationRuntimeAzure = new azure.synapse.IntegrationRuntimeAzure("example", {
 *     name: "example",
 *     synapseWorkspaceId: exampleWorkspace.id,
 *     location: example.location,
 * });
 * ```
 *
 * ## Import
 *
 * Synapse Azure Integration Runtimes can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationRuntimes/IntegrationRuntime1
 * ```
 */
export class IntegrationRuntimeAzure extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationRuntimeAzure resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationRuntimeAzureState, opts?: pulumi.CustomResourceOptions): IntegrationRuntimeAzure {
        return new IntegrationRuntimeAzure(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:synapse/integrationRuntimeAzure:IntegrationRuntimeAzure';

    /**
     * Returns true if the given object is an instance of IntegrationRuntimeAzure.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationRuntimeAzure {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationRuntimeAzure.__pulumiType;
    }

    /**
     * Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
     */
    public readonly computeType!: pulumi.Output<string | undefined>;
    /**
     * Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
     */
    public readonly coreCount!: pulumi.Output<number | undefined>;
    /**
     * Integration runtime description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    public readonly synapseWorkspaceId!: pulumi.Output<string>;
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
     */
    public readonly timeToLiveMin!: pulumi.Output<number | undefined>;

    /**
     * Create a IntegrationRuntimeAzure resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationRuntimeAzureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationRuntimeAzureArgs | IntegrationRuntimeAzureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationRuntimeAzureState | undefined;
            resourceInputs["computeType"] = state ? state.computeType : undefined;
            resourceInputs["coreCount"] = state ? state.coreCount : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["synapseWorkspaceId"] = state ? state.synapseWorkspaceId : undefined;
            resourceInputs["timeToLiveMin"] = state ? state.timeToLiveMin : undefined;
        } else {
            const args = argsOrState as IntegrationRuntimeAzureArgs | undefined;
            if ((!args || args.synapseWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'synapseWorkspaceId'");
            }
            resourceInputs["computeType"] = args ? args.computeType : undefined;
            resourceInputs["coreCount"] = args ? args.coreCount : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["synapseWorkspaceId"] = args ? args.synapseWorkspaceId : undefined;
            resourceInputs["timeToLiveMin"] = args ? args.timeToLiveMin : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationRuntimeAzure.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationRuntimeAzure resources.
 */
export interface IntegrationRuntimeAzureState {
    /**
     * Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
     */
    computeType?: pulumi.Input<string>;
    /**
     * Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
     */
    coreCount?: pulumi.Input<number>;
    /**
     * Integration runtime description.
     */
    description?: pulumi.Input<string>;
    /**
     * The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    synapseWorkspaceId?: pulumi.Input<string>;
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
     */
    timeToLiveMin?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a IntegrationRuntimeAzure resource.
 */
export interface IntegrationRuntimeAzureArgs {
    /**
     * Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
     */
    computeType?: pulumi.Input<string>;
    /**
     * Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
     */
    coreCount?: pulumi.Input<number>;
    /**
     * Integration runtime description.
     */
    description?: pulumi.Input<string>;
    /**
     * The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
     */
    synapseWorkspaceId: pulumi.Input<string>;
    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
     */
    timeToLiveMin?: pulumi.Input<number>;
}
