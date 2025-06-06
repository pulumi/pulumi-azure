// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Inputs
{

    public sealed class FrontdoorSecurityPolicySecurityPoliciesFirewallGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `association` block as defined below. Changing this forces a new Front Door Security Policy to be created.
        /// </summary>
        [Input("association", required: true)]
        public Input<Inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallAssociationGetArgs> Association { get; set; } = null!;

        /// <summary>
        /// The Resource Id of the Front Door Firewall Policy that should be linked to this Front Door Security Policy. Changing this forces a new Front Door Security Policy to be created.
        /// </summary>
        [Input("cdnFrontdoorFirewallPolicyId", required: true)]
        public Input<string> CdnFrontdoorFirewallPolicyId { get; set; } = null!;

        public FrontdoorSecurityPolicySecurityPoliciesFirewallGetArgs()
        {
        }
        public static new FrontdoorSecurityPolicySecurityPoliciesFirewallGetArgs Empty => new FrontdoorSecurityPolicySecurityPoliciesFirewallGetArgs();
    }
}
