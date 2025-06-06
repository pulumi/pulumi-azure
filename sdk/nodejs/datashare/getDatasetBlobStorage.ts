// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Data Share Blob Storage Dataset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.datashare.getDatasetBlobStorage({
 *     name: "example-dsbsds",
 *     dataShareId: "example-share-id",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DataShare`: 2019-11-01
 */
export function getDatasetBlobStorage(args: GetDatasetBlobStorageArgs, opts?: pulumi.InvokeOptions): Promise<GetDatasetBlobStorageResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:datashare/getDatasetBlobStorage:getDatasetBlobStorage", {
        "dataShareId": args.dataShareId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatasetBlobStorage.
 */
export interface GetDatasetBlobStorageArgs {
    /**
     * The ID of the Data Share in which this Data Share Blob Storage Dataset should be created.
     */
    dataShareId: string;
    /**
     * The name of this Data Share Blob Storage Dataset.
     */
    name: string;
}

/**
 * A collection of values returned by getDatasetBlobStorage.
 */
export interface GetDatasetBlobStorageResult {
    /**
     * The name of the storage account container to be shared with the receiver.
     */
    readonly containerName: string;
    readonly dataShareId: string;
    /**
     * The name of the Data Share Dataset.
     */
    readonly displayName: string;
    /**
     * The path of the file in the storage container to be shared with the receiver.
     */
    readonly filePath: string;
    /**
     * The folder path of the file in the storage container to be shared with the receiver.
     */
    readonly folderPath: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the storage account to be shared with the receiver.
     */
    readonly name: string;
    /**
     * A `storageAccount` block as defined below.
     */
    readonly storageAccounts: outputs.datashare.GetDatasetBlobStorageStorageAccount[];
}
/**
 * Use this data source to access information about an existing Data Share Blob Storage Dataset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.datashare.getDatasetBlobStorage({
 *     name: "example-dsbsds",
 *     dataShareId: "example-share-id",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DataShare`: 2019-11-01
 */
export function getDatasetBlobStorageOutput(args: GetDatasetBlobStorageOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDatasetBlobStorageResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:datashare/getDatasetBlobStorage:getDatasetBlobStorage", {
        "dataShareId": args.dataShareId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatasetBlobStorage.
 */
export interface GetDatasetBlobStorageOutputArgs {
    /**
     * The ID of the Data Share in which this Data Share Blob Storage Dataset should be created.
     */
    dataShareId: pulumi.Input<string>;
    /**
     * The name of this Data Share Blob Storage Dataset.
     */
    name: pulumi.Input<string>;
}
