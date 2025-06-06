// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Redis Cache
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.redis.getCache({
 *     name: "myrediscache",
 *     resourceGroupName: "redis-cache",
 * });
 * export const primaryAccessKey = example.then(example => example.primaryAccessKey);
 * export const hostname = example.then(example => example.hostname);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Cache`: 2024-11-01
 */
export function getCache(args: GetCacheArgs, opts?: pulumi.InvokeOptions): Promise<GetCacheResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:redis/getCache:getCache", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCache.
 */
export interface GetCacheArgs {
    /**
     * The name of the Redis cache
     */
    name: string;
    /**
     * The name of the resource group the Redis cache instance is located in.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getCache.
 */
export interface GetCacheResult {
    /**
     * Specifies if access key authentication is enabled.
     */
    readonly accessKeysAuthenticationEnabled: boolean;
    /**
     * The size of the Redis Cache deployed.
     */
    readonly capacity: number;
    /**
     * The SKU family/pricing group used. Possible values are `C` (for Basic/Standard SKU family) and `P` (for `Premium`)
     */
    readonly family: string;
    /**
     * The Hostname of the Redis Instance
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The location of the Redis Cache.
     */
    readonly location: string;
    /**
     * The minimum TLS version.
     */
    readonly minimumTlsVersion: string;
    readonly name: string;
    readonly nonSslPortEnabled: boolean;
    /**
     * A list of `patchSchedule` blocks as defined below.
     */
    readonly patchSchedules: outputs.redis.GetCachePatchSchedule[];
    /**
     * The non-SSL Port of the Redis Instance
     */
    readonly port: number;
    /**
     * The Primary Access Key for the Redis Instance
     */
    readonly primaryAccessKey: string;
    /**
     * The primary connection string of the Redis Instance.
     */
    readonly primaryConnectionString: string;
    /**
     * The Static IP Address assigned to the Redis Cache when hosted inside the Virtual Network.
     */
    readonly privateStaticIpAddress: string;
    /**
     * A `redisConfiguration` block as defined below.
     */
    readonly redisConfigurations: outputs.redis.GetCacheRedisConfiguration[];
    readonly resourceGroupName: string;
    /**
     * The Secondary Access Key for the Redis Instance
     */
    readonly secondaryAccessKey: string;
    /**
     * The secondary connection string of the Redis Instance.
     */
    readonly secondaryConnectionString: string;
    readonly shardCount: number;
    /**
     * The SKU of Redis used. Possible values are `Basic`, `Standard` and `Premium`.
     */
    readonly skuName: string;
    /**
     * The SSL Port of the Redis Instance
     */
    readonly sslPort: number;
    readonly subnetId: string;
    readonly tags: {[key: string]: string};
    /**
     * A list of Availability Zones in which this Redis Cache is located.
     */
    readonly zones: string[];
}
/**
 * Use this data source to access information about an existing Redis Cache
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.redis.getCache({
 *     name: "myrediscache",
 *     resourceGroupName: "redis-cache",
 * });
 * export const primaryAccessKey = example.then(example => example.primaryAccessKey);
 * export const hostname = example.then(example => example.hostname);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Cache`: 2024-11-01
 */
export function getCacheOutput(args: GetCacheOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCacheResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:redis/getCache:getCache", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCache.
 */
export interface GetCacheOutputArgs {
    /**
     * The name of the Redis cache
     */
    name: pulumi.Input<string>;
    /**
     * The name of the resource group the Redis cache instance is located in.
     */
    resourceGroupName: pulumi.Input<string>;
}
