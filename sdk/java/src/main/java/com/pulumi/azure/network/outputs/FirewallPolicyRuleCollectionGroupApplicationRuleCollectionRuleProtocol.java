// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol {
    /**
     * @return Port number of the protocol. Range is 0-64000.
     * 
     */
    private Integer port;
    /**
     * @return Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    private String type;

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol() {}
    /**
     * @return Port number of the protocol. Range is 0-64000.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Protocol type. Possible values are `Http` and `Https`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String type;
        public Builder() {}
        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol", "type");
            }
            this.type = type;
            return this;
        }
        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol build() {
            final var _resultValue = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocol();
            _resultValue.port = port;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
