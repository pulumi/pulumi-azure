// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automanage.Inputs
{

    public sealed class ConfigurationBackupRetentionPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `daily_schedule` block as defined below.
        /// </summary>
        [Input("dailySchedule")]
        public Input<Inputs.ConfigurationBackupRetentionPolicyDailyScheduleArgs>? DailySchedule { get; set; }

        /// <summary>
        /// The retention policy type of the backup policy. Possible value is `LongTermRetentionPolicy`.
        /// </summary>
        [Input("retentionPolicyType")]
        public Input<string>? RetentionPolicyType { get; set; }

        /// <summary>
        /// A `weekly_schedule` block as defined below.
        /// </summary>
        [Input("weeklySchedule")]
        public Input<Inputs.ConfigurationBackupRetentionPolicyWeeklyScheduleArgs>? WeeklySchedule { get; set; }

        public ConfigurationBackupRetentionPolicyArgs()
        {
        }
        public static new ConfigurationBackupRetentionPolicyArgs Empty => new ConfigurationBackupRetentionPolicyArgs();
    }
}