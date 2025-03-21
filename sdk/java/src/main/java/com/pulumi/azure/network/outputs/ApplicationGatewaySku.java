// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewaySku {
    /**
     * @return The Capacity of the SKU to use for this Application Gateway. When using a V1 SKU this value must be between `1` and `32`, and `1` to `125` for a V2 SKU. When using a `Basic` SKU this property must be between `1` and `2`. This property is optional if `autoscale_configuration` is set.
     * 
     */
    private @Nullable Integer capacity;
    /**
     * @return The Name of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
     * 
     */
    private String name;
    /**
     * @return The Tier of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
     * 
     */
    private String tier;

    private ApplicationGatewaySku() {}
    /**
     * @return The Capacity of the SKU to use for this Application Gateway. When using a V1 SKU this value must be between `1` and `32`, and `1` to `125` for a V2 SKU. When using a `Basic` SKU this property must be between `1` and `2`. This property is optional if `autoscale_configuration` is set.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The Name of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Tier of the SKU to use for this Application Gateway. Possible values are `Basic`, `Standard_v2`, and `WAF_v2`.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySku defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private String tier;
        public Builder() {}
        public Builder(ApplicationGatewaySku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable Integer capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewaySku", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("ApplicationGatewaySku", "tier");
            }
            this.tier = tier;
            return this;
        }
        public ApplicationGatewaySku build() {
            final var _resultValue = new ApplicationGatewaySku();
            _resultValue.capacity = capacity;
            _resultValue.name = name;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
