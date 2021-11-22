// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Outputs
{

    [OutputType]
    public sealed class KubernetesClusterNetworkProfileNatGatewayProfile
    {
        /// <summary>
        /// The outcome (resource IDs) of the specified arguments.
        /// </summary>
        public readonly ImmutableArray<string> EffectiveOutboundIps;
        /// <summary>
        /// Desired outbound flow idle timeout in minutes for the cluster load balancer. Must be between `4` and `120` inclusive. Defaults to `4`.
        /// </summary>
        public readonly int? IdleTimeoutInMinutes;
        /// <summary>
        /// Count of desired managed outbound IPs for the cluster load balancer. Must be between `1` and `100` inclusive.
        /// </summary>
        public readonly int? ManagedOutboundIpCount;

        [OutputConstructor]
        private KubernetesClusterNetworkProfileNatGatewayProfile(
            ImmutableArray<string> effectiveOutboundIps,

            int? idleTimeoutInMinutes,

            int? managedOutboundIpCount)
        {
            EffectiveOutboundIps = effectiveOutboundIps;
            IdleTimeoutInMinutes = idleTimeoutInMinutes;
            ManagedOutboundIpCount = managedOutboundIpCount;
        }
    }
}