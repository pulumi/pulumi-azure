// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SecurityCenter.Inputs
{

    public sealed class AutomationActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("connectionString")]
        private Input<string>? _connectionString;

        /// <summary>
        /// (Optional, but required when `type` is `eventhub`) A connection string to send data to the target Event Hub namespace, this should include a key with send permissions.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The resource id of the target Logic App, Event Hub namespace or Log Analytics workspace.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        [Input("triggerUrl")]
        private Input<string>? _triggerUrl;

        /// <summary>
        /// (Optional, but required when `type` is `logicapp`) The callback URL to trigger the Logic App that will receive and process data sent by this automation. This can be found in the Azure Portal under "See trigger history"
        /// </summary>
        public Input<string>? TriggerUrl
        {
            get => _triggerUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _triggerUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Type of Azure resource to send data to. Must be set to one of: `logicapp`, `eventhub` or `loganalytics`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public AutomationActionGetArgs()
        {
        }
        public static new AutomationActionGetArgs Empty => new AutomationActionGetArgs();
    }
}
