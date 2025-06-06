// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.dns.getCAARecord({
 *     name: "test",
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const dnsCaaRecordId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2018-05-01
 */
export function getCAARecord(args: GetCAARecordArgs, opts?: pulumi.InvokeOptions): Promise<GetCAARecordResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:dns/getCAARecord:getCAARecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCAARecord.
 */
export interface GetCAARecordArgs {
    /**
     * The name of the DNS CAA Record.
     */
    name: string;
    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists.
     */
    resourceGroupName: string;
    /**
     * Specifies the DNS Zone where the resource exists.
     */
    zoneName: string;
}

/**
 * A collection of values returned by getCAARecord.
 */
export interface GetCAARecordResult {
    /**
     * The FQDN of the DNS CAA Record.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * A list of values that make up the CAA record. Each `record` block supports fields documented below.
     */
    readonly records: outputs.dns.GetCAARecordRecord[];
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Time To Live (TTL) of the DNS record in seconds.
     */
    readonly ttl: number;
    readonly zoneName: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.dns.getCAARecord({
 *     name: "test",
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const dnsCaaRecordId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2018-05-01
 */
export function getCAARecordOutput(args: GetCAARecordOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCAARecordResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:dns/getCAARecord:getCAARecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCAARecord.
 */
export interface GetCAARecordOutputArgs {
    /**
     * The name of the DNS CAA Record.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the DNS Zone where the resource exists.
     */
    zoneName: pulumi.Input<string>;
}
