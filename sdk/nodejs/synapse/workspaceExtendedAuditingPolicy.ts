// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Synapse Workspace Extended Auditing Policy.
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
 *     name: "examplestorageacc",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 *     accountKind: "BlobStorage",
 * });
 * const exampleDataLakeGen2Filesystem = new azure.storage.DataLakeGen2Filesystem("example", {
 *     name: "example",
 *     storageAccountId: exampleAccount.id,
 * });
 * const exampleWorkspace = new azure.synapse.Workspace("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     storageDataLakeGen2FilesystemId: exampleDataLakeGen2Filesystem.id,
 *     sqlAdministratorLogin: "sqladminuser",
 *     sqlAdministratorLoginPassword: "H@Sh1CoR3!",
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 * });
 * const auditLogs = new azure.storage.Account("audit_logs", {
 *     name: "examplesa",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleWorkspaceExtendedAuditingPolicy = new azure.synapse.WorkspaceExtendedAuditingPolicy("example", {
 *     synapseWorkspaceId: exampleWorkspace.id,
 *     storageEndpoint: auditLogs.primaryBlobEndpoint,
 *     storageAccountAccessKey: auditLogs.primaryAccessKey,
 *     storageAccountAccessKeyIsSecondary: false,
 *     retentionInDays: 6,
 * });
 * ```
 *
 * ## Import
 *
 * Synapse Workspace Extended Auditing Policies can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:synapse/workspaceExtendedAuditingPolicy:WorkspaceExtendedAuditingPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/extendedAuditingSettings/default
 * ```
 */
export class WorkspaceExtendedAuditingPolicy extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceExtendedAuditingPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceExtendedAuditingPolicyState, opts?: pulumi.CustomResourceOptions): WorkspaceExtendedAuditingPolicy {
        return new WorkspaceExtendedAuditingPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:synapse/workspaceExtendedAuditingPolicy:WorkspaceExtendedAuditingPolicy';

    /**
     * Returns true if the given object is an instance of WorkspaceExtendedAuditingPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceExtendedAuditingPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceExtendedAuditingPolicy.__pulumiType;
    }

    /**
     * Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its master database audit events to Azure Monitor. Defaults to `true`.
     */
    public readonly logMonitoringEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The number of days to retain logs for in the storage account. Defaults to `0`.
     */
    public readonly retentionInDays!: pulumi.Output<number | undefined>;
    /**
     * The access key to use for the auditing storage account.
     */
    public readonly storageAccountAccessKey!: pulumi.Output<string | undefined>;
    /**
     * Is `storageAccountAccessKey` value the storage's secondary key?
     */
    public readonly storageAccountAccessKeyIsSecondary!: pulumi.Output<boolean | undefined>;
    /**
     * The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
     */
    public readonly storageEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Synapse workspace to set the extended auditing policy. Changing this forces a new resource to be created.
     */
    public readonly synapseWorkspaceId!: pulumi.Output<string>;

    /**
     * Create a WorkspaceExtendedAuditingPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceExtendedAuditingPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceExtendedAuditingPolicyArgs | WorkspaceExtendedAuditingPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceExtendedAuditingPolicyState | undefined;
            resourceInputs["logMonitoringEnabled"] = state ? state.logMonitoringEnabled : undefined;
            resourceInputs["retentionInDays"] = state ? state.retentionInDays : undefined;
            resourceInputs["storageAccountAccessKey"] = state ? state.storageAccountAccessKey : undefined;
            resourceInputs["storageAccountAccessKeyIsSecondary"] = state ? state.storageAccountAccessKeyIsSecondary : undefined;
            resourceInputs["storageEndpoint"] = state ? state.storageEndpoint : undefined;
            resourceInputs["synapseWorkspaceId"] = state ? state.synapseWorkspaceId : undefined;
        } else {
            const args = argsOrState as WorkspaceExtendedAuditingPolicyArgs | undefined;
            if ((!args || args.synapseWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'synapseWorkspaceId'");
            }
            resourceInputs["logMonitoringEnabled"] = args ? args.logMonitoringEnabled : undefined;
            resourceInputs["retentionInDays"] = args ? args.retentionInDays : undefined;
            resourceInputs["storageAccountAccessKey"] = args?.storageAccountAccessKey ? pulumi.secret(args.storageAccountAccessKey) : undefined;
            resourceInputs["storageAccountAccessKeyIsSecondary"] = args ? args.storageAccountAccessKeyIsSecondary : undefined;
            resourceInputs["storageEndpoint"] = args ? args.storageEndpoint : undefined;
            resourceInputs["synapseWorkspaceId"] = args ? args.synapseWorkspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["storageAccountAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(WorkspaceExtendedAuditingPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceExtendedAuditingPolicy resources.
 */
export interface WorkspaceExtendedAuditingPolicyState {
    /**
     * Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its master database audit events to Azure Monitor. Defaults to `true`.
     */
    logMonitoringEnabled?: pulumi.Input<boolean>;
    /**
     * The number of days to retain logs for in the storage account. Defaults to `0`.
     */
    retentionInDays?: pulumi.Input<number>;
    /**
     * The access key to use for the auditing storage account.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Is `storageAccountAccessKey` value the storage's secondary key?
     */
    storageAccountAccessKeyIsSecondary?: pulumi.Input<boolean>;
    /**
     * The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
     */
    storageEndpoint?: pulumi.Input<string>;
    /**
     * The ID of the Synapse workspace to set the extended auditing policy. Changing this forces a new resource to be created.
     */
    synapseWorkspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceExtendedAuditingPolicy resource.
 */
export interface WorkspaceExtendedAuditingPolicyArgs {
    /**
     * Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its master database audit events to Azure Monitor. Defaults to `true`.
     */
    logMonitoringEnabled?: pulumi.Input<boolean>;
    /**
     * The number of days to retain logs for in the storage account. Defaults to `0`.
     */
    retentionInDays?: pulumi.Input<number>;
    /**
     * The access key to use for the auditing storage account.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Is `storageAccountAccessKey` value the storage's secondary key?
     */
    storageAccountAccessKeyIsSecondary?: pulumi.Input<boolean>;
    /**
     * The blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all extended auditing logs.
     */
    storageEndpoint?: pulumi.Input<string>;
    /**
     * The ID of the Synapse workspace to set the extended auditing policy. Changing this forces a new resource to be created.
     */
    synapseWorkspaceId: pulumi.Input<string>;
}
