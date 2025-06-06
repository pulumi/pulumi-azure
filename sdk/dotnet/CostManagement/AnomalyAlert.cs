// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CostManagement
{
    /// <summary>
    /// Manages a Cost Anomaly Alert.
    /// 
    /// &gt; **Note:** Anomaly alerts are sent based on the current access of the rule creator at the time that the email is sent. Learn more [here](https://learn.microsoft.com/en-us/azure/cost-management-billing/understand/analyze-unexpected-charges#create-an-anomaly-alert).
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
    ///     var example = new Azure.CostManagement.AnomalyAlert("example", new()
    ///     {
    ///         Name = "alertname",
    ///         DisplayName = "Alert DisplayName",
    ///         SubscriptionId = "/subscriptions/00000000-0000-0000-0000-000000000000",
    ///         EmailSubject = "My Test Anomaly Alert",
    ///         EmailAddresses = new[]
    ///         {
    ///             "example@test.net",
    ///         },
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
    /// * `Microsoft.CostManagement`: 2023-08-01
    /// 
    /// ## Import
    /// 
    /// Cost Anomaly Alerts can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:costmanagement/anomalyAlert:AnomalyAlert example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.CostManagement/scheduledActions/dailyanomalybyresourcegroup
    /// ```
    /// </summary>
    [AzureResourceType("azure:costmanagement/anomalyAlert:AnomalyAlert")]
    public partial class AnomalyAlert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The display name which should be used for this Cost Anomaly Alert.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Specifies a list of email addresses which the Anomaly Alerts are send to.
        /// </summary>
        [Output("emailAddresses")]
        public Output<ImmutableArray<string>> EmailAddresses { get; private set; } = null!;

        /// <summary>
        /// The email subject of the Cost Anomaly Alerts. Maximum length of the subject is 70.
        /// </summary>
        [Output("emailSubject")]
        public Output<string> EmailSubject { get; private set; } = null!;

        /// <summary>
        /// The message of the Cost Anomaly Alert. Maximum length of the message is 250.
        /// </summary>
        [Output("message")]
        public Output<string?> Message { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Cost Anomaly Alert. Changing this forces a new resource to be created. The name can contain only lowercase letters, numbers and hyphens.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The email address of the point of contact that should get the unsubscribe requests and notification emails.
        /// </summary>
        [Output("notificationEmail")]
        public Output<string> NotificationEmail { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subscription this Cost Anomaly Alert is scoped to. Changing this forces a new resource to be created. When not supplied this defaults to the subscription configured in the provider.
        /// </summary>
        [Output("subscriptionId")]
        public Output<string> SubscriptionId { get; private set; } = null!;


        /// <summary>
        /// Create a AnomalyAlert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AnomalyAlert(string name, AnomalyAlertArgs args, CustomResourceOptions? options = null)
            : base("azure:costmanagement/anomalyAlert:AnomalyAlert", name, args ?? new AnomalyAlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AnomalyAlert(string name, Input<string> id, AnomalyAlertState? state = null, CustomResourceOptions? options = null)
            : base("azure:costmanagement/anomalyAlert:AnomalyAlert", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AnomalyAlert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AnomalyAlert Get(string name, Input<string> id, AnomalyAlertState? state = null, CustomResourceOptions? options = null)
        {
            return new AnomalyAlert(name, id, state, options);
        }
    }

    public sealed class AnomalyAlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name which should be used for this Cost Anomaly Alert.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        [Input("emailAddresses", required: true)]
        private InputList<string>? _emailAddresses;

        /// <summary>
        /// Specifies a list of email addresses which the Anomaly Alerts are send to.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// The email subject of the Cost Anomaly Alerts. Maximum length of the subject is 70.
        /// </summary>
        [Input("emailSubject", required: true)]
        public Input<string> EmailSubject { get; set; } = null!;

        /// <summary>
        /// The message of the Cost Anomaly Alert. Maximum length of the message is 250.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The name which should be used for this Cost Anomaly Alert. Changing this forces a new resource to be created. The name can contain only lowercase letters, numbers and hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The email address of the point of contact that should get the unsubscribe requests and notification emails.
        /// </summary>
        [Input("notificationEmail")]
        public Input<string>? NotificationEmail { get; set; }

        /// <summary>
        /// The ID of the Subscription this Cost Anomaly Alert is scoped to. Changing this forces a new resource to be created. When not supplied this defaults to the subscription configured in the provider.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public AnomalyAlertArgs()
        {
        }
        public static new AnomalyAlertArgs Empty => new AnomalyAlertArgs();
    }

    public sealed class AnomalyAlertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The display name which should be used for this Cost Anomaly Alert.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("emailAddresses")]
        private InputList<string>? _emailAddresses;

        /// <summary>
        /// Specifies a list of email addresses which the Anomaly Alerts are send to.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// The email subject of the Cost Anomaly Alerts. Maximum length of the subject is 70.
        /// </summary>
        [Input("emailSubject")]
        public Input<string>? EmailSubject { get; set; }

        /// <summary>
        /// The message of the Cost Anomaly Alert. Maximum length of the message is 250.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The name which should be used for this Cost Anomaly Alert. Changing this forces a new resource to be created. The name can contain only lowercase letters, numbers and hyphens.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The email address of the point of contact that should get the unsubscribe requests and notification emails.
        /// </summary>
        [Input("notificationEmail")]
        public Input<string>? NotificationEmail { get; set; }

        /// <summary>
        /// The ID of the Subscription this Cost Anomaly Alert is scoped to. Changing this forces a new resource to be created. When not supplied this defaults to the subscription configured in the provider.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public AnomalyAlertState()
        {
        }
        public static new AnomalyAlertState Empty => new AnomalyAlertState();
    }
}
