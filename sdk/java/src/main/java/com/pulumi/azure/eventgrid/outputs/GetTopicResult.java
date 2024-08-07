// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTopicResult {
    /**
     * @return The Endpoint associated with the EventGrid Topic.
     * 
     */
    private String endpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    private String name;
    /**
     * @return The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    private String primaryAccessKey;
    private String resourceGroupName;
    /**
     * @return The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    private String secondaryAccessKey;
    private Map<String,String> tags;

    private GetTopicResult() {}
    /**
     * @return The Endpoint associated with the EventGrid Topic.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public String primaryAccessKey() {
        return this.primaryAccessKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public String secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private String id;
        private String location;
        private String name;
        private String primaryAccessKey;
        private String resourceGroupName;
        private String secondaryAccessKey;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder primaryAccessKey(String primaryAccessKey) {
            if (primaryAccessKey == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "primaryAccessKey");
            }
            this.primaryAccessKey = primaryAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryAccessKey(String secondaryAccessKey) {
            if (secondaryAccessKey == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "secondaryAccessKey");
            }
            this.secondaryAccessKey = secondaryAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetTopicResult build() {
            final var _resultValue = new GetTopicResult();
            _resultValue.endpoint = endpoint;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.primaryAccessKey = primaryAccessKey;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.secondaryAccessKey = secondaryAccessKey;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
