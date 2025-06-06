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
    public sealed class GetWindowsFunctionAppBackupScheduleResult
    {
        /// <summary>
        /// How often the backup is executed.
        /// </summary>
        public readonly int FrequencyInterval;
        /// <summary>
        /// The unit of time the backup should take place.
        /// </summary>
        public readonly string FrequencyUnit;
        /// <summary>
        /// Should the service keep at least one backup.
        /// </summary>
        public readonly bool KeepAtLeastOneBackup;
        /// <summary>
        /// The time the backup was last attempted.
        /// </summary>
        public readonly string LastExecutionTime;
        /// <summary>
        /// After how many days backups is deleted.
        /// </summary>
        public readonly int RetentionPeriodDays;
        /// <summary>
        /// When the schedule should start working in RFC-3339 format.
        /// </summary>
        public readonly string StartTime;

        [OutputConstructor]
        private GetWindowsFunctionAppBackupScheduleResult(
            int frequencyInterval,

            string frequencyUnit,

            bool keepAtLeastOneBackup,

            string lastExecutionTime,

            int retentionPeriodDays,

            string startTime)
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
