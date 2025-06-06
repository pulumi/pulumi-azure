// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics
{
    /// <summary>
    /// Manages a Stream Analytics Reference Input from MS SQL. Reference data (also known as a lookup table) is a finite data set that is static or slowly changing in nature, used to perform a lookup or to correlate with your data stream. Learn more [here](https://docs.microsoft.com/azure/stream-analytics/stream-analytics-use-reference-data#azure-sql-database).
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
    ///     var example = Azure.StreamAnalytics.GetJob.Invoke(new()
    ///     {
    ///         Name = "example-job",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleServer = new Azure.MSSql.Server("example", new()
    ///     {
    ///         Name = "example-sqlserver",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         Version = "12.0",
    ///         AdministratorLogin = "admin",
    ///         AdministratorLoginPassword = "password",
    ///     });
    /// 
    ///     var exampleDatabase = new Azure.MSSql.Database("example", new()
    ///     {
    ///         Name = "example-db",
    ///         ServerId = exampleServer.Id,
    ///     });
    /// 
    ///     var exampleReferenceInputMssql = new Azure.StreamAnalytics.ReferenceInputMssql("example", new()
    ///     {
    ///         Name = "example-reference-input",
    ///         ResourceGroupName = example.Apply(getJobResult =&gt; getJobResult.ResourceGroupName),
    ///         StreamAnalyticsJobName = example.Apply(getJobResult =&gt; getJobResult.Name),
    ///         Server = exampleServer.FullyQualifiedDomainName,
    ///         Database = exampleDatabase.Name,
    ///         Username = "exampleuser",
    ///         Password = "examplepassword",
    ///         RefreshType = "RefreshPeriodicallyWithFull",
    ///         RefreshIntervalDuration = "00:20:00",
    ///         FullSnapshotQuery = @"    SELECT *
    ///     INTO [YourOutputAlias]
    ///     FROM [YourInputAlias]
    /// ",
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
    /// * `Microsoft.StreamAnalytics`: 2020-03-01
    /// 
    /// ## Import
    /// 
    /// Stream Analytics can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:streamanalytics/referenceInputMssql:ReferenceInputMssql example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.StreamAnalytics/streamingJobs/job1/inputs/input1
    /// ```
    /// </summary>
    [AzureResourceType("azure:streamanalytics/referenceInputMssql:ReferenceInputMssql")]
    public partial class ReferenceInputMssql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The MS SQL database name where the reference data exists.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
        /// </summary>
        [Output("deltaSnapshotQuery")]
        public Output<string?> DeltaSnapshotQuery { get; private set; } = null!;

        /// <summary>
        /// The query used to retrieve the reference data from the MS SQL database.
        /// </summary>
        [Output("fullSnapshotQuery")]
        public Output<string> FullSnapshotQuery { get; private set; } = null!;

        /// <summary>
        /// The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The password to connect to the MS SQL database.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Output("refreshIntervalDuration")]
        public Output<string?> RefreshIntervalDuration { get; private set; } = null!;

        /// <summary>
        /// Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Output("refreshType")]
        public Output<string> RefreshType { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The fully qualified domain name of the MS SQL server.
        /// </summary>
        [Output("server")]
        public Output<string> Server { get; private set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Output("streamAnalyticsJobName")]
        public Output<string> StreamAnalyticsJobName { get; private set; } = null!;

        /// <summary>
        /// The name of the table in the Azure SQL database.
        /// </summary>
        [Output("table")]
        public Output<string?> Table { get; private set; } = null!;

        /// <summary>
        /// The username to connect to the MS SQL database.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a ReferenceInputMssql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ReferenceInputMssql(string name, ReferenceInputMssqlArgs args, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/referenceInputMssql:ReferenceInputMssql", name, args ?? new ReferenceInputMssqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ReferenceInputMssql(string name, Input<string> id, ReferenceInputMssqlState? state = null, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/referenceInputMssql:ReferenceInputMssql", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ReferenceInputMssql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ReferenceInputMssql Get(string name, Input<string> id, ReferenceInputMssqlState? state = null, CustomResourceOptions? options = null)
        {
            return new ReferenceInputMssql(name, id, state, options);
        }
    }

    public sealed class ReferenceInputMssqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The MS SQL database name where the reference data exists.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
        /// </summary>
        [Input("deltaSnapshotQuery")]
        public Input<string>? DeltaSnapshotQuery { get; set; }

        /// <summary>
        /// The query used to retrieve the reference data from the MS SQL database.
        /// </summary>
        [Input("fullSnapshotQuery", required: true)]
        public Input<string> FullSnapshotQuery { get; set; } = null!;

        /// <summary>
        /// The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password to connect to the MS SQL database.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Input("refreshIntervalDuration")]
        public Input<string>? RefreshIntervalDuration { get; set; }

        /// <summary>
        /// Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Input("refreshType", required: true)]
        public Input<string> RefreshType { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The fully qualified domain name of the MS SQL server.
        /// </summary>
        [Input("server", required: true)]
        public Input<string> Server { get; set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobName", required: true)]
        public Input<string> StreamAnalyticsJobName { get; set; } = null!;

        /// <summary>
        /// The name of the table in the Azure SQL database.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        /// <summary>
        /// The username to connect to the MS SQL database.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public ReferenceInputMssqlArgs()
        {
        }
        public static new ReferenceInputMssqlArgs Empty => new ReferenceInputMssqlArgs();
    }

    public sealed class ReferenceInputMssqlState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The MS SQL database name where the reference data exists.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
        /// </summary>
        [Input("deltaSnapshotQuery")]
        public Input<string>? DeltaSnapshotQuery { get; set; }

        /// <summary>
        /// The query used to retrieve the reference data from the MS SQL database.
        /// </summary>
        [Input("fullSnapshotQuery")]
        public Input<string>? FullSnapshotQuery { get; set; }

        /// <summary>
        /// The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password to connect to the MS SQL database.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Input("refreshIntervalDuration")]
        public Input<string>? RefreshIntervalDuration { get; set; }

        /// <summary>
        /// Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
        /// </summary>
        [Input("refreshType")]
        public Input<string>? RefreshType { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The fully qualified domain name of the MS SQL server.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobName")]
        public Input<string>? StreamAnalyticsJobName { get; set; }

        /// <summary>
        /// The name of the table in the Azure SQL database.
        /// </summary>
        [Input("table")]
        public Input<string>? Table { get; set; }

        /// <summary>
        /// The username to connect to the MS SQL database.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ReferenceInputMssqlState()
        {
        }
        public static new ReferenceInputMssqlState Empty => new ReferenceInputMssqlState();
    }
}
