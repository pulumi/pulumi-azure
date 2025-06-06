// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ScheduledQueryRulesAlertTriggerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `metric_trigger` block as defined above. Trigger condition for metric query rule.
        /// </summary>
        [Input("metricTrigger")]
        public Input<Inputs.ScheduledQueryRulesAlertTriggerMetricTriggerGetArgs>? MetricTrigger { get; set; }

        /// <summary>
        /// Evaluation operation for rule - 'GreaterThan', GreaterThanOrEqual', 'LessThan', or 'LessThanOrEqual'.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Result or count threshold based on which rule should be triggered. Values must be between 0 and 10000 inclusive.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        public ScheduledQueryRulesAlertTriggerGetArgs()
        {
        }
        public static new ScheduledQueryRulesAlertTriggerGetArgs Empty => new ScheduledQueryRulesAlertTriggerGetArgs();
    }
}
