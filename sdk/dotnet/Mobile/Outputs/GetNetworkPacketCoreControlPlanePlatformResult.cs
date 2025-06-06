// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class GetNetworkPacketCoreControlPlanePlatformResult
    {
        /// <summary>
        /// The ID of Azure Arc connected cluster where the packet core is deployed.
        /// </summary>
        public readonly string ArcKubernetesClusterId;
        /// <summary>
        /// The ID of Azure Arc custom location where the packet core is deployed.
        /// </summary>
        public readonly string CustomLocationId;
        /// <summary>
        /// The ID of Azure Stack Edge device where the packet core is deployed.
        /// </summary>
        public readonly string EdgeDeviceId;
        /// <summary>
        /// The ID of Azure Stack HCI cluster where the packet core is deployed.
        /// </summary>
        public readonly string StackHciClusterId;
        /// <summary>
        /// The platform type where the packet core is deployed.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetNetworkPacketCoreControlPlanePlatformResult(
            string arcKubernetesClusterId,

            string customLocationId,

            string edgeDeviceId,

            string stackHciClusterId,

            string type)
        {
            ArcKubernetesClusterId = arcKubernetesClusterId;
            CustomLocationId = customLocationId;
            EdgeDeviceId = edgeDeviceId;
            StackHciClusterId = stackHciClusterId;
            Type = type;
        }
    }
}
