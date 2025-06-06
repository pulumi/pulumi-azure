// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Workspace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.monitoring.getWorkspace({
 *     name: "example-workspace",
 *     resourceGroupName: exampleAzurermResourceGroup.name,
 * });
 * export const queryEndpoint = example.then(example => example.queryEndpoint);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Monitor`: 2023-04-03
 */
export function getWorkspace(args: GetWorkspaceArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkspaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:monitoring/getWorkspace:getWorkspace", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceArgs {
    /**
     * Specifies the name of the Workspace.
     */
    name: string;
    /**
     * Specifies the name of the resource group the Workspace is located in.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getWorkspace.
 */
export interface GetWorkspaceResult {
    /**
     * The ID of the managed default Data Collection Endpoint created with the Azure Monitor Workspace.
     */
    readonly defaultDataCollectionEndpointId: string;
    /**
     * The ID of the managed default Data Collection Rule created with the Azure Monitor Workspace.
     */
    readonly defaultDataCollectionRuleId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Workspace is located.
     */
    readonly location: string;
    readonly name: string;
    /**
     * Whether network access from public internet to the Workspace are allowed.
     */
    readonly publicNetworkAccessEnabled: boolean;
    /**
     * The query endpoint for the Azure Monitor Workspace.
     */
    readonly queryEndpoint: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags that are assigned to the Workspace.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Workspace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.monitoring.getWorkspace({
 *     name: "example-workspace",
 *     resourceGroupName: exampleAzurermResourceGroup.name,
 * });
 * export const queryEndpoint = example.then(example => example.queryEndpoint);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Monitor`: 2023-04-03
 */
export function getWorkspaceOutput(args: GetWorkspaceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetWorkspaceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:monitoring/getWorkspace:getWorkspace", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceOutputArgs {
    /**
     * Specifies the name of the Workspace.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group the Workspace is located in.
     */
    resourceGroupName: pulumi.Input<string>;
}
