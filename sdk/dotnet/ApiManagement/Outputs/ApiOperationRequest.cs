// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Outputs
{

    [OutputType]
    public sealed class ApiOperationRequest
    {
        /// <summary>
        /// A description of the HTTP Request, which may include HTML tags.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// One or more `header` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApiOperationRequestHeader> Headers;
        /// <summary>
        /// One or more `query_parameter` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApiOperationRequestQueryParameter> QueryParameters;
        /// <summary>
        /// One or more `representation` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApiOperationRequestRepresentation> Representations;

        [OutputConstructor]
        private ApiOperationRequest(
            string? description,

            ImmutableArray<Outputs.ApiOperationRequestHeader> headers,

            ImmutableArray<Outputs.ApiOperationRequestQueryParameter> queryParameters,

            ImmutableArray<Outputs.ApiOperationRequestRepresentation> representations)
        {
            Description = description;
            Headers = headers;
            QueryParameters = queryParameters;
            Representations = representations;
        }
    }
}
