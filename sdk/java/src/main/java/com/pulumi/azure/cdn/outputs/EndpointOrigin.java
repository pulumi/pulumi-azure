// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointOrigin {
    /**
     * @return A string that determines the hostname/IP address of the origin server. This string can be a domain name, Storage Account endpoint, Web App endpoint, IPv4 address or IPv6 address. Changing this forces a new resource to be created.
     * 
     */
    private String hostName;
    /**
     * @return The HTTP port of the origin. Defaults to `80`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Integer httpPort;
    /**
     * @return The HTTPS port of the origin. Defaults to `443`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Integer httpsPort;
    /**
     * @return The name of the origin. This is an arbitrary value. However, this value needs to be unique under the endpoint. Changing this forces a new resource to be created.
     * 
     */
    private String name;

    private EndpointOrigin() {}
    /**
     * @return A string that determines the hostname/IP address of the origin server. This string can be a domain name, Storage Account endpoint, Web App endpoint, IPv4 address or IPv6 address. Changing this forces a new resource to be created.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The HTTP port of the origin. Defaults to `80`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * @return The HTTPS port of the origin. Defaults to `443`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * @return The name of the origin. This is an arbitrary value. However, this value needs to be unique under the endpoint. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostName;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private String name;
        public Builder() {}
        public Builder(EndpointOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        @CustomType.Setter
        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        @CustomType.Setter
        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public EndpointOrigin build() {
            final var o = new EndpointOrigin();
            o.hostName = hostName;
            o.httpPort = httpPort;
            o.httpsPort = httpsPort;
            o.name = name;
            return o;
        }
    }
}