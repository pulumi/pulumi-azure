// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    /// <summary>
    /// Manages a Function App Active Slot.
    /// 
    /// ## Example Usage
    /// 
    /// ### Windows Function App
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
    ///         Name = "windowsfunctionappsa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleServicePlan = new Azure.AppService.ServicePlan("example", new()
    ///     {
    ///         Name = "example-app-service-plan",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         OsType = "Windows",
    ///         SkuName = "Y1",
    ///     });
    /// 
    ///     var exampleWindowsFunctionApp = new Azure.AppService.WindowsFunctionApp("example", new()
    ///     {
    ///         Name = "example-windows-function-app",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         StorageAccountName = exampleAccount.Name,
    ///         ServicePlanId = exampleServicePlan.Id,
    ///         SiteConfig = null,
    ///     });
    /// 
    ///     var exampleWindowsFunctionAppSlot = new Azure.AppService.WindowsFunctionAppSlot("example", new()
    ///     {
    ///         Name = "example-windows-function-app-slot",
    ///         FunctionAppId = exampleWindowsFunctionApp.Id,
    ///         StorageAccountName = exampleAccount.Name,
    ///         SiteConfig = null,
    ///     });
    /// 
    ///     var exampleFunctionAppActiveSlot = new Azure.AppService.FunctionAppActiveSlot("example", new()
    ///     {
    ///         SlotId = exampleWindowsFunctionAppSlot.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Linux Function App
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
    ///         Name = "linuxfunctionappsa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleServicePlan = new Azure.AppService.ServicePlan("example", new()
    ///     {
    ///         Name = "example-app-service-plan",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         OsType = "Linux",
    ///         SkuName = "Y1",
    ///     });
    /// 
    ///     var exampleLinuxFunctionApp = new Azure.AppService.LinuxFunctionApp("example", new()
    ///     {
    ///         Name = "example-linux-function-app",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         ServicePlanId = exampleServicePlan.Id,
    ///         StorageAccountName = exampleAccount.Name,
    ///         SiteConfig = null,
    ///     });
    /// 
    ///     var exampleLinuxFunctionAppSlot = new Azure.AppService.LinuxFunctionAppSlot("example", new()
    ///     {
    ///         Name = "example-linux-function-app-slot",
    ///         FunctionAppId = exampleLinuxFunctionApp.Name,
    ///         StorageAccountName = exampleAccount.Name,
    ///         SiteConfig = null,
    ///     });
    /// 
    ///     var exampleFunctionAppActiveSlot = new Azure.AppService.FunctionAppActiveSlot("example", new()
    ///     {
    ///         SlotId = exampleLinuxFunctionAppSlot.Id,
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
    /// * `Microsoft.Web`: 2023-12-01
    /// 
    /// ## Import
    /// 
    /// a Function App Active Slot can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot example "/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1"
    /// ```
    /// </summary>
    [AzureResourceType("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot")]
    public partial class FunctionAppActiveSlot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp of the last successful swap with `Production`
        /// </summary>
        [Output("lastSuccessfulSwap")]
        public Output<string> LastSuccessfulSwap { get; private set; } = null!;

        /// <summary>
        /// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("overwriteNetworkConfig")]
        public Output<bool?> OverwriteNetworkConfig { get; private set; } = null!;

        /// <summary>
        /// The ID of the Slot to swap with `Production`.
        /// </summary>
        [Output("slotId")]
        public Output<string> SlotId { get; private set; } = null!;


        /// <summary>
        /// Create a FunctionAppActiveSlot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionAppActiveSlot(string name, FunctionAppActiveSlotArgs args, CustomResourceOptions? options = null)
            : base("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, args ?? new FunctionAppActiveSlotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionAppActiveSlot(string name, Input<string> id, FunctionAppActiveSlotState? state = null, CustomResourceOptions? options = null)
            : base("azure:appservice/functionAppActiveSlot:FunctionAppActiveSlot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FunctionAppActiveSlot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionAppActiveSlot Get(string name, Input<string> id, FunctionAppActiveSlotState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionAppActiveSlot(name, id, state, options);
        }
    }

    public sealed class FunctionAppActiveSlotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("overwriteNetworkConfig")]
        public Input<bool>? OverwriteNetworkConfig { get; set; }

        /// <summary>
        /// The ID of the Slot to swap with `Production`.
        /// </summary>
        [Input("slotId", required: true)]
        public Input<string> SlotId { get; set; } = null!;

        public FunctionAppActiveSlotArgs()
        {
        }
        public static new FunctionAppActiveSlotArgs Empty => new FunctionAppActiveSlotArgs();
    }

    public sealed class FunctionAppActiveSlotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp of the last successful swap with `Production`
        /// </summary>
        [Input("lastSuccessfulSwap")]
        public Input<string>? LastSuccessfulSwap { get; set; }

        /// <summary>
        /// The swap action should overwrite the Production slot's network configuration with the configuration from this slot. Defaults to `true`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("overwriteNetworkConfig")]
        public Input<bool>? OverwriteNetworkConfig { get; set; }

        /// <summary>
        /// The ID of the Slot to swap with `Production`.
        /// </summary>
        [Input("slotId")]
        public Input<string>? SlotId { get; set; }

        public FunctionAppActiveSlotState()
        {
        }
        public static new FunctionAppActiveSlotState Empty => new FunctionAppActiveSlotState();
    }
}
