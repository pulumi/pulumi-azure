// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class FrontdoorRuleConditionsRequestSchemeCondition
    {
        /// <summary>
        /// The requests protocol to match. Possible values include `HTTP` or `HTTPS`. Defaults to `HTTP`.
        /// </summary>
        public readonly string? MatchValues;
        /// <summary>
        /// If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
        /// </summary>
        public readonly bool? NegateCondition;
        /// <summary>
        /// Possible value `Equal`. Defaults to `Equal`.
        /// </summary>
        public readonly string? Operator;

        [OutputConstructor]
        private FrontdoorRuleConditionsRequestSchemeCondition(
            string? matchValues,

            bool? negateCondition,

            string? @operator)
        {
            MatchValues = matchValues;
            NegateCondition = negateCondition;
            Operator = @operator;
        }
    }
}