// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AIServicesCustomerManagedKey {
    /**
     * @return The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there are multiple identities attached to the Azure AI Service.
     * 
     */
    private @Nullable String identityClientId;
    /**
     * @return The ID of the Key Vault Key which should be used to encrypt the data in this AI Services Account. Exactly one of `key_vault_key_id`, `managed_hsm_key_id` must be specified.
     * 
     */
    private @Nullable String keyVaultKeyId;
    /**
     * @return The ID of the managed HSM Key which should be used to encrypt the data in this AI Services Account. Exactly one of `key_vault_key_id`, `managed_hsm_key_id` must be specified.
     * 
     */
    private @Nullable String managedHsmKeyId;

    private AIServicesCustomerManagedKey() {}
    /**
     * @return The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there are multiple identities attached to the Azure AI Service.
     * 
     */
    public Optional<String> identityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    /**
     * @return The ID of the Key Vault Key which should be used to encrypt the data in this AI Services Account. Exactly one of `key_vault_key_id`, `managed_hsm_key_id` must be specified.
     * 
     */
    public Optional<String> keyVaultKeyId() {
        return Optional.ofNullable(this.keyVaultKeyId);
    }
    /**
     * @return The ID of the managed HSM Key which should be used to encrypt the data in this AI Services Account. Exactly one of `key_vault_key_id`, `managed_hsm_key_id` must be specified.
     * 
     */
    public Optional<String> managedHsmKeyId() {
        return Optional.ofNullable(this.managedHsmKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AIServicesCustomerManagedKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identityClientId;
        private @Nullable String keyVaultKeyId;
        private @Nullable String managedHsmKeyId;
        public Builder() {}
        public Builder(AIServicesCustomerManagedKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyVaultKeyId = defaults.keyVaultKeyId;
    	      this.managedHsmKeyId = defaults.managedHsmKeyId;
        }

        @CustomType.Setter
        public Builder identityClientId(@Nullable String identityClientId) {

            this.identityClientId = identityClientId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultKeyId(@Nullable String keyVaultKeyId) {

            this.keyVaultKeyId = keyVaultKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder managedHsmKeyId(@Nullable String managedHsmKeyId) {

            this.managedHsmKeyId = managedHsmKeyId;
            return this;
        }
        public AIServicesCustomerManagedKey build() {
            final var _resultValue = new AIServicesCustomerManagedKey();
            _resultValue.identityClientId = identityClientId;
            _resultValue.keyVaultKeyId = keyVaultKeyId;
            _resultValue.managedHsmKeyId = managedHsmKeyId;
            return _resultValue;
        }
    }
}
