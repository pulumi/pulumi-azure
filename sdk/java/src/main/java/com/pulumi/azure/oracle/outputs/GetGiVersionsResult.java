// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.oracle.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGiVersionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    /**
     * @return A list of valid GI software versions.
     * 
     */
    private List<String> versions;

    private GetGiVersionsResult() {}
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
    /**
     * @return A list of valid GI software versions.
     * 
     */
    public List<String> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGiVersionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private List<String> versions;
        public Builder() {}
        public Builder(GetGiVersionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGiVersionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetGiVersionsResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder versions(List<String> versions) {
            if (versions == null) {
              throw new MissingRequiredPropertyException("GetGiVersionsResult", "versions");
            }
            this.versions = versions;
            return this;
        }
        public Builder versions(String... versions) {
            return versions(List.of(versions));
        }
        public GetGiVersionsResult build() {
            final var _resultValue = new GetGiVersionsResult();
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.versions = versions;
            return _resultValue;
        }
    }
}
