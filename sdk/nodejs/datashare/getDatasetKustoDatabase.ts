// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Data Share Kusto Database Dataset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.datashare.getDatasetKustoDatabase({
 *     name: "example-dskdds",
 *     shareId: "example-share-id",
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
export function getDatasetKustoDatabase(args: GetDatasetKustoDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetDatasetKustoDatabaseResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:datashare/getDatasetKustoDatabase:getDatasetKustoDatabase", {
        "name": args.name,
        "shareId": args.shareId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatasetKustoDatabase.
 */
export interface GetDatasetKustoDatabaseArgs {
    /**
     * The name of this Data Share Kusto Database Dataset.
     */
    name: string;
    /**
     * The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
     */
    shareId: string;
}

/**
 * A collection of values returned by getDatasetKustoDatabase.
 */
export interface GetDatasetKustoDatabaseResult {
    /**
     * The name of the Data Share Dataset.
     */
    readonly displayName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The location of the Kusto Cluster.
     */
    readonly kustoClusterLocation: string;
    /**
     * The resource ID of the Kusto Cluster Database to be shared with the receiver.
     */
    readonly kustoDatabaseId: string;
    readonly name: string;
    readonly shareId: string;
}
/**
 * Use this data source to access information about an existing Data Share Kusto Database Dataset.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.datashare.getDatasetKustoDatabase({
 *     name: "example-dskdds",
 *     shareId: "example-share-id",
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
export function getDatasetKustoDatabaseOutput(args: GetDatasetKustoDatabaseOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDatasetKustoDatabaseResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:datashare/getDatasetKustoDatabase:getDatasetKustoDatabase", {
        "name": args.name,
        "shareId": args.shareId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatasetKustoDatabase.
 */
export interface GetDatasetKustoDatabaseOutputArgs {
    /**
     * The name of this Data Share Kusto Database Dataset.
     */
    name: pulumi.Input<string>;
    /**
     * The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
     */
    shareId: pulumi.Input<string>;
}
