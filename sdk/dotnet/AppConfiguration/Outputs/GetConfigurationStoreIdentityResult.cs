// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppConfiguration.Outputs
{

    [OutputType]
    public sealed class GetConfigurationStoreIdentityResult
    {
        public readonly ImmutableArray<string> IdentityIds;
        public readonly string PrincipalId;
        public readonly string TenantId;
        public readonly string Type;

        [OutputConstructor]
        private GetConfigurationStoreIdentityResult(
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