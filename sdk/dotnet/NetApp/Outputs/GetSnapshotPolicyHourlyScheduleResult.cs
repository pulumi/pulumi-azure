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
    public sealed class GetSnapshotPolicyHourlyScheduleResult
    {
        /// <summary>
        /// Minute of the hour that the snapshots will be created.
        /// </summary>
        public readonly int Minute;
        /// <summary>
        /// How many hourly snapshots to keep.
        /// </summary>
        public readonly int SnapshotsToKeep;

        [OutputConstructor]
        private GetSnapshotPolicyHourlyScheduleResult(
            int minute,

            int snapshotsToKeep)
        {
            Minute = minute;
            SnapshotsToKeep = snapshotsToKeep;
        }
    }
}
