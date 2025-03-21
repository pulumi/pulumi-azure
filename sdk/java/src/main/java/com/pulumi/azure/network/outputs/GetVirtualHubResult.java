// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVirtualHubResult {
    /**
     * @return The Address Prefix used for this Virtual Hub.
     * 
     */
    private String addressPrefix;
    /**
     * @return The ID of the default Route Table in the Virtual Hub.
     * 
     */
    private String defaultRouteTableId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the Virtual Hub exists.
     * 
     */
    private String location;
    private String name;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Virtual Hub.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The Autonomous System Number of the Virtual Hub BGP router.
     * 
     */
    private Integer virtualRouterAsn;
    /**
     * @return The IP addresses of the Virtual Hub BGP router.
     * 
     */
    private List<String> virtualRouterIps;
    /**
     * @return The ID of the Virtual WAN within which the Virtual Hub exists.
     * 
     */
    private String virtualWanId;

    private GetVirtualHubResult() {}
    /**
     * @return The Address Prefix used for this Virtual Hub.
     * 
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }
    /**
     * @return The ID of the default Route Table in the Virtual Hub.
     * 
     */
    public String defaultRouteTableId() {
        return this.defaultRouteTableId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the Virtual Hub exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the Virtual Hub.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The Autonomous System Number of the Virtual Hub BGP router.
     * 
     */
    public Integer virtualRouterAsn() {
        return this.virtualRouterAsn;
    }
    /**
     * @return The IP addresses of the Virtual Hub BGP router.
     * 
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }
    /**
     * @return The ID of the Virtual WAN within which the Virtual Hub exists.
     * 
     */
    public String virtualWanId() {
        return this.virtualWanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressPrefix;
        private String defaultRouteTableId;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        private Integer virtualRouterAsn;
        private List<String> virtualRouterIps;
        private String virtualWanId;
        public Builder() {}
        public Builder(GetVirtualHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.defaultRouteTableId = defaults.defaultRouteTableId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
    	      this.virtualWanId = defaults.virtualWanId;
        }

        @CustomType.Setter
        public Builder addressPrefix(String addressPrefix) {
            if (addressPrefix == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "addressPrefix");
            }
            this.addressPrefix = addressPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder defaultRouteTableId(String defaultRouteTableId) {
            if (defaultRouteTableId == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "defaultRouteTableId");
            }
            this.defaultRouteTableId = defaultRouteTableId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder virtualRouterAsn(Integer virtualRouterAsn) {
            if (virtualRouterAsn == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "virtualRouterAsn");
            }
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }
        @CustomType.Setter
        public Builder virtualRouterIps(List<String> virtualRouterIps) {
            if (virtualRouterIps == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "virtualRouterIps");
            }
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }
        public Builder virtualRouterIps(String... virtualRouterIps) {
            return virtualRouterIps(List.of(virtualRouterIps));
        }
        @CustomType.Setter
        public Builder virtualWanId(String virtualWanId) {
            if (virtualWanId == null) {
              throw new MissingRequiredPropertyException("GetVirtualHubResult", "virtualWanId");
            }
            this.virtualWanId = virtualWanId;
            return this;
        }
        public GetVirtualHubResult build() {
            final var _resultValue = new GetVirtualHubResult();
            _resultValue.addressPrefix = addressPrefix;
            _resultValue.defaultRouteTableId = defaultRouteTableId;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            _resultValue.virtualRouterAsn = virtualRouterAsn;
            _resultValue.virtualRouterIps = virtualRouterIps;
            _resultValue.virtualWanId = virtualWanId;
            return _resultValue;
        }
    }
}
