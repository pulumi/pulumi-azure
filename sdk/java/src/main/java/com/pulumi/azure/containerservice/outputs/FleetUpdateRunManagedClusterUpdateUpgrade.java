// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetUpdateRunManagedClusterUpdateUpgrade {
    /**
     * @return Specifies the Kubernetes version to upgrade the member clusters to. This is required if `type` is set to `Full`.
     * 
     */
    private @Nullable String kubernetesVersion;
    /**
     * @return Specifies the type of upgrade to perform. Possible values are `Full` and `NodeImageOnly`.
     * 
     */
    private String type;

    private FleetUpdateRunManagedClusterUpdateUpgrade() {}
    /**
     * @return Specifies the Kubernetes version to upgrade the member clusters to. This is required if `type` is set to `Full`.
     * 
     */
    public Optional<String> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }
    /**
     * @return Specifies the type of upgrade to perform. Possible values are `Full` and `NodeImageOnly`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetUpdateRunManagedClusterUpdateUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kubernetesVersion;
        private String type;
        public Builder() {}
        public Builder(FleetUpdateRunManagedClusterUpdateUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder kubernetesVersion(@Nullable String kubernetesVersion) {

            this.kubernetesVersion = kubernetesVersion;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("FleetUpdateRunManagedClusterUpdateUpgrade", "type");
            }
            this.type = type;
            return this;
        }
        public FleetUpdateRunManagedClusterUpdateUpgrade build() {
            final var _resultValue = new FleetUpdateRunManagedClusterUpdateUpgrade();
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
