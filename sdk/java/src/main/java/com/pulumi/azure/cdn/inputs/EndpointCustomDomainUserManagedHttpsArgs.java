// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointCustomDomainUserManagedHttpsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointCustomDomainUserManagedHttpsArgs Empty = new EndpointCustomDomainUserManagedHttpsArgs();

    /**
     * The ID of the Key Vault Certificate that contains the HTTPS certificate. This is deprecated in favor of `key_vault_secret_id`.
     * 
     * @deprecated
     * This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate
     * 
     */
    @Deprecated /* This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate */
    @Import(name="keyVaultCertificateId")
    private @Nullable Output<String> keyVaultCertificateId;

    /**
     * @return The ID of the Key Vault Certificate that contains the HTTPS certificate. This is deprecated in favor of `key_vault_secret_id`.
     * 
     * @deprecated
     * This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate
     * 
     */
    @Deprecated /* This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate */
    public Optional<Output<String>> keyVaultCertificateId() {
        return Optional.ofNullable(this.keyVaultCertificateId);
    }

    /**
     * The ID of the Key Vault Secret that contains the HTTPS certificate.
     * 
     */
    @Import(name="keyVaultSecretId")
    private @Nullable Output<String> keyVaultSecretId;

    /**
     * @return The ID of the Key Vault Secret that contains the HTTPS certificate.
     * 
     */
    public Optional<Output<String>> keyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }

    /**
     * The minimum TLS protocol version that is used for HTTPS. Possible values are `TLS10` (representing TLS 1.0/1.1), `TLS12` (representing TLS 1.2) and `None` (representing no minimums). Defaults to `TLS12`.
     * 
     */
    @Import(name="tlsVersion")
    private @Nullable Output<String> tlsVersion;

    /**
     * @return The minimum TLS protocol version that is used for HTTPS. Possible values are `TLS10` (representing TLS 1.0/1.1), `TLS12` (representing TLS 1.2) and `None` (representing no minimums). Defaults to `TLS12`.
     * 
     */
    public Optional<Output<String>> tlsVersion() {
        return Optional.ofNullable(this.tlsVersion);
    }

    private EndpointCustomDomainUserManagedHttpsArgs() {}

    private EndpointCustomDomainUserManagedHttpsArgs(EndpointCustomDomainUserManagedHttpsArgs $) {
        this.keyVaultCertificateId = $.keyVaultCertificateId;
        this.keyVaultSecretId = $.keyVaultSecretId;
        this.tlsVersion = $.tlsVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointCustomDomainUserManagedHttpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointCustomDomainUserManagedHttpsArgs $;

        public Builder() {
            $ = new EndpointCustomDomainUserManagedHttpsArgs();
        }

        public Builder(EndpointCustomDomainUserManagedHttpsArgs defaults) {
            $ = new EndpointCustomDomainUserManagedHttpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultCertificateId The ID of the Key Vault Certificate that contains the HTTPS certificate. This is deprecated in favor of `key_vault_secret_id`.
         * 
         * @return builder
         * 
         * @deprecated
         * This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate
         * 
         */
        @Deprecated /* This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate */
        public Builder keyVaultCertificateId(@Nullable Output<String> keyVaultCertificateId) {
            $.keyVaultCertificateId = keyVaultCertificateId;
            return this;
        }

        /**
         * @param keyVaultCertificateId The ID of the Key Vault Certificate that contains the HTTPS certificate. This is deprecated in favor of `key_vault_secret_id`.
         * 
         * @return builder
         * 
         * @deprecated
         * This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate
         * 
         */
        @Deprecated /* This is deprecated in favor of `key_vault_secret_id` as the service is actually looking for a secret, not a certificate */
        public Builder keyVaultCertificateId(String keyVaultCertificateId) {
            return keyVaultCertificateId(Output.of(keyVaultCertificateId));
        }

        /**
         * @param keyVaultSecretId The ID of the Key Vault Secret that contains the HTTPS certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretId(@Nullable Output<String> keyVaultSecretId) {
            $.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        /**
         * @param keyVaultSecretId The ID of the Key Vault Secret that contains the HTTPS certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretId(String keyVaultSecretId) {
            return keyVaultSecretId(Output.of(keyVaultSecretId));
        }

        /**
         * @param tlsVersion The minimum TLS protocol version that is used for HTTPS. Possible values are `TLS10` (representing TLS 1.0/1.1), `TLS12` (representing TLS 1.2) and `None` (representing no minimums). Defaults to `TLS12`.
         * 
         * @return builder
         * 
         */
        public Builder tlsVersion(@Nullable Output<String> tlsVersion) {
            $.tlsVersion = tlsVersion;
            return this;
        }

        /**
         * @param tlsVersion The minimum TLS protocol version that is used for HTTPS. Possible values are `TLS10` (representing TLS 1.0/1.1), `TLS12` (representing TLS 1.2) and `None` (representing no minimums). Defaults to `TLS12`.
         * 
         * @return builder
         * 
         */
        public Builder tlsVersion(String tlsVersion) {
            return tlsVersion(Output.of(tlsVersion));
        }

        public EndpointCustomDomainUserManagedHttpsArgs build() {
            return $;
        }
    }

}