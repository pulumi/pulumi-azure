// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Iot
{
    /// <summary>
    /// Manages an IoT Hub Device Update Instance.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "East US",
    ///     });
    /// 
    ///     var exampleIotHubDeviceUpdateAccount = new Azure.Iot.IotHubDeviceUpdateAccount("exampleIotHubDeviceUpdateAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///     });
    /// 
    ///     var exampleIoTHub = new Azure.Iot.IoTHub("exampleIoTHub", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Sku = new Azure.Iot.Inputs.IoTHubSkuArgs
    ///         {
    ///             Name = "S1",
    ///             Capacity = 1,
    ///         },
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleIotHubDeviceUpdateInstance = new Azure.Iot.IotHubDeviceUpdateInstance("exampleIotHubDeviceUpdateInstance", new()
    ///     {
    ///         DeviceUpdateAccountId = exampleIotHubDeviceUpdateAccount.Id,
    ///         IothubId = exampleIoTHub.Id,
    ///         DiagnosticEnabled = true,
    ///         DiagnosticStorageAccount = new Azure.Iot.Inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs
    ///         {
    ///             ConnectionString = exampleAccount.PrimaryConnectionString,
    ///             Id = exampleAccount.Id,
    ///         },
    ///         Tags = 
    ///         {
    ///             { "key", "value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// IoT Hub Device Update Instance can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.DeviceUpdate/accounts/account1/instances/instance1
    /// ```
    /// </summary>
    [AzureResourceType("azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance")]
    public partial class IotHubDeviceUpdateInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("deviceUpdateAccountId")]
        public Output<string> DeviceUpdateAccountId { get; private set; } = null!;

        /// <summary>
        /// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
        /// </summary>
        [Output("diagnosticEnabled")]
        public Output<bool?> DiagnosticEnabled { get; private set; } = null!;

        /// <summary>
        /// A `diagnostic_storage_account` block as defined below.
        /// </summary>
        [Output("diagnosticStorageAccount")]
        public Output<Outputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccount?> DiagnosticStorageAccount { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Output("iothubId")]
        public Output<string> IothubId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a IotHubDeviceUpdateInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IotHubDeviceUpdateInstance(string name, IotHubDeviceUpdateInstanceArgs args, CustomResourceOptions? options = null)
            : base("azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance", name, args ?? new IotHubDeviceUpdateInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IotHubDeviceUpdateInstance(string name, Input<string> id, IotHubDeviceUpdateInstanceState? state = null, CustomResourceOptions? options = null)
            : base("azure:iot/iotHubDeviceUpdateInstance:IotHubDeviceUpdateInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IotHubDeviceUpdateInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IotHubDeviceUpdateInstance Get(string name, Input<string> id, IotHubDeviceUpdateInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new IotHubDeviceUpdateInstance(name, id, state, options);
        }
    }

    public sealed class IotHubDeviceUpdateInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("deviceUpdateAccountId", required: true)]
        public Input<string> DeviceUpdateAccountId { get; set; } = null!;

        /// <summary>
        /// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
        /// </summary>
        [Input("diagnosticEnabled")]
        public Input<bool>? DiagnosticEnabled { get; set; }

        /// <summary>
        /// A `diagnostic_storage_account` block as defined below.
        /// </summary>
        [Input("diagnosticStorageAccount")]
        public Input<Inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountArgs>? DiagnosticStorageAccount { get; set; }

        /// <summary>
        /// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("iothubId", required: true)]
        public Input<string> IothubId { get; set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public IotHubDeviceUpdateInstanceArgs()
        {
        }
        public static new IotHubDeviceUpdateInstanceArgs Empty => new IotHubDeviceUpdateInstanceArgs();
    }

    public sealed class IotHubDeviceUpdateInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the ID of the IoT Hub Device Update Account where the IoT Hub Device Update Instance exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("deviceUpdateAccountId")]
        public Input<string>? DeviceUpdateAccountId { get; set; }

        /// <summary>
        /// Whether the diagnostic log collection is enabled. Possible values are `true` and `false`. Defaults to `false`.
        /// </summary>
        [Input("diagnosticEnabled")]
        public Input<bool>? DiagnosticEnabled { get; set; }

        /// <summary>
        /// A `diagnostic_storage_account` block as defined below.
        /// </summary>
        [Input("diagnosticStorageAccount")]
        public Input<Inputs.IotHubDeviceUpdateInstanceDiagnosticStorageAccountGetArgs>? DiagnosticStorageAccount { get; set; }

        /// <summary>
        /// Specifies the ID of the IoT Hub associated with the IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("iothubId")]
        public Input<string>? IothubId { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this IoT Hub Device Update Instance. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the IoT Hub Device Update Instance.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public IotHubDeviceUpdateInstanceState()
        {
        }
        public static new IotHubDeviceUpdateInstanceState Empty => new IotHubDeviceUpdateInstanceState();
    }
}