// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement
{
    /// <summary>
    /// Manages a API Management Notification Recipient Email.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleService = new Azure.ApiManagement.Service("example", new()
    ///     {
    ///         Name = "example-apim",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         PublisherName = "My Company",
    ///         PublisherEmail = "company@terraform.io",
    ///         SkuName = "Developer_1",
    ///     });
    /// 
    ///     var exampleNotificationRecipientEmail = new Azure.ApiManagement.NotificationRecipientEmail("example", new()
    ///     {
    ///         ApiManagementId = exampleService.Id,
    ///         NotificationType = "AccountClosedPublisher",
    ///         Email = "foo@bar.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.ApiManagement`: 2022-08-01
    /// 
    /// ## Import
    /// 
    /// API Management Notification Recipient Emails can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:apimanagement/notificationRecipientEmail:NotificationRecipientEmail example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/notifications/notificationName1/recipientEmails/email1
    /// ```
    /// </summary>
    [AzureResourceType("azure:apimanagement/notificationRecipientEmail:NotificationRecipientEmail")]
    public partial class NotificationRecipientEmail : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the API Management Service from which to create this Notification Recipient Email. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Output("apiManagementId")]
        public Output<string> ApiManagementId { get; private set; } = null!;

        /// <summary>
        /// The recipient email address. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The Notification Name to be received. Changing this forces a new API Management Notification Recipient Email to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        /// </summary>
        [Output("notificationType")]
        public Output<string> NotificationType { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationRecipientEmail resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationRecipientEmail(string name, NotificationRecipientEmailArgs args, CustomResourceOptions? options = null)
            : base("azure:apimanagement/notificationRecipientEmail:NotificationRecipientEmail", name, args ?? new NotificationRecipientEmailArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationRecipientEmail(string name, Input<string> id, NotificationRecipientEmailState? state = null, CustomResourceOptions? options = null)
            : base("azure:apimanagement/notificationRecipientEmail:NotificationRecipientEmail", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NotificationRecipientEmail resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationRecipientEmail Get(string name, Input<string> id, NotificationRecipientEmailState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationRecipientEmail(name, id, state, options);
        }
    }

    public sealed class NotificationRecipientEmailArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the API Management Service from which to create this Notification Recipient Email. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Input("apiManagementId", required: true)]
        public Input<string> ApiManagementId { get; set; } = null!;

        /// <summary>
        /// The recipient email address. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        /// <summary>
        /// The Notification Name to be received. Changing this forces a new API Management Notification Recipient Email to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        /// </summary>
        [Input("notificationType", required: true)]
        public Input<string> NotificationType { get; set; } = null!;

        public NotificationRecipientEmailArgs()
        {
        }
        public static new NotificationRecipientEmailArgs Empty => new NotificationRecipientEmailArgs();
    }

    public sealed class NotificationRecipientEmailState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the API Management Service from which to create this Notification Recipient Email. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Input("apiManagementId")]
        public Input<string>? ApiManagementId { get; set; }

        /// <summary>
        /// The recipient email address. Changing this forces a new API Management Notification Recipient Email to be created.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The Notification Name to be received. Changing this forces a new API Management Notification Recipient Email to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        /// </summary>
        [Input("notificationType")]
        public Input<string>? NotificationType { get; set; }

        public NotificationRecipientEmailState()
        {
        }
        public static new NotificationRecipientEmailState Empty => new NotificationRecipientEmailState();
    }
}
