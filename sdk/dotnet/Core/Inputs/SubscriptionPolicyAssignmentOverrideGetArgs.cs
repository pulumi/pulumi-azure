// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Inputs
{

    public sealed class SubscriptionPolicyAssignmentOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("selectors")]
        private InputList<Inputs.SubscriptionPolicyAssignmentOverrideSelectorGetArgs>? _selectors;

        /// <summary>
        /// One or more `override_selector` block as defined below.
        /// </summary>
        public InputList<Inputs.SubscriptionPolicyAssignmentOverrideSelectorGetArgs> Selectors
        {
            get => _selectors ?? (_selectors = new InputList<Inputs.SubscriptionPolicyAssignmentOverrideSelectorGetArgs>());
            set => _selectors = value;
        }

        /// <summary>
        /// Specifies the value to override the policy property. Possible values for `policyEffect` override listed [policy effects](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/effects).
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public SubscriptionPolicyAssignmentOverrideGetArgs()
        {
        }
        public static new SubscriptionPolicyAssignmentOverrideGetArgs Empty => new SubscriptionPolicyAssignmentOverrideGetArgs();
    }
}
