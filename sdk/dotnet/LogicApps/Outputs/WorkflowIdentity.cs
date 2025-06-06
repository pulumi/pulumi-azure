// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Outputs
{

    [OutputType]
    public sealed class WorkflowIdentity
    {
        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Logic App Workflow.
        /// 
        /// &gt; **Note:** This is required when `type` is set to `UserAssigned`
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID for the Service Principal associated with the Managed Service Identity of this Logic App Workflow.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID for the Service Principal associated with the Managed Service Identity of this Logic App Workflow.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this Logic App Workflow. Possible values are `SystemAssigned`, `UserAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private WorkflowIdentity(
            ImmutableArray<string> identityIds,

            string? principalId,

            string? tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}
