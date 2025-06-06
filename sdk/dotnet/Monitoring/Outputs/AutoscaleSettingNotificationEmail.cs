// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class AutoscaleSettingNotificationEmail
    {
        /// <summary>
        /// Specifies a list of custom email addresses to which the email notifications will be sent.
        /// </summary>
        public readonly ImmutableArray<string> CustomEmails;
        /// <summary>
        /// Should email notifications be sent to the subscription administrator? Defaults to `false`.
        /// </summary>
        public readonly bool? SendToSubscriptionAdministrator;
        /// <summary>
        /// Should email notifications be sent to the subscription co-administrator? Defaults to `false`.
        /// </summary>
        public readonly bool? SendToSubscriptionCoAdministrator;

        [OutputConstructor]
        private AutoscaleSettingNotificationEmail(
            ImmutableArray<string> customEmails,

            bool? sendToSubscriptionAdministrator,

            bool? sendToSubscriptionCoAdministrator)
        {
            CustomEmails = customEmails;
            SendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            SendToSubscriptionCoAdministrator = sendToSubscriptionCoAdministrator;
        }
    }
}
