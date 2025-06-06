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
    public sealed class PolicyVMWorkloadProtectionPolicy
    {
        /// <summary>
        /// A `backup` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicyBackup Backup;
        /// <summary>
        /// The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
        /// </summary>
        public readonly string PolicyType;
        /// <summary>
        /// A `retention_daily` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicyRetentionDaily? RetentionDaily;
        /// <summary>
        /// A `retention_monthly` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicyRetentionMonthly? RetentionMonthly;
        /// <summary>
        /// A `retention_weekly` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicyRetentionWeekly? RetentionWeekly;
        /// <summary>
        /// A `retention_yearly` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicyRetentionYearly? RetentionYearly;
        /// <summary>
        /// A `simple_retention` block as defined below.
        /// </summary>
        public readonly Outputs.PolicyVMWorkloadProtectionPolicySimpleRetention? SimpleRetention;

        [OutputConstructor]
        private PolicyVMWorkloadProtectionPolicy(
            Outputs.PolicyVMWorkloadProtectionPolicyBackup backup,

            string policyType,

            Outputs.PolicyVMWorkloadProtectionPolicyRetentionDaily? retentionDaily,

            Outputs.PolicyVMWorkloadProtectionPolicyRetentionMonthly? retentionMonthly,

            Outputs.PolicyVMWorkloadProtectionPolicyRetentionWeekly? retentionWeekly,

            Outputs.PolicyVMWorkloadProtectionPolicyRetentionYearly? retentionYearly,

            Outputs.PolicyVMWorkloadProtectionPolicySimpleRetention? simpleRetention)
        {
            Backup = backup;
            PolicyType = policyType;
            RetentionDaily = retentionDaily;
            RetentionMonthly = retentionMonthly;
            RetentionWeekly = retentionWeekly;
            RetentionYearly = retentionYearly;
            SimpleRetention = simpleRetention;
        }
    }
}
