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
    public sealed class EndpointGlobalDeliveryRuleUrlRedirectAction
    {
        /// <summary>
        /// Specifies the fragment part of the URL. This value must not start with a `#`.
        /// </summary>
        public readonly string? Fragment;
        /// <summary>
        /// Specifies the hostname part of the URL.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Specifies the path part of the URL. This value must begin with a `/`.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Specifies the protocol part of the URL. Valid values are `MatchRequest`, `Http` and `Https`. Defaults to `MatchRequest`.
        /// </summary>
        public readonly string? Protocol;
        /// <summary>
        /// Specifies the query string part of the URL. This value must not start with a `?` or `&amp;` and must be in `&lt;key&gt;=&lt;value&gt;` format separated by `&amp;`.
        /// </summary>
        public readonly string? QueryString;
        /// <summary>
        /// Type of the redirect. Valid values are `Found`, `Moved`, `PermanentRedirect` and `TemporaryRedirect`.
        /// </summary>
        public readonly string RedirectType;

        [OutputConstructor]
        private EndpointGlobalDeliveryRuleUrlRedirectAction(
            string? fragment,

            string? hostname,

            string? path,

            string? protocol,

            string? queryString,

            string redirectType)
        {
            Fragment = fragment;
            Hostname = hostname;
            Path = path;
            Protocol = protocol;
            QueryString = queryString;
            RedirectType = redirectType;
        }
    }
}
