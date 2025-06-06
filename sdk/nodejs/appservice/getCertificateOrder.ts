// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing App Service Certificate Order.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.appservice.getCertificateOrder({
 *     name: "example-cert-order",
 *     resourceGroupName: "example-resources",
 * });
 * export const certificateOrderId = example.then(example => example.id);
 * ```
 */
export function getCertificateOrder(args: GetCertificateOrderArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateOrderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:appservice/getCertificateOrder:getCertificateOrder", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificateOrder.
 */
export interface GetCertificateOrderArgs {
    /**
     * The name of the App Service.
     */
    name: string;
    /**
     * The Name of the Resource Group where the App Service exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getCertificateOrder.
 */
export interface GetCertificateOrderResult {
    /**
     * Reasons why App Service Certificate is not renewable at the current moment.
     */
    readonly appServiceCertificateNotRenewableReasons: string[];
    /**
     * true if the certificate should be automatically renewed when it expires; otherwise, false.
     */
    readonly autoRenew: boolean;
    /**
     * State of the Key Vault secret. A `certificates` block as defined below.
     */
    readonly certificates: outputs.appservice.GetCertificateOrderCertificate[];
    /**
     * Last CSR that was created for this order.
     */
    readonly csr: string;
    /**
     * The Distinguished Name for the App Service Certificate Order.
     */
    readonly distinguishedName: string;
    /**
     * Domain verification token.
     */
    readonly domainVerificationToken: string;
    /**
     * Certificate expiration time.
     */
    readonly expirationTime: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Certificate thumbprint intermediate certificate.
     */
    readonly intermediateThumbprint: string;
    /**
     * Whether the private key is external or not.
     */
    readonly isPrivateKeyExternal: boolean;
    /**
     * Certificate key size.
     */
    readonly keySize: number;
    /**
     * The Azure location where the App Service exists.
     */
    readonly location: string;
    readonly name: string;
    /**
     * Certificate product type, such as `Standard` or `WildCard`.
     */
    readonly productType: string;
    readonly resourceGroupName: string;
    /**
     * Certificate thumbprint for root certificate.
     */
    readonly rootThumbprint: string;
    /**
     * Certificate thumbprint for signed certificate.
     */
    readonly signedCertificateThumbprint: string;
    /**
     * Current order status.
     */
    readonly status: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * Duration in years (must be between 1 and 3).
     */
    readonly validityInYears: number;
}
/**
 * Use this data source to access information about an existing App Service Certificate Order.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.appservice.getCertificateOrder({
 *     name: "example-cert-order",
 *     resourceGroupName: "example-resources",
 * });
 * export const certificateOrderId = example.then(example => example.id);
 * ```
 */
export function getCertificateOrderOutput(args: GetCertificateOrderOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificateOrderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:appservice/getCertificateOrder:getCertificateOrder", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificateOrder.
 */
export interface GetCertificateOrderOutputArgs {
    /**
     * The name of the App Service.
     */
    name: pulumi.Input<string>;
    /**
     * The Name of the Resource Group where the App Service exists.
     */
    resourceGroupName: pulumi.Input<string>;
}
