// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetStorageContainerResult {
    /**
     * @return The Access Level configured for this Container.
     * 
     */
    private String containerAccessType;
    /**
     * @return Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    private Boolean hasImmutabilityPolicy;
    /**
     * @return Is there a Legal Hold configured on this Storage Container?
     * 
     */
    private Boolean hasLegalHold;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A mapping of MetaData for this Container.
     * 
     */
    private Map<String,String> metadata;
    private String name;
    /**
     * @return The Resource Manager ID of this Storage Container.
     * 
     */
    private String resourceManagerId;
    private String storageAccountName;

    private GetStorageContainerResult() {}
    /**
     * @return The Access Level configured for this Container.
     * 
     */
    public String containerAccessType() {
        return this.containerAccessType;
    }
    /**
     * @return Is there an Immutability Policy configured on this Storage Container?
     * 
     */
    public Boolean hasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    /**
     * @return Is there a Legal Hold configured on this Storage Container?
     * 
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A mapping of MetaData for this Container.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Resource Manager ID of this Storage Container.
     * 
     */
    public String resourceManagerId() {
        return this.resourceManagerId;
    }
    public String storageAccountName() {
        return this.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageContainerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerAccessType;
        private Boolean hasImmutabilityPolicy;
        private Boolean hasLegalHold;
        private String id;
        private Map<String,String> metadata;
        private String name;
        private String resourceManagerId;
        private String storageAccountName;
        public Builder() {}
        public Builder(GetStorageContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerAccessType = defaults.containerAccessType;
    	      this.hasImmutabilityPolicy = defaults.hasImmutabilityPolicy;
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.resourceManagerId = defaults.resourceManagerId;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        @CustomType.Setter
        public Builder containerAccessType(String containerAccessType) {
            this.containerAccessType = Objects.requireNonNull(containerAccessType);
            return this;
        }
        @CustomType.Setter
        public Builder hasImmutabilityPolicy(Boolean hasImmutabilityPolicy) {
            this.hasImmutabilityPolicy = Objects.requireNonNull(hasImmutabilityPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder hasLegalHold(Boolean hasLegalHold) {
            this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceManagerId(String resourceManagerId) {
            this.resourceManagerId = Objects.requireNonNull(resourceManagerId);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public GetStorageContainerResult build() {
            final var o = new GetStorageContainerResult();
            o.containerAccessType = containerAccessType;
            o.hasImmutabilityPolicy = hasImmutabilityPolicy;
            o.hasLegalHold = hasLegalHold;
            o.id = id;
            o.metadata = metadata;
            o.name = name;
            o.resourceManagerId = resourceManagerId;
            o.storageAccountName = storageAccountName;
            return o;
        }
    }
}