// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class FirewallPolicyInsightsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the default Log Analytics Workspace that the Firewalls associated with this Firewall Policy will send their logs to, when there is no location matches in the `log_analytics_workspace`.
        /// </summary>
        [Input("defaultLogAnalyticsWorkspaceId", required: true)]
        public Input<string> DefaultLogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// Whether the insights functionality is enabled for this Firewall Policy.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("logAnalyticsWorkspaces")]
        private InputList<Inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs>? _logAnalyticsWorkspaces;

        /// <summary>
        /// A list of `log_analytics_workspace` block as defined below.
        /// </summary>
        public InputList<Inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs> LogAnalyticsWorkspaces
        {
            get => _logAnalyticsWorkspaces ?? (_logAnalyticsWorkspaces = new InputList<Inputs.FirewallPolicyInsightsLogAnalyticsWorkspaceArgs>());
            set => _logAnalyticsWorkspaces = value;
        }

        /// <summary>
        /// The log retention period in days.
        /// </summary>
        [Input("retentionInDays")]
        public Input<int>? RetentionInDays { get; set; }

        public FirewallPolicyInsightsArgs()
        {
        }
        public static new FirewallPolicyInsightsArgs Empty => new FirewallPolicyInsightsArgs();
    }
}
