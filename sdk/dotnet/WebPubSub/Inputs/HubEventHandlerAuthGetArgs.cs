// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub.Inputs
{

    public sealed class HubEventHandlerAuthGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify the identity ID of the target resource.
        /// 
        /// &gt; **Note:** `managed_identity_id` is required if the auth block is defined
        /// </summary>
        [Input("managedIdentityId", required: true)]
        public Input<string> ManagedIdentityId { get; set; } = null!;

        public HubEventHandlerAuthGetArgs()
        {
        }
        public static new HubEventHandlerAuthGetArgs Empty => new HubEventHandlerAuthGetArgs();
    }
}
