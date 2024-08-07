// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkSubnetSharedPublicIpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkSubnetSharedPublicIpAddressArgs Empty = new VirtualNetworkSubnetSharedPublicIpAddressArgs();

    /**
     * A list of `allowed_ports` blocks as defined below.
     * 
     */
    @Import(name="allowedPorts")
    private @Nullable Output<List<VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs>> allowedPorts;

    /**
     * @return A list of `allowed_ports` blocks as defined below.
     * 
     */
    public Optional<Output<List<VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs>>> allowedPorts() {
        return Optional.ofNullable(this.allowedPorts);
    }

    private VirtualNetworkSubnetSharedPublicIpAddressArgs() {}

    private VirtualNetworkSubnetSharedPublicIpAddressArgs(VirtualNetworkSubnetSharedPublicIpAddressArgs $) {
        this.allowedPorts = $.allowedPorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkSubnetSharedPublicIpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkSubnetSharedPublicIpAddressArgs $;

        public Builder() {
            $ = new VirtualNetworkSubnetSharedPublicIpAddressArgs();
        }

        public Builder(VirtualNetworkSubnetSharedPublicIpAddressArgs defaults) {
            $ = new VirtualNetworkSubnetSharedPublicIpAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedPorts A list of `allowed_ports` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder allowedPorts(@Nullable Output<List<VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs>> allowedPorts) {
            $.allowedPorts = allowedPorts;
            return this;
        }

        /**
         * @param allowedPorts A list of `allowed_ports` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder allowedPorts(List<VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs> allowedPorts) {
            return allowedPorts(Output.of(allowedPorts));
        }

        /**
         * @param allowedPorts A list of `allowed_ports` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder allowedPorts(VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs... allowedPorts) {
            return allowedPorts(List.of(allowedPorts));
        }

        public VirtualNetworkSubnetSharedPublicIpAddressArgs build() {
            return $;
        }
    }

}
