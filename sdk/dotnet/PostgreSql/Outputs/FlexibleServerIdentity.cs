// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PostgreSql.Outputs
{

    [OutputType]
    public sealed class FlexibleServerIdentity
    {
        /// <summary>
        /// A list of User Assigned Managed Identity IDs to be assigned to this PostgreSQL Flexible Server. Required if used together with `customer_managed_key` block.
        /// 
        /// &gt; **Note:** `identity_ids` is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Service Identity that should be configured on this PostgreSQL Flexible Server. Possible values are `UserAssigned`, `SystemAssigned` and `SystemAssigned, UserAssigned`.
        /// 
        /// &gt; **Note:** Once `UserAssigned` has been added, removing it forces a new resource to be created.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private FlexibleServerIdentity(
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
