// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    /// <summary>
    /// Manages a service connector for app service.
    /// 
    /// ## Import
    /// 
    /// Service Connector for app service can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import azure:appservice/connection:Connection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
    /// ```
    /// </summary>
    [AzureResourceType("azure:appservice/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the data source web app. Changing this forces a new resource to be created.
        /// </summary>
        [Output("appServiceId")]
        public Output<string> AppServiceId { get; private set; } = null!;

        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Output("authentication")]
        public Output<Outputs.ConnectionAuthentication> Authentication { get; private set; } = null!;

        [Output("clientType")]
        public Output<string?> ClientType { get; private set; } = null!;

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("secretStore")]
        public Output<Outputs.ConnectionSecretStore?> SecretStore { get; private set; } = null!;

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;

        [Output("vnetSolution")]
        public Output<string?> VnetSolution { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("azure:appservice/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("azure:appservice/connection:Connection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the data source web app. Changing this forces a new resource to be created.
        /// </summary>
        [Input("appServiceId", required: true)]
        public Input<string> AppServiceId { get; set; } = null!;

        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Input("authentication", required: true)]
        public Input<Inputs.ConnectionAuthenticationArgs> Authentication { get; set; } = null!;

        [Input("clientType")]
        public Input<string>? ClientType { get; set; }

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("secretStore")]
        public Input<Inputs.ConnectionSecretStoreArgs>? SecretStore { get; set; }

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        [Input("vnetSolution")]
        public Input<string>? VnetSolution { get; set; }

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the data source web app. Changing this forces a new resource to be created.
        /// </summary>
        [Input("appServiceId")]
        public Input<string>? AppServiceId { get; set; }

        /// <summary>
        /// The authentication info. An `authentication` block as defined below.
        /// 
        /// &gt; **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
        /// </summary>
        [Input("authentication")]
        public Input<Inputs.ConnectionAuthenticationGetArgs>? Authentication { get; set; }

        [Input("clientType")]
        public Input<string>? ClientType { get; set; }

        /// <summary>
        /// The name of the service connection. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("secretStore")]
        public Input<Inputs.ConnectionSecretStoreGetArgs>? SecretStore { get; set; }

        /// <summary>
        /// The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        [Input("vnetSolution")]
        public Input<string>? VnetSolution { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
