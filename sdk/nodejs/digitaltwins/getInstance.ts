// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Digital Twins instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.digitaltwins.getInstance({
 *     name: "existing-digital-twins",
 *     resourceGroupName: "existing-resgroup",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DigitalTwins`: 2023-01-31
 */
export function getInstance(args: GetInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:digitaltwins/getInstance:getInstance", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceArgs {
    /**
     * The name of this Digital Twins instance.
     */
    name: string;
    /**
     * The name of the Resource Group where the Digital Twins instance exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getInstance.
 */
export interface GetInstanceResult {
    /**
     * The API endpoint to work with this Digital Twins instance.
     */
    readonly hostName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Digital Twins instance exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the Digital Twins instance.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Digital Twins instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.digitaltwins.getInstance({
 *     name: "existing-digital-twins",
 *     resourceGroupName: "existing-resgroup",
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.DigitalTwins`: 2023-01-31
 */
export function getInstanceOutput(args: GetInstanceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetInstanceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:digitaltwins/getInstance:getInstance", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstance.
 */
export interface GetInstanceOutputArgs {
    /**
     * The name of this Digital Twins instance.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Digital Twins instance exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
