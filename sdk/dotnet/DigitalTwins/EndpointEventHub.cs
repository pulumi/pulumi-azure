// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DigitalTwins
{
    /// <summary>
    /// Manages a Digital Twins Event Hub Endpoint.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleInstance = new Azure.DigitalTwins.Instance("exampleInstance", new Azure.DigitalTwins.InstanceArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///         });
    ///         var exampleEventHubNamespace = new Azure.EventHub.EventHubNamespace("exampleEventHubNamespace", new Azure.EventHub.EventHubNamespaceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = "Standard",
    ///         });
    ///         var exampleEventHub = new Azure.EventHub.EventHub("exampleEventHub", new Azure.EventHub.EventHubArgs
    ///         {
    ///             NamespaceName = exampleEventHubNamespace.Name,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             PartitionCount = 2,
    ///             MessageRetention = 1,
    ///         });
    ///         var exampleAuthorizationRule = new Azure.EventHub.AuthorizationRule("exampleAuthorizationRule", new Azure.EventHub.AuthorizationRuleArgs
    ///         {
    ///             NamespaceName = exampleEventHubNamespace.Name,
    ///             EventhubName = exampleEventHub.Name,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Listen = false,
    ///             Send = true,
    ///             Manage = false,
    ///         });
    ///         var exampleEndpointEventHub = new Azure.DigitalTwins.EndpointEventHub("exampleEndpointEventHub", new Azure.DigitalTwins.EndpointEventHubArgs
    ///         {
    ///             DigitalTwinsId = exampleInstance.Id,
    ///             EventhubPrimaryConnectionString = exampleAuthorizationRule.PrimaryConnectionString,
    ///             EventhubSecondaryConnectionString = exampleAuthorizationRule.SecondaryConnectionString,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Digital Twins Eventhub Endpoints can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:digitaltwins/endpointEventHub:EndpointEventHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DigitalTwins/digitalTwinsInstances/dt1/endpoints/ep1
    /// ```
    /// </summary>
    [AzureResourceType("azure:digitaltwins/endpointEventHub:EndpointEventHub")]
    public partial class EndpointEventHub : Pulumi.CustomResource
    {
        /// <summary>
        /// The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        /// </summary>
        [Output("deadLetterStorageSecret")]
        public Output<string?> DeadLetterStorageSecret { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Output("digitalTwinsId")]
        public Output<string> DigitalTwinsId { get; private set; } = null!;

        /// <summary>
        /// The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Output("eventhubPrimaryConnectionString")]
        public Output<string> EventhubPrimaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Output("eventhubSecondaryConnectionString")]
        public Output<string> EventhubSecondaryConnectionString { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointEventHub resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointEventHub(string name, EndpointEventHubArgs args, CustomResourceOptions? options = null)
            : base("azure:digitaltwins/endpointEventHub:EndpointEventHub", name, args ?? new EndpointEventHubArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EndpointEventHub(string name, Input<string> id, EndpointEventHubState? state = null, CustomResourceOptions? options = null)
            : base("azure:digitaltwins/endpointEventHub:EndpointEventHub", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointEventHub resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointEventHub Get(string name, Input<string> id, EndpointEventHubState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointEventHub(name, id, state, options);
        }
    }

    public sealed class EndpointEventHubArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        /// </summary>
        [Input("deadLetterStorageSecret")]
        public Input<string>? DeadLetterStorageSecret { get; set; }

        /// <summary>
        /// The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Input("digitalTwinsId", required: true)]
        public Input<string> DigitalTwinsId { get; set; } = null!;

        /// <summary>
        /// The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Input("eventhubPrimaryConnectionString", required: true)]
        public Input<string> EventhubPrimaryConnectionString { get; set; } = null!;

        /// <summary>
        /// The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Input("eventhubSecondaryConnectionString", required: true)]
        public Input<string> EventhubSecondaryConnectionString { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EndpointEventHubArgs()
        {
        }
    }

    public sealed class EndpointEventHubState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can't deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
        /// </summary>
        [Input("deadLetterStorageSecret")]
        public Input<string>? DeadLetterStorageSecret { get; set; }

        /// <summary>
        /// The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Input("digitalTwinsId")]
        public Input<string>? DigitalTwinsId { get; set; }

        /// <summary>
        /// The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Input("eventhubPrimaryConnectionString")]
        public Input<string>? EventhubPrimaryConnectionString { get; set; }

        /// <summary>
        /// The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
        /// </summary>
        [Input("eventhubSecondaryConnectionString")]
        public Input<string>? EventhubSecondaryConnectionString { get; set; }

        /// <summary>
        /// The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EndpointEventHubState()
        {
        }
    }
}
