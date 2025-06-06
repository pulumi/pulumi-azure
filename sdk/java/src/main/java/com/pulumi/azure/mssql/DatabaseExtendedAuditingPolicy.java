// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs;
import com.pulumi.azure.mssql.inputs.DatabaseExtendedAuditingPolicyState;
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
 * Manages a MS SQL Database Extended Auditing Policy.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.mssql.Server;
 * import com.pulumi.azure.mssql.ServerArgs;
 * import com.pulumi.azure.mssql.Database;
 * import com.pulumi.azure.mssql.DatabaseArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicy;
 * import com.pulumi.azure.mssql.DatabaseExtendedAuditingPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ResourceGroup("example", ResourceGroupArgs.builder()
 *             .name("example-resources")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleServer = new Server("exampleServer", ServerArgs.builder()
 *             .name("example-sqlserver")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .version("12.0")
 *             .administratorLogin("missadministrator")
 *             .administratorLoginPassword("AdminPassword123!")
 *             .build());
 * 
 *         var exampleDatabase = new Database("exampleDatabase", DatabaseArgs.builder()
 *             .name("example-db")
 *             .serverId(exampleServer.id())
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("examplesa")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .accountTier("Standard")
 *             .accountReplicationType("LRS")
 *             .build());
 * 
 *         var exampleDatabaseExtendedAuditingPolicy = new DatabaseExtendedAuditingPolicy("exampleDatabaseExtendedAuditingPolicy", DatabaseExtendedAuditingPolicyArgs.builder()
 *             .databaseId(exampleDatabase.id())
 *             .storageEndpoint(exampleAccount.primaryBlobEndpoint())
 *             .storageAccountAccessKey(exampleAccount.primaryAccessKey())
 *             .storageAccountAccessKeyIsSecondary(false)
 *             .retentionInDays(6)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## API Providers
 * 
 * &lt;!-- This section is generated, changes will be overwritten --&gt;
 * This resource uses the following Azure API Providers:
 * 
 * * `Microsoft.Sql`: 2023-08-01-preview
 * 
 * ## Import
 * 
 * MS SQL Database Extended Auditing Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Sql/servers/sqlServer1/databases/db1/extendedAuditingSettings/default
 * ```
 * 
 */
@ResourceType(type="azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy")
public class DatabaseExtendedAuditingPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="databaseId", refs={String.class}, tree="[0]")
    private Output<String> databaseId;

    /**
     * @return The ID of the SQL database to set the extended auditing policy. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseId() {
        return this.databaseId;
    }
    /**
     * Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable the extended auditing policy. Possible values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** If `enabled` is `true`, `storage_endpoint` or `log_monitoring_enabled` are required.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Enable audit events to Azure Monitor? Defaults to `true`.
     * 
     * &gt; **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
     * To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
     * 
     */
    @Export(name="logMonitoringEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logMonitoringEnabled;

    /**
     * @return Enable audit events to Azure Monitor? Defaults to `true`.
     * 
     * &gt; **Note:** To enable sending audit events to Log Analytics, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_log_analytics` directory within the GitHub Repository.  To enable sending server audit events to Log Analytics, please enable the master database to send audit events to Log Analytics.
     * To enable audit events to Eventhub, please refer to the example which can be found in the `./examples/sql-azure/sql_auditing_eventhub` directory within the GitHub Repository.
     * 
     */
    public Output<Optional<Boolean>> logMonitoringEnabled() {
        return Codegen.optional(this.logMonitoringEnabled);
    }
    /**
     * The number of days to retain logs for in the storage account. Defaults to `0`.
     * 
     */
    @Export(name="retentionInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionInDays;

    /**
     * @return The number of days to retain logs for in the storage account. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> retentionInDays() {
        return Codegen.optional(this.retentionInDays);
    }
    /**
     * The access key to use for the auditing storage account.
     * 
     */
    @Export(name="storageAccountAccessKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageAccountAccessKey;

    /**
     * @return The access key to use for the auditing storage account.
     * 
     */
    public Output<Optional<String>> storageAccountAccessKey() {
        return Codegen.optional(this.storageAccountAccessKey);
    }
    /**
     * Is `storage_account_access_key` value the storage&#39;s secondary key?
     * 
     */
    @Export(name="storageAccountAccessKeyIsSecondary", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> storageAccountAccessKeyIsSecondary;

    /**
     * @return Is `storage_account_access_key` value the storage&#39;s secondary key?
     * 
     */
    public Output<Optional<Boolean>> storageAccountAccessKeyIsSecondary() {
        return Codegen.optional(this.storageAccountAccessKeyIsSecondary);
    }
    /**
     * The blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all extended auditing logs.
     * 
     */
    @Export(name="storageEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageEndpoint;

    /**
     * @return The blob storage endpoint (e.g. &lt;https://example.blob.core.windows.net&gt;). This blob storage will hold all extended auditing logs.
     * 
     */
    public Output<Optional<String>> storageEndpoint() {
        return Codegen.optional(this.storageEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseExtendedAuditingPolicy(java.lang.String name) {
        this(name, DatabaseExtendedAuditingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseExtendedAuditingPolicy(java.lang.String name, DatabaseExtendedAuditingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseExtendedAuditingPolicy(java.lang.String name, DatabaseExtendedAuditingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DatabaseExtendedAuditingPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseExtendedAuditingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/databaseExtendedAuditingPolicy:DatabaseExtendedAuditingPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static DatabaseExtendedAuditingPolicyArgs makeArgs(DatabaseExtendedAuditingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DatabaseExtendedAuditingPolicyArgs.Empty : args;
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
    public static DatabaseExtendedAuditingPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable DatabaseExtendedAuditingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseExtendedAuditingPolicy(name, id, state, options);
    }
}
