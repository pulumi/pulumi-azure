// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Kusto Database
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = pulumi.output(azure.kusto.getDatabase({
 *     clusterName: "test_cluster",
 *     name: "my-kusto-database",
 *     resourceGroupName: "test_resource_group",
 * }));
 * ```
 */
export function getDatabase(args: GetDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("azure:kusto/getDatabase:getDatabase", {
        "clusterName": args.clusterName,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseArgs {
    /**
     * The name of the Kusto Cluster this database is added to.
     */
    clusterName: string;
    /**
     * The name of the Kusto Database.
     */
    name: string;
    /**
     * The Resource Group where the Kusto Database exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getDatabase.
 */
export interface GetDatabaseResult {
    readonly clusterName: string;
    /**
     * The time the data that should be kept in cache for fast queries as ISO 8601 timespan.
     */
    readonly hotCachePeriod: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region in which the managed Kusto Database exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * The size of the database in bytes.
     */
    readonly size: number;
    /**
     * The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan.
     */
    readonly softDeletePeriod: string;
}

export function getDatabaseOutput(args: GetDatabaseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseResult> {
    return pulumi.output(args).apply(a => getDatabase(a, opts))
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseOutputArgs {
    /**
     * The name of the Kusto Cluster this database is added to.
     */
    clusterName: pulumi.Input<string>;
    /**
     * The name of the Kusto Database.
     */
    name: pulumi.Input<string>;
    /**
     * The Resource Group where the Kusto Database exists.
     */
    resourceGroupName: pulumi.Input<string>;
}