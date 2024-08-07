// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticsan.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSkus {
    /**
     * @return The name of this Elastic SAN.
     * 
     */
    private String name;
    /**
     * @return The SKU tier.
     * 
     */
    private String tier;

    private GetSkus() {}
    /**
     * @return The name of this Elastic SAN.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The SKU tier.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSkus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String tier;
        public Builder() {}
        public Builder(GetSkus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSkus", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("GetSkus", "tier");
            }
            this.tier = tier;
            return this;
        }
        public GetSkus build() {
            final var _resultValue = new GetSkus();
            _resultValue.name = name;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
