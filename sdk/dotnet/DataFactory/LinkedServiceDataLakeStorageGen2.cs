// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory
{
    /// <summary>
    /// Manages a Linked Service (connection) between Data Lake Storage Gen2 and Azure Data Factory.
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
    ///     var exampleFactory = new Azure.DataFactory.Factory("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = example.Location,
    ///         ResourceGroupName = example.Name,
    ///     });
    /// 
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var exampleLinkedServiceDataLakeStorageGen2 = new Azure.DataFactory.LinkedServiceDataLakeStorageGen2("example", new()
    ///     {
    ///         Name = "example",
    ///         DataFactoryId = exampleFactory.Id,
    ///         ServicePrincipalId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.ClientId),
    ///         ServicePrincipalKey = "exampleKey",
    ///         Tenant = "11111111-1111-1111-1111-111111111111",
    ///         Url = "https://datalakestoragegen2",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Factory Data Lake Storage Gen2 Linked Services can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2")]
    public partial class LinkedServiceDataLakeStorageGen2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
        /// </summary>
        [Output("additionalProperties")]
        public Output<ImmutableDictionary<string, string>?> AdditionalProperties { get; private set; } = null!;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Linked Service.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableArray<string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// The description for the Data Factory Linked Service.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The integration runtime reference to associate with the Data Factory Linked Service.
        /// </summary>
        [Output("integrationRuntimeName")]
        public Output<string?> IntegrationRuntimeName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Linked Service.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storage_account_key` and `use_managed_identity`.
        /// </summary>
        [Output("servicePrincipalId")]
        public Output<string?> ServicePrincipalId { get; private set; } = null!;

        /// <summary>
        /// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
        /// </summary>
        [Output("servicePrincipalKey")]
        public Output<string?> ServicePrincipalKey { get; private set; } = null!;

        /// <summary>
        /// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `use_managed_identity`.
        /// </summary>
        [Output("storageAccountKey")]
        public Output<string?> StorageAccountKey { get; private set; } = null!;

        /// <summary>
        /// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
        /// 
        /// &gt; **Note:** If `service_principal_id` is used, `service_principal_key` and `tenant` are also required.
        /// </summary>
        [Output("tenant")]
        public Output<string?> Tenant { get; private set; } = null!;

        /// <summary>
        /// The endpoint for the Azure Data Lake Storage Gen2 service.
        /// 
        /// &gt; **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `storage_account_key`.
        /// </summary>
        [Output("useManagedIdentity")]
        public Output<bool?> UseManagedIdentity { get; private set; } = null!;


        /// <summary>
        /// Create a LinkedServiceDataLakeStorageGen2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LinkedServiceDataLakeStorageGen2(string name, LinkedServiceDataLakeStorageGen2Args args, CustomResourceOptions? options = null)
            : base("azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2", name, args ?? new LinkedServiceDataLakeStorageGen2Args(), MakeResourceOptions(options, ""))
        {
        }

        private LinkedServiceDataLakeStorageGen2(string name, Input<string> id, LinkedServiceDataLakeStorageGen2State? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/linkedServiceDataLakeStorageGen2:LinkedServiceDataLakeStorageGen2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LinkedServiceDataLakeStorageGen2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LinkedServiceDataLakeStorageGen2 Get(string name, Input<string> id, LinkedServiceDataLakeStorageGen2State? state = null, CustomResourceOptions? options = null)
        {
            return new LinkedServiceDataLakeStorageGen2(name, id, state, options);
        }
    }

    public sealed class LinkedServiceDataLakeStorageGen2Args : global::Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Linked Service.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId", required: true)]
        public Input<string> DataFactoryId { get; set; } = null!;

        /// <summary>
        /// The description for the Data Factory Linked Service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The integration runtime reference to associate with the Data Factory Linked Service.
        /// </summary>
        [Input("integrationRuntimeName")]
        public Input<string>? IntegrationRuntimeName { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Linked Service.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storage_account_key` and `use_managed_identity`.
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        /// <summary>
        /// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
        /// </summary>
        [Input("servicePrincipalKey")]
        public Input<string>? ServicePrincipalKey { get; set; }

        /// <summary>
        /// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `use_managed_identity`.
        /// </summary>
        [Input("storageAccountKey")]
        public Input<string>? StorageAccountKey { get; set; }

        /// <summary>
        /// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
        /// 
        /// &gt; **Note:** If `service_principal_id` is used, `service_principal_key` and `tenant` are also required.
        /// </summary>
        [Input("tenant")]
        public Input<string>? Tenant { get; set; }

        /// <summary>
        /// The endpoint for the Azure Data Lake Storage Gen2 service.
        /// 
        /// &gt; **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `storage_account_key`.
        /// </summary>
        [Input("useManagedIdentity")]
        public Input<bool>? UseManagedIdentity { get; set; }

        public LinkedServiceDataLakeStorageGen2Args()
        {
        }
        public static new LinkedServiceDataLakeStorageGen2Args Empty => new LinkedServiceDataLakeStorageGen2Args();
    }

    public sealed class LinkedServiceDataLakeStorageGen2State : global::Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to Data Lake Storage Gen2 Linked Service:
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Linked Service.
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId")]
        public Input<string>? DataFactoryId { get; set; }

        /// <summary>
        /// The description for the Data Factory Linked Service.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The integration runtime reference to associate with the Data Factory Linked Service.
        /// </summary>
        [Input("integrationRuntimeName")]
        public Input<string>? IntegrationRuntimeName { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Linked Service.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The service principal id with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `storage_account_key` and `use_managed_identity`.
        /// </summary>
        [Input("servicePrincipalId")]
        public Input<string>? ServicePrincipalId { get; set; }

        /// <summary>
        /// The service principal key with which to authenticate against the Azure Data Lake Storage Gen2 account.
        /// </summary>
        [Input("servicePrincipalKey")]
        public Input<string>? ServicePrincipalKey { get; set; }

        /// <summary>
        /// The Storage Account Key with which to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `use_managed_identity`.
        /// </summary>
        [Input("storageAccountKey")]
        public Input<string>? StorageAccountKey { get; set; }

        /// <summary>
        /// The tenant id or name in which the service principal exists to authenticate against the Azure Data Lake Storage Gen2 account.
        /// 
        /// &gt; **Note:** If `service_principal_id` is used, `service_principal_key` and `tenant` are also required.
        /// </summary>
        [Input("tenant")]
        public Input<string>? Tenant { get; set; }

        /// <summary>
        /// The endpoint for the Azure Data Lake Storage Gen2 service.
        /// 
        /// &gt; **Note:** Users should specify only one of the following three authentication strategies: storage account key, managed identity, service principal.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// Whether to use the Data Factory's managed identity to authenticate against the Azure Data Lake Storage Gen2 account. Incompatible with `service_principal_id`, `service_principal_key`, `tenant` and `storage_account_key`.
        /// </summary>
        [Input("useManagedIdentity")]
        public Input<bool>? UseManagedIdentity { get; set; }

        public LinkedServiceDataLakeStorageGen2State()
        {
        }
        public static new LinkedServiceDataLakeStorageGen2State Empty => new LinkedServiceDataLakeStorageGen2State();
    }
}
