// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceSecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSecurityArgs Empty = new ServiceSecurityArgs();

    /**
     * Should SSL 3.0 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableBackendSsl30")
    private @Nullable Output<Boolean> enableBackendSsl30;

    /**
     * @return Should SSL 3.0 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBackendSsl30() {
        return Optional.ofNullable(this.enableBackendSsl30);
    }

    /**
     * Should TLS 1.0 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableBackendTls10")
    private @Nullable Output<Boolean> enableBackendTls10;

    /**
     * @return Should TLS 1.0 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBackendTls10() {
        return Optional.ofNullable(this.enableBackendTls10);
    }

    /**
     * Should TLS 1.1 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableBackendTls11")
    private @Nullable Output<Boolean> enableBackendTls11;

    /**
     * @return Should TLS 1.1 be enabled on the backend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBackendTls11() {
        return Optional.ofNullable(this.enableBackendTls11);
    }

    /**
     * Should SSL 3.0 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableFrontendSsl30")
    private @Nullable Output<Boolean> enableFrontendSsl30;

    /**
     * @return Should SSL 3.0 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableFrontendSsl30() {
        return Optional.ofNullable(this.enableFrontendSsl30);
    }

    /**
     * Should TLS 1.0 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableFrontendTls10")
    private @Nullable Output<Boolean> enableFrontendTls10;

    /**
     * @return Should TLS 1.0 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableFrontendTls10() {
        return Optional.ofNullable(this.enableFrontendTls10);
    }

    /**
     * Should TLS 1.1 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    @Import(name="enableFrontendTls11")
    private @Nullable Output<Boolean> enableFrontendTls11;

    /**
     * @return Should TLS 1.1 be enabled on the frontend of the gateway? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableFrontendTls11() {
        return Optional.ofNullable(this.enableFrontendTls11);
    }

    /**
     * Should the `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled;

    /**
     * @return Should the `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled);
    }

    /**
     * Should the `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled;

    /**
     * @return Should the `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled);
    }

    @Import(name="tlsEcdheRsaWithAes128CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsEcdheRsaWithAes128CbcShaCiphersEnabled;

    public Optional<Output<Boolean>> tlsEcdheRsaWithAes128CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsEcdheRsaWithAes128CbcShaCiphersEnabled);
    }

    @Import(name="tlsEcdheRsaWithAes256CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsEcdheRsaWithAes256CbcShaCiphersEnabled;

    public Optional<Output<Boolean>> tlsEcdheRsaWithAes256CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsEcdheRsaWithAes256CbcShaCiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_AES_128_CBC_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsRsaWithAes128CbcSha256CiphersEnabled")
    private @Nullable Output<Boolean> tlsRsaWithAes128CbcSha256CiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_AES_128_CBC_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsRsaWithAes128CbcSha256CiphersEnabled() {
        return Optional.ofNullable(this.tlsRsaWithAes128CbcSha256CiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsRsaWithAes128CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsRsaWithAes128CbcShaCiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsRsaWithAes128CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsRsaWithAes128CbcShaCiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_AES_128_GCM_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsRsaWithAes128GcmSha256CiphersEnabled")
    private @Nullable Output<Boolean> tlsRsaWithAes128GcmSha256CiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_AES_128_GCM_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsRsaWithAes128GcmSha256CiphersEnabled() {
        return Optional.ofNullable(this.tlsRsaWithAes128GcmSha256CiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_AES_256_CBC_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsRsaWithAes256CbcSha256CiphersEnabled")
    private @Nullable Output<Boolean> tlsRsaWithAes256CbcSha256CiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_AES_256_CBC_SHA256` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsRsaWithAes256CbcSha256CiphersEnabled() {
        return Optional.ofNullable(this.tlsRsaWithAes256CbcSha256CiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsRsaWithAes256CbcShaCiphersEnabled")
    private @Nullable Output<Boolean> tlsRsaWithAes256CbcShaCiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsRsaWithAes256CbcShaCiphersEnabled() {
        return Optional.ofNullable(this.tlsRsaWithAes256CbcShaCiphersEnabled);
    }

    /**
     * Should the `TLS_RSA_WITH_3DES_EDE_CBC_SHA` cipher be enabled for alL TLS versions (1.0, 1.1 and 1.2)? Defaults to `false`.
     * 
     */
    @Import(name="tripleDesCiphersEnabled")
    private @Nullable Output<Boolean> tripleDesCiphersEnabled;

    /**
     * @return Should the `TLS_RSA_WITH_3DES_EDE_CBC_SHA` cipher be enabled for alL TLS versions (1.0, 1.1 and 1.2)? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tripleDesCiphersEnabled() {
        return Optional.ofNullable(this.tripleDesCiphersEnabled);
    }

    private ServiceSecurityArgs() {}

    private ServiceSecurityArgs(ServiceSecurityArgs $) {
        this.enableBackendSsl30 = $.enableBackendSsl30;
        this.enableBackendTls10 = $.enableBackendTls10;
        this.enableBackendTls11 = $.enableBackendTls11;
        this.enableFrontendSsl30 = $.enableFrontendSsl30;
        this.enableFrontendTls10 = $.enableFrontendTls10;
        this.enableFrontendTls11 = $.enableFrontendTls11;
        this.tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled = $.tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled;
        this.tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled = $.tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled;
        this.tlsEcdheRsaWithAes128CbcShaCiphersEnabled = $.tlsEcdheRsaWithAes128CbcShaCiphersEnabled;
        this.tlsEcdheRsaWithAes256CbcShaCiphersEnabled = $.tlsEcdheRsaWithAes256CbcShaCiphersEnabled;
        this.tlsRsaWithAes128CbcSha256CiphersEnabled = $.tlsRsaWithAes128CbcSha256CiphersEnabled;
        this.tlsRsaWithAes128CbcShaCiphersEnabled = $.tlsRsaWithAes128CbcShaCiphersEnabled;
        this.tlsRsaWithAes128GcmSha256CiphersEnabled = $.tlsRsaWithAes128GcmSha256CiphersEnabled;
        this.tlsRsaWithAes256CbcSha256CiphersEnabled = $.tlsRsaWithAes256CbcSha256CiphersEnabled;
        this.tlsRsaWithAes256CbcShaCiphersEnabled = $.tlsRsaWithAes256CbcShaCiphersEnabled;
        this.tripleDesCiphersEnabled = $.tripleDesCiphersEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSecurityArgs $;

        public Builder() {
            $ = new ServiceSecurityArgs();
        }

        public Builder(ServiceSecurityArgs defaults) {
            $ = new ServiceSecurityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableBackendSsl30 Should SSL 3.0 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendSsl30(@Nullable Output<Boolean> enableBackendSsl30) {
            $.enableBackendSsl30 = enableBackendSsl30;
            return this;
        }

        /**
         * @param enableBackendSsl30 Should SSL 3.0 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendSsl30(Boolean enableBackendSsl30) {
            return enableBackendSsl30(Output.of(enableBackendSsl30));
        }

        /**
         * @param enableBackendTls10 Should TLS 1.0 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendTls10(@Nullable Output<Boolean> enableBackendTls10) {
            $.enableBackendTls10 = enableBackendTls10;
            return this;
        }

        /**
         * @param enableBackendTls10 Should TLS 1.0 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendTls10(Boolean enableBackendTls10) {
            return enableBackendTls10(Output.of(enableBackendTls10));
        }

        /**
         * @param enableBackendTls11 Should TLS 1.1 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendTls11(@Nullable Output<Boolean> enableBackendTls11) {
            $.enableBackendTls11 = enableBackendTls11;
            return this;
        }

        /**
         * @param enableBackendTls11 Should TLS 1.1 be enabled on the backend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBackendTls11(Boolean enableBackendTls11) {
            return enableBackendTls11(Output.of(enableBackendTls11));
        }

        /**
         * @param enableFrontendSsl30 Should SSL 3.0 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendSsl30(@Nullable Output<Boolean> enableFrontendSsl30) {
            $.enableFrontendSsl30 = enableFrontendSsl30;
            return this;
        }

        /**
         * @param enableFrontendSsl30 Should SSL 3.0 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendSsl30(Boolean enableFrontendSsl30) {
            return enableFrontendSsl30(Output.of(enableFrontendSsl30));
        }

        /**
         * @param enableFrontendTls10 Should TLS 1.0 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendTls10(@Nullable Output<Boolean> enableFrontendTls10) {
            $.enableFrontendTls10 = enableFrontendTls10;
            return this;
        }

        /**
         * @param enableFrontendTls10 Should TLS 1.0 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendTls10(Boolean enableFrontendTls10) {
            return enableFrontendTls10(Output.of(enableFrontendTls10));
        }

        /**
         * @param enableFrontendTls11 Should TLS 1.1 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendTls11(@Nullable Output<Boolean> enableFrontendTls11) {
            $.enableFrontendTls11 = enableFrontendTls11;
            return this;
        }

        /**
         * @param enableFrontendTls11 Should TLS 1.1 be enabled on the frontend of the gateway? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFrontendTls11(Boolean enableFrontendTls11) {
            return enableFrontendTls11(Output.of(enableFrontendTls11));
        }

        /**
         * @param tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled Should the `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled) {
            $.tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled = tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled;
            return this;
        }

        /**
         * @param tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled Should the `TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled(Boolean tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled) {
            return tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled(Output.of(tlsEcdheEcdsaWithAes128CbcShaCiphersEnabled));
        }

        /**
         * @param tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled Should the `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled) {
            $.tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled = tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled;
            return this;
        }

        /**
         * @param tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled Should the `TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled(Boolean tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled) {
            return tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled(Output.of(tlsEcdheEcdsaWithAes256CbcShaCiphersEnabled));
        }

        public Builder tlsEcdheRsaWithAes128CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsEcdheRsaWithAes128CbcShaCiphersEnabled) {
            $.tlsEcdheRsaWithAes128CbcShaCiphersEnabled = tlsEcdheRsaWithAes128CbcShaCiphersEnabled;
            return this;
        }

        public Builder tlsEcdheRsaWithAes128CbcShaCiphersEnabled(Boolean tlsEcdheRsaWithAes128CbcShaCiphersEnabled) {
            return tlsEcdheRsaWithAes128CbcShaCiphersEnabled(Output.of(tlsEcdheRsaWithAes128CbcShaCiphersEnabled));
        }

        public Builder tlsEcdheRsaWithAes256CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsEcdheRsaWithAes256CbcShaCiphersEnabled) {
            $.tlsEcdheRsaWithAes256CbcShaCiphersEnabled = tlsEcdheRsaWithAes256CbcShaCiphersEnabled;
            return this;
        }

        public Builder tlsEcdheRsaWithAes256CbcShaCiphersEnabled(Boolean tlsEcdheRsaWithAes256CbcShaCiphersEnabled) {
            return tlsEcdheRsaWithAes256CbcShaCiphersEnabled(Output.of(tlsEcdheRsaWithAes256CbcShaCiphersEnabled));
        }

        /**
         * @param tlsRsaWithAes128CbcSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_128_CBC_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128CbcSha256CiphersEnabled(@Nullable Output<Boolean> tlsRsaWithAes128CbcSha256CiphersEnabled) {
            $.tlsRsaWithAes128CbcSha256CiphersEnabled = tlsRsaWithAes128CbcSha256CiphersEnabled;
            return this;
        }

        /**
         * @param tlsRsaWithAes128CbcSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_128_CBC_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128CbcSha256CiphersEnabled(Boolean tlsRsaWithAes128CbcSha256CiphersEnabled) {
            return tlsRsaWithAes128CbcSha256CiphersEnabled(Output.of(tlsRsaWithAes128CbcSha256CiphersEnabled));
        }

        /**
         * @param tlsRsaWithAes128CbcShaCiphersEnabled Should the `TLS_RSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsRsaWithAes128CbcShaCiphersEnabled) {
            $.tlsRsaWithAes128CbcShaCiphersEnabled = tlsRsaWithAes128CbcShaCiphersEnabled;
            return this;
        }

        /**
         * @param tlsRsaWithAes128CbcShaCiphersEnabled Should the `TLS_RSA_WITH_AES_128_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128CbcShaCiphersEnabled(Boolean tlsRsaWithAes128CbcShaCiphersEnabled) {
            return tlsRsaWithAes128CbcShaCiphersEnabled(Output.of(tlsRsaWithAes128CbcShaCiphersEnabled));
        }

        /**
         * @param tlsRsaWithAes128GcmSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_128_GCM_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128GcmSha256CiphersEnabled(@Nullable Output<Boolean> tlsRsaWithAes128GcmSha256CiphersEnabled) {
            $.tlsRsaWithAes128GcmSha256CiphersEnabled = tlsRsaWithAes128GcmSha256CiphersEnabled;
            return this;
        }

        /**
         * @param tlsRsaWithAes128GcmSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_128_GCM_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes128GcmSha256CiphersEnabled(Boolean tlsRsaWithAes128GcmSha256CiphersEnabled) {
            return tlsRsaWithAes128GcmSha256CiphersEnabled(Output.of(tlsRsaWithAes128GcmSha256CiphersEnabled));
        }

        /**
         * @param tlsRsaWithAes256CbcSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_256_CBC_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes256CbcSha256CiphersEnabled(@Nullable Output<Boolean> tlsRsaWithAes256CbcSha256CiphersEnabled) {
            $.tlsRsaWithAes256CbcSha256CiphersEnabled = tlsRsaWithAes256CbcSha256CiphersEnabled;
            return this;
        }

        /**
         * @param tlsRsaWithAes256CbcSha256CiphersEnabled Should the `TLS_RSA_WITH_AES_256_CBC_SHA256` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes256CbcSha256CiphersEnabled(Boolean tlsRsaWithAes256CbcSha256CiphersEnabled) {
            return tlsRsaWithAes256CbcSha256CiphersEnabled(Output.of(tlsRsaWithAes256CbcSha256CiphersEnabled));
        }

        /**
         * @param tlsRsaWithAes256CbcShaCiphersEnabled Should the `TLS_RSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes256CbcShaCiphersEnabled(@Nullable Output<Boolean> tlsRsaWithAes256CbcShaCiphersEnabled) {
            $.tlsRsaWithAes256CbcShaCiphersEnabled = tlsRsaWithAes256CbcShaCiphersEnabled;
            return this;
        }

        /**
         * @param tlsRsaWithAes256CbcShaCiphersEnabled Should the `TLS_RSA_WITH_AES_256_CBC_SHA` cipher be enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsRsaWithAes256CbcShaCiphersEnabled(Boolean tlsRsaWithAes256CbcShaCiphersEnabled) {
            return tlsRsaWithAes256CbcShaCiphersEnabled(Output.of(tlsRsaWithAes256CbcShaCiphersEnabled));
        }

        /**
         * @param tripleDesCiphersEnabled Should the `TLS_RSA_WITH_3DES_EDE_CBC_SHA` cipher be enabled for alL TLS versions (1.0, 1.1 and 1.2)? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tripleDesCiphersEnabled(@Nullable Output<Boolean> tripleDesCiphersEnabled) {
            $.tripleDesCiphersEnabled = tripleDesCiphersEnabled;
            return this;
        }

        /**
         * @param tripleDesCiphersEnabled Should the `TLS_RSA_WITH_3DES_EDE_CBC_SHA` cipher be enabled for alL TLS versions (1.0, 1.1 and 1.2)? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tripleDesCiphersEnabled(Boolean tripleDesCiphersEnabled) {
            return tripleDesCiphersEnabled(Output.of(tripleDesCiphersEnabled));
        }

        public ServiceSecurityArgs build() {
            return $;
        }
    }

}