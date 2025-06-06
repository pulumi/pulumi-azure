// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class ManagementPolicyRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An `actions` block as documented below.
        /// </summary>
        [Input("actions", required: true)]
        public Input<Inputs.ManagementPolicyRuleActionsArgs> Actions { get; set; } = null!;

        /// <summary>
        /// Boolean to specify whether the rule is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// A `filters` block as documented below.
        /// </summary>
        [Input("filters", required: true)]
        public Input<Inputs.ManagementPolicyRuleFiltersArgs> Filters { get; set; } = null!;

        /// <summary>
        /// The name of the rule. Rule name is case-sensitive. It must be unique within a policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ManagementPolicyRuleArgs()
        {
        }
        public static new ManagementPolicyRuleArgs Empty => new ManagementPolicyRuleArgs();
    }
}
