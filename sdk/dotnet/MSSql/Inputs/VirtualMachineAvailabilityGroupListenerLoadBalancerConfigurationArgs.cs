// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Inputs
{

    public sealed class VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Load Balancer. Changing this forces a new resource to be created.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// The private IP Address of the listener. Changing this forces a new resource to be created.
        /// </summary>
        [Input("privateIpAddress", required: true)]
        public Input<string> PrivateIpAddress { get; set; } = null!;

        /// <summary>
        /// The probe port of the listener. Changing this forces a new resource to be created.
        /// </summary>
        [Input("probePort", required: true)]
        public Input<int> ProbePort { get; set; } = null!;

        [Input("sqlVirtualMachineIds", required: true)]
        private InputList<string>? _sqlVirtualMachineIds;

        /// <summary>
        /// Specifies a list of SQL Virtual Machine IDs. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<string> SqlVirtualMachineIds
        {
            get => _sqlVirtualMachineIds ?? (_sqlVirtualMachineIds = new InputList<string>());
            set => _sqlVirtualMachineIds = value;
        }

        /// <summary>
        /// The ID of the Subnet to create the listener. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** `sql_virtual_machine_ids` should match with the SQL Virtual Machines specified in `replica`.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs()
        {
        }
        public static new VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs Empty => new VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs();
    }
}
