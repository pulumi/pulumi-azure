// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class ScaleSetNetworkProfileDnsSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dnsServers", required: true)]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// Specifies an array of DNS servers.
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        public ScaleSetNetworkProfileDnsSettingsGetArgs()
        {
        }
        public static new ScaleSetNetworkProfileDnsSettingsGetArgs Empty => new ScaleSetNetworkProfileDnsSettingsGetArgs();
    }
}
