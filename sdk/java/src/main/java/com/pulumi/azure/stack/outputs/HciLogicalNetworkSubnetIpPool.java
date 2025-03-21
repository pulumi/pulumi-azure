// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.stack.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HciLogicalNetworkSubnetIpPool {
    /**
     * @return The IPv4 address of the end of the IP address pool. Changing this forces a new resource to be created.
     * 
     */
    private String end;
    /**
     * @return The IPv4 address of the start of the IP address pool. Changing this forces a new resource to be created.
     * 
     */
    private String start;

    private HciLogicalNetworkSubnetIpPool() {}
    /**
     * @return The IPv4 address of the end of the IP address pool. Changing this forces a new resource to be created.
     * 
     */
    public String end() {
        return this.end;
    }
    /**
     * @return The IPv4 address of the start of the IP address pool. Changing this forces a new resource to be created.
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HciLogicalNetworkSubnetIpPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String end;
        private String start;
        public Builder() {}
        public Builder(HciLogicalNetworkSubnetIpPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder end(String end) {
            if (end == null) {
              throw new MissingRequiredPropertyException("HciLogicalNetworkSubnetIpPool", "end");
            }
            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            if (start == null) {
              throw new MissingRequiredPropertyException("HciLogicalNetworkSubnetIpPool", "start");
            }
            this.start = start;
            return this;
        }
        public HciLogicalNetworkSubnetIpPool build() {
            final var _resultValue = new HciLogicalNetworkSubnetIpPool();
            _resultValue.end = end;
            _resultValue.start = start;
            return _resultValue;
        }
    }
}
