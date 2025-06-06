// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.notificationhub.getHub({
 *     name: "notification-hub",
 *     namespaceName: "namespace-name",
 *     resourceGroupName: "resource-group-name",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.NotificationHubs`: 2023-09-01
 */
export function getHub(args: GetHubArgs, opts?: pulumi.InvokeOptions): Promise<GetHubResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:notificationhub/getHub:getHub", {
        "name": args.name,
        "namespaceName": args.namespaceName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getHub.
 */
export interface GetHubArgs {
    /**
     * Specifies the Name of the Notification Hub.
     */
    name: string;
    /**
     * Specifies the Name of the Notification Hub Namespace which contains the Notification Hub.
     */
    namespaceName: string;
    /**
     * Specifies the Name of the Resource Group within which the Notification Hub exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getHub.
 */
export interface GetHubResult {
    /**
     * A `apnsCredential` block as defined below.
     */
    readonly apnsCredentials: outputs.notificationhub.GetHubApnsCredential[];
    /**
     * A `gcmCredential` block as defined below.
     */
    readonly gcmCredentials: outputs.notificationhub.GetHubGcmCredential[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region in which this Notification Hub exists.
     */
    readonly location: string;
    readonly name: string;
    readonly namespaceName: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.notificationhub.getHub({
 *     name: "notification-hub",
 *     namespaceName: "namespace-name",
 *     resourceGroupName: "resource-group-name",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.NotificationHubs`: 2023-09-01
 */
export function getHubOutput(args: GetHubOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHubResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:notificationhub/getHub:getHub", {
        "name": args.name,
        "namespaceName": args.namespaceName,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getHub.
 */
export interface GetHubOutputArgs {
    /**
     * Specifies the Name of the Notification Hub.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the Name of the Notification Hub Namespace which contains the Notification Hub.
     */
    namespaceName: pulumi.Input<string>;
    /**
     * Specifies the Name of the Resource Group within which the Notification Hub exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
