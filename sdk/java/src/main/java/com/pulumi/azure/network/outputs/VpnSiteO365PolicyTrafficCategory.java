// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnSiteO365PolicyTrafficCategory {
    /**
     * @return Is allow endpoint enabled? The `Allow` endpoint is required for connectivity to specific O365 services and features, but are not as sensitive to network performance and latency as other endpoint types. Defaults to `false`.
     * 
     */
    private @Nullable Boolean allowEndpointEnabled;
    /**
     * @return Is default endpoint enabled? The `Default` endpoint represents O365 services and dependencies that do not require any optimization, and can be treated by customer networks as normal Internet bound traffic. Defaults to `false`.
     * 
     */
    private @Nullable Boolean defaultEndpointEnabled;
    /**
     * @return Is optimize endpoint enabled? The `Optimize` endpoint is required for connectivity to every O365 service and represents the O365 scenario that is the most sensitive to network performance, latency, and availability. Defaults to `false`.
     * 
     */
    private @Nullable Boolean optimizeEndpointEnabled;

    private VpnSiteO365PolicyTrafficCategory() {}
    /**
     * @return Is allow endpoint enabled? The `Allow` endpoint is required for connectivity to specific O365 services and features, but are not as sensitive to network performance and latency as other endpoint types. Defaults to `false`.
     * 
     */
    public Optional<Boolean> allowEndpointEnabled() {
        return Optional.ofNullable(this.allowEndpointEnabled);
    }
    /**
     * @return Is default endpoint enabled? The `Default` endpoint represents O365 services and dependencies that do not require any optimization, and can be treated by customer networks as normal Internet bound traffic. Defaults to `false`.
     * 
     */
    public Optional<Boolean> defaultEndpointEnabled() {
        return Optional.ofNullable(this.defaultEndpointEnabled);
    }
    /**
     * @return Is optimize endpoint enabled? The `Optimize` endpoint is required for connectivity to every O365 service and represents the O365 scenario that is the most sensitive to network performance, latency, and availability. Defaults to `false`.
     * 
     */
    public Optional<Boolean> optimizeEndpointEnabled() {
        return Optional.ofNullable(this.optimizeEndpointEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteO365PolicyTrafficCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowEndpointEnabled;
        private @Nullable Boolean defaultEndpointEnabled;
        private @Nullable Boolean optimizeEndpointEnabled;
        public Builder() {}
        public Builder(VpnSiteO365PolicyTrafficCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEndpointEnabled = defaults.allowEndpointEnabled;
    	      this.defaultEndpointEnabled = defaults.defaultEndpointEnabled;
    	      this.optimizeEndpointEnabled = defaults.optimizeEndpointEnabled;
        }

        @CustomType.Setter
        public Builder allowEndpointEnabled(@Nullable Boolean allowEndpointEnabled) {
            this.allowEndpointEnabled = allowEndpointEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder defaultEndpointEnabled(@Nullable Boolean defaultEndpointEnabled) {
            this.defaultEndpointEnabled = defaultEndpointEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder optimizeEndpointEnabled(@Nullable Boolean optimizeEndpointEnabled) {
            this.optimizeEndpointEnabled = optimizeEndpointEnabled;
            return this;
        }
        public VpnSiteO365PolicyTrafficCategory build() {
            final var o = new VpnSiteO365PolicyTrafficCategory();
            o.allowEndpointEnabled = allowEndpointEnabled;
            o.defaultEndpointEnabled = defaultEndpointEnabled;
            o.optimizeEndpointEnabled = optimizeEndpointEnabled;
            return o;
        }
    }
}