// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.WebPubSub.Outputs
{

    [OutputType]
    public sealed class GetPrivateLinkResourceSharedPrivateLinkResourceTypeResult
    {
        /// <summary>
        /// The description of the resource type that has been onboarded to private link service.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The  name for the resource that has been onboarded to private link service.
        /// </summary>
        public readonly string SubresourceName;

        [OutputConstructor]
        private GetPrivateLinkResourceSharedPrivateLinkResourceTypeResult(
            string description,

            string subresourceName)
        {
            Description = description;
            SubresourceName = subresourceName;
        }
    }
}
