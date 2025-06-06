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
    public sealed class ScheduledQueryRulesAlertV2Criteria
    {
        /// <summary>
        /// A `dimension` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ScheduledQueryRulesAlertV2CriteriaDimension> Dimensions;
        /// <summary>
        /// A `failing_periods` block as defined below.
        /// </summary>
        public readonly Outputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriods? FailingPeriods;
        /// <summary>
        /// Specifies the column containing the metric measure number.
        /// 
        /// &gt; **Note:** `metric_measure_column` is required if `time_aggregation_method` is `Average`, `Maximum`, `Minimum`, or `Total`. And `metric_measure_column` can not be specified if `time_aggregation_method` is `Count`.
        /// </summary>
        public readonly string? MetricMeasureColumn;
        /// <summary>
        /// Specifies the criteria operator. Possible values are `Equal`, `GreaterThan`, `GreaterThanOrEqual`, `LessThan`,and `LessThanOrEqual`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// The query to run on logs. The results returned by this query are used to populate the alert.
        /// </summary>
        public readonly string Query;
        /// <summary>
        /// Specifies the column containing the resource ID. The content of the column must be an uri formatted as resource ID.
        /// </summary>
        public readonly string? ResourceIdColumn;
        /// <summary>
        /// Specifies the criteria threshold value that activates the alert.
        /// </summary>
        public readonly double Threshold;
        /// <summary>
        /// The type of aggregation to apply to the data points in aggregation granularity. Possible values are `Average`, `Count`, `Maximum`, `Minimum`,and `Total`.
        /// </summary>
        public readonly string TimeAggregationMethod;

        [OutputConstructor]
        private ScheduledQueryRulesAlertV2Criteria(
            ImmutableArray<Outputs.ScheduledQueryRulesAlertV2CriteriaDimension> dimensions,

            Outputs.ScheduledQueryRulesAlertV2CriteriaFailingPeriods? failingPeriods,

            string? metricMeasureColumn,

            string @operator,

            string query,

            string? resourceIdColumn,

            double threshold,

            string timeAggregationMethod)
        {
            Dimensions = dimensions;
            FailingPeriods = failingPeriods;
            MetricMeasureColumn = metricMeasureColumn;
            Operator = @operator;
            Query = query;
            ResourceIdColumn = resourceIdColumn;
            Threshold = threshold;
            TimeAggregationMethod = timeAggregationMethod;
        }
    }
}
