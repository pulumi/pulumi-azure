// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve a list of certificate names from an existing Key Vault.
 */
export function getCertificates(args: GetCertificatesArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:keyvault/getCertificates:getCertificates", {
        "includePending": args.includePending,
        "keyVaultId": args.keyVaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesArgs {
    /**
     * Specifies whether to include certificates which are not completely provisioned. Defaults to true.
     */
    includePending?: boolean;
    /**
     * Specifies the ID of the Key Vault instance to fetch certificate names from, available on the `azure.keyvault.KeyVault` Data Source / Resource.
     *
     * > **Note:** The vault must be in the same subscription as the provider. If the vault is in another subscription, you must create an aliased provider for that subscription.
     */
    keyVaultId: string;
}

/**
 * A collection of values returned by getCertificates.
 */
export interface GetCertificatesResult {
    /**
     * One or more `certificates` blocks as defined below.
     */
    readonly certificates: outputs.keyvault.GetCertificatesCertificate[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly includePending?: boolean;
    /**
     * The Key Vault ID.
     */
    readonly keyVaultId: string;
    /**
     * List containing names of certificates that exist in this Key Vault.
     */
    readonly names: string[];
}
/**
 * Use this data source to retrieve a list of certificate names from an existing Key Vault.
 */
export function getCertificatesOutput(args: GetCertificatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificatesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:keyvault/getCertificates:getCertificates", {
        "includePending": args.includePending,
        "keyVaultId": args.keyVaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesOutputArgs {
    /**
     * Specifies whether to include certificates which are not completely provisioned. Defaults to true.
     */
    includePending?: pulumi.Input<boolean>;
    /**
     * Specifies the ID of the Key Vault instance to fetch certificate names from, available on the `azure.keyvault.KeyVault` Data Source / Resource.
     *
     * > **Note:** The vault must be in the same subscription as the provider. If the vault is in another subscription, you must create an aliased provider for that subscription.
     */
    keyVaultId: pulumi.Input<string>;
}
