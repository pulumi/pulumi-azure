// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs;
import com.pulumi.azure.cosmosdb.inputs.CassandraKeyspaceState;
import com.pulumi.azure.cosmosdb.outputs.CassandraKeyspaceAutoscaleSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cassandra KeySpace within a Cosmos DB Account.
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
 * import com.pulumi.azure.cosmosdb.Account;
 * import com.pulumi.azure.cosmosdb.AccountArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountCapabilityArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountConsistencyPolicyArgs;
 * import com.pulumi.azure.cosmosdb.inputs.AccountGeoLocationArgs;
 * import com.pulumi.azure.cosmosdb.CassandraKeyspace;
 * import com.pulumi.azure.cosmosdb.CassandraKeyspaceArgs;
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
 *             .name("tflex-cosmosdb-account-rg")
 *             .location("West Europe")
 *             .build());
 * 
 *         var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
 *             .name("tfex-cosmosdb-account")
 *             .resourceGroupName(example.name())
 *             .location(example.location())
 *             .offerType("Standard")
 *             .capabilities(AccountCapabilityArgs.builder()
 *                 .name("EnableCassandra")
 *                 .build())
 *             .consistencyPolicy(AccountConsistencyPolicyArgs.builder()
 *                 .consistencyLevel("Strong")
 *                 .build())
 *             .geoLocations(AccountGeoLocationArgs.builder()
 *                 .location(example.location())
 *                 .failoverPriority(0)
 *                 .build())
 *             .build());
 * 
 *         var exampleCassandraKeyspace = new CassandraKeyspace("exampleCassandraKeyspace", CassandraKeyspaceArgs.builder()
 *             .name("tfex-cosmos-cassandra-keyspace")
 *             .resourceGroupName(exampleAccount.resourceGroupName())
 *             .accountName(exampleAccount.name())
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
 * Cosmos Cassandra KeySpace can be imported using the `resource id`, e.g.
 * 
 * ```sh
 * $ pulumi import azure:cosmosdb/cassandraKeyspace:CassandraKeyspace ks1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/cassandraKeyspaces/ks1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/cassandraKeyspace:CassandraKeyspace")
public class CassandraKeyspace extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Cosmos DB Cassandra KeySpace to create the table within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Cassandra KeySpace to create the table within. Changing this forces a new resource to be created.
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
    @Export(name="autoscaleSettings", refs={CassandraKeyspaceAutoscaleSettings.class}, tree="[0]")
    private Output</* @Nullable */ CassandraKeyspaceAutoscaleSettings> autoscaleSettings;

    /**
     * @return An `autoscale_settings` block as defined below. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     * &gt; **Note:** Switching between autoscale and manual throughput is not supported via this provider and must be completed via the Azure Portal and refreshed.
     * 
     */
    public Output<Optional<CassandraKeyspaceAutoscaleSettings>> autoscaleSettings() {
        return Codegen.optional(this.autoscaleSettings);
    }
    /**
     * Specifies the name of the Cosmos DB Cassandra KeySpace. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB Cassandra KeySpace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Cosmos DB Cassandra KeySpace is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB Cassandra KeySpace is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The throughput of Cassandra KeySpace (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    @Export(name="throughput", refs={Integer.class}, tree="[0]")
    private Output<Integer> throughput;

    /**
     * @return The throughput of Cassandra KeySpace (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual resource destroy-apply.
     * 
     */
    public Output<Integer> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CassandraKeyspace(java.lang.String name) {
        this(name, CassandraKeyspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraKeyspace(java.lang.String name, CassandraKeyspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraKeyspace(java.lang.String name, CassandraKeyspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/cassandraKeyspace:CassandraKeyspace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CassandraKeyspace(java.lang.String name, Output<java.lang.String> id, @Nullable CassandraKeyspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/cassandraKeyspace:CassandraKeyspace", name, state, makeResourceOptions(options, id), false);
    }

    private static CassandraKeyspaceArgs makeArgs(CassandraKeyspaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CassandraKeyspaceArgs.Empty : args;
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
    public static CassandraKeyspace get(java.lang.String name, Output<java.lang.String> id, @Nullable CassandraKeyspaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CassandraKeyspace(name, id, state, options);
    }
}
