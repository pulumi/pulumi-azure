// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the certificate resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the public data of the certificate.
        /// </summary>
        [Input("thumbprint", required: true)]
        public Input<string> Thumbprint { get; set; } = null!;

        public VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs()
        {
        }
        public static new VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs Empty => new VirtualNetworkGatewayVpnClientConfigurationRevokedCertificateArgs();
    }
}
