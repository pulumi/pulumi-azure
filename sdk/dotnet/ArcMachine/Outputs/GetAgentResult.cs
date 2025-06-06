// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ArcMachine.Outputs
{

    [OutputType]
    public sealed class GetAgentResult
    {
        /// <summary>
        /// A `extensions_allow_list` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAgentExtensionsAllowListResult> ExtensionsAllowLists;
        /// <summary>
        /// A `extensions_block_list` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAgentExtensionsBlockListResult> ExtensionsBlockLists;
        /// <summary>
        /// Specifies whether the extension service is enabled or disabled.
        /// </summary>
        public readonly bool ExtensionsEnabled;
        /// <summary>
        /// Specified whether the guest configuration service is enabled or disabled.
        /// </summary>
        public readonly bool GuestConfigurationEnabled;
        /// <summary>
        /// Specifies the list of ports that the agent will be able to listen on.
        /// </summary>
        public readonly ImmutableArray<string> IncomingConnectionsPorts;
        /// <summary>
        /// List of service names which should not use the specified proxy server.
        /// </summary>
        public readonly ImmutableArray<string> ProxyBypasses;
        /// <summary>
        /// Specifies the URL of the proxy to be used.
        /// </summary>
        public readonly string ProxyUrl;

        [OutputConstructor]
        private GetAgentResult(
            ImmutableArray<Outputs.GetAgentExtensionsAllowListResult> extensionsAllowLists,

            ImmutableArray<Outputs.GetAgentExtensionsBlockListResult> extensionsBlockLists,

            bool extensionsEnabled,

            bool guestConfigurationEnabled,

            ImmutableArray<string> incomingConnectionsPorts,

            ImmutableArray<string> proxyBypasses,

            string proxyUrl)
        {
            ExtensionsAllowLists = extensionsAllowLists;
            ExtensionsBlockLists = extensionsBlockLists;
            ExtensionsEnabled = extensionsEnabled;
            GuestConfigurationEnabled = guestConfigurationEnabled;
            IncomingConnectionsPorts = incomingConnectionsPorts;
            ProxyBypasses = proxyBypasses;
            ProxyUrl = proxyUrl;
        }
    }
}
