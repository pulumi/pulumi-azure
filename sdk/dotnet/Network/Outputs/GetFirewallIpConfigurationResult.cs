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
    public sealed class GetFirewallIpConfigurationResult
    {
        /// <summary>
        /// The name of the Azure Firewall.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The private IP address associated with the Azure Firewall.
        /// </summary>
        public readonly string PrivateIpAddress;
        /// <summary>
        /// The ID of the Public IP address of the Azure Firewall.
        /// </summary>
        public readonly string PublicIpAddressId;
        /// <summary>
        /// The ID of the Subnet where the Azure Firewall is deployed.
        /// </summary>
        public readonly string SubnetId;

        [OutputConstructor]
        private GetFirewallIpConfigurationResult(
            string name,

            string privateIpAddress,

            string publicIpAddressId,

            string subnetId)
        {
            Name = name;
            PrivateIpAddress = privateIpAddress;
            PublicIpAddressId = publicIpAddressId;
            SubnetId = subnetId;
        }
    }
}
