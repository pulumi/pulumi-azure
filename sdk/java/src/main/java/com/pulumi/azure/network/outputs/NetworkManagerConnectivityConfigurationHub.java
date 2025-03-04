// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkManagerConnectivityConfigurationHub {
    /**
     * @return Specifies the resource ID used as hub in Hub And Spoke topology.
     * 
     */
    private String resourceId;
    /**
     * @return Specifies the resource Type used as hub in Hub And Spoke topology.
     * 
     */
    private String resourceType;

    private NetworkManagerConnectivityConfigurationHub() {}
    /**
     * @return Specifies the resource ID used as hub in Hub And Spoke topology.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return Specifies the resource Type used as hub in Hub And Spoke topology.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerConnectivityConfigurationHub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceId;
        private String resourceType;
        public Builder() {}
        public Builder(NetworkManagerConnectivityConfigurationHub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder resourceId(String resourceId) {
            if (resourceId == null) {
              throw new MissingRequiredPropertyException("NetworkManagerConnectivityConfigurationHub", "resourceId");
            }
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("NetworkManagerConnectivityConfigurationHub", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        public NetworkManagerConnectivityConfigurationHub build() {
            final var _resultValue = new NetworkManagerConnectivityConfigurationHub();
            _resultValue.resourceId = resourceId;
            _resultValue.resourceType = resourceType;
            return _resultValue;
        }
    }
}
