// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DevTest.Inputs
{

    public sealed class VirtualNetworkSubnetSharedPublicIpAddressArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedPorts")]
        private InputList<Inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs>? _allowedPorts;

        /// <summary>
        /// A list of `allowed_ports` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs> AllowedPorts
        {
            get => _allowedPorts ?? (_allowedPorts = new InputList<Inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs>());
            set => _allowedPorts = value;
        }

        public VirtualNetworkSubnetSharedPublicIpAddressArgs()
        {
        }
        public static new VirtualNetworkSubnetSharedPublicIpAddressArgs Empty => new VirtualNetworkSubnetSharedPublicIpAddressArgs();
    }
}
