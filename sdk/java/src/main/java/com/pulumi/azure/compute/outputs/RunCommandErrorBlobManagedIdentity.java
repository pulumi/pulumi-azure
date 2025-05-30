// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunCommandErrorBlobManagedIdentity {
    /**
     * @return The client ID of the managed identity.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The object ID of the managed identity.
     * 
     */
    private @Nullable String objectId;

    private RunCommandErrorBlobManagedIdentity() {}
    /**
     * @return The client ID of the managed identity.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The object ID of the managed identity.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunCommandErrorBlobManagedIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        public Builder() {}
        public Builder(RunCommandErrorBlobManagedIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
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
        public RunCommandErrorBlobManagedIdentity build() {
            final var _resultValue = new RunCommandErrorBlobManagedIdentity();
            _resultValue.clientId = clientId;
            _resultValue.objectId = objectId;
            return _resultValue;
        }
    }
}
