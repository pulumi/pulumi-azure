// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheAccessPolicyAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheAccessPolicyAssignmentArgs Empty = new CacheAccessPolicyAssignmentArgs();

    /**
     * The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    @Import(name="accessPolicyName", required=true)
    private Output<String> accessPolicyName;

    /**
     * @return The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    public Output<String> accessPolicyName() {
        return this.accessPolicyName;
    }

    /**
     * The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    /**
     * @return The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    @Import(name="objectIdAlias", required=true)
    private Output<String> objectIdAlias;

    /**
     * @return The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    public Output<String> objectIdAlias() {
        return this.objectIdAlias;
    }

    /**
     * The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    @Import(name="redisCacheId", required=true)
    private Output<String> redisCacheId;

    /**
     * @return The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
     * 
     */
    public Output<String> redisCacheId() {
        return this.redisCacheId;
    }

    private CacheAccessPolicyAssignmentArgs() {}

    private CacheAccessPolicyAssignmentArgs(CacheAccessPolicyAssignmentArgs $) {
        this.accessPolicyName = $.accessPolicyName;
        this.name = $.name;
        this.objectId = $.objectId;
        this.objectIdAlias = $.objectIdAlias;
        this.redisCacheId = $.redisCacheId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheAccessPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheAccessPolicyAssignmentArgs $;

        public Builder() {
            $ = new CacheAccessPolicyAssignmentArgs();
        }

        public Builder(CacheAccessPolicyAssignmentArgs defaults) {
            $ = new CacheAccessPolicyAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyName The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(Output<String> accessPolicyName) {
            $.accessPolicyName = accessPolicyName;
            return this;
        }

        /**
         * @param accessPolicyName The name of the Access Policy to be assigned. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(String accessPolicyName) {
            return accessPolicyName(Output.of(accessPolicyName));
        }

        /**
         * @param name The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Redis Cache Access Policy Assignment. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectId The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The principal ID to be assigned the Access Policy. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param objectIdAlias The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder objectIdAlias(Output<String> objectIdAlias) {
            $.objectIdAlias = objectIdAlias;
            return this;
        }

        /**
         * @param objectIdAlias The alias of the principal ID. User-friendly name for object ID. Also represents username for token based authentication. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder objectIdAlias(String objectIdAlias) {
            return objectIdAlias(Output.of(objectIdAlias));
        }

        /**
         * @param redisCacheId The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(Output<String> redisCacheId) {
            $.redisCacheId = redisCacheId;
            return this;
        }

        /**
         * @param redisCacheId The ID of the Redis Cache. Changing this forces a new Redis Cache Access Policy Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder redisCacheId(String redisCacheId) {
            return redisCacheId(Output.of(redisCacheId));
        }

        public CacheAccessPolicyAssignmentArgs build() {
            if ($.accessPolicyName == null) {
                throw new MissingRequiredPropertyException("CacheAccessPolicyAssignmentArgs", "accessPolicyName");
            }
            if ($.objectId == null) {
                throw new MissingRequiredPropertyException("CacheAccessPolicyAssignmentArgs", "objectId");
            }
            if ($.objectIdAlias == null) {
                throw new MissingRequiredPropertyException("CacheAccessPolicyAssignmentArgs", "objectIdAlias");
            }
            if ($.redisCacheId == null) {
                throw new MissingRequiredPropertyException("CacheAccessPolicyAssignmentArgs", "redisCacheId");
            }
            return $;
        }
    }

}
