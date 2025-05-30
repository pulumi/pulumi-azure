// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeaturesVirtualMachine {
    private @Nullable Boolean deleteOsDiskOnDeletion;
    private @Nullable Boolean detachImplicitDataDiskOnDeletion;
    /**
     * @deprecated
     * &#39;graceful_shutdown&#39; has been deprecated and will be removed from v5.0 of the AzureRM provider.
     * 
     */
    @Deprecated /* 'graceful_shutdown' has been deprecated and will be removed from v5.0 of the AzureRM provider. */
    private @Nullable Boolean gracefulShutdown;
    private @Nullable Boolean skipShutdownAndForceDelete;

    private FeaturesVirtualMachine() {}
    public Optional<Boolean> deleteOsDiskOnDeletion() {
        return Optional.ofNullable(this.deleteOsDiskOnDeletion);
    }
    public Optional<Boolean> detachImplicitDataDiskOnDeletion() {
        return Optional.ofNullable(this.detachImplicitDataDiskOnDeletion);
    }
    /**
     * @deprecated
     * &#39;graceful_shutdown&#39; has been deprecated and will be removed from v5.0 of the AzureRM provider.
     * 
     */
    @Deprecated /* 'graceful_shutdown' has been deprecated and will be removed from v5.0 of the AzureRM provider. */
    public Optional<Boolean> gracefulShutdown() {
        return Optional.ofNullable(this.gracefulShutdown);
    }
    public Optional<Boolean> skipShutdownAndForceDelete() {
        return Optional.ofNullable(this.skipShutdownAndForceDelete);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesVirtualMachine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean deleteOsDiskOnDeletion;
        private @Nullable Boolean detachImplicitDataDiskOnDeletion;
        private @Nullable Boolean gracefulShutdown;
        private @Nullable Boolean skipShutdownAndForceDelete;
        public Builder() {}
        public Builder(FeaturesVirtualMachine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOsDiskOnDeletion = defaults.deleteOsDiskOnDeletion;
    	      this.detachImplicitDataDiskOnDeletion = defaults.detachImplicitDataDiskOnDeletion;
    	      this.gracefulShutdown = defaults.gracefulShutdown;
    	      this.skipShutdownAndForceDelete = defaults.skipShutdownAndForceDelete;
        }

        @CustomType.Setter
        public Builder deleteOsDiskOnDeletion(@Nullable Boolean deleteOsDiskOnDeletion) {

            this.deleteOsDiskOnDeletion = deleteOsDiskOnDeletion;
            return this;
        }
        @CustomType.Setter
        public Builder detachImplicitDataDiskOnDeletion(@Nullable Boolean detachImplicitDataDiskOnDeletion) {

            this.detachImplicitDataDiskOnDeletion = detachImplicitDataDiskOnDeletion;
            return this;
        }
        @CustomType.Setter
        public Builder gracefulShutdown(@Nullable Boolean gracefulShutdown) {

            this.gracefulShutdown = gracefulShutdown;
            return this;
        }
        @CustomType.Setter
        public Builder skipShutdownAndForceDelete(@Nullable Boolean skipShutdownAndForceDelete) {

            this.skipShutdownAndForceDelete = skipShutdownAndForceDelete;
            return this;
        }
        public FeaturesVirtualMachine build() {
            final var _resultValue = new FeaturesVirtualMachine();
            _resultValue.deleteOsDiskOnDeletion = deleteOsDiskOnDeletion;
            _resultValue.detachImplicitDataDiskOnDeletion = detachImplicitDataDiskOnDeletion;
            _resultValue.gracefulShutdown = gracefulShutdown;
            _resultValue.skipShutdownAndForceDelete = skipShutdownAndForceDelete;
            return _resultValue;
        }
    }
}
