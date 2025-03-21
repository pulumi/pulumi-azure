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
    public sealed class NextGenerationFirewallVirtualHubPanoramaDestinationNat
    {
        public readonly Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfig? BackendConfig;
        public readonly Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfig? FrontendConfig;
        public readonly string Name;
        public readonly string Protocol;

        [OutputConstructor]
        private NextGenerationFirewallVirtualHubPanoramaDestinationNat(
            Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfig? backendConfig,

            Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfig? frontendConfig,

            string name,

            string protocol)
        {
            BackendConfig = backendConfig;
            FrontendConfig = frontendConfig;
            Name = name;
            Protocol = protocol;
        }
    }
}
