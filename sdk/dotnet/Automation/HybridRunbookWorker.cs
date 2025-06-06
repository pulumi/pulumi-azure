// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Automation
{
    /// <summary>
    /// Manages a Automation Hybrid Runbook Worker.
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
    ///     var exampleAccount = new Azure.Automation.Account("example", new()
    ///     {
    ///         Name = "example-account",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         SkuName = "Basic",
    ///     });
    /// 
    ///     var exampleHybridRunbookWorkerGroup = new Azure.Automation.HybridRunbookWorkerGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         AutomationAccountName = exampleAccount.Name,
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-vnet",
    ///         ResourceGroupName = example.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "192.168.1.0/24",
    ///         },
    ///         Location = example.Location,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "example-subnet",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "192.168.1.0/24",
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
    ///                 Name = "vm-example",
    ///                 SubnetId = exampleSubnet.Id,
    ///                 PrivateIpAddressAllocation = "Dynamic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleLinuxVirtualMachine = new Azure.Compute.LinuxVirtualMachine("example", new()
    ///     {
    ///         Name = "example-vm",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Size = "Standard_B1s",
    ///         AdminUsername = "testadmin",
    ///         AdminPassword = "Password1234!",
    ///         DisablePasswordAuthentication = false,
    ///         SourceImageReference = new Azure.Compute.Inputs.LinuxVirtualMachineSourceImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///         OsDisk = new Azure.Compute.Inputs.LinuxVirtualMachineOsDiskArgs
    ///         {
    ///             Caching = "ReadWrite",
    ///             StorageAccountType = "Standard_LRS",
    ///         },
    ///         NetworkInterfaceIds = new[]
    ///         {
    ///             exampleNetworkInterface.Id,
    ///         },
    ///     });
    /// 
    ///     var exampleHybridRunbookWorker = new Azure.Automation.HybridRunbookWorker("example", new()
    ///     {
    ///         ResourceGroupName = example.Name,
    ///         AutomationAccountName = exampleAccount.Name,
    ///         WorkerGroupName = exampleHybridRunbookWorkerGroup.Name,
    ///         VmResourceId = exampleLinuxVirtualMachine.Id,
    ///         WorkerId = "00000000-0000-0000-0000-000000000000",
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
    /// * `Microsoft.Automation`: 2023-11-01
    /// 
    /// ## Import
    /// 
    /// Automations can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:automation/hybridRunbookWorker:HybridRunbookWorker example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/hybridRunbookWorkerGroups/group1/hybridRunbookWorkers/00000000-0000-0000-0000-000000000000
    /// ```
    /// </summary>
    [AzureResourceType("azure:automation/hybridRunbookWorker:HybridRunbookWorker")]
    public partial class HybridRunbookWorker : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("automationAccountName")]
        public Output<string> AutomationAccountName { get; private set; } = null!;

        /// <summary>
        /// The IP address of assigned machine.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// Last Heartbeat from the Worker.
        /// </summary>
        [Output("lastSeenDateTime")]
        public Output<string> LastSeenDateTime { get; private set; } = null!;

        /// <summary>
        /// The registration time of the worker machine.
        /// </summary>
        [Output("registrationDateTime")]
        public Output<string> RegistrationDateTime { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("vmResourceId")]
        public Output<string> VmResourceId { get; private set; } = null!;

        /// <summary>
        /// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("workerGroupName")]
        public Output<string> WorkerGroupName { get; private set; } = null!;

        /// <summary>
        /// Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
        /// </summary>
        [Output("workerId")]
        public Output<string> WorkerId { get; private set; } = null!;

        /// <summary>
        /// The name of HybridWorker.
        /// </summary>
        [Output("workerName")]
        public Output<string> WorkerName { get; private set; } = null!;

        /// <summary>
        /// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
        /// </summary>
        [Output("workerType")]
        public Output<string> WorkerType { get; private set; } = null!;


        /// <summary>
        /// Create a HybridRunbookWorker resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HybridRunbookWorker(string name, HybridRunbookWorkerArgs args, CustomResourceOptions? options = null)
            : base("azure:automation/hybridRunbookWorker:HybridRunbookWorker", name, args ?? new HybridRunbookWorkerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HybridRunbookWorker(string name, Input<string> id, HybridRunbookWorkerState? state = null, CustomResourceOptions? options = null)
            : base("azure:automation/hybridRunbookWorker:HybridRunbookWorker", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HybridRunbookWorker resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HybridRunbookWorker Get(string name, Input<string> id, HybridRunbookWorkerState? state = null, CustomResourceOptions? options = null)
        {
            return new HybridRunbookWorker(name, id, state, options);
        }
    }

    public sealed class HybridRunbookWorkerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("automationAccountName", required: true)]
        public Input<string> AutomationAccountName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("vmResourceId", required: true)]
        public Input<string> VmResourceId { get; set; } = null!;

        /// <summary>
        /// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("workerGroupName", required: true)]
        public Input<string> WorkerGroupName { get; set; } = null!;

        /// <summary>
        /// Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("workerId", required: true)]
        public Input<string> WorkerId { get; set; } = null!;

        public HybridRunbookWorkerArgs()
        {
        }
        public static new HybridRunbookWorkerArgs Empty => new HybridRunbookWorkerArgs();
    }

    public sealed class HybridRunbookWorkerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("automationAccountName")]
        public Input<string>? AutomationAccountName { get; set; }

        /// <summary>
        /// The IP address of assigned machine.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Last Heartbeat from the Worker.
        /// </summary>
        [Input("lastSeenDateTime")]
        public Input<string>? LastSeenDateTime { get; set; }

        /// <summary>
        /// The registration time of the worker machine.
        /// </summary>
        [Input("registrationDateTime")]
        public Input<string>? RegistrationDateTime { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("vmResourceId")]
        public Input<string>? VmResourceId { get; set; }

        /// <summary>
        /// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("workerGroupName")]
        public Input<string>? WorkerGroupName { get; set; }

        /// <summary>
        /// Specify the ID of this HybridWorker in UUID notation. Changing this forces a new Automation to be created.
        /// </summary>
        [Input("workerId")]
        public Input<string>? WorkerId { get; set; }

        /// <summary>
        /// The name of HybridWorker.
        /// </summary>
        [Input("workerName")]
        public Input<string>? WorkerName { get; set; }

        /// <summary>
        /// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
        /// </summary>
        [Input("workerType")]
        public Input<string>? WorkerType { get; set; }

        public HybridRunbookWorkerState()
        {
        }
        public static new HybridRunbookWorkerState Empty => new HybridRunbookWorkerState();
    }
}
