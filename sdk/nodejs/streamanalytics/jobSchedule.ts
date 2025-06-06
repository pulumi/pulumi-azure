// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Stream Analytics Job Schedule.
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
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "example",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "private",
 * });
 * const exampleBlob = new azure.storage.Blob("example", {
 *     name: "example",
 *     storageAccountName: exampleAccount.name,
 *     storageContainerName: exampleContainer.name,
 *     type: "Block",
 *     source: new pulumi.asset.FileAsset("example.csv"),
 * });
 * const exampleJob = new azure.streamanalytics.Job("example", {
 *     name: "example-job",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     compatibilityLevel: "1.2",
 *     dataLocale: "en-GB",
 *     eventsLateArrivalMaxDelayInSeconds: 60,
 *     eventsOutOfOrderMaxDelayInSeconds: 50,
 *     eventsOutOfOrderPolicy: "Adjust",
 *     outputErrorPolicy: "Drop",
 *     streamingUnits: 3,
 *     tags: {
 *         environment: "Example",
 *     },
 *     transformationQuery: `    SELECT *
 *     INTO [exampleoutput]
 *     FROM [exampleinput]
 * `,
 * });
 * const exampleStreamInputBlob = new azure.streamanalytics.StreamInputBlob("example", {
 *     name: "exampleinput",
 *     streamAnalyticsJobName: exampleJob.name,
 *     resourceGroupName: exampleJob.resourceGroupName,
 *     storageAccountName: exampleAccount.name,
 *     storageAccountKey: exampleAccount.primaryAccessKey,
 *     storageContainerName: exampleContainer.name,
 *     pathPattern: "",
 *     dateFormat: "yyyy/MM/dd",
 *     timeFormat: "HH",
 *     serialization: {
 *         type: "Csv",
 *         encoding: "UTF8",
 *         fieldDelimiter: ",",
 *     },
 * });
 * const exampleOutputBlob = new azure.streamanalytics.OutputBlob("example", {
 *     name: "exampleoutput",
 *     streamAnalyticsJobName: exampleJob.name,
 *     resourceGroupName: exampleJob.resourceGroupName,
 *     storageAccountName: exampleAccount.name,
 *     storageAccountKey: exampleAccount.primaryAccessKey,
 *     storageContainerName: exampleContainer.name,
 *     pathPattern: "example-{date}-{time}",
 *     dateFormat: "yyyy-MM-dd",
 *     timeFormat: "HH",
 *     serialization: {
 *         type: "Avro",
 *     },
 * });
 * const exampleJobSchedule = new azure.streamanalytics.JobSchedule("example", {
 *     streamAnalyticsJobId: exampleJob.id,
 *     startMode: "CustomTime",
 *     startTime: "2022-09-21T00:00:00Z",
 * }, {
 *     dependsOn: [
 *         exampleJob,
 *         exampleStreamInputBlob,
 *         exampleOutputBlob,
 *     ],
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.StreamAnalytics`: 2021-10-01-preview
 *
 * ## Import
 *
 * Stream Analytics Job's can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:streamanalytics/jobSchedule:JobSchedule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/schedule/default
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
    public static readonly __pulumiType = 'azure:streamanalytics/jobSchedule:JobSchedule';

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
     * The time at which the Stream Analytics job last produced an output.
     */
    public /*out*/ readonly lastOutputTime!: pulumi.Output<string>;
    /**
     * The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     *
     * > **Note:** Setting `startMode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
     */
    public readonly startMode!: pulumi.Output<string>;
    /**
     * The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
     */
    public readonly startTime!: pulumi.Output<string>;
    /**
     * The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     */
    public readonly streamAnalyticsJobId!: pulumi.Output<string>;

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
            resourceInputs["lastOutputTime"] = state ? state.lastOutputTime : undefined;
            resourceInputs["startMode"] = state ? state.startMode : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
            resourceInputs["streamAnalyticsJobId"] = state ? state.streamAnalyticsJobId : undefined;
        } else {
            const args = argsOrState as JobScheduleArgs | undefined;
            if ((!args || args.startMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'startMode'");
            }
            if ((!args || args.streamAnalyticsJobId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamAnalyticsJobId'");
            }
            resourceInputs["startMode"] = args ? args.startMode : undefined;
            resourceInputs["startTime"] = args ? args.startTime : undefined;
            resourceInputs["streamAnalyticsJobId"] = args ? args.streamAnalyticsJobId : undefined;
            resourceInputs["lastOutputTime"] = undefined /*out*/;
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
     * The time at which the Stream Analytics job last produced an output.
     */
    lastOutputTime?: pulumi.Input<string>;
    /**
     * The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     *
     * > **Note:** Setting `startMode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
     */
    startMode?: pulumi.Input<string>;
    /**
     * The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
     */
    startTime?: pulumi.Input<string>;
    /**
     * The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a JobSchedule resource.
 */
export interface JobScheduleArgs {
    /**
     * The starting mode of the Stream Analytics Job. Possible values are `JobStartTime`, `CustomTime` and `LastOutputEventTime`.
     *
     * > **Note:** Setting `startMode` to `LastOutputEventTime` is only possible if the job had been previously started and produced output.
     */
    startMode: pulumi.Input<string>;
    /**
     * The time in ISO8601 format at which the Stream Analytics Job should be started e.g. `2022-04-01T00:00:00Z`. This property can only be specified if `startMode` is set to `CustomTime`
     */
    startTime?: pulumi.Input<string>;
    /**
     * The ID of the Stream Analytics Job that should be scheduled or started. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobId: pulumi.Input<string>;
}
