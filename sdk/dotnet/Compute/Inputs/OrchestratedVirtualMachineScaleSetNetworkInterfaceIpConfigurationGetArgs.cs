// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationGatewayBackendAddressPoolIds")]
        private InputList<string>? _applicationGatewayBackendAddressPoolIds;

        /// <summary>
        /// A list of Backend Address Pools IDs from a Application Gateway which this Virtual Machine Scale Set should be connected to.
        /// </summary>
        public InputList<string> ApplicationGatewayBackendAddressPoolIds
        {
            get => _applicationGatewayBackendAddressPoolIds ?? (_applicationGatewayBackendAddressPoolIds = new InputList<string>());
            set => _applicationGatewayBackendAddressPoolIds = value;
        }

        [Input("applicationSecurityGroupIds")]
        private InputList<string>? _applicationSecurityGroupIds;

        /// <summary>
        /// A list of Application Security Group IDs which this Virtual Machine Scale Set should be connected to.
        /// </summary>
        public InputList<string> ApplicationSecurityGroupIds
        {
            get => _applicationSecurityGroupIds ?? (_applicationSecurityGroupIds = new InputList<string>());
            set => _applicationSecurityGroupIds = value;
        }

        [Input("loadBalancerBackendAddressPoolIds")]
        private InputList<string>? _loadBalancerBackendAddressPoolIds;

        /// <summary>
        /// A list of Backend Address Pools IDs from a Load Balancer which this Virtual Machine Scale Set should be connected to.
        /// 
        /// &gt; **Note:** When using this field you'll also need to configure a Rule for the Load Balancer, and use a depends_on between this resource and the Load Balancer Rule.
        /// </summary>
        public InputList<string> LoadBalancerBackendAddressPoolIds
        {
            get => _loadBalancerBackendAddressPoolIds ?? (_loadBalancerBackendAddressPoolIds = new InputList<string>());
            set => _loadBalancerBackendAddressPoolIds = value;
        }

        /// <summary>
        /// The Name which should be used for this IP Configuration.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Is this the Primary IP Configuration for this Network Interface? Possible values are `true` and `false`. Defaults to `false`.
        /// 
        /// &gt; **Note:** One `ip_configuration` block must be marked as Primary for each Network Interface.
        /// </summary>
        [Input("primary")]
        public Input<bool>? Primary { get; set; }

        [Input("publicIpAddresses")]
        private InputList<Inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressGetArgs>? _publicIpAddresses;

        /// <summary>
        /// A `public_ip_address` block as defined below.
        /// </summary>
        public InputList<Inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressGetArgs> PublicIpAddresses
        {
            get => _publicIpAddresses ?? (_publicIpAddresses = new InputList<Inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressGetArgs>());
            set => _publicIpAddresses = value;
        }

        /// <summary>
        /// The ID of the Subnet which this IP Configuration should be connected to.
        /// 
        /// &gt; **Note:** `subnet_id` is required if version is set to `IPv4`.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// The Internet Protocol Version which should be used for this IP Configuration. Possible values are `IPv4` and `IPv6`. Defaults to `IPv4`.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationGetArgs()
        {
        }
        public static new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationGetArgs Empty => new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationGetArgs();
    }
}
