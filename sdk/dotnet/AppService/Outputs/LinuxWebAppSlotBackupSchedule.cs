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
    public sealed class LinuxWebAppSlotBackupSchedule
    {
        /// <summary>
        /// How often the backup should be executed (e.g. for weekly backup, this should be set to `7` and `frequency_unit` should be set to `Day`).
        /// 
        /// &gt; **Note:** Not all intervals are supported on all Linux Web App SKUs. Please refer to the official documentation for appropriate values.
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// The unit of time for how often the backup should take place. Possible values include: `Day`, `Hour`
        /// </summary>
        public readonly string FrequencyUnit;
        /// <summary>
        /// Should the service keep at least one backup, regardless of the age of backup? Defaults to `false`.
        /// </summary>
        public readonly bool? KeepAtLeastOneBackup;
        /// <summary>
        /// The time the backup was last attempted.
        /// </summary>
        public readonly string? LastExecutionTime;
        /// <summary>
        /// After how many days backups should be deleted. Defaults to `30`.
        /// </summary>
        public readonly int? RetentionPeriodDays;
        /// <summary>
        /// When the schedule should start working in RFC-3339 format.
        /// </summary>
        public readonly string? StartTime;

        [OutputConstructor]
        private LinuxWebAppSlotBackupSchedule(
            int frequencyInterval,

            string frequencyUnit,

            bool? keepAtLeastOneBackup,

            string? lastExecutionTime,

            int? retentionPeriodDays,

            string? startTime)
        {
            FrequencyInterval = frequencyInterval;
            FrequencyUnit = frequencyUnit;
            KeepAtLeastOneBackup = keepAtLeastOneBackup;
            LastExecutionTime = lastExecutionTime;
            RetentionPeriodDays = retentionPeriodDays;
            StartTime = startTime;
        }
    }
}
