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
    public sealed class ApplicationGatewayRewriteRuleSetRewriteRule
    {
        /// <summary>
        /// One or more `condition` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleCondition> Conditions;
        /// <summary>
        /// Unique name of the rewrite rule block
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// One or more `request_header_configuration` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfiguration> RequestHeaderConfigurations;
        /// <summary>
        /// One or more `response_header_configuration` blocks as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration> ResponseHeaderConfigurations;
        /// <summary>
        /// Rule sequence of the rewrite rule that determines the order of execution in a set.
        /// </summary>
        public readonly int RuleSequence;
        /// <summary>
        /// One `url` block as defined below
        /// </summary>
        public readonly Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrl? Url;

        [OutputConstructor]
        private ApplicationGatewayRewriteRuleSetRewriteRule(
            ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleCondition> conditions,

            string name,

            ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleRequestHeaderConfiguration> requestHeaderConfigurations,

            ImmutableArray<Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleResponseHeaderConfiguration> responseHeaderConfigurations,

            int ruleSequence,

            Outputs.ApplicationGatewayRewriteRuleSetRewriteRuleUrl? url)
        {
            Conditions = conditions;
            Name = name;
            RequestHeaderConfigurations = requestHeaderConfigurations;
            ResponseHeaderConfigurations = responseHeaderConfigurations;
            RuleSequence = ruleSequence;
            Url = url;
        }
    }
}
