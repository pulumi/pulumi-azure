// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcMachine.Outputs
{

    [OutputType]
    public sealed class ArcMachineIdentity
    {
        /// <summary>
        /// The Principal ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Service Identity assigned to this Arc Machine. At this time the only possible value is `SystemAssigned`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ArcMachineIdentity(
            string? principalId,

            string? tenantId,

            string type)
        {
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}
