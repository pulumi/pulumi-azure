// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevTest.Outputs
{

    [OutputType]
    public sealed class ScheduleWeeklyRecurrence
    {
        /// <summary>
        /// The time when the schedule takes effect.
        /// </summary>
        public readonly string Time;
        /// <summary>
        /// A list of days that this schedule takes effect . Possible values include `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`.
        /// </summary>
        public readonly ImmutableArray<string> WeekDays;

        [OutputConstructor]
        private ScheduleWeeklyRecurrence(
            string time,

            ImmutableArray<string> weekDays)
        {
            Time = time;
            WeekDays = weekDays;
        }
    }
}
