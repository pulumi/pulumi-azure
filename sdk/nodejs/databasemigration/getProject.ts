// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Database Migration Project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.databasemigration.getProject({
 *     name: "example-dbms-project",
 *     resourceGroupName: "example-rg",
 *     serviceName: "example-dbms",
 * });
 * export const name = example.then(example => example.name);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DataMigration`: 2021-06-30
 */
export function getProject(args: GetProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:databasemigration/getProject:getProject", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectArgs {
    /**
     * Name of the database migration project.
     */
    name: string;
    /**
     * Name of the resource group where resource belongs to.
     */
    resourceGroupName: string;
    /**
     * Name of the database migration service where resource belongs to.
     */
    serviceName: string;
}

/**
 * A collection of values returned by getProject.
 */
export interface GetProjectResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Azure location where the resource exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    readonly serviceName: string;
    /**
     * The platform type of the migration source.
     */
    readonly sourcePlatform: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * The platform type of the migration target.
     */
    readonly targetPlatform: string;
}
/**
 * Use this data source to access information about an existing Database Migration Project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.databasemigration.getProject({
 *     name: "example-dbms-project",
 *     resourceGroupName: "example-rg",
 *     serviceName: "example-dbms",
 * });
 * export const name = example.then(example => example.name);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DataMigration`: 2021-06-30
 */
export function getProjectOutput(args: GetProjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetProjectResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:databasemigration/getProject:getProject", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "serviceName": args.serviceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectOutputArgs {
    /**
     * Name of the database migration project.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the resource group where resource belongs to.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Name of the database migration service where resource belongs to.
     */
    serviceName: pulumi.Input<string>;
}
