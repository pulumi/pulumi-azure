// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Azure Web Pubsub service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.webpubsub.getService({
 *     name: "test-webpubsub",
 *     resourceGroupName: "wps-resource-group",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.SignalRService`: 2024-03-01
 */
export function getService(args: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:webpubsub/getService:getService", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * Specifies the name of the Web Pubsub service.
     */
    name: string;
    /**
     * Specifies the name of the resource group the Web Pubsub service is located in.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    readonly aadAuthEnabled: boolean;
    readonly capacity: number;
    readonly externalIp: string;
    /**
     * The FQDN of the Web Pubsub service.
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly localAuthEnabled: boolean;
    /**
     * The Azure location where the Web Pubsub service exists.
     */
    readonly location: string;
    readonly name: string;
    /**
     * The primary access key of the Web Pubsub service.
     */
    readonly primaryAccessKey: string;
    /**
     * The primary connection string of the Web Pubsub service.
     */
    readonly primaryConnectionString: string;
    readonly publicNetworkAccessEnabled: boolean;
    /**
     * The publicly accessible port of the Web Pubsub service which is designed for browser/client use.
     */
    readonly publicPort: number;
    readonly resourceGroupName: string;
    /**
     * The secondary access key of the Web Pubsub service.
     */
    readonly secondaryAccessKey: string;
    /**
     * The secondary connection string of the Web Pubsub service.
     */
    readonly secondaryConnectionString: string;
    /**
     * The publicly accessible port of the Web Pubsub service which is designed for customer server side use.
     */
    readonly serverPort: number;
    readonly sku: string;
    readonly tags: {[key: string]: string};
    readonly tlsClientCertEnabled: boolean;
    readonly version: string;
}
/**
 * Use this data source to access information about an existing Azure Web Pubsub service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.webpubsub.getService({
 *     name: "test-webpubsub",
 *     resourceGroupName: "wps-resource-group",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.SignalRService`: 2024-03-01
 */
export function getServiceOutput(args: GetServiceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:webpubsub/getService:getService", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceOutputArgs {
    /**
     * Specifies the name of the Web Pubsub service.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group the Web Pubsub service is located in.
     */
    resourceGroupName: pulumi.Input<string>;
}
