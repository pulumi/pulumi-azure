// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql
{
    /// <summary>
    /// Manages a MS SQL Server Microsoft Support Auditing Policy.
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
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleServer = new Azure.MSSql.Server("exampleServer", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Version = "12.0",
    ///         AdministratorLogin = "missadministrator",
    ///         AdministratorLoginPassword = "AdminPassword123!",
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
    ///     var exampleServerMicrosoftSupportAuditingPolicy = new Azure.MSSql.ServerMicrosoftSupportAuditingPolicy("exampleServerMicrosoftSupportAuditingPolicy", new()
    ///     {
    ///         ServerId = exampleServer.Id,
    ///         BlobStorageEndpoint = exampleAccount.PrimaryBlobEndpoint,
    ///         StorageAccountAccessKey = exampleAccount.PrimaryAccessKey,
    ///     });
    /// 
    /// });
    /// ```
    /// ### With Storage Account Behind VNet And Firewall
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = Azure.Core.GetSubscription.Invoke();
    /// 
    ///     var exampleClientConfig = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new()
    ///     {
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("exampleSubnet", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.2.0/24",
    ///         },
    ///         ServiceEndpoints = new[]
    ///         {
    ///             "Microsoft.Sql",
    ///             "Microsoft.Storage",
    ///         },
    ///         EnforcePrivateLinkEndpointNetworkPolicies = true,
    ///     });
    /// 
    ///     var exampleServer = new Azure.MSSql.Server("exampleServer", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Version = "12.0",
    ///         AdministratorLogin = "missadministrator",
    ///         AdministratorLoginPassword = "AdminPassword123!",
    ///         MinimumTlsVersion = "1.2",
    ///         Identity = new Azure.MSSql.Inputs.ServerIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleAssignment = new Azure.Authorization.Assignment("exampleAssignment", new()
    ///     {
    ///         Scope = primary.Apply(getSubscriptionResult =&gt; getSubscriptionResult.Id),
    ///         RoleDefinitionName = "Storage Blob Data Contributor",
    ///         PrincipalId = exampleServer.Identity.Apply(identity =&gt; identity?.PrincipalId),
    ///     });
    /// 
    ///     var sqlvnetrule = new Azure.Sql.VirtualNetworkRule("sqlvnetrule", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         ServerName = exampleServer.Name,
    ///         SubnetId = exampleSubnet.Id,
    ///     });
    /// 
    ///     var exampleFirewallRule = new Azure.Sql.FirewallRule("exampleFirewallRule", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         ServerName = exampleServer.Name,
    ///         StartIpAddress = "0.0.0.0",
    ///         EndIpAddress = "0.0.0.0",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("exampleAccount", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///         AccountKind = "StorageV2",
    ///         AllowNestedItemsToBePublic = false,
    ///         NetworkRules = new Azure.Storage.Inputs.AccountNetworkRulesArgs
    ///         {
    ///             DefaultAction = "Deny",
    ///             IpRules = new[]
    ///             {
    ///                 "127.0.0.1",
    ///             },
    ///             VirtualNetworkSubnetIds = new[]
    ///             {
    ///                 exampleSubnet.Id,
    ///             },
    ///             Bypasses = new[]
    ///             {
    ///                 "AzureServices",
    ///             },
    ///         },
    ///         Identity = new Azure.Storage.Inputs.AccountIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleServerMicrosoftSupportAuditingPolicy = new Azure.MSSql.ServerMicrosoftSupportAuditingPolicy("exampleServerMicrosoftSupportAuditingPolicy", new()
    ///     {
    ///         BlobStorageEndpoint = exampleAccount.PrimaryBlobEndpoint,
    ///         ServerId = exampleServer.Id,
    ///         LogMonitoringEnabled = false,
    ///         StorageAccountSubscriptionId = azurerm_subscription.Primary.Subscription_id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             exampleAssignment,
    ///             exampleAccount,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// MS SQL Server Microsoft Support Auditing Policies can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:mssql/serverMicrosoftSupportAuditingPolicy:ServerMicrosoftSupportAuditingPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/sqlServer1/devOpsAuditingSettings/default
    /// ```
    /// </summary>
    [AzureResourceType("azure:mssql/serverMicrosoftSupportAuditingPolicy:ServerMicrosoftSupportAuditingPolicy")]
    public partial class ServerMicrosoftSupportAuditingPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Microsoft support auditing logs.
        /// </summary>
        [Output("blobStorageEndpoint")]
        public Output<string?> BlobStorageEndpoint { get; private set; } = null!;

        /// <summary>
        /// Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its main database audit events to Azure Monitor. Defaults to `true`.
        /// </summary>
        [Output("logMonitoringEnabled")]
        public Output<bool?> LogMonitoringEnabled { get; private set; } = null!;

        /// <summary>
        /// The ID of the SQL Server to set the extended auditing policy. Changing this forces a new resource to be created.
        /// </summary>
        [Output("serverId")]
        public Output<string> ServerId { get; private set; } = null!;

        /// <summary>
        /// The access key to use for the auditing storage account.
        /// </summary>
        [Output("storageAccountAccessKey")]
        public Output<string?> StorageAccountAccessKey { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subscription containing the Storage Account.
        /// </summary>
        [Output("storageAccountSubscriptionId")]
        public Output<string?> StorageAccountSubscriptionId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerMicrosoftSupportAuditingPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerMicrosoftSupportAuditingPolicy(string name, ServerMicrosoftSupportAuditingPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:mssql/serverMicrosoftSupportAuditingPolicy:ServerMicrosoftSupportAuditingPolicy", name, args ?? new ServerMicrosoftSupportAuditingPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerMicrosoftSupportAuditingPolicy(string name, Input<string> id, ServerMicrosoftSupportAuditingPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:mssql/serverMicrosoftSupportAuditingPolicy:ServerMicrosoftSupportAuditingPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "storageAccountAccessKey",
                    "storageAccountSubscriptionId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServerMicrosoftSupportAuditingPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerMicrosoftSupportAuditingPolicy Get(string name, Input<string> id, ServerMicrosoftSupportAuditingPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerMicrosoftSupportAuditingPolicy(name, id, state, options);
        }
    }

    public sealed class ServerMicrosoftSupportAuditingPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Microsoft support auditing logs.
        /// </summary>
        [Input("blobStorageEndpoint")]
        public Input<string>? BlobStorageEndpoint { get; set; }

        /// <summary>
        /// Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its main database audit events to Azure Monitor. Defaults to `true`.
        /// </summary>
        [Input("logMonitoringEnabled")]
        public Input<bool>? LogMonitoringEnabled { get; set; }

        /// <summary>
        /// The ID of the SQL Server to set the extended auditing policy. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<string> ServerId { get; set; } = null!;

        [Input("storageAccountAccessKey")]
        private Input<string>? _storageAccountAccessKey;

        /// <summary>
        /// The access key to use for the auditing storage account.
        /// </summary>
        public Input<string>? StorageAccountAccessKey
        {
            get => _storageAccountAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _storageAccountAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("storageAccountSubscriptionId")]
        private Input<string>? _storageAccountSubscriptionId;

        /// <summary>
        /// The ID of the Subscription containing the Storage Account.
        /// </summary>
        public Input<string>? StorageAccountSubscriptionId
        {
            get => _storageAccountSubscriptionId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _storageAccountSubscriptionId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ServerMicrosoftSupportAuditingPolicyArgs()
        {
        }
        public static new ServerMicrosoftSupportAuditingPolicyArgs Empty => new ServerMicrosoftSupportAuditingPolicyArgs();
    }

    public sealed class ServerMicrosoftSupportAuditingPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Microsoft support auditing logs.
        /// </summary>
        [Input("blobStorageEndpoint")]
        public Input<string>? BlobStorageEndpoint { get; set; }

        /// <summary>
        /// Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Enable audit events to Azure Monitor? To enable server audit events to Azure Monitor, please enable its main database audit events to Azure Monitor. Defaults to `true`.
        /// </summary>
        [Input("logMonitoringEnabled")]
        public Input<bool>? LogMonitoringEnabled { get; set; }

        /// <summary>
        /// The ID of the SQL Server to set the extended auditing policy. Changing this forces a new resource to be created.
        /// </summary>
        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        [Input("storageAccountAccessKey")]
        private Input<string>? _storageAccountAccessKey;

        /// <summary>
        /// The access key to use for the auditing storage account.
        /// </summary>
        public Input<string>? StorageAccountAccessKey
        {
            get => _storageAccountAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _storageAccountAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("storageAccountSubscriptionId")]
        private Input<string>? _storageAccountSubscriptionId;

        /// <summary>
        /// The ID of the Subscription containing the Storage Account.
        /// </summary>
        public Input<string>? StorageAccountSubscriptionId
        {
            get => _storageAccountSubscriptionId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _storageAccountSubscriptionId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ServerMicrosoftSupportAuditingPolicyState()
        {
        }
        public static new ServerMicrosoftSupportAuditingPolicyState Empty => new ServerMicrosoftSupportAuditingPolicyState();
    }
}