// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class FirewallPolicyExplicitProxyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the pac file port and url need to be provided.
        /// </summary>
        [Input("enablePacFile")]
        public Input<bool>? EnablePacFile { get; set; }

        /// <summary>
        /// Whether the explicit proxy is enabled for this Firewall Policy.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The port number for explicit http protocol.
        /// </summary>
        [Input("httpPort")]
        public Input<int>? HttpPort { get; set; }

        /// <summary>
        /// The port number for explicit proxy https protocol.
        /// </summary>
        [Input("httpsPort")]
        public Input<int>? HttpsPort { get; set; }

        /// <summary>
        /// Specifies a SAS URL for PAC file.
        /// </summary>
        [Input("pacFile")]
        public Input<string>? PacFile { get; set; }

        /// <summary>
        /// Specifies a port number for firewall to serve PAC file.
        /// </summary>
        [Input("pacFilePort")]
        public Input<int>? PacFilePort { get; set; }

        public FirewallPolicyExplicitProxyArgs()
        {
        }
        public static new FirewallPolicyExplicitProxyArgs Empty => new FirewallPolicyExplicitProxyArgs();
    }
}
