// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Public IP Prefix.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.network.getPublicIpPrefix({
 *     name: "name_of_public_ip",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const publicIpPrefix = example.then(example => example.ipPrefix);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 */
export function getPublicIpPrefix(args: GetPublicIpPrefixArgs, opts?: pulumi.InvokeOptions): Promise<GetPublicIpPrefixResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:network/getPublicIpPrefix:getPublicIpPrefix", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIpPrefix.
 */
export interface GetPublicIpPrefixArgs {
    /**
     * Specifies the name of the public IP prefix.
     */
    name: string;
    /**
     * Specifies the name of the resource group.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getPublicIpPrefix.
 */
export interface GetPublicIpPrefixResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Public IP address range, in CIDR notation.
     */
    readonly ipPrefix: string;
    /**
     * The supported Azure location where the resource exists.
     */
    readonly location: string;
    readonly name: string;
    /**
     * The number of bits of the prefix.
     */
    readonly prefixLength: number;
    readonly resourceGroupName: string;
    /**
     * The SKU of the Public IP Prefix.
     */
    readonly sku: string;
    /**
     * The SKU Tier of the Public IP.
     */
    readonly skuTier: string;
    /**
     * A mapping of tags to assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * A list of Availability Zones in which this Public IP Prefix is located.
     */
    readonly zones: string[];
}
/**
 * Use this data source to access information about an existing Public IP Prefix.
 *
 * ## Example Usage
 *
 * ### Reference An Existing)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.network.getPublicIpPrefix({
 *     name: "name_of_public_ip",
 *     resourceGroupName: "name_of_resource_group",
 * });
 * export const publicIpPrefix = example.then(example => example.ipPrefix);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2024-05-01
 */
export function getPublicIpPrefixOutput(args: GetPublicIpPrefixOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPublicIpPrefixResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:network/getPublicIpPrefix:getPublicIpPrefix", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPublicIpPrefix.
 */
export interface GetPublicIpPrefixOutputArgs {
    /**
     * Specifies the name of the public IP prefix.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the resource group.
     */
    resourceGroupName: pulumi.Input<string>;
}
