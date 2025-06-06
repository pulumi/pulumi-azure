// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql
{
    /// <summary>
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
    ///         Name = "example",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("example", new()
    ///     {
    ///         Name = "example",
    ///         ResourceGroupName = example.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///     });
    /// 
    ///     var exampleManagedInstance = new Azure.MSSql.ManagedInstance("example", new()
    ///     {
    ///         Name = "managedsqlinstance",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         LicenseType = "BasePrice",
    ///         SkuName = "GP_Gen5",
    ///         StorageSizeInGb = 32,
    ///         SubnetId = exampleSubnet.Id,
    ///         Vcores = 4,
    ///         AdministratorLogin = "msadministrator",
    ///         AdministratorLoginPassword = "thisIsDog11",
    ///     });
    /// 
    ///     var exampleManagedDatabase = new Azure.MSSql.ManagedDatabase("example", new()
    ///     {
    ///         Name = "example",
    ///         ManagedInstanceId = exampleManagedInstance.Id,
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
    /// * `Microsoft.Sql`: 2023-08-01-preview
    /// 
    /// ## Import
    /// 
    /// SQL Managed Databases can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:mssql/managedDatabase:ManagedDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/myserver/databases/mydatabase
    /// ```
    /// </summary>
    [AzureResourceType("azure:mssql/managedDatabase:ManagedDatabase")]
    public partial class ManagedDatabase : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A `long_term_retention_policy` block as defined below.
        /// </summary>
        [Output("longTermRetentionPolicy")]
        public Output<Outputs.ManagedDatabaseLongTermRetentionPolicy> LongTermRetentionPolicy { get; private set; } = null!;

        /// <summary>
        /// The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        /// </summary>
        [Output("managedInstanceId")]
        public Output<string> ManagedInstanceId { get; private set; } = null!;

        /// <summary>
        /// The name of the Managed Database to create. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Output("pointInTimeRestore")]
        public Output<Outputs.ManagedDatabasePointInTimeRestore?> PointInTimeRestore { get; private set; } = null!;

        /// <summary>
        /// The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        /// </summary>
        [Output("shortTermRetentionDays")]
        public Output<int?> ShortTermRetentionDays { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedDatabase resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedDatabase(string name, ManagedDatabaseArgs args, CustomResourceOptions? options = null)
            : base("azure:mssql/managedDatabase:ManagedDatabase", name, args ?? new ManagedDatabaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedDatabase(string name, Input<string> id, ManagedDatabaseState? state = null, CustomResourceOptions? options = null)
            : base("azure:mssql/managedDatabase:ManagedDatabase", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "azure:sql/managedDatabase:ManagedDatabase" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedDatabase resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedDatabase Get(string name, Input<string> id, ManagedDatabaseState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedDatabase(name, id, state, options);
        }
    }

    public sealed class ManagedDatabaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `long_term_retention_policy` block as defined below.
        /// </summary>
        [Input("longTermRetentionPolicy")]
        public Input<Inputs.ManagedDatabaseLongTermRetentionPolicyArgs>? LongTermRetentionPolicy { get; set; }

        /// <summary>
        /// The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managedInstanceId", required: true)]
        public Input<string> ManagedInstanceId { get; set; } = null!;

        /// <summary>
        /// The name of the Managed Database to create. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("pointInTimeRestore")]
        public Input<Inputs.ManagedDatabasePointInTimeRestoreArgs>? PointInTimeRestore { get; set; }

        /// <summary>
        /// The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        /// </summary>
        [Input("shortTermRetentionDays")]
        public Input<int>? ShortTermRetentionDays { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ManagedDatabaseArgs()
        {
        }
        public static new ManagedDatabaseArgs Empty => new ManagedDatabaseArgs();
    }

    public sealed class ManagedDatabaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `long_term_retention_policy` block as defined below.
        /// </summary>
        [Input("longTermRetentionPolicy")]
        public Input<Inputs.ManagedDatabaseLongTermRetentionPolicyGetArgs>? LongTermRetentionPolicy { get; set; }

        /// <summary>
        /// The ID of the Azure SQL Managed Instance on which to create this Managed Database. Changing this forces a new resource to be created.
        /// </summary>
        [Input("managedInstanceId")]
        public Input<string>? ManagedInstanceId { get; set; }

        /// <summary>
        /// The name of the Managed Database to create. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A `point_in_time_restore` block as defined below. Changing this forces a new resource to be created.
        /// </summary>
        [Input("pointInTimeRestore")]
        public Input<Inputs.ManagedDatabasePointInTimeRestoreGetArgs>? PointInTimeRestore { get; set; }

        /// <summary>
        /// The backup retention period in days. This is how many days Point-in-Time Restore will be supported.
        /// </summary>
        [Input("shortTermRetentionDays")]
        public Input<int>? ShortTermRetentionDays { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ManagedDatabaseState()
        {
        }
        public static new ManagedDatabaseState Empty => new ManagedDatabaseState();
    }
}
