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
    public sealed class PolicyVMWorkloadProtectionPolicyRetentionWeekly
    {
        /// <summary>
        /// The number of weekly backups to keep. Possible values are between `1` and `5163`.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The weekday backups to retain. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
        /// </summary>
        public readonly ImmutableArray<string> Weekdays;

        [OutputConstructor]
        private PolicyVMWorkloadProtectionPolicyRetentionWeekly(
            int count,

            ImmutableArray<string> weekdays)
        {
            Count = count;
            Weekdays = weekdays;
        }
    }
}
