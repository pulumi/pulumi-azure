// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.CassandraTableArgs;
import com.pulumi.azure.cosmosdb.inputs.CassandraTableState;
import com.pulumi.azure.cosmosdb.outputs.CassandraTableAutoscaleSettings;
import com.pulumi.azure.cosmosdb.outputs.CassandraTableSchema;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cassandra Table within a Cosmos DB Cassandra Keyspace.
 * 
 * ## Example Usage
 * ```java
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
 * import com.pulumi.azure.cosmosdb.CassandraTable;
 * import com.pulumi.azure.cosmosdb.CassandraTableArgs;
 * import com.pulumi.azure.cosmosdb.inputs.CassandraTableSchemaArgs;
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .offerType(&#34;Standard&#34;)
 *             .capabilities(AccountCapabilityArgs.builder()
 *                 .name(&#34;EnableCassandra&#34;)
 *                 .build())
 *             .consistencyPolicy(AccountConsistencyPolicyArgs.builder()
 *                 .consistencyLevel(&#34;Strong&#34;)
 *                 .build())
 *             .geoLocations(AccountGeoLocationArgs.builder()
 *                 .location(exampleResourceGroup.location())
 *                 .failoverPriority(0)
 *                 .build())
 *             .build());
 * 
 *         var exampleCassandraKeyspace = new CassandraKeyspace(&#34;exampleCassandraKeyspace&#34;, CassandraKeyspaceArgs.builder()        
 *             .resourceGroupName(exampleAccount.resourceGroupName())
 *             .accountName(exampleAccount.name())
 *             .throughput(400)
 *             .build());
 * 
 *         var exampleCassandraTable = new CassandraTable(&#34;exampleCassandraTable&#34;, CassandraTableArgs.builder()        
 *             .cassandraKeyspaceId(exampleCassandraKeyspace.id())
 *             .schema(CassandraTableSchemaArgs.builder()
 *                 .columns(                
 *                     CassandraTableSchemaColumnArgs.builder()
 *                         .name(&#34;test1&#34;)
 *                         .type(&#34;ascii&#34;)
 *                         .build(),
 *                     CassandraTableSchemaColumnArgs.builder()
 *                         .name(&#34;test2&#34;)
 *                         .type(&#34;int&#34;)
 *                         .build())
 *                 .partitionKeys(CassandraTableSchemaPartitionKeyArgs.builder()
 *                     .name(&#34;test1&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cosmos Cassandra Table can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cosmosdb/cassandraTable:CassandraTable ks1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/cassandraKeyspaces/ks1/tables/table1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/cassandraTable:CassandraTable")
public class CassandraTable extends com.pulumi.resources.CustomResource {
    /**
     * Time to live of the Analytical Storage. Possible values are at least `-1`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="analyticalStorageTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> analyticalStorageTtl;

    /**
     * @return Time to live of the Analytical Storage. Possible values are at least `-1`. `-1` means the Analytical Storage never expires. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> analyticalStorageTtl() {
        return Codegen.optional(this.analyticalStorageTtl);
    }
    @Export(name="autoscaleSettings", type=CassandraTableAutoscaleSettings.class, parameters={})
    private Output</* @Nullable */ CassandraTableAutoscaleSettings> autoscaleSettings;

    public Output<Optional<CassandraTableAutoscaleSettings>> autoscaleSettings() {
        return Codegen.optional(this.autoscaleSettings);
    }
    /**
     * The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="cassandraKeyspaceId", type=String.class, parameters={})
    private Output<String> cassandraKeyspaceId;

    /**
     * @return The ID of the Cosmos DB Cassandra Keyspace to create the table within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> cassandraKeyspaceId() {
        return this.cassandraKeyspaceId;
    }
    /**
     * Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
     * 
     */
    @Export(name="defaultTtl", type=Integer.class, parameters={})
    private Output<Integer> defaultTtl;

    /**
     * @return Time to live of the Cosmos DB Cassandra table. Possible values are at least `-1`. `-1` means the Cassandra table never expires.
     * 
     */
    public Output<Integer> defaultTtl() {
        return this.defaultTtl;
    }
    /**
     * Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB Cassandra Table. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `schema` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="schema", type=CassandraTableSchema.class, parameters={})
    private Output<CassandraTableSchema> schema;

    /**
     * @return A `schema` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<CassandraTableSchema> schema() {
        return this.schema;
    }
    @Export(name="throughput", type=Integer.class, parameters={})
    private Output<Integer> throughput;

    public Output<Integer> throughput() {
        return this.throughput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CassandraTable(String name) {
        this(name, CassandraTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraTable(String name, CassandraTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraTable(String name, CassandraTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/cassandraTable:CassandraTable", name, args == null ? CassandraTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CassandraTable(String name, Output<String> id, @Nullable CassandraTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/cassandraTable:CassandraTable", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static CassandraTable get(String name, Output<String> id, @Nullable CassandraTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CassandraTable(name, id, state, options);
    }
}