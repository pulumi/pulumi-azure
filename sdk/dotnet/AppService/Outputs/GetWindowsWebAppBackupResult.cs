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
    public sealed class GetWindowsWebAppBackupResult
    {
        /// <summary>
        /// Is the Backup enabled?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The name of this Windows Web App.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A `schedule` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWindowsWebAppBackupScheduleResult> Schedules;
        /// <summary>
        /// The SAS URL to the container.
        /// </summary>
        public readonly string StorageAccountUrl;

        [OutputConstructor]
        private GetWindowsWebAppBackupResult(
            bool enabled,

            string name,

            ImmutableArray<Outputs.GetWindowsWebAppBackupScheduleResult> schedules,

            string storageAccountUrl)
        {
            Enabled = enabled;
            Name = name;
            Schedules = schedules;
            StorageAccountUrl = storageAccountUrl;
        }
    }
}
