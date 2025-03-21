// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory {
    /**
     * @return The physical path for the Virtual Application.
     * 
     */
    private @Nullable String physicalPath;
    /**
     * @return The Virtual Path for the Virtual Application.
     * 
     */
    private @Nullable String virtualPath;

    private WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory() {}
    /**
     * @return The physical path for the Virtual Application.
     * 
     */
    public Optional<String> physicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }
    /**
     * @return The Virtual Path for the Virtual Application.
     * 
     */
    public Optional<String> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable String virtualPath;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        @CustomType.Setter
        public Builder physicalPath(@Nullable String physicalPath) {

            this.physicalPath = physicalPath;
            return this;
        }
        @CustomType.Setter
        public Builder virtualPath(@Nullable String virtualPath) {

            this.virtualPath = virtualPath;
            return this;
        }
        public WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory build() {
            final var _resultValue = new WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory();
            _resultValue.physicalPath = physicalPath;
            _resultValue.virtualPath = virtualPath;
            return _resultValue;
        }
    }
}
