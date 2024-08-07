// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountEncryptionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountEncryptionPlainArgs Empty = new GetAccountEncryptionPlainArgs();

    /**
     * The key vault encryption key.
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable String encryptionKey;

    /**
     * @return The key vault encryption key.
     * 
     */
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * The ID of the NetApp account where customer managed keys-based encryption is enabled.
     * 
     */
    @Import(name="netappAccountId", required=true)
    private String netappAccountId;

    /**
     * @return The ID of the NetApp account where customer managed keys-based encryption is enabled.
     * 
     */
    public String netappAccountId() {
        return this.netappAccountId;
    }

    /**
     * The ID of the System Assigned Manged Identity.
     * 
     */
    @Import(name="systemAssignedIdentityPrincipalId")
    private @Nullable String systemAssignedIdentityPrincipalId;

    /**
     * @return The ID of the System Assigned Manged Identity.
     * 
     */
    public Optional<String> systemAssignedIdentityPrincipalId() {
        return Optional.ofNullable(this.systemAssignedIdentityPrincipalId);
    }

    /**
     * The ID of the User Assigned Managed Identity.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable String userAssignedIdentityId;

    /**
     * @return The ID of the User Assigned Managed Identity.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private GetAccountEncryptionPlainArgs() {}

    private GetAccountEncryptionPlainArgs(GetAccountEncryptionPlainArgs $) {
        this.encryptionKey = $.encryptionKey;
        this.netappAccountId = $.netappAccountId;
        this.systemAssignedIdentityPrincipalId = $.systemAssignedIdentityPrincipalId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountEncryptionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountEncryptionPlainArgs $;

        public Builder() {
            $ = new GetAccountEncryptionPlainArgs();
        }

        public Builder(GetAccountEncryptionPlainArgs defaults) {
            $ = new GetAccountEncryptionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionKey The key vault encryption key.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable String encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param netappAccountId The ID of the NetApp account where customer managed keys-based encryption is enabled.
         * 
         * @return builder
         * 
         */
        public Builder netappAccountId(String netappAccountId) {
            $.netappAccountId = netappAccountId;
            return this;
        }

        /**
         * @param systemAssignedIdentityPrincipalId The ID of the System Assigned Manged Identity.
         * 
         * @return builder
         * 
         */
        public Builder systemAssignedIdentityPrincipalId(@Nullable String systemAssignedIdentityPrincipalId) {
            $.systemAssignedIdentityPrincipalId = systemAssignedIdentityPrincipalId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The ID of the User Assigned Managed Identity.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        public GetAccountEncryptionPlainArgs build() {
            if ($.netappAccountId == null) {
                throw new MissingRequiredPropertyException("GetAccountEncryptionPlainArgs", "netappAccountId");
            }
            return $;
        }
    }

}
