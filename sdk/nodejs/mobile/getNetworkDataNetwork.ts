// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get information about a Mobile Network Data Network.
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
 * const exampleGetNetworkDataNetwork = example.then(example => azure.mobile.getNetworkDataNetwork({
 *     name: "example-mndn",
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
export function getNetworkDataNetwork(args: GetNetworkDataNetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkDataNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:mobile/getNetworkDataNetwork:getNetworkDataNetwork", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkDataNetwork.
 */
export interface GetNetworkDataNetworkArgs {
    /**
     * Specifies the ID of the Mobile Network.
     */
    mobileNetworkId: string;
    /**
     * Specifies the name which should be used for this Mobile Network Data Network.
     */
    name: string;
}

/**
 * A collection of values returned by getNetworkDataNetwork.
 */
export interface GetNetworkDataNetworkResult {
    /**
     * The description for this Mobile Network Data Network.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Mobile Network Data Network exists.
     */
    readonly location: string;
    readonly mobileNetworkId: string;
    readonly name: string;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Data Network.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Get information about a Mobile Network Data Network.
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
 * const exampleGetNetworkDataNetwork = example.then(example => azure.mobile.getNetworkDataNetwork({
 *     name: "example-mndn",
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
export function getNetworkDataNetworkOutput(args: GetNetworkDataNetworkOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkDataNetworkResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:mobile/getNetworkDataNetwork:getNetworkDataNetwork", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkDataNetwork.
 */
export interface GetNetworkDataNetworkOutputArgs {
    /**
     * Specifies the ID of the Mobile Network.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Mobile Network Data Network.
     */
    name: pulumi.Input<string>;
}
