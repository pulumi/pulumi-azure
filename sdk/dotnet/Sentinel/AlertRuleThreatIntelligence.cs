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
    /// Manages a Sentinel Threat Intelligence Alert Rule.
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "example-workspace",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "pergb2018",
    ///     });
    /// 
    ///     var exampleAnalyticsSolution = new Azure.OperationalInsights.AnalyticsSolution("example", new()
    ///     {
    ///         SolutionName = "SecurityInsights",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         WorkspaceResourceId = exampleAnalyticsWorkspace.Id,
    ///         WorkspaceName = exampleAnalyticsWorkspace.Name,
    ///         Plan = new Azure.OperationalInsights.Inputs.AnalyticsSolutionPlanArgs
    ///         {
    ///             Publisher = "Microsoft",
    ///             Product = "OMSGallery/SecurityInsights",
    ///         },
    ///     });
    /// 
    ///     var example = Azure.Sentinel.GetAlertRuleTemplate.Invoke(new()
    ///     {
    ///         DisplayName = "(Preview) Microsoft Defender Threat Intelligence Analytics",
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///     });
    /// 
    ///     var exampleAlertRuleThreatIntelligence = new Azure.Sentinel.AlertRuleThreatIntelligence("example", new()
    ///     {
    ///         Name = "example-rule",
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsSolution.WorkspaceResourceId,
    ///         AlertRuleTemplateGuid = example.Apply(getAlertRuleTemplateResult =&gt; getAlertRuleTemplateResult.Name),
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
    /// * `Microsoft.OperationalInsights`: 2023-12-01-preview
    /// 
    /// ## Import
    /// 
    /// Sentinel Threat Intelligence Alert Rules can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/alertRules/rule1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence")]
    public partial class AlertRuleThreatIntelligence : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Output("alertRuleTemplateGuid")]
        public Output<string> AlertRuleTemplateGuid { get; private set; } = null!;

        /// <summary>
        /// Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AlertRuleThreatIntelligence resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertRuleThreatIntelligence(string name, AlertRuleThreatIntelligenceArgs args, CustomResourceOptions? options = null)
            : base("azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence", name, args ?? new AlertRuleThreatIntelligenceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertRuleThreatIntelligence(string name, Input<string> id, AlertRuleThreatIntelligenceState? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/alertRuleThreatIntelligence:AlertRuleThreatIntelligence", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertRuleThreatIntelligence resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertRuleThreatIntelligence Get(string name, Input<string> id, AlertRuleThreatIntelligenceState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertRuleThreatIntelligence(name, id, state, options);
        }
    }

    public sealed class AlertRuleThreatIntelligenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("alertRuleTemplateGuid", required: true)]
        public Input<string> AlertRuleTemplateGuid { get; set; } = null!;

        /// <summary>
        /// Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AlertRuleThreatIntelligenceArgs()
        {
        }
        public static new AlertRuleThreatIntelligenceArgs Empty => new AlertRuleThreatIntelligenceArgs();
    }

    public sealed class AlertRuleThreatIntelligenceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GUID of the alert rule template which is used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("alertRuleTemplateGuid")]
        public Input<string>? AlertRuleTemplateGuid { get; set; }

        /// <summary>
        /// Whether the Threat Intelligence Alert rule enabled? Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The ID of the Log Analytics Workspace this Sentinel Threat Intelligence Alert Rule belongs to. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// The name which should be used for this Sentinel Threat Intelligence Alert Rule. Changing this forces a new Sentinel Threat Intelligence Alert Rule to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AlertRuleThreatIntelligenceState()
        {
        }
        public static new AlertRuleThreatIntelligenceState Empty => new AlertRuleThreatIntelligenceState();
    }
}
