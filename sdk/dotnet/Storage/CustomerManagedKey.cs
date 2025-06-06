// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage
{
    /// <summary>
    /// Manages a Customer Managed Key for a Storage Account.
    /// 
    /// &gt; **Note:** It's possible to define a Customer Managed Key both within the `azure.storage.Account` resource via the `customer_managed_key` block and by using the `azure.storage.CustomerManagedKey` resource. However it's not possible to use both methods to manage a Customer Managed Key for a Storage Account, since there'll be conflicts.
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
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var example = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleKeyVault = new Azure.KeyVault.KeyVault("example", new()
    ///     {
    ///         Name = "examplekv",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         SkuName = "standard",
    ///         PurgeProtectionEnabled = true,
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplestor",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "GRS",
    ///         Identity = new Azure.Storage.Inputs.AccountIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var storage = new Azure.KeyVault.AccessPolicy("storage", new()
    ///     {
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         ObjectId = exampleAccount.Identity.Apply(identity =&gt; identity?.PrincipalId),
    ///         SecretPermissions = new[]
    ///         {
    ///             "Get",
    ///         },
    ///         KeyPermissions = new[]
    ///         {
    ///             "Get",
    ///             "UnwrapKey",
    ///             "WrapKey",
    ///         },
    ///     });
    /// 
    ///     var client = new Azure.KeyVault.AccessPolicy("client", new()
    ///     {
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         ObjectId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.ObjectId),
    ///         SecretPermissions = new[]
    ///         {
    ///             "Get",
    ///         },
    ///         KeyPermissions = new[]
    ///         {
    ///             "Get",
    ///             "Create",
    ///             "Delete",
    ///             "List",
    ///             "Restore",
    ///             "Recover",
    ///             "UnwrapKey",
    ///             "WrapKey",
    ///             "Purge",
    ///             "Encrypt",
    ///             "Decrypt",
    ///             "Sign",
    ///             "Verify",
    ///             "GetRotationPolicy",
    ///             "SetRotationPolicy",
    ///         },
    ///     });
    /// 
    ///     var exampleKey = new Azure.KeyVault.Key("example", new()
    ///     {
    ///         Name = "tfex-key",
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         KeyType = "RSA",
    ///         KeySize = 2048,
    ///         KeyOpts = new[]
    ///         {
    ///             "decrypt",
    ///             "encrypt",
    ///             "sign",
    ///             "unwrapKey",
    ///             "verify",
    ///             "wrapKey",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             client,
    ///             storage,
    ///         },
    ///     });
    /// 
    ///     var exampleCustomerManagedKey = new Azure.Storage.CustomerManagedKey("example", new()
    ///     {
    ///         StorageAccountId = exampleAccount.Id,
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         KeyName = exampleKey.Name,
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
    /// * `Microsoft.Storage`: 2023-05-01
    /// 
    /// ## Import
    /// 
    /// Customer Managed Keys for a Storage Account can be imported using the `resource id` of the Storage Account, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:storage/customerManagedKey:CustomerManagedKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount
    /// ```
    /// </summary>
    [AzureResourceType("azure:storage/customerManagedKey:CustomerManagedKey")]
    public partial class CustomerManagedKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Client ID of the multi-tenant application to be used in conjunction with the user-assigned identity for cross-tenant customer-managed-keys server-side encryption on the storage account.
        /// </summary>
        [Output("federatedIdentityClientId")]
        public Output<string?> FederatedIdentityClientId { get; private set; } = null!;

        /// <summary>
        /// The name of Key Vault Key.
        /// </summary>
        [Output("keyName")]
        public Output<string> KeyName { get; private set; } = null!;

        [Output("keyVaultId")]
        public Output<string?> KeyVaultId { get; private set; } = null!;

        /// <summary>
        /// URI pointing at the Key Vault. Required when using `federated_identity_client_id`. Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Output("keyVaultUri")]
        public Output<string> KeyVaultUri { get; private set; } = null!;

        /// <summary>
        /// The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
        /// </summary>
        [Output("keyVersion")]
        public Output<string?> KeyVersion { get; private set; } = null!;

        /// <summary>
        /// Key ID of a key in a managed HSM.  Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Output("managedHsmKeyId")]
        public Output<string?> ManagedHsmKeyId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("storageAccountId")]
        public Output<string> StorageAccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of a user assigned identity.
        /// </summary>
        [Output("userAssignedIdentityId")]
        public Output<string?> UserAssignedIdentityId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomerManagedKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomerManagedKey(string name, CustomerManagedKeyArgs args, CustomResourceOptions? options = null)
            : base("azure:storage/customerManagedKey:CustomerManagedKey", name, args ?? new CustomerManagedKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomerManagedKey(string name, Input<string> id, CustomerManagedKeyState? state = null, CustomResourceOptions? options = null)
            : base("azure:storage/customerManagedKey:CustomerManagedKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomerManagedKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomerManagedKey Get(string name, Input<string> id, CustomerManagedKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomerManagedKey(name, id, state, options);
        }
    }

    public sealed class CustomerManagedKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Client ID of the multi-tenant application to be used in conjunction with the user-assigned identity for cross-tenant customer-managed-keys server-side encryption on the storage account.
        /// </summary>
        [Input("federatedIdentityClientId")]
        public Input<string>? FederatedIdentityClientId { get; set; }

        /// <summary>
        /// The name of Key Vault Key.
        /// </summary>
        [Input("keyName", required: true)]
        public Input<string> KeyName { get; set; } = null!;

        [Input("keyVaultId")]
        public Input<string>? KeyVaultId { get; set; }

        /// <summary>
        /// URI pointing at the Key Vault. Required when using `federated_identity_client_id`. Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Input("keyVaultUri")]
        public Input<string>? KeyVaultUri { get; set; }

        /// <summary>
        /// The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
        /// </summary>
        [Input("keyVersion")]
        public Input<string>? KeyVersion { get; set; }

        /// <summary>
        /// Key ID of a key in a managed HSM.  Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Input("managedHsmKeyId")]
        public Input<string>? ManagedHsmKeyId { get; set; }

        /// <summary>
        /// The ID of the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageAccountId", required: true)]
        public Input<string> StorageAccountId { get; set; } = null!;

        /// <summary>
        /// The ID of a user assigned identity.
        /// </summary>
        [Input("userAssignedIdentityId")]
        public Input<string>? UserAssignedIdentityId { get; set; }

        public CustomerManagedKeyArgs()
        {
        }
        public static new CustomerManagedKeyArgs Empty => new CustomerManagedKeyArgs();
    }

    public sealed class CustomerManagedKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Client ID of the multi-tenant application to be used in conjunction with the user-assigned identity for cross-tenant customer-managed-keys server-side encryption on the storage account.
        /// </summary>
        [Input("federatedIdentityClientId")]
        public Input<string>? FederatedIdentityClientId { get; set; }

        /// <summary>
        /// The name of Key Vault Key.
        /// </summary>
        [Input("keyName")]
        public Input<string>? KeyName { get; set; }

        [Input("keyVaultId")]
        public Input<string>? KeyVaultId { get; set; }

        /// <summary>
        /// URI pointing at the Key Vault. Required when using `federated_identity_client_id`. Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Input("keyVaultUri")]
        public Input<string>? KeyVaultUri { get; set; }

        /// <summary>
        /// The version of Key Vault Key. Remove or omit this argument to enable Automatic Key Rotation.
        /// </summary>
        [Input("keyVersion")]
        public Input<string>? KeyVersion { get; set; }

        /// <summary>
        /// Key ID of a key in a managed HSM.  Exactly one of `managed_hsm_key_id`, `key_vault_id`, or `key_vault_uri` must be specified.
        /// </summary>
        [Input("managedHsmKeyId")]
        public Input<string>? ManagedHsmKeyId { get; set; }

        /// <summary>
        /// The ID of the Storage Account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageAccountId")]
        public Input<string>? StorageAccountId { get; set; }

        /// <summary>
        /// The ID of a user assigned identity.
        /// </summary>
        [Input("userAssignedIdentityId")]
        public Input<string>? UserAssignedIdentityId { get; set; }

        public CustomerManagedKeyState()
        {
        }
        public static new CustomerManagedKeyState Empty => new CustomerManagedKeyState();
    }
}
