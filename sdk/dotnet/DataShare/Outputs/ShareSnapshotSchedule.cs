// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataShare.Outputs
{

    [OutputType]
    public sealed class ShareSnapshotSchedule
    {
        /// <summary>
        /// The name of the snapshot schedule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The interval of the synchronization with the source data. Possible values are `Hour` and `Day`.
        /// </summary>
        public readonly string Recurrence;
        /// <summary>
        /// The synchronization with the source data's start time.
        /// </summary>
        public readonly string StartTime;

        [OutputConstructor]
        private ShareSnapshotSchedule(
            string name,

            string recurrence,

            string startTime)
        {
            Name = name;
            Recurrence = recurrence;
            StartTime = startTime;
        }
    }
}
