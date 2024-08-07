// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    private String accountName;
    /**
     * @return The format of the certificate, such as `Cer` or `Pfx`.
     * 
     */
    private String format;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The public key of the certificate.
     * 
     */
    private String publicData;
    private String resourceGroupName;
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    private String thumbprint;
    /**
     * @return The algorithm of the certificate thumbprint.
     * 
     */
    private String thumbprintAlgorithm;

    private GetCertificateResult() {}
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The format of the certificate, such as `Cer` or `Pfx`.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The public key of the certificate.
     * 
     */
    public String publicData() {
        return this.publicData;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return The algorithm of the certificate thumbprint.
     * 
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String format;
        private String id;
        private String name;
        private String publicData;
        private String resourceGroupName;
        private String thumbprint;
        private String thumbprintAlgorithm;
        public Builder() {}
        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.publicData = defaults.publicData;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.thumbprintAlgorithm = defaults.thumbprintAlgorithm;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            if (accountName == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder format(String format) {
            if (format == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "format");
            }
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder publicData(String publicData) {
            if (publicData == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "publicData");
            }
            this.publicData = publicData;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(String thumbprint) {
            if (thumbprint == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "thumbprint");
            }
            this.thumbprint = thumbprint;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprintAlgorithm(String thumbprintAlgorithm) {
            if (thumbprintAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetCertificateResult", "thumbprintAlgorithm");
            }
            this.thumbprintAlgorithm = thumbprintAlgorithm;
            return this;
        }
        public GetCertificateResult build() {
            final var _resultValue = new GetCertificateResult();
            _resultValue.accountName = accountName;
            _resultValue.format = format;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.publicData = publicData;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.thumbprint = thumbprint;
            _resultValue.thumbprintAlgorithm = thumbprintAlgorithm;
            return _resultValue;
        }
    }
}
