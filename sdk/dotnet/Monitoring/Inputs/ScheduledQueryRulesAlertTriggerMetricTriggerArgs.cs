// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ScheduledQueryRulesAlertTriggerMetricTriggerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Evaluation of metric on a particular column.
        /// </summary>
        [Input("metricColumn")]
        public Input<string>? MetricColumn { get; set; }

        /// <summary>
        /// Metric Trigger Type - 'Consecutive' or 'Total'.
        /// </summary>
        [Input("metricTriggerType", required: true)]
        public Input<string> MetricTriggerType { get; set; } = null!;

        /// <summary>
        /// Evaluation operation for rule - 'Equal', 'GreaterThan', GreaterThanOrEqual', 'LessThan', or 'LessThanOrEqual'.
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// The threshold of the metric trigger. Values must be between 0 and 10000 inclusive.
        /// </summary>
        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        public ScheduledQueryRulesAlertTriggerMetricTriggerArgs()
        {
        }
        public static new ScheduledQueryRulesAlertTriggerMetricTriggerArgs Empty => new ScheduledQueryRulesAlertTriggerMetricTriggerArgs();
    }
}
