// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.NewRelic
{
    /// <summary>
    /// Manages an Azure Native New Relic Tag Rule.
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
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleMonitor = new Azure.NewRelic.Monitor("example", new()
    ///     {
    ///         Name = "example-nrm",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Plan = new Azure.NewRelic.Inputs.MonitorPlanArgs
    ///         {
    ///             EffectiveDate = "2023-06-06T00:00:00Z",
    ///         },
    ///         User = new Azure.NewRelic.Inputs.MonitorUserArgs
    ///         {
    ///             Email = "user@example.com",
    ///             FirstName = "Example",
    ///             LastName = "User",
    ///             PhoneNumber = "+12313803556",
    ///         },
    ///     });
    /// 
    ///     var exampleTagRule = new Azure.NewRelic.TagRule("example", new()
    ///     {
    ///         MonitorId = exampleMonitor.Id,
    ///         AzureActiveDirectoryLogEnabled = true,
    ///         ActivityLogEnabled = true,
    ///         MetricEnabled = true,
    ///         SubscriptionLogEnabled = true,
    ///         LogTagFilters = new[]
    ///         {
    ///             new Azure.NewRelic.Inputs.TagRuleLogTagFilterArgs
    ///             {
    ///                 Name = "key",
    ///                 Action = "Include",
    ///                 Value = "value",
    ///             },
    ///         },
    ///         MetricTagFilters = new[]
    ///         {
    ///             new Azure.NewRelic.Inputs.TagRuleMetricTagFilterArgs
    ///             {
    ///                 Name = "key",
    ///                 Action = "Exclude",
    ///                 Value = "value",
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
    /// * `NewRelic.Observability`: 2024-03-01
    /// 
    /// ## Import
    /// 
    /// Azure Native New Relic Tag Rule can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:newrelic/tagRule:TagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/NewRelic.Observability/monitors/monitor1/tagRules/ruleSet1
    /// ```
    /// </summary>
    [AzureResourceType("azure:newrelic/tagRule:TagRule")]
    public partial class TagRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether activity logs from Azure resources should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Output("activityLogEnabled")]
        public Output<bool?> ActivityLogEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether Azure Active Directory logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Output("azureActiveDirectoryLogEnabled")]
        public Output<bool?> AzureActiveDirectoryLogEnabled { get; private set; } = null!;

        /// <summary>
        /// A `log_tag_filter` block as defined below.
        /// </summary>
        [Output("logTagFilters")]
        public Output<ImmutableArray<Outputs.TagRuleLogTagFilter>> LogTagFilters { get; private set; } = null!;

        /// <summary>
        /// Whether metrics should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Output("metricEnabled")]
        public Output<bool?> MetricEnabled { get; private set; } = null!;

        /// <summary>
        /// A `metric_tag_filter` block as defined below.
        /// </summary>
        [Output("metricTagFilters")]
        public Output<ImmutableArray<Outputs.TagRuleMetricTagFilter>> MetricTagFilters { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the New Relic Monitor this Tag Rule should be created within. Changing this forces a new Azure Native New Relic Tag Rule to be created.
        /// </summary>
        [Output("monitorId")]
        public Output<string> MonitorId { get; private set; } = null!;

        /// <summary>
        /// Whether subscription logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Output("subscriptionLogEnabled")]
        public Output<bool?> SubscriptionLogEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a TagRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagRule(string name, TagRuleArgs args, CustomResourceOptions? options = null)
            : base("azure:newrelic/tagRule:TagRule", name, args ?? new TagRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagRule(string name, Input<string> id, TagRuleState? state = null, CustomResourceOptions? options = null)
            : base("azure:newrelic/tagRule:TagRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagRule Get(string name, Input<string> id, TagRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new TagRule(name, id, state, options);
        }
    }

    public sealed class TagRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether activity logs from Azure resources should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("activityLogEnabled")]
        public Input<bool>? ActivityLogEnabled { get; set; }

        /// <summary>
        /// Whether Azure Active Directory logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("azureActiveDirectoryLogEnabled")]
        public Input<bool>? AzureActiveDirectoryLogEnabled { get; set; }

        [Input("logTagFilters")]
        private InputList<Inputs.TagRuleLogTagFilterArgs>? _logTagFilters;

        /// <summary>
        /// A `log_tag_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.TagRuleLogTagFilterArgs> LogTagFilters
        {
            get => _logTagFilters ?? (_logTagFilters = new InputList<Inputs.TagRuleLogTagFilterArgs>());
            set => _logTagFilters = value;
        }

        /// <summary>
        /// Whether metrics should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("metricEnabled")]
        public Input<bool>? MetricEnabled { get; set; }

        [Input("metricTagFilters")]
        private InputList<Inputs.TagRuleMetricTagFilterArgs>? _metricTagFilters;

        /// <summary>
        /// A `metric_tag_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.TagRuleMetricTagFilterArgs> MetricTagFilters
        {
            get => _metricTagFilters ?? (_metricTagFilters = new InputList<Inputs.TagRuleMetricTagFilterArgs>());
            set => _metricTagFilters = value;
        }

        /// <summary>
        /// Specifies the ID of the New Relic Monitor this Tag Rule should be created within. Changing this forces a new Azure Native New Relic Tag Rule to be created.
        /// </summary>
        [Input("monitorId", required: true)]
        public Input<string> MonitorId { get; set; } = null!;

        /// <summary>
        /// Whether subscription logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("subscriptionLogEnabled")]
        public Input<bool>? SubscriptionLogEnabled { get; set; }

        public TagRuleArgs()
        {
        }
        public static new TagRuleArgs Empty => new TagRuleArgs();
    }

    public sealed class TagRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether activity logs from Azure resources should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("activityLogEnabled")]
        public Input<bool>? ActivityLogEnabled { get; set; }

        /// <summary>
        /// Whether Azure Active Directory logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("azureActiveDirectoryLogEnabled")]
        public Input<bool>? AzureActiveDirectoryLogEnabled { get; set; }

        [Input("logTagFilters")]
        private InputList<Inputs.TagRuleLogTagFilterGetArgs>? _logTagFilters;

        /// <summary>
        /// A `log_tag_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.TagRuleLogTagFilterGetArgs> LogTagFilters
        {
            get => _logTagFilters ?? (_logTagFilters = new InputList<Inputs.TagRuleLogTagFilterGetArgs>());
            set => _logTagFilters = value;
        }

        /// <summary>
        /// Whether metrics should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("metricEnabled")]
        public Input<bool>? MetricEnabled { get; set; }

        [Input("metricTagFilters")]
        private InputList<Inputs.TagRuleMetricTagFilterGetArgs>? _metricTagFilters;

        /// <summary>
        /// A `metric_tag_filter` block as defined below.
        /// </summary>
        public InputList<Inputs.TagRuleMetricTagFilterGetArgs> MetricTagFilters
        {
            get => _metricTagFilters ?? (_metricTagFilters = new InputList<Inputs.TagRuleMetricTagFilterGetArgs>());
            set => _metricTagFilters = value;
        }

        /// <summary>
        /// Specifies the ID of the New Relic Monitor this Tag Rule should be created within. Changing this forces a new Azure Native New Relic Tag Rule to be created.
        /// </summary>
        [Input("monitorId")]
        public Input<string>? MonitorId { get; set; }

        /// <summary>
        /// Whether subscription logs should be sent for the Monitor resource. Defaults to `false`.
        /// </summary>
        [Input("subscriptionLogEnabled")]
        public Input<bool>? SubscriptionLogEnabled { get; set; }

        public TagRuleState()
        {
        }
        public static new TagRuleState Empty => new TagRuleState();
    }
}
