// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection.Inputs
{

    public sealed class BackupPolicyBlobStorageRetentionRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `criteria` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("criteria", required: true)]
        public Input<Inputs.BackupPolicyBlobStorageRetentionRuleCriteriaGetArgs> Criteria { get; set; } = null!;

        /// <summary>
        /// A `life_cycle` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("lifeCycle", required: true)]
        public Input<Inputs.BackupPolicyBlobStorageRetentionRuleLifeCycleGetArgs> LifeCycle { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this retention rule. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the priority of the rule. The priority number must be unique for each rule. The lower the priority number, the higher the priority of the rule. Changing this forces a new Backup Policy Blob Storage to be created.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        public BackupPolicyBlobStorageRetentionRuleGetArgs()
        {
        }
        public static new BackupPolicyBlobStorageRetentionRuleGetArgs Empty => new BackupPolicyBlobStorageRetentionRuleGetArgs();
    }
}
