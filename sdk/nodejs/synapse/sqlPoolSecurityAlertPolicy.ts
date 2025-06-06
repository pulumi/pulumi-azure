// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Security Alert Policy for a Synapse SQL Pool.
 *
 * ## Import
 *
 * Synapse SQL Pool Security Alert Policies can be imported using the `resource id`, e.g.
 *
 * ```sh
 * $ pulumi import azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/sqlPools/sqlPool1/securityAlertPolicies/default
 * ```
 */
export class SqlPoolSecurityAlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SqlPoolSecurityAlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlPoolSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions): SqlPoolSecurityAlertPolicy {
        return new SqlPoolSecurityAlertPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy';

    /**
     * Returns true if the given object is an instance of SqlPoolSecurityAlertPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlPoolSecurityAlertPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlPoolSecurityAlertPolicy.__pulumiType;
    }

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    public readonly disabledAlerts!: pulumi.Output<string[] | undefined>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    public readonly emailAccountAdminsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    public readonly emailAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Possible values are `Disabled`, `Enabled` and `New`.
     */
    public readonly policyState!: pulumi.Output<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    public readonly retentionDays!: pulumi.Output<number | undefined>;
    /**
     * Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
     */
    public readonly sqlPoolId!: pulumi.Output<string>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     */
    public readonly storageAccountAccessKey!: pulumi.Output<string | undefined>;
    /**
     * Specifies the blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all Threat Detection audit logs.
     */
    public readonly storageEndpoint!: pulumi.Output<string | undefined>;

    /**
     * Create a SqlPoolSecurityAlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SqlPoolSecurityAlertPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlPoolSecurityAlertPolicyArgs | SqlPoolSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlPoolSecurityAlertPolicyState | undefined;
            resourceInputs["disabledAlerts"] = state ? state.disabledAlerts : undefined;
            resourceInputs["emailAccountAdminsEnabled"] = state ? state.emailAccountAdminsEnabled : undefined;
            resourceInputs["emailAddresses"] = state ? state.emailAddresses : undefined;
            resourceInputs["policyState"] = state ? state.policyState : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["sqlPoolId"] = state ? state.sqlPoolId : undefined;
            resourceInputs["storageAccountAccessKey"] = state ? state.storageAccountAccessKey : undefined;
            resourceInputs["storageEndpoint"] = state ? state.storageEndpoint : undefined;
        } else {
            const args = argsOrState as SqlPoolSecurityAlertPolicyArgs | undefined;
            if ((!args || args.policyState === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyState'");
            }
            if ((!args || args.sqlPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sqlPoolId'");
            }
            resourceInputs["disabledAlerts"] = args ? args.disabledAlerts : undefined;
            resourceInputs["emailAccountAdminsEnabled"] = args ? args.emailAccountAdminsEnabled : undefined;
            resourceInputs["emailAddresses"] = args ? args.emailAddresses : undefined;
            resourceInputs["policyState"] = args ? args.policyState : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["sqlPoolId"] = args ? args.sqlPoolId : undefined;
            resourceInputs["storageAccountAccessKey"] = args?.storageAccountAccessKey ? pulumi.secret(args.storageAccountAccessKey) : undefined;
            resourceInputs["storageEndpoint"] = args ? args.storageEndpoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["storageAccountAccessKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SqlPoolSecurityAlertPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlPoolSecurityAlertPolicy resources.
 */
export interface SqlPoolSecurityAlertPolicyState {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    emailAccountAdminsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Possible values are `Disabled`, `Enabled` and `New`.
     */
    policyState?: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
     */
    sqlPoolId?: pulumi.Input<string>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all Threat Detection audit logs.
     */
    storageEndpoint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SqlPoolSecurityAlertPolicy resource.
 */
export interface SqlPoolSecurityAlertPolicyArgs {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    emailAccountAdminsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Possible values are `Disabled`, `Enabled` and `New`.
     */
    policyState: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
     */
    sqlPoolId: pulumi.Input<string>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint (e.g. <https://example.blob.core.windows.net>). This blob storage will hold all Threat Detection audit logs.
     */
    storageEndpoint?: pulumi.Input<string>;
}
