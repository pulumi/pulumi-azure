// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Allows you to set a user, group or service principal as the AAD Administrator for an Azure SQL Managed Instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as azuread from "@pulumi/azuread";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "rg-example",
 *     location: "West Europe",
 * });
 * const current = azure.core.getClientConfig({});
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("example", {
 *     name: "example",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     addressSpaces: ["10.0.0.0/16"],
 * });
 * const exampleSubnet = new azure.network.Subnet("example", {
 *     name: "example",
 *     resourceGroupName: example.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const exampleManagedInstance = new azure.mssql.ManagedInstance("example", {
 *     name: "managedsqlinstance",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     licenseType: "BasePrice",
 *     skuName: "GP_Gen5",
 *     storageSizeInGb: 32,
 *     subnetId: exampleSubnet.id,
 *     vcores: 4,
 *     administratorLogin: "msadministrator",
 *     administratorLoginPassword: "thisIsDog11",
 *     identity: {
 *         type: "SystemAssigned",
 *     },
 * });
 * const reader = new azuread.DirectoryRole("reader", {displayName: "Directory Readers"});
 * const exampleDirectoryRoleMember = new azuread.DirectoryRoleMember("example", {
 *     roleObjectId: reader.objectId,
 *     memberObjectId: exampleManagedInstance.identity.apply(identity => identity?.principalId),
 * });
 * const admin = new azuread.User("admin", {
 *     userPrincipalName: "ms.admin@example.com",
 *     displayName: "Ms Admin",
 *     mailNickname: "ms.admin",
 *     password: "SecretP@sswd99!",
 * });
 * const exampleManagedInstanceActiveDirectoryAdministrator = new azure.mssql.ManagedInstanceActiveDirectoryAdministrator("example", {
 *     managedInstanceId: exampleManagedInstance.id,
 *     loginUsername: "msadmin",
 *     objectId: admin.objectId,
 *     tenantId: current.then(current => current.tenantId),
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
 * An Azure SQL Active Directory Administrator can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator administrator /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/managedInstances/mymanagedinstance/administrators/activeDirectory
 * ```
 */
export class ManagedInstanceActiveDirectoryAdministrator extends pulumi.CustomResource {
    /**
     * Get an existing ManagedInstanceActiveDirectoryAdministrator resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedInstanceActiveDirectoryAdministratorState, opts?: pulumi.CustomResourceOptions): ManagedInstanceActiveDirectoryAdministrator {
        return new ManagedInstanceActiveDirectoryAdministrator(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator';

    /**
     * Returns true if the given object is an instance of ManagedInstanceActiveDirectoryAdministrator.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedInstanceActiveDirectoryAdministrator {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedInstanceActiveDirectoryAdministrator.__pulumiType;
    }

    /**
     * When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users.
     */
    public readonly azureadAuthenticationOnly!: pulumi.Output<boolean | undefined>;
    /**
     * The login name of the principal to set as the Managed Instance Administrator.
     */
    public readonly loginUsername!: pulumi.Output<string>;
    /**
     * The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
     */
    public readonly managedInstanceId!: pulumi.Output<string>;
    /**
     * The Object ID of the principal to set as the Managed Instance Administrator.
     */
    public readonly objectId!: pulumi.Output<string>;
    /**
     * The Azure Active Directory Tenant ID.
     */
    public readonly tenantId!: pulumi.Output<string>;

    /**
     * Create a ManagedInstanceActiveDirectoryAdministrator resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedInstanceActiveDirectoryAdministratorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedInstanceActiveDirectoryAdministratorArgs | ManagedInstanceActiveDirectoryAdministratorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedInstanceActiveDirectoryAdministratorState | undefined;
            resourceInputs["azureadAuthenticationOnly"] = state ? state.azureadAuthenticationOnly : undefined;
            resourceInputs["loginUsername"] = state ? state.loginUsername : undefined;
            resourceInputs["managedInstanceId"] = state ? state.managedInstanceId : undefined;
            resourceInputs["objectId"] = state ? state.objectId : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
        } else {
            const args = argsOrState as ManagedInstanceActiveDirectoryAdministratorArgs | undefined;
            if ((!args || args.loginUsername === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loginUsername'");
            }
            if ((!args || args.managedInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managedInstanceId'");
            }
            if ((!args || args.objectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'objectId'");
            }
            if ((!args || args.tenantId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantId'");
            }
            resourceInputs["azureadAuthenticationOnly"] = args ? args.azureadAuthenticationOnly : undefined;
            resourceInputs["loginUsername"] = args ? args.loginUsername : undefined;
            resourceInputs["managedInstanceId"] = args ? args.managedInstanceId : undefined;
            resourceInputs["objectId"] = args ? args.objectId : undefined;
            resourceInputs["tenantId"] = args ? args.tenantId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:sql/managedInstanceActiveDirectoryAdministrator:ManagedInstanceActiveDirectoryAdministrator" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(ManagedInstanceActiveDirectoryAdministrator.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedInstanceActiveDirectoryAdministrator resources.
 */
export interface ManagedInstanceActiveDirectoryAdministratorState {
    /**
     * When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users.
     */
    azureadAuthenticationOnly?: pulumi.Input<boolean>;
    /**
     * The login name of the principal to set as the Managed Instance Administrator.
     */
    loginUsername?: pulumi.Input<string>;
    /**
     * The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
     */
    managedInstanceId?: pulumi.Input<string>;
    /**
     * The Object ID of the principal to set as the Managed Instance Administrator.
     */
    objectId?: pulumi.Input<string>;
    /**
     * The Azure Active Directory Tenant ID.
     */
    tenantId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedInstanceActiveDirectoryAdministrator resource.
 */
export interface ManagedInstanceActiveDirectoryAdministratorArgs {
    /**
     * When `true`, only permit logins from AAD users and administrators. When `false`, also allow local database users.
     */
    azureadAuthenticationOnly?: pulumi.Input<boolean>;
    /**
     * The login name of the principal to set as the Managed Instance Administrator.
     */
    loginUsername: pulumi.Input<string>;
    /**
     * The ID of the Azure SQL Managed Instance for which to set the administrator. Changing this forces a new resource to be created.
     */
    managedInstanceId: pulumi.Input<string>;
    /**
     * The Object ID of the principal to set as the Managed Instance Administrator.
     */
    objectId: pulumi.Input<string>;
    /**
     * The Azure Active Directory Tenant ID.
     */
    tenantId: pulumi.Input<string>;
}
