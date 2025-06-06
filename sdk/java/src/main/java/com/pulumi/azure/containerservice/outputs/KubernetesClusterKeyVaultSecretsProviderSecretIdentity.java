// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterKeyVaultSecretsProviderSecretIdentity {
    /**
     * @return The Client ID of the user-defined Managed Identity used for Web App Routing.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The Object ID of the user-defined Managed Identity used for Web App Routing
     * 
     */
    private @Nullable String objectId;
    /**
     * @return The ID of the User Assigned Identity used for Web App Routing.
     * 
     */
    private @Nullable String userAssignedIdentityId;

    private KubernetesClusterKeyVaultSecretsProviderSecretIdentity() {}
    /**
     * @return The Client ID of the user-defined Managed Identity used for Web App Routing.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The Object ID of the user-defined Managed Identity used for Web App Routing
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The ID of the User Assigned Identity used for Web App Routing.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterKeyVaultSecretsProviderSecretIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String userAssignedIdentityId;
        public Builder() {}
        public Builder(KubernetesClusterKeyVaultSecretsProviderSecretIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(@Nullable String objectId) {

            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {

            this.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }
        public KubernetesClusterKeyVaultSecretsProviderSecretIdentity build() {
            final var _resultValue = new KubernetesClusterKeyVaultSecretsProviderSecretIdentity();
            _resultValue.clientId = clientId;
            _resultValue.objectId = objectId;
            _resultValue.userAssignedIdentityId = userAssignedIdentityId;
            return _resultValue;
        }
    }
}
