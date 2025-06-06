// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Links an Automation Runbook and Schedule.
 *
 * > **Note:** AzureRM provides this stand-alone azure.automation.JobSchedule and an inlined `jobSchedule` property in azurermRunbook to manage the job schedules. You can only make use of one of these methods to manage a job schedule.
 *
 * ## Example Usage
 *
 * This is an example of just the Job Schedule.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.automation.JobSchedule("example", {
 *     resourceGroupName: "tf-rgr-automation",
 *     automationAccountName: "tf-automation-account",
 *     scheduleName: "hour",
 *     runbookName: "Get-VirtualMachine",
 *     parameters: {
 *         resourcegroup: "tf-rgr-vm",
 *         vmname: "TF-VM-01",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Automation`: 2023-11-01
 *
 * ## Import
 *
 * Automation Job Schedules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:automation/jobSchedule:JobSchedule example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/schedules/schedule1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/runbooks/runbook1"
 * ```
 */
export class JobSchedule extends pulumi.CustomResource {
    /**
     * Get an existing JobSchedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobScheduleState, opts?: pulumi.CustomResourceOptions): JobSchedule {
        return new JobSchedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/jobSchedule:JobSchedule';

    /**
     * Returns true if the given object is an instance of JobSchedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is JobSchedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === JobSchedule.__pulumiType;
    }

    /**
     * The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    public readonly automationAccountName!: pulumi.Output<string>;
    /**
     * The UUID identifying the Automation Job Schedule.
     */
    public readonly jobScheduleId!: pulumi.Output<string>;
    /**
     * A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
     *
     * > **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don't have this limitation.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The Resource Manager ID of the Automation Job Schedule.
     */
    public /*out*/ readonly resourceManagerId!: pulumi.Output<string>;
    /**
     * Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
     */
    public readonly runOn!: pulumi.Output<string | undefined>;
    /**
     * The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
     */
    public readonly runbookName!: pulumi.Output<string>;
    /**
     * The name of the Schedule. Changing this forces a new resource to be created.
     */
    public readonly scheduleName!: pulumi.Output<string>;

    /**
     * Create a JobSchedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobScheduleArgs | JobScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobScheduleState | undefined;
            resourceInputs["automationAccountName"] = state ? state.automationAccountName : undefined;
            resourceInputs["jobScheduleId"] = state ? state.jobScheduleId : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["resourceManagerId"] = state ? state.resourceManagerId : undefined;
            resourceInputs["runOn"] = state ? state.runOn : undefined;
            resourceInputs["runbookName"] = state ? state.runbookName : undefined;
            resourceInputs["scheduleName"] = state ? state.scheduleName : undefined;
        } else {
            const args = argsOrState as JobScheduleArgs | undefined;
            if ((!args || args.automationAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.runbookName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runbookName'");
            }
            if ((!args || args.scheduleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scheduleName'");
            }
            resourceInputs["automationAccountName"] = args ? args.automationAccountName : undefined;
            resourceInputs["jobScheduleId"] = args ? args.jobScheduleId : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["runOn"] = args ? args.runOn : undefined;
            resourceInputs["runbookName"] = args ? args.runbookName : undefined;
            resourceInputs["scheduleName"] = args ? args.scheduleName : undefined;
            resourceInputs["resourceManagerId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(JobSchedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering JobSchedule resources.
 */
export interface JobScheduleState {
    /**
     * The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    automationAccountName?: pulumi.Input<string>;
    /**
     * The UUID identifying the Automation Job Schedule.
     */
    jobScheduleId?: pulumi.Input<string>;
    /**
     * A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
     *
     * > **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don't have this limitation.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The Resource Manager ID of the Automation Job Schedule.
     */
    resourceManagerId?: pulumi.Input<string>;
    /**
     * Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
     */
    runOn?: pulumi.Input<string>;
    /**
     * The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
     */
    runbookName?: pulumi.Input<string>;
    /**
     * The name of the Schedule. Changing this forces a new resource to be created.
     */
    scheduleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a JobSchedule resource.
 */
export interface JobScheduleArgs {
    /**
     * The name of the Automation Account in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    automationAccountName: pulumi.Input<string>;
    /**
     * The UUID identifying the Automation Job Schedule.
     */
    jobScheduleId?: pulumi.Input<string>;
    /**
     * A map of key/value pairs corresponding to the arguments that can be passed to the Runbook. Changing this forces a new resource to be created.
     *
     * > **Note:** The parameter keys/names must strictly be in lowercase, even if this is not the case in the runbook. This is due to a limitation in Azure Automation where the parameter names are normalized. The values specified don't have this limitation.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the resource group in which the Job Schedule is created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Name of a Hybrid Worker Group the Runbook will be executed on. Changing this forces a new resource to be created.
     */
    runOn?: pulumi.Input<string>;
    /**
     * The name of a Runbook to link to a Schedule. It needs to be in the same Automation Account as the Schedule and Job Schedule. Changing this forces a new resource to be created.
     */
    runbookName: pulumi.Input<string>;
    /**
     * The name of the Schedule. Changing this forces a new resource to be created.
     */
    scheduleName: pulumi.Input<string>;
}
