// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetResolverResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Private DNS Resolver exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return The tags assigned to the Private DNS Resolver.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The ID of the Virtual Network that is linked to the Private DNS Resolver.
     * 
     */
    private String virtualNetworkId;

    private GetResolverResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Private DNS Resolver exists.
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
     * @return The tags assigned to the Private DNS Resolver.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The ID of the Virtual Network that is linked to the Private DNS Resolver.
     * 
     */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        private String virtualNetworkId;
        public Builder() {}
        public Builder(GetResolverResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
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
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkId(String virtualNetworkId) {
            this.virtualNetworkId = Objects.requireNonNull(virtualNetworkId);
            return this;
        }
        public GetResolverResult build() {
            final var o = new GetResolverResult();
            o.id = id;
            o.location = location;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.tags = tags;
            o.virtualNetworkId = virtualNetworkId;
            return o;
        }
    }
}