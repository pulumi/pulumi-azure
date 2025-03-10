// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs Empty = new VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs();

    /**
     * The address of the Radius Server.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The address of the Radius Server.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The score of the Radius Server determines the priority of the server. Possible values are between `1` and `30`.
     * 
     */
    @Import(name="score", required=true)
    private Output<Integer> score;

    /**
     * @return The score of the Radius Server determines the priority of the server. Possible values are between `1` and `30`.
     * 
     */
    public Output<Integer> score() {
        return this.score;
    }

    /**
     * The secret that is used to communicate with the Radius Server.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The secret that is used to communicate with the Radius Server.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs() {}

    private VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs(VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs $) {
        this.address = $.address;
        this.score = $.score;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs();
        }

        public Builder(VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs defaults) {
            $ = new VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param score The score of the Radius Server determines the priority of the server. Possible values are between `1` and `30`.
         * 
         * @return builder
         * 
         */
        public Builder score(Output<Integer> score) {
            $.score = score;
            return this;
        }

        /**
         * @param score The score of the Radius Server determines the priority of the server. Possible values are between `1` and `30`.
         * 
         * @return builder
         * 
         */
        public Builder score(Integer score) {
            return score(Output.of(score));
        }

        /**
         * @param secret The secret that is used to communicate with the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The secret that is used to communicate with the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs", "address");
            }
            if ($.score == null) {
                throw new MissingRequiredPropertyException("VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs", "score");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("VirtualNetworkGatewayVpnClientConfigurationRadiusServerArgs", "secret");
            }
            return $;
        }
    }

}
