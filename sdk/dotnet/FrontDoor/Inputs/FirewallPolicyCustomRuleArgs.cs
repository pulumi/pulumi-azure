// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.FrontDoor.Inputs
{

    public sealed class FirewallPolicyCustomRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to perform when the rule is matched. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Is the rule is enabled or disabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("matchConditions")]
        private InputList<Inputs.FirewallPolicyCustomRuleMatchConditionArgs>? _matchConditions;

        /// <summary>
        /// One or more `match_condition` block defined below. Can support up to `10` `match_condition` blocks.
        /// </summary>
        public InputList<Inputs.FirewallPolicyCustomRuleMatchConditionArgs> MatchConditions
        {
            get => _matchConditions ?? (_matchConditions = new InputList<Inputs.FirewallPolicyCustomRuleMatchConditionArgs>());
            set => _matchConditions = value;
        }

        /// <summary>
        /// Gets name of the resource that is unique within a policy. This name can be used to access the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The priority of the rule. Rules with a lower value will be evaluated before rules with a higher value. Defaults to `1`.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The rate limit duration in minutes. Defaults to `1`.
        /// </summary>
        [Input("rateLimitDurationInMinutes")]
        public Input<int>? RateLimitDurationInMinutes { get; set; }

        /// <summary>
        /// The rate limit threshold. Defaults to `10`.
        /// </summary>
        [Input("rateLimitThreshold")]
        public Input<int>? RateLimitThreshold { get; set; }

        /// <summary>
        /// The type of rule. Possible values are `MatchRule` or `RateLimitRule`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FirewallPolicyCustomRuleArgs()
        {
        }
        public static new FirewallPolicyCustomRuleArgs Empty => new FirewallPolicyCustomRuleArgs();
    }
}
