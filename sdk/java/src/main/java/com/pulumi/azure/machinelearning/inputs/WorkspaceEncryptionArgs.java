// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceEncryptionArgs Empty = new WorkspaceEncryptionArgs();

    /**
     * The Key Vault URI to access the encryption key.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }

    /**
     * The ID of the keyVault where the customer owned encryption key is present.
     * 
     */
    @Import(name="keyVaultId", required=true)
    private Output<String> keyVaultId;

    /**
     * @return The ID of the keyVault where the customer owned encryption key is present.
     * 
     */
    public Output<String> keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * The Key Vault URI to access the encryption key.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The Key Vault URI to access the encryption key.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private WorkspaceEncryptionArgs() {}

    private WorkspaceEncryptionArgs(WorkspaceEncryptionArgs $) {
        this.keyId = $.keyId;
        this.keyVaultId = $.keyVaultId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceEncryptionArgs $;

        public Builder() {
            $ = new WorkspaceEncryptionArgs();
        }

        public Builder(WorkspaceEncryptionArgs defaults) {
            $ = new WorkspaceEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId The Key Vault URI to access the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The Key Vault URI to access the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param keyVaultId The ID of the keyVault where the customer owned encryption key is present.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId The ID of the keyVault where the customer owned encryption key is present.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param userAssignedIdentityId The Key Vault URI to access the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The Key Vault URI to access the encryption key.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public WorkspaceEncryptionArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            $.keyVaultId = Objects.requireNonNull($.keyVaultId, "expected parameter 'keyVaultId' to be non-null");
            return $;
        }
    }

}