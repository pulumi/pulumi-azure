// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class GroupIdentity
    {
        /// <summary>
        /// Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Group.
        /// 
        /// &gt; **Note:** This is required when `type` is set to `UserAssigned` or `SystemAssigned, UserAssigned`.
        /// 
        /// &gt; **Note:** Currently you can't use a managed identity in a container group deployed to a virtual network.
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
        /// Specifies the type of Managed Service Identity that should be configured on this Container Group. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
        /// 
        /// &gt; **Note:** When `type` is set to `SystemAssigned`, the identity of the Principal ID can be retrieved after the container group has been created. See [documentation](https://docs.microsoft.com/azure/active-directory/managed-service-identity/overview) for more information.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GroupIdentity(
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
