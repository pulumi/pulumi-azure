// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.SqlDatabaseArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlDatabaseState;
import com.pulumi.azure.cosmosdb.outputs.SqlDatabaseAutoscaleSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a SQL Database within a Cosmos DB Account.
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
 *             .name("tfex-cosmos-sql-db")
 *             .resourceGroupName(example.resourceGroupName())
 *             .accountName(example.name())
 *             .throughput(400)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Cosmos SQL Database can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:cosmosdb/sqlDatabase:SqlDatabase db1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlDatabases/db1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/sqlDatabase:SqlDatabase")
public class SqlDatabase extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Cosmos DB SQL Database to create the table within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB SQL Database to create the table within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * 
     */
    @Export(name="autoscaleSettings", refs={SqlDatabaseAutoscaleSettings.class}, tree="[0]")
    private Output</* @Nullable */ SqlDatabaseAutoscaleSettings> autoscaleSettings;

    /**
     * @return An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * 
     */
    public Output<Optional<SqlDatabaseAutoscaleSettings>> autoscaleSettings() {
        return Codegen.optional(this.autoscaleSettings);
    }
    /**
     * Specifies the name of the Cosmos DB SQL Database. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB SQL Database. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="throughput", refs={Integer.class}, tree="[0]")
    private Output<Integer> throughput;

    public Output<Integer> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlDatabase(java.lang.String name) {
        this(name, SqlDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlDatabase(java.lang.String name, SqlDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlDatabase(java.lang.String name, SqlDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlDatabase:SqlDatabase", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SqlDatabase(java.lang.String name, Output<java.lang.String> id, @Nullable SqlDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlDatabase:SqlDatabase", name, state, makeResourceOptions(options, id), false);
    }

    private static SqlDatabaseArgs makeArgs(SqlDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SqlDatabaseArgs.Empty : args;
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
    public static SqlDatabase get(java.lang.String name, Output<java.lang.String> id, @Nullable SqlDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlDatabase(name, id, state, options);
    }
}
