// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputCosmosdbState extends com.pulumi.resources.ResourceArgs {

    public static final OutputCosmosdbState Empty = new OutputCosmosdbState();

    /**
     * The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
     * 
     */
    @Import(name="authenticationMode")
    private @Nullable Output<String> authenticationMode;

    /**
     * @return The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
     * 
     */
    public Optional<Output<String>> authenticationMode() {
        return Optional.ofNullable(this.authenticationMode);
    }

    /**
     * The name of the CosmosDB container.
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    /**
     * @return The name of the CosmosDB container.
     * 
     */
    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * The account key for the CosmosDB database.
     * 
     */
    @Import(name="cosmosdbAccountKey")
    private @Nullable Output<String> cosmosdbAccountKey;

    /**
     * @return The account key for the CosmosDB database.
     * 
     */
    public Optional<Output<String>> cosmosdbAccountKey() {
        return Optional.ofNullable(this.cosmosdbAccountKey);
    }

    /**
     * The ID of the CosmosDB database.
     * 
     */
    @Import(name="cosmosdbSqlDatabaseId")
    private @Nullable Output<String> cosmosdbSqlDatabaseId;

    /**
     * @return The ID of the CosmosDB database.
     * 
     */
    public Optional<Output<String>> cosmosdbSqlDatabaseId() {
        return Optional.ofNullable(this.cosmosdbSqlDatabaseId);
    }

    /**
     * The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    @Import(name="documentId")
    private @Nullable Output<String> documentId;

    /**
     * @return The name of the field in output events used to specify the primary key which insert or update operations are based on.
     * 
     */
    public Optional<Output<String>> documentId() {
        return Optional.ofNullable(this.documentId);
    }

    /**
     * The name of the Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Analytics Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the field in output events used to specify the key for partitioning output across collections. If `container_name` contains `{partition}` token, this property is required to be specified.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<String> partitionKey;

    /**
     * @return The name of the field in output events used to specify the key for partitioning output across collections. If `container_name` contains `{partition}` token, this property is required to be specified.
     * 
     */
    public Optional<Output<String>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobId")
    private @Nullable Output<String> streamAnalyticsJobId;

    /**
     * @return The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobId() {
        return Optional.ofNullable(this.streamAnalyticsJobId);
    }

    private OutputCosmosdbState() {}

    private OutputCosmosdbState(OutputCosmosdbState $) {
        this.authenticationMode = $.authenticationMode;
        this.containerName = $.containerName;
        this.cosmosdbAccountKey = $.cosmosdbAccountKey;
        this.cosmosdbSqlDatabaseId = $.cosmosdbSqlDatabaseId;
        this.documentId = $.documentId;
        this.name = $.name;
        this.partitionKey = $.partitionKey;
        this.streamAnalyticsJobId = $.streamAnalyticsJobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputCosmosdbState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputCosmosdbState $;

        public Builder() {
            $ = new OutputCosmosdbState();
        }

        public Builder(OutputCosmosdbState defaults) {
            $ = new OutputCosmosdbState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMode The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMode(@Nullable Output<String> authenticationMode) {
            $.authenticationMode = authenticationMode;
            return this;
        }

        /**
         * @param authenticationMode The authentication mode for the CosmosDB database. Possible values are `ConnectionString` and `Msi`. Defaults to `ConnectionString`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMode(String authenticationMode) {
            return authenticationMode(Output.of(authenticationMode));
        }

        /**
         * @param containerName The name of the CosmosDB container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the CosmosDB container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param cosmosdbAccountKey The account key for the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountKey(@Nullable Output<String> cosmosdbAccountKey) {
            $.cosmosdbAccountKey = cosmosdbAccountKey;
            return this;
        }

        /**
         * @param cosmosdbAccountKey The account key for the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbAccountKey(String cosmosdbAccountKey) {
            return cosmosdbAccountKey(Output.of(cosmosdbAccountKey));
        }

        /**
         * @param cosmosdbSqlDatabaseId The ID of the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbSqlDatabaseId(@Nullable Output<String> cosmosdbSqlDatabaseId) {
            $.cosmosdbSqlDatabaseId = cosmosdbSqlDatabaseId;
            return this;
        }

        /**
         * @param cosmosdbSqlDatabaseId The ID of the CosmosDB database.
         * 
         * @return builder
         * 
         */
        public Builder cosmosdbSqlDatabaseId(String cosmosdbSqlDatabaseId) {
            return cosmosdbSqlDatabaseId(Output.of(cosmosdbSqlDatabaseId));
        }

        /**
         * @param documentId The name of the field in output events used to specify the primary key which insert or update operations are based on.
         * 
         * @return builder
         * 
         */
        public Builder documentId(@Nullable Output<String> documentId) {
            $.documentId = documentId;
            return this;
        }

        /**
         * @param documentId The name of the field in output events used to specify the primary key which insert or update operations are based on.
         * 
         * @return builder
         * 
         */
        public Builder documentId(String documentId) {
            return documentId(Output.of(documentId));
        }

        /**
         * @param name The name of the Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Analytics Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionKey The name of the field in output events used to specify the key for partitioning output across collections. If `container_name` contains `{partition}` token, this property is required to be specified.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The name of the field in output events used to specify the key for partitioning output across collections. If `container_name` contains `{partition}` token, this property is required to be specified.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(@Nullable Output<String> streamAnalyticsJobId) {
            $.streamAnalyticsJobId = streamAnalyticsJobId;
            return this;
        }

        /**
         * @param streamAnalyticsJobId The ID of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobId(String streamAnalyticsJobId) {
            return streamAnalyticsJobId(Output.of(streamAnalyticsJobId));
        }

        public OutputCosmosdbState build() {
            return $;
        }
    }

}
