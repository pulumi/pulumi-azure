// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppIngressIpSecurityRestriction {
    /**
     * @return The IP-filter action.
     * 
     */
    private String action;
    /**
     * @return Description of the IP restriction rule that is being sent to the container-app.
     * 
     */
    private String description;
    /**
     * @return CIDR notation that matches the incoming IP address.
     * 
     */
    private String ipAddressRange;
    /**
     * @return The name of the Container App.
     * 
     */
    private String name;

    private GetAppIngressIpSecurityRestriction() {}
    /**
     * @return The IP-filter action.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Description of the IP restriction rule that is being sent to the container-app.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return CIDR notation that matches the incoming IP address.
     * 
     */
    public String ipAddressRange() {
        return this.ipAddressRange;
    }
    /**
     * @return The name of the Container App.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppIngressIpSecurityRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String description;
        private String ipAddressRange;
        private String name;
        public Builder() {}
        public Builder(GetAppIngressIpSecurityRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.ipAddressRange = defaults.ipAddressRange;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetAppIngressIpSecurityRestriction", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAppIngressIpSecurityRestriction", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressRange(String ipAddressRange) {
            if (ipAddressRange == null) {
              throw new MissingRequiredPropertyException("GetAppIngressIpSecurityRestriction", "ipAddressRange");
            }
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppIngressIpSecurityRestriction", "name");
            }
            this.name = name;
            return this;
        }
        public GetAppIngressIpSecurityRestriction build() {
            final var _resultValue = new GetAppIngressIpSecurityRestriction();
            _resultValue.action = action;
            _resultValue.description = description;
            _resultValue.ipAddressRange = ipAddressRange;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
