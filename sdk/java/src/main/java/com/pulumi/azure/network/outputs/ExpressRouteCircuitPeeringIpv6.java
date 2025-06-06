// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ExpressRouteCircuitPeeringIpv6MicrosoftPeering;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitPeeringIpv6 {
    /**
     * @return A boolean value indicating whether the IPv6 peering is enabled. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return A `microsoft_peering` block as defined below.
     * 
     */
    private @Nullable ExpressRouteCircuitPeeringIpv6MicrosoftPeering microsoftPeering;
    /**
     * @return A subnet for the primary link.
     * 
     */
    private String primaryPeerAddressPrefix;
    /**
     * @return The ID of the Route Filter. Only available when `peering_type` is set to `MicrosoftPeering`.
     * 
     * &gt; **Note:** `ipv6` can be specified when `peering_type` is `MicrosoftPeering` or `AzurePrivatePeering`
     * 
     */
    private @Nullable String routeFilterId;
    /**
     * @return A subnet for the secondary link.
     * 
     */
    private String secondaryPeerAddressPrefix;

    private ExpressRouteCircuitPeeringIpv6() {}
    /**
     * @return A boolean value indicating whether the IPv6 peering is enabled. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return A `microsoft_peering` block as defined below.
     * 
     */
    public Optional<ExpressRouteCircuitPeeringIpv6MicrosoftPeering> microsoftPeering() {
        return Optional.ofNullable(this.microsoftPeering);
    }
    /**
     * @return A subnet for the primary link.
     * 
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }
    /**
     * @return The ID of the Route Filter. Only available when `peering_type` is set to `MicrosoftPeering`.
     * 
     * &gt; **Note:** `ipv6` can be specified when `peering_type` is `MicrosoftPeering` or `AzurePrivatePeering`
     * 
     */
    public Optional<String> routeFilterId() {
        return Optional.ofNullable(this.routeFilterId);
    }
    /**
     * @return A subnet for the secondary link.
     * 
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable ExpressRouteCircuitPeeringIpv6MicrosoftPeering microsoftPeering;
        private String primaryPeerAddressPrefix;
        private @Nullable String routeFilterId;
        private String secondaryPeerAddressPrefix;
        public Builder() {}
        public Builder(ExpressRouteCircuitPeeringIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.microsoftPeering = defaults.microsoftPeering;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilterId = defaults.routeFilterId;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder microsoftPeering(@Nullable ExpressRouteCircuitPeeringIpv6MicrosoftPeering microsoftPeering) {

            this.microsoftPeering = microsoftPeering;
            return this;
        }
        @CustomType.Setter
        public Builder primaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
            if (primaryPeerAddressPrefix == null) {
              throw new MissingRequiredPropertyException("ExpressRouteCircuitPeeringIpv6", "primaryPeerAddressPrefix");
            }
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder routeFilterId(@Nullable String routeFilterId) {

            this.routeFilterId = routeFilterId;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
            if (secondaryPeerAddressPrefix == null) {
              throw new MissingRequiredPropertyException("ExpressRouteCircuitPeeringIpv6", "secondaryPeerAddressPrefix");
            }
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }
        public ExpressRouteCircuitPeeringIpv6 build() {
            final var _resultValue = new ExpressRouteCircuitPeeringIpv6();
            _resultValue.enabled = enabled;
            _resultValue.microsoftPeering = microsoftPeering;
            _resultValue.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            _resultValue.routeFilterId = routeFilterId;
            _resultValue.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return _resultValue;
        }
    }
}
