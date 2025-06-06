// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs;
import com.pulumi.azure.paloalto.inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs Empty = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs();

    /**
     * A `backend_config` block as defined above.
     * 
     */
    @Import(name="backendConfig")
    private @Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs> backendConfig;

    /**
     * @return A `backend_config` block as defined above.
     * 
     */
    public Optional<Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs>> backendConfig() {
        return Optional.ofNullable(this.backendConfig);
    }

    /**
     * A `frontend_config` block as defined below.
     * 
     */
    @Import(name="frontendConfig")
    private @Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs> frontendConfig;

    /**
     * @return A `frontend_config` block as defined below.
     * 
     */
    public Optional<Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs>> frontendConfig() {
        return Optional.ofNullable(this.frontendConfig);
    }

    /**
     * The name which should be used for this NAT.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this NAT.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs() {}

    private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs $) {
        this.backendConfig = $.backendConfig;
        this.frontendConfig = $.frontendConfig;
        this.name = $.name;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs();
        }

        public Builder(NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs defaults) {
            $ = new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendConfig A `backend_config` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder backendConfig(@Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs> backendConfig) {
            $.backendConfig = backendConfig;
            return this;
        }

        /**
         * @param backendConfig A `backend_config` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder backendConfig(NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs backendConfig) {
            return backendConfig(Output.of(backendConfig));
        }

        /**
         * @param frontendConfig A `frontend_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendConfig(@Nullable Output<NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs> frontendConfig) {
            $.frontendConfig = frontendConfig;
            return this;
        }

        /**
         * @param frontendConfig A `frontend_config` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendConfig(NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs frontendConfig) {
            return frontendConfig(Output.of(frontendConfig));
        }

        /**
         * @param name The name which should be used for this NAT.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this NAT.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs", "name");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs", "protocol");
            }
            return $;
        }
    }

}
