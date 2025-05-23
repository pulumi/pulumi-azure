// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs Empty = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs();

    /**
     * The port on which traffic will be receiveed.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port on which traffic will be receiveed.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The ID of the Public IP Address resource the traffic will be received on.
     * 
     */
    @Import(name="publicIpAddressId", required=true)
    private Output<String> publicIpAddressId;

    /**
     * @return The ID of the Public IP Address resource the traffic will be received on.
     * 
     */
    public Output<String> publicIpAddressId() {
        return this.publicIpAddressId;
    }

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs() {}

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs $) {
        this.port = $.port;
        this.publicIpAddressId = $.publicIpAddressId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs();
        }

        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs defaults) {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The port on which traffic will be receiveed.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port on which traffic will be receiveed.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param publicIpAddressId The ID of the Public IP Address resource the traffic will be received on.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId The ID of the Public IP Address resource the traffic will be received on.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs build() {
            if ($.port == null) {
                throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs", "port");
            }
            if ($.publicIpAddressId == null) {
                throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs", "publicIpAddressId");
            }
            return $;
        }
    }

}
