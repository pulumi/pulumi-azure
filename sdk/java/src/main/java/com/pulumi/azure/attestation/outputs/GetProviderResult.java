// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.attestation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProviderResult {
    /**
     * @return The (Endpoint|URI) of the Attestation Service.
     * 
     */
    private String attestationUri;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Attestation Provider exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Attestation Provider.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Trust model used for the Attestation Service.
     * 
     */
    private String trustModel;

    private GetProviderResult() {}
    /**
     * @return The (Endpoint|URI) of the Attestation Service.
     * 
     */
    public String attestationUri() {
        return this.attestationUri;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Attestation Provider exists.
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
     * @return A mapping of tags assigned to the Attestation Provider.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Trust model used for the Attestation Service.
     * 
     */
    public String trustModel() {
        return this.trustModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProviderResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attestationUri;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        private String trustModel;
        public Builder() {}
        public Builder(GetProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationUri = defaults.attestationUri;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.trustModel = defaults.trustModel;
        }

        @CustomType.Setter
        public Builder attestationUri(String attestationUri) {
            this.attestationUri = Objects.requireNonNull(attestationUri);
            return this;
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
        public Builder trustModel(String trustModel) {
            this.trustModel = Objects.requireNonNull(trustModel);
            return this;
        }
        public GetProviderResult build() {
            final var o = new GetProviderResult();
            o.attestationUri = attestationUri;
            o.id = id;
            o.location = location;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.tags = tags;
            o.trustModel = trustModel;
            return o;
        }
    }
}