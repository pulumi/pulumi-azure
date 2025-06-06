// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WorkloadsSAP.Outputs
{

    [OutputType]
    public sealed class ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer
    {
        /// <summary>
        /// The full name for the availability set. Changing this forces a new resource to be created.
        /// </summary>
        public readonly string? AvailabilitySetName;
        /// <summary>
        /// A `load_balancer` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public readonly Outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer? LoadBalancer;
        /// <summary>
        /// One or more `virtual_machine` blocks as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public readonly ImmutableArray<Outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> VirtualMachines;

        [OutputConstructor]
        private ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServer(
            string? availabilitySetName,

            Outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerLoadBalancer? loadBalancer,

            ImmutableArray<Outputs.ThreeTierVirtualInstanceThreeTierConfigurationResourceNamesCentralServerVirtualMachine> virtualMachines)
        {
            AvailabilitySetName = availabilitySetName;
            LoadBalancer = loadBalancer;
            VirtualMachines = virtualMachines;
        }
    }
}
