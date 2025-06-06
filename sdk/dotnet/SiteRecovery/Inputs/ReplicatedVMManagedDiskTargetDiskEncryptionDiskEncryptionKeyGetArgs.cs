// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Inputs
{

    public sealed class ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL to the Key Vault Secret used as the Disk Encryption Key that the Managed Disk will be associated with. This can be found as `id` on the `azure.keyvault.Secret` resource. Changing this forces a new resource to be created.
        /// </summary>
        [Input("secretUrl", required: true)]
        public Input<string> SecretUrl { get; set; } = null!;

        /// <summary>
        /// The ID of the Key Vault. This can be found as `id` on the `azure.keyvault.KeyVault` resource. Changing this forces a new resource to be created.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyGetArgs()
        {
        }
        public static new ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyGetArgs Empty => new ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyGetArgs();
    }
}
