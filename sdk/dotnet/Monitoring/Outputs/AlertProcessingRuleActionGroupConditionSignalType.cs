// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class AlertProcessingRuleActionGroupConditionSignalType
    {
        /// <summary>
        /// The operator for a given condition. Possible values are `Equals` and `NotEquals`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Specifies a list of values to match for a given condition. Possible values are `Metric`, `Log`, `Unknown`, and `Health`.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private AlertProcessingRuleActionGroupConditionSignalType(
            string @operator,

            ImmutableArray<string> values)
        {
            Operator = @operator;
            Values = values;
        }
    }
}
