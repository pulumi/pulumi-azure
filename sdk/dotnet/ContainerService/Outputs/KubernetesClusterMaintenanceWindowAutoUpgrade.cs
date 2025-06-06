// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterMaintenanceWindowAutoUpgrade
    {
        /// <summary>
        /// The day of the month for the maintenance run. Required in combination with AbsoluteMonthly frequency. Value between 0 and 31 (inclusive).
        /// </summary>
        public readonly int? DayOfMonth;
        /// <summary>
        /// The day of the week for the maintenance run. Required in combination with weekly frequency. Possible values are `Friday`, `Monday`, `Saturday`, `Sunday`, `Thursday`, `Tuesday` and `Wednesday`.
        /// </summary>
        public readonly string? DayOfWeek;
        /// <summary>
        /// The duration of the window for maintenance to run in hours. Possible options are between `4` to `24`.
        /// </summary>
        public readonly int Duration;
        /// <summary>
        /// Frequency of maintenance. Possible options are `Weekly`, `AbsoluteMonthly` and `RelativeMonthly`.
        /// </summary>
        public readonly string Frequency;
        /// <summary>
        /// The interval for maintenance runs. Depending on the frequency this interval is week or month based.
        /// </summary>
        public readonly int Interval;
        /// <summary>
        /// One or more `not_allowed` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.KubernetesClusterMaintenanceWindowAutoUpgradeNotAllowed> NotAlloweds;
        /// <summary>
        /// The date on which the maintenance window begins to take effect.
        /// </summary>
        public readonly string? StartDate;
        /// <summary>
        /// The time for maintenance to begin, based on the timezone determined by `utc_offset`. Format is `HH:mm`.
        /// </summary>
        public readonly string? StartTime;
        /// <summary>
        /// Used to determine the timezone for cluster maintenance.
        /// </summary>
        public readonly string? UtcOffset;
        /// <summary>
        /// Specifies on which instance of the allowed days specified in `day_of_week` the maintenance occurs. Options are `First`, `Second`, `Third`, `Fourth`, and `Last`.
        /// Required in combination with relative monthly frequency.
        /// </summary>
        public readonly string? WeekIndex;

        [OutputConstructor]
        private KubernetesClusterMaintenanceWindowAutoUpgrade(
            int? dayOfMonth,

            string? dayOfWeek,

            int duration,

            string frequency,

            int interval,

            ImmutableArray<Outputs.KubernetesClusterMaintenanceWindowAutoUpgradeNotAllowed> notAlloweds,

            string? startDate,

            string? startTime,

            string? utcOffset,

            string? weekIndex)
        {
            DayOfMonth = dayOfMonth;
            DayOfWeek = dayOfWeek;
            Duration = duration;
            Frequency = frequency;
            Interval = interval;
            NotAlloweds = notAlloweds;
            StartDate = startDate;
            StartTime = startTime;
            UtcOffset = utcOffset;
            WeekIndex = weekIndex;
        }
    }
}
