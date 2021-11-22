// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Sets a MySQL Flexible Server Configuration value on a MySQL Flexible Server.
 *
 * ## Disclaimers
 *
 * > **Note:** Since this resource is provisioned by default, the Azure Provider will not check for the presence of an existing resource prior to attempting to create it.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleFlexibleServer = new azure.mysql.FlexibleServer("exampleFlexibleServer", {
 *     resourceGroupName: azurerm_resource_group.test.name,
 *     location: azurerm_resource_group.test.location,
 *     administratorLogin: "adminTerraform",
 *     administratorPassword: "H@Sh1CoR3!",
 *     skuName: "GP_Standard_D2ds_v4",
 * });
 * const exampleFlexibleServerConfiguration = new azure.mysql.FlexibleServerConfiguration("exampleFlexibleServerConfiguration", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     serverName: azurerm_mysql_server.example.name,
 *     value: "600",
 * });
 * ```
 *
 * ## Import
 *
 * MySQL Flexible Server Configurations can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mysql/flexibleServerConfiguration:FlexibleServerConfiguration interactive_timeout /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DBforMySQL/flexibleServers/flexibleServer1/configurations/interactive_timeout
 * ```
 */
export class FlexibleServerConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing FlexibleServerConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexibleServerConfigurationState, opts?: pulumi.CustomResourceOptions): FlexibleServerConfiguration {
        return new FlexibleServerConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mysql/flexibleServerConfiguration:FlexibleServerConfiguration';

    /**
     * Returns true if the given object is an instance of FlexibleServerConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexibleServerConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexibleServerConfiguration.__pulumiType;
    }

    /**
     * Specifies the name of the MySQL Flexible Server Configuration, which needs [to be a valid MySQL configuration name](https://dev.mysql.com/doc/refman/5.7/en/server-configuration.html). Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    public readonly serverName!: pulumi.Output<string>;
    /**
     * Specifies the value of the MySQL Flexible Server Configuration. See the MySQL documentation for valid values.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a FlexibleServerConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlexibleServerConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexibleServerConfigurationArgs | FlexibleServerConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexibleServerConfigurationState | undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["serverName"] = state ? state.serverName : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as FlexibleServerConfigurationArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serverName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverName'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["serverName"] = args ? args.serverName : undefined;
            inputs["value"] = args ? args.value : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(FlexibleServerConfiguration.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexibleServerConfiguration resources.
 */
export interface FlexibleServerConfigurationState {
    /**
     * Specifies the name of the MySQL Flexible Server Configuration, which needs [to be a valid MySQL configuration name](https://dev.mysql.com/doc/refman/5.7/en/server-configuration.html). Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    serverName?: pulumi.Input<string>;
    /**
     * Specifies the value of the MySQL Flexible Server Configuration. See the MySQL documentation for valid values.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexibleServerConfiguration resource.
 */
export interface FlexibleServerConfigurationArgs {
    /**
     * Specifies the name of the MySQL Flexible Server Configuration, which needs [to be a valid MySQL configuration name](https://dev.mysql.com/doc/refman/5.7/en/server-configuration.html). Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the MySQL Flexible Server exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    serverName: pulumi.Input<string>;
    /**
     * Specifies the value of the MySQL Flexible Server Configuration. See the MySQL documentation for valid values.
     */
    value: pulumi.Input<string>;
}