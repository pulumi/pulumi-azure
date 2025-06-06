// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Sentinel Threat Intelligence Alert Rule.
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
 * const exampleAnalyticsWorkspace = new azure.operationalinsights.AnalyticsWorkspace("example", {
 *     name: "example-workspace",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "pergb2018",
 * });
 * const exampleAnalyticsSolution = new azure.operationalinsights.AnalyticsSolution("example", {
 *     solutionName: "SecurityInsights",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     workspaceResourceId: exampleAnalyticsWorkspace.id,
 *     workspaceName: exampleAnalyticsWorkspace.name,
 *     plan: {
 *         publisher: "Microsoft",
 *         product: "OMSGallery/SecurityInsights",
 *     },
 * });
 * const example = azure.sentinel.getAlertRuleTemplateOutput({
 *     displayName: "(Preview) Microsoft Defender Threat Intelligence Analytics",
 *     logAnalyticsWorkspaceId: exampleAnalyticsSolution.workspaceResourceId,
 * });
 * const exampleAlertRuleThreatIntelligence = new azure.sentinel.AlertRuleThreatIntelligence("example", {
 *     name: "example-rule",
 *     logAnalyticsWorkspaceId: exampleAnalyticsSolution.workspaceResourceId,
 *     alertRuleTemplateGuid: example.apply(example => example.name),
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.OperationalInsights`: 2023-12-01-preview
 *
 * ## Import
 *
 * Sentinel Threat Intelligence Alert Rules can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/alertRules/rule1
 * ```
 */
export class AlertRuleThreatIntelligence extends pulumi.CustomResource {
    /**
     * Get an existing AlertRuleThreatIntelligence resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertRuleThreatIntelligenceState, opts?: pulumi.CustomResourceOptions): AlertRuleThreatIntelligence {
        return new AlertRuleThreatIntelligence(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence';

    /**
     * Returns true if the given object is an instance of AlertRuleThreatIntelligence.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertRuleThreatIntelligence {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertRuleThreatIntelligence.__pulumiType;
    }

    /**
     * The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    public readonly alertRuleTemplateGuid!: pulumi.Output<string>;
    /**
     * Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    public readonly logAnalyticsWorkspaceId!: pulumi.Output<string>;
    /**
     * The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AlertRuleThreatIntelligence resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertRuleThreatIntelligenceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertRuleThreatIntelligenceArgs | AlertRuleThreatIntelligenceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertRuleThreatIntelligenceState | undefined;
            resourceInputs["alertRuleTemplateGuid"] = state ? state.alertRuleTemplateGuid : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["logAnalyticsWorkspaceId"] = state ? state.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AlertRuleThreatIntelligenceArgs | undefined;
            if ((!args || args.alertRuleTemplateGuid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'alertRuleTemplateGuid'");
            }
            if ((!args || args.logAnalyticsWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logAnalyticsWorkspaceId'");
            }
            resourceInputs["alertRuleTemplateGuid"] = args ? args.alertRuleTemplateGuid : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["logAnalyticsWorkspaceId"] = args ? args.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertRuleThreatIntelligence.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertRuleThreatIntelligence resources.
 */
export interface AlertRuleThreatIntelligenceState {
    /**
     * The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    alertRuleTemplateGuid?: pulumi.Input<string>;
    /**
     * Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    logAnalyticsWorkspaceId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AlertRuleThreatIntelligence resource.
 */
export interface AlertRuleThreatIntelligenceArgs {
    /**
     * The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    alertRuleTemplateGuid: pulumi.Input<string>;
    /**
     * Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    logAnalyticsWorkspaceId: pulumi.Input<string>;
    /**
     * The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
     */
    name?: pulumi.Input<string>;
}
