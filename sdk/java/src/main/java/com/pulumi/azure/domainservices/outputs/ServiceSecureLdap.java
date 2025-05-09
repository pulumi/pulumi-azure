// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.domainservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceSecureLdap {
    /**
     * @return The expiry time of the certificate.
     * 
     */
    private @Nullable String certificateExpiry;
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    private @Nullable String certificateThumbprint;
    /**
     * @return Whether to enable secure LDAP for the managed domain. For more information, please see [official documentation on enabling LDAPS](https://docs.microsoft.com/azure/active-directory-domain-services/tutorial-configure-ldaps), paying particular attention to the section on network security to avoid unnecessarily exposing your service to Internet-borne bruteforce attacks.
     * 
     */
    private Boolean enabled;
    /**
     * @return Whether to enable external access to LDAPS over the Internet. Defaults to `false`.
     * 
     */
    private @Nullable Boolean externalAccessEnabled;
    /**
     * @return The certificate/private key to use for LDAPS, as a base64-encoded TripleDES-SHA1 encrypted PKCS#12 bundle (PFX file).
     * 
     */
    private String pfxCertificate;
    /**
     * @return The password to use for decrypting the PKCS#12 bundle (PFX file).
     * 
     */
    private String pfxCertificatePassword;
    /**
     * @return The public certificate.
     * 
     */
    private @Nullable String publicCertificate;

    private ServiceSecureLdap() {}
    /**
     * @return The expiry time of the certificate.
     * 
     */
    public Optional<String> certificateExpiry() {
        return Optional.ofNullable(this.certificateExpiry);
    }
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public Optional<String> certificateThumbprint() {
        return Optional.ofNullable(this.certificateThumbprint);
    }
    /**
     * @return Whether to enable secure LDAP for the managed domain. For more information, please see [official documentation on enabling LDAPS](https://docs.microsoft.com/azure/active-directory-domain-services/tutorial-configure-ldaps), paying particular attention to the section on network security to avoid unnecessarily exposing your service to Internet-borne bruteforce attacks.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Whether to enable external access to LDAPS over the Internet. Defaults to `false`.
     * 
     */
    public Optional<Boolean> externalAccessEnabled() {
        return Optional.ofNullable(this.externalAccessEnabled);
    }
    /**
     * @return The certificate/private key to use for LDAPS, as a base64-encoded TripleDES-SHA1 encrypted PKCS#12 bundle (PFX file).
     * 
     */
    public String pfxCertificate() {
        return this.pfxCertificate;
    }
    /**
     * @return The password to use for decrypting the PKCS#12 bundle (PFX file).
     * 
     */
    public String pfxCertificatePassword() {
        return this.pfxCertificatePassword;
    }
    /**
     * @return The public certificate.
     * 
     */
    public Optional<String> publicCertificate() {
        return Optional.ofNullable(this.publicCertificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSecureLdap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateExpiry;
        private @Nullable String certificateThumbprint;
        private Boolean enabled;
        private @Nullable Boolean externalAccessEnabled;
        private String pfxCertificate;
        private String pfxCertificatePassword;
        private @Nullable String publicCertificate;
        public Builder() {}
        public Builder(ServiceSecureLdap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateExpiry = defaults.certificateExpiry;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.enabled = defaults.enabled;
    	      this.externalAccessEnabled = defaults.externalAccessEnabled;
    	      this.pfxCertificate = defaults.pfxCertificate;
    	      this.pfxCertificatePassword = defaults.pfxCertificatePassword;
    	      this.publicCertificate = defaults.publicCertificate;
        }

        @CustomType.Setter
        public Builder certificateExpiry(@Nullable String certificateExpiry) {

            this.certificateExpiry = certificateExpiry;
            return this;
        }
        @CustomType.Setter
        public Builder certificateThumbprint(@Nullable String certificateThumbprint) {

            this.certificateThumbprint = certificateThumbprint;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("ServiceSecureLdap", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder externalAccessEnabled(@Nullable Boolean externalAccessEnabled) {

            this.externalAccessEnabled = externalAccessEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder pfxCertificate(String pfxCertificate) {
            if (pfxCertificate == null) {
              throw new MissingRequiredPropertyException("ServiceSecureLdap", "pfxCertificate");
            }
            this.pfxCertificate = pfxCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder pfxCertificatePassword(String pfxCertificatePassword) {
            if (pfxCertificatePassword == null) {
              throw new MissingRequiredPropertyException("ServiceSecureLdap", "pfxCertificatePassword");
            }
            this.pfxCertificatePassword = pfxCertificatePassword;
            return this;
        }
        @CustomType.Setter
        public Builder publicCertificate(@Nullable String publicCertificate) {

            this.publicCertificate = publicCertificate;
            return this;
        }
        public ServiceSecureLdap build() {
            final var _resultValue = new ServiceSecureLdap();
            _resultValue.certificateExpiry = certificateExpiry;
            _resultValue.certificateThumbprint = certificateThumbprint;
            _resultValue.enabled = enabled;
            _resultValue.externalAccessEnabled = externalAccessEnabled;
            _resultValue.pfxCertificate = pfxCertificate;
            _resultValue.pfxCertificatePassword = pfxCertificatePassword;
            _resultValue.publicCertificate = publicCertificate;
            return _resultValue;
        }
    }
}
