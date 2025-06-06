// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get information about a Mobile Network Site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.mobile.getNetwork({
 *     name: "example-mn",
 *     resourceGroupName: "example-rg",
 * });
 * const exampleGetNetworkSite = example.then(example => azure.mobile.getNetworkSite({
 *     name: "example-mns",
 *     mobileNetworkId: example.id,
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.MobileNetwork`: 2022-11-01
 */
export function getNetworkSite(args: GetNetworkSiteArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkSiteResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:mobile/getNetworkSite:getNetworkSite", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkSite.
 */
export interface GetNetworkSiteArgs {
    /**
     * the ID of the Mobile Network which the Mobile Network Site belongs to.
     */
    mobileNetworkId: string;
    /**
     * The name which should be used for this Mobile Network Site.
     */
    name: string;
}

/**
 * A collection of values returned by getNetworkSite.
 */
export interface GetNetworkSiteResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Mobile Network Site should exist.
     */
    readonly location: string;
    readonly mobileNetworkId: string;
    readonly name: string;
    /**
     * An array of Id of Network Functions deployed on the site.
     */
    readonly networkFunctionIds: string[];
    /**
     * A mapping of tags which should be assigned to the Mobile Network Site.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Get information about a Mobile Network Site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.mobile.getNetwork({
 *     name: "example-mn",
 *     resourceGroupName: "example-rg",
 * });
 * const exampleGetNetworkSite = example.then(example => azure.mobile.getNetworkSite({
 *     name: "example-mns",
 *     mobileNetworkId: example.id,
 * }));
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.MobileNetwork`: 2022-11-01
 */
export function getNetworkSiteOutput(args: GetNetworkSiteOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkSiteResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:mobile/getNetworkSite:getNetworkSite", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkSite.
 */
export interface GetNetworkSiteOutputArgs {
    /**
     * the ID of the Mobile Network which the Mobile Network Site belongs to.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * The name which should be used for this Mobile Network Site.
     */
    name: pulumi.Input<string>;
}
