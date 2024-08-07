// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Inputs
{

    public sealed class AlertRuleScheduledIncidentConfigurationGroupingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
        /// </summary>
        [Input("entityMatchingMethod")]
        public Input<string>? EntityMatchingMethod { get; set; }

        [Input("groupByAlertDetails")]
        private InputList<string>? _groupByAlertDetails;
        [Obsolete(@"The `group_by_alert_details` property has been superseded by the `by_alert_details` property and will be removed in v4.0 of the AzureRM Provider")]
        public InputList<string> GroupByAlertDetails
        {
            get => _groupByAlertDetails ?? (_groupByAlertDetails = new InputList<string>());
            set => _groupByAlertDetails = value;
        }

        [Input("groupByCustomDetails")]
        private InputList<string>? _groupByCustomDetails;
        [Obsolete(@"The `group_by_custom_details` property has been superseded by the `by_custom_details` property and will be removed in v4.0 of the AzureRM Provider")]
        public InputList<string> GroupByCustomDetails
        {
            get => _groupByCustomDetails ?? (_groupByCustomDetails = new InputList<string>());
            set => _groupByCustomDetails = value;
        }

        [Input("groupByEntities")]
        private InputList<string>? _groupByEntities;
        [Obsolete(@"The `group_by_entities` property has been superseded by the `by_entities` property and will be removed in v4.0 of the AzureRM Provider")]
        public InputList<string> GroupByEntities
        {
            get => _groupByEntities ?? (_groupByEntities = new InputList<string>());
            set => _groupByEntities = value;
        }

        /// <summary>
        /// Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
        /// </summary>
        [Input("lookbackDuration")]
        public Input<string>? LookbackDuration { get; set; }

        /// <summary>
        /// Whether to re-open closed matching incidents? Defaults to `false`.
        /// </summary>
        [Input("reopenClosedIncidents")]
        public Input<bool>? ReopenClosedIncidents { get; set; }

        public AlertRuleScheduledIncidentConfigurationGroupingGetArgs()
        {
        }
        public static new AlertRuleScheduledIncidentConfigurationGroupingGetArgs Empty => new AlertRuleScheduledIncidentConfigurationGroupingGetArgs();
    }
}
