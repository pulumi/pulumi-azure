// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection.Inputs
{

    public sealed class BackupPolicyKubernetesClusterDefaultRetentionRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("lifeCycles", required: true)]
        private InputList<Inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleGetArgs>? _lifeCycles;

        /// <summary>
        /// A `life_cycle` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleGetArgs> LifeCycles
        {
            get => _lifeCycles ?? (_lifeCycles = new InputList<Inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleGetArgs>());
            set => _lifeCycles = value;
        }

        public BackupPolicyKubernetesClusterDefaultRetentionRuleGetArgs()
        {
        }
        public static new BackupPolicyKubernetesClusterDefaultRetentionRuleGetArgs Empty => new BackupPolicyKubernetesClusterDefaultRetentionRuleGetArgs();
    }
}
