// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Gets a list of supported character sets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * export = async () => {
 *     const example = await azure.oracle.getAdbsCharacterSets({
 *         location: "West Europe",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Oracle.Database`: 2024-06-01
 */
export function getAdbsCharacterSets(args: GetAdbsCharacterSetsArgs, opts?: pulumi.InvokeOptions): Promise<GetAdbsCharacterSetsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:oracle/getAdbsCharacterSets:getAdbsCharacterSets", {
        "location": args.location,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdbsCharacterSets.
 */
export interface GetAdbsCharacterSetsArgs {
    /**
     * The Azure Region to query for the character sets in.
     */
    location: string;
}

/**
 * A collection of values returned by getAdbsCharacterSets.
 */
export interface GetAdbsCharacterSetsResult {
    /**
     * A `characterSets` block as defined below.
     */
    readonly characterSets: outputs.oracle.GetAdbsCharacterSetsCharacterSet[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
}
/**
 * Gets a list of supported character sets.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * export = async () => {
 *     const example = await azure.oracle.getAdbsCharacterSets({
 *         location: "West Europe",
 *     });
 *     return {
 *         example: example,
 *     };
 * }
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Oracle.Database`: 2024-06-01
 */
export function getAdbsCharacterSetsOutput(args: GetAdbsCharacterSetsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAdbsCharacterSetsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:oracle/getAdbsCharacterSets:getAdbsCharacterSets", {
        "location": args.location,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdbsCharacterSets.
 */
export interface GetAdbsCharacterSetsOutputArgs {
    /**
     * The Azure Region to query for the character sets in.
     */
    location: pulumi.Input<string>;
}
