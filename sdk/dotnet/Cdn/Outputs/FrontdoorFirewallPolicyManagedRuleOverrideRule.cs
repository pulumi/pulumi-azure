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
    public sealed class FrontdoorFirewallPolicyManagedRuleOverrideRule
    {
        /// <summary>
        /// The action to be applied when the managed rule matches or when the anomaly score is 5 or greater. Possible values for `DefaultRuleSet 1.1` and below are `Allow`, `Log`, `Block`, or `Redirect`. Possible values for `DefaultRuleSet 2.0` and above are `Log` or `AnomalyScoring`. Possible values for `Microsoft_BotManagerRuleSet` are `Allow`, `Log`, `Block`, `Redirect`, or `JSChallenge`.
        /// 
        /// &gt; **Note:** Please see the `DefaultRuleSet` [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-front-door-drs?tabs=drs20#anomaly-scoring-mode) or the `Microsoft_BotManagerRuleSet` [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/afds-overview) for more information.
        /// 
        /// !&gt; **Note:** Setting the `action` field to `JSChallenge` is currently in **PREVIEW**. Please see the [Supplemental Terms of Use for Microsoft Azure Previews](https://azure.microsoft.com/support/legal/preview-supplemental-terms/) for legal terms that apply to Azure features that are in beta, preview, or otherwise not yet released into general availability.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// Is the managed rule override enabled or disabled. Defaults to `false`
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// One or more `exclusion` blocks as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion> Exclusions;
        /// <summary>
        /// Identifier for the managed rule.
        /// </summary>
        public readonly string RuleId;

        [OutputConstructor]
        private FrontdoorFirewallPolicyManagedRuleOverrideRule(
            string action,

            bool? enabled,

            ImmutableArray<Outputs.FrontdoorFirewallPolicyManagedRuleOverrideRuleExclusion> exclusions,

            string ruleId)
        {
            Action = action;
            Enabled = enabled;
            Exclusions = exclusions;
            RuleId = ruleId;
        }
    }
}
