// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Synapse
{
    /// <summary>
    /// Manages a Security Alert Policy for a Synapse SQL Pool.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///             AccountKind = "StorageV2",
    ///             IsHnsEnabled = true,
    ///         });
    ///         var exampleDataLakeGen2Filesystem = new Azure.Storage.DataLakeGen2Filesystem("exampleDataLakeGen2Filesystem", new Azure.Storage.DataLakeGen2FilesystemArgs
    ///         {
    ///             StorageAccountId = exampleAccount.Id,
    ///         });
    ///         var exampleWorkspace = new Azure.Synapse.Workspace("exampleWorkspace", new Azure.Synapse.WorkspaceArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             StorageDataLakeGen2FilesystemId = exampleDataLakeGen2Filesystem.Id,
    ///             SqlAdministratorLogin = "sqladminuser",
    ///             SqlAdministratorLoginPassword = "H@Sh1CoR3!",
    ///             AadAdmin = new Azure.Synapse.Inputs.WorkspaceAadAdminArgs
    ///             {
    ///                 Login = "AzureAD Admin",
    ///                 ObjectId = "00000000-0000-0000-0000-000000000000",
    ///                 TenantId = "00000000-0000-0000-0000-000000000000",
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "Env", "production" },
    ///             },
    ///         });
    ///         var exampleSqlPool = new Azure.Synapse.SqlPool("exampleSqlPool", new Azure.Synapse.SqlPoolArgs
    ///         {
    ///             SynapseWorkspaceId = exampleWorkspace.Id,
    ///             SkuName = "DW100c",
    ///             CreateMode = "Default",
    ///         });
    ///         var auditLogs = new Azure.Storage.Account("auditLogs", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///         });
    ///         var exampleSqlPoolSecurityAlertPolicy = new Azure.Synapse.SqlPoolSecurityAlertPolicy("exampleSqlPoolSecurityAlertPolicy", new Azure.Synapse.SqlPoolSecurityAlertPolicyArgs
    ///         {
    ///             SqlPoolId = exampleSqlPool.Id,
    ///             PolicyState = "Enabled",
    ///             StorageEndpoint = auditLogs.PrimaryBlobEndpoint,
    ///             StorageAccountAccessKey = auditLogs.PrimaryAccessKey,
    ///             DisabledAlerts = 
    ///             {
    ///                 "Sql_Injection",
    ///                 "Data_Exfiltration",
    ///             },
    ///             RetentionDays = 20,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Synapse SQL Pool Security Alert Policies can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/sqlPools/sqlPool1/securityAlertPolicies/default
    /// ```
    /// </summary>
    [AzureResourceType("azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy")]
    public partial class SqlPoolSecurityAlertPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
        /// </summary>
        [Output("disabledAlerts")]
        public Output<ImmutableArray<string>> DisabledAlerts { get; private set; } = null!;

        /// <summary>
        /// Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
        /// </summary>
        [Output("emailAccountAdminsEnabled")]
        public Output<bool?> EmailAccountAdminsEnabled { get; private set; } = null!;

        /// <summary>
        /// Specifies an array of e-mail addresses to which the alert is sent.
        /// </summary>
        [Output("emailAddresses")]
        public Output<ImmutableArray<string>> EmailAddresses { get; private set; } = null!;

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Allowed values are: `Disabled`, `Enabled`.
        /// </summary>
        [Output("policyState")]
        public Output<string> PolicyState { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sqlPoolId")]
        public Output<string> SqlPoolId { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
        /// </summary>
        [Output("storageAccountAccessKey")]
        public Output<string?> StorageAccountAccessKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Output("storageEndpoint")]
        public Output<string?> StorageEndpoint { get; private set; } = null!;


        /// <summary>
        /// Create a SqlPoolSecurityAlertPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlPoolSecurityAlertPolicy(string name, SqlPoolSecurityAlertPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy", name, args ?? new SqlPoolSecurityAlertPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlPoolSecurityAlertPolicy(string name, Input<string> id, SqlPoolSecurityAlertPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlPoolSecurityAlertPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlPoolSecurityAlertPolicy Get(string name, Input<string> id, SqlPoolSecurityAlertPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlPoolSecurityAlertPolicy(name, id, state, options);
        }
    }

    public sealed class SqlPoolSecurityAlertPolicyArgs : Pulumi.ResourceArgs
    {
        [Input("disabledAlerts")]
        private InputList<string>? _disabledAlerts;

        /// <summary>
        /// Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
        /// </summary>
        public InputList<string> DisabledAlerts
        {
            get => _disabledAlerts ?? (_disabledAlerts = new InputList<string>());
            set => _disabledAlerts = value;
        }

        /// <summary>
        /// Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
        /// </summary>
        [Input("emailAccountAdminsEnabled")]
        public Input<bool>? EmailAccountAdminsEnabled { get; set; }

        [Input("emailAddresses")]
        private InputList<string>? _emailAddresses;

        /// <summary>
        /// Specifies an array of e-mail addresses to which the alert is sent.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Allowed values are: `Disabled`, `Enabled`.
        /// </summary>
        [Input("policyState", required: true)]
        public Input<string> PolicyState { get; set; } = null!;

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sqlPoolId", required: true)]
        public Input<string> SqlPoolId { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
        /// </summary>
        [Input("storageAccountAccessKey")]
        public Input<string>? StorageAccountAccessKey { get; set; }

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Input("storageEndpoint")]
        public Input<string>? StorageEndpoint { get; set; }

        public SqlPoolSecurityAlertPolicyArgs()
        {
        }
    }

    public sealed class SqlPoolSecurityAlertPolicyState : Pulumi.ResourceArgs
    {
        [Input("disabledAlerts")]
        private InputList<string>? _disabledAlerts;

        /// <summary>
        /// Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
        /// </summary>
        public InputList<string> DisabledAlerts
        {
            get => _disabledAlerts ?? (_disabledAlerts = new InputList<string>());
            set => _disabledAlerts = value;
        }

        /// <summary>
        /// Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
        /// </summary>
        [Input("emailAccountAdminsEnabled")]
        public Input<bool>? EmailAccountAdminsEnabled { get; set; }

        [Input("emailAddresses")]
        private InputList<string>? _emailAddresses;

        /// <summary>
        /// Specifies an array of e-mail addresses to which the alert is sent.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Allowed values are: `Disabled`, `Enabled`.
        /// </summary>
        [Input("policyState")]
        public Input<string>? PolicyState { get; set; }

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        /// <summary>
        /// Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sqlPoolId")]
        public Input<string>? SqlPoolId { get; set; }

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
        /// </summary>
        [Input("storageAccountAccessKey")]
        public Input<string>? StorageAccountAccessKey { get; set; }

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Input("storageEndpoint")]
        public Input<string>? StorageEndpoint { get; set; }

        public SqlPoolSecurityAlertPolicyState()
        {
        }
    }
}