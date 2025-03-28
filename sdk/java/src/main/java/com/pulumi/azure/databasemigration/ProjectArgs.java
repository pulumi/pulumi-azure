// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databasemigration;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

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
     * Specify the name of the database migration project. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specify the name of the database migration project. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the resource group in which to create the database migration project. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group in which to create the database migration project. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the database migration service where resource belongs to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Name of the database migration service where resource belongs to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The platform type of the migration source. Possible values are `SQL`, `PostgreSQL`, `MySQL` and `MongoDb`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourcePlatform", required=true)
    private Output<String> sourcePlatform;

    /**
     * @return The platform type of the migration source. Possible values are `SQL`, `PostgreSQL`, `MySQL` and `MongoDb`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> sourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * A mapping of tags to assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The platform type of the migration target. Possible values are `SQLDB`, `AzureDbForPostgreSql`, `AzureDbForMySql` and `MongoDb`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="targetPlatform", required=true)
    private Output<String> targetPlatform;

    /**
     * @return The platform type of the migration target. Possible values are `SQLDB`, `AzureDbForPostgreSql`, `AzureDbForMySql` and `MongoDb`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> targetPlatform() {
        return this.targetPlatform;
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.sourcePlatform = $.sourcePlatform;
        this.tags = $.tags;
        this.targetPlatform = $.targetPlatform;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
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
         * @param name Specify the name of the database migration project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specify the name of the database migration project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group in which to create the database migration project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which to create the database migration project. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName Name of the database migration service where resource belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Name of the database migration service where resource belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param sourcePlatform The platform type of the migration source. Possible values are `SQL`, `PostgreSQL`, `MySQL` and `MongoDb`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourcePlatform(Output<String> sourcePlatform) {
            $.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * @param sourcePlatform The platform type of the migration source. Possible values are `SQL`, `PostgreSQL`, `MySQL` and `MongoDb`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourcePlatform(String sourcePlatform) {
            return sourcePlatform(Output.of(sourcePlatform));
        }

        /**
         * @param tags A mapping of tags to assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetPlatform The platform type of the migration target. Possible values are `SQLDB`, `AzureDbForPostgreSql`, `AzureDbForMySql` and `MongoDb`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetPlatform(Output<String> targetPlatform) {
            $.targetPlatform = targetPlatform;
            return this;
        }

        /**
         * @param targetPlatform The platform type of the migration target. Possible values are `SQLDB`, `AzureDbForPostgreSql`, `AzureDbForMySql` and `MongoDb`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder targetPlatform(String targetPlatform) {
            return targetPlatform(Output.of(targetPlatform));
        }

        public ProjectArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ProjectArgs", "resourceGroupName");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("ProjectArgs", "serviceName");
            }
            if ($.sourcePlatform == null) {
                throw new MissingRequiredPropertyException("ProjectArgs", "sourcePlatform");
            }
            if ($.targetPlatform == null) {
                throw new MissingRequiredPropertyException("ProjectArgs", "targetPlatform");
            }
            return $;
        }
    }

}
