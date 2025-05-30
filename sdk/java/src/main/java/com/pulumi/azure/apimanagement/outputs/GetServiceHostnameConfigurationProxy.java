// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceHostnameConfigurationProxy {
    /**
     * @return Is this the default SSL Binding?
     * 
     */
    private Boolean defaultSslBinding;
    /**
     * @return The Hostname used for the SCM URL.
     * 
     */
    private String hostName;
    /**
     * @return The ID of the Key Vault Secret which contains the SSL Certificate.
     * 
     */
    private String keyVaultCertificateId;
    private String keyVaultId;
    /**
     * @return Is Client Certificate Negotiation enabled?
     * 
     */
    private Boolean negotiateClientCertificate;

    private GetServiceHostnameConfigurationProxy() {}
    /**
     * @return Is this the default SSL Binding?
     * 
     */
    public Boolean defaultSslBinding() {
        return this.defaultSslBinding;
    }
    /**
     * @return The Hostname used for the SCM URL.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The ID of the Key Vault Secret which contains the SSL Certificate.
     * 
     */
    public String keyVaultCertificateId() {
        return this.keyVaultCertificateId;
    }
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return Is Client Certificate Negotiation enabled?
     * 
     */
    public Boolean negotiateClientCertificate() {
        return this.negotiateClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceHostnameConfigurationProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean defaultSslBinding;
        private String hostName;
        private String keyVaultCertificateId;
        private String keyVaultId;
        private Boolean negotiateClientCertificate;
        public Builder() {}
        public Builder(GetServiceHostnameConfigurationProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSslBinding = defaults.defaultSslBinding;
    	      this.hostName = defaults.hostName;
    	      this.keyVaultCertificateId = defaults.keyVaultCertificateId;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
        }

        @CustomType.Setter
        public Builder defaultSslBinding(Boolean defaultSslBinding) {
            if (defaultSslBinding == null) {
              throw new MissingRequiredPropertyException("GetServiceHostnameConfigurationProxy", "defaultSslBinding");
            }
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            if (hostName == null) {
              throw new MissingRequiredPropertyException("GetServiceHostnameConfigurationProxy", "hostName");
            }
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultCertificateId(String keyVaultCertificateId) {
            if (keyVaultCertificateId == null) {
              throw new MissingRequiredPropertyException("GetServiceHostnameConfigurationProxy", "keyVaultCertificateId");
            }
            this.keyVaultCertificateId = keyVaultCertificateId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            if (keyVaultId == null) {
              throw new MissingRequiredPropertyException("GetServiceHostnameConfigurationProxy", "keyVaultId");
            }
            this.keyVaultId = keyVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder negotiateClientCertificate(Boolean negotiateClientCertificate) {
            if (negotiateClientCertificate == null) {
              throw new MissingRequiredPropertyException("GetServiceHostnameConfigurationProxy", "negotiateClientCertificate");
            }
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }
        public GetServiceHostnameConfigurationProxy build() {
            final var _resultValue = new GetServiceHostnameConfigurationProxy();
            _resultValue.defaultSslBinding = defaultSslBinding;
            _resultValue.hostName = hostName;
            _resultValue.keyVaultCertificateId = keyVaultCertificateId;
            _resultValue.keyVaultId = keyVaultId;
            _resultValue.negotiateClientCertificate = negotiateClientCertificate;
            return _resultValue;
        }
    }
}
