// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Outputs
{

    [OutputType]
    public sealed class CustomHttpsConfigurationCustomHttpsConfiguration
    {
        /// <summary>
        /// The name of the Key Vault secret representing the full certificate PFX.
        /// </summary>
        public readonly string? AzureKeyVaultCertificateSecretName;
        /// <summary>
        /// The version of the Key Vault secret representing the full certificate PFX.
        /// 
        /// &gt; **Note:** In order to enable the use of your own custom `HTTPS certificate` you must grant `Azure Front Door Service` access to your key vault. For instructions on how to configure your `Key Vault` correctly please refer to the [product documentation](https://docs.microsoft.com/azure/frontdoor/front-door-custom-domain-https#option-2-use-your-own-certificate).
        /// </summary>
        public readonly string? AzureKeyVaultCertificateSecretVersion;
        /// <summary>
        /// The ID of the Key Vault containing the SSL certificate.
        /// </summary>
        public readonly string? AzureKeyVaultCertificateVaultId;
        /// <summary>
        /// Certificate source to encrypted `HTTPS` traffic with. Allowed values are `FrontDoor` or `AzureKeyVault`. Defaults to `FrontDoor`.
        /// 
        /// The following attributes are only valid if `certificate_source` is set to `AzureKeyVault`:
        /// </summary>
        public readonly string? CertificateSource;
        /// <summary>
        /// Minimum client TLS version supported.
        /// </summary>
        public readonly string? MinimumTlsVersion;
        public readonly string? ProvisioningState;
        public readonly string? ProvisioningSubstate;

        [OutputConstructor]
        private CustomHttpsConfigurationCustomHttpsConfiguration(
            string? azureKeyVaultCertificateSecretName,

            string? azureKeyVaultCertificateSecretVersion,

            string? azureKeyVaultCertificateVaultId,

            string? certificateSource,

            string? minimumTlsVersion,

            string? provisioningState,

            string? provisioningSubstate)
        {
            AzureKeyVaultCertificateSecretName = azureKeyVaultCertificateSecretName;
            AzureKeyVaultCertificateSecretVersion = azureKeyVaultCertificateSecretVersion;
            AzureKeyVaultCertificateVaultId = azureKeyVaultCertificateVaultId;
            CertificateSource = certificateSource;
            MinimumTlsVersion = minimumTlsVersion;
            ProvisioningState = provisioningState;
            ProvisioningSubstate = provisioningSubstate;
        }
    }
}
