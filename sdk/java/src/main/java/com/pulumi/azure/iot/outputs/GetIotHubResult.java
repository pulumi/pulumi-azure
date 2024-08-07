// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.azure.iot.outputs.GetIotHubIdentity;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetIotHubResult {
    /**
     * @return The Hostname of the IoTHub.
     * 
     */
    private String hostname;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `identity` block as defined below.
     * 
     */
    private List<GetIotHubIdentity> identities;
    private String name;
    private String resourceGroupName;
    private @Nullable Map<String,String> tags;

    private GetIotHubResult() {}
    /**
     * @return The Hostname of the IoTHub.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `identity` block as defined below.
     * 
     */
    public List<GetIotHubIdentity> identities() {
        return this.identities;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotHubResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String id;
        private List<GetIotHubIdentity> identities;
        private String name;
        private String resourceGroupName;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetIotHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetIotHubResult", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIotHubResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identities(List<GetIotHubIdentity> identities) {
            if (identities == null) {
              throw new MissingRequiredPropertyException("GetIotHubResult", "identities");
            }
            this.identities = identities;
            return this;
        }
        public Builder identities(GetIotHubIdentity... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIotHubResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetIotHubResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public GetIotHubResult build() {
            final var _resultValue = new GetIotHubResult();
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.identities = identities;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
