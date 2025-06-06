// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class MetricAlertActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Action Group can be sourced from the `azure.monitoring.ActionGroup` resource
        /// </summary>
        [Input("actionGroupId", required: true)]
        public Input<string> ActionGroupId { get; set; } = null!;

        [Input("webhookProperties")]
        private InputMap<string>? _webhookProperties;

        /// <summary>
        /// The map of custom string properties to include with the post operation. These data are appended to the webhook payload.
        /// </summary>
        public InputMap<string> WebhookProperties
        {
            get => _webhookProperties ?? (_webhookProperties = new InputMap<string>());
            set => _webhookProperties = value;
        }

        public MetricAlertActionArgs()
        {
        }
        public static new MetricAlertActionArgs Empty => new MetricAlertActionArgs();
    }
}
