// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// <summary>
        /// A `backend_config` block as defined above.
        /// </summary>
        public readonly Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfig? BackendConfig;
        /// <summary>
        /// A `frontend_config` block as defined below.
        /// </summary>
        public readonly Outputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfig? FrontendConfig;
        /// <summary>
        /// The name which should be used for this NAT.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
        /// </summary>
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
