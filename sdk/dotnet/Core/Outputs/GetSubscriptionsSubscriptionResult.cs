// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class GetSubscriptionsSubscriptionResult
    {
        /// <summary>
        /// The subscription display name.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The ID of this subscription.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The subscription location placement ID.
        /// </summary>
        public readonly string LocationPlacementId;
        /// <summary>
        /// The subscription quota ID.
        /// </summary>
        public readonly string QuotaId;
        /// <summary>
        /// The subscription spending limit.
        /// </summary>
        public readonly string SpendingLimit;
        /// <summary>
        /// The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The subscription GUID.
        /// </summary>
        public readonly string SubscriptionId;
        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The subscription tenant ID.
        /// </summary>
        public readonly string TenantId;

        [OutputConstructor]
        private GetSubscriptionsSubscriptionResult(
            string displayName,

            string id,

            string locationPlacementId,

            string quotaId,

            string spendingLimit,

            string state,

            string subscriptionId,

            ImmutableDictionary<string, string> tags,

            string tenantId)
        {
            DisplayName = displayName;
            Id = id;
            LocationPlacementId = locationPlacementId;
            QuotaId = quotaId;
            SpendingLimit = spendingLimit;
            State = state;
            SubscriptionId = subscriptionId;
            Tags = tags;
            TenantId = tenantId;
        }
    }
}
