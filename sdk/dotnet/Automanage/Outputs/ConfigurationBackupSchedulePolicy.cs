// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automanage.Outputs
{

    [OutputType]
    public sealed class ConfigurationBackupSchedulePolicy
    {
        /// <summary>
        /// The schedule policy type of the backup policy. Possible value is `SimpleSchedulePolicy`. Defaults to `SimpleSchedulePolicy`.
        /// </summary>
        public readonly string? SchedulePolicyType;
        /// <summary>
        /// The schedule run days of the backup policy. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
        /// </summary>
        public readonly ImmutableArray<string> ScheduleRunDays;
        /// <summary>
        /// The schedule run frequency of the backup policy. Possible values are `Daily` and `Weekly`. Defaults to `Daily`.
        /// </summary>
        public readonly string? ScheduleRunFrequency;
        /// <summary>
        /// The schedule run times of the backup policy.
        /// </summary>
        public readonly ImmutableArray<string> ScheduleRunTimes;

        [OutputConstructor]
        private ConfigurationBackupSchedulePolicy(
            string? schedulePolicyType,

            ImmutableArray<string> scheduleRunDays,

            string? scheduleRunFrequency,

            ImmutableArray<string> scheduleRunTimes)
        {
            SchedulePolicyType = schedulePolicyType;
            ScheduleRunDays = scheduleRunDays;
            ScheduleRunFrequency = scheduleRunFrequency;
            ScheduleRunTimes = scheduleRunTimes;
        }
    }
}
