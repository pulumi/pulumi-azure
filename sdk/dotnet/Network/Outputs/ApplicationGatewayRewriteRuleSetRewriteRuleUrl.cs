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
    public sealed class ApplicationGatewayRewriteRuleSetRewriteRuleUrl
    {
        /// <summary>
        /// The components used to rewrite the URL. Possible values are `path_only` and `query_string_only` to limit the rewrite to the URL Path or URL Query String only.
        /// 
        /// &gt; **Note:** One or both of `path` and `query_string` must be specified. If one of these is not specified, it means the value will be empty. If you only want to rewrite `path` or `query_string`, use `components`.
        /// </summary>
        public readonly string? Components;
        /// <summary>
        /// The URL path to rewrite.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// The query string to rewrite.
        /// </summary>
        public readonly string? QueryString;
        /// <summary>
        /// Whether the URL path map should be reevaluated after this rewrite has been applied. [More info on rewrite configuration](https://docs.microsoft.com/azure/application-gateway/rewrite-http-headers-url#rewrite-configuration)
        /// </summary>
        public readonly bool? Reroute;

        [OutputConstructor]
        private ApplicationGatewayRewriteRuleSetRewriteRuleUrl(
            string? components,

            string? path,

            string? queryString,

            bool? reroute)
        {
            Components = components;
            Path = path;
            QueryString = queryString;
            Reroute = reroute;
        }
    }
}
