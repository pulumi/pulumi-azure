// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class RouteFilterRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The access type of the rule. The only possible value is `Allow`.
        /// </summary>
        [Input("access", required: true)]
        public Input<string> Access { get; set; } = null!;

        [Input("communities", required: true)]
        private InputList<string>? _communities;

        /// <summary>
        /// The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
        /// </summary>
        public InputList<string> Communities
        {
            get => _communities ?? (_communities = new InputList<string>());
            set => _communities = value;
        }

        /// <summary>
        /// The name of the route filter rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The rule type of the rule. The only possible value is `Community`.
        /// </summary>
        [Input("ruleType", required: true)]
        public Input<string> RuleType { get; set; } = null!;

        public RouteFilterRuleArgs()
        {
        }
        public static new RouteFilterRuleArgs Empty => new RouteFilterRuleArgs();
    }
}
