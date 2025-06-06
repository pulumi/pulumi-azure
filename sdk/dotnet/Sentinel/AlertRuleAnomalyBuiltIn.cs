// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sentinel
{
    /// <summary>
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "example-law",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "PerGB2018",
    ///     });
    /// 
    ///     var exampleLogAnalyticsWorkspaceOnboarding = new Azure.Sentinel.LogAnalyticsWorkspaceOnboarding("example", new()
    ///     {
    ///         WorkspaceId = exampleAnalyticsWorkspace.Id,
    ///         CustomerManagedKeyEnabled = false,
    ///     });
    /// 
    ///     var example = Azure.Sentinel.GetAlertRuleAnomaly.Invoke(new()
    ///     {
    ///         LogAnalyticsWorkspaceId = exampleLogAnalyticsWorkspaceOnboarding.WorkspaceId,
    ///         DisplayName = "Potential data staging",
    ///     });
    /// 
    ///     var exampleAlertRuleAnomalyBuiltIn = new Azure.Sentinel.AlertRuleAnomalyBuiltIn("example", new()
    ///     {
    ///         DisplayName = "Potential data staging",
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsWorkspace.Id,
    ///         Mode = "Production",
    ///         Enabled = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Built In Anomaly Alert Rules can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:sentinel/alertRuleAnomalyBuiltIn:AlertRuleAnomalyBuiltIn example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/securityMLAnalyticsSettings/setting1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/alertRuleAnomalyBuiltIn:AlertRuleAnomalyBuiltIn")]
    public partial class AlertRuleAnomalyBuiltIn : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The version of the Anomaly Security ML Analytics Settings.
        /// </summary>
        [Output("anomalySettingsVersion")]
        public Output<int> AnomalySettingsVersion { get; private set; } = null!;

        /// <summary>
        /// The anomaly version of the Anomaly Alert Rule.
        /// </summary>
        [Output("anomalyVersion")]
        public Output<string> AnomalyVersion { get; private set; } = null!;

        /// <summary>
        /// The description of the threshold observation.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The Display Name of the built-in Anomaly Alert Rule.
        /// 
        /// &gt; **Note:** One of `name` or `display_name` block must be specified.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Should the Built-in Anomaly Alert Rule be enabled?
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The frequency the Anomaly Alert Rule will be run.
        /// </summary>
        [Output("frequency")]
        public Output<string> Frequency { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// A list of `multi_select_observation` blocks as defined below.
        /// </summary>
        [Output("multiSelectObservations")]
        public Output<ImmutableArray<Outputs.AlertRuleAnomalyBuiltInMultiSelectObservation>> MultiSelectObservations { get; private set; } = null!;

        /// <summary>
        /// The Name of the built-in Anomaly Alert Rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of `prioritized_exclude_observation` blocks as defined below.
        /// </summary>
        [Output("prioritizedExcludeObservations")]
        public Output<ImmutableArray<Outputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservation>> PrioritizedExcludeObservations { get; private set; } = null!;

        /// <summary>
        /// A `required_data_connector` block as defined below.
        /// </summary>
        [Output("requiredDataConnectors")]
        public Output<ImmutableArray<Outputs.AlertRuleAnomalyBuiltInRequiredDataConnector>> RequiredDataConnectors { get; private set; } = null!;

        /// <summary>
        /// The ID of the anomaly settings definition Id.
        /// </summary>
        [Output("settingsDefinitionId")]
        public Output<string> SettingsDefinitionId { get; private set; } = null!;

        /// <summary>
        /// A list of `single_select_observation` blocks as defined below.
        /// </summary>
        [Output("singleSelectObservations")]
        public Output<ImmutableArray<Outputs.AlertRuleAnomalyBuiltInSingleSelectObservation>> SingleSelectObservations { get; private set; } = null!;

        /// <summary>
        /// A list of categories of attacks by which to classify the rule.
        /// </summary>
        [Output("tactics")]
        public Output<ImmutableArray<string>> Tactics { get; private set; } = null!;

        /// <summary>
        /// A list of techniques of attacks by which to classify the rule.
        /// </summary>
        [Output("techniques")]
        public Output<ImmutableArray<string>> Techniques { get; private set; } = null!;

        /// <summary>
        /// A list of `threshold_observation` blocks as defined below.
        /// </summary>
        [Output("thresholdObservations")]
        public Output<ImmutableArray<Outputs.AlertRuleAnomalyBuiltInThresholdObservation>> ThresholdObservations { get; private set; } = null!;


        /// <summary>
        /// Create a AlertRuleAnomalyBuiltIn resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertRuleAnomalyBuiltIn(string name, AlertRuleAnomalyBuiltInArgs args, CustomResourceOptions? options = null)
            : base("azure:sentinel/alertRuleAnomalyBuiltIn:AlertRuleAnomalyBuiltIn", name, args ?? new AlertRuleAnomalyBuiltInArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertRuleAnomalyBuiltIn(string name, Input<string> id, AlertRuleAnomalyBuiltInState? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/alertRuleAnomalyBuiltIn:AlertRuleAnomalyBuiltIn", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertRuleAnomalyBuiltIn resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertRuleAnomalyBuiltIn Get(string name, Input<string> id, AlertRuleAnomalyBuiltInState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertRuleAnomalyBuiltIn(name, id, state, options);
        }
    }

    public sealed class AlertRuleAnomalyBuiltInArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Display Name of the built-in Anomaly Alert Rule.
        /// 
        /// &gt; **Note:** One of `name` or `display_name` block must be specified.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Should the Built-in Anomaly Alert Rule be enabled?
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The Name of the built-in Anomaly Alert Rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AlertRuleAnomalyBuiltInArgs()
        {
        }
        public static new AlertRuleAnomalyBuiltInArgs Empty => new AlertRuleAnomalyBuiltInArgs();
    }

    public sealed class AlertRuleAnomalyBuiltInState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The version of the Anomaly Security ML Analytics Settings.
        /// </summary>
        [Input("anomalySettingsVersion")]
        public Input<int>? AnomalySettingsVersion { get; set; }

        /// <summary>
        /// The anomaly version of the Anomaly Alert Rule.
        /// </summary>
        [Input("anomalyVersion")]
        public Input<string>? AnomalyVersion { get; set; }

        /// <summary>
        /// The description of the threshold observation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Display Name of the built-in Anomaly Alert Rule.
        /// 
        /// &gt; **Note:** One of `name` or `display_name` block must be specified.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Should the Built-in Anomaly Alert Rule be enabled?
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The frequency the Anomaly Alert Rule will be run.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Built-in Anomaly Alert Rule to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// mode of the Built-in Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        [Input("multiSelectObservations")]
        private InputList<Inputs.AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs>? _multiSelectObservations;

        /// <summary>
        /// A list of `multi_select_observation` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs> MultiSelectObservations
        {
            get => _multiSelectObservations ?? (_multiSelectObservations = new InputList<Inputs.AlertRuleAnomalyBuiltInMultiSelectObservationGetArgs>());
            set => _multiSelectObservations = value;
        }

        /// <summary>
        /// The Name of the built-in Anomaly Alert Rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("prioritizedExcludeObservations")]
        private InputList<Inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationGetArgs>? _prioritizedExcludeObservations;

        /// <summary>
        /// A list of `prioritized_exclude_observation` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationGetArgs> PrioritizedExcludeObservations
        {
            get => _prioritizedExcludeObservations ?? (_prioritizedExcludeObservations = new InputList<Inputs.AlertRuleAnomalyBuiltInPrioritizedExcludeObservationGetArgs>());
            set => _prioritizedExcludeObservations = value;
        }

        [Input("requiredDataConnectors")]
        private InputList<Inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorGetArgs>? _requiredDataConnectors;

        /// <summary>
        /// A `required_data_connector` block as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorGetArgs> RequiredDataConnectors
        {
            get => _requiredDataConnectors ?? (_requiredDataConnectors = new InputList<Inputs.AlertRuleAnomalyBuiltInRequiredDataConnectorGetArgs>());
            set => _requiredDataConnectors = value;
        }

        /// <summary>
        /// The ID of the anomaly settings definition Id.
        /// </summary>
        [Input("settingsDefinitionId")]
        public Input<string>? SettingsDefinitionId { get; set; }

        [Input("singleSelectObservations")]
        private InputList<Inputs.AlertRuleAnomalyBuiltInSingleSelectObservationGetArgs>? _singleSelectObservations;

        /// <summary>
        /// A list of `single_select_observation` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleAnomalyBuiltInSingleSelectObservationGetArgs> SingleSelectObservations
        {
            get => _singleSelectObservations ?? (_singleSelectObservations = new InputList<Inputs.AlertRuleAnomalyBuiltInSingleSelectObservationGetArgs>());
            set => _singleSelectObservations = value;
        }

        [Input("tactics")]
        private InputList<string>? _tactics;

        /// <summary>
        /// A list of categories of attacks by which to classify the rule.
        /// </summary>
        public InputList<string> Tactics
        {
            get => _tactics ?? (_tactics = new InputList<string>());
            set => _tactics = value;
        }

        [Input("techniques")]
        private InputList<string>? _techniques;

        /// <summary>
        /// A list of techniques of attacks by which to classify the rule.
        /// </summary>
        public InputList<string> Techniques
        {
            get => _techniques ?? (_techniques = new InputList<string>());
            set => _techniques = value;
        }

        [Input("thresholdObservations")]
        private InputList<Inputs.AlertRuleAnomalyBuiltInThresholdObservationGetArgs>? _thresholdObservations;

        /// <summary>
        /// A list of `threshold_observation` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AlertRuleAnomalyBuiltInThresholdObservationGetArgs> ThresholdObservations
        {
            get => _thresholdObservations ?? (_thresholdObservations = new InputList<Inputs.AlertRuleAnomalyBuiltInThresholdObservationGetArgs>());
            set => _thresholdObservations = value;
        }

        public AlertRuleAnomalyBuiltInState()
        {
        }
        public static new AlertRuleAnomalyBuiltInState Empty => new AlertRuleAnomalyBuiltInState();
    }
}
