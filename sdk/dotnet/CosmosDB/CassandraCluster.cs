// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB
{
    /// <summary>
    /// Manages a Cassandra Cluster.
    /// 
    /// &gt; **Note:** In order for the `Azure Managed Instances for Apache Cassandra` to work properly the product requires the `Azure Cosmos DB` Application ID to be present and working in your tenant. If the `Azure Cosmos DB` Application ID is missing in your environment you will need to have an administrator of your tenant run the following command to add the `Azure Cosmos DB` Application ID to your tenant:
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using AzureAD = Pulumi.AzureAD;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "accexample-rg",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example-vnet",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "example-subnet",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.1.0/24",
    ///         },
    ///     });
    /// 
    ///     var example = AzureAD.GetServicePrincipal.Invoke(new()
    ///     {
    ///         DisplayName = "Azure Cosmos DB",
    ///     });
    /// 
    ///     var exampleAssignment = new Azure.Authorization.Assignment("example", new()
    ///     {
    ///         Scope = exampleVirtualNetwork.Id,
    ///         RoleDefinitionName = "Network Contributor",
    ///         PrincipalId = example.Apply(getServicePrincipalResult =&gt; getServicePrincipalResult.ObjectId),
    ///     });
    /// 
    ///     var exampleCassandraCluster = new Azure.CosmosDB.CassandraCluster("example", new()
    ///     {
    ///         Name = "example-cluster",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         DelegatedManagementSubnetId = exampleSubnet.Id,
    ///         DefaultAdminPassword = "Password1234",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleAssignment,
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
    /// * `Microsoft.DocumentDB`: 2023-04-15
    /// 
    /// ## Import
    /// 
    /// Cassandra Clusters can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cosmosdb/cassandraCluster:CassandraCluster example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DocumentDB/cassandraClusters/cluster1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cosmosdb/cassandraCluster:CassandraCluster")]
    public partial class CassandraCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The authentication method that is used to authenticate clients. Possible values are `None` and `Cassandra`. Defaults to `Cassandra`.
        /// </summary>
        [Output("authenticationMethod")]
        public Output<string?> AuthenticationMethod { get; private set; } = null!;

        /// <summary>
        /// A list of TLS certificates that is used to authorize client connecting to the Cassandra Cluster.
        /// </summary>
        [Output("clientCertificatePems")]
        public Output<ImmutableArray<string>> ClientCertificatePems { get; private set; } = null!;

        /// <summary>
        /// The initial admin password for this Cassandra Cluster. Changing this forces a new resource to be created.
        /// </summary>
        [Output("defaultAdminPassword")]
        public Output<string> DefaultAdminPassword { get; private set; } = null!;

        /// <summary>
        /// The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Output("delegatedManagementSubnetId")]
        public Output<string> DelegatedManagementSubnetId { get; private set; } = null!;

        /// <summary>
        /// A list of TLS certificates that is used to authorize gossip from unmanaged Cassandra Data Center.
        /// </summary>
        [Output("externalGossipCertificatePems")]
        public Output<ImmutableArray<string>> ExternalGossipCertificatePems { get; private set; } = null!;

        /// <summary>
        /// A list of IP Addresses of the seed nodes in unmanaged the Cassandra Data Center which will be added to the seed node lists of all managed nodes.
        /// </summary>
        [Output("externalSeedNodeIpAddresses")]
        public Output<ImmutableArray<string>> ExternalSeedNodeIpAddresses { get; private set; } = null!;

        /// <summary>
        /// The number of hours to wait between taking a backup of the Cassandra Cluster. Defaults to `24`.
        /// 
        /// &gt; **Note:** To disable this feature, set this property to `0`.
        /// </summary>
        [Output("hoursBetweenBackups")]
        public Output<int?> HoursBetweenBackups { get; private set; } = null!;

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Output("identity")]
        public Output<Outputs.CassandraClusterIdentity?> Identity { get; private set; } = null!;

        /// <summary>
        /// The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Is the automatic repair enabled on the Cassandra Cluster? Defaults to `true`.
        /// </summary>
        [Output("repairEnabled")]
        public Output<bool?> RepairEnabled { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The version of Cassandra what the Cluster converges to run. Possible values are `3.11` and `4.0`. Defaults to `3.11`. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Output("version")]
        public Output<string?> Version { get; private set; } = null!;


        /// <summary>
        /// Create a CassandraCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CassandraCluster(string name, CassandraClusterArgs args, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/cassandraCluster:CassandraCluster", name, args ?? new CassandraClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CassandraCluster(string name, Input<string> id, CassandraClusterState? state = null, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/cassandraCluster:CassandraCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "defaultAdminPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CassandraCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CassandraCluster Get(string name, Input<string> id, CassandraClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new CassandraCluster(name, id, state, options);
        }
    }

    public sealed class CassandraClusterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication method that is used to authenticate clients. Possible values are `None` and `Cassandra`. Defaults to `Cassandra`.
        /// </summary>
        [Input("authenticationMethod")]
        public Input<string>? AuthenticationMethod { get; set; }

        [Input("clientCertificatePems")]
        private InputList<string>? _clientCertificatePems;

        /// <summary>
        /// A list of TLS certificates that is used to authorize client connecting to the Cassandra Cluster.
        /// </summary>
        public InputList<string> ClientCertificatePems
        {
            get => _clientCertificatePems ?? (_clientCertificatePems = new InputList<string>());
            set => _clientCertificatePems = value;
        }

        [Input("defaultAdminPassword", required: true)]
        private Input<string>? _defaultAdminPassword;

        /// <summary>
        /// The initial admin password for this Cassandra Cluster. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? DefaultAdminPassword
        {
            get => _defaultAdminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _defaultAdminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("delegatedManagementSubnetId", required: true)]
        public Input<string> DelegatedManagementSubnetId { get; set; } = null!;

        [Input("externalGossipCertificatePems")]
        private InputList<string>? _externalGossipCertificatePems;

        /// <summary>
        /// A list of TLS certificates that is used to authorize gossip from unmanaged Cassandra Data Center.
        /// </summary>
        public InputList<string> ExternalGossipCertificatePems
        {
            get => _externalGossipCertificatePems ?? (_externalGossipCertificatePems = new InputList<string>());
            set => _externalGossipCertificatePems = value;
        }

        [Input("externalSeedNodeIpAddresses")]
        private InputList<string>? _externalSeedNodeIpAddresses;

        /// <summary>
        /// A list of IP Addresses of the seed nodes in unmanaged the Cassandra Data Center which will be added to the seed node lists of all managed nodes.
        /// </summary>
        public InputList<string> ExternalSeedNodeIpAddresses
        {
            get => _externalSeedNodeIpAddresses ?? (_externalSeedNodeIpAddresses = new InputList<string>());
            set => _externalSeedNodeIpAddresses = value;
        }

        /// <summary>
        /// The number of hours to wait between taking a backup of the Cassandra Cluster. Defaults to `24`.
        /// 
        /// &gt; **Note:** To disable this feature, set this property to `0`.
        /// </summary>
        [Input("hoursBetweenBackups")]
        public Input<int>? HoursBetweenBackups { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.CassandraClusterIdentityArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Is the automatic repair enabled on the Cassandra Cluster? Defaults to `true`.
        /// </summary>
        [Input("repairEnabled")]
        public Input<bool>? RepairEnabled { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The version of Cassandra what the Cluster converges to run. Possible values are `3.11` and `4.0`. Defaults to `3.11`. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public CassandraClusterArgs()
        {
        }
        public static new CassandraClusterArgs Empty => new CassandraClusterArgs();
    }

    public sealed class CassandraClusterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication method that is used to authenticate clients. Possible values are `None` and `Cassandra`. Defaults to `Cassandra`.
        /// </summary>
        [Input("authenticationMethod")]
        public Input<string>? AuthenticationMethod { get; set; }

        [Input("clientCertificatePems")]
        private InputList<string>? _clientCertificatePems;

        /// <summary>
        /// A list of TLS certificates that is used to authorize client connecting to the Cassandra Cluster.
        /// </summary>
        public InputList<string> ClientCertificatePems
        {
            get => _clientCertificatePems ?? (_clientCertificatePems = new InputList<string>());
            set => _clientCertificatePems = value;
        }

        [Input("defaultAdminPassword")]
        private Input<string>? _defaultAdminPassword;

        /// <summary>
        /// The initial admin password for this Cassandra Cluster. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? DefaultAdminPassword
        {
            get => _defaultAdminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _defaultAdminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ID of the delegated management subnet for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("delegatedManagementSubnetId")]
        public Input<string>? DelegatedManagementSubnetId { get; set; }

        [Input("externalGossipCertificatePems")]
        private InputList<string>? _externalGossipCertificatePems;

        /// <summary>
        /// A list of TLS certificates that is used to authorize gossip from unmanaged Cassandra Data Center.
        /// </summary>
        public InputList<string> ExternalGossipCertificatePems
        {
            get => _externalGossipCertificatePems ?? (_externalGossipCertificatePems = new InputList<string>());
            set => _externalGossipCertificatePems = value;
        }

        [Input("externalSeedNodeIpAddresses")]
        private InputList<string>? _externalSeedNodeIpAddresses;

        /// <summary>
        /// A list of IP Addresses of the seed nodes in unmanaged the Cassandra Data Center which will be added to the seed node lists of all managed nodes.
        /// </summary>
        public InputList<string> ExternalSeedNodeIpAddresses
        {
            get => _externalSeedNodeIpAddresses ?? (_externalSeedNodeIpAddresses = new InputList<string>());
            set => _externalSeedNodeIpAddresses = value;
        }

        /// <summary>
        /// The number of hours to wait between taking a backup of the Cassandra Cluster. Defaults to `24`.
        /// 
        /// &gt; **Note:** To disable this feature, set this property to `0`.
        /// </summary>
        [Input("hoursBetweenBackups")]
        public Input<int>? HoursBetweenBackups { get; set; }

        /// <summary>
        /// An `identity` block as defined below.
        /// </summary>
        [Input("identity")]
        public Input<Inputs.CassandraClusterIdentityGetArgs>? Identity { get; set; }

        /// <summary>
        /// The Azure Region where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name which should be used for this Cassandra Cluster. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Is the automatic repair enabled on the Cassandra Cluster? Defaults to `true`.
        /// </summary>
        [Input("repairEnabled")]
        public Input<bool>? RepairEnabled { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Cassandra Cluster should exist. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The version of Cassandra what the Cluster converges to run. Possible values are `3.11` and `4.0`. Defaults to `3.11`. Changing this forces a new Cassandra Cluster to be created.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public CassandraClusterState()
        {
        }
        public static new CassandraClusterState Empty => new CassandraClusterState();
    }
}
