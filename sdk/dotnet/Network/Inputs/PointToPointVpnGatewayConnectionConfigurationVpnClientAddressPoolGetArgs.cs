// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("addressPrefixes", required: true)]
        private InputList<string>? _addressPrefixes;

        /// <summary>
        /// A list of CIDR Ranges which should be used as Address Prefixes.
        /// </summary>
        public InputList<string> AddressPrefixes
        {
            get => _addressPrefixes ?? (_addressPrefixes = new InputList<string>());
            set => _addressPrefixes = value;
        }

        public PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolGetArgs()
        {
        }
        public static new PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolGetArgs Empty => new PointToPointVpnGatewayConnectionConfigurationVpnClientAddressPoolGetArgs();
    }
}
