// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Hpc
{
    /// <summary>
    /// Manages a NFS Target within a HPC Cache.
    /// 
    /// !&gt; **Note:** The `azure.hpc.CacheNfsTarget` resource has been deprecated because the service is retiring on 2025-09-30. This resource will be removed in v5.0 of the AzureRM Provider. See https://aka.ms/hpccacheretirement for more information.
    /// 
    /// &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.StorageCache` Resource Provider for this resource. To register it you can run `az provider register --namespace 'Microsoft.StorageCache'`.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Std = Pulumi.Std;
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
    ///         Name = "examplevn",
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var exampleHpc = new Azure.Network.Subnet("example_hpc", new()
    ///     {
    ///         Name = "examplesubnethpc",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.1.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleCache = new Azure.Hpc.Cache("example", new()
    ///     {
    ///         Name = "examplehpccache",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         CacheSizeInGb = 3072,
    ///         SubnetId = exampleHpc.Id,
    ///         SkuName = "Standard_2G",
    ///     });
    /// 
    ///     var exampleVm = new Azure.Network.Subnet("example_vm", new()
    ///     {
    ///         Name = "examplesubnetvm",
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
    ///         Name = "examplenic",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         IpConfigurations = new[]
    ///         {
    ///             new Azure.Network.Inputs.NetworkInterfaceIpConfigurationArgs
    ///             {
    ///                 Name = "internal",
    ///                 SubnetId = exampleVm.Id,
    ///                 PrivateIpAddressAllocation = "Dynamic",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var customData = @"#!/bin/bash
    /// sudo -i 
    /// apt-get install -y nfs-kernel-server
    /// mkdir -p /export/a/1
    /// mkdir -p /export/a/2
    /// mkdir -p /export/b
    /// cat &lt;&lt; EOF &gt; /etc/exports
    /// /export/a *(rw,fsid=0,insecure,no_subtree_check,async)
    /// /export/b *(rw,fsid=0,insecure,no_subtree_check,async)
    /// EOF
    /// systemctl start nfs-server
    /// exportfs -arv
    /// ";
    /// 
    ///     var exampleLinuxVirtualMachine = new Azure.Compute.LinuxVirtualMachine("example", new()
    ///     {
    ///         Name = "examplevm",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         Size = "Standard_F2",
    ///         AdminUsername = "adminuser",
    ///         NetworkInterfaceIds = new[]
    ///         {
    ///             exampleNetworkInterface.Id,
    ///         },
    ///         AdminSshKeys = new[]
    ///         {
    ///             new Azure.Compute.Inputs.LinuxVirtualMachineAdminSshKeyArgs
    ///             {
    ///                 Username = "adminuser",
    ///                 PublicKey = Std.File.Invoke(new()
    ///                 {
    ///                     Input = "~/.ssh/id_rsa.pub",
    ///                 }).Apply(invoke =&gt; invoke.Result),
    ///             },
    ///         },
    ///         OsDisk = new Azure.Compute.Inputs.LinuxVirtualMachineOsDiskArgs
    ///         {
    ///             Caching = "ReadWrite",
    ///             StorageAccountType = "Standard_LRS",
    ///         },
    ///         SourceImageReference = new Azure.Compute.Inputs.LinuxVirtualMachineSourceImageReferenceArgs
    ///         {
    ///             Publisher = "Canonical",
    ///             Offer = "0001-com-ubuntu-server-jammy",
    ///             Sku = "22_04-lts",
    ///             Version = "latest",
    ///         },
    ///         CustomData = Std.Base64encode.Invoke(new()
    ///         {
    ///             Input = customData,
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    ///     var exampleCacheNfsTarget = new Azure.Hpc.CacheNfsTarget("example", new()
    ///     {
    ///         Name = "examplehpcnfstarget",
    ///         ResourceGroupName = example.Name,
    ///         CacheName = exampleCache.Name,
    ///         TargetHostName = exampleLinuxVirtualMachine.PrivateIpAddress,
    ///         UsageModel = "READ_HEAVY_INFREQ",
    ///         NamespaceJunctions = new[]
    ///         {
    ///             new Azure.Hpc.Inputs.CacheNfsTargetNamespaceJunctionArgs
    ///             {
    ///                 NamespacePath = "/nfs/a1",
    ///                 NfsExport = "/export/a",
    ///                 TargetPath = "1",
    ///             },
    ///             new Azure.Hpc.Inputs.CacheNfsTargetNamespaceJunctionArgs
    ///             {
    ///                 NamespacePath = "/nfs/b",
    ///                 NfsExport = "/export/b",
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
    /// * `Microsoft.StorageCache`: 2023-05-01
    /// 
    /// ## Import
    /// 
    /// NFS Target within a HPC Cache can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:hpc/cacheNfsTarget:CacheNfsTarget example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StorageCache/caches/cache1/storageTargets/target1
    /// ```
    /// </summary>
    [AzureResourceType("azure:hpc/cacheNfsTarget:CacheNfsTarget")]
    public partial class CacheNfsTarget : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name HPC Cache, which the HPC Cache NFS Target will be added to. Changing this forces a new resource to be created.
        /// </summary>
        [Output("cacheName")]
        public Output<string> CacheName { get; private set; } = null!;

        /// <summary>
        /// The name of the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Can be specified multiple times to define multiple `namespace_junction`. Each `namespace_junction` block supports fields documented below.
        /// </summary>
        [Output("namespaceJunctions")]
        public Output<ImmutableArray<Outputs.CacheNfsTargetNamespaceJunction>> NamespaceJunctions { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group in which to create the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The IP address or fully qualified domain name (FQDN) of the HPC Cache NFS target. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetHostName")]
        public Output<string> TargetHostName { get; private set; } = null!;

        /// <summary>
        /// The type of usage of the HPC Cache NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `READ_ONLY`, `READ_WRITE`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
        /// </summary>
        [Output("usageModel")]
        public Output<string> UsageModel { get; private set; } = null!;

        /// <summary>
        /// The amount of time the cache waits before it checks the back-end storage for file updates. Possible values are between `1` and `31536000`.
        /// </summary>
        [Output("verificationTimerInSeconds")]
        public Output<int?> VerificationTimerInSeconds { get; private set; } = null!;

        /// <summary>
        /// The amount of time the cache waits after the last file change before it copies the changed file to back-end storage. Possible values are between `1` and `31536000`.
        /// </summary>
        [Output("writeBackTimerInSeconds")]
        public Output<int?> WriteBackTimerInSeconds { get; private set; } = null!;


        /// <summary>
        /// Create a CacheNfsTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CacheNfsTarget(string name, CacheNfsTargetArgs args, CustomResourceOptions? options = null)
            : base("azure:hpc/cacheNfsTarget:CacheNfsTarget", name, args ?? new CacheNfsTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CacheNfsTarget(string name, Input<string> id, CacheNfsTargetState? state = null, CustomResourceOptions? options = null)
            : base("azure:hpc/cacheNfsTarget:CacheNfsTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CacheNfsTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CacheNfsTarget Get(string name, Input<string> id, CacheNfsTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new CacheNfsTarget(name, id, state, options);
        }
    }

    public sealed class CacheNfsTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name HPC Cache, which the HPC Cache NFS Target will be added to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cacheName", required: true)]
        public Input<string> CacheName { get; set; } = null!;

        /// <summary>
        /// The name of the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namespaceJunctions", required: true)]
        private InputList<Inputs.CacheNfsTargetNamespaceJunctionArgs>? _namespaceJunctions;

        /// <summary>
        /// Can be specified multiple times to define multiple `namespace_junction`. Each `namespace_junction` block supports fields documented below.
        /// </summary>
        public InputList<Inputs.CacheNfsTargetNamespaceJunctionArgs> NamespaceJunctions
        {
            get => _namespaceJunctions ?? (_namespaceJunctions = new InputList<Inputs.CacheNfsTargetNamespaceJunctionArgs>());
            set => _namespaceJunctions = value;
        }

        /// <summary>
        /// The name of the Resource Group in which to create the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The IP address or fully qualified domain name (FQDN) of the HPC Cache NFS target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetHostName", required: true)]
        public Input<string> TargetHostName { get; set; } = null!;

        /// <summary>
        /// The type of usage of the HPC Cache NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `READ_ONLY`, `READ_WRITE`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
        /// </summary>
        [Input("usageModel", required: true)]
        public Input<string> UsageModel { get; set; } = null!;

        /// <summary>
        /// The amount of time the cache waits before it checks the back-end storage for file updates. Possible values are between `1` and `31536000`.
        /// </summary>
        [Input("verificationTimerInSeconds")]
        public Input<int>? VerificationTimerInSeconds { get; set; }

        /// <summary>
        /// The amount of time the cache waits after the last file change before it copies the changed file to back-end storage. Possible values are between `1` and `31536000`.
        /// </summary>
        [Input("writeBackTimerInSeconds")]
        public Input<int>? WriteBackTimerInSeconds { get; set; }

        public CacheNfsTargetArgs()
        {
        }
        public static new CacheNfsTargetArgs Empty => new CacheNfsTargetArgs();
    }

    public sealed class CacheNfsTargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name HPC Cache, which the HPC Cache NFS Target will be added to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cacheName")]
        public Input<string>? CacheName { get; set; }

        /// <summary>
        /// The name of the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namespaceJunctions")]
        private InputList<Inputs.CacheNfsTargetNamespaceJunctionGetArgs>? _namespaceJunctions;

        /// <summary>
        /// Can be specified multiple times to define multiple `namespace_junction`. Each `namespace_junction` block supports fields documented below.
        /// </summary>
        public InputList<Inputs.CacheNfsTargetNamespaceJunctionGetArgs> NamespaceJunctions
        {
            get => _namespaceJunctions ?? (_namespaceJunctions = new InputList<Inputs.CacheNfsTargetNamespaceJunctionGetArgs>());
            set => _namespaceJunctions = value;
        }

        /// <summary>
        /// The name of the Resource Group in which to create the HPC Cache NFS Target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The IP address or fully qualified domain name (FQDN) of the HPC Cache NFS target. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetHostName")]
        public Input<string>? TargetHostName { get; set; }

        /// <summary>
        /// The type of usage of the HPC Cache NFS Target. Possible values are: `READ_HEAVY_INFREQ`, `READ_HEAVY_CHECK_180`, `READ_ONLY`, `READ_WRITE`, `WRITE_WORKLOAD_15`, `WRITE_AROUND`, `WRITE_WORKLOAD_CHECK_30`, `WRITE_WORKLOAD_CHECK_60` and `WRITE_WORKLOAD_CLOUDWS`.
        /// </summary>
        [Input("usageModel")]
        public Input<string>? UsageModel { get; set; }

        /// <summary>
        /// The amount of time the cache waits before it checks the back-end storage for file updates. Possible values are between `1` and `31536000`.
        /// </summary>
        [Input("verificationTimerInSeconds")]
        public Input<int>? VerificationTimerInSeconds { get; set; }

        /// <summary>
        /// The amount of time the cache waits after the last file change before it copies the changed file to back-end storage. Possible values are between `1` and `31536000`.
        /// </summary>
        [Input("writeBackTimerInSeconds")]
        public Input<int>? WriteBackTimerInSeconds { get; set; }

        public CacheNfsTargetState()
        {
        }
        public static new CacheNfsTargetState Empty => new CacheNfsTargetState();
    }
}
