// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SystemCenter.Outputs
{

    [OutputType]
    public sealed class VirtualMachineManagerVirtualMachineInstanceNetworkInterface
    {
        /// <summary>
        /// The IPv4 address type. Possible values are `Dynamic` and `Static`.
        /// </summary>
        public readonly string? Ipv4AddressType;
        /// <summary>
        /// The IPv6 address type. Possible values are `Dynamic` and `Static`.
        /// </summary>
        public readonly string? Ipv6AddressType;
        /// <summary>
        /// The MAC address type. Possible values are `Dynamic` and `Static`.
        /// </summary>
        public readonly string? MacAddressType;
        /// <summary>
        /// The name of the Virtual Network in System Center Virtual Machine Manager Server that the Network Interface is connected to.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the System Center Virtual Machine Manager Virtual Network to connect the Network Interface.
        /// </summary>
        public readonly string? VirtualNetworkId;

        [OutputConstructor]
        private VirtualMachineManagerVirtualMachineInstanceNetworkInterface(
            string? ipv4AddressType,

            string? ipv6AddressType,

            string? macAddressType,

            string name,

            string? virtualNetworkId)
        {
            Ipv4AddressType = ipv4AddressType;
            Ipv6AddressType = ipv6AddressType;
            MacAddressType = macAddressType;
            Name = name;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}
