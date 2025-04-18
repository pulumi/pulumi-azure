// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEncryptedValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEncryptedValueArgs Empty = new GetEncryptedValueArgs();

    /**
     * The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
     * 
     */
    @Import(name="algorithm", required=true)
    private Output<String> algorithm;

    /**
     * @return The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }

    /**
     * The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
     * 
     */
    @Import(name="encryptedData")
    private @Nullable Output<String> encryptedData;

    /**
     * @return The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
     * 
     */
    public Optional<Output<String>> encryptedData() {
        return Optional.ofNullable(this.encryptedData);
    }

    /**
     * The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
     * 
     */
    @Import(name="keyVaultKeyId", required=true)
    private Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    /**
     * The plain-text value which should be Encrypted into `encrypted_data`.
     * 
     * &gt; **Note:** One of either `encrypted_data` or `plain_text_value` must be specified and is used to populate the encrypted/decrypted value for the other field.
     * 
     */
    @Import(name="plainTextValue")
    private @Nullable Output<String> plainTextValue;

    /**
     * @return The plain-text value which should be Encrypted into `encrypted_data`.
     * 
     * &gt; **Note:** One of either `encrypted_data` or `plain_text_value` must be specified and is used to populate the encrypted/decrypted value for the other field.
     * 
     */
    public Optional<Output<String>> plainTextValue() {
        return Optional.ofNullable(this.plainTextValue);
    }

    private GetEncryptedValueArgs() {}

    private GetEncryptedValueArgs(GetEncryptedValueArgs $) {
        this.algorithm = $.algorithm;
        this.encryptedData = $.encryptedData;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.plainTextValue = $.plainTextValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEncryptedValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEncryptedValueArgs $;

        public Builder() {
            $ = new GetEncryptedValueArgs();
        }

        public Builder(GetEncryptedValueArgs defaults) {
            $ = new GetEncryptedValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm The Algorithm which should be used to Decrypt/Encrypt this Value. Possible values are `RSA1_5`, `RSA-OAEP` and `RSA-OAEP-256`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param encryptedData The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
         * 
         * @return builder
         * 
         */
        public Builder encryptedData(@Nullable Output<String> encryptedData) {
            $.encryptedData = encryptedData;
            return this;
        }

        /**
         * @param encryptedData The Base64 URL Encoded Encrypted Data which should be decrypted into `plain_text_value`.
         * 
         * @return builder
         * 
         */
        public Builder encryptedData(String encryptedData) {
            return encryptedData(Output.of(encryptedData));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Decrypt/Encrypt this Value.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param plainTextValue The plain-text value which should be Encrypted into `encrypted_data`.
         * 
         * &gt; **Note:** One of either `encrypted_data` or `plain_text_value` must be specified and is used to populate the encrypted/decrypted value for the other field.
         * 
         * @return builder
         * 
         */
        public Builder plainTextValue(@Nullable Output<String> plainTextValue) {
            $.plainTextValue = plainTextValue;
            return this;
        }

        /**
         * @param plainTextValue The plain-text value which should be Encrypted into `encrypted_data`.
         * 
         * &gt; **Note:** One of either `encrypted_data` or `plain_text_value` must be specified and is used to populate the encrypted/decrypted value for the other field.
         * 
         * @return builder
         * 
         */
        public Builder plainTextValue(String plainTextValue) {
            return plainTextValue(Output.of(plainTextValue));
        }

        public GetEncryptedValueArgs build() {
            if ($.algorithm == null) {
                throw new MissingRequiredPropertyException("GetEncryptedValueArgs", "algorithm");
            }
            if ($.keyVaultKeyId == null) {
                throw new MissingRequiredPropertyException("GetEncryptedValueArgs", "keyVaultKeyId");
            }
            return $;
        }
    }

}
