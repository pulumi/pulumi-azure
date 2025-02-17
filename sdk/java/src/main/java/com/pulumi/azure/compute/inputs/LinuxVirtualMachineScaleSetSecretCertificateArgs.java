// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LinuxVirtualMachineScaleSetSecretCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxVirtualMachineScaleSetSecretCertificateArgs Empty = new LinuxVirtualMachineScaleSetSecretCertificateArgs();

    /**
     * The Secret URL of a Key Vault Certificate.
     * 
     * &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
     * 
     * &gt; **Note:** The certificate must have been uploaded/created in PFX format, PEM certificates are not currently supported by Azure.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The Secret URL of a Key Vault Certificate.
     * 
     * &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
     * 
     * &gt; **Note:** The certificate must have been uploaded/created in PFX format, PEM certificates are not currently supported by Azure.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private LinuxVirtualMachineScaleSetSecretCertificateArgs() {}

    private LinuxVirtualMachineScaleSetSecretCertificateArgs(LinuxVirtualMachineScaleSetSecretCertificateArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxVirtualMachineScaleSetSecretCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxVirtualMachineScaleSetSecretCertificateArgs $;

        public Builder() {
            $ = new LinuxVirtualMachineScaleSetSecretCertificateArgs();
        }

        public Builder(LinuxVirtualMachineScaleSetSecretCertificateArgs defaults) {
            $ = new LinuxVirtualMachineScaleSetSecretCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param url The Secret URL of a Key Vault Certificate.
         * 
         * &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
         * 
         * &gt; **Note:** The certificate must have been uploaded/created in PFX format, PEM certificates are not currently supported by Azure.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Secret URL of a Key Vault Certificate.
         * 
         * &gt; **Note:** This can be sourced from the `secret_id` field within the `azure.keyvault.Certificate` Resource.
         * 
         * &gt; **Note:** The certificate must have been uploaded/created in PFX format, PEM certificates are not currently supported by Azure.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public LinuxVirtualMachineScaleSetSecretCertificateArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("LinuxVirtualMachineScaleSetSecretCertificateArgs", "url");
            }
            return $;
        }
    }

}
