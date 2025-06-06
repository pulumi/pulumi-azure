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
    public sealed class FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion
    {
        /// <summary>
        /// The variable type to be excluded. Possible values are `QueryStringArgNames`, `RequestBodyPostArgNames`, `RequestCookieNames`, `RequestHeaderNames`, `RequestBodyJsonArgNames`
        /// 
        /// &gt; **Note:** `RequestBodyJsonArgNames` is only available on Default Rule Set (DRS) 2.0 or later
        /// </summary>
        public readonly string MatchVariable;
        /// <summary>
        /// Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to. Possible values are: `Equals`, `Contains`, `StartsWith`, `EndsWith`, or `EqualsAny`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Selector for the value in the `match_variable` attribute this exclusion applies to.
        /// 
        /// &gt; **Note:** `selector` must be set to `*` if `operator` is set to `EqualsAny`.
        /// </summary>
        public readonly string Selector;

        [OutputConstructor]
        private FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion(
            string matchVariable,

            string @operator,

            string selector)
        {
            MatchVariable = matchVariable;
            Operator = @operator;
            Selector = selector;
        }
    }
}
