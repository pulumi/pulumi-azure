// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Inputs
{

    public sealed class FrontdoorFirewallPolicyManagedRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to perform when the managed rule is matched. Possible values are `Allow`, `Block`, `Log`, or `Redirect`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("exclusions")]
        private InputList<Inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs>? _exclusions;

        /// <summary>
        /// One or more `exclusion` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs> Exclusions
        {
            get => _exclusions ?? (_exclusions = new InputList<Inputs.FrontdoorFirewallPolicyManagedRuleExclusionArgs>());
            set => _exclusions = value;
        }

        [Input("overrides")]
        private InputList<Inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs>? _overrides;

        /// <summary>
        /// One or more `override` blocks as defined below.
        /// </summary>
        public InputList<Inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.FrontdoorFirewallPolicyManagedRuleOverrideArgs>());
            set => _overrides = value;
        }

        /// <summary>
        /// The name of the managed rule to use with this resource.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The version on the managed rule to use with this resource.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public FrontdoorFirewallPolicyManagedRuleArgs()
        {
        }
        public static new FrontdoorFirewallPolicyManagedRuleArgs Empty => new FrontdoorFirewallPolicyManagedRuleArgs();
    }
}