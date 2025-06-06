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
    public sealed class FrontdoorFirewallPolicyLogScrubbing
    {
        /// <summary>
        /// Is log scrubbing enabled? Possible values are `true` or `false`. Defaults to `true`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// One or more `scrubbing_rule` blocks as defined below.
        /// 
        /// &gt; **Note:** For more information on masking sensitive data in Azure Front Door please see the [product documentation](https://learn.microsoft.com/azure/web-application-firewall/afds/waf-sensitive-data-protection-configure-frontdoor).
        /// </summary>
        public readonly ImmutableArray<Outputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRule> ScrubbingRules;

        [OutputConstructor]
        private FrontdoorFirewallPolicyLogScrubbing(
            bool? enabled,

            ImmutableArray<Outputs.FrontdoorFirewallPolicyLogScrubbingScrubbingRule> scrubbingRules)
        {
            Enabled = enabled;
            ScrubbingRules = scrubbingRules;
        }
    }
}
