// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing NGINX Certificate.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.nginx.getCertificate({
 *     name: "existing",
 *     nginxDeploymentId: exampleAzurermNginxDeployment.id,
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Nginx.NginxPlus`: 2024-11-01-preview
 */
export function getCertificate(args: GetCertificateArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:nginx/getCertificate:getCertificate", {
        "name": args.name,
        "nginxDeploymentId": args.nginxDeploymentId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificate.
 */
export interface GetCertificateArgs {
    /**
     * The name of the NGINX Certificate.
     */
    name: string;
    /**
     * The ID of the NGINX Deployment that the certificate is associated with.
     */
    nginxDeploymentId: string;
}

/**
 * A collection of values returned by getCertificate.
 */
export interface GetCertificateResult {
    /**
     * The path to the certificate file of the certificate.
     */
    readonly certificateVirtualPath: string;
    /**
     * The error code of the certificate error, if any.
     */
    readonly errorCode: string;
    /**
     * The error message of the certificate error, if any.
     */
    readonly errorMessage: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The date/time the certificate was created in Azure Key Vault.
     */
    readonly keyVaultSecretCreationDate: string;
    /**
     * The ID of the Key Vault Secret for the certificate.
     */
    readonly keyVaultSecretId: string;
    /**
     * The version of the certificate.
     */
    readonly keyVaultSecretVersion: string;
    /**
     * The path to the key file of the certificate.
     */
    readonly keyVirtualPath: string;
    readonly name: string;
    readonly nginxDeploymentId: string;
    /**
     * The SHA-1 thumbprint of the certificate.
     */
    readonly sha1Thumbprint: string;
}
/**
 * Use this data source to access information about an existing NGINX Certificate.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.nginx.getCertificate({
 *     name: "existing",
 *     nginxDeploymentId: exampleAzurermNginxDeployment.id,
 * });
 * export const id = example.then(example => example.id);
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This data source uses the following Azure API Providers:
 *
 * * `Nginx.NginxPlus`: 2024-11-01-preview
 */
export function getCertificateOutput(args: GetCertificateOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificateResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("azure:nginx/getCertificate:getCertificate", {
        "name": args.name,
        "nginxDeploymentId": args.nginxDeploymentId,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificate.
 */
export interface GetCertificateOutputArgs {
    /**
     * The name of the NGINX Certificate.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the NGINX Deployment that the certificate is associated with.
     */
    nginxDeploymentId: pulumi.Input<string>;
}
