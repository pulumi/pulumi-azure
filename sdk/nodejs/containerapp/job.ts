// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Container App Job.
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
 * const exampleAnalyticsWorkspace = new azure.operationalinsights.AnalyticsWorkspace("example", {
 *     name: "example-log-analytics-workspace",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "PerGB2018",
 *     retentionInDays: 30,
 * });
 * const exampleEnvironment = new azure.containerapp.Environment("example", {
 *     name: "example-container-app-environment",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     logAnalyticsWorkspaceId: exampleAnalyticsWorkspace.id,
 * });
 * const exampleJob = new azure.containerapp.Job("example", {
 *     name: "example-container-app-job",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     containerAppEnvironmentId: exampleEnvironment.id,
 *     replicaTimeoutInSeconds: 10,
 *     replicaRetryLimit: 10,
 *     manualTriggerConfig: {
 *         parallelism: 4,
 *         replicaCompletionCount: 1,
 *     },
 *     template: {
 *         containers: [{
 *             image: "repo/testcontainerAppsJob0:v1",
 *             name: "testcontainerappsjob0",
 *             readinessProbes: [{
 *                 transport: "HTTP",
 *                 port: 5000,
 *             }],
 *             livenessProbes: [{
 *                 transport: "HTTP",
 *                 port: 5000,
 *                 path: "/health",
 *                 headers: [{
 *                     name: "Cache-Control",
 *                     value: "no-cache",
 *                 }],
 *                 initialDelay: 5,
 *                 intervalSeconds: 20,
 *                 timeout: 2,
 *                 failureCountThreshold: 1,
 *             }],
 *             startupProbes: [{
 *                 transport: "TCP",
 *                 port: 5000,
 *             }],
 *             cpu: 0.5,
 *             memory: "1Gi",
 *         }],
 *     },
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.App`: 2025-01-01
 *
 * ## Import
 *
 * A Container App Job can be imported using the resource id, e.g.
 *
 * ```sh
 * $ pulumi import azure:containerapp/job:Job example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.App/jobs/example-container-app-job"
 * ```
 */
export class Job extends pulumi.CustomResource {
    /**
     * Get an existing Job resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobState, opts?: pulumi.CustomResourceOptions): Job {
        return new Job(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:containerapp/job:Job';

    /**
     * Returns true if the given object is an instance of Job.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Job {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Job.__pulumiType;
    }

    /**
     * The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    public readonly containerAppEnvironmentId!: pulumi.Output<string>;
    /**
     * The endpoint for the Container App Job event stream.
     */
    public /*out*/ readonly eventStreamEndpoint!: pulumi.Output<string>;
    /**
     * A `eventTriggerConfig` block as defined below.
     */
    public readonly eventTriggerConfig!: pulumi.Output<outputs.containerapp.JobEventTriggerConfig | undefined>;
    /**
     * A `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.containerapp.JobIdentity | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * A `manualTriggerConfig` block as defined below.
     */
    public readonly manualTriggerConfig!: pulumi.Output<outputs.containerapp.JobManualTriggerConfig | undefined>;
    /**
     * Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of the Public IP Addresses which the Container App uses for outbound network access.
     */
    public /*out*/ readonly outboundIpAddresses!: pulumi.Output<string[]>;
    /**
     * One or more `registry` blocks as defined below.
     */
    public readonly registries!: pulumi.Output<outputs.containerapp.JobRegistry[] | undefined>;
    /**
     * The maximum number of times a replica is allowed to retry.
     */
    public readonly replicaRetryLimit!: pulumi.Output<number | undefined>;
    /**
     * The maximum number of seconds a replica is allowed to run.
     */
    public readonly replicaTimeoutInSeconds!: pulumi.Output<number>;
    /**
     * The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A `scheduleTriggerConfig` block as defined below.
     *
     * > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
     */
    public readonly scheduleTriggerConfig!: pulumi.Output<outputs.containerapp.JobScheduleTriggerConfig | undefined>;
    /**
     * One or more `secret` blocks as defined below.
     */
    public readonly secrets!: pulumi.Output<outputs.containerapp.JobSecret[] | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A `template` block as defined below.
     */
    public readonly template!: pulumi.Output<outputs.containerapp.JobTemplate>;
    /**
     * The name of the workload profile to use for the Container App Job.
     */
    public readonly workloadProfileName!: pulumi.Output<string | undefined>;

    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: JobArgs | JobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as JobState | undefined;
            resourceInputs["containerAppEnvironmentId"] = state ? state.containerAppEnvironmentId : undefined;
            resourceInputs["eventStreamEndpoint"] = state ? state.eventStreamEndpoint : undefined;
            resourceInputs["eventTriggerConfig"] = state ? state.eventTriggerConfig : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["manualTriggerConfig"] = state ? state.manualTriggerConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outboundIpAddresses"] = state ? state.outboundIpAddresses : undefined;
            resourceInputs["registries"] = state ? state.registries : undefined;
            resourceInputs["replicaRetryLimit"] = state ? state.replicaRetryLimit : undefined;
            resourceInputs["replicaTimeoutInSeconds"] = state ? state.replicaTimeoutInSeconds : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["scheduleTriggerConfig"] = state ? state.scheduleTriggerConfig : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["workloadProfileName"] = state ? state.workloadProfileName : undefined;
        } else {
            const args = argsOrState as JobArgs | undefined;
            if ((!args || args.containerAppEnvironmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'containerAppEnvironmentId'");
            }
            if ((!args || args.replicaTimeoutInSeconds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replicaTimeoutInSeconds'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.template === undefined) && !opts.urn) {
                throw new Error("Missing required property 'template'");
            }
            resourceInputs["containerAppEnvironmentId"] = args ? args.containerAppEnvironmentId : undefined;
            resourceInputs["eventTriggerConfig"] = args ? args.eventTriggerConfig : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["manualTriggerConfig"] = args ? args.manualTriggerConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["registries"] = args ? args.registries : undefined;
            resourceInputs["replicaRetryLimit"] = args ? args.replicaRetryLimit : undefined;
            resourceInputs["replicaTimeoutInSeconds"] = args ? args.replicaTimeoutInSeconds : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["scheduleTriggerConfig"] = args ? args.scheduleTriggerConfig : undefined;
            resourceInputs["secrets"] = args?.secrets ? pulumi.secret(args.secrets) : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["workloadProfileName"] = args ? args.workloadProfileName : undefined;
            resourceInputs["eventStreamEndpoint"] = undefined /*out*/;
            resourceInputs["outboundIpAddresses"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secrets"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Job.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    /**
     * The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    containerAppEnvironmentId?: pulumi.Input<string>;
    /**
     * The endpoint for the Container App Job event stream.
     */
    eventStreamEndpoint?: pulumi.Input<string>;
    /**
     * A `eventTriggerConfig` block as defined below.
     */
    eventTriggerConfig?: pulumi.Input<inputs.containerapp.JobEventTriggerConfig>;
    /**
     * A `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.containerapp.JobIdentity>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * A `manualTriggerConfig` block as defined below.
     */
    manualTriggerConfig?: pulumi.Input<inputs.containerapp.JobManualTriggerConfig>;
    /**
     * Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of the Public IP Addresses which the Container App uses for outbound network access.
     */
    outboundIpAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * One or more `registry` blocks as defined below.
     */
    registries?: pulumi.Input<pulumi.Input<inputs.containerapp.JobRegistry>[]>;
    /**
     * The maximum number of times a replica is allowed to retry.
     */
    replicaRetryLimit?: pulumi.Input<number>;
    /**
     * The maximum number of seconds a replica is allowed to run.
     */
    replicaTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A `scheduleTriggerConfig` block as defined below.
     *
     * > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
     */
    scheduleTriggerConfig?: pulumi.Input<inputs.containerapp.JobScheduleTriggerConfig>;
    /**
     * One or more `secret` blocks as defined below.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.containerapp.JobSecret>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `template` block as defined below.
     */
    template?: pulumi.Input<inputs.containerapp.JobTemplate>;
    /**
     * The name of the workload profile to use for the Container App Job.
     */
    workloadProfileName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    /**
     * The ID of the Container App Environment in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    containerAppEnvironmentId: pulumi.Input<string>;
    /**
     * A `eventTriggerConfig` block as defined below.
     */
    eventTriggerConfig?: pulumi.Input<inputs.containerapp.JobEventTriggerConfig>;
    /**
     * A `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.containerapp.JobIdentity>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * A `manualTriggerConfig` block as defined below.
     */
    manualTriggerConfig?: pulumi.Input<inputs.containerapp.JobManualTriggerConfig>;
    /**
     * Specifies the name of the Container App Job resource. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * One or more `registry` blocks as defined below.
     */
    registries?: pulumi.Input<pulumi.Input<inputs.containerapp.JobRegistry>[]>;
    /**
     * The maximum number of times a replica is allowed to retry.
     */
    replicaRetryLimit?: pulumi.Input<number>;
    /**
     * The maximum number of seconds a replica is allowed to run.
     */
    replicaTimeoutInSeconds: pulumi.Input<number>;
    /**
     * The name of the resource group in which to create the Container App Job. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A `scheduleTriggerConfig` block as defined below.
     *
     * > **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
     */
    scheduleTriggerConfig?: pulumi.Input<inputs.containerapp.JobScheduleTriggerConfig>;
    /**
     * One or more `secret` blocks as defined below.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.containerapp.JobSecret>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `template` block as defined below.
     */
    template: pulumi.Input<inputs.containerapp.JobTemplate>;
    /**
     * The name of the workload profile to use for the Container App Job.
     */
    workloadProfileName?: pulumi.Input<string>;
}
