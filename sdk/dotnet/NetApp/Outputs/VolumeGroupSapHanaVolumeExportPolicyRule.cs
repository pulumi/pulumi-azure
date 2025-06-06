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
    public sealed class VolumeGroupSapHanaVolumeExportPolicyRule
    {
        /// <summary>
        /// A comma-sperated list of allowed client IPv4 addresses.
        /// </summary>
        public readonly string AllowedClients;
        /// <summary>
        /// Enables NFSv3. Please note that this cannot be enabled if volume has NFSv4.1 as its protocol.
        /// </summary>
        public readonly bool Nfsv3Enabled;
        /// <summary>
        /// Enables NFSv4.1. Please note that this cannot be enabled if volume has NFSv3 as its protocol.
        /// </summary>
        public readonly bool Nfsv41Enabled;
        /// <summary>
        /// Is root access permitted to this volume? Defaults to `true`.
        /// </summary>
        public readonly bool? RootAccessEnabled;
        /// <summary>
        /// The index number of the rule, must start at 1 and maximum 5.
        /// </summary>
        public readonly int RuleIndex;
        /// <summary>
        /// Is the file system on unix read only? Defaults to `false.
        /// </summary>
        public readonly bool? UnixReadOnly;
        /// <summary>
        /// Is the file system on unix read and write? Defaults to `true`.
        /// </summary>
        public readonly bool? UnixReadWrite;

        [OutputConstructor]
        private VolumeGroupSapHanaVolumeExportPolicyRule(
            string allowedClients,

            bool nfsv3Enabled,

            bool nfsv41Enabled,

            bool? rootAccessEnabled,

            int ruleIndex,

            bool? unixReadOnly,

            bool? unixReadWrite)
        {
            AllowedClients = allowedClients;
            Nfsv3Enabled = nfsv3Enabled;
            Nfsv41Enabled = nfsv41Enabled;
            RootAccessEnabled = rootAccessEnabled;
            RuleIndex = ruleIndex;
            UnixReadOnly = unixReadOnly;
            UnixReadWrite = unixReadWrite;
        }
    }
}
