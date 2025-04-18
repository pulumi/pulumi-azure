// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CertifiateCertificatePolicySecretPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertifiateCertificatePolicySecretPropertiesArgs Empty = new CertifiateCertificatePolicySecretPropertiesArgs();

    /**
     * The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    private CertifiateCertificatePolicySecretPropertiesArgs() {}

    private CertifiateCertificatePolicySecretPropertiesArgs(CertifiateCertificatePolicySecretPropertiesArgs $) {
        this.contentType = $.contentType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertifiateCertificatePolicySecretPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertifiateCertificatePolicySecretPropertiesArgs $;

        public Builder() {
            $ = new CertifiateCertificatePolicySecretPropertiesArgs();
        }

        public Builder(CertifiateCertificatePolicySecretPropertiesArgs defaults) {
            $ = new CertifiateCertificatePolicySecretPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The Content-Type of the Certificate, such as `application/x-pkcs12` for a PFX or `application/x-pem-file` for a PEM.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public CertifiateCertificatePolicySecretPropertiesArgs build() {
            if ($.contentType == null) {
                throw new MissingRequiredPropertyException("CertifiateCertificatePolicySecretPropertiesArgs", "contentType");
            }
            return $;
        }
    }

}
