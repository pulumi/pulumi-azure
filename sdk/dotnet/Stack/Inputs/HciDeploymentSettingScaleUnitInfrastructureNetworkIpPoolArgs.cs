// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Stack.Inputs
{

    public sealed class HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies starting IP address for the management network. A minimum of six free, contiguous IPv4 addresses (excluding your host IPs) are needed for infrastructure services such as clustering. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        [Input("endingAddress", required: true)]
        public Input<string> EndingAddress { get; set; } = null!;

        /// <summary>
        /// Specifies ending IP address for the management network. A minimum of six free, contiguous IPv4 addresses (excluding your host IPs) are needed for infrastructure services such as clustering. Changing this forces a new Stack HCI Deployment Setting to be created.
        /// </summary>
        [Input("startingAddress", required: true)]
        public Input<string> StartingAddress { get; set; } = null!;

        public HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs()
        {
        }
        public static new HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs Empty => new HciDeploymentSettingScaleUnitInfrastructureNetworkIpPoolArgs();
    }
}
