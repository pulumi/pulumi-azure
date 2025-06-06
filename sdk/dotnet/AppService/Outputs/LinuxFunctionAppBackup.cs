// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class LinuxFunctionAppBackup
    {
        /// <summary>
        /// Should this backup job be enabled? Defaults to `true`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The name which should be used for this Backup.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A `schedule` block as defined below.
        /// </summary>
        public readonly Outputs.LinuxFunctionAppBackupSchedule Schedule;
        /// <summary>
        /// The SAS URL to the container.
        /// </summary>
        public readonly string StorageAccountUrl;

        [OutputConstructor]
        private LinuxFunctionAppBackup(
            bool? enabled,

            string name,

            Outputs.LinuxFunctionAppBackupSchedule schedule,

            string storageAccountUrl)
        {
            Enabled = enabled;
            Name = name;
            Schedule = schedule;
            StorageAccountUrl = storageAccountUrl;
        }
    }
}
