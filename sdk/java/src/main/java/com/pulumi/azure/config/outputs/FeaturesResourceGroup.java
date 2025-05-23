// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesResourceGroup {
    private @Nullable Boolean preventDeletionIfContainsResources;

    private FeaturesResourceGroup() {}
    public Optional<Boolean> preventDeletionIfContainsResources() {
        return Optional.ofNullable(this.preventDeletionIfContainsResources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesResourceGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean preventDeletionIfContainsResources;
        public Builder() {}
        public Builder(FeaturesResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preventDeletionIfContainsResources = defaults.preventDeletionIfContainsResources;
        }

        @CustomType.Setter
        public Builder preventDeletionIfContainsResources(@Nullable Boolean preventDeletionIfContainsResources) {

            this.preventDeletionIfContainsResources = preventDeletionIfContainsResources;
            return this;
        }
        public FeaturesResourceGroup build() {
            final var _resultValue = new FeaturesResourceGroup();
            _resultValue.preventDeletionIfContainsResources = preventDeletionIfContainsResources;
            return _resultValue;
        }
    }
}
