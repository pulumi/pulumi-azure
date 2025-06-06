// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Outputs
{

    [OutputType]
    public sealed class MetadataCategory
    {
        /// <summary>
        /// Specifies a list of domains for the solution content item.
        /// </summary>
        public readonly ImmutableArray<string> Domains;
        /// <summary>
        /// Specifies a list of industry verticals for the solution content item.
        /// </summary>
        public readonly ImmutableArray<string> Verticals;

        [OutputConstructor]
        private MetadataCategory(
            ImmutableArray<string> domains,

            ImmutableArray<string> verticals)
        {
            Domains = domains;
            Verticals = verticals;
        }
    }
}
