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
    public sealed class GetManagedDiskEncryptionSettingResult
    {
        /// <summary>
        /// A `disk_encryption_key` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetManagedDiskEncryptionSettingDiskEncryptionKeyResult> DiskEncryptionKeys;
        public readonly bool Enabled;
        /// <summary>
        /// A `key_encryption_key` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetManagedDiskEncryptionSettingKeyEncryptionKeyResult> KeyEncryptionKeys;

        [OutputConstructor]
        private GetManagedDiskEncryptionSettingResult(
            ImmutableArray<Outputs.GetManagedDiskEncryptionSettingDiskEncryptionKeyResult> diskEncryptionKeys,

            bool enabled,

            ImmutableArray<Outputs.GetManagedDiskEncryptionSettingKeyEncryptionKeyResult> keyEncryptionKeys)
        {
            DiskEncryptionKeys = diskEncryptionKeys;
            Enabled = enabled;
            KeyEncryptionKeys = keyEncryptionKeys;
        }
    }
}
