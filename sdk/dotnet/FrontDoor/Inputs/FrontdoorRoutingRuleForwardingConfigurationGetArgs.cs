// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Inputs
{

    public sealed class FrontdoorRoutingRuleForwardingConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Backend Pool to forward the incoming traffic to.
        /// </summary>
        [Input("backendPoolName", required: true)]
        public Input<string> BackendPoolName { get; set; } = null!;

        /// <summary>
        /// Specify the minimum caching duration (in ISO8601 notation e.g. `P1DT2H` for 1 day and 2 hours). Needs to be greater than 0 and smaller than 365 days. `cache_duration` works only in combination with `cache_enabled` set to `true`.
        /// </summary>
        [Input("cacheDuration")]
        public Input<string>? CacheDuration { get; set; }

        /// <summary>
        /// Specifies whether to Enable caching or not. Valid options are `true` or `false`. Defaults to `false`.
        /// </summary>
        [Input("cacheEnabled")]
        public Input<bool>? CacheEnabled { get; set; }

        /// <summary>
        /// Defines cache behaviour in relation to query string parameters. Valid options are `StripAll`, `StripAllExcept`, `StripOnly` or `StripNone`. Defaults to `StripAll`.
        /// </summary>
        [Input("cacheQueryParameterStripDirective")]
        public Input<string>? CacheQueryParameterStripDirective { get; set; }

        [Input("cacheQueryParameters")]
        private InputList<string>? _cacheQueryParameters;

        /// <summary>
        /// Specify query parameters (array). Works only in combination with `cache_query_parameter_strip_directive` set to `StripAllExcept` or `StripOnly`.
        /// </summary>
        public InputList<string> CacheQueryParameters
        {
            get => _cacheQueryParameters ?? (_cacheQueryParameters = new InputList<string>());
            set => _cacheQueryParameters = value;
        }

        /// <summary>
        /// Whether to use dynamic compression when caching. Valid options are `true` or `false`. Defaults to `false`.
        /// </summary>
        [Input("cacheUseDynamicCompression")]
        public Input<bool>? CacheUseDynamicCompression { get; set; }

        /// <summary>
        /// Path to use when constructing the request to forward to the backend. This functions as a URL Rewrite. Default behaviour preserves the URL path.
        /// </summary>
        [Input("customForwardingPath")]
        public Input<string>? CustomForwardingPath { get; set; }

        /// <summary>
        /// Protocol to use when redirecting. Valid options are `HttpOnly`, `HttpsOnly`, or `MatchRequest`. Defaults to `HttpsOnly`.
        /// </summary>
        [Input("forwardingProtocol")]
        public Input<string>? ForwardingProtocol { get; set; }

        public FrontdoorRoutingRuleForwardingConfigurationGetArgs()
        {
        }
        public static new FrontdoorRoutingRuleForwardingConfigurationGetArgs Empty => new FrontdoorRoutingRuleForwardingConfigurationGetArgs();
    }
}
