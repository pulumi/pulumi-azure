// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Consumption Budget for a specific resource group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.consumption.getBudgetResourceGroup({
 *     name: "existing",
 *     resourceGroupId: exampleAzurermResourceGroup.id,
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Consumption`: 2019-10-01
 */
export function getBudgetResourceGroup(args: GetBudgetResourceGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetBudgetResourceGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:consumption/getBudgetResourceGroup:getBudgetResourceGroup", {
        "name": args.name,
        "resourceGroupId": args.resourceGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBudgetResourceGroup.
 */
export interface GetBudgetResourceGroupArgs {
    /**
     * The name of this Consumption Budget.
     */
    name: string;
    /**
     * The ID of the subscription.
     */
    resourceGroupId: string;
}

/**
 * A collection of values returned by getBudgetResourceGroup.
 */
export interface GetBudgetResourceGroupResult {
    /**
     * The total amount of cost to track with the budget.
     */
    readonly amount: number;
    /**
     * A `filter` block as defined below.
     */
    readonly filters: outputs.consumption.GetBudgetResourceGroupFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the tag used for the filter.
     */
    readonly name: string;
    /**
     * A `notification` block as defined below.
     */
    readonly notifications: outputs.consumption.GetBudgetResourceGroupNotification[];
    readonly resourceGroupId: string;
    /**
     * The time covered by a budget.
     */
    readonly timeGrain: string;
    /**
     * A `timePeriod` block as defined below.
     */
    readonly timePeriods: outputs.consumption.GetBudgetResourceGroupTimePeriod[];
}
/**
 * Use this data source to access information about an existing Consumption Budget for a specific resource group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.consumption.getBudgetResourceGroup({
 *     name: "existing",
 *     resourceGroupId: exampleAzurermResourceGroup.id,
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Consumption`: 2019-10-01
 */
export function getBudgetResourceGroupOutput(args: GetBudgetResourceGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBudgetResourceGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:consumption/getBudgetResourceGroup:getBudgetResourceGroup", {
        "name": args.name,
        "resourceGroupId": args.resourceGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBudgetResourceGroup.
 */
export interface GetBudgetResourceGroupOutputArgs {
    /**
     * The name of this Consumption Budget.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the subscription.
     */
    resourceGroupId: pulumi.Input<string>;
}
