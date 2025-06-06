// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cognitive.Outputs
{

    [OutputType]
    public sealed class AIServicesNetworkAclsVirtualNetworkRule
    {
        /// <summary>
        /// Whether to ignore a missing Virtual Network Service Endpoint or not. Default to `false`.
        /// </summary>
        public readonly bool? IgnoreMissingVnetServiceEndpoint;
        /// <summary>
        /// The ID of the subnet which should be able to access this AI Services Account.
        /// </summary>
        public readonly string SubnetId;

        [OutputConstructor]
        private AIServicesNetworkAclsVirtualNetworkRule(
            bool? ignoreMissingVnetServiceEndpoint,

            string subnetId)
        {
            IgnoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            SubnetId = subnetId;
        }
    }
}
