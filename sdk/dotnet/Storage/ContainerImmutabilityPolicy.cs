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
    /// Manages an Immutability Policy for a Container within an Azure Storage Account.
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
    ///         Name = "examplestoraccount",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///         Tags = 
    ///         {
    ///             { "environment", "staging" },
    ///         },
    ///     });
    /// 
    ///     var exampleContainer = new Azure.Storage.Container("example", new()
    ///     {
    ///         Name = "example",
    ///         StorageAccountName = exampleAccount.Name,
    ///         ContainerAccessType = "private",
    ///     });
    /// 
    ///     var exampleContainerImmutabilityPolicy = new Azure.Storage.ContainerImmutabilityPolicy("example", new()
    ///     {
    ///         StorageContainerResourceManagerId = exampleContainer.ResourceManagerId,
    ///         ImmutabilityPeriodInDays = 14,
    ///         ProtectedAppendWritesAllEnabled = false,
    ///         ProtectedAppendWritesEnabled = true,
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
    /// Storage Container Immutability Policies can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:storage/containerImmutabilityPolicy:ContainerImmutabilityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Storage/storageAccounts/myaccount/blobServices/default/containers/mycontainer/immutabilityPolicies/default
    /// ```
    /// </summary>
    [AzureResourceType("azure:storage/containerImmutabilityPolicy:ContainerImmutabilityPolicy")]
    public partial class ContainerImmutabilityPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time interval in days that the data needs to be kept in a non-erasable and non-modifiable state.
        /// </summary>
        [Output("immutabilityPeriodInDays")]
        public Output<int> ImmutabilityPeriodInDays { get; private set; } = null!;

        /// <summary>
        /// Whether to lock this immutability policy. Cannot be set to `false` once the policy has been locked.
        /// 
        /// !&gt; **Note:** Once an Immutability Policy has been locked, it cannot be unlocked. After locking, it will only be possible to increase the value for `retention_period_in_days` up to 5 times for the lifetime of the policy. No other properties will be updateable. Furthermore, the Storage Container and the Storage Account in which it resides will become protected by the policy. It will no longer be possible to delete the Storage Container or the Storage Account. Please refer to [official documentation](https://learn.microsoft.com/en-us/azure/storage/blobs/immutable-policy-configure-container-scope?tabs=azure-portal#lock-a-time-based-retention-policy) for more information.
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// Whether to allow protected append writes to block and append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_enabled`.
        /// </summary>
        [Output("protectedAppendWritesAllEnabled")]
        public Output<bool?> ProtectedAppendWritesAllEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether to allow protected append writes to append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_all_enabled`.
        /// </summary>
        [Output("protectedAppendWritesEnabled")]
        public Output<bool?> ProtectedAppendWritesEnabled { get; private set; } = null!;

        /// <summary>
        /// The Resource Manager ID of the Storage Container where this Immutability Policy should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Output("storageContainerResourceManagerId")]
        public Output<string> StorageContainerResourceManagerId { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerImmutabilityPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerImmutabilityPolicy(string name, ContainerImmutabilityPolicyArgs args, CustomResourceOptions? options = null)
            : base("azure:storage/containerImmutabilityPolicy:ContainerImmutabilityPolicy", name, args ?? new ContainerImmutabilityPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerImmutabilityPolicy(string name, Input<string> id, ContainerImmutabilityPolicyState? state = null, CustomResourceOptions? options = null)
            : base("azure:storage/containerImmutabilityPolicy:ContainerImmutabilityPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ContainerImmutabilityPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerImmutabilityPolicy Get(string name, Input<string> id, ContainerImmutabilityPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerImmutabilityPolicy(name, id, state, options);
        }
    }

    public sealed class ContainerImmutabilityPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time interval in days that the data needs to be kept in a non-erasable and non-modifiable state.
        /// </summary>
        [Input("immutabilityPeriodInDays", required: true)]
        public Input<int> ImmutabilityPeriodInDays { get; set; } = null!;

        /// <summary>
        /// Whether to lock this immutability policy. Cannot be set to `false` once the policy has been locked.
        /// 
        /// !&gt; **Note:** Once an Immutability Policy has been locked, it cannot be unlocked. After locking, it will only be possible to increase the value for `retention_period_in_days` up to 5 times for the lifetime of the policy. No other properties will be updateable. Furthermore, the Storage Container and the Storage Account in which it resides will become protected by the policy. It will no longer be possible to delete the Storage Container or the Storage Account. Please refer to [official documentation](https://learn.microsoft.com/en-us/azure/storage/blobs/immutable-policy-configure-container-scope?tabs=azure-portal#lock-a-time-based-retention-policy) for more information.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Whether to allow protected append writes to block and append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_enabled`.
        /// </summary>
        [Input("protectedAppendWritesAllEnabled")]
        public Input<bool>? ProtectedAppendWritesAllEnabled { get; set; }

        /// <summary>
        /// Whether to allow protected append writes to append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_all_enabled`.
        /// </summary>
        [Input("protectedAppendWritesEnabled")]
        public Input<bool>? ProtectedAppendWritesEnabled { get; set; }

        /// <summary>
        /// The Resource Manager ID of the Storage Container where this Immutability Policy should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageContainerResourceManagerId", required: true)]
        public Input<string> StorageContainerResourceManagerId { get; set; } = null!;

        public ContainerImmutabilityPolicyArgs()
        {
        }
        public static new ContainerImmutabilityPolicyArgs Empty => new ContainerImmutabilityPolicyArgs();
    }

    public sealed class ContainerImmutabilityPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time interval in days that the data needs to be kept in a non-erasable and non-modifiable state.
        /// </summary>
        [Input("immutabilityPeriodInDays")]
        public Input<int>? ImmutabilityPeriodInDays { get; set; }

        /// <summary>
        /// Whether to lock this immutability policy. Cannot be set to `false` once the policy has been locked.
        /// 
        /// !&gt; **Note:** Once an Immutability Policy has been locked, it cannot be unlocked. After locking, it will only be possible to increase the value for `retention_period_in_days` up to 5 times for the lifetime of the policy. No other properties will be updateable. Furthermore, the Storage Container and the Storage Account in which it resides will become protected by the policy. It will no longer be possible to delete the Storage Container or the Storage Account. Please refer to [official documentation](https://learn.microsoft.com/en-us/azure/storage/blobs/immutable-policy-configure-container-scope?tabs=azure-portal#lock-a-time-based-retention-policy) for more information.
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Whether to allow protected append writes to block and append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_enabled`.
        /// </summary>
        [Input("protectedAppendWritesAllEnabled")]
        public Input<bool>? ProtectedAppendWritesAllEnabled { get; set; }

        /// <summary>
        /// Whether to allow protected append writes to append blobs to the container. Defaults to `false`. Cannot be set with `protected_append_writes_all_enabled`.
        /// </summary>
        [Input("protectedAppendWritesEnabled")]
        public Input<bool>? ProtectedAppendWritesEnabled { get; set; }

        /// <summary>
        /// The Resource Manager ID of the Storage Container where this Immutability Policy should be applied. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageContainerResourceManagerId")]
        public Input<string>? StorageContainerResourceManagerId { get; set; }

        public ContainerImmutabilityPolicyState()
        {
        }
        public static new ContainerImmutabilityPolicyState Empty => new ContainerImmutabilityPolicyState();
    }
}
