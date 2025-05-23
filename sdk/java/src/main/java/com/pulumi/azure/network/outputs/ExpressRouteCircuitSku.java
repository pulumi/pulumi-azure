// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExpressRouteCircuitSku {
    /**
     * @return The billing mode for bandwidth. Possible values are `MeteredData` or `UnlimitedData`.
     * 
     * &gt; **Note:** You can migrate from `MeteredData` to `UnlimitedData`, but not the other way around.
     * 
     */
    private String family;
    /**
     * @return The service tier. Possible values are `Basic`, `Local`, `Standard` or `Premium`.
     * 
     */
    private String tier;

    private ExpressRouteCircuitSku() {}
    /**
     * @return The billing mode for bandwidth. Possible values are `MeteredData` or `UnlimitedData`.
     * 
     * &gt; **Note:** You can migrate from `MeteredData` to `UnlimitedData`, but not the other way around.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return The service tier. Possible values are `Basic`, `Local`, `Standard` or `Premium`.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitSku defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String family;
        private String tier;
        public Builder() {}
        public Builder(ExpressRouteCircuitSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("ExpressRouteCircuitSku", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("ExpressRouteCircuitSku", "tier");
            }
            this.tier = tier;
            return this;
        }
        public ExpressRouteCircuitSku build() {
            final var _resultValue = new ExpressRouteCircuitSku();
            _resultValue.family = family;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
