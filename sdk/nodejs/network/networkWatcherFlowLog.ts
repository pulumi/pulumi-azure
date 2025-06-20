// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Network Watcher Flow Log.
 *
 * > **Note:** The `azure.network.NetworkWatcherFlowLog` creates a new storage lifecyle management rule that overwrites existing rules. Please make sure to use a `storageAccount` with no existing management rules, until the issue is fixed.
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
 * const test = new azure.network.NetworkSecurityGroup("test", {
 *     name: "acctestnsg",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const testNetworkWatcher = new azure.network.NetworkWatcher("test", {
 *     name: "acctestnw",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const testAccount = new azure.storage.Account("test", {
 *     name: "acctestsa",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountKind: "StorageV2",
 *     accountReplicationType: "LRS",
 *     httpsTrafficOnlyEnabled: true,
 * });
 * const testAnalyticsWorkspace = new azure.operationalinsights.AnalyticsWorkspace("test", {
 *     name: "acctestlaw",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "PerGB2018",
 * });
 * const testNetworkWatcherFlowLog = new azure.network.NetworkWatcherFlowLog("test", {
 *     networkWatcherName: testNetworkWatcher.name,
 *     resourceGroupName: example.name,
 *     name: "example-log",
 *     targetResourceId: test.id,
 *     storageAccountId: testAccount.id,
 *     enabled: true,
 *     retentionPolicy: {
 *         enabled: true,
 *         days: 7,
 *     },
 *     trafficAnalytics: {
 *         enabled: true,
 *         workspaceId: testAnalyticsWorkspace.workspaceId,
 *         workspaceRegion: testAnalyticsWorkspace.location,
 *         workspaceResourceId: testAnalyticsWorkspace.id,
 *         intervalInMinutes: 10,
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 *
 * ## Import
 *
 * Network Watcher Flow Logs can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:network/networkWatcherFlowLog:NetworkWatcherFlowLog watcher1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/flowLogs/log1
 * ```
 */
export class NetworkWatcherFlowLog extends pulumi.CustomResource {
    /**
     * Get an existing NetworkWatcherFlowLog resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkWatcherFlowLogState, opts?: pulumi.CustomResourceOptions): NetworkWatcherFlowLog {
        return new NetworkWatcherFlowLog(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:network/networkWatcherFlowLog:NetworkWatcherFlowLog';

    /**
     * Returns true if the given object is an instance of NetworkWatcherFlowLog.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkWatcherFlowLog {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkWatcherFlowLog.__pulumiType;
    }

    /**
     * Should Network Flow Logging be Enabled?
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * @deprecated The property `networkSecurityGroupId` has been superseded by `targetResourceId` and will be removed in version 5.0 of the AzureRM Provider.
     */
    public readonly networkSecurityGroupId!: pulumi.Output<string>;
    /**
     * The name of the Network Watcher. Changing this forces a new resource to be created.
     */
    public readonly networkWatcherName!: pulumi.Output<string>;
    /**
     * The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `retentionPolicy` block as documented below.
     */
    public readonly retentionPolicy!: pulumi.Output<outputs.network.NetworkWatcherFlowLogRetentionPolicy>;
    /**
     * The ID of the Storage Account where flow logs are stored.
     */
    public readonly storageAccountId!: pulumi.Output<string>;
    /**
     * A mapping of tags which should be assigned to the Network Watcher Flow Log.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The ID of the Resource for which to enable flow logs for. Changing this forces a new resource to be created.
     */
    public readonly targetResourceId!: pulumi.Output<string>;
    /**
     * A `trafficAnalytics` block as documented below.
     */
    public readonly trafficAnalytics!: pulumi.Output<outputs.network.NetworkWatcherFlowLogTrafficAnalytics | undefined>;
    /**
     * The version (revision) of the flow log. Possible values are `1` and `2`. Defaults to `1`.
     */
    public readonly version!: pulumi.Output<number | undefined>;

    /**
     * Create a NetworkWatcherFlowLog resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkWatcherFlowLogArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkWatcherFlowLogArgs | NetworkWatcherFlowLogState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkWatcherFlowLogState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkSecurityGroupId"] = state ? state.networkSecurityGroupId : undefined;
            resourceInputs["networkWatcherName"] = state ? state.networkWatcherName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["retentionPolicy"] = state ? state.retentionPolicy : undefined;
            resourceInputs["storageAccountId"] = state ? state.storageAccountId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
            resourceInputs["trafficAnalytics"] = state ? state.trafficAnalytics : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as NetworkWatcherFlowLogArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.networkWatcherName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkWatcherName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.retentionPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retentionPolicy'");
            }
            if ((!args || args.storageAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkSecurityGroupId"] = args ? args.networkSecurityGroupId : undefined;
            resourceInputs["networkWatcherName"] = args ? args.networkWatcherName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["retentionPolicy"] = args ? args.retentionPolicy : undefined;
            resourceInputs["storageAccountId"] = args ? args.storageAccountId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
            resourceInputs["trafficAnalytics"] = args ? args.trafficAnalytics : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkWatcherFlowLog.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkWatcherFlowLog resources.
 */
export interface NetworkWatcherFlowLogState {
    /**
     * Should Network Flow Logging be Enabled?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * @deprecated The property `networkSecurityGroupId` has been superseded by `targetResourceId` and will be removed in version 5.0 of the AzureRM Provider.
     */
    networkSecurityGroupId?: pulumi.Input<string>;
    /**
     * The name of the Network Watcher. Changing this forces a new resource to be created.
     */
    networkWatcherName?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `retentionPolicy` block as documented below.
     */
    retentionPolicy?: pulumi.Input<inputs.network.NetworkWatcherFlowLogRetentionPolicy>;
    /**
     * The ID of the Storage Account where flow logs are stored.
     */
    storageAccountId?: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Network Watcher Flow Log.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the Resource for which to enable flow logs for. Changing this forces a new resource to be created.
     */
    targetResourceId?: pulumi.Input<string>;
    /**
     * A `trafficAnalytics` block as documented below.
     */
    trafficAnalytics?: pulumi.Input<inputs.network.NetworkWatcherFlowLogTrafficAnalytics>;
    /**
     * The version (revision) of the flow log. Possible values are `1` and `2`. Defaults to `1`.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a NetworkWatcherFlowLog resource.
 */
export interface NetworkWatcherFlowLogArgs {
    /**
     * Should Network Flow Logging be Enabled?
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * @deprecated The property `networkSecurityGroupId` has been superseded by `targetResourceId` and will be removed in version 5.0 of the AzureRM Provider.
     */
    networkSecurityGroupId?: pulumi.Input<string>;
    /**
     * The name of the Network Watcher. Changing this forces a new resource to be created.
     */
    networkWatcherName: pulumi.Input<string>;
    /**
     * The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `retentionPolicy` block as documented below.
     */
    retentionPolicy: pulumi.Input<inputs.network.NetworkWatcherFlowLogRetentionPolicy>;
    /**
     * The ID of the Storage Account where flow logs are stored.
     */
    storageAccountId: pulumi.Input<string>;
    /**
     * A mapping of tags which should be assigned to the Network Watcher Flow Log.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the Resource for which to enable flow logs for. Changing this forces a new resource to be created.
     */
    targetResourceId?: pulumi.Input<string>;
    /**
     * A `trafficAnalytics` block as documented below.
     */
    trafficAnalytics?: pulumi.Input<inputs.network.NetworkWatcherFlowLogTrafficAnalytics>;
    /**
     * The version (revision) of the flow log. Possible values are `1` and `2`. Defaults to `1`.
     */
    version?: pulumi.Input<number>;
}
