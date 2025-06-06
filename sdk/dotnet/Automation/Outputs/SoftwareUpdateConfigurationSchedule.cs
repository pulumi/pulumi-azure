// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Outputs
{

    [OutputType]
    public sealed class SoftwareUpdateConfigurationSchedule
    {
        /// <summary>
        /// List of days of the month that the job should execute on. Must be between `1` and `31`. `-1` for last day of the month. Only valid when frequency is `Month`.
        /// </summary>
        public readonly ImmutableArray<int> AdvancedMonthDays;
        /// <summary>
        /// List of days of the week that the job should execute on. Only valid when frequency is `Week`. Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, and `Sunday`.
        /// </summary>
        public readonly ImmutableArray<string> AdvancedWeekDays;
        public readonly string? CreationTime;
        /// <summary>
        /// A description for this Schedule.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The end time of the schedule.
        /// </summary>
        public readonly string? ExpiryTime;
        public readonly double? ExpiryTimeOffsetMinutes;
        /// <summary>
        /// The frequency of the schedule. - can be either `OneTime`, `Day`, `Hour`, `Week`, or `Month`.
        /// </summary>
        public readonly string Frequency;
        /// <summary>
        /// The number of `frequency`s between runs. Only valid when frequency is `Day`, `Hour`, `Week`, or `Month`.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// Whether the schedule is enabled. Defaults to `true`.
        /// </summary>
        public readonly bool? IsEnabled;
        public readonly string? LastModifiedTime;
        /// <summary>
        /// List of `monthly_occurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthly_occurrence` block supports fields as defined below.
        /// </summary>
        public readonly Outputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrence? MonthlyOccurrence;
        public readonly string? NextRun;
        public readonly double? NextRunOffsetMinutes;
        /// <summary>
        /// Start time of the schedule. Must be at least five minutes in the future. Defaults to seven minutes in the future from the time the resource is created.
        /// </summary>
        public readonly string? StartTime;
        public readonly double? StartTimeOffsetMinutes;
        /// <summary>
        /// The timezone of the start time. Defaults to `Etc/UTC`. For possible values see: &lt;https://docs.microsoft.com/en-us/rest/api/maps/timezone/gettimezoneenumwindows&gt;
        /// </summary>
        public readonly string? TimeZone;

        [OutputConstructor]
        private SoftwareUpdateConfigurationSchedule(
            ImmutableArray<int> advancedMonthDays,

            ImmutableArray<string> advancedWeekDays,

            string? creationTime,

            string? description,

            string? expiryTime,

            double? expiryTimeOffsetMinutes,

            string frequency,

            int? interval,

            bool? isEnabled,

            string? lastModifiedTime,

            Outputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrence? monthlyOccurrence,

            string? nextRun,

            double? nextRunOffsetMinutes,

            string? startTime,

            double? startTimeOffsetMinutes,

            string? timeZone)
        {
            AdvancedMonthDays = advancedMonthDays;
            AdvancedWeekDays = advancedWeekDays;
            CreationTime = creationTime;
            Description = description;
            ExpiryTime = expiryTime;
            ExpiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
            Frequency = frequency;
            Interval = interval;
            IsEnabled = isEnabled;
            LastModifiedTime = lastModifiedTime;
            MonthlyOccurrence = monthlyOccurrence;
            NextRun = nextRun;
            NextRunOffsetMinutes = nextRunOffsetMinutes;
            StartTime = startTime;
            StartTimeOffsetMinutes = startTimeOffsetMinutes;
            TimeZone = timeZone;
        }
    }
}
