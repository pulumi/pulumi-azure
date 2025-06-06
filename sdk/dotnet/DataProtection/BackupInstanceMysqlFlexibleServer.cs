// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataProtection
{
    /// <summary>
    /// Manages a Backup Instance to back up MySQL Flexible Server.
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
    ///     var exampleFlexibleServer = new Azure.MySql.FlexibleServer("example", new()
    ///     {
    ///         Name = "example-mysqlfs",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AdministratorLogin = "adminTerraform",
    ///         AdministratorPassword = "QAZwsx123",
    ///         Version = "8.0.21",
    ///         SkuName = "B_Standard_B1ms",
    ///         Zone = "1",
    ///     });
    /// 
    ///     var exampleBackupVault = new Azure.DataProtection.BackupVault("example", new()
    ///     {
    ///         Name = "example-backupvault",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         DatastoreType = "VaultStore",
    ///         Redundancy = "LocallyRedundant",
    ///         SoftDelete = "Off",
    ///         Identity = new Azure.DataProtection.Inputs.BackupVaultIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleAssignment = new Azure.Authorization.Assignment("example", new()
    ///     {
    ///         Scope = example.Id,
    ///         RoleDefinitionName = "Reader",
    ///         PrincipalId = exampleBackupVault.Identity.Apply(identity =&gt; identity?.PrincipalId),
    ///     });
    /// 
    ///     var example2 = new Azure.Authorization.Assignment("example2", new()
    ///     {
    ///         Scope = exampleFlexibleServer.Id,
    ///         RoleDefinitionName = "MySQL Backup And Export Operator",
    ///         PrincipalId = exampleBackupVault.Identity.Apply(identity =&gt; identity?.PrincipalId),
    ///     });
    /// 
    ///     var exampleBackupPolicyMysqlFlexibleServer = new Azure.DataProtection.BackupPolicyMysqlFlexibleServer("example", new()
    ///     {
    ///         Name = "example-dp",
    ///         VaultId = exampleBackupVault.Id,
    ///         BackupRepeatingTimeIntervals = new[]
    ///         {
    ///             "R/2021-05-23T02:30:00+00:00/P1W",
    ///         },
    ///         DefaultRetentionRule = new Azure.DataProtection.Inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs
    ///         {
    ///             LifeCycles = new[]
    ///             {
    ///                 new Azure.DataProtection.Inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs
    ///                 {
    ///                     Duration = "P4M",
    ///                     DataStoreType = "VaultStore",
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             exampleAssignment,
    ///             example2,
    ///         },
    ///     });
    /// 
    ///     var exampleBackupInstanceMysqlFlexibleServer = new Azure.DataProtection.BackupInstanceMysqlFlexibleServer("example", new()
    ///     {
    ///         Name = "example-dbi",
    ///         Location = example.Location,
    ///         VaultId = exampleBackupVault.Id,
    ///         ServerId = exampleFlexibleServer.Id,
    ///         BackupPolicyId = exampleBackupPolicyMysqlFlexibleServer.Id,
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
    /// * `Microsoft.DataProtection`: 2024-04-01
    /// 
    /// ## Import
    /// 
    /// Backup Instance MySQL Flexible Servers can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataProtection/backupVaults/vault1/backupInstances/backupInstance1
    /// ```
    /// </summary>
    [AzureResourceType("azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer")]
    public partial class BackupInstanceMysqlFlexibleServer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Backup Policy.
        /// </summary>
        [Output("backupPolicyId")]
        public Output<string> BackupPolicyId { get; private set; } = null!;

        /// <summary>
        /// The location of the source database. Changing this forces a new resource to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the source server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("serverId")]
        public Output<string> ServerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a BackupInstanceMysqlFlexibleServer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupInstanceMysqlFlexibleServer(string name, BackupInstanceMysqlFlexibleServerArgs args, CustomResourceOptions? options = null)
            : base("azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer", name, args ?? new BackupInstanceMysqlFlexibleServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupInstanceMysqlFlexibleServer(string name, Input<string> id, BackupInstanceMysqlFlexibleServerState? state = null, CustomResourceOptions? options = null)
            : base("azure:dataprotection/backupInstanceMysqlFlexibleServer:BackupInstanceMysqlFlexibleServer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BackupInstanceMysqlFlexibleServer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackupInstanceMysqlFlexibleServer Get(string name, Input<string> id, BackupInstanceMysqlFlexibleServerState? state = null, CustomResourceOptions? options = null)
        {
            return new BackupInstanceMysqlFlexibleServer(name, id, state, options);
        }
    }

    public sealed class BackupInstanceMysqlFlexibleServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Backup Policy.
        /// </summary>
        [Input("backupPolicyId", required: true)]
        public Input<string> BackupPolicyId { get; set; } = null!;

        /// <summary>
        /// The location of the source database. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the source server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        /// <summary>
        /// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public BackupInstanceMysqlFlexibleServerArgs()
        {
        }
        public static new BackupInstanceMysqlFlexibleServerArgs Empty => new BackupInstanceMysqlFlexibleServerArgs();
    }

    public sealed class BackupInstanceMysqlFlexibleServerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Backup Policy.
        /// </summary>
        [Input("backupPolicyId")]
        public Input<string>? BackupPolicyId { get; set; }

        /// <summary>
        /// The location of the source database. Changing this forces a new resource to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name of the Backup Instance for the MySQL Flexible Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the source server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        /// <summary>
        /// The ID of the Backup Vault within which the MySQL Flexible Server Backup Instance should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public BackupInstanceMysqlFlexibleServerState()
        {
        }
        public static new BackupInstanceMysqlFlexibleServerState Empty => new BackupInstanceMysqlFlexibleServerState();
    }
}
