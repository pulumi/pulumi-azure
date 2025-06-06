// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Microsoft SQL Azure Database Server.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "database-rg",
 *     location: "West Europe",
 * });
 * const exampleServer = new azure.mssql.Server("example", {
 *     name: "mssqlserver",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     version: "12.0",
 *     administratorLogin: "missadministrator",
 *     administratorLoginPassword: "thisIsKat11",
 *     minimumTlsVersion: "1.2",
 *     azureadAdministrator: {
 *         loginUsername: "AzureAD Admin",
 *         objectId: "00000000-0000-0000-0000-000000000000",
 *     },
 *     tags: {
 *         environment: "production",
 *     },
 * });
 * ```
 *
 * ### Transparent Data Encryption (TDE) With A Customer Managed Key (CMK) During Create
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const current = azure.core.getClientConfig({});
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleUserAssignedIdentity = new azure.authorization.UserAssignedIdentity("example", {
 *     name: "example-admin",
 *     location: example.location,
 *     resourceGroupName: example.name,
 * });
 * // Create a key vault with access policies which allow for the current user to get, list, create, delete, update, recover, purge and getRotationPolicy for the key vault key and also add a key vault access policy for the Microsoft Sql Server instance User Managed Identity to get, wrap, and unwrap key(s)
 * const exampleKeyVault = new azure.keyvault.KeyVault("example", {
 *     name: "mssqltdeexample",
 *     location: example.location,
 *     resourceGroupName: example.name,
 *     enabledForDiskEncryption: true,
 *     tenantId: exampleUserAssignedIdentity.tenantId,
 *     softDeleteRetentionDays: 7,
 *     purgeProtectionEnabled: true,
 *     skuName: "standard",
 *     accessPolicies: [
 *         {
 *             tenantId: current.then(current => current.tenantId),
 *             objectId: current.then(current => current.objectId),
 *             keyPermissions: [
 *                 "Get",
 *                 "List",
 *                 "Create",
 *                 "Delete",
 *                 "Update",
 *                 "Recover",
 *                 "Purge",
 *                 "GetRotationPolicy",
 *             ],
 *         },
 *         {
 *             tenantId: exampleUserAssignedIdentity.tenantId,
 *             objectId: exampleUserAssignedIdentity.principalId,
 *             keyPermissions: [
 *                 "Get",
 *                 "WrapKey",
 *                 "UnwrapKey",
 *             ],
 *         },
 *     ],
 * });
 * const exampleKey = new azure.keyvault.Key("example", {
 *     name: "example-key",
 *     keyVaultId: exampleKeyVault.id,
 *     keyType: "RSA",
 *     keySize: 2048,
 *     keyOpts: [
 *         "unwrapKey",
 *         "wrapKey",
 *     ],
 * }, {
 *     dependsOn: [exampleKeyVault],
 * });
 * const exampleServer = new azure.mssql.Server("example", {
 *     name: "example-resource",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     version: "12.0",
 *     administratorLogin: "Example-Administrator",
 *     administratorLoginPassword: "Example_Password!",
 *     minimumTlsVersion: "1.2",
 *     azureadAdministrator: {
 *         loginUsername: exampleUserAssignedIdentity.name,
 *         objectId: exampleUserAssignedIdentity.principalId,
 *     },
 *     identity: {
 *         type: "UserAssigned",
 *         identityIds: [exampleUserAssignedIdentity.id],
 *     },
 *     primaryUserAssignedIdentityId: exampleUserAssignedIdentity.id,
 *     transparentDataEncryptionKeyVaultKeyId: exampleKey.id,
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
 * SQL Servers can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:mssql/server:Server example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myresourcegroup/providers/Microsoft.Sql/servers/myserver
 * ```
 */
