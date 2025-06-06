// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Pim.Outputs
{

    [OutputType]
    public sealed class GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotificationResult
    {
        /// <summary>
        /// A list of additional email addresses that will receive these notifications.
        /// </summary>
        public readonly ImmutableArray<string> AdditionalRecipients;
        /// <summary>
        /// (Boolean) Should the default recipients receive these notifications.
        /// </summary>
        public readonly bool DefaultRecipients;
        /// <summary>
        /// (String) What level of notifications should be sent. Either `All` or `Critical`.
        /// </summary>
        public readonly string NotificationLevel;

        [OutputConstructor]
        private GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotificationResult(
            ImmutableArray<string> additionalRecipients,

            bool defaultRecipients,

            string notificationLevel)
        {
            AdditionalRecipients = additionalRecipients;
            DefaultRecipients = defaultRecipients;
            NotificationLevel = notificationLevel;
        }
    }
}
