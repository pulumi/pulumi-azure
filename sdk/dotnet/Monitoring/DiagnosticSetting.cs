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
    /// Manages a Diagnostic Setting for an existing Resource.
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
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "storageaccountname",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var exampleKeyVault = new Azure.KeyVault.KeyVault("example", new()
    ///     {
    ///         Name = "examplekeyvault",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         SoftDeleteRetentionDays = 7,
    ///         PurgeProtectionEnabled = false,
    ///         SkuName = "standard",
    ///     });
    /// 
    ///     var exampleDiagnosticSetting = new Azure.Monitoring.DiagnosticSetting("example", new()
    ///     {
    ///         Name = "example",
    ///         TargetResourceId = exampleKeyVault.Id,
    ///         StorageAccountId = exampleAccount.Id,
    ///         EnabledLogs = new[]
    ///         {
    ///             new Azure.Monitoring.Inputs.DiagnosticSettingEnabledLogArgs
    ///             {
    ///                 Category = "AuditEvent",
    ///             },
    ///         },
    ///         EnabledMetrics = new[]
    ///         {
    ///             new Azure.Monitoring.Inputs.DiagnosticSettingEnabledMetricArgs
    ///             {
    ///                 Category = "AllMetrics",
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
    /// * `Microsoft.Insights`: 2021-05-01-preview
    /// 
    /// ## Import
    /// 
    /// Diagnostic Settings can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:monitoring/diagnosticSetting:DiagnosticSetting example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.KeyVault/vaults/vault1|logMonitoring1"
    /// ```
    /// </summary>
    [AzureResourceType("azure:monitoring/diagnosticSetting:DiagnosticSetting")]
    public partial class DiagnosticSetting : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `enabled_log` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified. At least one type of Log or Metric must be enabled.
        /// </summary>
        [Output("enabledLogs")]
        public Output<ImmutableArray<Outputs.DiagnosticSettingEnabledLog>> EnabledLogs { get; private set; } = null!;

        /// <summary>
        /// One or more `enabled_metric` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified.
        /// </summary>
        [Output("enabledMetrics")]
        public Output<ImmutableArray<Outputs.DiagnosticSettingEnabledMetric>> EnabledMetrics { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. 
        /// 
        /// &gt; **NOTE:** This can be sourced from the `azure.eventhub.EventHubNamespaceAuthorizationRule` resource and is different from a `azure.eventhub.AuthorizationRule` resource.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Output("eventhubAuthorizationRuleId")]
        public Output<string?> EventhubAuthorizationRuleId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Event Hub where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** If this isn't specified then the default Event Hub will be used.
        /// </summary>
        [Output("eventhubName")]
        public Output<string?> EventhubName { get; private set; } = null!;

        /// <summary>
        /// Possible values are `AzureDiagnostics` and `Dedicated`. When set to `Dedicated`, logs sent to a Log Analytics workspace will go into resource specific tables, instead of the legacy `AzureDiagnostics` table.
        /// 
        /// &gt; **NOTE:** This setting will only have an effect if a `log_analytics_workspace_id` is provided. For some target resource type (e.g., Key Vault), this field is unconfigurable. Please see [resource types](https://learn.microsoft.com/en-us/azure/azure-monitor/reference/tables/azurediagnostics#resource-types) for services that use each method. Please [see the documentation](https://docs.microsoft.com/azure/azure-monitor/platform/diagnostic-logs-stream-log-store#azure-diagnostics-vs-resource-specific) for details on the differences between destination types.
        /// </summary>
        [Output("logAnalyticsDestinationType")]
        public Output<string> LogAnalyticsDestinationType { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string?> LogAnalyticsWorkspaceId { get; private set; } = null!;

        [Output("metrics")]
        public Output<ImmutableArray<Outputs.DiagnosticSettingMetric>> Metrics { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Diagnostic Setting. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** If the name is set to 'service' it will not be possible to fully delete the diagnostic setting. This is due to legacy API support.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the market partner solution where Diagnostics Data should be sent. For potential partner integrations, [click to learn more about partner integration](https://learn.microsoft.com/en-us/azure/partner-solutions/overview).
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Output("partnerSolutionId")]
        public Output<string?> PartnerSolutionId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Storage Account where logs should be sent. 
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Output("storageAccountId")]
        public Output<string?> StorageAccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of an existing Resource on which to configure Diagnostic Settings. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a DiagnosticSetting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DiagnosticSetting(string name, DiagnosticSettingArgs args, CustomResourceOptions? options = null)
            : base("azure:monitoring/diagnosticSetting:DiagnosticSetting", name, args ?? new DiagnosticSettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DiagnosticSetting(string name, Input<string> id, DiagnosticSettingState? state = null, CustomResourceOptions? options = null)
            : base("azure:monitoring/diagnosticSetting:DiagnosticSetting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DiagnosticSetting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DiagnosticSetting Get(string name, Input<string> id, DiagnosticSettingState? state = null, CustomResourceOptions? options = null)
        {
            return new DiagnosticSetting(name, id, state, options);
        }
    }

    public sealed class DiagnosticSettingArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabledLogs")]
        private InputList<Inputs.DiagnosticSettingEnabledLogArgs>? _enabledLogs;

        /// <summary>
        /// One or more `enabled_log` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified. At least one type of Log or Metric must be enabled.
        /// </summary>
        public InputList<Inputs.DiagnosticSettingEnabledLogArgs> EnabledLogs
        {
            get => _enabledLogs ?? (_enabledLogs = new InputList<Inputs.DiagnosticSettingEnabledLogArgs>());
            set => _enabledLogs = value;
        }

        [Input("enabledMetrics")]
        private InputList<Inputs.DiagnosticSettingEnabledMetricArgs>? _enabledMetrics;

        /// <summary>
        /// One or more `enabled_metric` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified.
        /// </summary>
        public InputList<Inputs.DiagnosticSettingEnabledMetricArgs> EnabledMetrics
        {
            get => _enabledMetrics ?? (_enabledMetrics = new InputList<Inputs.DiagnosticSettingEnabledMetricArgs>());
            set => _enabledMetrics = value;
        }

        /// <summary>
        /// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. 
        /// 
        /// &gt; **NOTE:** This can be sourced from the `azure.eventhub.EventHubNamespaceAuthorizationRule` resource and is different from a `azure.eventhub.AuthorizationRule` resource.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("eventhubAuthorizationRuleId")]
        public Input<string>? EventhubAuthorizationRuleId { get; set; }

        /// <summary>
        /// Specifies the name of the Event Hub where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** If this isn't specified then the default Event Hub will be used.
        /// </summary>
        [Input("eventhubName")]
        public Input<string>? EventhubName { get; set; }

        /// <summary>
        /// Possible values are `AzureDiagnostics` and `Dedicated`. When set to `Dedicated`, logs sent to a Log Analytics workspace will go into resource specific tables, instead of the legacy `AzureDiagnostics` table.
        /// 
        /// &gt; **NOTE:** This setting will only have an effect if a `log_analytics_workspace_id` is provided. For some target resource type (e.g., Key Vault), this field is unconfigurable. Please see [resource types](https://learn.microsoft.com/en-us/azure/azure-monitor/reference/tables/azurediagnostics#resource-types) for services that use each method. Please [see the documentation](https://docs.microsoft.com/azure/azure-monitor/platform/diagnostic-logs-stream-log-store#azure-diagnostics-vs-resource-specific) for details on the differences between destination types.
        /// </summary>
        [Input("logAnalyticsDestinationType")]
        public Input<string>? LogAnalyticsDestinationType { get; set; }

        /// <summary>
        /// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        [Input("metrics")]
        private InputList<Inputs.DiagnosticSettingMetricArgs>? _metrics;
        [Obsolete(@"`metric` has been deprecated in favor of the `enabled_metric` property and will be removed in v5.0 of the AzureRM provider")]
        public InputList<Inputs.DiagnosticSettingMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.DiagnosticSettingMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Specifies the name of the Diagnostic Setting. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** If the name is set to 'service' it will not be possible to fully delete the diagnostic setting. This is due to legacy API support.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the market partner solution where Diagnostics Data should be sent. For potential partner integrations, [click to learn more about partner integration](https://learn.microsoft.com/en-us/azure/partner-solutions/overview).
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("partnerSolutionId")]
        public Input<string>? PartnerSolutionId { get; set; }

        /// <summary>
        /// The ID of the Storage Account where logs should be sent. 
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("storageAccountId")]
        public Input<string>? StorageAccountId { get; set; }

        /// <summary>
        /// The ID of an existing Resource on which to configure Diagnostic Settings. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        public DiagnosticSettingArgs()
        {
        }
        public static new DiagnosticSettingArgs Empty => new DiagnosticSettingArgs();
    }

    public sealed class DiagnosticSettingState : global::Pulumi.ResourceArgs
    {
        [Input("enabledLogs")]
        private InputList<Inputs.DiagnosticSettingEnabledLogGetArgs>? _enabledLogs;

        /// <summary>
        /// One or more `enabled_log` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified. At least one type of Log or Metric must be enabled.
        /// </summary>
        public InputList<Inputs.DiagnosticSettingEnabledLogGetArgs> EnabledLogs
        {
            get => _enabledLogs ?? (_enabledLogs = new InputList<Inputs.DiagnosticSettingEnabledLogGetArgs>());
            set => _enabledLogs = value;
        }

        [Input("enabledMetrics")]
        private InputList<Inputs.DiagnosticSettingEnabledMetricGetArgs>? _enabledMetrics;

        /// <summary>
        /// One or more `enabled_metric` blocks as defined below.
        /// 
        /// &gt; **Note:** At least one `enabled_log` or `enabled_metric` block must be specified.
        /// </summary>
        public InputList<Inputs.DiagnosticSettingEnabledMetricGetArgs> EnabledMetrics
        {
            get => _enabledMetrics ?? (_enabledMetrics = new InputList<Inputs.DiagnosticSettingEnabledMetricGetArgs>());
            set => _enabledMetrics = value;
        }

        /// <summary>
        /// Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. 
        /// 
        /// &gt; **NOTE:** This can be sourced from the `azure.eventhub.EventHubNamespaceAuthorizationRule` resource and is different from a `azure.eventhub.AuthorizationRule` resource.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("eventhubAuthorizationRuleId")]
        public Input<string>? EventhubAuthorizationRuleId { get; set; }

        /// <summary>
        /// Specifies the name of the Event Hub where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** If this isn't specified then the default Event Hub will be used.
        /// </summary>
        [Input("eventhubName")]
        public Input<string>? EventhubName { get; set; }

        /// <summary>
        /// Possible values are `AzureDiagnostics` and `Dedicated`. When set to `Dedicated`, logs sent to a Log Analytics workspace will go into resource specific tables, instead of the legacy `AzureDiagnostics` table.
        /// 
        /// &gt; **NOTE:** This setting will only have an effect if a `log_analytics_workspace_id` is provided. For some target resource type (e.g., Key Vault), this field is unconfigurable. Please see [resource types](https://learn.microsoft.com/en-us/azure/azure-monitor/reference/tables/azurediagnostics#resource-types) for services that use each method. Please [see the documentation](https://docs.microsoft.com/azure/azure-monitor/platform/diagnostic-logs-stream-log-store#azure-diagnostics-vs-resource-specific) for details on the differences between destination types.
        /// </summary>
        [Input("logAnalyticsDestinationType")]
        public Input<string>? LogAnalyticsDestinationType { get; set; }

        /// <summary>
        /// Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        [Input("metrics")]
        private InputList<Inputs.DiagnosticSettingMetricGetArgs>? _metrics;
        [Obsolete(@"`metric` has been deprecated in favor of the `enabled_metric` property and will be removed in v5.0 of the AzureRM provider")]
        public InputList<Inputs.DiagnosticSettingMetricGetArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.DiagnosticSettingMetricGetArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Specifies the name of the Diagnostic Setting. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** If the name is set to 'service' it will not be possible to fully delete the diagnostic setting. This is due to legacy API support.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the market partner solution where Diagnostics Data should be sent. For potential partner integrations, [click to learn more about partner integration](https://learn.microsoft.com/en-us/azure/partner-solutions/overview).
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("partnerSolutionId")]
        public Input<string>? PartnerSolutionId { get; set; }

        /// <summary>
        /// The ID of the Storage Account where logs should be sent. 
        /// 
        /// &gt; **NOTE:** At least one of `eventhub_authorization_rule_id`, `log_analytics_workspace_id`, `partner_solution_id` and `storage_account_id` must be specified.
        /// </summary>
        [Input("storageAccountId")]
        public Input<string>? StorageAccountId { get; set; }

        /// <summary>
        /// The ID of an existing Resource on which to configure Diagnostic Settings. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        public DiagnosticSettingState()
        {
        }
        public static new DiagnosticSettingState Empty => new DiagnosticSettingState();
    }
}
