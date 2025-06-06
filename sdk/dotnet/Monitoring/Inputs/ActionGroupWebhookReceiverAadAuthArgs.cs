// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ActionGroupWebhookReceiverAadAuthArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier URI for AAD auth.
        /// </summary>
        [Input("identifierUri")]
        public Input<string>? IdentifierUri { get; set; }

        /// <summary>
        /// The webhook application object Id for AAD auth.
        /// </summary>
        [Input("objectId", required: true)]
        public Input<string> ObjectId { get; set; } = null!;

        /// <summary>
        /// The tenant id for AAD auth.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public ActionGroupWebhookReceiverAadAuthArgs()
        {
        }
        public static new ActionGroupWebhookReceiverAadAuthArgs Empty => new ActionGroupWebhookReceiverAadAuthArgs();
    }
}
