// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Outputs
{

    [OutputType]
    public sealed class NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile
    {
        public readonly ImmutableArray<string> EgressNatIpAddressIds;
        public readonly ImmutableArray<string> EgressNatIpAddresses;
        public readonly string? IpOfTrustForUserDefinedRoutes;
        public readonly string NetworkVirtualApplianceId;
        public readonly ImmutableArray<string> PublicIpAddressIds;
        public readonly ImmutableArray<string> PublicIpAddresses;
        public readonly string? TrustedSubnetId;
        public readonly string? UntrustedSubnetId;
        public readonly string VirtualHubId;

        [OutputConstructor]
        private NextGenerationFirewallVirtualHubLocalRulestackNetworkProfile(
            ImmutableArray<string> egressNatIpAddressIds,

            ImmutableArray<string> egressNatIpAddresses,

            string? ipOfTrustForUserDefinedRoutes,

            string networkVirtualApplianceId,

            ImmutableArray<string> publicIpAddressIds,

            ImmutableArray<string> publicIpAddresses,

            string? trustedSubnetId,

            string? untrustedSubnetId,

            string virtualHubId)
        {
            EgressNatIpAddressIds = egressNatIpAddressIds;
            EgressNatIpAddresses = egressNatIpAddresses;
            IpOfTrustForUserDefinedRoutes = ipOfTrustForUserDefinedRoutes;
            NetworkVirtualApplianceId = networkVirtualApplianceId;
            PublicIpAddressIds = publicIpAddressIds;
            PublicIpAddresses = publicIpAddresses;
            TrustedSubnetId = trustedSubnetId;
            UntrustedSubnetId = untrustedSubnetId;
            VirtualHubId = virtualHubId;
        }
    }
}