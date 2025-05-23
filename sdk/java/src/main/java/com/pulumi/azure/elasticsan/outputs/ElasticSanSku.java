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
public final class ElasticSanSku {
    /**
     * @return The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
     * 
     */
    private String name;
    /**
     * @return The SKU tier. The only possible value is `Premium`. Defaults to `Premium`.
     * 
     */
    private @Nullable String tier;

    private ElasticSanSku() {}
    /**
     * @return The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The SKU tier. The only possible value is `Premium`. Defaults to `Premium`.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticSanSku defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String tier;
        public Builder() {}
        public Builder(ElasticSanSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ElasticSanSku", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tier(@Nullable String tier) {

            this.tier = tier;
            return this;
        }
        public ElasticSanSku build() {
            final var _resultValue = new ElasticSanSku();
            _resultValue.name = name;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
