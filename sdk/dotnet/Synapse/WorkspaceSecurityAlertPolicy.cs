// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Synapse
{
    /// <summary>
    /// Manages a Security Alert Policy for a Synapse Workspace.
    /// 
    /// ## Import
    /// 
    /// Synapse Workspace Security Alert Policies can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:synapse/workspaceSecurityAlertPolicy:WorkspaceSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/securityAlertPolicies/Default
    /// ```
    /// </summary>
    [AzureResourceType("azure:synapse/workspaceSecurityAlertPolicy:WorkspaceSecurityAlertPolicy")]
    public partial class WorkspaceSecurityAlertPolicy : global::Pulumi.CustomResource
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
        /// Specifies an array of email addresses to which the alert is sent.
        /// </summary>
        [Output("emailAddresses")]
        public Output<ImmutableArray<string>> EmailAddresses { get; private set; } = null!;

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific workspace. Possible values are `Disabled`, `Enabled` and `New`.
        /// </summary>
        [Output("policyState")]
        public Output<string> PolicyState { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Output("retentionDays")]
        public Output<int?> RetentionDays { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
        /// </summary>
        [Output("storageAccountAccessKey")]
        public Output<string?> StorageAccountAccessKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Output("storageEndpoint")]
        public Output<string?> StorageEndpoint { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Synapse Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Output("synapseWorkspaceId")]
        public Output<string> SynapseWorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkspaceSecurityAlertPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkspaceSecurityAlertPolicy(string name, WorkspaceSecurityAlertPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:synapse/workspaceSecurityAlertPolicy:WorkspaceSecurityAlertPolicy", name, args ?? new WorkspaceSecurityAlertPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkspaceSecurityAlertPolicy(string name, Input<string> id, WorkspaceSecurityAlertPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:synapse/workspaceSecurityAlertPolicy:WorkspaceSecurityAlertPolicy", name, state, MakeResourceOptions(options, id))
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
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkspaceSecurityAlertPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkspaceSecurityAlertPolicy Get(string name, Input<string> id, WorkspaceSecurityAlertPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkspaceSecurityAlertPolicy(name, id, state, options);
        }
    }

    public sealed class WorkspaceSecurityAlertPolicyArgs : global::Pulumi.ResourceArgs
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
        /// Specifies an array of email addresses to which the alert is sent.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific workspace. Possible values are `Disabled`, `Enabled` and `New`.
        /// </summary>
        [Input("policyState", required: true)]
        public Input<string> PolicyState { get; set; } = null!;

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        [Input("storageAccountAccessKey")]
        private Input<string>? _storageAccountAccessKey;

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
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

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Input("storageEndpoint")]
        public Input<string>? StorageEndpoint { get; set; }

        /// <summary>
        /// Specifies the ID of the Synapse Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("synapseWorkspaceId", required: true)]
        public Input<string> SynapseWorkspaceId { get; set; } = null!;

        public WorkspaceSecurityAlertPolicyArgs()
        {
        }
        public static new WorkspaceSecurityAlertPolicyArgs Empty => new WorkspaceSecurityAlertPolicyArgs();
    }

    public sealed class WorkspaceSecurityAlertPolicyState : global::Pulumi.ResourceArgs
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
        /// Specifies an array of email addresses to which the alert is sent.
        /// </summary>
        public InputList<string> EmailAddresses
        {
            get => _emailAddresses ?? (_emailAddresses = new InputList<string>());
            set => _emailAddresses = value;
        }

        /// <summary>
        /// Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific workspace. Possible values are `Disabled`, `Enabled` and `New`.
        /// </summary>
        [Input("policyState")]
        public Input<string>? PolicyState { get; set; }

        /// <summary>
        /// Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
        /// </summary>
        [Input("retentionDays")]
        public Input<int>? RetentionDays { get; set; }

        [Input("storageAccountAccessKey")]
        private Input<string>? _storageAccountAccessKey;

        /// <summary>
        /// Specifies the identifier key of the Threat Detection audit storage account.
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

        /// <summary>
        /// Specifies the blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all Threat Detection audit logs.
        /// </summary>
        [Input("storageEndpoint")]
        public Input<string>? StorageEndpoint { get; set; }

        /// <summary>
        /// Specifies the ID of the Synapse Workspace. Changing this forces a new resource to be created.
        /// </summary>
        [Input("synapseWorkspaceId")]
        public Input<string>? SynapseWorkspaceId { get; set; }

        public WorkspaceSecurityAlertPolicyState()
        {
        }
        public static new WorkspaceSecurityAlertPolicyState Empty => new WorkspaceSecurityAlertPolicyState();
    }
}
