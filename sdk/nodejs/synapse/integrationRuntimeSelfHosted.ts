// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Synapse Self-hosted Integration Runtime.
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
 * const exampleIntegrationRuntimeSelfHosted = new azure.synapse.IntegrationRuntimeSelfHosted("example", {
 *     name: "example",
 *     synapseWorkspaceId: exampleWorkspace.id,
 * });
 * ```
 *
 * ## Import
 *
 * Synapse Self-hosted Integration Runtimes can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationRuntimes/IntegrationRuntime1
 * ```
 */
export class IntegrationRuntimeSelfHosted extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationRuntimeSelfHosted resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationRuntimeSelfHostedState, opts?: pulumi.CustomResourceOptions): IntegrationRuntimeSelfHosted {
        return new IntegrationRuntimeSelfHosted(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted';

    /**
     * Returns true if the given object is an instance of IntegrationRuntimeSelfHosted.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationRuntimeSelfHosted {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationRuntimeSelfHosted.__pulumiType;
    }

    /**
     * The primary integration runtime authentication key.
     */
    public /*out*/ readonly authorizationKeyPrimary!: pulumi.Output<string>;
    /**
     * The secondary integration runtime authentication key.
     */
    public /*out*/ readonly authorizationKeySecondary!: pulumi.Output<string>;
    /**
     * Integration runtime description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    public readonly synapseWorkspaceId!: pulumi.Output<string>;

    /**
     * Create a IntegrationRuntimeSelfHosted resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationRuntimeSelfHostedArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationRuntimeSelfHostedArgs | IntegrationRuntimeSelfHostedState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationRuntimeSelfHostedState | undefined;
            resourceInputs["authorizationKeyPrimary"] = state ? state.authorizationKeyPrimary : undefined;
            resourceInputs["authorizationKeySecondary"] = state ? state.authorizationKeySecondary : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["synapseWorkspaceId"] = state ? state.synapseWorkspaceId : undefined;
        } else {
            const args = argsOrState as IntegrationRuntimeSelfHostedArgs | undefined;
            if ((!args || args.synapseWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'synapseWorkspaceId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["synapseWorkspaceId"] = args ? args.synapseWorkspaceId : undefined;
            resourceInputs["authorizationKeyPrimary"] = undefined /*out*/;
            resourceInputs["authorizationKeySecondary"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationRuntimeSelfHosted.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationRuntimeSelfHosted resources.
 */
export interface IntegrationRuntimeSelfHostedState {
    /**
     * The primary integration runtime authentication key.
     */
    authorizationKeyPrimary?: pulumi.Input<string>;
    /**
     * The secondary integration runtime authentication key.
     */
    authorizationKeySecondary?: pulumi.Input<string>;
    /**
     * Integration runtime description.
     */
    description?: pulumi.Input<string>;
    /**
     * The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    synapseWorkspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationRuntimeSelfHosted resource.
 */
export interface IntegrationRuntimeSelfHostedArgs {
    /**
     * Integration runtime description.
     */
    description?: pulumi.Input<string>;
    /**
     * The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     */
    synapseWorkspaceId: pulumi.Input<string>;
}
