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
    public sealed class AlertPrometheusRuleGroupRule
    {
        /// <summary>
        /// An `action` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AlertPrometheusRuleGroupRuleAction> Actions;
        /// <summary>
        /// Specifies the Alert rule name.
        /// </summary>
        public readonly string? Alert;
        /// <summary>
        /// An `alert_resolution` block as defined below.
        /// </summary>
        public readonly Outputs.AlertPrometheusRuleGroupRuleAlertResolution? AlertResolution;
        /// <summary>
        /// Specifies a set of informational labels that can be used to store longer additional information such as alert descriptions or runbook links.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Annotations;
        /// <summary>
        /// Is this rule enabled? Possible values are `true` and `false`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Specifies the Prometheus Query Language expression to evaluate. For more details see [this doc](https://prometheus.io/docs/prometheus/latest/querying/basics). Evaluate at the period given by `interval` and record the result as a new set of time series with the metric name given by `record`.
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Specifies the amount of time alert must be active before firing, represented in ISO 8601 duration format.
        /// </summary>
        public readonly string? For;
        /// <summary>
        /// Specifies the labels to add or overwrite before storing the result.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// Specifies the recorded metrics name.
        /// </summary>
        public readonly string? Record;
        /// <summary>
        /// Specifies the severity of the alerts fired by the rule. Possible values are between 0 and 4.
        /// </summary>
        public readonly int? Severity;

        [OutputConstructor]
        private AlertPrometheusRuleGroupRule(
            ImmutableArray<Outputs.AlertPrometheusRuleGroupRuleAction> actions,

            string? alert,

            Outputs.AlertPrometheusRuleGroupRuleAlertResolution? alertResolution,

            ImmutableDictionary<string, string>? annotations,

            bool? enabled,

            string expression,

            string? @for,

            ImmutableDictionary<string, string>? labels,

            string? record,

            int? severity)
        {
            Actions = actions;
            Alert = alert;
            AlertResolution = alertResolution;
            Annotations = annotations;
            Enabled = enabled;
            Expression = expression;
            For = @for;
            Labels = labels;
            Record = record;
            Severity = severity;
        }
    }
}
