// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Gets information about an existing Confidential Ledger.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.compute.getConfidentialLedger({
 *     name: "example-ledger",
 *     resourceGroupName: "example-resources",
 * });
 * export const ledgerEndpoint = current.then(current => current.ledgerEndpoint);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ConfidentialLedger`: 2022-05-13
 */
export function getConfidentialLedger(args: GetConfidentialLedgerArgs, opts?: pulumi.InvokeOptions): Promise<GetConfidentialLedgerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:compute/getConfidentialLedger:getConfidentialLedger", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfidentialLedger.
 */
export interface GetConfidentialLedgerArgs {
    /**
     * Specifies the name of this Confidential Ledger.
     */
    name: string;
    /**
     * Specifies the name of the Resource Group where this Confidential Ledger exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getConfidentialLedger.
 */
export interface GetConfidentialLedgerResult {
    readonly azureadBasedServicePrincipals: outputs.compute.GetConfidentialLedgerAzureadBasedServicePrincipal[];
    readonly certificateBasedSecurityPrincipals: outputs.compute.GetConfidentialLedgerCertificateBasedSecurityPrincipal[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Identity Service Endpoint for this Confidential Ledger.
     */
    readonly identityServiceEndpoint: string;
    /**
     * The Endpoint for this Confidential Ledger.
     */
    readonly ledgerEndpoint: string;
    /**
     * The type of Confidential Ledger.
     */
    readonly ledgerType: string;
    /**
     * The supported Azure location where the Confidential Ledger exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags to assign to the Confidential Ledger.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Gets information about an existing Confidential Ledger.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.compute.getConfidentialLedger({
 *     name: "example-ledger",
 *     resourceGroupName: "example-resources",
 * });
 * export const ledgerEndpoint = current.then(current => current.ledgerEndpoint);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Microsoft.ConfidentialLedger`: 2022-05-13
 */
export function getConfidentialLedgerOutput(args: GetConfidentialLedgerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConfidentialLedgerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:compute/getConfidentialLedger:getConfidentialLedger", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfidentialLedger.
 */
export interface GetConfidentialLedgerOutputArgs {
    /**
     * Specifies the name of this Confidential Ledger.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the name of the Resource Group where this Confidential Ledger exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
