// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Outputs
{

    [OutputType]
    public sealed class PolicyVMTieringPolicyArchivedRestorePoint
    {
        /// <summary>
        /// The number of days/weeks/months/years to retain backups in current tier before tiering.
        /// </summary>
        public readonly int? Duration;
        /// <summary>
        /// The retention duration type. Possible values are `Days`, `Weeks`, `Months` and `Years`.
        /// </summary>
        public readonly string? DurationType;
        /// <summary>
        /// The tiering mode to control automatic tiering of recovery points. Possible values are `TierAfter` and `TierRecommended`.
        /// </summary>
        public readonly string Mode;

        [OutputConstructor]
        private PolicyVMTieringPolicyArchivedRestorePoint(
            int? duration,

            string? durationType,

            string mode)
        {
            Duration = duration;
            DurationType = durationType;
            Mode = mode;
        }
    }
}
