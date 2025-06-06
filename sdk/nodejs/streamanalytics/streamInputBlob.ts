// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Stream Analytics Stream Input Blob.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const example = azure.streamanalytics.getJobOutput({
 *     name: "example-job",
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "examplestoracc",
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleContainer = new azure.storage.Container("example", {
 *     name: "example",
 *     storageAccountName: exampleAccount.name,
 *     containerAccessType: "private",
 * });
 * const exampleStreamInputBlob = new azure.streamanalytics.StreamInputBlob("example", {
 *     name: "blob-stream-input",
 *     streamAnalyticsJobName: example.apply(example => example.name),
 *     resourceGroupName: example.apply(example => example.resourceGroupName),
 *     storageAccountName: exampleAccount.name,
 *     storageAccountKey: exampleAccount.primaryAccessKey,
 *     storageContainerName: exampleContainer.name,
 *     pathPattern: "some-random-pattern",
 *     dateFormat: "yyyy/MM/dd",
 *     timeFormat: "HH",
 *     serialization: {
 *         type: "Json",
 *         encoding: "UTF8",
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.StreamAnalytics`: 2020-03-01
 *
 * ## Import
 *
 * Stream Analytics Stream Input Blob's can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:streamanalytics/streamInputBlob:StreamInputBlob example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/inputs/input1
 * ```
 */
export class StreamInputBlob extends pulumi.CustomResource {
    /**
     * Get an existing StreamInputBlob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamInputBlobState, opts?: pulumi.CustomResourceOptions): StreamInputBlob {
        return new StreamInputBlob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:streamanalytics/streamInputBlob:StreamInputBlob';

    /**
     * Returns true if the given object is an instance of StreamInputBlob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamInputBlob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamInputBlob.__pulumiType;
    }

    /**
     * The authentication mode for the Stream Analytics Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    public readonly authenticationMode!: pulumi.Output<string | undefined>;
    /**
     * The date format. Wherever `{date}` appears in `pathPattern`, the value of this property is used as the date format instead.
     */
    public readonly dateFormat!: pulumi.Output<string>;
    /**
     * The name of the Stream Input Blob. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
     */
    public readonly pathPattern!: pulumi.Output<string>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `serialization` block as defined below.
     */
    public readonly serialization!: pulumi.Output<outputs.streamanalytics.StreamInputBlobSerialization>;
    /**
     * The Access Key which should be used to connect to this Storage Account.
     */
    public readonly storageAccountKey!: pulumi.Output<string>;
    /**
     * The name of the Storage Account.
     */
    public readonly storageAccountName!: pulumi.Output<string>;
    /**
     * The name of the Container within the Storage Account.
     */
    public readonly storageContainerName!: pulumi.Output<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    public readonly streamAnalyticsJobName!: pulumi.Output<string>;
    /**
     * The time format. Wherever `{time}` appears in `pathPattern`, the value of this property is used as the time format instead.
     */
    public readonly timeFormat!: pulumi.Output<string>;

    /**
     * Create a StreamInputBlob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamInputBlobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamInputBlobArgs | StreamInputBlobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamInputBlobState | undefined;
            resourceInputs["authenticationMode"] = state ? state.authenticationMode : undefined;
            resourceInputs["dateFormat"] = state ? state.dateFormat : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pathPattern"] = state ? state.pathPattern : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serialization"] = state ? state.serialization : undefined;
            resourceInputs["storageAccountKey"] = state ? state.storageAccountKey : undefined;
            resourceInputs["storageAccountName"] = state ? state.storageAccountName : undefined;
            resourceInputs["storageContainerName"] = state ? state.storageContainerName : undefined;
            resourceInputs["streamAnalyticsJobName"] = state ? state.streamAnalyticsJobName : undefined;
            resourceInputs["timeFormat"] = state ? state.timeFormat : undefined;
        } else {
            const args = argsOrState as StreamInputBlobArgs | undefined;
            if ((!args || args.dateFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dateFormat'");
            }
            if ((!args || args.pathPattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pathPattern'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serialization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serialization'");
            }
            if ((!args || args.storageAccountKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountKey'");
            }
            if ((!args || args.storageAccountName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageAccountName'");
            }
            if ((!args || args.storageContainerName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageContainerName'");
            }
            if ((!args || args.streamAnalyticsJobName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamAnalyticsJobName'");
            }
            if ((!args || args.timeFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeFormat'");
            }
            resourceInputs["authenticationMode"] = args ? args.authenticationMode : undefined;
            resourceInputs["dateFormat"] = args ? args.dateFormat : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pathPattern"] = args ? args.pathPattern : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serialization"] = args ? args.serialization : undefined;
            resourceInputs["storageAccountKey"] = args?.storageAccountKey ? pulumi.secret(args.storageAccountKey) : undefined;
            resourceInputs["storageAccountName"] = args ? args.storageAccountName : undefined;
            resourceInputs["storageContainerName"] = args ? args.storageContainerName : undefined;
            resourceInputs["streamAnalyticsJobName"] = args ? args.streamAnalyticsJobName : undefined;
            resourceInputs["timeFormat"] = args ? args.timeFormat : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["storageAccountKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(StreamInputBlob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamInputBlob resources.
 */
export interface StreamInputBlobState {
    /**
     * The authentication mode for the Stream Analytics Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The date format. Wherever `{date}` appears in `pathPattern`, the value of this property is used as the date format instead.
     */
    dateFormat?: pulumi.Input<string>;
    /**
     * The name of the Stream Input Blob. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
     */
    pathPattern?: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization?: pulumi.Input<inputs.streamanalytics.StreamInputBlobSerialization>;
    /**
     * The Access Key which should be used to connect to this Storage Account.
     */
    storageAccountKey?: pulumi.Input<string>;
    /**
     * The name of the Storage Account.
     */
    storageAccountName?: pulumi.Input<string>;
    /**
     * The name of the Container within the Storage Account.
     */
    storageContainerName?: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobName?: pulumi.Input<string>;
    /**
     * The time format. Wherever `{time}` appears in `pathPattern`, the value of this property is used as the time format instead.
     */
    timeFormat?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamInputBlob resource.
 */
export interface StreamInputBlobArgs {
    /**
     * The authentication mode for the Stream Analytics Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The date format. Wherever `{date}` appears in `pathPattern`, the value of this property is used as the date format instead.
     */
    dateFormat: pulumi.Input<string>;
    /**
     * The name of the Stream Input Blob. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
     */
    pathPattern: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization: pulumi.Input<inputs.streamanalytics.StreamInputBlobSerialization>;
    /**
     * The Access Key which should be used to connect to this Storage Account.
     */
    storageAccountKey: pulumi.Input<string>;
    /**
     * The name of the Storage Account.
     */
    storageAccountName: pulumi.Input<string>;
    /**
     * The name of the Container within the Storage Account.
     */
    storageContainerName: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobName: pulumi.Input<string>;
    /**
     * The time format. Wherever `{time}` appears in `pathPattern`, the value of this property is used as the time format instead.
     */
    timeFormat: pulumi.Input<string>;
}
