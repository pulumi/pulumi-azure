// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Inputs
{

    public sealed class FrontdoorBackendPoolBackendArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Location of the backend (IP address or FQDN)
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Specifies if the backend is enabled or not. Valid options are `true` or `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The value to use as the host header sent to the backend.
        /// </summary>
        [Input("hostHeader", required: true)]
        public Input<string> HostHeader { get; set; } = null!;

        /// <summary>
        /// The HTTP TCP port number. Possible values are between `1` - `65535`.
        /// </summary>
        [Input("httpPort", required: true)]
        public Input<int> HttpPort { get; set; } = null!;

        /// <summary>
        /// The HTTPS TCP port number. Possible values are between `1` - `65535`.
        /// </summary>
        [Input("httpsPort", required: true)]
        public Input<int> HttpsPort { get; set; } = null!;

        /// <summary>
        /// Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy. Defaults to `1`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Weight of this endpoint for load balancing purposes. Defaults to `50`.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public FrontdoorBackendPoolBackendArgs()
        {
        }
        public static new FrontdoorBackendPoolBackendArgs Empty => new FrontdoorBackendPoolBackendArgs();
    }
}
