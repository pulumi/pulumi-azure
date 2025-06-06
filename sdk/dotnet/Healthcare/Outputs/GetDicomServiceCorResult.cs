// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Healthcare.Outputs
{

    [OutputType]
    public sealed class GetDicomServiceCorResult
    {
        /// <summary>
        /// Whether to allow credentials in CORS.
        /// </summary>
        public readonly bool AllowCredentials;
        /// <summary>
        /// A list of allowed headers for CORS.
        /// </summary>
        public readonly ImmutableArray<string> AllowedHeaders;
        /// <summary>
        /// A list of allowed methods for CORS.
        /// </summary>
        public readonly ImmutableArray<string> AllowedMethods;
        /// <summary>
        /// A list of allowed origins for CORS.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// The maximum age in seconds for the CORS configuration.
        /// </summary>
        public readonly int MaxAgeInSeconds;

        [OutputConstructor]
        private GetDicomServiceCorResult(
            bool allowCredentials,

            ImmutableArray<string> allowedHeaders,

            ImmutableArray<string> allowedMethods,

            ImmutableArray<string> allowedOrigins,

            int maxAgeInSeconds)
        {
            AllowCredentials = allowCredentials;
            AllowedHeaders = allowedHeaders;
            AllowedMethods = allowedMethods;
            AllowedOrigins = allowedOrigins;
            MaxAgeInSeconds = maxAgeInSeconds;
        }
    }
}
