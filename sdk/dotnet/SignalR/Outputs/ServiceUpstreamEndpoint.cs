// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR.Outputs
{

    [OutputType]
    public sealed class ServiceUpstreamEndpoint
    {
        /// <summary>
        /// The categories to match on, or `*` for all.
        /// </summary>
        public readonly ImmutableArray<string> CategoryPatterns;
        /// <summary>
        /// The events to match on, or `*` for all.
        /// </summary>
        public readonly ImmutableArray<string> EventPatterns;
        /// <summary>
        /// The hubs to match on, or `*` for all.
        /// </summary>
        public readonly ImmutableArray<string> HubPatterns;
        /// <summary>
        /// The upstream URL Template. This can be a url or a template such as `http://host.com/{hub}/api/{category}/{event}`.
        /// </summary>
        public readonly string UrlTemplate;
        /// <summary>
        /// Specifies the Managed Identity IDs to be assigned to this signalR upstream setting by using resource uuid as both system assigned and user assigned identity is supported.
        /// </summary>
        public readonly string? UserAssignedIdentityId;

        [OutputConstructor]
        private ServiceUpstreamEndpoint(
            ImmutableArray<string> categoryPatterns,

            ImmutableArray<string> eventPatterns,

            ImmutableArray<string> hubPatterns,

            string urlTemplate,

            string? userAssignedIdentityId)
        {
            CategoryPatterns = categoryPatterns;
            EventPatterns = eventPatterns;
            HubPatterns = hubPatterns;
            UrlTemplate = urlTemplate;
            UserAssignedIdentityId = userAssignedIdentityId;
        }
    }
}
