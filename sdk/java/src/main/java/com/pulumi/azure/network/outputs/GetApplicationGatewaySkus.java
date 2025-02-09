// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGatewaySkus {
    /**
     * @return The Capacity of the SKU in use for this Application Gateway.
     * 
     */
    private Integer capacity;
    /**
     * @return The name of this Application Gateway.
     * 
     */
    private String name;
    /**
     * @return The Tier of the SKU in use for this Application Gateway.
     * 
     */
    private String tier;

    private GetApplicationGatewaySkus() {}
    /**
     * @return The Capacity of the SKU in use for this Application Gateway.
     * 
     */
    public Integer capacity() {
        return this.capacity;
    }
    /**
     * @return The name of this Application Gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Tier of the SKU in use for this Application Gateway.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGatewaySkus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer capacity;
        private String name;
        private String tier;
        public Builder() {}
        public Builder(GetApplicationGatewaySkus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder capacity(Integer capacity) {
            if (capacity == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySkus", "capacity");
            }
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySkus", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("GetApplicationGatewaySkus", "tier");
            }
            this.tier = tier;
            return this;
        }
        public GetApplicationGatewaySkus build() {
            final var _resultValue = new GetApplicationGatewaySkus();
            _resultValue.capacity = capacity;
            _resultValue.name = name;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
