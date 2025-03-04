// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class VpnServerConfigurationRadiusClientRootCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationRadiusClientRootCertificateArgs Empty = new VpnServerConfigurationRadiusClientRootCertificateArgs();

    /**
     * A name used to uniquely identify this certificate.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A name used to uniquely identify this certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Thumbprint of the Certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
    private Output<String> thumbprint;

    /**
     * @return The Thumbprint of the Certificate.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    private VpnServerConfigurationRadiusClientRootCertificateArgs() {}

    private VpnServerConfigurationRadiusClientRootCertificateArgs(VpnServerConfigurationRadiusClientRootCertificateArgs $) {
        this.name = $.name;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigurationRadiusClientRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigurationRadiusClientRootCertificateArgs $;

        public Builder() {
            $ = new VpnServerConfigurationRadiusClientRootCertificateArgs();
        }

        public Builder(VpnServerConfigurationRadiusClientRootCertificateArgs defaults) {
            $ = new VpnServerConfigurationRadiusClientRootCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A name used to uniquely identify this certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name used to uniquely identify this certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param thumbprint The Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The Thumbprint of the Certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public VpnServerConfigurationRadiusClientRootCertificateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("VpnServerConfigurationRadiusClientRootCertificateArgs", "name");
            }
            if ($.thumbprint == null) {
                throw new MissingRequiredPropertyException("VpnServerConfigurationRadiusClientRootCertificateArgs", "thumbprint");
            }
            return $;
        }
    }

}
