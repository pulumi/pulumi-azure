// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress
    {
        /// <summary>
        /// The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine. Valid values must be between `1` and `26` characters long, start with a lower case letter, end with a lower case letter or number and contains only `a-z`, `0-9` and `hyphens`.
        /// </summary>
        public readonly string? DomainNameLabel;
        /// <summary>
        /// The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
        /// </summary>
        public readonly int? IdleTimeoutInMinutes;
        /// <summary>
        /// One or more `ip_tag` blocks as defined above. Changing this forces a new resource to be created.
        /// </summary>
        public readonly ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> IpTags;
        /// <summary>
        /// The Name of the Public IP Address Configuration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? PublicIpPrefixId;
        /// <summary>
        /// Specifies what Public IP Address SKU the Public IP Address should be provisioned as. Possible vaules include `Basic_Regional`, `Basic_Global`, `Standard_Regional` or `Standard_Global`. For more information about Public IP Address SKU's and their capabilities, please see the [product documentation](https://docs.microsoft.com/azure/virtual-network/ip-services/public-ip-addresses#sku). Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? SkuName;
        /// <summary>
        /// The Internet Protocol Version which should be used for this public IP address. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress(
            string? domainNameLabel,

            int? idleTimeoutInMinutes,

            ImmutableArray<Outputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags,

            string name,

            string? publicIpPrefixId,

            string? skuName,

            string? version)
        {
            DomainNameLabel = domainNameLabel;
            IdleTimeoutInMinutes = idleTimeoutInMinutes;
            IpTags = ipTags;
            Name = name;
            PublicIpPrefixId = publicIpPrefixId;
            SkuName = skuName;
            Version = version;
        }
    }
}
