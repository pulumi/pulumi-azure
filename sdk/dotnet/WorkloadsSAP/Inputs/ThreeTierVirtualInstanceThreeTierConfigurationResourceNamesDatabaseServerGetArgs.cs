// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WorkloadsSAP.Inputs
{

    public sealed class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full name for the availability set. Changing this forces a new resource to be created.
        /// </summary>
        [Input("availabilitySetName")]
        public Input<string>? AvailabilitySetName { get; set; }

        /// <summary>
        /// A `load_balancer` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("loadBalancer")]
        public Input<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerLoadBalancerGetArgs>? LoadBalancer { get; set; }

        [Input("virtualMachines")]
        private InputList<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineGetArgs>? _virtualMachines;

        /// <summary>
        /// One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineGetArgs> VirtualMachines
        {
            get => _virtualMachines ?? (_virtualMachines = new InputList<Inputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerVirtualMachineGetArgs>());
            set => _virtualMachines = value;
        }

        public ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerGetArgs()
        {
        }
        public static new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerGetArgs Empty => new ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesDatabaseServerGetArgs();
    }
}
