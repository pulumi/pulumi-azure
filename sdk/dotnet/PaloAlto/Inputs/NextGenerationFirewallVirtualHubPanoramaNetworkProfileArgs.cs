// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Inputs
{

    public sealed class NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("egressNatIpAddressIds")]
        private InputList<string>? _egressNatIpAddressIds;
        public InputList<string> EgressNatIpAddressIds
        {
            get => _egressNatIpAddressIds ?? (_egressNatIpAddressIds = new InputList<string>());
            set => _egressNatIpAddressIds = value;
        }

        [Input("egressNatIpAddresses")]
        private InputList<string>? _egressNatIpAddresses;
        public InputList<string> EgressNatIpAddresses
        {
            get => _egressNatIpAddresses ?? (_egressNatIpAddresses = new InputList<string>());
            set => _egressNatIpAddresses = value;
        }

        [Input("ipOfTrustForUserDefinedRoutes")]
        public Input<string>? IpOfTrustForUserDefinedRoutes { get; set; }

        [Input("networkVirtualApplianceId", required: true)]
        public Input<string> NetworkVirtualApplianceId { get; set; } = null!;

        [Input("publicIpAddressIds", required: true)]
        private InputList<string>? _publicIpAddressIds;
        public InputList<string> PublicIpAddressIds
        {
            get => _publicIpAddressIds ?? (_publicIpAddressIds = new InputList<string>());
            set => _publicIpAddressIds = value;
        }

        [Input("publicIpAddresses")]
        private InputList<string>? _publicIpAddresses;
        public InputList<string> PublicIpAddresses
        {
            get => _publicIpAddresses ?? (_publicIpAddresses = new InputList<string>());
            set => _publicIpAddresses = value;
        }

        [Input("trustedSubnetId")]
        public Input<string>? TrustedSubnetId { get; set; }

        [Input("untrustedSubnetId")]
        public Input<string>? UntrustedSubnetId { get; set; }

        [Input("virtualHubId", required: true)]
        public Input<string> VirtualHubId { get; set; } = null!;

        public NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs()
        {
        }
        public static new NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs Empty => new NextGenerationFirewallVirtualHubPanoramaNetworkProfileArgs();
    }
}