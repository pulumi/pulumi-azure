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
    public sealed class FirewallIpConfiguration
    {
        /// <summary>
        /// Specifies the name of the IP Configuration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The private IP address associated with the Firewall.
        /// </summary>
        public readonly string? PrivateIpAddress;
        /// <summary>
        /// The ID of the Public IP Address associated with the firewall.
        /// 
        /// &gt; **Note:** A public ip address is required unless a `management_ip_configuration` block is specified.
        /// 
        /// &gt; **Note:** When multiple `ip_configuration` blocks with `public_ip_address_id` are configured, `pulumi up` will raise an error when one or some of these `ip_configuration` blocks are removed. because the `public_ip_address_id` is still used by the `firewall` resource until the `firewall` resource is updated. and the destruction of `azure.network.PublicIp` happens before the update of firewall by default. to destroy of `azure.network.PublicIp` will cause the error. The workaround is to set `create_before_destroy=true` to the `azure.network.PublicIp` resource `lifecycle` block. See more detail: destroying.md#create-before-destroy
        /// 
        /// &gt; **Note:** The Public IP must have a `Static` allocation and `Standard` SKU.
        /// </summary>
        public readonly string? PublicIpAddressId;
        /// <summary>
        /// Reference to the subnet associated with the IP Configuration. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** The Subnet used for the Firewall must have the name `AzureFirewallSubnet` and the subnet mask must be at least a `/26`.
        /// 
        /// &gt; **Note:** At least one and only one `ip_configuration` block may contain a `subnet_id`.
        /// </summary>
        public readonly string? SubnetId;

        [OutputConstructor]
        private FirewallIpConfiguration(
            string name,

            string? privateIpAddress,

            string? publicIpAddressId,

            string? subnetId)
        {
            Name = name;
            PrivateIpAddress = privateIpAddress;
            PublicIpAddressId = publicIpAddressId;
            SubnetId = subnetId;
        }
    }
}
