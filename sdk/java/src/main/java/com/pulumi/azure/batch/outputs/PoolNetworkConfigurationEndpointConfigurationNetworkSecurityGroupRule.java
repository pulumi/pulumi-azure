// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule {
    /**
     * @return The action that should be taken for a specified IP address, subnet range or tag. Acceptable values are `Allow` and `Deny`. Changing this forces a new resource to be created.
     * 
     */
    private String access;
    /**
     * @return The priority for this rule. The value must be at least `150`. Changing this forces a new resource to be created.
     * 
     */
    private Integer priority;
    /**
     * @return The source address prefix or tag to match for the rule. Changing this forces a new resource to be created.
     * 
     */
    private String sourceAddressPrefix;

    private PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule() {}
    /**
     * @return The action that should be taken for a specified IP address, subnet range or tag. Acceptable values are `Allow` and `Deny`. Changing this forces a new resource to be created.
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return The priority for this rule. The value must be at least `150`. Changing this forces a new resource to be created.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The source address prefix or tag to match for the rule. Changing this forces a new resource to be created.
     * 
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String access;
        private Integer priority;
        private String sourceAddressPrefix;
        public Builder() {}
        public Builder(PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.priority = defaults.priority;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
        }

        @CustomType.Setter
        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
            return this;
        }
        public PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule build() {
            final var o = new PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule();
            o.access = access;
            o.priority = priority;
            o.sourceAddressPrefix = sourceAddressPrefix;
            return o;
        }
    }
}