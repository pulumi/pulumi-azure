// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a NetApp Snapshot Policy.
 *
 * ## NetApp Snapshot Policy Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "resource-group-01",
 *     location: "East US",
 * });
 * const exampleAccount = new azure.netapp.Account("example", {
 *     name: "netappaccount-01",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * const exampleSnapshotPolicy = new azure.netapp.SnapshotPolicy("example", {
 *     name: "snapshotpolicy-01",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     accountName: exampleAccount.name,
 *     enabled: true,
 *     hourlySchedule: {
 *         snapshotsToKeep: 4,
 *         minute: 15,
 *     },
 *     dailySchedule: {
 *         snapshotsToKeep: 2,
 *         hour: 20,
 *         minute: 15,
 *     },
 *     weeklySchedule: {
 *         snapshotsToKeep: 1,
 *         daysOfWeeks: [
 *             "Monday",
 *             "Friday",
 *         ],
 *         hour: 23,
 *         minute: 0,
 *     },
 *     monthlySchedule: {
 *         snapshotsToKeep: 1,
 *         daysOfMonths: [
 *             1,
 *             15,
 *             20,
 *             30,
 *         ],
 *         hour: 5,
 *         minute: 45,
 *     },
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
 * NetApp Snapshot Policy can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:netapp/snapshotPolicy:SnapshotPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/snapshotPolicies/snapshotpolicy1
 * ```
 */
export class SnapshotPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SnapshotPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SnapshotPolicyState, opts?: pulumi.CustomResourceOptions): SnapshotPolicy {
        return new SnapshotPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:netapp/snapshotPolicy:SnapshotPolicy';

    /**
     * Returns true if the given object is an instance of SnapshotPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SnapshotPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SnapshotPolicy.__pulumiType;
    }

    /**
     * The name of the NetApp Account in which the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    public readonly accountName!: pulumi.Output<string>;
    /**
     * Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     */
    public readonly dailySchedule!: pulumi.Output<outputs.netapp.SnapshotPolicyDailySchedule | undefined>;
    /**
     * Defines that the NetApp Snapshot Policy is enabled or not.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     */
    public readonly hourlySchedule!: pulumi.Output<outputs.netapp.SnapshotPolicyHourlySchedule | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     */
    public readonly monthlySchedule!: pulumi.Output<outputs.netapp.SnapshotPolicyMonthlySchedule | undefined>;
    /**
     * The name of the NetApp Snapshot Policy. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group where the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     */
    public readonly weeklySchedule!: pulumi.Output<outputs.netapp.SnapshotPolicyWeeklySchedule | undefined>;

    /**
     * Create a SnapshotPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SnapshotPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SnapshotPolicyArgs | SnapshotPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SnapshotPolicyState | undefined;
            resourceInputs["accountName"] = state ? state.accountName : undefined;
            resourceInputs["dailySchedule"] = state ? state.dailySchedule : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["hourlySchedule"] = state ? state.hourlySchedule : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["monthlySchedule"] = state ? state.monthlySchedule : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["weeklySchedule"] = state ? state.weeklySchedule : undefined;
        } else {
            const args = argsOrState as SnapshotPolicyArgs | undefined;
            if ((!args || args.accountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountName'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["accountName"] = args ? args.accountName : undefined;
            resourceInputs["dailySchedule"] = args ? args.dailySchedule : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["hourlySchedule"] = args ? args.hourlySchedule : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["monthlySchedule"] = args ? args.monthlySchedule : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["weeklySchedule"] = args ? args.weeklySchedule : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SnapshotPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SnapshotPolicy resources.
 */
export interface SnapshotPolicyState {
    /**
     * The name of the NetApp Account in which the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    accountName?: pulumi.Input<string>;
    /**
     * Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     */
    dailySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyDailySchedule>;
    /**
     * Defines that the NetApp Snapshot Policy is enabled or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     */
    hourlySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyHourlySchedule>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     */
    monthlySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyMonthlySchedule>;
    /**
     * The name of the NetApp Snapshot Policy. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     */
    weeklySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyWeeklySchedule>;
}

/**
 * The set of arguments for constructing a SnapshotPolicy resource.
 */
export interface SnapshotPolicyArgs {
    /**
     * The name of the NetApp Account in which the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    accountName: pulumi.Input<string>;
    /**
     * Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     */
    dailySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyDailySchedule>;
    /**
     * Defines that the NetApp Snapshot Policy is enabled or not.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     */
    hourlySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyHourlySchedule>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     */
    monthlySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyMonthlySchedule>;
    /**
     * The name of the NetApp Snapshot Policy. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group where the NetApp Snapshot Policy should be created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     */
    weeklySchedule?: pulumi.Input<inputs.netapp.SnapshotPolicyWeeklySchedule>;
}
