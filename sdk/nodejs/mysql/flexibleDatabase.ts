// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a MySQL Database within a MySQL Flexible Server
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const test = new azure.mysql.FlexibleServer("test", {
 *     resourceGroupName: azurerm_resource_group.test.name,
 *     location: azurerm_resource_group.test.location,
 *     administratorLogin: "mysqladminun",
 *     administratorPassword: "H@Sh1CoR3!",
 *     skuName: "B_Standard_B1s",
 * });
 * const exampleFlexibleDatabase = new azure.mysql.FlexibleDatabase("exampleFlexibleDatabase", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     serverName: azurerm_mysql_flexible_server.example.name,
 *     charset: "utf8",
 *     collation: "utf8_unicode_ci",
 * });
 * ```
 *
 * ## Import
 *
 * MySQL Database's can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mysql/flexibleDatabase:FlexibleDatabase database1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.DBforMySQL/flexibleServers/flexibleserver1/databases/database1
 * ```
 */
export class FlexibleDatabase extends pulumi.CustomResource {
    /**
     * Get an existing FlexibleDatabase resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexibleDatabaseState, opts?: pulumi.CustomResourceOptions): FlexibleDatabase {
        return new FlexibleDatabase(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mysql/flexibleDatabase:FlexibleDatabase';

    /**
     * Returns true if the given object is an instance of FlexibleDatabase.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexibleDatabase {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexibleDatabase.__pulumiType;
    }

    /**
     * Specifies the Charset for the MySQL Database, which needs [to be a valid MySQL Charset](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html). Changing this forces a new resource to be created.
     */
    public readonly charset!: pulumi.Output<string>;
    /**
     * Specifies the Collation for the MySQL Database, which needs [to be a valid MySQL Collation](https://dev.mysql.com/doc/refman/5.7/en/charset-mysql.html). Changing this forces a new resource to be created.
     */
    public readonly collation!: pulumi.Output<string>;
    /**
     * Specifies the name of the MySQL Database, which needs [to be a valid MySQL identifier](https://dev.mysql.com/doc/refman/5.7/en/identifiers.html). Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    public readonly serverName!: pulumi.Output<string>;

    /**
     * Create a FlexibleDatabase resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlexibleDatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexibleDatabaseArgs | FlexibleDatabaseState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexibleDatabaseState | undefined;
            inputs["charset"] = state ? state.charset : undefined;
            inputs["collation"] = state ? state.collation : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["serverName"] = state ? state.serverName : undefined;
        } else {
            const args = argsOrState as FlexibleDatabaseArgs | undefined;
            if ((!args || args.charset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'charset'");
            }
            if ((!args || args.collation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collation'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serverName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverName'");
            }
            inputs["charset"] = args ? args.charset : undefined;
            inputs["collation"] = args ? args.collation : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["serverName"] = args ? args.serverName : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(FlexibleDatabase.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexibleDatabase resources.
 */
export interface FlexibleDatabaseState {
    /**
     * Specifies the Charset for the MySQL Database, which needs [to be a valid MySQL Charset](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html). Changing this forces a new resource to be created.
     */
    charset?: pulumi.Input<string>;
    /**
     * Specifies the Collation for the MySQL Database, which needs [to be a valid MySQL Collation](https://dev.mysql.com/doc/refman/5.7/en/charset-mysql.html). Changing this forces a new resource to be created.
     */
    collation?: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Database, which needs [to be a valid MySQL identifier](https://dev.mysql.com/doc/refman/5.7/en/identifiers.html). Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    serverName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexibleDatabase resource.
 */
export interface FlexibleDatabaseArgs {
    /**
     * Specifies the Charset for the MySQL Database, which needs [to be a valid MySQL Charset](https://dev.mysql.com/doc/refman/5.7/en/charset-charsets.html). Changing this forces a new resource to be created.
     */
    charset: pulumi.Input<string>;
    /**
     * Specifies the Collation for the MySQL Database, which needs [to be a valid MySQL Collation](https://dev.mysql.com/doc/refman/5.7/en/charset-mysql.html). Changing this forces a new resource to be created.
     */
    collation: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Database, which needs [to be a valid MySQL identifier](https://dev.mysql.com/doc/refman/5.7/en/identifiers.html). Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the resource group in which the MySQL Server exists. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the name of the MySQL Flexible Server. Changing this forces a new resource to be created.
     */
    serverName: pulumi.Input<string>;
}