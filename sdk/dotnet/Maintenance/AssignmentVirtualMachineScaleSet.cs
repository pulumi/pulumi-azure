// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Maintenance
{
    /// <summary>
    /// Manages a maintenance assignment to a virtual machine scale set.
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
    ///     var examplePublicIp = new Azure.Network.PublicIp("example", new()
    ///     {
    ///         Name = example.Name,
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AllocationMethod = "Static",
    ///     });
    /// 
    ///     var exampleLoadBalancer = new Azure.Lb.LoadBalancer("example", new()
    ///     {
    ///         Name = example.Name,
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         FrontendIpConfigurations = new[]
    ///         {
    ///             new Azure.Lb.Inputs.LoadBalancerFrontendIpConfigurationArgs
    ///             {
    ///                 Name = "internal",
    ///                 PublicIpAddressId = examplePublicIp.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleBackendAddressPool = new Azure.Lb.BackendAddressPool("example", new()
    ///     {
    ///         Name = "example",
    ///         LoadbalancerId = exampleLoadBalancer.Id,
    ///     });
    /// 
    ///     var exampleProbe = new Azure.Lb.Probe("example", new()
    ///     {
    ///         Name = "example",
    ///         LoadbalancerId = exampleLoadBalancer.Id,
    ///         Port = 22,
    ///         Protocol = "Tcp",
    ///     });
    /// 
    ///     var exampleRule = new Azure.Lb.Rule("example", new()
    ///     {
    ///         Name = "example",
    ///         LoadbalancerId = exampleLoadBalancer.Id,
    ///         ProbeId = exampleProbe.Id,
    ///         FrontendIpConfigurationName = "internal",
    ///         Protocol = "Tcp",
    ///         FrontendPort = 22,
    ///         BackendPort = 22,
    ///     });
    /// 
    ///     var exampleConfiguration = new Azure.Maintenance.Configuration("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Scope = "OSImage",
    ///         Visibility = "Custom",
    ///         Window = new Azure.Maintenance.Inputs.ConfigurationWindowArgs
    ///         {
    ///             StartDateTime = "2021-12-31 00:00",
    ///             ExpirationDateTime = "9999-12-31 00:00",
    ///             Duration = "06:00",
    ///             TimeZone = "Pacific Standard Time",
    ///             RecurEvery = "1Days",
    ///         },
    ///     });
    /// 
    ///     var exampleNetworkInterface = new Azure.Network.NetworkInterface("example", new()
    ///     {
    ///         Name = "sample-nic",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         IpConfigurations = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkInterfaceIpConfigurationArgs
    ///             {
    ///                 Name = "testconfiguration1",
    ///                 PrivateIpAddressAllocation = "Dynamic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleLinuxVirtualMachine = new Azure.Compute.LinuxVirtualMachine("example", new()
    ///     {
    ///         Name = "example-machine",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Size = "Standard_F2",
    ///         AdminUsername = "adminuser",
    ///         NetworkInterfaceIds = new[]
    ///         {
    ///             exampleNetworkInterface.Id,
    ///         },
    ///         OsDisk = new Azure.Compute.Inputs.LinuxVirtualMachineOsDiskArgs
    ///         {
    ///             Caching = "ReadWrite",
    ///             StorageAccountType = "Standard_LRS",
    ///         },
    ///     });
    /// 
    ///     var exampleLinuxVirtualMachineScaleSet = new Azure.Compute.LinuxVirtualMachineScaleSet("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Sku = "Standard_F2",
    ///         Instances = 1,
    ///         AdminUsername = "adminuser",
    ///         AdminPassword = "P@ssword1234!",
    ///         UpgradeMode = "Automatic",
    ///         HealthProbeId = exampleProbe.Id,
    ///         DisablePasswordAuthentication = false,
    ///         SourceImageReference = new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///         OsDisk = new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetOsDiskArgs
    ///         {
    ///             StorageAccountType = "Standard_LRS",
    ///             Caching = "ReadWrite",
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs
    ///             {
    ///                 Name = "example",
    ///                 Primary = true,
    ///                 IpConfigurations = new[]
    ///                 {
    ///                     new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs
    ///                     {
    ///                         Name = "internal",
    ///                         Primary = true,
    ///                         SubnetId = exampleSubnet.Id,
    ///                         LoadBalancerBackendAddressPoolIds = new[]
    ///                         {
    ///                             exampleBackendAddressPool.Id,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AutomaticOsUpgradePolicy = new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetAutomaticOsUpgradePolicyArgs
    ///         {
    ///             DisableAutomaticRollback = true,
    ///             EnableAutomaticOsUpgrade = true,
    ///         },
    ///         RollingUpgradePolicy = new Azure.Compute.Inputs.LinuxVirtualMachineScaleSetRollingUpgradePolicyArgs
    ///         {
    ///             MaxBatchInstancePercent = 20,
    ///             MaxUnhealthyInstancePercent = 20,
    ///             MaxUnhealthyUpgradedInstancePercent = 20,
    ///             PauseTimeBetweenBatches = "PT0S",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleRule,
    ///         },
    ///     });
    /// 
    ///     var exampleAssignmentVirtualMachineScaleSet = new Azure.Maintenance.AssignmentVirtualMachineScaleSet("example", new()
    ///     {
    ///         Location = example.Location,
    ///         MaintenanceConfigurationId = exampleConfiguration.Id,
    ///         VirtualMachineScaleSetId = exampleLinuxVirtualMachine.Id,
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
    /// * `Microsoft.Maintenance`: 2023-04-01
    /// 
    /// ## Import
    /// 
    /// Maintenance Assignment can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:maintenance/assignmentVirtualMachineScaleSet:AssignmentVirtualMachineScaleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Compute/virtualMachineScaleSets/vmss1/providers/Microsoft.Maintenance/configurationAssignments/assign1
    /// ```
    /// </summary>
    [AzureResourceType("azure:maintenance/assignmentVirtualMachineScaleSet:AssignmentVirtualMachineScaleSet")]
    public partial class AssignmentVirtualMachineScaleSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        /// </summary>
        [Output("maintenanceConfigurationId")]
        public Output<string> MaintenanceConfigurationId { get; private set; } = null!;

        /// <summary>
        /// Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        /// </summary>
        [Output("virtualMachineScaleSetId")]
        public Output<string> VirtualMachineScaleSetId { get; private set; } = null!;


        /// <summary>
        /// Create a AssignmentVirtualMachineScaleSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AssignmentVirtualMachineScaleSet(string name, AssignmentVirtualMachineScaleSetArgs args, CustomResourceOptions? options = null)
            : base("azure:maintenance/assignmentVirtualMachineScaleSet:AssignmentVirtualMachineScaleSet", name, args ?? new AssignmentVirtualMachineScaleSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AssignmentVirtualMachineScaleSet(string name, Input<string> id, AssignmentVirtualMachineScaleSetState? state = null, CustomResourceOptions? options = null)
            : base("azure:maintenance/assignmentVirtualMachineScaleSet:AssignmentVirtualMachineScaleSet", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AssignmentVirtualMachineScaleSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AssignmentVirtualMachineScaleSet Get(string name, Input<string> id, AssignmentVirtualMachineScaleSetState? state = null, CustomResourceOptions? options = null)
        {
            return new AssignmentVirtualMachineScaleSet(name, id, state, options);
        }
    }

    public sealed class AssignmentVirtualMachineScaleSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        /// </summary>
        [Input("maintenanceConfigurationId", required: true)]
        public Input<string> MaintenanceConfigurationId { get; set; } = null!;

        /// <summary>
        /// Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        /// </summary>
        [Input("virtualMachineScaleSetId", required: true)]
        public Input<string> VirtualMachineScaleSetId { get; set; } = null!;

        public AssignmentVirtualMachineScaleSetArgs()
        {
        }
        public static new AssignmentVirtualMachineScaleSetArgs Empty => new AssignmentVirtualMachineScaleSetArgs();
    }

    public sealed class AssignmentVirtualMachineScaleSetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the ID of the Maintenance Configuration Resource. Changing this forces a new resource to be created.
        /// </summary>
        [Input("maintenanceConfigurationId")]
        public Input<string>? MaintenanceConfigurationId { get; set; }

        /// <summary>
        /// Specifies the Virtual Machine Scale Set ID to which the Maintenance Configuration will be assigned. Changing this forces a new resource to be created.
        /// </summary>
        [Input("virtualMachineScaleSetId")]
        public Input<string>? VirtualMachineScaleSetId { get; set; }

        public AssignmentVirtualMachineScaleSetState()
        {
        }
        public static new AssignmentVirtualMachineScaleSetState Empty => new AssignmentVirtualMachineScaleSetState();
    }
}
