// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight
{
    /// <summary>
    /// Manages a HDInsight Hadoop Cluster.
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
    ///         Name = "hdinsightstor",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleContainer = new Azure.Storage.Container("example", new()
    ///     {
    ///         Name = "hdinsight",
    ///         StorageAccountName = exampleAccount.Name,
    ///         ContainerAccessType = "private",
    ///     });
    /// 
    ///     var exampleHadoopCluster = new Azure.HDInsight.HadoopCluster("example", new()
    ///     {
    ///         Name = "example-hdicluster",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         ClusterVersion = "3.6",
    ///         Tier = "Standard",
    ///         ComponentVersion = new Azure.HDInsight.Inputs.HadoopClusterComponentVersionArgs
    ///         {
    ///             Hadoop = "2.7",
    ///         },
    ///         Gateway = new Azure.HDInsight.Inputs.HadoopClusterGatewayArgs
    ///         {
    ///             Username = "acctestusrgw",
    ///             Password = "PAssword123!",
    ///         },
    ///         StorageAccounts = new[]
    ///         {
    ///             new Azure.HDInsight.Inputs.HadoopClusterStorageAccountArgs
    ///             {
    ///                 StorageContainerId = exampleContainer.Id,
    ///                 StorageAccountKey = exampleAccount.PrimaryAccessKey,
    ///                 IsDefault = true,
    ///             },
    ///         },
    ///         Roles = new Azure.HDInsight.Inputs.HadoopClusterRolesArgs
    ///         {
    ///             HeadNode = new Azure.HDInsight.Inputs.HadoopClusterRolesHeadNodeArgs
    ///             {
    ///                 VmSize = "Standard_D3_V2",
    ///                 Username = "acctestusrvm",
    ///                 Password = "AccTestvdSC4daf986!",
    ///             },
    ///             WorkerNode = new Azure.HDInsight.Inputs.HadoopClusterRolesWorkerNodeArgs
    ///             {
    ///                 VmSize = "Standard_D4_V2",
    ///                 Username = "acctestusrvm",
    ///                 Password = "AccTestvdSC4daf986!",
    ///                 TargetInstanceCount = 3,
    ///             },
    ///             ZookeeperNode = new Azure.HDInsight.Inputs.HadoopClusterRolesZookeeperNodeArgs
    ///             {
    ///                 VmSize = "Standard_D3_V2",
    ///                 Username = "acctestusrvm",
    ///                 Password = "AccTestvdSC4daf986!",
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
    /// * `Microsoft.HDInsight`: 2021-06-01
    /// 
    /// ## Import
    /// 
    /// HDInsight Hadoop Clusters can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:hdinsight/hadoopCluster:HadoopCluster example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.HDInsight/clusters/cluster1
    /// ```
    /// </summary>
    [AzureResourceType("azure:hdinsight/hadoopCluster:HadoopCluster")]
    public partial class HadoopCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Output("clusterVersion")]
        public Output<string> ClusterVersion { get; private set; } = null!;

        /// <summary>
        /// A `component_version` block as defined below.
        /// </summary>
        [Output("componentVersion")]
        public Output<Outputs.HadoopClusterComponentVersion> ComponentVersion { get; private set; } = null!;

        /// <summary>
        /// A `compute_isolation` block as defined below.
        /// </summary>
        [Output("computeIsolation")]
        public Output<Outputs.HadoopClusterComputeIsolation?> ComputeIsolation { get; private set; } = null!;

        /// <summary>
        /// One or more `disk_encryption` block as defined below.
        /// </summary>
        [Output("diskEncryptions")]
        public Output<ImmutableArray<Outputs.HadoopClusterDiskEncryption>> DiskEncryptions { get; private set; } = null!;

        /// <summary>
        /// An `extension` block as defined below.
        /// </summary>
        [Output("extension")]
        public Output<Outputs.HadoopClusterExtension?> Extension { get; private set; } = null!;

        /// <summary>
        /// A `gateway` block as defined below.
        /// </summary>
        [Output("gateway")]
        public Output<Outputs.HadoopClusterGateway> Gateway { get; private set; } = null!;

        /// <summary>
        /// The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
        /// </summary>
        [Output("httpsEndpoint")]
        public Output<string> HttpsEndpoint { get; private set; } = null!;

        /// <summary>
        /// Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// A `metastores` block as defined below.
        /// </summary>
        [Output("metastores")]
        public Output<Outputs.HadoopClusterMetastores?> Metastores { get; private set; } = null!;

        /// <summary>
        /// A `monitor` block as defined below.
        /// </summary>
        [Output("monitor")]
        public Output<Outputs.HadoopClusterMonitor?> Monitor { get; private set; } = null!;

        /// <summary>
        /// Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `network` block as defined below.
        /// </summary>
        [Output("network")]
        public Output<Outputs.HadoopClusterNetwork?> Network { get; private set; } = null!;

        /// <summary>
        /// A `private_link_configuration` block as defined below.
        /// </summary>
        [Output("privateLinkConfiguration")]
        public Output<Outputs.HadoopClusterPrivateLinkConfiguration?> PrivateLinkConfiguration { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A `roles` block as defined below.
        /// </summary>
        [Output("roles")]
        public Output<Outputs.HadoopClusterRoles> Roles { get; private set; } = null!;

        /// <summary>
        /// A `security_profile` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("securityProfile")]
        public Output<Outputs.HadoopClusterSecurityProfile?> SecurityProfile { get; private set; } = null!;

        /// <summary>
        /// The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
        /// </summary>
        [Output("sshEndpoint")]
        public Output<string> SshEndpoint { get; private set; } = null!;

        /// <summary>
        /// A `storage_account_gen2` block as defined below.
        /// </summary>
        [Output("storageAccountGen2")]
        public Output<Outputs.HadoopClusterStorageAccountGen2?> StorageAccountGen2 { get; private set; } = null!;

        /// <summary>
        /// One or more `storage_account` block as defined below.
        /// </summary>
        [Output("storageAccounts")]
        public Output<ImmutableArray<Outputs.HadoopClusterStorageAccount>> StorageAccounts { get; private set; } = null!;

        /// <summary>
        /// A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("tier")]
        public Output<string> Tier { get; private set; } = null!;

        /// <summary>
        /// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
        /// </summary>
        [Output("tlsMinVersion")]
        public Output<string?> TlsMinVersion { get; private set; } = null!;


        /// <summary>
        /// Create a HadoopCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HadoopCluster(string name, HadoopClusterArgs args, CustomResourceOptions? options = null)
            : base("azure:hdinsight/hadoopCluster:HadoopCluster", name, args ?? new HadoopClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HadoopCluster(string name, Input<string> id, HadoopClusterState? state = null, CustomResourceOptions? options = null)
            : base("azure:hdinsight/hadoopCluster:HadoopCluster", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HadoopCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HadoopCluster Get(string name, Input<string> id, HadoopClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new HadoopCluster(name, id, state, options);
        }
    }

    public sealed class HadoopClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Input("clusterVersion", required: true)]
        public Input<string> ClusterVersion { get; set; } = null!;

        /// <summary>
        /// A `component_version` block as defined below.
        /// </summary>
        [Input("componentVersion", required: true)]
        public Input<Inputs.HadoopClusterComponentVersionArgs> ComponentVersion { get; set; } = null!;

        /// <summary>
        /// A `compute_isolation` block as defined below.
        /// </summary>
        [Input("computeIsolation")]
        public Input<Inputs.HadoopClusterComputeIsolationArgs>? ComputeIsolation { get; set; }

        [Input("diskEncryptions")]
        private InputList<Inputs.HadoopClusterDiskEncryptionArgs>? _diskEncryptions;

        /// <summary>
        /// One or more `disk_encryption` block as defined below.
        /// </summary>
        public InputList<Inputs.HadoopClusterDiskEncryptionArgs> DiskEncryptions
        {
            get => _diskEncryptions ?? (_diskEncryptions = new InputList<Inputs.HadoopClusterDiskEncryptionArgs>());
            set => _diskEncryptions = value;
        }

        /// <summary>
        /// An `extension` block as defined below.
        /// </summary>
        [Input("extension")]
        public Input<Inputs.HadoopClusterExtensionArgs>? Extension { get; set; }

        /// <summary>
        /// A `gateway` block as defined below.
        /// </summary>
        [Input("gateway", required: true)]
        public Input<Inputs.HadoopClusterGatewayArgs> Gateway { get; set; } = null!;

        /// <summary>
        /// Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A `metastores` block as defined below.
        /// </summary>
        [Input("metastores")]
        public Input<Inputs.HadoopClusterMetastoresArgs>? Metastores { get; set; }

        /// <summary>
        /// A `monitor` block as defined below.
        /// </summary>
        [Input("monitor")]
        public Input<Inputs.HadoopClusterMonitorArgs>? Monitor { get; set; }

        /// <summary>
        /// Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network` block as defined below.
        /// </summary>
        [Input("network")]
        public Input<Inputs.HadoopClusterNetworkArgs>? Network { get; set; }

        /// <summary>
        /// A `private_link_configuration` block as defined below.
        /// </summary>
        [Input("privateLinkConfiguration")]
        public Input<Inputs.HadoopClusterPrivateLinkConfigurationArgs>? PrivateLinkConfiguration { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// A `roles` block as defined below.
        /// </summary>
        [Input("roles", required: true)]
        public Input<Inputs.HadoopClusterRolesArgs> Roles { get; set; } = null!;

        /// <summary>
        /// A `security_profile` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("securityProfile")]
        public Input<Inputs.HadoopClusterSecurityProfileArgs>? SecurityProfile { get; set; }

        /// <summary>
        /// A `storage_account_gen2` block as defined below.
        /// </summary>
        [Input("storageAccountGen2")]
        public Input<Inputs.HadoopClusterStorageAccountGen2Args>? StorageAccountGen2 { get; set; }

        [Input("storageAccounts")]
        private InputList<Inputs.HadoopClusterStorageAccountArgs>? _storageAccounts;

        /// <summary>
        /// One or more `storage_account` block as defined below.
        /// </summary>
        public InputList<Inputs.HadoopClusterStorageAccountArgs> StorageAccounts
        {
            get => _storageAccounts ?? (_storageAccounts = new InputList<Inputs.HadoopClusterStorageAccountArgs>());
            set => _storageAccounts = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("tier", required: true)]
        public Input<string> Tier { get; set; } = null!;

        /// <summary>
        /// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
        /// </summary>
        [Input("tlsMinVersion")]
        public Input<string>? TlsMinVersion { get; set; }

        public HadoopClusterArgs()
        {
        }
        public static new HadoopClusterArgs Empty => new HadoopClusterArgs();
    }

    public sealed class HadoopClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Input("clusterVersion")]
        public Input<string>? ClusterVersion { get; set; }

        /// <summary>
        /// A `component_version` block as defined below.
        /// </summary>
        [Input("componentVersion")]
        public Input<Inputs.HadoopClusterComponentVersionGetArgs>? ComponentVersion { get; set; }

        /// <summary>
        /// A `compute_isolation` block as defined below.
        /// </summary>
        [Input("computeIsolation")]
        public Input<Inputs.HadoopClusterComputeIsolationGetArgs>? ComputeIsolation { get; set; }

        [Input("diskEncryptions")]
        private InputList<Inputs.HadoopClusterDiskEncryptionGetArgs>? _diskEncryptions;

        /// <summary>
        /// One or more `disk_encryption` block as defined below.
        /// </summary>
        public InputList<Inputs.HadoopClusterDiskEncryptionGetArgs> DiskEncryptions
        {
            get => _diskEncryptions ?? (_diskEncryptions = new InputList<Inputs.HadoopClusterDiskEncryptionGetArgs>());
            set => _diskEncryptions = value;
        }

        /// <summary>
        /// An `extension` block as defined below.
        /// </summary>
        [Input("extension")]
        public Input<Inputs.HadoopClusterExtensionGetArgs>? Extension { get; set; }

        /// <summary>
        /// A `gateway` block as defined below.
        /// </summary>
        [Input("gateway")]
        public Input<Inputs.HadoopClusterGatewayGetArgs>? Gateway { get; set; }

        /// <summary>
        /// The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
        /// </summary>
        [Input("httpsEndpoint")]
        public Input<string>? HttpsEndpoint { get; set; }

        /// <summary>
        /// Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// A `metastores` block as defined below.
        /// </summary>
        [Input("metastores")]
        public Input<Inputs.HadoopClusterMetastoresGetArgs>? Metastores { get; set; }

        /// <summary>
        /// A `monitor` block as defined below.
        /// </summary>
        [Input("monitor")]
        public Input<Inputs.HadoopClusterMonitorGetArgs>? Monitor { get; set; }

        /// <summary>
        /// Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `network` block as defined below.
        /// </summary>
        [Input("network")]
        public Input<Inputs.HadoopClusterNetworkGetArgs>? Network { get; set; }

        /// <summary>
        /// A `private_link_configuration` block as defined below.
        /// </summary>
        [Input("privateLinkConfiguration")]
        public Input<Inputs.HadoopClusterPrivateLinkConfigurationGetArgs>? PrivateLinkConfiguration { get; set; }

        /// <summary>
        /// Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// A `roles` block as defined below.
        /// </summary>
        [Input("roles")]
        public Input<Inputs.HadoopClusterRolesGetArgs>? Roles { get; set; }

        /// <summary>
        /// A `security_profile` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("securityProfile")]
        public Input<Inputs.HadoopClusterSecurityProfileGetArgs>? SecurityProfile { get; set; }

        /// <summary>
        /// The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
        /// </summary>
        [Input("sshEndpoint")]
        public Input<string>? SshEndpoint { get; set; }

        /// <summary>
        /// A `storage_account_gen2` block as defined below.
        /// </summary>
        [Input("storageAccountGen2")]
        public Input<Inputs.HadoopClusterStorageAccountGen2GetArgs>? StorageAccountGen2 { get; set; }

        [Input("storageAccounts")]
        private InputList<Inputs.HadoopClusterStorageAccountGetArgs>? _storageAccounts;

        /// <summary>
        /// One or more `storage_account` block as defined below.
        /// </summary>
        public InputList<Inputs.HadoopClusterStorageAccountGetArgs> StorageAccounts
        {
            get => _storageAccounts ?? (_storageAccounts = new InputList<Inputs.HadoopClusterStorageAccountGetArgs>());
            set => _storageAccounts = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        /// <summary>
        /// The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
        /// 
        /// &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
        /// </summary>
        [Input("tlsMinVersion")]
        public Input<string>? TlsMinVersion { get; set; }

        public HadoopClusterState()
        {
        }
        public static new HadoopClusterState Empty => new HadoopClusterState();
    }
}
