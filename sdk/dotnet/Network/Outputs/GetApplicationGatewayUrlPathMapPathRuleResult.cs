// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetApplicationGatewayUrlPathMapPathRuleResult
    {
        /// <summary>
        /// The ID of the associated Backend Address Pool.
        /// </summary>
        public readonly string BackendAddressPoolId;
        /// <summary>
        /// The Name of the Backend Address Pool which is used for this Routing Rule.
        /// </summary>
        public readonly string BackendAddressPoolName;
        /// <summary>
        /// The ID of the associated Backend HTTP Settings Configuration.
        /// </summary>
        public readonly string BackendHttpSettingsId;
        /// <summary>
        /// The Name of the Backend HTTP Settings Collection which is used for this Routing Rule.
        /// </summary>
        public readonly string BackendHttpSettingsName;
        /// <summary>
        /// The ID of the Web Application Firewall Policy which is used as an HTTP Listener for this Path Rule.
        /// </summary>
        public readonly string FirewallPolicyId;
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of this Application Gateway.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of Paths used in this Path Rule.
        /// </summary>
        public readonly ImmutableArray<string> Paths;
        /// <summary>
        /// The ID of the associated Redirect Configuration.
        /// </summary>
        public readonly string RedirectConfigurationId;
        /// <summary>
        /// The Name of the Redirect Configuration which is used for this Routing Rule.
        /// </summary>
        public readonly string RedirectConfigurationName;
        /// <summary>
        /// The ID of the associated Rewrite Rule Set.
        /// </summary>
        public readonly string RewriteRuleSetId;
        /// <summary>
        /// The Name of the Rewrite Rule Set which is used for this Routing Rule.
        /// </summary>
        public readonly string RewriteRuleSetName;

        [OutputConstructor]
        private GetApplicationGatewayUrlPathMapPathRuleResult(
            string backendAddressPoolId,

            string backendAddressPoolName,

            string backendHttpSettingsId,

            string backendHttpSettingsName,

            string firewallPolicyId,

            string id,

            string name,

            ImmutableArray<string> paths,

            string redirectConfigurationId,

            string redirectConfigurationName,

            string rewriteRuleSetId,

            string rewriteRuleSetName)
        {
            BackendAddressPoolId = backendAddressPoolId;
            BackendAddressPoolName = backendAddressPoolName;
            BackendHttpSettingsId = backendHttpSettingsId;
            BackendHttpSettingsName = backendHttpSettingsName;
            FirewallPolicyId = firewallPolicyId;
            Id = id;
            Name = name;
            Paths = paths;
            RedirectConfigurationId = redirectConfigurationId;
            RedirectConfigurationName = redirectConfigurationName;
            RewriteRuleSetId = rewriteRuleSetId;
            RewriteRuleSetName = rewriteRuleSetName;
        }
    }
}
