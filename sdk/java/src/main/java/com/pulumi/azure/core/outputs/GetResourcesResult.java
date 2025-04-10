// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.azure.core.outputs.GetResourcesResource;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetResourcesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of this Resource.
     * 
     */
    private String name;
    private @Nullable Map<String,String> requiredTags;
    /**
     * @return The name of the Resource Group in which this Resource exists.
     * 
     */
    private String resourceGroupName;
    /**
     * @return One or more `resource` blocks as defined below.
     * 
     */
    private List<GetResourcesResource> resources;
    /**
     * @return The type of this Resource. (e.g. `Microsoft.Network/virtualNetworks`).
     * 
     */
    private String type;

    private GetResourcesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of this Resource.
     * 
     */
    public String name() {
        return this.name;
    }
    public Map<String,String> requiredTags() {
        return this.requiredTags == null ? Map.of() : this.requiredTags;
    }
    /**
     * @return The name of the Resource Group in which this Resource exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return One or more `resource` blocks as defined below.
     * 
     */
    public List<GetResourcesResource> resources() {
        return this.resources;
    }
    /**
     * @return The type of this Resource. (e.g. `Microsoft.Network/virtualNetworks`).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private @Nullable Map<String,String> requiredTags;
        private String resourceGroupName;
        private List<GetResourcesResource> resources;
        private String type;
        public Builder() {}
        public Builder(GetResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.requiredTags = defaults.requiredTags;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resources = defaults.resources;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourcesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetResourcesResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder requiredTags(@Nullable Map<String,String> requiredTags) {

            this.requiredTags = requiredTags;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetResourcesResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<GetResourcesResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("GetResourcesResult", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(GetResourcesResource... resources) {
            return resources(List.of(resources));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetResourcesResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetResourcesResult build() {
            final var _resultValue = new GetResourcesResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.requiredTags = requiredTags;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.resources = resources;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
