// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressRouteCircuitPeeringMicrosoftPeeringConfig {
    /**
     * @return The communities of Bgp Peering specified for microsoft peering.
     * 
     */
    private @Nullable List<String> advertisedCommunities;
    /**
     * @return A list of Advertised Public Prefixes.
     * 
     */
    private List<String> advertisedPublicPrefixes;
    /**
     * @return The CustomerASN of the peering. Defaults to `0`.
     * 
     */
    private @Nullable Integer customerAsn;
    /**
     * @return The Routing Registry against which the AS number and prefixes are registered. For example: `ARIN`, `RIPE`, `AFRINIC` etc. Defaults to `NONE`.
     * 
     */
    private @Nullable String routingRegistryName;

    private ExpressRouteCircuitPeeringMicrosoftPeeringConfig() {}
    /**
     * @return The communities of Bgp Peering specified for microsoft peering.
     * 
     */
    public List<String> advertisedCommunities() {
        return this.advertisedCommunities == null ? List.of() : this.advertisedCommunities;
    }
    /**
     * @return A list of Advertised Public Prefixes.
     * 
     */
    public List<String> advertisedPublicPrefixes() {
        return this.advertisedPublicPrefixes;
    }
    /**
     * @return The CustomerASN of the peering. Defaults to `0`.
     * 
     */
    public Optional<Integer> customerAsn() {
        return Optional.ofNullable(this.customerAsn);
    }
    /**
     * @return The Routing Registry against which the AS number and prefixes are registered. For example: `ARIN`, `RIPE`, `AFRINIC` etc. Defaults to `NONE`.
     * 
     */
    public Optional<String> routingRegistryName() {
        return Optional.ofNullable(this.routingRegistryName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringMicrosoftPeeringConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> advertisedCommunities;
        private List<String> advertisedPublicPrefixes;
        private @Nullable Integer customerAsn;
        private @Nullable String routingRegistryName;
        public Builder() {}
        public Builder(ExpressRouteCircuitPeeringMicrosoftPeeringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertisedCommunities = defaults.advertisedCommunities;
    	      this.advertisedPublicPrefixes = defaults.advertisedPublicPrefixes;
    	      this.customerAsn = defaults.customerAsn;
    	      this.routingRegistryName = defaults.routingRegistryName;
        }

        @CustomType.Setter
        public Builder advertisedCommunities(@Nullable List<String> advertisedCommunities) {

            this.advertisedCommunities = advertisedCommunities;
            return this;
        }
        public Builder advertisedCommunities(String... advertisedCommunities) {
            return advertisedCommunities(List.of(advertisedCommunities));
        }
        @CustomType.Setter
        public Builder advertisedPublicPrefixes(List<String> advertisedPublicPrefixes) {
            if (advertisedPublicPrefixes == null) {
              throw new MissingRequiredPropertyException("ExpressRouteCircuitPeeringMicrosoftPeeringConfig", "advertisedPublicPrefixes");
            }
            this.advertisedPublicPrefixes = advertisedPublicPrefixes;
            return this;
        }
        public Builder advertisedPublicPrefixes(String... advertisedPublicPrefixes) {
            return advertisedPublicPrefixes(List.of(advertisedPublicPrefixes));
        }
        @CustomType.Setter
        public Builder customerAsn(@Nullable Integer customerAsn) {

            this.customerAsn = customerAsn;
            return this;
        }
        @CustomType.Setter
        public Builder routingRegistryName(@Nullable String routingRegistryName) {

            this.routingRegistryName = routingRegistryName;
            return this;
        }
        public ExpressRouteCircuitPeeringMicrosoftPeeringConfig build() {
            final var _resultValue = new ExpressRouteCircuitPeeringMicrosoftPeeringConfig();
            _resultValue.advertisedCommunities = advertisedCommunities;
            _resultValue.advertisedPublicPrefixes = advertisedPublicPrefixes;
            _resultValue.customerAsn = customerAsn;
            _resultValue.routingRegistryName = routingRegistryName;
            return _resultValue;
        }
    }
}
