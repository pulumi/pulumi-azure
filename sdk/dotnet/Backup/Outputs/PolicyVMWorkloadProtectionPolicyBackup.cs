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
    public sealed class PolicyVMWorkloadProtectionPolicyBackup
    {
        /// <summary>
        /// The backup frequency for the VM Workload Backup Policy. Possible values are `Daily` and `Weekly`.
        /// </summary>
        public readonly string? Frequency;
        /// <summary>
        /// The backup frequency in minutes for the VM Workload Backup Policy. Possible values are `15`, `30`, `60`, `120`, `240`, `480`, `720` and `1440`.
        /// </summary>
        public readonly int? FrequencyInMinutes;
        /// <summary>
        /// The time of day to perform the backup in 24hour format.
        /// </summary>
        public readonly string? Time;
        /// <summary>
        /// The days of the week to perform backups on. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`. This is used when `frequency` is `Weekly`.
        /// </summary>
        public readonly ImmutableArray<string> Weekdays;

        [OutputConstructor]
        private PolicyVMWorkloadProtectionPolicyBackup(
            string? frequency,

            int? frequencyInMinutes,

            string? time,

            ImmutableArray<string> weekdays)
        {
            Frequency = frequency;
            FrequencyInMinutes = frequencyInMinutes;
            Time = time;
            Weekdays = weekdays;
        }
    }
}
