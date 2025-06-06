// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Front Door (standard/premium) Profile.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.cdn.getFrontdoorProfile({
 *     name: "existing-cdn-profile",
 *     resourceGroupName: "existing-resources",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Cdn`: 2024-02-01
 */
export function getFrontdoorProfile(args: GetFrontdoorProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetFrontdoorProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:cdn/getFrontdoorProfile:getFrontdoorProfile", {
        "identity": args.identity,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFrontdoorProfile.
 */
export interface GetFrontdoorProfileArgs {
    /**
     * An `identity` block as defined below.
     */
    identity?: inputs.cdn.GetFrontdoorProfileIdentity;
    /**
     * Specifies the name of the Front Door Profile.
     */
    name: string;
    /**
     * The name of the Resource Group where this Front Door Profile exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getFrontdoorProfile.
 */
export interface GetFrontdoorProfileResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identity?: outputs.cdn.GetFrontdoorProfileIdentity;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * The UUID of the Front Door Profile which will be sent in the HTTP Header as the `X-Azure-FDID` attribute.
     */
    readonly resourceGuid: string;
    /**
     * Specifies the maximum response timeout in seconds.
     */
    readonly responseTimeoutSeconds: number;
    /**
     * Specifies the SKU for this Front Door Profile.
     */
    readonly skuName: string;
    /**
     * Specifies a mapping of Tags assigned to this Front Door Profile.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Front Door (standard/premium) Profile.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.cdn.getFrontdoorProfile({
 *     name: "existing-cdn-profile",
 *     resourceGroupName: "existing-resources",
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Cdn`: 2024-02-01
 */
export function getFrontdoorProfileOutput(args: GetFrontdoorProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFrontdoorProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:cdn/getFrontdoorProfile:getFrontdoorProfile", {
        "identity": args.identity,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getFrontdoorProfile.
 */
export interface GetFrontdoorProfileOutputArgs {
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.cdn.GetFrontdoorProfileIdentityArgs>;
    /**
     * Specifies the name of the Front Door Profile.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where this Front Door Profile exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
