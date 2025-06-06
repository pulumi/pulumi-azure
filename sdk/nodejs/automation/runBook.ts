// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Automation Runbook.
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
 * const exampleAccount = new azure.automation.Account("example", {
 *     name: "account1",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     skuName: "Basic",
 * });
 * const exampleRunBook = new azure.automation.RunBook("example", {
 *     name: "Get-AzureVMTutorial",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     automationAccountName: exampleAccount.name,
 *     logVerbose: true,
 *     logProgress: true,
 *     description: "This is an example runbook",
 *     runbookType: "PowerShellWorkflow",
 *     publishContentLink: {
 *         uri: "https://raw.githubusercontent.com/Azure/azure-quickstart-templates/c4935ffb69246a6058eb24f54640f53f69d3ac9f/101-automation-runbook-getvms/Runbooks/Get-AzureVMTutorial.ps1",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Automation Runbooks can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:automation/runBook:RunBook Get-AzureVMTutorial /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/runbooks/Get-AzureVMTutorial
 * ```
 */
export class RunBook extends pulumi.CustomResource {
    /**
     * Get an existing RunBook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RunBookState, opts?: pulumi.CustomResourceOptions): RunBook {
        return new RunBook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:automation/runBook:RunBook';

    /**
     * Returns true if the given object is an instance of RunBook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RunBook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RunBook.__pulumiType;
    }

    /**
     * The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     */
    public readonly automationAccountName!: pulumi.Output<string>;
    /**
     * The desired content of the runbook.
     *
     * > **Note:** The Azure API requires a `publishContentLink` to be supplied even when specifying your own `content`.
     */
    public readonly content!: pulumi.Output<string>;
    /**
     * A description for the runbook.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A `draft` block as defined below.
     */
    public readonly draft!: pulumi.Output<outputs.automation.RunBookDraft | undefined>;
    /**
     * One or more `jobSchedule` block as defined below.
     *
     * > **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     */
    public readonly jobSchedules!: pulumi.Output<outputs.automation.RunBookJobSchedule[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Specifies the activity-level tracing options of the runbook, available only for Graphical runbooks. Possible values are `0` for None, `9` for Basic, and `15` for Detailed. Must turn on Verbose logging in order to see the tracing.
     */
    public readonly logActivityTraceLevel!: pulumi.Output<number | undefined>;
    /**
     * Progress log option.
     */
    public readonly logProgress!: pulumi.Output<boolean>;
    /**
     * Verbose log option.
     */
    public readonly logVerbose!: pulumi.Output<boolean>;
    /**
     * Specifies the name of the Runbook. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * One `publishContentLink` block as defined below.
     */
    public readonly publishContentLink!: pulumi.Output<outputs.automation.RunBookPublishContentLink | undefined>;
    /**
     * The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell`, `PowerShell72`, `Python3`, `Python2` or `Script`. Changing this forces a new resource to be created.
     */
    public readonly runbookType!: pulumi.Output<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a RunBook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RunBookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RunBookArgs | RunBookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RunBookState | undefined;
            resourceInputs["automationAccountName"] = state ? state.automationAccountName : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["draft"] = state ? state.draft : undefined;
            resourceInputs["jobSchedules"] = state ? state.jobSchedules : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["logActivityTraceLevel"] = state ? state.logActivityTraceLevel : undefined;
            resourceInputs["logProgress"] = state ? state.logProgress : undefined;
            resourceInputs["logVerbose"] = state ? state.logVerbose : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["publishContentLink"] = state ? state.publishContentLink : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["runbookType"] = state ? state.runbookType : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as RunBookArgs | undefined;
            if ((!args || args.automationAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'automationAccountName'");
            }
            if ((!args || args.logProgress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logProgress'");
            }
            if ((!args || args.logVerbose === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logVerbose'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.runbookType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runbookType'");
            }
            resourceInputs["automationAccountName"] = args ? args.automationAccountName : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["draft"] = args ? args.draft : undefined;
            resourceInputs["jobSchedules"] = args ? args.jobSchedules : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["logActivityTraceLevel"] = args ? args.logActivityTraceLevel : undefined;
            resourceInputs["logProgress"] = args ? args.logProgress : undefined;
            resourceInputs["logVerbose"] = args ? args.logVerbose : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publishContentLink"] = args ? args.publishContentLink : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["runbookType"] = args ? args.runbookType : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RunBook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RunBook resources.
 */
export interface RunBookState {
    /**
     * The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     */
    automationAccountName?: pulumi.Input<string>;
    /**
     * The desired content of the runbook.
     *
     * > **Note:** The Azure API requires a `publishContentLink` to be supplied even when specifying your own `content`.
     */
    content?: pulumi.Input<string>;
    /**
     * A description for the runbook.
     */
    description?: pulumi.Input<string>;
    /**
     * A `draft` block as defined below.
     */
    draft?: pulumi.Input<inputs.automation.RunBookDraft>;
    /**
     * One or more `jobSchedule` block as defined below.
     *
     * > **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     */
    jobSchedules?: pulumi.Input<pulumi.Input<inputs.automation.RunBookJobSchedule>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the activity-level tracing options of the runbook, available only for Graphical runbooks. Possible values are `0` for None, `9` for Basic, and `15` for Detailed. Must turn on Verbose logging in order to see the tracing.
     */
    logActivityTraceLevel?: pulumi.Input<number>;
    /**
     * Progress log option.
     */
    logProgress?: pulumi.Input<boolean>;
    /**
     * Verbose log option.
     */
    logVerbose?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Runbook. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One `publishContentLink` block as defined below.
     */
    publishContentLink?: pulumi.Input<inputs.automation.RunBookPublishContentLink>;
    /**
     * The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell`, `PowerShell72`, `Python3`, `Python2` or `Script`. Changing this forces a new resource to be created.
     */
    runbookType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a RunBook resource.
 */
export interface RunBookArgs {
    /**
     * The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     */
    automationAccountName: pulumi.Input<string>;
    /**
     * The desired content of the runbook.
     *
     * > **Note:** The Azure API requires a `publishContentLink` to be supplied even when specifying your own `content`.
     */
    content?: pulumi.Input<string>;
    /**
     * A description for the runbook.
     */
    description?: pulumi.Input<string>;
    /**
     * A `draft` block as defined below.
     */
    draft?: pulumi.Input<inputs.automation.RunBookDraft>;
    /**
     * One or more `jobSchedule` block as defined below.
     *
     * > **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     */
    jobSchedules?: pulumi.Input<pulumi.Input<inputs.automation.RunBookJobSchedule>[]>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * Specifies the activity-level tracing options of the runbook, available only for Graphical runbooks. Possible values are `0` for None, `9` for Basic, and `15` for Detailed. Must turn on Verbose logging in order to see the tracing.
     */
    logActivityTraceLevel?: pulumi.Input<number>;
    /**
     * Progress log option.
     */
    logProgress: pulumi.Input<boolean>;
    /**
     * Verbose log option.
     */
    logVerbose: pulumi.Input<boolean>;
    /**
     * Specifies the name of the Runbook. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One `publishContentLink` block as defined below.
     */
    publishContentLink?: pulumi.Input<inputs.automation.RunBookPublishContentLink>;
    /**
     * The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell`, `PowerShell72`, `Python3`, `Python2` or `Script`. Changing this forces a new resource to be created.
     */
    runbookType: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
