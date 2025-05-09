// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkSubnetSharedPublicIpAddressAllowedPort {
    /**
     * @return The port on the Virtual Machine that the traffic will be sent to.
     * 
     */
    private @Nullable Integer backendPort;
    /**
     * @return The transport protocol that the traffic will use. Possible values are `TCP` and `UDP`.
     * 
     */
    private @Nullable String transportProtocol;

    private VirtualNetworkSubnetSharedPublicIpAddressAllowedPort() {}
    /**
     * @return The port on the Virtual Machine that the traffic will be sent to.
     * 
     */
    public Optional<Integer> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }
    /**
     * @return The transport protocol that the traffic will use. Possible values are `TCP` and `UDP`.
     * 
     */
    public Optional<String> transportProtocol() {
        return Optional.ofNullable(this.transportProtocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkSubnetSharedPublicIpAddressAllowedPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer backendPort;
        private @Nullable String transportProtocol;
        public Builder() {}
        public Builder(VirtualNetworkSubnetSharedPublicIpAddressAllowedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        @CustomType.Setter
        public Builder backendPort(@Nullable Integer backendPort) {

            this.backendPort = backendPort;
            return this;
        }
        @CustomType.Setter
        public Builder transportProtocol(@Nullable String transportProtocol) {

            this.transportProtocol = transportProtocol;
            return this;
        }
        public VirtualNetworkSubnetSharedPublicIpAddressAllowedPort build() {
            final var _resultValue = new VirtualNetworkSubnetSharedPublicIpAddressAllowedPort();
            _resultValue.backendPort = backendPort;
            _resultValue.transportProtocol = transportProtocol;
            return _resultValue;
        }
    }
}
