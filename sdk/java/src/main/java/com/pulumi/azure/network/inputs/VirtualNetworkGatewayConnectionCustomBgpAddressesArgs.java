// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayConnectionCustomBgpAddressesArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayConnectionCustomBgpAddressesArgs Empty = new VirtualNetworkGatewayConnectionCustomBgpAddressesArgs();

    /**
     * single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
     * 
     */
    @Import(name="primary", required=true)
    private Output<String> primary;

    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
     * 
     */
    public Output<String> primary() {
        return this.primary;
    }

    /**
     * single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
     * 
     */
    @Import(name="secondary")
    private @Nullable Output<String> secondary;

    /**
     * @return single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
     * 
     */
    public Optional<Output<String>> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    private VirtualNetworkGatewayConnectionCustomBgpAddressesArgs() {}

    private VirtualNetworkGatewayConnectionCustomBgpAddressesArgs(VirtualNetworkGatewayConnectionCustomBgpAddressesArgs $) {
        this.primary = $.primary;
        this.secondary = $.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayConnectionCustomBgpAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayConnectionCustomBgpAddressesArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayConnectionCustomBgpAddressesArgs();
        }

        public Builder(VirtualNetworkGatewayConnectionCustomBgpAddressesArgs defaults) {
            $ = new VirtualNetworkGatewayConnectionCustomBgpAddressesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param primary single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
         * 
         * @return builder
         * 
         */
        public Builder primary(Output<String> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (first one)
         * 
         * @return builder
         * 
         */
        public Builder primary(String primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param secondary single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
         * 
         * @return builder
         * 
         */
        public Builder secondary(@Nullable Output<String> secondary) {
            $.secondary = secondary;
            return this;
        }

        /**
         * @param secondary single IP address that is part of the `azure.network.VirtualNetworkGateway` ip_configuration (second one)
         * 
         * @return builder
         * 
         */
        public Builder secondary(String secondary) {
            return secondary(Output.of(secondary));
        }

        public VirtualNetworkGatewayConnectionCustomBgpAddressesArgs build() {
            if ($.primary == null) {
                throw new MissingRequiredPropertyException("VirtualNetworkGatewayConnectionCustomBgpAddressesArgs", "primary");
            }
            return $;
        }
    }

}
