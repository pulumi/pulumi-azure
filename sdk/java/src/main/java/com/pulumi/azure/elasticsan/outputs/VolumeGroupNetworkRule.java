// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticsan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeGroupNetworkRule {
    /**
     * @return The action to take when the Subnet attempts to access this Elastic SAN Volume Group. The only possible value is `Allow`. Defaults to `Allow`.
     * 
     */
    private @Nullable String action;
    /**
     * @return The ID of the Subnet which should be allowed to access this Elastic SAN Volume Group.
     * 
     */
    private String subnetId;

    private VolumeGroupNetworkRule() {}
    /**
     * @return The action to take when the Subnet attempts to access this Elastic SAN Volume Group. The only possible value is `Allow`. Defaults to `Allow`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The ID of the Subnet which should be allowed to access this Elastic SAN Volume Group.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeGroupNetworkRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private String subnetId;
        public Builder() {}
        public Builder(VolumeGroupNetworkRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            if (subnetId == null) {
              throw new MissingRequiredPropertyException("VolumeGroupNetworkRule", "subnetId");
            }
            this.subnetId = subnetId;
            return this;
        }
        public VolumeGroupNetworkRule build() {
            final var _resultValue = new VolumeGroupNetworkRule();
            _resultValue.action = action;
            _resultValue.subnetId = subnetId;
            return _resultValue;
        }
    }
}
