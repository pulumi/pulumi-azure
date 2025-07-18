// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute
{
    /// <summary>
    /// Configures Network Packet Capturing against a Virtual Machine using a Network Watcher.
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
    ///     var exampleNetworkWatcher = new Azure.Network.NetworkWatcher("example", new()
    ///     {
    ///         Name = "example-nw",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-network",
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "internal",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkInterface = new Azure.Network.NetworkInterface("example", new()
    ///     {
    ///         Name = "example-nic",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         IpConfigurations = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkInterfaceIpConfigurationArgs
    ///             {
    ///                 Name = "testconfiguration1",
    ///                 SubnetId = exampleSubnet.Id,
    ///                 PrivateIpAddressAllocation = "Dynamic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleVirtualMachine = new Azure.Compute.VirtualMachine("example", new()
    ///     {
    ///         Name = "example-vm",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         NetworkInterfaceIds = new[]
    ///         {
    ///             exampleNetworkInterface.Id,
    ///         },
    ///         VmSize = "Standard_F2",
    ///         StorageImageReference = new Azure.Compute.Inputs.VirtualMachineStorageImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///         StorageOsDisk = new Azure.Compute.Inputs.VirtualMachineStorageOsDiskArgs
    ///         {
    ///             Name = "osdisk",
    ///             Caching = "ReadWrite",
    ///             CreateOption = "FromImage",
    ///             ManagedDiskType = "Standard_LRS",
    ///         },
    ///         OsProfile = new Azure.Compute.Inputs.VirtualMachineOsProfileArgs
    ///         {
    ///             ComputerName = "pctest-vm",
    ///             AdminUsername = "testadmin",
    ///             AdminPassword = "Password1234!",
    ///         },
    ///         OsProfileLinuxConfig = new Azure.Compute.Inputs.VirtualMachineOsProfileLinuxConfigArgs
    ///         {
    ///             DisablePasswordAuthentication = false,
    ///         },
    ///     });
    /// 
    ///     var exampleExtension = new Azure.Compute.Extension("example", new()
    ///     {
    ///         Name = "network-watcher",
    ///         VirtualMachineId = exampleVirtualMachine.Id,
    ///         Publisher = "Microsoft.Azure.NetworkWatcher",
    ///         Type = "NetworkWatcherAgentLinux",
    ///         TypeHandlerVersion = "1.4",
    ///         AutoUpgradeMinorVersion = true,
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplesa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var examplePacketCapture = new Azure.Compute.PacketCapture("example", new()
    ///     {
    ///         Name = "example-pc",
    ///         NetworkWatcherId = exampleNetworkWatcher.Id,
    ///         VirtualMachineId = exampleVirtualMachine.Id,
    ///         StorageLocation = new Azure.Compute.Inputs.PacketCaptureStorageLocationArgs
    ///         {
    ///             StorageAccountId = exampleAccount.Id,
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleExtension,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **Note:** This Resource requires that [the Network Watcher Virtual Machine Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine before capturing can be enabled which can be installed via the `azure.compute.Extension` resource.
    /// 
    /// ## API Providers
    /// 
    /// &lt;!-- This section is generated, changes will be overwritten --&gt;
    /// This resource uses the following Azure API Providers:
    /// 
    /// * `Microsoft.Network`: 2024-05-01
    /// 
    /// ## Import
    /// 
    /// Virtual Machine Packet Captures can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:compute/packetCapture:PacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
    /// ```
    /// </summary>
    [AzureResourceType("azure:compute/packetCapture:PacketCapture")]
    public partial class PacketCapture : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<Outputs.PacketCaptureFilter>> Filters { get; private set; } = null!;

        /// <summary>
        /// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
        /// </summary>
        [Output("maximumBytesPerPacket")]
        public Output<int?> MaximumBytesPerPacket { get; private set; } = null!;

        /// <summary>
        /// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
        /// </summary>
        [Output("maximumBytesPerSession")]
        public Output<int?> MaximumBytesPerSession { get; private set; } = null!;

        /// <summary>
        /// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
        /// </summary>
        [Output("maximumCaptureDurationInSeconds")]
        public Output<int?> MaximumCaptureDurationInSeconds { get; private set; } = null!;

        /// <summary>
        /// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
        /// </summary>
        [Output("networkWatcherId")]
        public Output<string> NetworkWatcherId { get; private set; } = null!;

        /// <summary>
        /// A `storage_location` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("storageLocation")]
        public Output<Outputs.PacketCaptureStorageLocation> StorageLocation { get; private set; } = null!;

        /// <summary>
        /// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
        /// </summary>
        [Output("virtualMachineId")]
        public Output<string> VirtualMachineId { get; private set; } = null!;


        /// <summary>
        /// Create a PacketCapture resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PacketCapture(string name, PacketCaptureArgs args, CustomResourceOptions? options = null)
            : base("azure:compute/packetCapture:PacketCapture", name, args ?? new PacketCaptureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PacketCapture(string name, Input<string> id, PacketCaptureState? state = null, CustomResourceOptions? options = null)
            : base("azure:compute/packetCapture:PacketCapture", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PacketCapture resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PacketCapture Get(string name, Input<string> id, PacketCaptureState? state = null, CustomResourceOptions? options = null)
        {
            return new PacketCapture(name, id, state, options);
        }
    }

    public sealed class PacketCaptureArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<Inputs.PacketCaptureFilterArgs>? _filters;

        /// <summary>
        /// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.PacketCaptureFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.PacketCaptureFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumBytesPerPacket")]
        public Input<int>? MaximumBytesPerPacket { get; set; }

        /// <summary>
        /// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumBytesPerSession")]
        public Input<int>? MaximumBytesPerSession { get; set; }

        /// <summary>
        /// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumCaptureDurationInSeconds")]
        public Input<int>? MaximumCaptureDurationInSeconds { get; set; }

        /// <summary>
        /// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
        /// </summary>
        [Input("networkWatcherId", required: true)]
        public Input<string> NetworkWatcherId { get; set; } = null!;

        /// <summary>
        /// A `storage_location` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageLocation", required: true)]
        public Input<Inputs.PacketCaptureStorageLocationArgs> StorageLocation { get; set; } = null!;

        /// <summary>
        /// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
        /// </summary>
        [Input("virtualMachineId", required: true)]
        public Input<string> VirtualMachineId { get; set; } = null!;

        public PacketCaptureArgs()
        {
        }
        public static new PacketCaptureArgs Empty => new PacketCaptureArgs();
    }

    public sealed class PacketCaptureState : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<Inputs.PacketCaptureFilterGetArgs>? _filters;

        /// <summary>
        /// One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
        /// </summary>
        public InputList<Inputs.PacketCaptureFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.PacketCaptureFilterGetArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumBytesPerPacket")]
        public Input<int>? MaximumBytesPerPacket { get; set; }

        /// <summary>
        /// Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumBytesPerSession")]
        public Input<int>? MaximumBytesPerSession { get; set; }

        /// <summary>
        /// The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
        /// </summary>
        [Input("maximumCaptureDurationInSeconds")]
        public Input<int>? MaximumCaptureDurationInSeconds { get; set; }

        /// <summary>
        /// The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource ID of the Network Watcher. Changing this forces a new resource to be created.
        /// </summary>
        [Input("networkWatcherId")]
        public Input<string>? NetworkWatcherId { get; set; }

        /// <summary>
        /// A `storage_location` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageLocation")]
        public Input<Inputs.PacketCaptureStorageLocationGetArgs>? StorageLocation { get; set; }

        /// <summary>
        /// The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
        /// </summary>
        [Input("virtualMachineId")]
        public Input<string>? VirtualMachineId { get; set; }

        public PacketCaptureState()
        {
        }
        public static new PacketCaptureState Empty => new PacketCaptureState();
    }
}
