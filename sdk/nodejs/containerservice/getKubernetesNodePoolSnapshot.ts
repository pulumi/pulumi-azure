// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Kubernetes Node Pool Snapshot.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.containerservice.getKubernetesNodePoolSnapshot({
 *     name: "example",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getKubernetesNodePoolSnapshot(args: GetKubernetesNodePoolSnapshotArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesNodePoolSnapshotResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:containerservice/getKubernetesNodePoolSnapshot:getKubernetesNodePoolSnapshot", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesNodePoolSnapshot.
 */
export interface GetKubernetesNodePoolSnapshotArgs {
    /**
     * The name of the Kubernetes Node Pool Snapshot.
     */
    name: string;
    /**
     * The name of the Resource Group in which the Kubernetes Node Pool Snapshot exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getKubernetesNodePoolSnapshot.
 */
export interface GetKubernetesNodePoolSnapshotResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * The ID of the source Node Pool.
     */
    readonly sourceNodePoolId: string;
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Kubernetes Node Pool Snapshot.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.containerservice.getKubernetesNodePoolSnapshot({
 *     name: "example",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getKubernetesNodePoolSnapshotOutput(args: GetKubernetesNodePoolSnapshotOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesNodePoolSnapshotResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesNodePoolSnapshot(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesNodePoolSnapshot.
 */
export interface GetKubernetesNodePoolSnapshotOutputArgs {
    /**
     * The name of the Kubernetes Node Pool Snapshot.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group in which the Kubernetes Node Pool Snapshot exists.
     */
    resourceGroupName: pulumi.Input<string>;
}