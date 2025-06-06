// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Linked Service (connection) between a SFTP Server and Azure Data Factory.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const example = azure.storage.getAccountOutput({
 *     name: "storageaccountname",
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleFactory = new azure.datafactory.Factory("example", {
 *     name: "example",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleLinkedServiceAzureFileStorage = new azure.datafactory.LinkedServiceAzureFileStorage("example", {
 *     name: "example",
 *     dataFactoryId: exampleFactory.id,
 *     connectionString: example.apply(example => example.primaryConnectionString),
 * });
 * ```
 *
 * ## Import
 *
 * Data Factory Linked Service's can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:datafactory/linkedServiceAzureFileStorage:LinkedServiceAzureFileStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 */
export class LinkedServiceAzureFileStorage extends pulumi.CustomResource {
    /**
     * Get an existing LinkedServiceAzureFileStorage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LinkedServiceAzureFileStorageState, opts?: pulumi.CustomResourceOptions): LinkedServiceAzureFileStorage {
        return new LinkedServiceAzureFileStorage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:datafactory/linkedServiceAzureFileStorage:LinkedServiceAzureFileStorage';

    /**
     * Returns true if the given object is an instance of LinkedServiceAzureFileStorage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LinkedServiceAzureFileStorage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LinkedServiceAzureFileStorage.__pulumiType;
    }

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     *
     * The following supported arguments are specific to Azure File Storage Linked Service:
     */
    public readonly additionalProperties!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    public readonly annotations!: pulumi.Output<string[] | undefined>;
    /**
     * The connection string.
     */
    public readonly connectionString!: pulumi.Output<string>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    public readonly dataFactoryId!: pulumi.Output<string>;
    /**
     * The description for the Data Factory Linked Service.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the file share.
     */
    public readonly fileShare!: pulumi.Output<string | undefined>;
    /**
     * The Host name of the server.
     */
    public readonly host!: pulumi.Output<string | undefined>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    public readonly integrationRuntimeName!: pulumi.Output<string | undefined>;
    /**
     * A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     */
    public readonly keyVaultPassword!: pulumi.Output<outputs.datafactory.LinkedServiceAzureFileStorageKeyVaultPassword | undefined>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The password to log in the server.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The user ID to log in the server.
     */
    public readonly userId!: pulumi.Output<string | undefined>;

    /**
     * Create a LinkedServiceAzureFileStorage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LinkedServiceAzureFileStorageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LinkedServiceAzureFileStorageArgs | LinkedServiceAzureFileStorageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LinkedServiceAzureFileStorageState | undefined;
            resourceInputs["additionalProperties"] = state ? state.additionalProperties : undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["connectionString"] = state ? state.connectionString : undefined;
            resourceInputs["dataFactoryId"] = state ? state.dataFactoryId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["fileShare"] = state ? state.fileShare : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["integrationRuntimeName"] = state ? state.integrationRuntimeName : undefined;
            resourceInputs["keyVaultPassword"] = state ? state.keyVaultPassword : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as LinkedServiceAzureFileStorageArgs | undefined;
            if ((!args || args.connectionString === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionString'");
            }
            if ((!args || args.dataFactoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataFactoryId'");
            }
            resourceInputs["additionalProperties"] = args ? args.additionalProperties : undefined;
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["connectionString"] = args?.connectionString ? pulumi.secret(args.connectionString) : undefined;
            resourceInputs["dataFactoryId"] = args ? args.dataFactoryId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fileShare"] = args ? args.fileShare : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["integrationRuntimeName"] = args ? args.integrationRuntimeName : undefined;
            resourceInputs["keyVaultPassword"] = args ? args.keyVaultPassword : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["connectionString", "password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(LinkedServiceAzureFileStorage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LinkedServiceAzureFileStorage resources.
 */
export interface LinkedServiceAzureFileStorageState {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     *
     * The following supported arguments are specific to Azure File Storage Linked Service:
     */
    additionalProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    annotations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The connection string.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    dataFactoryId?: pulumi.Input<string>;
    /**
     * The description for the Data Factory Linked Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the file share.
     */
    fileShare?: pulumi.Input<string>;
    /**
     * The Host name of the server.
     */
    host?: pulumi.Input<string>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    integrationRuntimeName?: pulumi.Input<string>;
    /**
     * A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     */
    keyVaultPassword?: pulumi.Input<inputs.datafactory.LinkedServiceAzureFileStorageKeyVaultPassword>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The password to log in the server.
     */
    password?: pulumi.Input<string>;
    /**
     * The user ID to log in the server.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LinkedServiceAzureFileStorage resource.
 */
export interface LinkedServiceAzureFileStorageArgs {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     *
     * The following supported arguments are specific to Azure File Storage Linked Service:
     */
    additionalProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    annotations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The connection string.
     */
    connectionString: pulumi.Input<string>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    dataFactoryId: pulumi.Input<string>;
    /**
     * The description for the Data Factory Linked Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the file share.
     */
    fileShare?: pulumi.Input<string>;
    /**
     * The Host name of the server.
     */
    host?: pulumi.Input<string>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    integrationRuntimeName?: pulumi.Input<string>;
    /**
     * A `keyVaultPassword` block as defined below. Use this argument to store Azure File Storage password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     */
    keyVaultPassword?: pulumi.Input<inputs.datafactory.LinkedServiceAzureFileStorageKeyVaultPassword>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The password to log in the server.
     */
    password?: pulumi.Input<string>;
    /**
     * The user ID to log in the server.
     */
    userId?: pulumi.Input<string>;
}
