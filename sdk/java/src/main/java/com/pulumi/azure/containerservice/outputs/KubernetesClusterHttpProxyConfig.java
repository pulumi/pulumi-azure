// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterHttpProxyConfig {
    /**
     * @return The proxy address to be used when communicating over HTTP.
     * 
     */
    private @Nullable String httpProxy;
    /**
     * @return The proxy address to be used when communicating over HTTPS.
     * 
     */
    private @Nullable String httpsProxy;
    /**
     * @return The list of domains that will not use the proxy for communication.
     * 
     */
    private @Nullable List<String> noProxies;
    /**
     * @return The base64 encoded alternative CA certificate content in PEM format.
     * 
     */
    private @Nullable String trustedCa;

    private KubernetesClusterHttpProxyConfig() {}
    /**
     * @return The proxy address to be used when communicating over HTTP.
     * 
     */
    public Optional<String> httpProxy() {
        return Optional.ofNullable(this.httpProxy);
    }
    /**
     * @return The proxy address to be used when communicating over HTTPS.
     * 
     */
    public Optional<String> httpsProxy() {
        return Optional.ofNullable(this.httpsProxy);
    }
    /**
     * @return The list of domains that will not use the proxy for communication.
     * 
     */
    public List<String> noProxies() {
        return this.noProxies == null ? List.of() : this.noProxies;
    }
    /**
     * @return The base64 encoded alternative CA certificate content in PEM format.
     * 
     */
    public Optional<String> trustedCa() {
        return Optional.ofNullable(this.trustedCa);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterHttpProxyConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String httpProxy;
        private @Nullable String httpsProxy;
        private @Nullable List<String> noProxies;
        private @Nullable String trustedCa;
        public Builder() {}
        public Builder(KubernetesClusterHttpProxyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpProxy = defaults.httpProxy;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.noProxies = defaults.noProxies;
    	      this.trustedCa = defaults.trustedCa;
        }

        @CustomType.Setter
        public Builder httpProxy(@Nullable String httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }
        @CustomType.Setter
        public Builder httpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }
        @CustomType.Setter
        public Builder noProxies(@Nullable List<String> noProxies) {
            this.noProxies = noProxies;
            return this;
        }
        public Builder noProxies(String... noProxies) {
            return noProxies(List.of(noProxies));
        }
        @CustomType.Setter
        public Builder trustedCa(@Nullable String trustedCa) {
            this.trustedCa = trustedCa;
            return this;
        }
        public KubernetesClusterHttpProxyConfig build() {
            final var o = new KubernetesClusterHttpProxyConfig();
            o.httpProxy = httpProxy;
            o.httpsProxy = httpsProxy;
            o.noProxies = noProxies;
            o.trustedCa = trustedCa;
            return o;
        }
    }
}