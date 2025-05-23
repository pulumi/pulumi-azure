// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterSku {
    /**
     * @return Specifies the node count for the cluster. Boundaries depend on the SKU name.
     * 
     * &gt; **Note:** If no `optimized_auto_scale` block is defined, then the capacity is required.
     * **Note:** If an `optimized_auto_scale` block is defined and no capacity is set, then the capacity is initially set to the value of `minimum_instances`.
     * 
     */
    private @Nullable Integer capacity;
    /**
     * @return The name of the SKU. Possible values are `Dev(No SLA)_Standard_D11_v2`, `Dev(No SLA)_Standard_E2a_v4`, `Standard_D14_v2`, `Standard_D11_v2`, `Standard_D16d_v5`, `Standard_D13_v2`, `Standard_D12_v2`, `Standard_DS14_v2+4TB_PS`, `Standard_DS14_v2+3TB_PS`, `Standard_DS13_v2+1TB_PS`, `Standard_DS13_v2+2TB_PS`, `Standard_D32d_v5`, `Standard_D32d_v4`, `Standard_EC8ads_v5`, `Standard_EC8as_v5+1TB_PS`, `Standard_EC8as_v5+2TB_PS`, `Standard_EC16ads_v5`, `Standard_EC16as_v5+4TB_PS`, `Standard_EC16as_v5+3TB_PS`, `Standard_E80ids_v4`, `Standard_E8a_v4`, `Standard_E8ads_v5`, `Standard_E8as_v5+1TB_PS`, `Standard_E8as_v5+2TB_PS`, `Standard_E8as_v4+1TB_PS`, `Standard_E8as_v4+2TB_PS`, `Standard_E8d_v5`, `Standard_E8d_v4`, `Standard_E8s_v5+1TB_PS`, `Standard_E8s_v5+2TB_PS`, `Standard_E8s_v4+1TB_PS`, `Standard_E8s_v4+2TB_PS`, `Standard_E4a_v4`, `Standard_E4ads_v5`, `Standard_E4d_v5`, `Standard_E4d_v4`, `Standard_E16a_v4`, `Standard_E16ads_v5`, `Standard_E16as_v5+4TB_PS`, `Standard_E16as_v5+3TB_PS`, `Standard_E16as_v4+4TB_PS`, `Standard_E16as_v4+3TB_PS`, `Standard_E16d_v5`, `Standard_E16d_v4`, `Standard_E16s_v5+4TB_PS`, `Standard_E16s_v5+3TB_PS`, `Standard_E16s_v4+4TB_PS`, `Standard_E16s_v4+3TB_PS`, `Standard_E64i_v3`, `Standard_E2a_v4`, `Standard_E2ads_v5`, `Standard_E2d_v5`, `Standard_E2d_v4`, `Standard_L8as_v3`, `Standard_L8s`, `Standard_L8s_v3`, `Standard_L8s_v2`, `Standard_L4s`, `Standard_L16as_v3`, `Standard_L16s`, `Standard_L16s_v3`, `Standard_L16s_v2`, `Standard_L32as_v3` and `Standard_L32s_v3`.
     * 
     */
    private String name;

    private ClusterSku() {}
    /**
     * @return Specifies the node count for the cluster. Boundaries depend on the SKU name.
     * 
     * &gt; **Note:** If no `optimized_auto_scale` block is defined, then the capacity is required.
     * **Note:** If an `optimized_auto_scale` block is defined and no capacity is set, then the capacity is initially set to the value of `minimum_instances`.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The name of the SKU. Possible values are `Dev(No SLA)_Standard_D11_v2`, `Dev(No SLA)_Standard_E2a_v4`, `Standard_D14_v2`, `Standard_D11_v2`, `Standard_D16d_v5`, `Standard_D13_v2`, `Standard_D12_v2`, `Standard_DS14_v2+4TB_PS`, `Standard_DS14_v2+3TB_PS`, `Standard_DS13_v2+1TB_PS`, `Standard_DS13_v2+2TB_PS`, `Standard_D32d_v5`, `Standard_D32d_v4`, `Standard_EC8ads_v5`, `Standard_EC8as_v5+1TB_PS`, `Standard_EC8as_v5+2TB_PS`, `Standard_EC16ads_v5`, `Standard_EC16as_v5+4TB_PS`, `Standard_EC16as_v5+3TB_PS`, `Standard_E80ids_v4`, `Standard_E8a_v4`, `Standard_E8ads_v5`, `Standard_E8as_v5+1TB_PS`, `Standard_E8as_v5+2TB_PS`, `Standard_E8as_v4+1TB_PS`, `Standard_E8as_v4+2TB_PS`, `Standard_E8d_v5`, `Standard_E8d_v4`, `Standard_E8s_v5+1TB_PS`, `Standard_E8s_v5+2TB_PS`, `Standard_E8s_v4+1TB_PS`, `Standard_E8s_v4+2TB_PS`, `Standard_E4a_v4`, `Standard_E4ads_v5`, `Standard_E4d_v5`, `Standard_E4d_v4`, `Standard_E16a_v4`, `Standard_E16ads_v5`, `Standard_E16as_v5+4TB_PS`, `Standard_E16as_v5+3TB_PS`, `Standard_E16as_v4+4TB_PS`, `Standard_E16as_v4+3TB_PS`, `Standard_E16d_v5`, `Standard_E16d_v4`, `Standard_E16s_v5+4TB_PS`, `Standard_E16s_v5+3TB_PS`, `Standard_E16s_v4+4TB_PS`, `Standard_E16s_v4+3TB_PS`, `Standard_E64i_v3`, `Standard_E2a_v4`, `Standard_E2ads_v5`, `Standard_E2d_v5`, `Standard_E2d_v4`, `Standard_L8as_v3`, `Standard_L8s`, `Standard_L8s_v3`, `Standard_L8s_v2`, `Standard_L4s`, `Standard_L16as_v3`, `Standard_L16s`, `Standard_L16s_v3`, `Standard_L16s_v2`, `Standard_L32as_v3` and `Standard_L32s_v3`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSku defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        public Builder() {}
        public Builder(ClusterSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable Integer capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ClusterSku", "name");
            }
            this.name = name;
            return this;
        }
        public ClusterSku build() {
            final var _resultValue = new ClusterSku();
            _resultValue.capacity = capacity;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
