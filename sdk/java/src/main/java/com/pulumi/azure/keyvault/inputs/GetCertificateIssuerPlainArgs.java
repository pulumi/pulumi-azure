// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateIssuerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateIssuerPlainArgs Empty = new GetCertificateIssuerPlainArgs();

    /**
     * The ID of the Key Vault in which to locate the Certificate Issuer.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private String keyVaultId;

    /**
     * @return The ID of the Key Vault in which to locate the Certificate Issuer.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The name of the Key Vault Certificate Issuer.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Key Vault Certificate Issuer.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetCertificateIssuerPlainArgs() {}

    private GetCertificateIssuerPlainArgs(GetCertificateIssuerPlainArgs $) {
        this.keyVaultId = $.keyVaultId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateIssuerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateIssuerPlainArgs $;

        public Builder() {
            $ = new GetCertificateIssuerPlainArgs();
        }

        public Builder(GetCertificateIssuerPlainArgs defaults) {
            $ = new GetCertificateIssuerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyVaultId The ID of the Key Vault in which to locate the Certificate Issuer.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param name The name of the Key Vault Certificate Issuer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetCertificateIssuerPlainArgs build() {
            if ($.keyVaultId == null) {
                throw new MissingRequiredPropertyException("GetCertificateIssuerPlainArgs", "keyVaultId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetCertificateIssuerPlainArgs", "name");
            }
            return $;
        }
    }

}
