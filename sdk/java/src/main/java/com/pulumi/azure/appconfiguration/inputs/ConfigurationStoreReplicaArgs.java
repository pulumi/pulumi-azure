// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationStoreReplicaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationStoreReplicaArgs Empty = new ConfigurationStoreReplicaArgs();

    /**
     * The URL of the App Configuration Replica.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The URL of the App Configuration Replica.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The ID of the Access Key.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Access Key.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the supported Azure location where the replica exists.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the replica exists.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Specifies the name of the replica.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the replica.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ConfigurationStoreReplicaArgs() {}

    private ConfigurationStoreReplicaArgs(ConfigurationStoreReplicaArgs $) {
        this.endpoint = $.endpoint;
        this.id = $.id;
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationStoreReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationStoreReplicaArgs $;

        public Builder() {
            $ = new ConfigurationStoreReplicaArgs();
        }

        public Builder(ConfigurationStoreReplicaArgs defaults) {
            $ = new ConfigurationStoreReplicaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The URL of the App Configuration Replica.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The URL of the App Configuration Replica.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param id The ID of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Access Key.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param location Specifies the supported Azure location where the replica exists.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the replica exists.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the replica.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the replica.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ConfigurationStoreReplicaArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ConfigurationStoreReplicaArgs", "location");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ConfigurationStoreReplicaArgs", "name");
            }
            return $;
        }
    }

}
