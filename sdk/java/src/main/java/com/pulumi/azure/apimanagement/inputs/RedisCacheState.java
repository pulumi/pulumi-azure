// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisCacheState extends com.pulumi.resources.ResourceArgs {

    public static final RedisCacheState Empty = new RedisCacheState();

    /**
     * The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
     * 
     */
    @Import(name="apiManagementId")
    private @Nullable Output<String> apiManagementId;

    /**
     * @return The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
     * 
     */
    public Optional<Output<String>> apiManagementId() {
        return Optional.ofNullable(this.apiManagementId);
    }

    /**
     * The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
     * 
     */
    @Import(name="cacheLocation")
    private @Nullable Output<String> cacheLocation;

    /**
     * @return The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
     * 
     */
    public Optional<Output<String>> cacheLocation() {
        return Optional.ofNullable(this.cacheLocation);
    }

    /**
     * The connection string to the Cache for Redis.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The connection string to the Cache for Redis.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The description of the API Management Redis Cache.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the API Management Redis Cache.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the Cache for Redis.
     * 
     */
    @Import(name="redisCacheId")
    private @Nullable Output<String> redisCacheId;

    /**
     * @return The resource ID of the Cache for Redis.
     * 
     */
    public Optional<Output<String>> redisCacheId() {
        return Optional.ofNullable(this.redisCacheId);
    }

    private RedisCacheState() {}

    private RedisCacheState(RedisCacheState $) {
        this.apiManagementId = $.apiManagementId;
        this.cacheLocation = $.cacheLocation;
        this.connectionString = $.connectionString;
        this.description = $.description;
        this.name = $.name;
        this.redisCacheId = $.redisCacheId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisCacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisCacheState $;

        public Builder() {
            $ = new RedisCacheState();
        }

        public Builder(RedisCacheState defaults) {
            $ = new RedisCacheState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementId The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(@Nullable Output<String> apiManagementId) {
            $.apiManagementId = apiManagementId;
            return this;
        }

        /**
         * @param apiManagementId The resource ID of the API Management Service from which to create this external cache. Changing this forces a new API Management Redis Cache to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(String apiManagementId) {
            return apiManagementId(Output.of(apiManagementId));
        }

        /**
         * @param cacheLocation The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder cacheLocation(@Nullable Output<String> cacheLocation) {
            $.cacheLocation = cacheLocation;
            return this;
        }

        /**
         * @param cacheLocation The location where to use cache from. Possible values are `default` and valid Azure regions. Defaults to `default`.
         * 
         * @return builder
         * 
         */
        public Builder cacheLocation(String cacheLocation) {
            return cacheLocation(Output.of(cacheLocation));
        }

        /**
         * @param connectionString The connection string to the Cache for Redis.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string to the Cache for Redis.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param description The description of the API Management Redis Cache.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the API Management Redis Cache.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this API Management Redis Cache. Changing this forces a new API Management Redis Cache to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redisCacheId The resource ID of the Cache for Redis.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(@Nullable Output<String> redisCacheId) {
            $.redisCacheId = redisCacheId;
            return this;
        }

        /**
         * @param redisCacheId The resource ID of the Cache for Redis.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(String redisCacheId) {
            return redisCacheId(Output.of(redisCacheId));
        }

        public RedisCacheState build() {
            return $;
        }
    }

}
