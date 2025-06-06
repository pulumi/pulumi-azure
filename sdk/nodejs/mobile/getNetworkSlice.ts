// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about a Mobile Network Slice.
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
 * const exampleGetNetworkSlice = azure.mobile.getNetworkSlice({
 *     name: "example-mns",
 *     mobileNetworkId: test.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.MobileNetwork`: 2022-11-01
 */
export function getNetworkSlice(args: GetNetworkSliceArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkSliceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:mobile/getNetworkSlice:getNetworkSlice", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkSlice.
 */
export interface GetNetworkSliceArgs {
    /**
     * The ID of Mobile Network which the Mobile Network Slice belongs to.
     */
    mobileNetworkId: string;
    /**
     * Specifies the name which should be used for this Mobile Network Slice.
     */
    name: string;
}

/**
 * A collection of values returned by getNetworkSlice.
 */
export interface GetNetworkSliceResult {
    /**
     * A description of this Mobile Network Slice.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Mobile Network Slice exists.
     */
    readonly location: string;
    readonly mobileNetworkId: string;
    readonly name: string;
    /**
     * A `singleNetworkSliceSelectionAssistanceInformation` block as defined below. Single-network slice selection assistance information (S-NSSAI).
     */
    readonly singleNetworkSliceSelectionAssistanceInformations: outputs.mobile.GetNetworkSliceSingleNetworkSliceSelectionAssistanceInformation[];
    /**
     * A mapping of tags which are assigned to the Mobile Network Slice.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Get information about a Mobile Network Slice.
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
 * const exampleGetNetworkSlice = azure.mobile.getNetworkSlice({
 *     name: "example-mns",
 *     mobileNetworkId: test.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.MobileNetwork`: 2022-11-01
 */
export function getNetworkSliceOutput(args: GetNetworkSliceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkSliceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:mobile/getNetworkSlice:getNetworkSlice", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkSlice.
 */
export interface GetNetworkSliceOutputArgs {
    /**
     * The ID of Mobile Network which the Mobile Network Slice belongs to.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Mobile Network Slice.
     */
    name: pulumi.Input<string>;
}
