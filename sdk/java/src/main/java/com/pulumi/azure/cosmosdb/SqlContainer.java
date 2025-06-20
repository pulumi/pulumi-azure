// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.SqlContainerArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlContainerState;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerAutoscaleSettings;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerConflictResolutionPolicy;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerIndexingPolicy;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerUniqueKey;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a SQL Container within a Cosmos DB Account.
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
 * import com.pulumi.azure.cosmosdb.CosmosdbFunctions;
 * import com.pulumi.azure.cosmosdb.inputs.GetAccountArgs;
 * import com.pulumi.azure.cosmosdb.SqlDatabase;
 * import com.pulumi.azure.cosmosdb.SqlDatabaseArgs;
 * import com.pulumi.azure.cosmosdb.SqlContainer;
 * import com.pulumi.azure.cosmosdb.SqlContainerArgs;
 * import com.pulumi.azure.cosmosdb.inputs.SqlContainerIndexingPolicyArgs;
 * import com.pulumi.azure.cosmosdb.inputs.SqlContainerUniqueKeyArgs;
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
 *         final var example = CosmosdbFunctions.getAccount(GetAccountArgs.builder()
 *             .name("tfex-cosmosdb-account")
 *             .resourceGroupName("tfex-cosmosdb-account-rg")
 *             .build());
 * 
 *         var exampleSqlDatabase = new SqlDatabase("exampleSqlDatabase", SqlDatabaseArgs.builder()
 *             .name("example-acsd")
 *             .resourceGroupName(example.resourceGroupName())
 *             .accountName(example.name())
 *             .build());
 * 
 *         var exampleSqlContainer = new SqlContainer("exampleSqlContainer", SqlContainerArgs.builder()
 *             .name("example-container")
 *             .resourceGroupName(example.resourceGroupName())
 *             .accountName(example.name())
 *             .databaseName(exampleSqlDatabase.name())
 *             .partitionKeyPaths("/definition/id")
 *             .partitionKeyVersion(1)
 *             .throughput(400)
 *             .indexingPolicy(SqlContainerIndexingPolicyArgs.builder()
 *                 .indexingMode("consistent")
 *                 .includedPaths(                
 *                     SqlContainerIndexingPolicyIncludedPathArgs.builder()
 *                         .path("/*")
 *                         .build(),
 *                     SqlContainerIndexingPolicyIncludedPathArgs.builder()
 *                         .path("/included/?")
 *                         .build())
 *                 .excludedPaths(SqlContainerIndexingPolicyExcludedPathArgs.builder()
 *                     .path("/excluded/?")
 *                     .build())
 *                 .build())
 *             .uniqueKeys(SqlContainerUniqueKeyArgs.builder()
 *                 .paths(                
 *                     "/definition/idlong",
 *                     "/definition/idshort")
 *                 .build())
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
 * * `Microsoft.DocumentDB`: 2024-08-15
 * 
 * ## Import
 * 
 * Cosmos SQL Containers can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:cosmosdb/sqlContainer:SqlContainer example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlDatabases/database1/containers/container1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/sqlContainer:SqlContainer")
public class SqlContainer extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Cosmos DB Account to create the container within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Account to create the container within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The default time to live of Analytical Storage for this SQL container. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    @Export(name="analyticalStorageTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> analyticalStorageTtl;

    /**
     * @return The default time to live of Analytical Storage for this SQL container. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    public Output<Optional<Integer>> analyticalStorageTtl() {
        return Codegen.optional(this.analyticalStorageTtl);
    }
    /**
     * An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * 
     */
    @Export(name="autoscaleSettings", refs={SqlContainerAutoscaleSettings.class}, tree="[0]")
    private Output</* @Nullable */ SqlContainerAutoscaleSettings> autoscaleSettings;

    /**
     * @return An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * 
     */
    public Output<Optional<SqlContainerAutoscaleSettings>> autoscaleSettings() {
        return Codegen.optional(this.autoscaleSettings);
    }
    /**
     * A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="conflictResolutionPolicy", refs={SqlContainerConflictResolutionPolicy.class}, tree="[0]")
    private Output<SqlContainerConflictResolutionPolicy> conflictResolutionPolicy;

    /**
     * @return A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<SqlContainerConflictResolutionPolicy> conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }
    /**
     * The name of the Cosmos DB SQL Database to create the container within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the Cosmos DB SQL Database to create the container within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The default time to live of SQL container. If missing, items are not expired automatically. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    @Export(name="defaultTtl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultTtl;

    /**
     * @return The default time to live of SQL container. If missing, items are not expired automatically. If present and the value is set to `-1`, it is equal to infinity, and items don’t expire by default. If present and the value is set to some number `n` – items will expire `n` seconds after their last modified time.
     * 
     */
    public Output<Optional<Integer>> defaultTtl() {
        return Codegen.optional(this.defaultTtl);
    }
    /**
     * An `indexing_policy` block as defined below.
     * 
     */
    @Export(name="indexingPolicy", refs={SqlContainerIndexingPolicy.class}, tree="[0]")
    private Output<SqlContainerIndexingPolicy> indexingPolicy;

    /**
     * @return An `indexing_policy` block as defined below.
     * 
     */
    public Output<SqlContainerIndexingPolicy> indexingPolicy() {
        return this.indexingPolicy;
    }
    /**
     * Specifies the name of the Cosmos DB SQL Container. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB SQL Container. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Define a partition key kind. Possible values are `Hash` and `MultiHash`. Defaults to `Hash`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="partitionKeyKind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> partitionKeyKind;

    /**
     * @return Define a partition key kind. Possible values are `Hash` and `MultiHash`. Defaults to `Hash`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> partitionKeyKind() {
        return Codegen.optional(this.partitionKeyKind);
    }
    /**
     * A list of partition key paths. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="partitionKeyPaths", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> partitionKeyPaths;

    /**
     * @return A list of partition key paths. Changing this forces a new resource to be created.
     * 
     */
    public Output<List<String>> partitionKeyPaths() {
        return this.partitionKeyPaths;
    }
    /**
     * Define a partition key version. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     * 
     * &gt; **Note:** If `partition_key_version` is not specified when creating a new resource, you can update `partition_key_version` to `1`, updating to `2` forces a new resource to be created.
     * 
     */
    @Export(name="partitionKeyVersion", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> partitionKeyVersion;

    /**
     * @return Define a partition key version. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     * 
     * &gt; **Note:** If `partition_key_version` is not specified when creating a new resource, you can update `partition_key_version` to `1`, updating to `2` forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> partitionKeyVersion() {
        return Codegen.optional(this.partitionKeyVersion);
    }
    /**
     * The name of the resource group in which the Cosmos DB SQL Container is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB SQL Container is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The throughput of SQL container (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon container creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    @Export(name="throughput", refs={Integer.class}, tree="[0]")
    private Output<Integer> throughput;

    /**
     * @return The throughput of SQL container (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon container creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    public Output<Integer> throughput() {
        return this.throughput;
    }
    /**
     * One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="uniqueKeys", refs={List.class,SqlContainerUniqueKey.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SqlContainerUniqueKey>> uniqueKeys;

    /**
     * @return One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<SqlContainerUniqueKey>>> uniqueKeys() {
        return Codegen.optional(this.uniqueKeys);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlContainer(java.lang.String name) {
        this(name, SqlContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlContainer(java.lang.String name, SqlContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlContainer(java.lang.String name, SqlContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlContainer:SqlContainer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SqlContainer(java.lang.String name, Output<java.lang.String> id, @Nullable SqlContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlContainer:SqlContainer", name, state, makeResourceOptions(options, id), false);
    }

    private static SqlContainerArgs makeArgs(SqlContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SqlContainerArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SqlContainer get(java.lang.String name, Output<java.lang.String> id, @Nullable SqlContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlContainer(name, id, state, options);
    }
}
