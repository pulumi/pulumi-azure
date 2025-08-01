// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring
{
    /// <summary>
    /// Manages an Activity Log Alert within Azure Monitor.
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
    ///     var main = new Azure.Monitoring.ActionGroup("main", new()
    ///     {
    ///         Name = "example-actiongroup",
    ///         ResourceGroupName = example.Name,
    ///         ShortName = "p0action",
    ///         WebhookReceivers = new[]
    ///         {
    ///             new Azure.Monitoring.Inputs.ActionGroupWebhookReceiverArgs
    ///             {
    ///                 Name = "callmyapi",
    ///                 ServiceUri = "http://example.com/alert",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var toMonitor = new Azure.Storage.Account("to_monitor", new()
    ///     {
    ///         Name = "examplesa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///     });
    /// 
    ///     var mainActivityLogAlert = new Azure.Monitoring.ActivityLogAlert("main", new()
    ///     {
    ///         Name = "example-activitylogalert",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Scopes = new[]
    ///         {
    ///             example.Id,
    ///         },
    ///         Description = "This alert will monitor a specific storage account updates.",
    ///         Criteria = new Azure.Monitoring.Inputs.ActivityLogAlertCriteriaArgs
    ///         {
    ///             ResourceId = toMonitor.Id,
    ///             OperationName = "Microsoft.Storage/storageAccounts/write",
    ///             Category = "Recommendation",
    ///         },
    ///         Actions = new[]
    ///         {
    ///             new Azure.Monitoring.Inputs.ActivityLogAlertActionArgs
    ///             {
    ///                 ActionGroupId = main.Id,
    ///                 WebhookProperties = 
    ///                 {
    ///                     { "from", "source" },
    ///                 },
    ///             },
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
    /// * `Microsoft.Insights`: 2020-10-01
    /// 
    /// ## Import
    /// 
    /// Activity log alerts can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:monitoring/activityLogAlert:ActivityLogAlert example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Insights/activityLogAlerts/myalertname
    /// ```
    /// </summary>
    [AzureResourceType("azure:monitoring/activityLogAlert:ActivityLogAlert")]
    public partial class ActivityLogAlert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `action` blocks as defined below.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<Outputs.ActivityLogAlertAction>> Actions { get; private set; } = null!;

        /// <summary>
        /// A `criteria` block as defined below.
        /// </summary>
        [Output("criteria")]
        public Output<Outputs.ActivityLogAlertCriteria> Criteria { get; private set; } = null!;

        /// <summary>
        /// The description of this activity log alert.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Should this Activity Log Alert be enabled? Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the activity log alert rule should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the activity log alert. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the activity log alert instance. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The Scope at which the Activity Log should be applied. A list of strings which could be a resource group , or a subscription, or a resource ID (such as a Storage Account).
        /// </summary>
        [Output("scopes")]
        public Output<ImmutableArray<string>> Scopes { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ActivityLogAlert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ActivityLogAlert(string name, ActivityLogAlertArgs args, CustomResourceOptions? options = null)
            : base("azure:monitoring/activityLogAlert:ActivityLogAlert", name, args ?? new ActivityLogAlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ActivityLogAlert(string name, Input<string> id, ActivityLogAlertState? state = null, CustomResourceOptions? options = null)
            : base("azure:monitoring/activityLogAlert:ActivityLogAlert", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ActivityLogAlert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ActivityLogAlert Get(string name, Input<string> id, ActivityLogAlertState? state = null, CustomResourceOptions? options = null)
        {
            return new ActivityLogAlert(name, id, state, options);
        }
    }

    public sealed class ActivityLogAlertArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.ActivityLogAlertActionArgs>? _actions;

        /// <summary>
        /// One or more `action` blocks as defined below.
        /// </summary>
        public InputList<Inputs.ActivityLogAlertActionArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.ActivityLogAlertActionArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// A `criteria` block as defined below.
        /// </summary>
        [Input("criteria", required: true)]
        public Input<Inputs.ActivityLogAlertCriteriaArgs> Criteria { get; set; } = null!;

        /// <summary>
        /// The description of this activity log alert.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Should this Activity Log Alert be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The Azure Region where the activity log alert rule should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the activity log alert. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the activity log alert instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("scopes", required: true)]
        private InputList<string>? _scopes;

        /// <summary>
        /// The Scope at which the Activity Log should be applied. A list of strings which could be a resource group , or a subscription, or a resource ID (such as a Storage Account).
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

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

        public ActivityLogAlertArgs()
        {
        }
        public static new ActivityLogAlertArgs Empty => new ActivityLogAlertArgs();
    }

    public sealed class ActivityLogAlertState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.ActivityLogAlertActionGetArgs>? _actions;

        /// <summary>
        /// One or more `action` blocks as defined below.
        /// </summary>
        public InputList<Inputs.ActivityLogAlertActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.ActivityLogAlertActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// A `criteria` block as defined below.
        /// </summary>
        [Input("criteria")]
        public Input<Inputs.ActivityLogAlertCriteriaGetArgs>? Criteria { get; set; }

        /// <summary>
        /// The description of this activity log alert.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Should this Activity Log Alert be enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The Azure Region where the activity log alert rule should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the activity log alert. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the activity log alert instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// The Scope at which the Activity Log should be applied. A list of strings which could be a resource group , or a subscription, or a resource ID (such as a Storage Account).
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

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

        public ActivityLogAlertState()
        {
        }
        public static new ActivityLogAlertState Empty => new ActivityLogAlertState();
    }
}
