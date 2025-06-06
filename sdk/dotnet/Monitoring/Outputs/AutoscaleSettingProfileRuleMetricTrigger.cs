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
    public sealed class AutoscaleSettingProfileRuleMetricTrigger
    {
        /// <summary>
        /// One or more `dimensions` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AutoscaleSettingProfileRuleMetricTriggerDimension> Dimensions;
        /// <summary>
        /// Whether to enable metric divide by instance count.
        /// </summary>
        public readonly bool? DivideByInstanceCount;
        /// <summary>
        /// The name of the metric that defines what the rule monitors, such as `Percentage CPU` for `Virtual Machine Scale Sets` and `CpuPercentage` for `App Service Plan`.
        /// 
        /// &gt; **Note:** The allowed value of `metric_name` highly depends on the targeting resource type, please visit [Supported metrics with Azure Monitor](https://docs.microsoft.com/azure/azure-monitor/platform/metrics-supported) for more details.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// The namespace of the metric that defines what the rule monitors, such as `microsoft.compute/virtualmachinescalesets` for `Virtual Machine Scale Sets`.
        /// </summary>
        public readonly string? MetricNamespace;
        /// <summary>
        /// The ID of the Resource which the Rule monitors.
        /// </summary>
        public readonly string MetricResourceId;
        /// <summary>
        /// Specifies the operator used to compare the metric data and threshold. Possible values are: `Equals`, `NotEquals`, `GreaterThan`, `GreaterThanOrEqual`, `LessThan`, `LessThanOrEqual`.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Specifies how the metrics from multiple instances are combined. Possible values are `Average`, `Max`, `Min` and `Sum`.
        /// </summary>
        public readonly string Statistic;
        /// <summary>
        /// Specifies the threshold of the metric that triggers the scale action.
        /// </summary>
        public readonly double Threshold;
        /// <summary>
        /// Specifies how the data that's collected should be combined over time. Possible values include `Average`, `Count`, `Maximum`, `Minimum`, `Last` and `Total`.
        /// </summary>
        public readonly string TimeAggregation;
        /// <summary>
        /// Specifies the granularity of metrics that the rule monitors, which must be one of the pre-defined values returned from the metric definitions for the metric. This value must be between 1 minute and 12 hours an be formatted as an ISO 8601 string.
        /// </summary>
        public readonly string TimeGrain;
        /// <summary>
        /// Specifies the time range for which data is collected, which must be greater than the delay in metric collection (which varies from resource to resource). This value must be between 5 minutes and 12 hours and be formatted as an ISO 8601 string.
        /// </summary>
        public readonly string TimeWindow;

        [OutputConstructor]
        private AutoscaleSettingProfileRuleMetricTrigger(
            ImmutableArray<Outputs.AutoscaleSettingProfileRuleMetricTriggerDimension> dimensions,

            bool? divideByInstanceCount,

            string metricName,

            string? metricNamespace,

            string metricResourceId,

            string @operator,

            string statistic,

            double threshold,

            string timeAggregation,

            string timeGrain,

            string timeWindow)
        {
            Dimensions = dimensions;
            DivideByInstanceCount = divideByInstanceCount;
            MetricName = metricName;
            MetricNamespace = metricNamespace;
            MetricResourceId = metricResourceId;
            Operator = @operator;
            Statistic = statistic;
            Threshold = threshold;
            TimeAggregation = timeAggregation;
            TimeGrain = timeGrain;
            TimeWindow = timeWindow;
        }
    }
}
