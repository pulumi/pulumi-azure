// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.SqlPoolSecurityAlertPolicyArgs;
import com.pulumi.azure.synapse.inputs.SqlPoolSecurityAlertPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Security Alert Policy for a Synapse SQL Pool.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Synapse SQL Pool Security Alert Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Synapse/workspaces/workspace1/sqlPools/sqlPool1/securityAlertPolicies/default
 * ```
 * 
 */
@ResourceType(type="azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy")
public class SqlPoolSecurityAlertPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     * 
     */
    @Export(name="disabledAlerts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> disabledAlerts;

    /**
     * @return Specifies an array of alerts that are disabled. Allowed values are: `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action`.
     * 
     */
    public Output<Optional<List<String>>> disabledAlerts() {
        return Codegen.optional(this.disabledAlerts);
    }
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     * 
     */
    @Export(name="emailAccountAdminsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> emailAccountAdminsEnabled;

    /**
     * @return Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> emailAccountAdminsEnabled() {
        return Codegen.optional(this.emailAccountAdminsEnabled);
    }
    /**
     * Specifies an array of email addresses to which the alert is sent.
     * 
     */
    @Export(name="emailAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> emailAddresses;

    /**
     * @return Specifies an array of email addresses to which the alert is sent.
     * 
     */
    public Output<Optional<List<String>>> emailAddresses() {
        return Codegen.optional(this.emailAddresses);
    }
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Possible values are `Disabled`, `Enabled` and `New`.
     * 
     */
    @Export(name="policyState", refs={String.class}, tree="[0]")
    private Output<String> policyState;

    /**
     * @return Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific SQL pool. Possible values are `Disabled`, `Enabled` and `New`.
     * 
     */
    public Output<String> policyState() {
        return this.policyState;
    }
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     * 
     */
    @Export(name="retentionDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }
    /**
     * Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sqlPoolId", refs={String.class}, tree="[0]")
    private Output<String> sqlPoolId;

    /**
     * @return Specifies the ID of the Synapse SQL Pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sqlPoolId() {
        return this.sqlPoolId;
    }
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @Export(name="storageAccountAccessKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageAccountAccessKey;

    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    public Output<Optional<String>> storageAccountAccessKey() {
        return Codegen.optional(this.storageAccountAccessKey);
    }
    /**
     * Specifies the blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @Export(name="storageEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageEndpoint;

    /**
     * @return Specifies the blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    public Output<Optional<String>> storageEndpoint() {
        return Codegen.optional(this.storageEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlPoolSecurityAlertPolicy(java.lang.String name) {
        this(name, SqlPoolSecurityAlertPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlPoolSecurityAlertPolicy(java.lang.String name, SqlPoolSecurityAlertPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlPoolSecurityAlertPolicy(java.lang.String name, SqlPoolSecurityAlertPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SqlPoolSecurityAlertPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable SqlPoolSecurityAlertPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/sqlPoolSecurityAlertPolicy:SqlPoolSecurityAlertPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static SqlPoolSecurityAlertPolicyArgs makeArgs(SqlPoolSecurityAlertPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SqlPoolSecurityAlertPolicyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "storageAccountAccessKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SqlPoolSecurityAlertPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable SqlPoolSecurityAlertPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolSecurityAlertPolicy(name, id, state, options);
    }
}
