// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class NetworkWatcherFlowLogTrafficAnalyticsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean flag to enable/disable traffic analytics.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// How frequently service should do flow analytics in minutes. Defaults to `60`.
        /// </summary>
        [Input("intervalInMinutes")]
        public Input<int>? IntervalInMinutes { get; set; }

        /// <summary>
        /// The resource GUID of the attached workspace.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        /// <summary>
        /// The location of the attached workspace.
        /// </summary>
        [Input("workspaceRegion", required: true)]
        public Input<string> WorkspaceRegion { get; set; } = null!;

        /// <summary>
        /// The resource ID of the attached workspace.
        /// </summary>
        [Input("workspaceResourceId", required: true)]
        public Input<string> WorkspaceResourceId { get; set; } = null!;

        public NetworkWatcherFlowLogTrafficAnalyticsArgs()
        {
        }
        public static new NetworkWatcherFlowLogTrafficAnalyticsArgs Empty => new NetworkWatcherFlowLogTrafficAnalyticsArgs();
    }
}
