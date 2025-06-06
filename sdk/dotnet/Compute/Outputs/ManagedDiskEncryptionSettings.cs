// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class ManagedDiskEncryptionSettings
    {
        /// <summary>
        /// A `disk_encryption_key` block as defined above.
        /// </summary>
        public readonly Outputs.ManagedDiskEncryptionSettingsDiskEncryptionKey DiskEncryptionKey;
        /// <summary>
        /// A `key_encryption_key` block as defined below.
        /// </summary>
        public readonly Outputs.ManagedDiskEncryptionSettingsKeyEncryptionKey? KeyEncryptionKey;

        [OutputConstructor]
        private ManagedDiskEncryptionSettings(
            Outputs.ManagedDiskEncryptionSettingsDiskEncryptionKey diskEncryptionKey,

            Outputs.ManagedDiskEncryptionSettingsKeyEncryptionKey? keyEncryptionKey)
        {
            DiskEncryptionKey = diskEncryptionKey;
            KeyEncryptionKey = keyEncryptionKey;
        }
    }
}
