// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CosmosdbDataConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final CosmosdbDataConnectionState Empty = new CosmosdbDataConnectionState();

    /**
     * The name of an existing container in the Cosmos DB database. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="cosmosdbContainerId")
    private @Nullable Output<String> cosmosdbContainerId;

    /**
     * @return The name of an existing container in the Cosmos DB database. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> cosmosdbContainerId() {
        return Optional.ofNullable(this.cosmosdbContainerId);
    }

    /**
     * The name of the database in the Kusto cluster. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="kustoDatabaseId")
    private @Nullable Output<String> kustoDatabaseId;

    /**
     * @return The name of the database in the Kusto cluster. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> kustoDatabaseId() {
        return Optional.ofNullable(this.kustoDatabaseId);
    }

    /**
     * The Azure Region where the Data Explorer should exist. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Data Explorer should exist. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource ID of a managed system or user-assigned identity. The identity is used to authenticate with Cosmos DB. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="managedIdentityId")
    private @Nullable Output<String> managedIdentityId;

    /**
     * @return The resource ID of a managed system or user-assigned identity. The identity is used to authenticate with Cosmos DB. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> managedIdentityId() {
        return Optional.ofNullable(this.managedIdentityId);
    }

    /**
     * The name of an existing mapping rule to use when ingesting the retrieved data. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="mappingRuleName")
    private @Nullable Output<String> mappingRuleName;

    /**
     * @return The name of an existing mapping rule to use when ingesting the retrieved data. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> mappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }

    /**
     * The name of the data connection. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the data connection. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If defined, the data connection retrieves Cosmos DB documents created or updated after the specified retrieval start date. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="retrievalStartDate")
    private @Nullable Output<String> retrievalStartDate;

    /**
     * @return If defined, the data connection retrieves Cosmos DB documents created or updated after the specified retrieval start date. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> retrievalStartDate() {
        return Optional.ofNullable(this.retrievalStartDate);
    }

    /**
     * The case-sensitive name of the existing target table in your cluster. Retrieved data is ingested into this table. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return The case-sensitive name of the existing target table in your cluster. Retrieved data is ingested into this table. Changing this forces a new Kusto Cosmos DB Connection to be created.
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private CosmosdbDataConnectionState() {}

    private CosmosdbDataConnectionState(CosmosdbDataConnectionState $) {
        this.cosmosdbContainerId = $.cosmosdbContainerId;
        this.kustoDatabaseId = $.kustoDatabaseId;
        this.location = $.location;
        this.managedIdentityId = $.managedIdentityId;
        this.mappingRuleName = $.mappingRuleName;
        this.name = $.name;
        this.retrievalStartDate = $.retrievalStartDate;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CosmosdbDataConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CosmosdbDataConnectionState $;

        public Builder() {
            $ = new CosmosdbDataConnectionState();
        }

        public Builder(CosmosdbDataConnectionState defaults) {
            $ = new CosmosdbDataConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cosmosdbContainerId The name of an existing container in the Cosmos DB database. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbContainerId(@Nullable Output<String> cosmosdbContainerId) {
            $.cosmosdbContainerId = cosmosdbContainerId;
            return this;
        }

        /**
         * @param cosmosdbContainerId The name of an existing container in the Cosmos DB database. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbContainerId(String cosmosdbContainerId) {
            return cosmosdbContainerId(Output.of(cosmosdbContainerId));
        }

        /**
         * @param kustoDatabaseId The name of the database in the Kusto cluster. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseId(@Nullable Output<String> kustoDatabaseId) {
            $.kustoDatabaseId = kustoDatabaseId;
            return this;
        }

        /**
         * @param kustoDatabaseId The name of the database in the Kusto cluster. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseId(String kustoDatabaseId) {
            return kustoDatabaseId(Output.of(kustoDatabaseId));
        }

        /**
         * @param location The Azure Region where the Data Explorer should exist. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Data Explorer should exist. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedIdentityId The resource ID of a managed system or user-assigned identity. The identity is used to authenticate with Cosmos DB. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedIdentityId(@Nullable Output<String> managedIdentityId) {
            $.managedIdentityId = managedIdentityId;
            return this;
        }

        /**
         * @param managedIdentityId The resource ID of a managed system or user-assigned identity. The identity is used to authenticate with Cosmos DB. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedIdentityId(String managedIdentityId) {
            return managedIdentityId(Output.of(managedIdentityId));
        }

        /**
         * @param mappingRuleName The name of an existing mapping rule to use when ingesting the retrieved data. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            $.mappingRuleName = mappingRuleName;
            return this;
        }

        /**
         * @param mappingRuleName The name of an existing mapping rule to use when ingesting the retrieved data. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder mappingRuleName(String mappingRuleName) {
            return mappingRuleName(Output.of(mappingRuleName));
        }

        /**
         * @param name The name of the data connection. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the data connection. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retrievalStartDate If defined, the data connection retrieves Cosmos DB documents created or updated after the specified retrieval start date. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder retrievalStartDate(@Nullable Output<String> retrievalStartDate) {
            $.retrievalStartDate = retrievalStartDate;
            return this;
        }

        /**
         * @param retrievalStartDate If defined, the data connection retrieves Cosmos DB documents created or updated after the specified retrieval start date. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder retrievalStartDate(String retrievalStartDate) {
            return retrievalStartDate(Output.of(retrievalStartDate));
        }

        /**
         * @param tableName The case-sensitive name of the existing target table in your cluster. Retrieved data is ingested into this table. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The case-sensitive name of the existing target table in your cluster. Retrieved data is ingested into this table. Changing this forces a new Kusto Cosmos DB Connection to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public CosmosdbDataConnectionState build() {
            return $;
        }
    }

}
