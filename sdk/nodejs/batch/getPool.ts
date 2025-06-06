// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Batch pool
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.batch.getPool({
 *     name: "testbatchpool",
 *     accountName: "testbatchaccount",
 *     resourceGroupName: "test",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Batch`: 2024-07-01
 */
export function getPool(args: GetPoolArgs, opts?: pulumi.InvokeOptions): Promise<GetPoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:batch/getPool:getPool", {
        "accountName": args.accountName,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPool.
 */
export interface GetPoolArgs {
    /**
     * The Azure Storage Account name.
     */
    accountName: string;
    /**
     * The name of the user account.
     */
    name: string;
    resourceGroupName: string;
}

/**
 * A collection of values returned by getPool.
 */
export interface GetPoolResult {
    /**
     * The Azure Storage Account name.
     */
    readonly accountName: string;
    /**
     * A `autoScale` block that describes the scale settings when using auto scale.
     */
    readonly autoScales: outputs.batch.GetPoolAutoScale[];
    /**
     * One or more `certificate` blocks that describe the certificates installed on each compute node in the pool.
     */
    readonly certificates: outputs.batch.GetPoolCertificate[];
    /**
     * The container configuration used in the pool's VMs.
     */
    readonly containerConfigurations: outputs.batch.GetPoolContainerConfiguration[];
    /**
     * A `dataDisks` block describes the data disk settings.
     */
    readonly dataDisks: outputs.batch.GetPoolDataDisk[];
    /**
     * A `diskEncryption` block describes the disk encryption configuration applied on compute nodes in the pool.
     */
    readonly diskEncryptions: outputs.batch.GetPoolDiskEncryption[];
    readonly displayName: string;
    /**
     * An `extensions` block describes the extension settings
     */
    readonly extensions: outputs.batch.GetPoolExtension[];
    /**
     * A `fixedScale` block that describes the scale settings when using fixed scale.
     */
    readonly fixedScales: outputs.batch.GetPoolFixedScale[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Whether the pool permits direct communication between nodes. This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool.
     */
    readonly interNodeCommunication: string;
    /**
     * The type of on-premises license to be used when deploying the operating system.
     */
    readonly licenseType: string;
    /**
     * The maximum number of tasks that can run concurrently on a single compute node in the pool.
     */
    readonly maxTasksPerNode: number;
    readonly metadata: {[key: string]: string};
    /**
     * A `mount` block that describes mount configuration.
     */
    readonly mounts: outputs.batch.GetPoolMount[];
    /**
     * The name of the user account.
     */
    readonly name: string;
    readonly networkConfigurations: outputs.batch.GetPoolNetworkConfiguration[];
    /**
     * The SKU of the node agents in the Batch pool.
     */
    readonly nodeAgentSkuId: string;
    /**
     * A `nodePlacement` block that describes the placement policy for allocating nodes in the pool.
     */
    readonly nodePlacements: outputs.batch.GetPoolNodePlacement[];
    /**
     * Specifies the ephemeral disk placement for operating system disk for all VMs in the pool.
     */
    readonly osDiskPlacement: string;
    readonly resourceGroupName: string;
    /**
     * A `startTask` block that describes the start task settings for the Batch pool.
     */
    readonly startTasks: outputs.batch.GetPoolStartTask[];
    /**
     * The reference of the storage image used by the nodes in the Batch pool.
     */
    readonly storageImageReferences: outputs.batch.GetPoolStorageImageReference[];
    /**
     * A `taskSchedulingPolicy` block that describes how tasks are distributed across compute nodes in a pool.
     */
    readonly taskSchedulingPolicies: outputs.batch.GetPoolTaskSchedulingPolicy[];
    /**
     * A `userAccounts` block that describes the list of user accounts to be created on each node in the pool.
     */
    readonly userAccounts: outputs.batch.GetPoolUserAccount[];
    /**
     * The size of the VM created in the Batch pool.
     */
    readonly vmSize: string;
    /**
     * A `windows` block that describes the Windows configuration in the pool.
     */
    readonly windows: outputs.batch.GetPoolWindow[];
}
/**
 * Use this data source to access information about an existing Batch pool
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.batch.getPool({
 *     name: "testbatchpool",
 *     accountName: "testbatchaccount",
 *     resourceGroupName: "test",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Batch`: 2024-07-01
 */
export function getPoolOutput(args: GetPoolOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPoolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:batch/getPool:getPool", {
        "accountName": args.accountName,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPool.
 */
export interface GetPoolOutputArgs {
    /**
     * The Azure Storage Account name.
     */
    accountName: pulumi.Input<string>;
    /**
     * The name of the user account.
     */
    name: pulumi.Input<string>;
    resourceGroupName: pulumi.Input<string>;
}
