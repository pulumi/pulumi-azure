// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp
{
    /// <summary>
    /// Manages a Container App Environment Storage.
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
    ///     var exampleAnalyticsWorkspace = new Azure.OperationalInsights.AnalyticsWorkspace("example", new()
    ///     {
    ///         Name = "acctest-01",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         Sku = "PerGB2018",
    ///         RetentionInDays = 30,
    ///     });
    /// 
    ///     var exampleEnvironment = new Azure.ContainerApp.Environment("example", new()
    ///     {
    ///         Name = "myEnvironment",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///         LogAnalyticsWorkspaceId = exampleAnalyticsWorkspace.Id,
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "azureteststorage",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleShare = new Azure.Storage.Share("example", new()
    ///     {
    ///         Name = "sharename",
    ///         StorageAccountName = exampleAccount.Name,
    ///         Quota = 5,
    ///     });
    /// 
    ///     var exampleEnvironmentStorage = new Azure.ContainerApp.EnvironmentStorage("example", new()
    ///     {
    ///         Name = "mycontainerappstorage",
    ///         ContainerAppEnvironmentId = exampleEnvironment.Id,
    ///         AccountName = exampleAccount.Name,
    ///         ShareName = exampleShare.Name,
    ///         AccessKey = exampleAccount.PrimaryAccessKey,
    ///         AccessMode = "ReadOnly",
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
    /// * `Microsoft.App`: 2025-01-01
    /// 
    /// ## Import
    /// 
    /// A Container App Environment Storage can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:containerapp/environmentStorage:EnvironmentStorage example "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.App/managedEnvironments/myEnvironment/storages/mystorage"
    /// ```
    /// </summary>
    [AzureResourceType("azure:containerapp/environmentStorage:EnvironmentStorage")]
    public partial class EnvironmentStorage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Storage Account Access Key.
        /// </summary>
        [Output("accessKey")]
        public Output<string?> AccessKey { get; private set; } = null!;

        /// <summary>
        /// The access mode to connect this storage to the Container App. Possible values include `ReadOnly` and `ReadWrite`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("accessMode")]
        public Output<string> AccessMode { get; private set; } = null!;

        /// <summary>
        /// The Azure Storage Account in which the Share to be used is located. Changing this forces a new resource to be created.
        /// </summary>
        [Output("accountName")]
        public Output<string?> AccountName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Container App Environment to which this storage belongs. Changing this forces a new resource to be created.
        /// </summary>
        [Output("containerAppEnvironmentId")]
        public Output<string> ContainerAppEnvironmentId { get; private set; } = null!;

        /// <summary>
        /// The name for this Container App Environment Storage. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The NFS server to use for the Azure File Share, the format will be `yourstorageaccountname.file.core.windows.net`. Changing this forces a new resource to be created.
        /// *
        /// </summary>
        [Output("nfsServerUrl")]
        public Output<string?> NfsServerUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the Azure Storage Share to use. Changing this forces a new resource to be created.
        /// </summary>
        [Output("shareName")]
        public Output<string> ShareName { get; private set; } = null!;


        /// <summary>
        /// Create a EnvironmentStorage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvironmentStorage(string name, EnvironmentStorageArgs args, CustomResourceOptions? options = null)
            : base("azure:containerapp/environmentStorage:EnvironmentStorage", name, args ?? new EnvironmentStorageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvironmentStorage(string name, Input<string> id, EnvironmentStorageState? state = null, CustomResourceOptions? options = null)
            : base("azure:containerapp/environmentStorage:EnvironmentStorage", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accessKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EnvironmentStorage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvironmentStorage Get(string name, Input<string> id, EnvironmentStorageState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvironmentStorage(name, id, state, options);
        }
    }

    public sealed class EnvironmentStorageArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        private Input<string>? _accessKey;

        /// <summary>
        /// The Storage Account Access Key.
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The access mode to connect this storage to the Container App. Possible values include `ReadOnly` and `ReadWrite`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accessMode", required: true)]
        public Input<string> AccessMode { get; set; } = null!;

        /// <summary>
        /// The Azure Storage Account in which the Share to be used is located. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// The ID of the Container App Environment to which this storage belongs. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerAppEnvironmentId", required: true)]
        public Input<string> ContainerAppEnvironmentId { get; set; } = null!;

        /// <summary>
        /// The name for this Container App Environment Storage. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NFS server to use for the Azure File Share, the format will be `yourstorageaccountname.file.core.windows.net`. Changing this forces a new resource to be created.
        /// *
        /// </summary>
        [Input("nfsServerUrl")]
        public Input<string>? NfsServerUrl { get; set; }

        /// <summary>
        /// The name of the Azure Storage Share to use. Changing this forces a new resource to be created.
        /// </summary>
        [Input("shareName", required: true)]
        public Input<string> ShareName { get; set; } = null!;

        public EnvironmentStorageArgs()
        {
        }
        public static new EnvironmentStorageArgs Empty => new EnvironmentStorageArgs();
    }

    public sealed class EnvironmentStorageState : global::Pulumi.ResourceArgs
    {
        [Input("accessKey")]
        private Input<string>? _accessKey;

        /// <summary>
        /// The Storage Account Access Key.
        /// </summary>
        public Input<string>? AccessKey
        {
            get => _accessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The access mode to connect this storage to the Container App. Possible values include `ReadOnly` and `ReadWrite`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        /// <summary>
        /// The Azure Storage Account in which the Share to be used is located. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// The ID of the Container App Environment to which this storage belongs. Changing this forces a new resource to be created.
        /// </summary>
        [Input("containerAppEnvironmentId")]
        public Input<string>? ContainerAppEnvironmentId { get; set; }

        /// <summary>
        /// The name for this Container App Environment Storage. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The NFS server to use for the Azure File Share, the format will be `yourstorageaccountname.file.core.windows.net`. Changing this forces a new resource to be created.
        /// *
        /// </summary>
        [Input("nfsServerUrl")]
        public Input<string>? NfsServerUrl { get; set; }

        /// <summary>
        /// The name of the Azure Storage Share to use. Changing this forces a new resource to be created.
        /// </summary>
        [Input("shareName")]
        public Input<string>? ShareName { get; set; }

        public EnvironmentStorageState()
        {
        }
        public static new EnvironmentStorageState Empty => new EnvironmentStorageState();
    }
}
