// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedClusterAuthenticationActiveDirectory {
    /**
     * @return The ID of the Client Application.
     * 
     */
    private String clientApplicationId;
    /**
     * @return The ID of the Cluster Application.
     * 
     */
    private String clusterApplicationId;
    /**
     * @return The ID of the Tenant.
     * 
     */
    private String tenantId;

    private ManagedClusterAuthenticationActiveDirectory() {}
    /**
     * @return The ID of the Client Application.
     * 
     */
    public String clientApplicationId() {
        return this.clientApplicationId;
    }
    /**
     * @return The ID of the Cluster Application.
     * 
     */
    public String clusterApplicationId() {
        return this.clusterApplicationId;
    }
    /**
     * @return The ID of the Tenant.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAuthenticationActiveDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientApplicationId;
        private String clusterApplicationId;
        private String tenantId;
        public Builder() {}
        public Builder(ManagedClusterAuthenticationActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientApplicationId = defaults.clientApplicationId;
    	      this.clusterApplicationId = defaults.clusterApplicationId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder clientApplicationId(String clientApplicationId) {
            if (clientApplicationId == null) {
              throw new MissingRequiredPropertyException("ManagedClusterAuthenticationActiveDirectory", "clientApplicationId");
            }
            this.clientApplicationId = clientApplicationId;
            return this;
        }
        @CustomType.Setter
        public Builder clusterApplicationId(String clusterApplicationId) {
            if (clusterApplicationId == null) {
              throw new MissingRequiredPropertyException("ManagedClusterAuthenticationActiveDirectory", "clusterApplicationId");
            }
            this.clusterApplicationId = clusterApplicationId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("ManagedClusterAuthenticationActiveDirectory", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        public ManagedClusterAuthenticationActiveDirectory build() {
            final var _resultValue = new ManagedClusterAuthenticationActiveDirectory();
            _resultValue.clientApplicationId = clientApplicationId;
            _resultValue.clusterApplicationId = clusterApplicationId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
