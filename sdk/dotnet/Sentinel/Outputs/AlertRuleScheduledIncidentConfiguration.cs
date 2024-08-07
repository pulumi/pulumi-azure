// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel.Outputs
{

    [OutputType]
    public sealed class AlertRuleScheduledIncidentConfiguration
    {
        public readonly bool CreateIncident;
        /// <summary>
        /// A `grouping` block as defined below.
        /// </summary>
        public readonly Outputs.AlertRuleScheduledIncidentConfigurationGrouping Grouping;

        [OutputConstructor]
        private AlertRuleScheduledIncidentConfiguration(
            bool createIncident,

            Outputs.AlertRuleScheduledIncidentConfigurationGrouping grouping)
        {
            CreateIncident = createIncident;
            Grouping = grouping;
        }
    }
}
