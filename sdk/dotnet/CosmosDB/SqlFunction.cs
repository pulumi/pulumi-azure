// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.CosmosDB
{
    /// <summary>
    /// Manages an SQL User Defined Function.
    /// 
    /// ## Import
    /// 
    /// SQL User Defined Functions can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:cosmosdb/sqlFunction:SqlFunction example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlDatabases/database1/containers/container1/userDefinedFunctions/userDefinedFunction1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cosmosdb/sqlFunction:SqlFunction")]
    public partial class SqlFunction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Body of the User Defined Function.
        /// </summary>
        [Output("body")]
        public Output<string> Body { get; private set; } = null!;

        /// <summary>
        /// The id of the Cosmos DB SQL Container to create the SQL User Defined Function within. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Output("containerId")]
        public Output<string> ContainerId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this SQL User Defined Function. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a SqlFunction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlFunction(string name, SqlFunctionArgs args, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/sqlFunction:SqlFunction", name, args ?? new SqlFunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlFunction(string name, Input<string> id, SqlFunctionState? state = null, CustomResourceOptions? options = null)
            : base("azure:cosmosdb/sqlFunction:SqlFunction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlFunction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlFunction Get(string name, Input<string> id, SqlFunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlFunction(name, id, state, options);
        }
    }

    public sealed class SqlFunctionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Body of the User Defined Function.
        /// </summary>
        [Input("body", required: true)]
        public Input<string> Body { get; set; } = null!;

        /// <summary>
        /// The id of the Cosmos DB SQL Container to create the SQL User Defined Function within. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Input("containerId", required: true)]
        public Input<string> ContainerId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this SQL User Defined Function. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SqlFunctionArgs()
        {
        }
        public static new SqlFunctionArgs Empty => new SqlFunctionArgs();
    }

    public sealed class SqlFunctionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Body of the User Defined Function.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// The id of the Cosmos DB SQL Container to create the SQL User Defined Function within. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Input("containerId")]
        public Input<string>? ContainerId { get; set; }

        /// <summary>
        /// The name which should be used for this SQL User Defined Function. Changing this forces a new SQL User Defined Function to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SqlFunctionState()
        {
        }
        public static new SqlFunctionState Empty => new SqlFunctionState();
    }
}
