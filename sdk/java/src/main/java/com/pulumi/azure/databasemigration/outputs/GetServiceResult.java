// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databasemigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Azure location where the resource exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return The SKU name of database migration service.
     * 
     */
    private String skuName;
    /**
     * @return The ID of the virtual subnet resource to which the database migration service exists.
     * 
     */
    private String subnetId;
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetServiceResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Azure location where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU name of database migration service.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return The ID of the virtual subnet resource to which the database migration service exists.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private String skuName;
        private String subnetId;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetServiceResult build() {
            final var o = new GetServiceResult();
            o.id = id;
            o.location = location;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.skuName = skuName;
            o.subnetId = subnetId;
            o.tags = tags;
            return o;
        }
    }
}