// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNetworkGatewayPolicyGroupPolicyMember {
    /**
     * @return The name of the Virtual Network Gateway Policy Group Member.
     * 
     */
    private String name;
    /**
     * @return The VPN Policy Member attribute type. Possible values are `AADGroupId`, `CertificateGroupId` and `RadiusAzureGroupId`.
     * 
     */
    private String type;
    /**
     * @return The value of attribute that is used for this Virtual Network Gateway Policy Group Member.
     * 
     */
    private String value;

    private VirtualNetworkGatewayPolicyGroupPolicyMember() {}
    /**
     * @return The name of the Virtual Network Gateway Policy Group Member.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The VPN Policy Member attribute type. Possible values are `AADGroupId`, `CertificateGroupId` and `RadiusAzureGroupId`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of attribute that is used for this Virtual Network Gateway Policy Group Member.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayPolicyGroupPolicyMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(VirtualNetworkGatewayPolicyGroupPolicyMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("VirtualNetworkGatewayPolicyGroupPolicyMember", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("VirtualNetworkGatewayPolicyGroupPolicyMember", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("VirtualNetworkGatewayPolicyGroupPolicyMember", "value");
            }
            this.value = value;
            return this;
        }
        public VirtualNetworkGatewayPolicyGroupPolicyMember build() {
            final var _resultValue = new VirtualNetworkGatewayPolicyGroupPolicyMember();
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
