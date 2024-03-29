// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegistryNetworkRuleSetIpRule {
    /**
     * @return The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    private String action;
    /**
     * @return The CIDR block from which requests will match the rule.
     * 
     */
    private String ipRange;

    private RegistryNetworkRuleSetIpRule() {}
    /**
     * @return The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The CIDR block from which requests will match the rule.
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryNetworkRuleSetIpRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String ipRange;
        public Builder() {}
        public Builder(RegistryNetworkRuleSetIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipRange = defaults.ipRange;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("RegistryNetworkRuleSetIpRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder ipRange(String ipRange) {
            if (ipRange == null) {
              throw new MissingRequiredPropertyException("RegistryNetworkRuleSetIpRule", "ipRange");
            }
            this.ipRange = ipRange;
            return this;
        }
        public RegistryNetworkRuleSetIpRule build() {
            final var _resultValue = new RegistryNetworkRuleSetIpRule();
            _resultValue.action = action;
            _resultValue.ipRange = ipRange;
            return _resultValue;
        }
    }
}
