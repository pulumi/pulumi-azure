// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayAuthenticationCertificate {
    /**
     * @return The contents of the Authentication Certificate which should be used.
     * 
     */
    private String data;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the Authentication Certificate.
     * 
     */
    private String name;

    private ApplicationGatewayAuthenticationCertificate() {}
    /**
     * @return The contents of the Authentication Certificate which should be used.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the Authentication Certificate.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAuthenticationCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String data;
        private @Nullable String id;
        private String name;
        public Builder() {}
        public Builder(ApplicationGatewayAuthenticationCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ApplicationGatewayAuthenticationCertificate build() {
            final var o = new ApplicationGatewayAuthenticationCertificate();
            o.data = data;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}