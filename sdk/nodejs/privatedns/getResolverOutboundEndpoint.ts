// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Gets information about an existing Private DNS Resolver Outbound Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.privatedns.getResolverOutboundEndpoint({
 *     name: "example-endpoint",
 *     privateDnsResolverId: "example-private-dns-resolver-id",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2022-07-01
 */
export function getResolverOutboundEndpoint(args: GetResolverOutboundEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetResolverOutboundEndpointResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:privatedns/getResolverOutboundEndpoint:getResolverOutboundEndpoint", {
        "name": args.name,
        "privateDnsResolverId": args.privateDnsResolverId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverOutboundEndpoint.
 */
export interface GetResolverOutboundEndpointArgs {
    /**
     * Name of the Private DNS Resolver Outbound Endpoint.
     */
    name: string;
    /**
     * ID of the Private DNS Resolver Outbound Endpoint.
     */
    privateDnsResolverId: string;
}

/**
 * A collection of values returned by getResolverOutboundEndpoint.
 */
export interface GetResolverOutboundEndpointResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Private DNS Resolver Outbound Endpoint exists.
     */
    readonly location: string;
    readonly name: string;
    readonly privateDnsResolverId: string;
    /**
     * The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
     */
    readonly subnetId: string;
    /**
     * The tags assigned to the Private DNS Resolver Outbound Endpoint.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Gets information about an existing Private DNS Resolver Outbound Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.privatedns.getResolverOutboundEndpoint({
 *     name: "example-endpoint",
 *     privateDnsResolverId: "example-private-dns-resolver-id",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2022-07-01
 */
export function getResolverOutboundEndpointOutput(args: GetResolverOutboundEndpointOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetResolverOutboundEndpointResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:privatedns/getResolverOutboundEndpoint:getResolverOutboundEndpoint", {
        "name": args.name,
        "privateDnsResolverId": args.privateDnsResolverId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverOutboundEndpoint.
 */
export interface GetResolverOutboundEndpointOutputArgs {
    /**
     * Name of the Private DNS Resolver Outbound Endpoint.
     */
    name: pulumi.Input<string>;
    /**
     * ID of the Private DNS Resolver Outbound Endpoint.
     */
    privateDnsResolverId: pulumi.Input<string>;
}
