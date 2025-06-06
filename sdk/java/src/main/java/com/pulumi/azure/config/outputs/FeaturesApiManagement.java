// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesApiManagement {
    private @Nullable Boolean purgeSoftDeleteOnDestroy;
    private @Nullable Boolean recoverSoftDeleted;

    private FeaturesApiManagement() {}
    public Optional<Boolean> purgeSoftDeleteOnDestroy() {
        return Optional.ofNullable(this.purgeSoftDeleteOnDestroy);
    }
    public Optional<Boolean> recoverSoftDeleted() {
        return Optional.ofNullable(this.recoverSoftDeleted);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesApiManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean purgeSoftDeleteOnDestroy;
        private @Nullable Boolean recoverSoftDeleted;
        public Builder() {}
        public Builder(FeaturesApiManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.purgeSoftDeleteOnDestroy = defaults.purgeSoftDeleteOnDestroy;
    	      this.recoverSoftDeleted = defaults.recoverSoftDeleted;
        }

        @CustomType.Setter
        public Builder purgeSoftDeleteOnDestroy(@Nullable Boolean purgeSoftDeleteOnDestroy) {

            this.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder recoverSoftDeleted(@Nullable Boolean recoverSoftDeleted) {

            this.recoverSoftDeleted = recoverSoftDeleted;
            return this;
        }
        public FeaturesApiManagement build() {
            final var _resultValue = new FeaturesApiManagement();
            _resultValue.purgeSoftDeleteOnDestroy = purgeSoftDeleteOnDestroy;
            _resultValue.recoverSoftDeleted = recoverSoftDeleted;
            return _resultValue;
        }
    }
}
