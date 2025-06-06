// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Office IRM Data Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-rg",
 *     location: "West Europe",
 * });
 * const exampleAnalyticsWorkspace = new azure.operationalinsights.AnalyticsWorkspace("example", {
 *     name: "example-workspace",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     sku: "PerGB2018",
 * });
 * const exampleLogAnalyticsWorkspaceOnboarding = new azure.sentinel.LogAnalyticsWorkspaceOnboarding("example", {workspaceId: exampleAnalyticsWorkspace.id});
 * const exampleDataConnectorOfficeIrm = new azure.sentinel.DataConnectorOfficeIrm("example", {
 *     name: "example",
 *     logAnalyticsWorkspaceId: exampleLogAnalyticsWorkspaceOnboarding.workspaceId,
 * });
 * ```
 *
 * ## Import
 *
 * Office IRM Data Connectors can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:sentinel/dataConnectorOfficeIrm:DataConnectorOfficeIrm example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 */
export class DataConnectorOfficeIrm extends pulumi.CustomResource {
    /**
     * Get an existing DataConnectorOfficeIrm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataConnectorOfficeIrmState, opts?: pulumi.CustomResourceOptions): DataConnectorOfficeIrm {
        return new DataConnectorOfficeIrm(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:sentinel/dataConnectorOfficeIrm:DataConnectorOfficeIrm';

    /**
     * Returns true if the given object is an instance of DataConnectorOfficeIrm.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataConnectorOfficeIrm {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataConnectorOfficeIrm.__pulumiType;
    }

    /**
     * The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
     */
    public readonly logAnalyticsWorkspaceId!: pulumi.Output<string>;
    /**
     * The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
     *
     * > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     */
    public readonly tenantId!: pulumi.Output<string>;

    /**
     * Create a DataConnectorOfficeIrm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataConnectorOfficeIrmArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataConnectorOfficeIrmArgs | DataConnectorOfficeIrmState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataConnectorOfficeIrmState | undefined;
            resourceInputs["logAnalyticsWorkspaceId"] = state ? state.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
        } else {
            const args = argsOrState as DataConnectorOfficeIrmArgs | undefined;
            if ((!args || args.logAnalyticsWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logAnalyticsWorkspaceId'");
            }
            resourceInputs["logAnalyticsWorkspaceId"] = args ? args.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tenantId"] = args ? args.tenantId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataConnectorOfficeIrm.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataConnectorOfficeIrm resources.
 */
export interface DataConnectorOfficeIrmState {
    /**
     * The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
     */
    logAnalyticsWorkspaceId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
     *
     * > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     */
    tenantId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataConnectorOfficeIrm resource.
 */
export interface DataConnectorOfficeIrmArgs {
    /**
     * The ID of the Log Analytics Workspace that this Office IRM Data Connector resides in. Changing this forces a new Office IRM Data Connector to be created.
     */
    logAnalyticsWorkspaceId: pulumi.Input<string>;
    /**
     * The name which should be used for this Office IRM Data Connector. Changing this forces a new Office IRM Data Connector to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the tenant that this Office IRM Data Connector connects to. Changing this forces a new Office IRM Data Connector to be created.
     *
     * > **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
     */
    tenantId?: pulumi.Input<string>;
}
