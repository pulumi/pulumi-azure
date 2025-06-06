// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NotificationHub
{
    /// <summary>
    /// Manages a Notification Hub within a Notification Hub Namespace.
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
    ///         Name = "notificationhub-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleNamespace = new Azure.NotificationHub.Namespace("example", new()
    ///     {
    ///         Name = "myappnamespace",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         NamespaceType = "NotificationHub",
    ///         SkuName = "Free",
    ///     });
    /// 
    ///     var exampleHub = new Azure.NotificationHub.Hub("example", new()
    ///     {
    ///         Name = "mynotificationhub",
    ///         NamespaceName = exampleNamespace.Name,
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
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
    /// * `Microsoft.NotificationHubs`: 2023-09-01
    /// 
    /// ## Import
    /// 
    /// Notification Hubs can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:notificationhub/hub:Hub hub1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.NotificationHubs/namespaces/namespace1/notificationHubs/hub1
    /// ```
    /// </summary>
    [AzureResourceType("azure:notificationhub/hub:Hub")]
    public partial class Hub : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A `apns_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `apns_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Output("apnsCredential")]
        public Output<Outputs.HubApnsCredential?> ApnsCredential { get; private set; } = null!;

        /// <summary>
        /// A `browser_credential` block as defined below.
        /// </summary>
        [Output("browserCredential")]
        public Output<Outputs.HubBrowserCredential?> BrowserCredential { get; private set; } = null!;

        /// <summary>
        /// A `gcm_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `gcm_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Output("gcmCredential")]
        public Output<Outputs.HubGcmCredential?> GcmCredential { get; private set; } = null!;

        /// <summary>
        /// The Azure Region in which this Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name to use for this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Notification Hub Namespace in which to create this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Output("namespaceName")]
        public Output<string> NamespaceName { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Hub resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Hub(string name, HubArgs args, CustomResourceOptions? options = null)
            : base("azure:notificationhub/hub:Hub", name, args ?? new HubArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Hub(string name, Input<string> id, HubState? state = null, CustomResourceOptions? options = null)
            : base("azure:notificationhub/hub:Hub", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Hub resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Hub Get(string name, Input<string> id, HubState? state = null, CustomResourceOptions? options = null)
        {
            return new Hub(name, id, state, options);
        }
    }

    public sealed class HubArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `apns_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `apns_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Input("apnsCredential")]
        public Input<Inputs.HubApnsCredentialArgs>? ApnsCredential { get; set; }

        /// <summary>
        /// A `browser_credential` block as defined below.
        /// </summary>
        [Input("browserCredential")]
        public Input<Inputs.HubBrowserCredentialArgs>? BrowserCredential { get; set; }

        /// <summary>
        /// A `gcm_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `gcm_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Input("gcmCredential")]
        public Input<Inputs.HubGcmCredentialArgs>? GcmCredential { get; set; }

        /// <summary>
        /// The Azure Region in which this Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name to use for this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Notification Hub Namespace in which to create this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Input("namespaceName", required: true)]
        public Input<string> NamespaceName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public HubArgs()
        {
        }
        public static new HubArgs Empty => new HubArgs();
    }

    public sealed class HubState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `apns_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `apns_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Input("apnsCredential")]
        public Input<Inputs.HubApnsCredentialGetArgs>? ApnsCredential { get; set; }

        /// <summary>
        /// A `browser_credential` block as defined below.
        /// </summary>
        [Input("browserCredential")]
        public Input<Inputs.HubBrowserCredentialGetArgs>? BrowserCredential { get; set; }

        /// <summary>
        /// A `gcm_credential` block as defined below.
        /// 
        /// &gt; **Note:** Removing the `gcm_credential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we'll remove this limitation when the SDK bug is fixed.
        /// </summary>
        [Input("gcmCredential")]
        public Input<Inputs.HubGcmCredentialGetArgs>? GcmCredential { get; set; }

        /// <summary>
        /// The Azure Region in which this Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name to use for this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Notification Hub Namespace in which to create this Notification Hub. Changing this forces a new resource to be created.
        /// </summary>
        [Input("namespaceName")]
        public Input<string>? NamespaceName { get; set; }

        /// <summary>
        /// The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public HubState()
        {
        }
        public static new HubState Empty => new HubState();
    }
}
