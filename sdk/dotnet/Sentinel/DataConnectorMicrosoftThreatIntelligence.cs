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
    /// Manages a Microsoft Threat Intelligence Data Connector.
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
    ///         Name = "example-rg",
    ///         Location = "east us",
    ///     });
    /// 
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "example-workspace",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "PerGB2018",
    ///     });
    /// 
    ///     var exampleLogAnalyticsWorkspaceOnboarding = new Azure.Sentinel.LogAnalyticsWorkspaceOnboarding("example", new()
    ///     {
    ///         WorkspaceId = exampleAnalyticsWorkspace.Id,
    ///     });
    /// 
    ///     var exampleDataConnectorMicrosoftThreatIntelligence = new Azure.Sentinel.DataConnectorMicrosoftThreatIntelligence("example", new()
    ///     {
    ///         Name = "example-dc-msti",
    ///         LogAnalyticsWorkspaceId = exampleLogAnalyticsWorkspaceOnboarding.WorkspaceId,
    ///         MicrosoftEmergingThreatFeedLookbackDate = "1970-01-01T00:00:00Z",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// sentinels can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:sentinel/dataConnectorMicrosoftThreatIntelligence:DataConnectorMicrosoftThreatIntelligence example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
    /// ```
    /// </summary>
    [AzureResourceType("azure:sentinel/dataConnectorMicrosoftThreatIntelligence:DataConnectorMicrosoftThreatIntelligence")]
    public partial class DataConnectorMicrosoftThreatIntelligence : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Output("logAnalyticsWorkspaceId")]
        public Output<string> LogAnalyticsWorkspaceId { get; private set; } = null!;

        /// <summary>
        /// The lookback date for the Microsoft Emerging Threat Feed in RFC3339. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Output("microsoftEmergingThreatFeedLookbackDate")]
        public Output<string> MicrosoftEmergingThreatFeedLookbackDate { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Microsoft Threat Intelligence Data Connector. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the tenant that this Microsoft Threat Intelligence Data Connector connects to. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// 
        /// &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
        /// </summary>
        [Output("tenantId")]
        public Output<string> TenantId { get; private set; } = null!;


        /// <summary>
        /// Create a DataConnectorMicrosoftThreatIntelligence resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataConnectorMicrosoftThreatIntelligence(string name, DataConnectorMicrosoftThreatIntelligenceArgs args, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorMicrosoftThreatIntelligence:DataConnectorMicrosoftThreatIntelligence", name, args ?? new DataConnectorMicrosoftThreatIntelligenceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataConnectorMicrosoftThreatIntelligence(string name, Input<string> id, DataConnectorMicrosoftThreatIntelligenceState? state = null, CustomResourceOptions? options = null)
            : base("azure:sentinel/dataConnectorMicrosoftThreatIntelligence:DataConnectorMicrosoftThreatIntelligence", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataConnectorMicrosoftThreatIntelligence resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataConnectorMicrosoftThreatIntelligence Get(string name, Input<string> id, DataConnectorMicrosoftThreatIntelligenceState? state = null, CustomResourceOptions? options = null)
        {
            return new DataConnectorMicrosoftThreatIntelligence(name, id, state, options);
        }
    }

    public sealed class DataConnectorMicrosoftThreatIntelligenceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId", required: true)]
        public Input<string> LogAnalyticsWorkspaceId { get; set; } = null!;

        /// <summary>
        /// The lookback date for the Microsoft Emerging Threat Feed in RFC3339. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Input("microsoftEmergingThreatFeedLookbackDate", required: true)]
        public Input<string> MicrosoftEmergingThreatFeedLookbackDate { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Microsoft Threat Intelligence Data Connector. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the tenant that this Microsoft Threat Intelligence Data Connector connects to. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// 
        /// &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public DataConnectorMicrosoftThreatIntelligenceArgs()
        {
        }
        public static new DataConnectorMicrosoftThreatIntelligenceArgs Empty => new DataConnectorMicrosoftThreatIntelligenceArgs();
    }

    public sealed class DataConnectorMicrosoftThreatIntelligenceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Log Analytics Workspace. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Input("logAnalyticsWorkspaceId")]
        public Input<string>? LogAnalyticsWorkspaceId { get; set; }

        /// <summary>
        /// The lookback date for the Microsoft Emerging Threat Feed in RFC3339. Changing this forces a new Data Connector to be created.
        /// </summary>
        [Input("microsoftEmergingThreatFeedLookbackDate")]
        public Input<string>? MicrosoftEmergingThreatFeedLookbackDate { get; set; }

        /// <summary>
        /// The name which should be used for this Microsoft Threat Intelligence Data Connector. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the tenant that this Microsoft Threat Intelligence Data Connector connects to. Changing this forces a new Microsoft Threat Intelligence Data Connector to be created.
        /// 
        /// &gt; **Note:** Currently, only the same tenant as the running account is allowed. Cross-tenant scenario is not supported yet.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public DataConnectorMicrosoftThreatIntelligenceState()
        {
        }
        public static new DataConnectorMicrosoftThreatIntelligenceState Empty => new DataConnectorMicrosoftThreatIntelligenceState();
    }
}
