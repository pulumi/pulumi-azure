// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Outputs
{

    [OutputType]
    public sealed class ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey
    {
        /// <summary>
        /// The URL to the Key Vault Secret used as the Disk Encryption Key that the Managed Disk will be associated with. This can be found as `id` on the `azure.keyvault.Secret` resource. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string SecretUrl;
        /// <summary>
        /// The ID of the Key Vault. This can be found as `id` on the `azure.keyvault.KeyVault` resource. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string VaultId;

        [OutputConstructor]
        private ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKey(
            string secretUrl,

            string vaultId)
        {
            SecretUrl = secretUrl;
            VaultId = vaultId;
        }
    }
}
