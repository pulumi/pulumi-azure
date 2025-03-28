// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryCredentialSetIdentity {
    /**
     * @return The principal ID of the Identity.
     * 
     */
    private @Nullable String principalId;
    /**
     * @return The tenant ID of the Identity.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return The type of Managed Service Identity that is configured on for the Container Registry Credential Set. Currently the only possible value is `SystemAssigned`.
     * 
     */
    private String type;

    private RegistryCredentialSetIdentity() {}
    /**
     * @return The principal ID of the Identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The tenant ID of the Identity.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The type of Managed Service Identity that is configured on for the Container Registry Credential Set. Currently the only possible value is `SystemAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialSetIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;
        public Builder() {}
        public Builder(RegistryCredentialSetIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder principalId(@Nullable String principalId) {

            this.principalId = principalId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("RegistryCredentialSetIdentity", "type");
            }
            this.type = type;
            return this;
        }
        public RegistryCredentialSetIdentity build() {
            final var _resultValue = new RegistryCredentialSetIdentity();
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
