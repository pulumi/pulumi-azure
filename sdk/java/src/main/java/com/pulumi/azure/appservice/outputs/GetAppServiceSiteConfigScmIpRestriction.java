// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetAppServiceSiteConfigScmIpRestrictionHeaders;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppServiceSiteConfigScmIpRestriction {
    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    private String action;
    private GetAppServiceSiteConfigScmIpRestrictionHeaders headers;
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    private String ipAddress;
    /**
     * @return The name of the App Service.
     * 
     */
    private String name;
    /**
     * @return The priority for this IP Restriction.
     * 
     */
    private Integer priority;
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    private String serviceTag;
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    private String virtualNetworkSubnetId;

    private GetAppServiceSiteConfigScmIpRestriction() {}
    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    public String action() {
        return this.action;
    }
    public GetAppServiceSiteConfigScmIpRestrictionHeaders headers() {
        return this.headers;
    }
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The name of the App Service.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority for this IP Restriction.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    public String serviceTag() {
        return this.serviceTag;
    }
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceSiteConfigScmIpRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private GetAppServiceSiteConfigScmIpRestrictionHeaders headers;
        private String ipAddress;
        private String name;
        private Integer priority;
        private String serviceTag;
        private String virtualNetworkSubnetId;
        public Builder() {}
        public Builder(GetAppServiceSiteConfigScmIpRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceTag = defaults.serviceTag;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder headers(GetAppServiceSiteConfigScmIpRestrictionHeaders headers) {
            if (headers == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "headers");
            }
            this.headers = headers;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder serviceTag(String serviceTag) {
            if (serviceTag == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "serviceTag");
            }
            this.serviceTag = serviceTag;
            return this;
        }
        @CustomType.Setter
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            if (virtualNetworkSubnetId == null) {
              throw new MissingRequiredPropertyException("GetAppServiceSiteConfigScmIpRestriction", "virtualNetworkSubnetId");
            }
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }
        public GetAppServiceSiteConfigScmIpRestriction build() {
            final var _resultValue = new GetAppServiceSiteConfigScmIpRestriction();
            _resultValue.action = action;
            _resultValue.headers = headers;
            _resultValue.ipAddress = ipAddress;
            _resultValue.name = name;
            _resultValue.priority = priority;
            _resultValue.serviceTag = serviceTag;
            _resultValue.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return _resultValue;
        }
    }
}
