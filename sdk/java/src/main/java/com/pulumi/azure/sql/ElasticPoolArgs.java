// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticPoolArgs Empty = new ElasticPoolArgs();

    /**
     * The maximum DTU which will be guaranteed to all databases in the elastic pool to be created.
     * 
     */
    @Import(name="dbDtuMax")
    private @Nullable Output<Integer> dbDtuMax;

    /**
     * @return The maximum DTU which will be guaranteed to all databases in the elastic pool to be created.
     * 
     */
    public Optional<Output<Integer>> dbDtuMax() {
        return Optional.ofNullable(this.dbDtuMax);
    }

    /**
     * The minimum DTU which will be guaranteed to all databases in the elastic pool to be created.
     * 
     */
    @Import(name="dbDtuMin")
    private @Nullable Output<Integer> dbDtuMin;

    /**
     * @return The minimum DTU which will be guaranteed to all databases in the elastic pool to be created.
     * 
     */
    public Optional<Output<Integer>> dbDtuMin() {
        return Optional.ofNullable(this.dbDtuMin);
    }

    /**
     * The total shared DTU for the elastic pool. Valid values depend on the `edition` which has been defined. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for valid combinations.
     * 
     */
    @Import(name="dtu", required=true)
    private Output<Integer> dtu;

    /**
     * @return The total shared DTU for the elastic pool. Valid values depend on the `edition` which has been defined. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for valid combinations.
     * 
     */
    public Output<Integer> dtu() {
        return this.dtu;
    }

    /**
     * The edition of the elastic pool to be created. Valid values are `Basic`, `Standard`, and `Premium`. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for details. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="edition", required=true)
    private Output<String> edition;

    /**
     * @return The edition of the elastic pool to be created. Valid values are `Basic`, `Standard`, and `Premium`. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for details. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The maximum size in MB that all databases in the elastic pool can grow to. The maximum size must be consistent with combination of `edition` and `dtu` and the limits documented in [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus). If not defined when creating an elastic pool, the value is set to the size implied by `edition` and `dtu`.
     * 
     */
    @Import(name="poolSize")
    private @Nullable Output<Integer> poolSize;

    /**
     * @return The maximum size in MB that all databases in the elastic pool can grow to. The maximum size must be consistent with combination of `edition` and `dtu` and the limits documented in [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus). If not defined when creating an elastic pool, the value is set to the size implied by `edition` and `dtu`.
     * 
     */
    public Optional<Output<Integer>> poolSize() {
        return Optional.ofNullable(this.poolSize);
    }

    /**
     * The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ElasticPoolArgs() {}

    private ElasticPoolArgs(ElasticPoolArgs $) {
        this.dbDtuMax = $.dbDtuMax;
        this.dbDtuMin = $.dbDtuMin;
        this.dtu = $.dtu;
        this.edition = $.edition;
        this.location = $.location;
        this.name = $.name;
        this.poolSize = $.poolSize;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticPoolArgs $;

        public Builder() {
            $ = new ElasticPoolArgs();
        }

        public Builder(ElasticPoolArgs defaults) {
            $ = new ElasticPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbDtuMax The maximum DTU which will be guaranteed to all databases in the elastic pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder dbDtuMax(@Nullable Output<Integer> dbDtuMax) {
            $.dbDtuMax = dbDtuMax;
            return this;
        }

        /**
         * @param dbDtuMax The maximum DTU which will be guaranteed to all databases in the elastic pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder dbDtuMax(Integer dbDtuMax) {
            return dbDtuMax(Output.of(dbDtuMax));
        }

        /**
         * @param dbDtuMin The minimum DTU which will be guaranteed to all databases in the elastic pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder dbDtuMin(@Nullable Output<Integer> dbDtuMin) {
            $.dbDtuMin = dbDtuMin;
            return this;
        }

        /**
         * @param dbDtuMin The minimum DTU which will be guaranteed to all databases in the elastic pool to be created.
         * 
         * @return builder
         * 
         */
        public Builder dbDtuMin(Integer dbDtuMin) {
            return dbDtuMin(Output.of(dbDtuMin));
        }

        /**
         * @param dtu The total shared DTU for the elastic pool. Valid values depend on the `edition` which has been defined. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for valid combinations.
         * 
         * @return builder
         * 
         */
        public Builder dtu(Output<Integer> dtu) {
            $.dtu = dtu;
            return this;
        }

        /**
         * @param dtu The total shared DTU for the elastic pool. Valid values depend on the `edition` which has been defined. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for valid combinations.
         * 
         * @return builder
         * 
         */
        public Builder dtu(Integer dtu) {
            return dtu(Output.of(dtu));
        }

        /**
         * @param edition The edition of the elastic pool to be created. Valid values are `Basic`, `Standard`, and `Premium`. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for details. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder edition(Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition The edition of the elastic pool to be created. Valid values are `Basic`, `Standard`, and `Premium`. Refer to [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus) for details. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the elastic pool. This needs to be globally unique. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param poolSize The maximum size in MB that all databases in the elastic pool can grow to. The maximum size must be consistent with combination of `edition` and `dtu` and the limits documented in [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus). If not defined when creating an elastic pool, the value is set to the size implied by `edition` and `dtu`.
         * 
         * @return builder
         * 
         */
        public Builder poolSize(@Nullable Output<Integer> poolSize) {
            $.poolSize = poolSize;
            return this;
        }

        /**
         * @param poolSize The maximum size in MB that all databases in the elastic pool can grow to. The maximum size must be consistent with combination of `edition` and `dtu` and the limits documented in [Azure SQL Database Service Tiers](https://docs.microsoft.com/en-gb/azure/sql-database/sql-database-service-tiers#elastic-pool-service-tiers-and-performance-in-edtus). If not defined when creating an elastic pool, the value is set to the size implied by `edition` and `dtu`.
         * 
         * @return builder
         * 
         */
        public Builder poolSize(Integer poolSize) {
            return poolSize(Output.of(poolSize));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the elastic pool. This must be the same as the resource group of the underlying SQL server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the SQL Server on which to create the elastic pool. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ElasticPoolArgs build() {
            $.dtu = Objects.requireNonNull($.dtu, "expected parameter 'dtu' to be non-null");
            $.edition = Objects.requireNonNull($.edition, "expected parameter 'edition' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}