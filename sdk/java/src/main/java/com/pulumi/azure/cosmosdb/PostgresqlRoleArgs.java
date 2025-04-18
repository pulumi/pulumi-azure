// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PostgresqlRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PostgresqlRoleArgs Empty = new PostgresqlRoleArgs();

    /**
     * The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
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
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password of the Azure Cosmos DB for PostgreSQL Role. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    private PostgresqlRoleArgs() {}

    private PostgresqlRoleArgs(PostgresqlRoleArgs $) {
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostgresqlRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostgresqlRoleArgs $;

        public Builder() {
            $ = new PostgresqlRoleArgs();
        }

        public Builder(PostgresqlRoleArgs defaults) {
            $ = new PostgresqlRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The resource ID of the Azure Cosmos DB for PostgreSQL Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
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
        public Builder password(Output<String> password) {
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

        public PostgresqlRoleArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("PostgresqlRoleArgs", "clusterId");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("PostgresqlRoleArgs", "password");
            }
            return $;
        }
    }

}
