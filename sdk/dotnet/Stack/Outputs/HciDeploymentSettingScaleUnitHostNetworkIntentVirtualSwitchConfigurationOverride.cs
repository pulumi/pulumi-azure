// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Stack.Outputs
{

    [OutputType]
    public sealed class HciDeploymentSettingScaleUnitHostNetworkIntentVirtualSwitchConfigurationOverride
    {
        /// <summary>
        /// Specifies the IoV enable status for Virtual Switch. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        public readonly string? EnableIov;
        /// <summary>
        /// Specifies the load balancing algorithm for Virtual Switch. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        public readonly string? LoadBalancingAlgorithm;

        [OutputConstructor]
        private HciDeploymentSettingScaleUnitHostNetworkIntentVirtualSwitchConfigurationOverride(
            string? enableIov,

            string? loadBalancingAlgorithm)
        {
            EnableIov = enableIov;
            LoadBalancingAlgorithm = loadBalancingAlgorithm;
        }
    }
}
