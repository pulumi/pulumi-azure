// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.outputs;

import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig;
import com.pulumi.azure.paloalto.outputs.NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNat {
    /**
     * @return A `backend_config` block as defined above.
     * 
     */
    private @Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig backendConfig;
    /**
     * @return A `frontend_config` block as defined below.
     * 
     */
    private @Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig frontendConfig;
    /**
     * @return The name which should be used for this NAT.
     * 
     */
    private String name;
    /**
     * @return The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
     * 
     */
    private String protocol;

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNat() {}
    /**
     * @return A `backend_config` block as defined above.
     * 
     */
    public Optional<NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig> backendConfig() {
        return Optional.ofNullable(this.backendConfig);
    }
    /**
     * @return A `frontend_config` block as defined below.
     * 
     */
    public Optional<NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig> frontendConfig() {
        return Optional.ofNullable(this.frontendConfig);
    }
    /**
     * @return The name which should be used for this NAT.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The protocol used for this Destination NAT. Possible values include `TCP` and `UDP`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig backendConfig;
        private @Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig frontendConfig;
        private String name;
        private String protocol;
        public Builder() {}
        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendConfig = defaults.backendConfig;
    	      this.frontendConfig = defaults.frontendConfig;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder backendConfig(@Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig backendConfig) {

            this.backendConfig = backendConfig;
            return this;
        }
        @CustomType.Setter
        public Builder frontendConfig(@Nullable NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfig frontendConfig) {

            this.frontendConfig = frontendConfig;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubLocalRulestackDestinationNat", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("NextGenerationFirewallVirtualHubLocalRulestackDestinationNat", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNat build() {
            final var _resultValue = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNat();
            _resultValue.backendConfig = backendConfig;
            _resultValue.frontendConfig = frontendConfig;
            _resultValue.name = name;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
