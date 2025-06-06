// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Outputs
{

    [OutputType]
    public sealed class HadoopClusterDiskEncryption
    {
        /// <summary>
        /// This is an algorithm identifier for encryption. Possible values are `RSA1_5`, `RSA-OAEP`, `RSA-OAEP-256`.
        /// </summary>
        public readonly string? EncryptionAlgorithm;
        /// <summary>
        /// This is indicator to show whether resource disk encryption is enabled.
        /// </summary>
        public readonly bool? EncryptionAtHostEnabled;
        /// <summary>
        /// The ID of the key vault key.
        /// </summary>
        public readonly string? KeyVaultKeyId;
        /// <summary>
        /// This is the resource ID of Managed Identity used to access the key vault.
        /// </summary>
        public readonly string? KeyVaultManagedIdentityId;

        [OutputConstructor]
        private HadoopClusterDiskEncryption(
            string? encryptionAlgorithm,

            bool? encryptionAtHostEnabled,

            string? keyVaultKeyId,

            string? keyVaultManagedIdentityId)
        {
            EncryptionAlgorithm = encryptionAlgorithm;
            EncryptionAtHostEnabled = encryptionAtHostEnabled;
            KeyVaultKeyId = keyVaultKeyId;
            KeyVaultManagedIdentityId = keyVaultManagedIdentityId;
        }
    }
}
