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
    public sealed class SnapshotPolicyMonthlySchedule
    {
        /// <summary>
        /// List of the days of the month when the snapshots will be created, valid range is from 1 to 30.
        /// </summary>
        public readonly ImmutableArray<int> DaysOfMonths;
        /// <summary>
        /// Hour of the day that the snapshots will be created, valid range is from 0 to 23.
        /// </summary>
        public readonly int Hour;
        /// <summary>
        /// Minute of the hour that the snapshots will be created, valid range is from 0 to 59.
        /// </summary>
        public readonly int Minute;
        /// <summary>
        /// How many hourly snapshots to keep, valid range is from 0 to 255.
        /// </summary>
        public readonly int SnapshotsToKeep;

        [OutputConstructor]
        private SnapshotPolicyMonthlySchedule(
            ImmutableArray<int> daysOfMonths,

            int hour,

            int minute,

            int snapshotsToKeep)
        {
            DaysOfMonths = daysOfMonths;
            Hour = hour;
            Minute = minute;
            SnapshotsToKeep = snapshotsToKeep;
        }
    }
}
