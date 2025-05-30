// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs Empty = new VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs();

    /**
     * The Audience which should be used for authentication.
     * 
     */
    @Import(name="audience", required=true)
    private Output<String> audience;

    /**
     * @return The Audience which should be used for authentication.
     * 
     */
    public Output<String> audience() {
        return this.audience;
    }

    /**
     * The Issuer which should be used for authentication.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return The Issuer which should be used for authentication.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * The Tenant which should be used for authentication.
     * 
     */
    @Import(name="tenant", required=true)
    private Output<String> tenant;

    /**
     * @return The Tenant which should be used for authentication.
     * 
     */
    public Output<String> tenant() {
        return this.tenant;
    }

    private VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs() {}

    private VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs(VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs $) {
        this.audience = $.audience;
        this.issuer = $.issuer;
        this.tenant = $.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs $;

        public Builder() {
            $ = new VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs();
        }

        public Builder(VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs defaults) {
            $ = new VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audience The Audience which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder audience(Output<String> audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param audience The Audience which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        /**
         * @param issuer The Issuer which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The Issuer which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param tenant The Tenant which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder tenant(Output<String> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The Tenant which should be used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder tenant(String tenant) {
            return tenant(Output.of(tenant));
        }

        public VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs build() {
            if ($.audience == null) {
                throw new MissingRequiredPropertyException("VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs", "audience");
            }
            if ($.issuer == null) {
                throw new MissingRequiredPropertyException("VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs", "issuer");
            }
            if ($.tenant == null) {
                throw new MissingRequiredPropertyException("VpnServerConfigurationAzureActiveDirectoryAuthenticationArgs", "tenant");
            }
            return $;
        }
    }

}
