// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory
{
    /// <summary>
    /// Manages an Azure SQL Table Dataset inside an Azure Data Factory.
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
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleFactory = new Azure.DataFactory.Factory("exampleFactory", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleLinkedServiceAzureSqlDatabase = new Azure.DataFactory.LinkedServiceAzureSqlDatabase("exampleLinkedServiceAzureSqlDatabase", new()
    ///     {
    ///         DataFactoryId = exampleFactory.Id,
    ///         ConnectionString = "Integrated Security=False;Data Source=test;Initial Catalog=test;Initial Catalog=test;User ID=test;Password=test",
    ///     });
    /// 
    ///     var exampleDatasetAzureSqlTable = new Azure.DataFactory.DatasetAzureSqlTable("exampleDatasetAzureSqlTable", new()
    ///     {
    ///         DataFactoryId = exampleFactory.Id,
    ///         LinkedServiceId = exampleLinkedServiceAzureSqlDatabase.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Data Factory Azure SQL Table Datasets can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:datafactory/datasetAzureSqlTable:DatasetAzureSqlTable example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/datasets/example
    /// ```
    /// </summary>
    [AzureResourceType("azure:datafactory/datasetAzureSqlTable:DatasetAzureSqlTable")]
    public partial class DatasetAzureSqlTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Output("additionalProperties")]
        public Output<ImmutableDictionary<string, string>?> AdditionalProperties { get; private set; } = null!;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableArray<string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
        /// </summary>
        [Output("dataFactoryId")]
        public Output<string> DataFactoryId { get; private set; } = null!;

        /// <summary>
        /// The description for the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Output("folder")]
        public Output<string?> Folder { get; private set; } = null!;

        /// <summary>
        /// The Data Factory Linked Service ID in which to associate the Dataset with.
        /// </summary>
        [Output("linkedServiceId")]
        public Output<string> LinkedServiceId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Dataset Azure SQL Table. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The schema name of the table in the Azure SQL Database.
        /// </summary>
        [Output("schema")]
        public Output<string?> Schema { get; private set; } = null!;

        /// <summary>
        /// A `schema_column` block as defined below.
        /// </summary>
        [Output("schemaColumns")]
        public Output<ImmutableArray<Outputs.DatasetAzureSqlTableSchemaColumn>> SchemaColumns { get; private set; } = null!;

        /// <summary>
        /// The table name of the table in the Azure SQL Database.
        /// </summary>
        [Output("table")]
        public Output<string?> Table { get; private set; } = null!;


        /// <summary>
        /// Create a DatasetAzureSqlTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatasetAzureSqlTable(string name, DatasetAzureSqlTableArgs args, CustomResourceOptions? options = null)
            : base("azure:datafactory/datasetAzureSqlTable:DatasetAzureSqlTable", name, args ?? new DatasetAzureSqlTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatasetAzureSqlTable(string name, Input<string> id, DatasetAzureSqlTableState? state = null, CustomResourceOptions? options = null)
            : base("azure:datafactory/datasetAzureSqlTable:DatasetAzureSqlTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatasetAzureSqlTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatasetAzureSqlTable Get(string name, Input<string> id, DatasetAzureSqlTableState? state = null, CustomResourceOptions? options = null)
        {
            return new DatasetAzureSqlTable(name, id, state, options);
        }
    }

    public sealed class DatasetAzureSqlTableArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset Azure SQL Table.
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
        /// The description for the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Data Factory Linked Service ID in which to associate the Dataset with.
        /// </summary>
        [Input("linkedServiceId", required: true)]
        public Input<string> LinkedServiceId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Data Factory Dataset Azure SQL Table. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The schema name of the table in the Azure SQL Database.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("schemaColumns")]
        private InputList<Inputs.DatasetAzureSqlTableSchemaColumnArgs>? _schemaColumns;

        /// <summary>
        /// A `schema_column` block as defined below.
        /// </summary>
        public InputList<Inputs.DatasetAzureSqlTableSchemaColumnArgs> SchemaColumns
        {
            get => _schemaColumns ?? (_schemaColumns = new InputList<Inputs.DatasetAzureSqlTableSchemaColumnArgs>());
            set => _schemaColumns = value;
        }

        /// <summary>
        /// The table name of the table in the Azure SQL Database.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        public DatasetAzureSqlTableArgs()
        {
        }
        public static new DatasetAzureSqlTableArgs Empty => new DatasetAzureSqlTableArgs();
    }

    public sealed class DatasetAzureSqlTableState : global::Pulumi.ResourceArgs
    {
        [Input("additionalProperties")]
        private InputMap<string>? _additionalProperties;

        /// <summary>
        /// A map of additional properties to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        public InputMap<string> AdditionalProperties
        {
            get => _additionalProperties ?? (_additionalProperties = new InputMap<string>());
            set => _additionalProperties = value;
        }

        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// List of tags that can be used for describing the Data Factory Dataset Azure SQL Table.
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
        /// The description for the Data Factory Dataset Azure SQL Table.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
        /// </summary>
        [Input("folder")]
        public Input<string>? Folder { get; set; }

        /// <summary>
        /// The Data Factory Linked Service ID in which to associate the Dataset with.
        /// </summary>
        [Input("linkedServiceId")]
        public Input<string>? LinkedServiceId { get; set; }

        /// <summary>
        /// Specifies the name of the Data Factory Dataset Azure SQL Table. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// A map of parameters to associate with the Data Factory Dataset Azure SQL Table.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The schema name of the table in the Azure SQL Database.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("schemaColumns")]
        private InputList<Inputs.DatasetAzureSqlTableSchemaColumnGetArgs>? _schemaColumns;

        /// <summary>
        /// A `schema_column` block as defined below.
        /// </summary>
        public InputList<Inputs.DatasetAzureSqlTableSchemaColumnGetArgs> SchemaColumns
        {
            get => _schemaColumns ?? (_schemaColumns = new InputList<Inputs.DatasetAzureSqlTableSchemaColumnGetArgs>());
            set => _schemaColumns = value;
        }

        /// <summary>
        /// The table name of the table in the Azure SQL Database.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        public DatasetAzureSqlTableState()
        {
        }
        public static new DatasetAzureSqlTableState Empty => new DatasetAzureSqlTableState();
    }
}