export class Server extends pulumi.CustomResource {
    /**
     * Get an existing Server resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerState, opts?: pulumi.CustomResourceOptions): Server {
        return new Server(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/server:Server';

    /**
     * Returns true if the given object is an instance of Server.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Server {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Server.__pulumiType;
    }

    /**
     * The administrator login name for the new server. Required unless `azureadAuthenticationOnly` in the `azureadAdministrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
     */
    public readonly administratorLogin!: pulumi.Output<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx).
     */
    public readonly administratorLoginPassword!: pulumi.Output<string | undefined>;
    /**
     * An integer value used to trigger an update for `administratorLoginPasswordWo`. This property should be incremented when updating `administratorLoginPasswordWo`.
     */
    public readonly administratorLoginPasswordWoVersion!: pulumi.Output<number | undefined>;
    /**
     * An `azureadAdministrator` block as defined below.
     */
    public readonly azureadAdministrator!: pulumi.Output<outputs.mssql.ServerAzureadAdministrator | undefined>;
    /**
     * The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
     */
    public readonly connectionPolicy!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable the Express Vulnerability Assessment Configuration. Defaults to `false`.
     *
     * > **Note:** If you have enabled the Classic SQL Vulnerability Assessment configuration using the `azure.mssql.ServerVulnerabilityAssessment` resource, you must first delete it before enabling `expressVulnerabilityAssessmentEnabled`. If you wish to revert back to using the Classic SQL Vulnerability Assessment configuration you must first disable this setting.
     */
    public readonly expressVulnerabilityAssessmentEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The fully qualified domain name of the Azure SQL Server (e.g. myServerName.database.windows.net)
     */
    public /*out*/ readonly fullyQualifiedDomainName!: pulumi.Output<string>;
    /**
     * An `identity` block as defined below.
     */
    public readonly identity!: pulumi.Output<outputs.mssql.ServerIdentity | undefined>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` , `1.2` and `Disabled`. Defaults to `1.2`.
     *
     * > **Note:** The `minimumTlsVersion` is set to `Disabled` means all TLS versions are allowed. After you enforce a version of `minimumTlsVersion`, it's not possible to revert to `Disabled`.
     *
     * > **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     */
    public readonly minimumTlsVersion!: pulumi.Output<string | undefined>;
    /**
     * The name of the Microsoft SQL Server. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Whether outbound network traffic is restricted for this server. Defaults to `false`.
     */
    public readonly outboundNetworkRestrictionEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the primary user managed identity id. Required if `type` within the `identity` block is set to either `SystemAssigned, UserAssigned` or `UserAssigned` and should be set at same time as setting `identityIds`.
     */
    public readonly primaryUserAssignedIdentityId!: pulumi.Output<string>;
    /**
     * Whether public network access is allowed for this server. Defaults to `true`.
     */
    public readonly publicNetworkAccessEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the resource group in which to create the Microsoft SQL Server. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * A list of dropped restorable database IDs on the server.
     */
    public /*out*/ readonly restorableDroppedDatabaseIds!: pulumi.Output<string[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The fully versioned `Key Vault` `Key` URL (e.g. `'https://<YourVaultName>.vault.azure.net/keys/<YourKeyName>/<YourKeyVersion>`) to be used as the `Customer Managed Key`(CMK/BYOK) for the `Transparent Data Encryption`(TDE) layer.
     *
     * > **Note:** To successfully deploy a `Microsoft SQL Server` in CMK/BYOK TDE the `Key Vault` must have `Soft-delete` and `purge protection` enabled to protect from data loss due to accidental key and/or key vault deletion. The `Key Vault` and the `Microsoft SQL Server` `User Managed Identity Instance` must belong to the same `Azure Active Directory` `tenant`.
     *
     * > **Note:** Cross-tenant `Key Vault` and `Microsoft SQL Server` interactions are not supported. Please see the [product documentation](https://learn.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview?view=azuresql#requirements-for-configuring-customer-managed-tde) for more information.
     *
     * > **Note:** When using a firewall with a `Key Vault`, you must enable the option `Allow trusted Microsoft services to bypass the firewall`.
     */
    public readonly transparentDataEncryptionKeyVaultKeyId!: pulumi.Output<string | undefined>;
    /**
     * The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server). Changing this forces a new resource to be created.
     */
    public readonly version!: pulumi.Output<string>;

    /**
     * Create a Server resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerArgs | ServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerState | undefined;
            resourceInputs["administratorLogin"] = state ? state.administratorLogin : undefined;
            resourceInputs["administratorLoginPassword"] = state ? state.administratorLoginPassword : undefined;
            resourceInputs["administratorLoginPasswordWoVersion"] = state ? state.administratorLoginPasswordWoVersion : undefined;
            resourceInputs["azureadAdministrator"] = state ? state.azureadAdministrator : undefined;
            resourceInputs["connectionPolicy"] = state ? state.connectionPolicy : undefined;
            resourceInputs["expressVulnerabilityAssessmentEnabled"] = state ? state.expressVulnerabilityAssessmentEnabled : undefined;
            resourceInputs["fullyQualifiedDomainName"] = state ? state.fullyQualifiedDomainName : undefined;
            resourceInputs["identity"] = state ? state.identity : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["minimumTlsVersion"] = state ? state.minimumTlsVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outboundNetworkRestrictionEnabled"] = state ? state.outboundNetworkRestrictionEnabled : undefined;
            resourceInputs["primaryUserAssignedIdentityId"] = state ? state.primaryUserAssignedIdentityId : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = state ? state.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["restorableDroppedDatabaseIds"] = state ? state.restorableDroppedDatabaseIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["transparentDataEncryptionKeyVaultKeyId"] = state ? state.transparentDataEncryptionKeyVaultKeyId : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ServerArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["administratorLogin"] = args ? args.administratorLogin : undefined;
            resourceInputs["administratorLoginPassword"] = args?.administratorLoginPassword ? pulumi.secret(args.administratorLoginPassword) : undefined;
            resourceInputs["administratorLoginPasswordWoVersion"] = args ? args.administratorLoginPasswordWoVersion : undefined;
            resourceInputs["azureadAdministrator"] = args ? args.azureadAdministrator : undefined;
            resourceInputs["connectionPolicy"] = args ? args.connectionPolicy : undefined;
            resourceInputs["expressVulnerabilityAssessmentEnabled"] = args ? args.expressVulnerabilityAssessmentEnabled : undefined;
            resourceInputs["identity"] = args ? args.identity : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["minimumTlsVersion"] = args ? args.minimumTlsVersion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outboundNetworkRestrictionEnabled"] = args ? args.outboundNetworkRestrictionEnabled : undefined;
            resourceInputs["primaryUserAssignedIdentityId"] = args ? args.primaryUserAssignedIdentityId : undefined;
            resourceInputs["publicNetworkAccessEnabled"] = args ? args.publicNetworkAccessEnabled : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["transparentDataEncryptionKeyVaultKeyId"] = args ? args.transparentDataEncryptionKeyVaultKeyId : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["fullyQualifiedDomainName"] = undefined /*out*/;
            resourceInputs["restorableDroppedDatabaseIds"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "azure:sql/sqlServer:SqlServer" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        const secretOpts = { additionalSecretOutputs: ["administratorLoginPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Server.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Server resources.
 */
export interface ServerState {
    /**
     * The administrator login name for the new server. Required unless `azureadAuthenticationOnly` in the `azureadAdministrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
     */
    administratorLogin?: pulumi.Input<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx).
     */
    administratorLoginPassword?: pulumi.Input<string>;
    /**
     * An integer value used to trigger an update for `administratorLoginPasswordWo`. This property should be incremented when updating `administratorLoginPasswordWo`.
     */
    administratorLoginPasswordWoVersion?: pulumi.Input<number>;
    /**
     * An `azureadAdministrator` block as defined below.
     */
    azureadAdministrator?: pulumi.Input<inputs.mssql.ServerAzureadAdministrator>;
    /**
     * The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
     */
    connectionPolicy?: pulumi.Input<string>;
    /**
     * Whether to enable the Express Vulnerability Assessment Configuration. Defaults to `false`.
     *
     * > **Note:** If you have enabled the Classic SQL Vulnerability Assessment configuration using the `azure.mssql.ServerVulnerabilityAssessment` resource, you must first delete it before enabling `expressVulnerabilityAssessmentEnabled`. If you wish to revert back to using the Classic SQL Vulnerability Assessment configuration you must first disable this setting.
     */
    expressVulnerabilityAssessmentEnabled?: pulumi.Input<boolean>;
    /**
     * The fully qualified domain name of the Azure SQL Server (e.g. myServerName.database.windows.net)
     */
    fullyQualifiedDomainName?: pulumi.Input<string>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mssql.ServerIdentity>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` , `1.2` and `Disabled`. Defaults to `1.2`.
     *
     * > **Note:** The `minimumTlsVersion` is set to `Disabled` means all TLS versions are allowed. After you enforce a version of `minimumTlsVersion`, it's not possible to revert to `Disabled`.
     *
     * > **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     */
    minimumTlsVersion?: pulumi.Input<string>;
    /**
     * The name of the Microsoft SQL Server. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether outbound network traffic is restricted for this server. Defaults to `false`.
     */
    outboundNetworkRestrictionEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the primary user managed identity id. Required if `type` within the `identity` block is set to either `SystemAssigned, UserAssigned` or `UserAssigned` and should be set at same time as setting `identityIds`.
     */
    primaryUserAssignedIdentityId?: pulumi.Input<string>;
    /**
     * Whether public network access is allowed for this server. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which to create the Microsoft SQL Server. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * A list of dropped restorable database IDs on the server.
     */
    restorableDroppedDatabaseIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The fully versioned `Key Vault` `Key` URL (e.g. `'https://<YourVaultName>.vault.azure.net/keys/<YourKeyName>/<YourKeyVersion>`) to be used as the `Customer Managed Key`(CMK/BYOK) for the `Transparent Data Encryption`(TDE) layer.
     *
     * > **Note:** To successfully deploy a `Microsoft SQL Server` in CMK/BYOK TDE the `Key Vault` must have `Soft-delete` and `purge protection` enabled to protect from data loss due to accidental key and/or key vault deletion. The `Key Vault` and the `Microsoft SQL Server` `User Managed Identity Instance` must belong to the same `Azure Active Directory` `tenant`.
     *
     * > **Note:** Cross-tenant `Key Vault` and `Microsoft SQL Server` interactions are not supported. Please see the [product documentation](https://learn.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview?view=azuresql#requirements-for-configuring-customer-managed-tde) for more information.
     *
     * > **Note:** When using a firewall with a `Key Vault`, you must enable the option `Allow trusted Microsoft services to bypass the firewall`.
     */
    transparentDataEncryptionKeyVaultKeyId?: pulumi.Input<string>;
    /**
     * The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server). Changing this forces a new resource to be created.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Server resource.
 */
export interface ServerArgs {
    /**
     * The administrator login name for the new server. Required unless `azureadAuthenticationOnly` in the `azureadAdministrator` block is `true`. When omitted, Azure will generate a default username which cannot be subsequently changed. Changing this forces a new resource to be created.
     */
    administratorLogin?: pulumi.Input<string>;
    /**
     * The password associated with the `administratorLogin` user. Needs to comply with Azure's [Password Policy](https://msdn.microsoft.com/library/ms161959.aspx).
     */
    administratorLoginPassword?: pulumi.Input<string>;
    /**
     * An integer value used to trigger an update for `administratorLoginPasswordWo`. This property should be incremented when updating `administratorLoginPasswordWo`.
     */
    administratorLoginPasswordWoVersion?: pulumi.Input<number>;
    /**
     * An `azureadAdministrator` block as defined below.
     */
    azureadAdministrator?: pulumi.Input<inputs.mssql.ServerAzureadAdministrator>;
    /**
     * The connection policy the server will use. Possible values are `Default`, `Proxy`, and `Redirect`. Defaults to `Default`.
     */
    connectionPolicy?: pulumi.Input<string>;
    /**
     * Whether to enable the Express Vulnerability Assessment Configuration. Defaults to `false`.
     *
     * > **Note:** If you have enabled the Classic SQL Vulnerability Assessment configuration using the `azure.mssql.ServerVulnerabilityAssessment` resource, you must first delete it before enabling `expressVulnerabilityAssessmentEnabled`. If you wish to revert back to using the Classic SQL Vulnerability Assessment configuration you must first disable this setting.
     */
    expressVulnerabilityAssessmentEnabled?: pulumi.Input<boolean>;
    /**
     * An `identity` block as defined below.
     */
    identity?: pulumi.Input<inputs.mssql.ServerIdentity>;
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The Minimum TLS Version for all SQL Database and SQL Data Warehouse databases associated with the server. Valid values are: `1.0`, `1.1` , `1.2` and `Disabled`. Defaults to `1.2`.
     *
     * > **Note:** The `minimumTlsVersion` is set to `Disabled` means all TLS versions are allowed. After you enforce a version of `minimumTlsVersion`, it's not possible to revert to `Disabled`.
     *
     * > **Note:** Azure Services will require TLS 1.2+ by August 2025, please see this [announcement](https://azure.microsoft.com/en-us/updates/v2/update-retirement-tls1-0-tls1-1-versions-azure-services/) for more.
     */
    minimumTlsVersion?: pulumi.Input<string>;
    /**
     * The name of the Microsoft SQL Server. This needs to be globally unique within Azure. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether outbound network traffic is restricted for this server. Defaults to `false`.
     */
    outboundNetworkRestrictionEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the primary user managed identity id. Required if `type` within the `identity` block is set to either `SystemAssigned, UserAssigned` or `UserAssigned` and should be set at same time as setting `identityIds`.
     */
    primaryUserAssignedIdentityId?: pulumi.Input<string>;
    /**
     * Whether public network access is allowed for this server. Defaults to `true`.
     */
    publicNetworkAccessEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the resource group in which to create the Microsoft SQL Server. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The fully versioned `Key Vault` `Key` URL (e.g. `'https://<YourVaultName>.vault.azure.net/keys/<YourKeyName>/<YourKeyVersion>`) to be used as the `Customer Managed Key`(CMK/BYOK) for the `Transparent Data Encryption`(TDE) layer.
     *
     * > **Note:** To successfully deploy a `Microsoft SQL Server` in CMK/BYOK TDE the `Key Vault` must have `Soft-delete` and `purge protection` enabled to protect from data loss due to accidental key and/or key vault deletion. The `Key Vault` and the `Microsoft SQL Server` `User Managed Identity Instance` must belong to the same `Azure Active Directory` `tenant`.
     *
     * > **Note:** Cross-tenant `Key Vault` and `Microsoft SQL Server` interactions are not supported. Please see the [product documentation](https://learn.microsoft.com/azure/azure-sql/database/transparent-data-encryption-byok-overview?view=azuresql#requirements-for-configuring-customer-managed-tde) for more information.
     *
     * > **Note:** When using a firewall with a `Key Vault`, you must enable the option `Allow trusted Microsoft services to bypass the firewall`.
     */
    transparentDataEncryptionKeyVaultKeyId?: pulumi.Input<string>;
    /**
     * The version for the new server. Valid values are: 2.0 (for v11 server) and 12.0 (for v12 server). Changing this forces a new resource to be created.
     */
    version: pulumi.Input<string>;
}
