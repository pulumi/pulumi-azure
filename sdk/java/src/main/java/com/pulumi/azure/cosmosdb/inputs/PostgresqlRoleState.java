// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PostgresqlRoleState extends com.pulumi.resources.ResourceArgs {

    public static final PostgresqlRoleState Empty = new PostgresqlRoleState();

    /**
     * The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * The name which should be used for this Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password of the Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password of the Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private PostgresqlRoleState() {}

    private PostgresqlRoleState(PostgresqlRoleState $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostgresqlRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgresqlRoleState $;

        public Builder() {
            $ = new PostgresqlRoleState();
        }

        public Builder(PostgresqlRoleState defaults) {
            $ = new PostgresqlRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param name The name which should be used for this Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password of the Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public PostgresqlRoleState build() {
            return $;
        }
    }

}