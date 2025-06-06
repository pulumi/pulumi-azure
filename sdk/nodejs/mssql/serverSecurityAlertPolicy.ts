// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Security Alert Policy for a MSSQL Server.
 *
 * > **Note:** Security Alert Policy is currently only available for MS SQL databases.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 * import * as azurerm from "@pulumi/azurerm";
 *
 * const example = new azure.core.ResourceGroup("example", {
 *     name: "example-resources",
 *     location: "West Europe",
 * });
 * const exampleSqlServer = new azurerm.index.SqlServer("example", {
 *     name: "mysqlserver",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     version: "12.0",
 *     administratorLogin: "4dm1n157r470r",
 *     administratorLoginPassword: "4-v3ry-53cr37-p455w0rd",
 * });
 * const exampleAccount = new azure.storage.Account("example", {
 *     name: "accteststorageaccount",
 *     resourceGroupName: example.name,
 *     location: example.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "GRS",
 * });
 * const exampleServerSecurityAlertPolicy = new azure.mssql.ServerSecurityAlertPolicy("example", {
 *     resourceGroupName: example.name,
 *     serverName: exampleSqlServer.name,
 *     state: "Enabled",
 *     storageEndpoint: exampleAccount.primaryBlobEndpoint,
 *     storageAccountAccessKey: exampleAccount.primaryAccessKey,
 *     retentionDays: 20,
 *     disabledAlerts: [
 *         "Sql_Injection",
 *         "Data_Exfiltration",
 *     ],
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
 * MS SQL Server Security Alert Policy can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:mssql/serverSecurityAlertPolicy:ServerSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/acceptanceTestResourceGroup1/providers/Microsoft.Sql/servers/mssqlserver/securityAlertPolicies/Default
 * ```
 */
export class ServerSecurityAlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ServerSecurityAlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions): ServerSecurityAlertPolicy {
        return new ServerSecurityAlertPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/serverSecurityAlertPolicy:ServerSecurityAlertPolicy';

    /**
     * Returns true if the given object is an instance of ServerSecurityAlertPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServerSecurityAlertPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServerSecurityAlertPolicy.__pulumiType;
    }

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    public readonly disabledAlerts!: pulumi.Output<string[] | undefined>;
    /**
     * Are the alerts sent to the account administrators? Possible values are `true` or `false`. Defaults to `false`.
     */
    public readonly emailAccountAdmins!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    public readonly emailAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the resource group that contains the MS SQL Server. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the number of days to keep the Threat Detection audit logs. Defaults to `0`.
     */
    public readonly retentionDays!: pulumi.Output<number | undefined>;
    /**
     * Specifies the name of the MS SQL Server. Changing this forces a new resource to be created.
     */
    public readonly serverName!: pulumi.Output<string>;
    /**
     * Specifies the state of the policy. Possible values are `Disabled` or `Enabled`.
     */
    public readonly state!: pulumi.Output<string>;
    /**
     * Specifies the primary access key of the Threat Detection audit logs blob storage endpoint.
     *
     * > **Note:** The `storageAccountAccessKey` only applies if the storage account is not behind a virtual network or a firewall.
     */
    public readonly storageAccountAccessKey!: pulumi.Output<string | undefined>;
    /**
     * Specifies the blob storage endpoint that will hold all Threat Detection audit logs (e.g., `https://example.blob.core.windows.net`).
     *
     * > **Note:** The `storageAccountAccessKey` field is required when the `storageEndpoint` field has been set.
     *
     * > **Note:** Storage accounts configured with `sharedAccessKeyEnabled = false` cannot be used for the `storageEndpoint` field.
     */
    public readonly storageEndpoint!: pulumi.Output<string | undefined>;

    /**
     * Create a ServerSecurityAlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServerSecurityAlertPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerSecurityAlertPolicyArgs | ServerSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerSecurityAlertPolicyState | undefined;
            resourceInputs["disabledAlerts"] = state ? state.disabledAlerts : undefined;
            resourceInputs["emailAccountAdmins"] = state ? state.emailAccountAdmins : undefined;
            resourceInputs["emailAddresses"] = state ? state.emailAddresses : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["serverName"] = state ? state.serverName : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["storageAccountAccessKey"] = state ? state.storageAccountAccessKey : undefined;
            resourceInputs["storageEndpoint"] = state ? state.storageEndpoint : undefined;
        } else {
            const args = argsOrState as ServerSecurityAlertPolicyArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.serverName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serverName'");
            }
            if ((!args || args.state === undefined) && !opts.urn) {
                throw new Error("Missing required property 'state'");
            }
            resourceInputs["disabledAlerts"] = args ? args.disabledAlerts : undefined;
            resourceInputs["emailAccountAdmins"] = args ? args.emailAccountAdmins : undefined;
            resourceInputs["emailAddresses"] = args ? args.emailAddresses : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["serverName"] = args ? args.serverName : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["storageAccountAccessKey"] = args?.storageAccountAccessKey ? pulumi.secret(args.storageAccountAccessKey) : undefined;
            resourceInputs["storageEndpoint"] = args ? args.storageEndpoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["storageAccountAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServerSecurityAlertPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServerSecurityAlertPolicy resources.
 */
export interface ServerSecurityAlertPolicyState {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Are the alerts sent to the account administrators? Possible values are `true` or `false`. Defaults to `false`.
     */
    emailAccountAdmins?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the resource group that contains the MS SQL Server. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the name of the MS SQL Server. Changing this forces a new resource to be created.
     */
    serverName?: pulumi.Input<string>;
    /**
     * Specifies the state of the policy. Possible values are `Disabled` or `Enabled`.
     */
    state?: pulumi.Input<string>;
    /**
     * Specifies the primary access key of the Threat Detection audit logs blob storage endpoint.
     *
     * > **Note:** The `storageAccountAccessKey` only applies if the storage account is not behind a virtual network or a firewall.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint that will hold all Threat Detection audit logs (e.g., `https://example.blob.core.windows.net`).
     *
     * > **Note:** The `storageAccountAccessKey` field is required when the `storageEndpoint` field has been set.
     *
     * > **Note:** Storage accounts configured with `sharedAccessKeyEnabled = false` cannot be used for the `storageEndpoint` field.
     */
    storageEndpoint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServerSecurityAlertPolicy resource.
 */
export interface ServerSecurityAlertPolicyArgs {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Are the alerts sent to the account administrators? Possible values are `true` or `false`. Defaults to `false`.
     */
    emailAccountAdmins?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the resource group that contains the MS SQL Server. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the name of the MS SQL Server. Changing this forces a new resource to be created.
     */
    serverName: pulumi.Input<string>;
    /**
     * Specifies the state of the policy. Possible values are `Disabled` or `Enabled`.
     */
    state: pulumi.Input<string>;
    /**
     * Specifies the primary access key of the Threat Detection audit logs blob storage endpoint.
     *
     * > **Note:** The `storageAccountAccessKey` only applies if the storage account is not behind a virtual network or a firewall.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint that will hold all Threat Detection audit logs (e.g., `https://example.blob.core.windows.net`).
     *
     * > **Note:** The `storageAccountAccessKey` field is required when the `storageEndpoint` field has been set.
     *
     * > **Note:** Storage accounts configured with `sharedAccessKeyEnabled = false` cannot be used for the `storageEndpoint` field.
     */
    storageEndpoint?: pulumi.Input<string>;
}
