// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Stream Analytics Output to an EventHub.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "rg-example",
 *     location: "West Europe",
 * });
 * const example = azure.streamanalytics.getJobOutput({
 *     name: "example-job",
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleEventHubNamespace = new azure.eventhub.EventHubNamespace("example", {
 *     name: "example-ehnamespace",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "Standard",
 *     capacity: 1,
 * });
 * const exampleEventHub = new azure.eventhub.EventHub("example", {
 *     name: "example-eventhub",
 *     namespaceName: exampleEventHubNamespace.name,
 *     resourceGroupName: exampleResourceGroup.name,
 *     partitionCount: 2,
 *     messageRetention: 1,
 * });
 * const exampleOutputEventHub = new azure.streamanalytics.OutputEventHub("example", {
 *     name: "output-to-eventhub",
 *     streamAnalyticsJobName: example.apply(example => example.name),
 *     resourceGroupName: example.apply(example => example.resourceGroupName),
 *     eventhubName: exampleEventHub.name,
 *     servicebusNamespace: exampleEventHubNamespace.name,
 *     sharedAccessPolicyKey: exampleEventHubNamespace.defaultPrimaryKey,
 *     sharedAccessPolicyName: "RootManageSharedAccessKey",
 *     serialization: {
 *         type: "Avro",
 *     },
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
 * Stream Analytics Outputs to an EventHub can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:streamanalytics/outputEventHub:OutputEventHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/outputs/output1
 * ```
 */
export class OutputEventHub extends pulumi.CustomResource {
    /**
     * Get an existing OutputEventHub resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OutputEventHubState, opts?: pulumi.CustomResourceOptions): OutputEventHub {
        return new OutputEventHub(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:streamanalytics/outputEventHub:OutputEventHub';

    /**
     * Returns true if the given object is an instance of OutputEventHub.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OutputEventHub {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OutputEventHub.__pulumiType;
    }

    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    public readonly authenticationMode!: pulumi.Output<string | undefined>;
    /**
     * The name of the Event Hub.
     */
    public readonly eventhubName!: pulumi.Output<string>;
    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The column that is used for the Event Hub partition key.
     */
    public readonly partitionKey!: pulumi.Output<string | undefined>;
    /**
     * A list of property columns to add to the Event Hub output.
     */
    public readonly propertyColumns!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `serialization` block as defined below.
     */
    public readonly serialization!: pulumi.Output<outputs.streamanalytics.OutputEventHubSerialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    public readonly servicebusNamespace!: pulumi.Output<string>;
    /**
     * The shared access policy key for the specified shared access policy. Required when `authenticationMode` is set to `ConnectionString`.
     */
    public readonly sharedAccessPolicyKey!: pulumi.Output<string | undefined>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required when `authenticationMode` is set to `ConnectionString`.
     */
    public readonly sharedAccessPolicyName!: pulumi.Output<string | undefined>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    public readonly streamAnalyticsJobName!: pulumi.Output<string>;

    /**
     * Create a OutputEventHub resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OutputEventHubArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OutputEventHubArgs | OutputEventHubState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OutputEventHubState | undefined;
            resourceInputs["authenticationMode"] = state ? state.authenticationMode : undefined;
            resourceInputs["eventhubName"] = state ? state.eventhubName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["partitionKey"] = state ? state.partitionKey : undefined;
            resourceInputs["propertyColumns"] = state ? state.propertyColumns : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["serialization"] = state ? state.serialization : undefined;
            resourceInputs["servicebusNamespace"] = state ? state.servicebusNamespace : undefined;
            resourceInputs["sharedAccessPolicyKey"] = state ? state.sharedAccessPolicyKey : undefined;
            resourceInputs["sharedAccessPolicyName"] = state ? state.sharedAccessPolicyName : undefined;
            resourceInputs["streamAnalyticsJobName"] = state ? state.streamAnalyticsJobName : undefined;
        } else {
            const args = argsOrState as OutputEventHubArgs | undefined;
            if ((!args || args.eventhubName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'eventhubName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serialization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serialization'");
            }
            if ((!args || args.servicebusNamespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servicebusNamespace'");
            }
            if ((!args || args.streamAnalyticsJobName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamAnalyticsJobName'");
            }
            resourceInputs["authenticationMode"] = args ? args.authenticationMode : undefined;
            resourceInputs["eventhubName"] = args ? args.eventhubName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["partitionKey"] = args ? args.partitionKey : undefined;
            resourceInputs["propertyColumns"] = args ? args.propertyColumns : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["serialization"] = args ? args.serialization : undefined;
            resourceInputs["servicebusNamespace"] = args ? args.servicebusNamespace : undefined;
            resourceInputs["sharedAccessPolicyKey"] = args?.sharedAccessPolicyKey ? pulumi.secret(args.sharedAccessPolicyKey) : undefined;
            resourceInputs["sharedAccessPolicyName"] = args ? args.sharedAccessPolicyName : undefined;
            resourceInputs["streamAnalyticsJobName"] = args ? args.streamAnalyticsJobName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["sharedAccessPolicyKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(OutputEventHub.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OutputEventHub resources.
 */
export interface OutputEventHubState {
    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The name of the Event Hub.
     */
    eventhubName?: pulumi.Input<string>;
    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The column that is used for the Event Hub partition key.
     */
    partitionKey?: pulumi.Input<string>;
    /**
     * A list of property columns to add to the Event Hub output.
     */
    propertyColumns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization?: pulumi.Input<inputs.streamanalytics.OutputEventHubSerialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    servicebusNamespace?: pulumi.Input<string>;
    /**
     * The shared access policy key for the specified shared access policy. Required when `authenticationMode` is set to `ConnectionString`.
     */
    sharedAccessPolicyKey?: pulumi.Input<string>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required when `authenticationMode` is set to `ConnectionString`.
     */
    sharedAccessPolicyName?: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OutputEventHub resource.
 */
export interface OutputEventHubArgs {
    /**
     * The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     */
    authenticationMode?: pulumi.Input<string>;
    /**
     * The name of the Event Hub.
     */
    eventhubName: pulumi.Input<string>;
    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The column that is used for the Event Hub partition key.
     */
    partitionKey?: pulumi.Input<string>;
    /**
     * A list of property columns to add to the Event Hub output.
     */
    propertyColumns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `serialization` block as defined below.
     */
    serialization: pulumi.Input<inputs.streamanalytics.OutputEventHubSerialization>;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     */
    servicebusNamespace: pulumi.Input<string>;
    /**
     * The shared access policy key for the specified shared access policy. Required when `authenticationMode` is set to `ConnectionString`.
     */
    sharedAccessPolicyKey?: pulumi.Input<string>;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required when `authenticationMode` is set to `ConnectionString`.
     */
    sharedAccessPolicyName?: pulumi.Input<string>;
    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     */
    streamAnalyticsJobName: pulumi.Input<string>;
}
