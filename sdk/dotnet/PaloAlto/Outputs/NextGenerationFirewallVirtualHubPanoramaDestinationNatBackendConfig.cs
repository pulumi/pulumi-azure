// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Outputs
{

    [OutputType]
    public sealed class NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfig
    {
        public readonly int Port;
        public readonly string PublicIpAddress;

        [OutputConstructor]
        private NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfig(
            int port,

            string publicIpAddress)
        {
            Port = port;
            PublicIpAddress = publicIpAddress;
        }
    }
}