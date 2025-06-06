// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Pim.Outputs
{

    [OutputType]
    public sealed class RoleManagementPolicyActivationRulesApprovalStage
    {
        /// <summary>
        /// The IDs of the users or groups who can approve the activation
        /// </summary>
        public readonly ImmutableArray<Outputs.RoleManagementPolicyActivationRulesApprovalStagePrimaryApprover> PrimaryApprovers;

        [OutputConstructor]
        private RoleManagementPolicyActivationRulesApprovalStage(ImmutableArray<Outputs.RoleManagementPolicyActivationRulesApprovalStagePrimaryApprover> primaryApprovers)
        {
            PrimaryApprovers = primaryApprovers;
        }
    }
}
