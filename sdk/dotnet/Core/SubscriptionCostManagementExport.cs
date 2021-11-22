// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core
{
    /// <summary>
    /// Manages a Cost Management Export for a Subscription.
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
    ///         var exampleSubscription = Output.Create(Azure.Core.GetSubscription.InvokeAsync());
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///         });
    ///         var exampleContainer = new Azure.Storage.Container("exampleContainer", new Azure.Storage.ContainerArgs
    ///         {
    ///             StorageAccountName = azurerm_storage_account.Test.Name,
    ///         });
    ///         var exampleSubscriptionCostManagementExport = new Azure.Core.SubscriptionCostManagementExport("exampleSubscriptionCostManagementExport", new Azure.Core.SubscriptionCostManagementExportArgs
    ///         {
    ///             SubscriptionId = azurerm_subscription.Example.Id,
    ///             RecurrenceType = "Monthly",
    ///             RecurrencePeriodStartDate = "2020-08-18T00:00:00Z",
    ///             RecurrencePeriodEndDate = "2020-09-18T00:00:00Z",
    ///             ExportDataStorageLocation = new Azure.Core.Inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs
    ///             {
    ///                 ContainerId = exampleContainer.ResourceManagerId,
    ///                 RootFolderPath = "/root/updated",
    ///             },
    ///             ExportDataOptions = new Azure.Core.Inputs.SubscriptionCostManagementExportExportDataOptionsArgs
    ///             {
    ///                 Type = "Usage",
    ///                 TimeFrame = "WeekToDate",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Subscription Cost Management Exports can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport example /subscriptions/12345678-1234-9876-4563-123456789012/providers/Microsoft.CostManagement/exports/export1
    /// ```
    /// </summary>
    [AzureResourceType("azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport")]
    public partial class SubscriptionCostManagementExport : Pulumi.CustomResource
    {
        /// <summary>
        /// Is the cost management export active? Default is `true`.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// A `export_data_options` block as defined below.
        /// </summary>
        [Output("exportDataOptions")]
        public Output<Outputs.SubscriptionCostManagementExportExportDataOptions> ExportDataOptions { get; private set; } = null!;

        /// <summary>
        /// A `export_data_storage_location` block as defined below.
        /// </summary>
        [Output("exportDataStorageLocation")]
        public Output<Outputs.SubscriptionCostManagementExportExportDataStorageLocation> ExportDataStorageLocation { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("recurrencePeriodEndDate")]
        public Output<string> RecurrencePeriodEndDate { get; private set; } = null!;

        /// <summary>
        /// The date the export will start capturing information.
        /// </summary>
        [Output("recurrencePeriodStartDate")]
        public Output<string> RecurrencePeriodStartDate { get; private set; } = null!;

        /// <summary>
        /// How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        /// </summary>
        [Output("recurrenceType")]
        public Output<string> RecurrenceType { get; private set; } = null!;

        /// <summary>
        /// The id of the subscription on which to create an export.
        /// </summary>
        [Output("subscriptionId")]
        public Output<string> SubscriptionId { get; private set; } = null!;


        /// <summary>
        /// Create a SubscriptionCostManagementExport resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SubscriptionCostManagementExport(string name, SubscriptionCostManagementExportArgs args, CustomResourceOptions? options = null)
            : base("azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport", name, args ?? new SubscriptionCostManagementExportArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SubscriptionCostManagementExport(string name, Input<string> id, SubscriptionCostManagementExportState? state = null, CustomResourceOptions? options = null)
            : base("azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SubscriptionCostManagementExport resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SubscriptionCostManagementExport Get(string name, Input<string> id, SubscriptionCostManagementExportState? state = null, CustomResourceOptions? options = null)
        {
            return new SubscriptionCostManagementExport(name, id, state, options);
        }
    }

    public sealed class SubscriptionCostManagementExportArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is the cost management export active? Default is `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// A `export_data_options` block as defined below.
        /// </summary>
        [Input("exportDataOptions", required: true)]
        public Input<Inputs.SubscriptionCostManagementExportExportDataOptionsArgs> ExportDataOptions { get; set; } = null!;

        /// <summary>
        /// A `export_data_storage_location` block as defined below.
        /// </summary>
        [Input("exportDataStorageLocation", required: true)]
        public Input<Inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs> ExportDataStorageLocation { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("recurrencePeriodEndDate", required: true)]
        public Input<string> RecurrencePeriodEndDate { get; set; } = null!;

        /// <summary>
        /// The date the export will start capturing information.
        /// </summary>
        [Input("recurrencePeriodStartDate", required: true)]
        public Input<string> RecurrencePeriodStartDate { get; set; } = null!;

        /// <summary>
        /// How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        /// </summary>
        [Input("recurrenceType", required: true)]
        public Input<string> RecurrenceType { get; set; } = null!;

        /// <summary>
        /// The id of the subscription on which to create an export.
        /// </summary>
        [Input("subscriptionId", required: true)]
        public Input<string> SubscriptionId { get; set; } = null!;

        public SubscriptionCostManagementExportArgs()
        {
        }
    }

    public sealed class SubscriptionCostManagementExportState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is the cost management export active? Default is `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// A `export_data_options` block as defined below.
        /// </summary>
        [Input("exportDataOptions")]
        public Input<Inputs.SubscriptionCostManagementExportExportDataOptionsGetArgs>? ExportDataOptions { get; set; }

        /// <summary>
        /// A `export_data_storage_location` block as defined below.
        /// </summary>
        [Input("exportDataStorageLocation")]
        public Input<Inputs.SubscriptionCostManagementExportExportDataStorageLocationGetArgs>? ExportDataStorageLocation { get; set; }

        /// <summary>
        /// Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("recurrencePeriodEndDate")]
        public Input<string>? RecurrencePeriodEndDate { get; set; }

        /// <summary>
        /// The date the export will start capturing information.
        /// </summary>
        [Input("recurrencePeriodStartDate")]
        public Input<string>? RecurrencePeriodStartDate { get; set; }

        /// <summary>
        /// How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
        /// </summary>
        [Input("recurrenceType")]
        public Input<string>? RecurrenceType { get; set; }

        /// <summary>
        /// The id of the subscription on which to create an export.
        /// </summary>
        [Input("subscriptionId")]
        public Input<string>? SubscriptionId { get; set; }

        public SubscriptionCostManagementExportState()
        {
        }
    }
}