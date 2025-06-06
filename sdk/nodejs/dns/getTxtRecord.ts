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
 * const example = azure.dns.getTxtRecord({
 *     name: "test",
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const dnsTxtRecordId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2018-05-01
 */
export function getTxtRecord(args: GetTxtRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetTxtRecordResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:dns/getTxtRecord:getTxtRecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTxtRecord.
 */
export interface GetTxtRecordArgs {
    /**
     * The name of the DNS TXT Record.
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
 * A collection of values returned by getTxtRecord.
 */
export interface GetTxtRecordResult {
    /**
     * The FQDN of the DNS TXT Record.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * A list of values that make up the txt record. Each `record` block supports fields documented below.
     */
    readonly records: outputs.dns.GetTxtRecordRecord[];
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
 * const example = azure.dns.getTxtRecord({
 *     name: "test",
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const dnsTxtRecordId = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.Network`: 2018-05-01
 */
export function getTxtRecordOutput(args: GetTxtRecordOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTxtRecordResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:dns/getTxtRecord:getTxtRecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTxtRecord.
 */
export interface GetTxtRecordOutputArgs {
    /**
     * The name of the DNS TXT Record.
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
