// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppDapr {
    /**
     * @return The Dapr Application Identifier.
     * 
     */
    private String appId;
    /**
     * @return The port which the application is listening on. This is the same as the `ingress` port.
     * 
     */
    private Integer appPort;
    /**
     * @return The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
     * 
     */
    private String appProtocol;

    private GetAppDapr() {}
    /**
     * @return The Dapr Application Identifier.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The port which the application is listening on. This is the same as the `ingress` port.
     * 
     */
    public Integer appPort() {
        return this.appPort;
    }
    /**
     * @return The protocol for the app. Possible values include `http` and `grpc`. Defaults to `http`.
     * 
     */
    public String appProtocol() {
        return this.appProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppDapr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private Integer appPort;
        private String appProtocol;
        public Builder() {}
        public Builder(GetAppDapr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appPort = defaults.appPort;
    	      this.appProtocol = defaults.appProtocol;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder appPort(Integer appPort) {
            this.appPort = Objects.requireNonNull(appPort);
            return this;
        }
        @CustomType.Setter
        public Builder appProtocol(String appProtocol) {
            this.appProtocol = Objects.requireNonNull(appProtocol);
            return this;
        }
        public GetAppDapr build() {
            final var o = new GetAppDapr();
            o.appId = appId;
            o.appPort = appPort;
            o.appProtocol = appProtocol;
            return o;
        }
    }
}