// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automanage.Outputs
{

    [OutputType]
    public sealed class ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDuration
    {
        /// <summary>
        /// The count of the retention duration of the backup policy. Valid value inside `daily_schedule` is `7` to `9999` and inside `weekly_schedule` is `1` to `5163`.
        /// </summary>
        public readonly int? Count;
        /// <summary>
        /// The duration type of the retention duration of the backup policy. Valid value inside `daily_schedule` is `Days` and inside `weekly_schedule` is `Weeks`.
        /// </summary>
        public readonly string? DurationType;

        [OutputConstructor]
        private ConfigurationBackupRetentionPolicyWeeklyScheduleRetentionDuration(
            int? count,

            string? durationType)
        {
            Count = count;
            DurationType = durationType;
        }
    }
}