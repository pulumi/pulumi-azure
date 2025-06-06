// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Datadog.Outputs
{

    [OutputType]
    public sealed class MonitorIdentity
    {
        /// <summary>
        /// The Principal ID for the Service Principal associated with the Identity of this Datadog Monitor.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID for the Service Principal associated with the Identity of this Datadog Monitor.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the identity type of the Datadog Monitor. At this time the only allowed value is `SystemAssigned`.
        /// 
        /// &gt; **Note:** The assigned `principal_id` and `tenant_id` can be retrieved after the identity `type` has been set to `SystemAssigned` and the Datadog Monitor has been created. More details are available below.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private MonitorIdentity(
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
