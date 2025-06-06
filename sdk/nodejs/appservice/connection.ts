// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a service connector for app service.
 *
 * ## Import
 *
 * Service Connector for app service can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:appservice/connection:Connection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Web/sites/webapp/providers/Microsoft.ServiceLinker/linkers/serviceconnector1
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:appservice/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    public readonly appServiceId!: pulumi.Output<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     *
     * > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     */
    public readonly authentication!: pulumi.Output<outputs.appservice.ConnectionAuthentication>;
    public readonly clientType!: pulumi.Output<string | undefined>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly secretStore!: pulumi.Output<outputs.appservice.ConnectionSecretStore | undefined>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
     */
    public readonly targetResourceId!: pulumi.Output<string>;
    public readonly vnetSolution!: pulumi.Output<string | undefined>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["appServiceId"] = state ? state.appServiceId : undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["clientType"] = state ? state.clientType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["secretStore"] = state ? state.secretStore : undefined;
            resourceInputs["targetResourceId"] = state ? state.targetResourceId : undefined;
            resourceInputs["vnetSolution"] = state ? state.vnetSolution : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.appServiceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appServiceId'");
            }
            if ((!args || args.authentication === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authentication'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            resourceInputs["appServiceId"] = args ? args.appServiceId : undefined;
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["clientType"] = args ? args.clientType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["secretStore"] = args ? args.secretStore : undefined;
            resourceInputs["targetResourceId"] = args ? args.targetResourceId : undefined;
            resourceInputs["vnetSolution"] = args ? args.vnetSolution : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    appServiceId?: pulumi.Input<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     *
     * > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     */
    authentication?: pulumi.Input<inputs.appservice.ConnectionAuthentication>;
    clientType?: pulumi.Input<string>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    secretStore?: pulumi.Input<inputs.appservice.ConnectionSecretStore>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
     */
    targetResourceId?: pulumi.Input<string>;
    vnetSolution?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * The ID of the data source web app. Changing this forces a new resource to be created.
     */
    appServiceId: pulumi.Input<string>;
    /**
     * The authentication info. An `authentication` block as defined below.
     *
     * > **Note:** If a Managed Identity is used, this will need to be configured on the App Service.
     */
    authentication: pulumi.Input<inputs.appservice.ConnectionAuthentication>;
    clientType?: pulumi.Input<string>;
    /**
     * The name of the service connection. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    secretStore?: pulumi.Input<inputs.appservice.ConnectionSecretStore>;
    /**
     * The ID of the target resource. Changing this forces a new resource to be created. Possible target resources are `Postgres`, `PostgresFlexible`, `Mysql`, `Sql`, `Redis`, `RedisEnterprise`, `CosmosCassandra`, `CosmosGremlin`, `CosmosMongo`, `CosmosSql`, `CosmosTable`, `StorageBlob`, `StorageQueue`, `StorageFile`, `StorageTable`, `AppConfig`, `EventHub`, `ServiceBus`, `SignalR`, `WebPubSub`, `ConfluentKafka`. The integration guide can be found [here](https://learn.microsoft.com/en-us/azure/service-connector/how-to-integrate-postgres).
     */
    targetResourceId: pulumi.Input<string>;
    vnetSolution?: pulumi.Input<string>;
}
