// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocalNetworkGatewayBgpSettings {
    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    private Integer asn;
    /**
     * @return The BGP peering address and BGP identifier
     * of this BGP speaker.
     * 
     */
    private String bgpPeeringAddress;
    /**
     * @return The weight added to routes learned from this
     * BGP speaker.
     * 
     */
    private @Nullable Integer peerWeight;

    private LocalNetworkGatewayBgpSettings() {}
    /**
     * @return The BGP speaker&#39;s ASN.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The BGP peering address and BGP identifier
     * of this BGP speaker.
     * 
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }
    /**
     * @return The weight added to routes learned from this
     * BGP speaker.
     * 
     */
    public Optional<Integer> peerWeight() {
        return Optional.ofNullable(this.peerWeight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalNetworkGatewayBgpSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer asn;
        private String bgpPeeringAddress;
        private @Nullable Integer peerWeight;
        public Builder() {}
        public Builder(LocalNetworkGatewayBgpSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
    	      this.peerWeight = defaults.peerWeight;
        }

        @CustomType.Setter
        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        @CustomType.Setter
        public Builder bgpPeeringAddress(String bgpPeeringAddress) {
            this.bgpPeeringAddress = Objects.requireNonNull(bgpPeeringAddress);
            return this;
        }
        @CustomType.Setter
        public Builder peerWeight(@Nullable Integer peerWeight) {
            this.peerWeight = peerWeight;
            return this;
        }
        public LocalNetworkGatewayBgpSettings build() {
            final var o = new LocalNetworkGatewayBgpSettings();
            o.asn = asn;
            o.bgpPeeringAddress = bgpPeeringAddress;
            o.peerWeight = peerWeight;
            return o;
        }
    }
}