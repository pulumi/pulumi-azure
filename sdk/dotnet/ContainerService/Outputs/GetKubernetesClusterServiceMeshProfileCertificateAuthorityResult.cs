// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class GetKubernetesClusterServiceMeshProfileCertificateAuthorityResult
    {
        /// <summary>
        /// The certificate chain object name in Azure Key Vault.
        /// </summary>
        public readonly string CertChainObjectName;
        /// <summary>
        /// The intermediate certificate object name in Azure Key Vault.
        /// </summary>
        public readonly string CertObjectName;
        /// <summary>
        /// The intermediate certificate private key object name in Azure Key Vault.
        /// </summary>
        public readonly string KeyObjectName;
        /// <summary>
        /// The resource ID of the Key Vault.
        /// </summary>
        public readonly string KeyVaultId;
        /// <summary>
        /// The root certificate object name in Azure Key Vault.
        /// </summary>
        public readonly string RootCertObjectName;

        [OutputConstructor]
        private GetKubernetesClusterServiceMeshProfileCertificateAuthorityResult(
            string certChainObjectName,

            string certObjectName,

            string keyObjectName,

            string keyVaultId,

            string rootCertObjectName)
        {
            CertChainObjectName = certChainObjectName;
            CertObjectName = certObjectName;
            KeyObjectName = keyObjectName;
            KeyVaultId = keyVaultId;
            RootCertObjectName = rootCertObjectName;
        }
    }
}
