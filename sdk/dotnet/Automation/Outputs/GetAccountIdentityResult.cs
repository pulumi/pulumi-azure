// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation.Outputs
{

    [OutputType]
    public sealed class GetAccountIdentityResult
    {
        /// <summary>
        /// The list of User Assigned Managed Identity IDs assigned to this Automation Account.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID of the System Assigned Managed Service Identity that is configured on this Automation Account.
        /// </summary>
        public readonly string PrincipalId;
        /// <summary>
        /// The Tenant ID of the System Assigned Managed Service Identity that is configured on this Automation Account.
        /// </summary>
        public readonly string TenantId;
        /// <summary>
        /// The type of Managed Service Identity that is configured on this Automation Account.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetAccountIdentityResult(
            ImmutableArray<string> identityIds,

            string principalId,

            string tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}
