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
    public sealed class NetworkInterfaceIpConfiguration
    {
        /// <summary>
        /// The Frontend IP Configuration ID of a Gateway SKU Load Balancer.
        /// </summary>
        public readonly string? GatewayLoadBalancerFrontendIpConfigurationId;
        /// <summary>
        /// A name used for this IP Configuration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Is this the Primary IP Configuration? Must be `true` for the first `ip_configuration` when multiple are specified. Defaults to `false`.
        /// </summary>
        public readonly bool? Primary;
        /// <summary>
        /// The first private IP address of the network interface.
        /// </summary>
        public readonly string? PrivateIpAddress;
        /// <summary>
        /// The allocation method used for the Private IP Address. Possible values are `Dynamic` and `Static`.
        /// 
        /// &gt; **Note:** `Dynamic` means "An IP is automatically assigned during creation of this Network Interface"; `Static` means "User supplied IP address will be used"
        /// </summary>
        public readonly string PrivateIpAddressAllocation;
        /// <summary>
        /// The IP Version to use. Possible values are `IPv4` or `IPv6`. Defaults to `IPv4`.
        /// </summary>
        public readonly string? PrivateIpAddressVersion;
        /// <summary>
        /// Reference to a Public IP Address to associate with this NIC
        /// </summary>
        public readonly string? PublicIpAddressId;
        /// <summary>
        /// The ID of the Subnet where this Network Interface should be located in.
        /// 
        /// &gt; **Note:** This is required when `private_ip_address_version` is set to `IPv4`.
        /// </summary>
        public readonly string? SubnetId;

        [OutputConstructor]
        private NetworkInterfaceIpConfiguration(
            string? gatewayLoadBalancerFrontendIpConfigurationId,

            string name,

            bool? primary,

            string? privateIpAddress,

            string privateIpAddressAllocation,

            string? privateIpAddressVersion,

            string? publicIpAddressId,

            string? subnetId)
        {
            GatewayLoadBalancerFrontendIpConfigurationId = gatewayLoadBalancerFrontendIpConfigurationId;
            Name = name;
            Primary = primary;
            PrivateIpAddress = privateIpAddress;
            PrivateIpAddressAllocation = privateIpAddressAllocation;
            PrivateIpAddressVersion = privateIpAddressVersion;
            PublicIpAddressId = publicIpAddressId;
            SubnetId = subnetId;
        }
    }
}
