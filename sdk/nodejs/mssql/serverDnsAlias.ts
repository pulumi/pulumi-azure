// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a MS SQL Server DNS Alias.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleServer = new azure.mssql.Server("example", {
 *     name: "example-sqlserver",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     version: "12.0",
 *     administratorLogin: "missadministrator",
 *     administratorLoginPassword: "AdminPassword123!",
 * });
 * const exampleServerDnsAlias = new azure.mssql.ServerDnsAlias("example", {
 *     name: "example-dns-alias",
 *     mssqlServerId: exampleServer.id,
 * });
 * ```
 *
 * ## API Providers
 *
 * <!-- This section is generated, changes will be overwritten -->
 * This resource uses the following Azure API Providers:
 *
 * * `Microsoft.Sql`: 2023-08-01-preview
 *
 * ## Import
 *
 * MSSQL Server DNS Aliass can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:mssql/serverDnsAlias:ServerDnsAlias example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/dnsAliases/default
 * ```
 */
export class ServerDnsAlias extends pulumi.CustomResource {
    /**
     * Get an existing ServerDnsAlias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerDnsAliasState, opts?: pulumi.CustomResourceOptions): ServerDnsAlias {
        return new ServerDnsAlias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/serverDnsAlias:ServerDnsAlias';

    /**
     * Returns true if the given object is an instance of ServerDnsAlias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerDnsAlias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerDnsAlias.__pulumiType;
    }

    /**
     * The fully qualified DNS record for alias.
     */
    public /*out*/ readonly dnsRecord!: pulumi.Output<string>;
    /**
     * The ID of the mssql server. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    public readonly mssqlServerId!: pulumi.Output<string>;
    /**
     * The name which should be used for this MSSQL Server DNS Alias. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ServerDnsAlias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerDnsAliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerDnsAliasArgs | ServerDnsAliasState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerDnsAliasState | undefined;
            resourceInputs["dnsRecord"] = state ? state.dnsRecord : undefined;
            resourceInputs["mssqlServerId"] = state ? state.mssqlServerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ServerDnsAliasArgs | undefined;
            if ((!args || args.mssqlServerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mssqlServerId'");
            }
            resourceInputs["mssqlServerId"] = args ? args.mssqlServerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["dnsRecord"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServerDnsAlias.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerDnsAlias resources.
 */
export interface ServerDnsAliasState {
    /**
     * The fully qualified DNS record for alias.
     */
    dnsRecord?: pulumi.Input<string>;
    /**
     * The ID of the mssql server. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    mssqlServerId?: pulumi.Input<string>;
    /**
     * The name which should be used for this MSSQL Server DNS Alias. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerDnsAlias resource.
 */
export interface ServerDnsAliasArgs {
    /**
     * The ID of the mssql server. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    mssqlServerId: pulumi.Input<string>;
    /**
     * The name which should be used for this MSSQL Server DNS Alias. Changing this forces a new MSSQL Server DNS Alias to be created.
     */
    name?: pulumi.Input<string>;
}
