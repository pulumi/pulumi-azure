// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertifiateCertificatePolicyIssuerParameters {
    /**
     * @return The name of the Certificate Issuer. Possible values include `Self` (for self-signed certificate), or `Unknown` (for a certificate issuing authority like `Let&#39;s Encrypt` and Azure direct supported ones).
     * 
     */
    private String name;

    private CertifiateCertificatePolicyIssuerParameters() {}
    /**
     * @return The name of the Certificate Issuer. Possible values include `Self` (for self-signed certificate), or `Unknown` (for a certificate issuing authority like `Let&#39;s Encrypt` and Azure direct supported ones).
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicyIssuerParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(CertifiateCertificatePolicyIssuerParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("CertifiateCertificatePolicyIssuerParameters", "name");
            }
            this.name = name;
            return this;
        }
        public CertifiateCertificatePolicyIssuerParameters build() {
            final var _resultValue = new CertifiateCertificatePolicyIssuerParameters();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
