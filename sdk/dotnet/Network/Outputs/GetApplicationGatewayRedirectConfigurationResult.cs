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
    public sealed class GetApplicationGatewayRedirectConfigurationResult
    {
        /// <summary>
        /// The ID of the Rewrite Rule Set
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the path is included in the redirected URL.
        /// </summary>
        public readonly bool IncludePath;
        /// <summary>
        /// Whether to include the query string in the redirected URL.
        /// </summary>
        public readonly bool IncludeQueryString;
        /// <summary>
        /// The name of this Application Gateway.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The type of redirect.
        /// </summary>
        public readonly string RedirectType;
        public readonly string TargetListenerId;
        /// <summary>
        /// The name of the listener to redirect to.
        /// </summary>
        public readonly string TargetListenerName;
        /// <summary>
        /// The URL to redirect the request to.
        /// </summary>
        public readonly string TargetUrl;

        [OutputConstructor]
        private GetApplicationGatewayRedirectConfigurationResult(
            string id,

            bool includePath,

            bool includeQueryString,

            string name,

            string redirectType,

            string targetListenerId,

            string targetListenerName,

            string targetUrl)
        {
            Id = id;
            IncludePath = includePath;
            IncludeQueryString = includeQueryString;
            Name = name;
            RedirectType = redirectType;
            TargetListenerId = targetListenerId;
            TargetListenerName = targetListenerName;
            TargetUrl = targetUrl;
        }
    }
}
