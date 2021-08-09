// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection.Outputs
{

    [OutputType]
    public sealed class BackupPolicyDiskRetentionRule
    {
        /// <summary>
        /// A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
        /// </summary>
        public readonly Outputs.BackupPolicyDiskRetentionRuleCriteria Criteria;
        /// <summary>
        /// Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
        /// </summary>
        public readonly string Duration;
        /// <summary>
        /// The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
        /// </summary>
        public readonly int Priority;

        [OutputConstructor]
        private BackupPolicyDiskRetentionRule(
            Outputs.BackupPolicyDiskRetentionRuleCriteria criteria,

            string duration,

            string name,

            int priority)
        {
            Criteria = criteria;
            Duration = duration;
            Name = name;
            Priority = priority;
        }
    }
}