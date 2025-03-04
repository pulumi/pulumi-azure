// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BackendServiceFabricClusterServerX509NameArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceFabricClusterServerX509NameArgs Empty = new BackendServiceFabricClusterServerX509NameArgs();

    /**
     * The thumbprint for the issuer of the certificate.
     * 
     */
    @Import(name="issuerCertificateThumbprint", required=true)
    private Output<String> issuerCertificateThumbprint;

    /**
     * @return The thumbprint for the issuer of the certificate.
     * 
     */
    public Output<String> issuerCertificateThumbprint() {
        return this.issuerCertificateThumbprint;
    }

    /**
     * The common name of the certificate.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The common name of the certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private BackendServiceFabricClusterServerX509NameArgs() {}

    private BackendServiceFabricClusterServerX509NameArgs(BackendServiceFabricClusterServerX509NameArgs $) {
        this.issuerCertificateThumbprint = $.issuerCertificateThumbprint;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceFabricClusterServerX509NameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceFabricClusterServerX509NameArgs $;

        public Builder() {
            $ = new BackendServiceFabricClusterServerX509NameArgs();
        }

        public Builder(BackendServiceFabricClusterServerX509NameArgs defaults) {
            $ = new BackendServiceFabricClusterServerX509NameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param issuerCertificateThumbprint The thumbprint for the issuer of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder issuerCertificateThumbprint(Output<String> issuerCertificateThumbprint) {
            $.issuerCertificateThumbprint = issuerCertificateThumbprint;
            return this;
        }

        /**
         * @param issuerCertificateThumbprint The thumbprint for the issuer of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder issuerCertificateThumbprint(String issuerCertificateThumbprint) {
            return issuerCertificateThumbprint(Output.of(issuerCertificateThumbprint));
        }

        /**
         * @param name The common name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The common name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BackendServiceFabricClusterServerX509NameArgs build() {
            if ($.issuerCertificateThumbprint == null) {
                throw new MissingRequiredPropertyException("BackendServiceFabricClusterServerX509NameArgs", "issuerCertificateThumbprint");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("BackendServiceFabricClusterServerX509NameArgs", "name");
            }
            return $;
        }
    }

}
