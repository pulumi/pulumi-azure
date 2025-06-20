// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access the properties of a LogToMetricAction scheduled query rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.monitoring.getScheduledQueryRulesLog({
 *     resourceGroupName: "example-rg",
 *     name: "tfex-queryrule",
 * });
 * export const queryRuleId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Insights`: 2018-04-16
 */
export function getScheduledQueryRulesLog(args: GetScheduledQueryRulesLogArgs, opts?: pulumi.InvokeOptions): Promise<GetScheduledQueryRulesLogResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:monitoring/getScheduledQueryRulesLog:getScheduledQueryRulesLog", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getScheduledQueryRulesLog.
 */
export interface GetScheduledQueryRulesLogArgs {
    /**
     * Specifies the name of the scheduled query rule.
     */
    name: string;
    /**
     * Specifies the name of the resource group where the scheduled query rule is located.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getScheduledQueryRulesLog.
 */
export interface GetScheduledQueryRulesLogResult {
    /**
     * A list of IDs of Resources referred into query.
     */
    readonly authorizedResourceIds: string[];
    /**
     * A `criteria` block as defined below.
     */
    readonly criterias: outputs.monitoring.GetScheduledQueryRulesLogCriteria[];
    /**
     * The resource URI over which log search query is to be run.
     */
    readonly dataSourceId: string;
    /**
     * The description of the scheduled query rule.
     */
    readonly description: string;
    /**
     * Whether this scheduled query rule is enabled.
     */
    readonly enabled: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies the Azure Region where the resource should exist.
     */
    readonly location: string;
    /**
     * Name of the dimension.
     */
    readonly name: string;
    readonly resourceGroupName: string;
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access the properties of a LogToMetricAction scheduled query rule.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.monitoring.getScheduledQueryRulesLog({
 *     resourceGroupName: "example-rg",
 *     name: "tfex-queryrule",
 * });
 * export const queryRuleId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Insights`: 2018-04-16
 */
export function getScheduledQueryRulesLogOutput(args: GetScheduledQueryRulesLogOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetScheduledQueryRulesLogResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:monitoring/getScheduledQueryRulesLog:getScheduledQueryRulesLog", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getScheduledQueryRulesLog.
 */
export interface GetScheduledQueryRulesLogOutputArgs {
    /**
     * Specifies the name of the scheduled query rule.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group where the scheduled query rule is located.
     */
    resourceGroupName: pulumi.Input<string>;
}
