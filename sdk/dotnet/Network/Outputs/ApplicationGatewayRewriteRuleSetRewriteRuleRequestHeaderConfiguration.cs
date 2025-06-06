// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfiguration
    {
        /// <summary>
        /// Header name of the header configuration.
        /// </summary>
        public readonly string HeaderName;
        /// <summary>
        /// Header value of the header configuration. To delete a request header set this property to an empty string.
        /// </summary>
        public readonly string HeaderValue;

        [OutputConstructor]
        private ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfiguration(
            string headerName,

            string headerValue)
        {
            HeaderName = headerName;
            HeaderValue = headerValue;
        }
    }
}
