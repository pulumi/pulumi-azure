// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch
{
    /// <summary>
    /// Manages Azure Batch Application instance.
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
    ///         Name = "example-rg",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleAccount = new Azure.Storage.Account("example", new()
    ///     {
    ///         Name = "examplesa",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         AccountTier = "Standard",
    ///         AccountReplicationType = "LRS",
    ///     });
    /// 
    ///     var exampleAccount2 = new Azure.Batch.Account("example", new()
    ///     {
    ///         Name = "exampleba",
    ///         ResourceGroupName = example.Name,
    ///         Location = example.Location,
    ///         PoolAllocationMode = "BatchService",
    ///         StorageAccountId = exampleAccount.Id,
    ///         StorageAccountAuthenticationMode = "StorageKeys",
    ///     });
    /// 
    ///     var exampleApplication = new Azure.Batch.Application("example", new()
    ///     {
    ///         Name = "example-batch-application",
    ///         ResourceGroupName = example.Name,
    ///         AccountName = exampleAccount2.Name,
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
    /// * `Microsoft.Batch`: 2024-07-01
    /// 
    /// ## Import
    /// 
    /// Batch Applications can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:batch/application:Application example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-rg/providers/Microsoft.Batch/batchAccounts/exampleba/applications/example-batch-application
    /// ```
    /// </summary>
    [AzureResourceType("azure:batch/application:Application")]
    public partial class Application : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("accountName")]
        public Output<string> AccountName { get; private set; } = null!;

        /// <summary>
        /// A value indicating whether packages within the application may be overwritten using the same version string. Defaults to `true`.
        /// </summary>
        [Output("allowUpdates")]
        public Output<bool?> AllowUpdates { get; private set; } = null!;

        /// <summary>
        /// The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
        /// </summary>
        [Output("defaultVersion")]
        public Output<string?> DefaultVersion { get; private set; } = null!;

        /// <summary>
        /// The display name for the application.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The name of the application. This must be unique within the account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group that contains the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;


        /// <summary>
        /// Create a Application resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Application(string name, ApplicationArgs args, CustomResourceOptions? options = null)
            : base("azure:batch/application:Application", name, args ?? new ApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Application(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
            : base("azure:batch/application:Application", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Application resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Application Get(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new Application(name, id, state, options);
        }
    }

    public sealed class ApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName", required: true)]
        public Input<string> AccountName { get; set; } = null!;

        /// <summary>
        /// A value indicating whether packages within the application may be overwritten using the same version string. Defaults to `true`.
        /// </summary>
        [Input("allowUpdates")]
        public Input<bool>? AllowUpdates { get; set; }

        /// <summary>
        /// The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
        /// </summary>
        [Input("defaultVersion")]
        public Input<string>? DefaultVersion { get; set; }

        /// <summary>
        /// The display name for the application.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name of the application. This must be unique within the account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group that contains the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public ApplicationArgs()
        {
        }
        public static new ApplicationArgs Empty => new ApplicationArgs();
    }

    public sealed class ApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// A value indicating whether packages within the application may be overwritten using the same version string. Defaults to `true`.
        /// </summary>
        [Input("allowUpdates")]
        public Input<bool>? AllowUpdates { get; set; }

        /// <summary>
        /// The package to use if a client requests the application but does not specify a version. This property can only be set to the name of an existing package.
        /// </summary>
        [Input("defaultVersion")]
        public Input<string>? DefaultVersion { get; set; }

        /// <summary>
        /// The display name for the application.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The name of the application. This must be unique within the account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group that contains the Batch account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        public ApplicationState()
        {
        }
        public static new ApplicationState Empty => new ApplicationState();
    }
}
