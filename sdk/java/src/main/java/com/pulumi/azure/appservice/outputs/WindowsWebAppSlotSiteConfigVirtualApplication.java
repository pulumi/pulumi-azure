// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigVirtualApplication {
    /**
     * @return The physical path for the Virtual Application.
     * 
     */
    private String physicalPath;
    /**
     * @return Should pre-loading be enabled. Defaults to `false`.
     * 
     */
    private Boolean preload;
    /**
     * @return One or more `virtual_directory` blocks as defined below.
     * 
     */
    private @Nullable List<WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories;
    /**
     * @return The Virtual Path for the Virtual Application.
     * 
     */
    private String virtualPath;

    private WindowsWebAppSlotSiteConfigVirtualApplication() {}
    /**
     * @return The physical path for the Virtual Application.
     * 
     */
    public String physicalPath() {
        return this.physicalPath;
    }
    /**
     * @return Should pre-loading be enabled. Defaults to `false`.
     * 
     */
    public Boolean preload() {
        return this.preload;
    }
    /**
     * @return One or more `virtual_directory` blocks as defined below.
     * 
     */
    public List<WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories() {
        return this.virtualDirectories == null ? List.of() : this.virtualDirectories;
    }
    /**
     * @return The Virtual Path for the Virtual Application.
     * 
     */
    public String virtualPath() {
        return this.virtualPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigVirtualApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String physicalPath;
        private Boolean preload;
        private @Nullable List<WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories;
        private String virtualPath;
        public Builder() {}
        public Builder(WindowsWebAppSlotSiteConfigVirtualApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.preload = defaults.preload;
    	      this.virtualDirectories = defaults.virtualDirectories;
    	      this.virtualPath = defaults.virtualPath;
        }

        @CustomType.Setter
        public Builder physicalPath(String physicalPath) {
            this.physicalPath = Objects.requireNonNull(physicalPath);
            return this;
        }
        @CustomType.Setter
        public Builder preload(Boolean preload) {
            this.preload = Objects.requireNonNull(preload);
            return this;
        }
        @CustomType.Setter
        public Builder virtualDirectories(@Nullable List<WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory> virtualDirectories) {
            this.virtualDirectories = virtualDirectories;
            return this;
        }
        public Builder virtualDirectories(WindowsWebAppSlotSiteConfigVirtualApplicationVirtualDirectory... virtualDirectories) {
            return virtualDirectories(List.of(virtualDirectories));
        }
        @CustomType.Setter
        public Builder virtualPath(String virtualPath) {
            this.virtualPath = Objects.requireNonNull(virtualPath);
            return this;
        }
        public WindowsWebAppSlotSiteConfigVirtualApplication build() {
            final var o = new WindowsWebAppSlotSiteConfigVirtualApplication();
            o.physicalPath = physicalPath;
            o.preload = preload;
            o.virtualDirectories = virtualDirectories;
            o.virtualPath = virtualPath;
            return o;
        }
    }
}