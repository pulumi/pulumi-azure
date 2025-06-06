// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Outputs
{

    [OutputType]
    public sealed class GetServiceTenantAccessResult
    {
        /// <summary>
        /// Is access to the Management API enabled (presumably "for this Tenant")?
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Primary access key for the tenant access information contract.
        /// </summary>
        public readonly string PrimaryKey;
        /// <summary>
        /// Secondary access key for the tenant access information contract.
        /// </summary>
        public readonly string SecondaryKey;
        /// <summary>
        /// The ID of the Tenant which has access to this API Management instance.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private GetServiceTenantAccessResult(
            bool enabled,

            string primaryKey,

            string secondaryKey,

            string tenantId)
        {
            Enabled = enabled;
            PrimaryKey = primaryKey;
            SecondaryKey = secondaryKey;
            TenantId = tenantId;
        }
    }
}
