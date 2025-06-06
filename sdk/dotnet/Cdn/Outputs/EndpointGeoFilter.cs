// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class EndpointGeoFilter
    {
        /// <summary>
        /// The Action of the Geo Filter. Possible values include `Allow` and `Block`.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// A List of two letter country codes (e.g. `US`, `GB`) to be associated with this Geo Filter.
        /// </summary>
        public readonly ImmutableArray<string> CountryCodes;
        /// <summary>
        /// The relative path applicable to geo filter.
        /// </summary>
        public readonly string RelativePath;

        [OutputConstructor]
        private EndpointGeoFilter(
            string action,

            ImmutableArray<string> countryCodes,

            string relativePath)
        {
            Action = action;
            CountryCodes = countryCodes;
            RelativePath = relativePath;
        }
    }
}
