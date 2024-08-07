// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkDataNetworkResult {
    /**
     * @return The description for this Mobile Network Data Network.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Mobile Network Data Network exists.
     * 
     */
    private String location;
    private String mobileNetworkId;
    private String name;
    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Data Network.
     * 
     */
    private Map<String,String> tags;

    private GetNetworkDataNetworkResult() {}
    /**
     * @return The description for this Mobile Network Data Network.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Mobile Network Data Network exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String mobileNetworkId() {
        return this.mobileNetworkId;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Data Network.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkDataNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String location;
        private String mobileNetworkId;
        private String name;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetNetworkDataNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mobileNetworkId = defaults.mobileNetworkId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder mobileNetworkId(String mobileNetworkId) {
            if (mobileNetworkId == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "mobileNetworkId");
            }
            this.mobileNetworkId = mobileNetworkId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetNetworkDataNetworkResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetNetworkDataNetworkResult build() {
            final var _resultValue = new GetNetworkDataNetworkResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.mobileNetworkId = mobileNetworkId;
            _resultValue.name = name;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
