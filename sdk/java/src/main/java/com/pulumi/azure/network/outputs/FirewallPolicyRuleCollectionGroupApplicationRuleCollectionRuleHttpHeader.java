// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader {
    /**
     * @return Specifies the name of the header.
     * 
     */
    private String name;
    /**
     * @return Specifies the value of the value.
     * 
     */
    private String value;

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader() {}
    /**
     * @return Specifies the name of the header.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the value of the value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader build() {
            final var _resultValue = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleHttpHeader();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}