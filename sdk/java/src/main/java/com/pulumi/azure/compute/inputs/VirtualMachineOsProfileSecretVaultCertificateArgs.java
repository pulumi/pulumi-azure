// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineOsProfileSecretVaultCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineOsProfileSecretVaultCertificateArgs Empty = new VirtualMachineOsProfileSecretVaultCertificateArgs();

    /**
     * Specifies the certificate store on the Virtual Machine where the certificate should be added to, such as `My`.
     * 
     */
    @Import(name="certificateStore")
    private @Nullable Output<String> certificateStore;

    /**
     * @return Specifies the certificate store on the Virtual Machine where the certificate should be added to, such as `My`.
     * 
     */
    public Optional<Output<String>> certificateStore() {
        return Optional.ofNullable(this.certificateStore);
    }

    /**
     * The ID of the Key Vault Secret. Stored secret is the Base64 encoding of a JSON Object that which is encoded in UTF-8 of which the contents need to be:
     * 
     */
    @Import(name="certificateUrl", required=true)
    private Output<String> certificateUrl;

    /**
     * @return The ID of the Key Vault Secret. Stored secret is the Base64 encoding of a JSON Object that which is encoded in UTF-8 of which the contents need to be:
     * 
     */
    public Output<String> certificateUrl() {
        return this.certificateUrl;
    }

    private VirtualMachineOsProfileSecretVaultCertificateArgs() {}

    private VirtualMachineOsProfileSecretVaultCertificateArgs(VirtualMachineOsProfileSecretVaultCertificateArgs $) {
        this.certificateStore = $.certificateStore;
        this.certificateUrl = $.certificateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineOsProfileSecretVaultCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineOsProfileSecretVaultCertificateArgs $;

        public Builder() {
            $ = new VirtualMachineOsProfileSecretVaultCertificateArgs();
        }

        public Builder(VirtualMachineOsProfileSecretVaultCertificateArgs defaults) {
            $ = new VirtualMachineOsProfileSecretVaultCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateStore Specifies the certificate store on the Virtual Machine where the certificate should be added to, such as `My`.
         * 
         * @return builder
         * 
         */
        public Builder certificateStore(@Nullable Output<String> certificateStore) {
            $.certificateStore = certificateStore;
            return this;
        }

        /**
         * @param certificateStore Specifies the certificate store on the Virtual Machine where the certificate should be added to, such as `My`.
         * 
         * @return builder
         * 
         */
        public Builder certificateStore(String certificateStore) {
            return certificateStore(Output.of(certificateStore));
        }

        /**
         * @param certificateUrl The ID of the Key Vault Secret. Stored secret is the Base64 encoding of a JSON Object that which is encoded in UTF-8 of which the contents need to be:
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(Output<String> certificateUrl) {
            $.certificateUrl = certificateUrl;
            return this;
        }

        /**
         * @param certificateUrl The ID of the Key Vault Secret. Stored secret is the Base64 encoding of a JSON Object that which is encoded in UTF-8 of which the contents need to be:
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(String certificateUrl) {
            return certificateUrl(Output.of(certificateUrl));
        }

        public VirtualMachineOsProfileSecretVaultCertificateArgs build() {
            $.certificateUrl = Objects.requireNonNull($.certificateUrl, "expected parameter 'certificateUrl' to be non-null");
            return $;
        }
    }

}