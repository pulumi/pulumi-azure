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
    public sealed class VolumeDataProtectionBackupPolicy
    {
        /// <summary>
        /// Resource ID of the backup policy to apply to the volume.
        /// </summary>
        public readonly string BackupPolicyId;
        /// <summary>
        /// Resource ID of the backup backup vault to associate this volume to.
        /// </summary>
        public readonly string BackupVaultId;
        /// <summary>
        /// Enables the backup policy on the volume, defaults to `true`.
        /// 
        /// For more information on Azure NetApp Files Backup feature please see [Understand Azure NetApp Files backup](https://learn.microsoft.com/en-us/azure/azure-netapp-files/backup-introduction)
        /// </summary>
        public readonly bool? PolicyEnabled;

        [OutputConstructor]
        private VolumeDataProtectionBackupPolicy(
            string backupPolicyId,

            string backupVaultId,

            bool? policyEnabled)
        {
            BackupPolicyId = backupPolicyId;
            BackupVaultId = backupVaultId;
            PolicyEnabled = policyEnabled;
        }
    }
}
