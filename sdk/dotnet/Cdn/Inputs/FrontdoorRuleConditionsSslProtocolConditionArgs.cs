// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Inputs
{

    public sealed class FrontdoorRuleConditionsSslProtocolConditionArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchValues", required: true)]
        private InputList<string>? _matchValues;

        /// <summary>
        /// A list of one or more HTTP methods. Possible values include `TLSv1.0`, `TLSv1.1` or `TLS1.2`. If multiple values are specified, they're evaluated using `OR` logic.
        /// </summary>
        public InputList<string> MatchValues
        {
            get => _matchValues ?? (_matchValues = new InputList<string>());
            set => _matchValues = value;
        }

        /// <summary>
        /// If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
        /// </summary>
        [Input("negateCondition")]
        public Input<bool>? NegateCondition { get; set; }

        /// <summary>
        /// Possible value `Equal`. Defaults to `Equal`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        public FrontdoorRuleConditionsSslProtocolConditionArgs()
        {
        }
        public static new FrontdoorRuleConditionsSslProtocolConditionArgs Empty => new FrontdoorRuleConditionsSslProtocolConditionArgs();
    }
}