// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.azure.cosmosdb.inputs.GremlinGraphAutoscaleSettingsArgs;
import com.pulumi.azure.cosmosdb.inputs.GremlinGraphConflictResolutionPolicyArgs;
import com.pulumi.azure.cosmosdb.inputs.GremlinGraphIndexPolicyArgs;
import com.pulumi.azure.cosmosdb.inputs.GremlinGraphUniqueKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GremlinGraphState extends com.pulumi.resources.ResourceArgs {

    public static final GremlinGraphState Empty = new GremlinGraphState();

    /**
     * The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
     * 
     * &gt; **Note:** Disabling `analytical_storage_ttl` will force a new resource to be created since it can&#39;t be disabled once it&#39;s enabled.
     * 
     */
    @Import(name="analyticalStorageTtl")
    private @Nullable Output<Integer> analyticalStorageTtl;

    /**
     * @return The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
     * 
     * &gt; **Note:** Disabling `analytical_storage_ttl` will force a new resource to be created since it can&#39;t be disabled once it&#39;s enabled.
     * 
     */
    public Optional<Output<Integer>> analyticalStorageTtl() {
        return Optional.ofNullable(this.analyticalStorageTtl);
    }

    @Import(name="autoscaleSettings")
    private @Nullable Output<GremlinGraphAutoscaleSettingsArgs> autoscaleSettings;

    public Optional<Output<GremlinGraphAutoscaleSettingsArgs>> autoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }

    /**
     * A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="conflictResolutionPolicy")
    private @Nullable Output<GremlinGraphConflictResolutionPolicyArgs> conflictResolutionPolicy;

    /**
     * @return A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<GremlinGraphConflictResolutionPolicyArgs>> conflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }

    /**
     * The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The default time to live (TTL) of the Gremlin graph. If the value is missing or set to &#34;-1&#34;, items don’t expire.
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    /**
     * @return The default time to live (TTL) of the Gremlin graph. If the value is missing or set to &#34;-1&#34;, items don’t expire.
     * 
     */
    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * The configuration of the indexing policy. One or more `index_policy` blocks as defined below.
     * 
     */
    @Import(name="indexPolicy")
    private @Nullable Output<GremlinGraphIndexPolicyArgs> indexPolicy;

    /**
     * @return The configuration of the indexing policy. One or more `index_policy` blocks as defined below.
     * 
     */
    public Optional<Output<GremlinGraphIndexPolicyArgs>> indexPolicy() {
        return Optional.ofNullable(this.indexPolicy);
    }

    /**
     * Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Define a partition key. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="partitionKeyPath")
    private @Nullable Output<String> partitionKeyPath;

    /**
     * @return Define a partition key. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> partitionKeyPath() {
        return Optional.ofNullable(this.partitionKeyPath);
    }

    /**
     * Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     * 
     */
    @Import(name="partitionKeyVersion")
    private @Nullable Output<Integer> partitionKeyVersion;

    /**
     * @return Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
     * 
     */
    public Optional<Output<Integer>> partitionKeyVersion() {
        return Optional.ofNullable(this.partitionKeyVersion);
    }

    /**
     * The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     */
    @Import(name="throughput")
    private @Nullable Output<Integer> throughput;

    /**
     * @return The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
     * 
     */
    public Optional<Output<Integer>> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    /**
     * One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="uniqueKeys")
    private @Nullable Output<List<GremlinGraphUniqueKeyArgs>> uniqueKeys;

    /**
     * @return One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<GremlinGraphUniqueKeyArgs>>> uniqueKeys() {
        return Optional.ofNullable(this.uniqueKeys);
    }

    private GremlinGraphState() {}

    private GremlinGraphState(GremlinGraphState $) {
        this.accountName = $.accountName;
        this.analyticalStorageTtl = $.analyticalStorageTtl;
        this.autoscaleSettings = $.autoscaleSettings;
        this.conflictResolutionPolicy = $.conflictResolutionPolicy;
        this.databaseName = $.databaseName;
        this.defaultTtl = $.defaultTtl;
        this.indexPolicy = $.indexPolicy;
        this.name = $.name;
        this.partitionKeyPath = $.partitionKeyPath;
        this.partitionKeyVersion = $.partitionKeyVersion;
        this.resourceGroupName = $.resourceGroupName;
        this.throughput = $.throughput;
        this.uniqueKeys = $.uniqueKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GremlinGraphState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GremlinGraphState $;

        public Builder() {
            $ = new GremlinGraphState();
        }

        public Builder(GremlinGraphState defaults) {
            $ = new GremlinGraphState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the CosmosDB Account to create the Gremlin Graph within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param analyticalStorageTtl The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
         * 
         * &gt; **Note:** Disabling `analytical_storage_ttl` will force a new resource to be created since it can&#39;t be disabled once it&#39;s enabled.
         * 
         * @return builder
         * 
         */
        public Builder analyticalStorageTtl(@Nullable Output<Integer> analyticalStorageTtl) {
            $.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        /**
         * @param analyticalStorageTtl The time to live of Analytical Storage for this Cosmos DB Gremlin Graph. Possible values are between `-1` to `2147483647` not including `0`. If present and the value is set to `-1`, it means never expire.
         * 
         * &gt; **Note:** Disabling `analytical_storage_ttl` will force a new resource to be created since it can&#39;t be disabled once it&#39;s enabled.
         * 
         * @return builder
         * 
         */
        public Builder analyticalStorageTtl(Integer analyticalStorageTtl) {
            return analyticalStorageTtl(Output.of(analyticalStorageTtl));
        }

        public Builder autoscaleSettings(@Nullable Output<GremlinGraphAutoscaleSettingsArgs> autoscaleSettings) {
            $.autoscaleSettings = autoscaleSettings;
            return this;
        }

        public Builder autoscaleSettings(GremlinGraphAutoscaleSettingsArgs autoscaleSettings) {
            return autoscaleSettings(Output.of(autoscaleSettings));
        }

        /**
         * @param conflictResolutionPolicy A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(@Nullable Output<GremlinGraphConflictResolutionPolicyArgs> conflictResolutionPolicy) {
            $.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        /**
         * @param conflictResolutionPolicy A `conflict_resolution_policy` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(GremlinGraphConflictResolutionPolicyArgs conflictResolutionPolicy) {
            return conflictResolutionPolicy(Output.of(conflictResolutionPolicy));
        }

        /**
         * @param databaseName The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the Cosmos DB Graph Database in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param defaultTtl The default time to live (TTL) of the Gremlin graph. If the value is missing or set to &#34;-1&#34;, items don’t expire.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl The default time to live (TTL) of the Gremlin graph. If the value is missing or set to &#34;-1&#34;, items don’t expire.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param indexPolicy The configuration of the indexing policy. One or more `index_policy` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder indexPolicy(@Nullable Output<GremlinGraphIndexPolicyArgs> indexPolicy) {
            $.indexPolicy = indexPolicy;
            return this;
        }

        /**
         * @param indexPolicy The configuration of the indexing policy. One or more `index_policy` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder indexPolicy(GremlinGraphIndexPolicyArgs indexPolicy) {
            return indexPolicy(Output.of(indexPolicy));
        }

        /**
         * @param name Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Cosmos DB Gremlin Graph. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionKeyPath Define a partition key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(@Nullable Output<String> partitionKeyPath) {
            $.partitionKeyPath = partitionKeyPath;
            return this;
        }

        /**
         * @param partitionKeyPath Define a partition key. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(String partitionKeyPath) {
            return partitionKeyPath(Output.of(partitionKeyPath));
        }

        /**
         * @param partitionKeyVersion Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyVersion(@Nullable Output<Integer> partitionKeyVersion) {
            $.partitionKeyVersion = partitionKeyVersion;
            return this;
        }

        /**
         * @param partitionKeyVersion Define a partition key version. Changing this forces a new resource to be created. Possible values are `1`and `2`. This should be set to `2` in order to use large partition keys.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyVersion(Integer partitionKeyVersion) {
            return partitionKeyVersion(Output.of(partitionKeyVersion));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Cosmos DB Gremlin Graph is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param throughput The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder throughput(@Nullable Output<Integer> throughput) {
            $.throughput = throughput;
            return this;
        }

        /**
         * @param throughput The throughput of the Gremlin graph (RU/s). Must be set in increments of `100`. The minimum value is `400`. This must be set upon database creation otherwise it cannot be updated without a manual destroy-apply.
         * 
         * @return builder
         * 
         */
        public Builder throughput(Integer throughput) {
            return throughput(Output.of(throughput));
        }

        /**
         * @param uniqueKeys One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder uniqueKeys(@Nullable Output<List<GremlinGraphUniqueKeyArgs>> uniqueKeys) {
            $.uniqueKeys = uniqueKeys;
            return this;
        }

        /**
         * @param uniqueKeys One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder uniqueKeys(List<GremlinGraphUniqueKeyArgs> uniqueKeys) {
            return uniqueKeys(Output.of(uniqueKeys));
        }

        /**
         * @param uniqueKeys One or more `unique_key` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder uniqueKeys(GremlinGraphUniqueKeyArgs... uniqueKeys) {
            return uniqueKeys(List.of(uniqueKeys));
        }

        public GremlinGraphState build() {
            return $;
        }
    }

}
