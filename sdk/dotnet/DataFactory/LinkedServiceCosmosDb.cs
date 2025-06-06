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
    /// Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using SQL API.
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("example", new()
    ///     {
    ///         Name = "example-resources",
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var example = Azure.CosmosDB.GetAccount.Invoke(new()
    ///     {
    ///         Name = "tfex-cosmosdb-account",
    ///         ResourceGroupName = "tfex-cosmosdb-account-rg",
    ///     });
    /// 
    ///     var exampleFactory = new Azure.DataFactory.Factory("example", new()
    ///     {
    ///         Name = "example",
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleLinkedServiceCosmosDb = new Azure.DataFactory.LinkedServiceCosmosDb("example", new()
    ///     {
    ///         Name = "example",
    ///         DataFactoryId = exampleFactory.Id,
    ///         AccountEndpoint = example.Apply(getAccountResult =&gt; getAccountResult.Endpoint),
    ///         AccountKey = example.Apply(getAccountResult =&gt; getAccountResult.PrimaryKey),
    ///         Database = "foo",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Factory Linked Service's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb")]
    public partial class LinkedServiceCosmosDb : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
        /// </summary>
        [Output("accountEndpoint")]
        public Output<string?> AccountEndpoint { get; private set; } = null!;

        /// <summary>
        /// The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
        /// </summary>
        [Output("accountKey")]
        public Output<string?> AccountKey { get; private set; } = null!;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to CosmosDB Linked Service:
        /// </summary>
        [Output("additionalProperties")]
        public Output<ImmutableDictionary<string, string>?> AdditionalProperties { get; private set; } = null!;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Linked Service.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableArray<string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
        /// </summary>
        [Output("connectionString")]
        public Output<string?> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// The name of the database. Required if `connection_string` is unspecified.
        /// </summary>
        [Output("database")]
        public Output<string?> Database { get; private set; } = null!;

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
        /// Create a LinkedServiceCosmosDb resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LinkedServiceCosmosDb(string name, LinkedServiceCosmosDbArgs args, CustomResourceOptions? options = null)
            : base("azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb", name, args ?? new LinkedServiceCosmosDbArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LinkedServiceCosmosDb(string name, Input<string> id, LinkedServiceCosmosDbState? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/linkedServiceCosmosDb:LinkedServiceCosmosDb", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountKey",
                    "connectionString",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LinkedServiceCosmosDb resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LinkedServiceCosmosDb Get(string name, Input<string> id, LinkedServiceCosmosDbState? state = null, CustomResourceOptions? options = null)
        {
            return new LinkedServiceCosmosDb(name, id, state, options);
        }
    }

    public sealed class LinkedServiceCosmosDbArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
        /// </summary>
        [Input("accountEndpoint")]
        public Input<string>? AccountEndpoint { get; set; }

        [Input("accountKey")]
        private Input<string>? _accountKey;

        /// <summary>
        /// The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
        /// </summary>
        public Input<string>? AccountKey
        {
            get => _accountKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to CosmosDB Linked Service:
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

        [Input("connectionString")]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId", required: true)]
        public Input<string> DataFactoryId { get; set; } = null!;

        /// <summary>
        /// The name of the database. Required if `connection_string` is unspecified.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

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

        public LinkedServiceCosmosDbArgs()
        {
        }
        public static new LinkedServiceCosmosDbArgs Empty => new LinkedServiceCosmosDbArgs();
    }

    public sealed class LinkedServiceCosmosDbState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint of the Azure CosmosDB account. Required if `connection_string` is unspecified.
        /// </summary>
        [Input("accountEndpoint")]
        public Input<string>? AccountEndpoint { get; set; }

        [Input("accountKey")]
        private Input<string>? _accountKey;

        /// <summary>
        /// The account key of the Azure Cosmos DB account. Required if `connection_string` is unspecified.
        /// </summary>
        public Input<string>? AccountKey
        {
            get => _accountKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Linked Service.
        /// 
        /// The following supported arguments are specific to CosmosDB Linked Service:
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

        [Input("connectionString")]
        private Input<string>? _connectionString;

        /// <summary>
        /// The connection string. Required if `account_endpoint`, `account_key`, and `database` are unspecified.
        /// </summary>
        public Input<string>? ConnectionString
        {
            get => _connectionString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _connectionString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Input("dataFactoryId")]
        public Input<string>? DataFactoryId { get; set; }

        /// <summary>
        /// The name of the database. Required if `connection_string` is unspecified.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

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

        public LinkedServiceCosmosDbState()
        {
        }
        public static new LinkedServiceCosmosDbState Empty => new LinkedServiceCosmosDbState();
    }
}
