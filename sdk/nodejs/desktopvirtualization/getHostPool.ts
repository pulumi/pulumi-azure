// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Virtual Desktop Host Pool.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.desktopvirtualization.getHostPool({
 *     name: "example-pool",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getHostPool(args: GetHostPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetHostPoolResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:desktopvirtualization/getHostPool:getHostPool", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getHostPool.
 */
export interface GetHostPoolArgs {
    /**
     * The name of the Virtual Desktop Host Pool to retrieve.
     */
    name: string;
    /**
     * The name of the resource group where the Virtual Desktop Host Pool exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getHostPool.
 */
export interface GetHostPoolResult {
    /**
     * The custom RDP properties string for the Virtual Desktop Host Pool.
     */
    readonly customRdpProperties: string;
    /**
     * The description for the Virtual Desktop Host Pool.
     */
    readonly description: string;
    /**
     * The friendly name for the Virtual Desktop Host Pool.
     */
    readonly friendlyName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The type of load balancing performed by the Host Pool
     */
    readonly loadBalancerType: string;
    /**
     * The location/region where the Virtual Desktop Host Pool is located.
     */
    readonly location: string;
    /**
     * The maximum number of users that can have concurrent sessions on a session host.
     */
    readonly maximumSessionsAllowed: number;
    readonly name: string;
    /**
     * The type of personal desktop assignment in use by the Host Pool
     */
    readonly personalDesktopAssignmentType: string;
    /**
     * The preferred Application Group type for the Virtual Desktop Host Pool.
     */
    readonly preferredAppGroupType: string;
    readonly resourceGroupName: string;
    /**
     * A `scheduledAgentUpdates` block as defined below.
     */
    readonly scheduledAgentUpdates: outputs.desktopvirtualization.GetHostPoolScheduledAgentUpdate[];
    /**
     * Returns `true` if the Start VM on Connection Feature is enabled.
     */
    readonly startVmOnConnect: boolean;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * The type of the Virtual Desktop Host Pool.
     */
    readonly type: string;
    /**
     * Returns `true` if the Host Pool is in Validation mode.
     */
    readonly validateEnvironment: boolean;
}
/**
 * Use this data source to access information about an existing Virtual Desktop Host Pool.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.desktopvirtualization.getHostPool({
 *     name: "example-pool",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getHostPoolOutput(args: GetHostPoolOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHostPoolResult> {
    return pulumi.output(args).apply((a: any) => getHostPool(a, opts))
}

/**
 * A collection of arguments for invoking getHostPool.
 */
export interface GetHostPoolOutputArgs {
    /**
     * The name of the Virtual Desktop Host Pool to retrieve.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the resource group where the Virtual Desktop Host Pool exists.
     */
    resourceGroupName: pulumi.Input<string>;
}