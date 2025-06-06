// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Oracle.Outputs
{

    [OutputType]
    public sealed class ExadataInfrastructureMaintenanceWindow
    {
        /// <summary>
        /// Days during the week when maintenance should be performed. Valid values are: `0` - represents time slot `0:00 - 3:59 UTC - 4` - represents time slot `4:00 - 7:59 UTC - 8` - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot `20:00 - 23:59 UTC`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly ImmutableArray<string> DaysOfWeeks;
        /// <summary>
        /// The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly ImmutableArray<int> HoursOfDays;
        /// <summary>
        /// Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between `1` to `4`. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly int? LeadTimeInWeeks;
        /// <summary>
        /// Months during the year when maintenance should be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly ImmutableArray<string> Months;
        /// <summary>
        /// Cloud Exadata Infrastructure node patching method, either `ROLLING` or `NONROLLING`. Default value is `ROLLING`. IMPORTANT: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly string? PatchingMode;
        /// <summary>
        /// The maintenance window scheduling preference. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly string? Preference;
        /// <summary>
        /// Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed. Changing this forces a new Cloud Exadata Infrastructure to be created.
        /// </summary>
        public readonly ImmutableArray<int> WeeksOfMonths;

        [OutputConstructor]
        private ExadataInfrastructureMaintenanceWindow(
            ImmutableArray<string> daysOfWeeks,

            ImmutableArray<int> hoursOfDays,

            int? leadTimeInWeeks,

            ImmutableArray<string> months,

            string? patchingMode,

            string? preference,

            ImmutableArray<int> weeksOfMonths)
        {
            DaysOfWeeks = daysOfWeeks;
            HoursOfDays = hoursOfDays;
            LeadTimeInWeeks = leadTimeInWeeks;
            Months = months;
            PatchingMode = patchingMode;
            Preference = preference;
            WeeksOfMonths = weeksOfMonths;
        }
    }
}
