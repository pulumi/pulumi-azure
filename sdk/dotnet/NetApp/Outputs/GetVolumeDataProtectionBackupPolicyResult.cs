// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NetApp.Outputs
{

    [OutputType]
    public sealed class GetVolumeDataProtectionBackupPolicyResult
    {
        /// <summary>
        /// The Resource ID of the backup policy.
        /// </summary>
        public readonly string BackupPolicyId;
        /// <summary>
        /// The Resource ID of the backup backup vault.
        /// </summary>
        public readonly string BackupVaultId;
        /// <summary>
        /// Backup policy is enabled or not.
        /// </summary>
        public readonly bool PolicyEnabled;

        [OutputConstructor]
        private GetVolumeDataProtectionBackupPolicyResult(
            string backupPolicyId,

            string backupVaultId,

            bool policyEnabled)
        {
            BackupPolicyId = backupPolicyId;
            BackupVaultId = backupVaultId;
            PolicyEnabled = policyEnabled;
        }
    }
}
