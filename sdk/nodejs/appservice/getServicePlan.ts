// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Service Plan.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.appservice.getServicePlan({
 *     name: "existing",
 *     resourceGroupName: "existing",
 * });
 * export const id = example.then(example => example.id);
 * ```
 */
export function getServicePlan(args: GetServicePlanArgs, opts?: pulumi.InvokeOptions): Promise<GetServicePlanResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("azure:appservice/getServicePlan:getServicePlan", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getServicePlan.
 */
export interface GetServicePlanArgs {
    /**
     * The name of this Service Plan.
     */
    name: string;
    /**
     * The name of the Resource Group where the Service Plan exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getServicePlan.
 */
export interface GetServicePlanResult {
    /**
     * The ID of the App Service Environment this Service Plan is part of.
     */
    readonly appServiceEnvironmentId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A string representing the Kind of Service Plan.
     */
    readonly kind: string;
    /**
     * The Azure Region where the Service Plan exists.
     */
    readonly location: string;
    /**
     * The maximum number of workers in use in an Elastic SKU Plan.
     */
    readonly maximumElasticWorkerCount: number;
    readonly name: string;
    /**
     * The O/S type for the App Services hosted in this plan.
     */
    readonly osType: string;
    /**
     * Is Per Site Scaling be enabled?
     */
    readonly perSiteScalingEnabled: boolean;
    /**
     * Whether this is a reserved Service Plan Type. `true` if `osType` is `Linux`, otherwise `false`.
     */
    readonly reserved: boolean;
    readonly resourceGroupName: string;
    /**
     * The SKU for the Service Plan.
     */
    readonly skuName: string;
    /**
     * A mapping of tags assigned to the Service Plan.
     */
    readonly tags: {[key: string]: string};
    /**
     * The number of Workers (instances) allocated.
     */
    readonly workerCount: number;
    /**
     * Is the Service Plan balance across Availability Zones in the region?
     */
    readonly zoneBalancingEnabled: boolean;
}

export function getServicePlanOutput(args: GetServicePlanOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServicePlanResult> {
    return pulumi.output(args).apply(a => getServicePlan(a, opts))
}

/**
 * A collection of arguments for invoking getServicePlan.
 */
export interface GetServicePlanOutputArgs {
    /**
     * The name of this Service Plan.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Service Plan exists.
     */
    resourceGroupName: pulumi.Input<string>;
}