// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Inputs
{

    public sealed class NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Device Group Name to which this Firewall Resource is registered.
        /// </summary>
        [Input("deviceGroupName")]
        public Input<string>? DeviceGroupName { get; set; }

        /// <summary>
        /// The Host Name of this Firewall Resource.
        /// </summary>
        [Input("hostName")]
        public Input<string>? HostName { get; set; }

        /// <summary>
        /// The name which should be used for this Palo Alto Next Generation Firewall Virtual Network Panorama. Changing this forces a new Palo Alto Next Generation Firewall Virtual Network Panorama to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the First Panorana server.
        /// </summary>
        [Input("panoramaServer1")]
        public Input<string>? PanoramaServer1 { get; set; }

        /// <summary>
        /// The name of the Second Panorana server.
        /// </summary>
        [Input("panoramaServer2")]
        public Input<string>? PanoramaServer2 { get; set; }

        /// <summary>
        /// The name of the Panorama Template applied to this Firewall Resource.
        /// </summary>
        [Input("templateName")]
        public Input<string>? TemplateName { get; set; }

        [Input("virtualMachineSshKey")]
        private Input<string>? _virtualMachineSshKey;

        /// <summary>
        /// The SSH Key to connect to the Firewall Resource.
        /// </summary>
        public Input<string>? VirtualMachineSshKey
        {
            get => _virtualMachineSshKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _virtualMachineSshKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs()
        {
        }
        public static new NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs Empty => new NextGenerationFirewallVirtualNetworkPanoramaPanoramaArgs();
    }
}
