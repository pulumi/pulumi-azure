// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxVirtualMachineScaleSetExtension {
    /**
     * @return Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    private @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    private @Nullable Boolean automaticUpgradeEnabled;
    /**
     * @return A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    private @Nullable String forceUpdateTag;
    /**
     * @return The name for the Virtual Machine Scale Set Extension.
     * 
     */
    private String name;
    /**
     * @return A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    private @Nullable String protectedSettings;
    /**
     * @return An ordered list of Extension names which this should be provisioned after.
     * 
     */
    private @Nullable List<String> provisionAfterExtensions;
    /**
     * @return Specifies the Publisher of the Extension.
     * 
     */
    private String publisher;
    /**
     * @return A JSON String which specifies Settings for the Extension.
     * 
     */
    private @Nullable String settings;
    /**
     * @return Specifies the Type of the Extension.
     * 
     */
    private String type;
    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    private String typeHandlerVersion;

    private LinuxVirtualMachineScaleSetExtension() {}
    /**
     * @return Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    public Optional<Boolean> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    public Optional<Boolean> automaticUpgradeEnabled() {
        return Optional.ofNullable(this.automaticUpgradeEnabled);
    }
    /**
     * @return A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    public Optional<String> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * @return The name for the Virtual Machine Scale Set Extension.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    public Optional<String> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * @return An ordered list of Extension names which this should be provisioned after.
     * 
     */
    public List<String> provisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }
    /**
     * @return Specifies the Publisher of the Extension.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return A JSON String which specifies Settings for the Extension.
     * 
     */
    public Optional<String> settings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * @return Specifies the Type of the Extension.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Boolean automaticUpgradeEnabled;
        private @Nullable String forceUpdateTag;
        private String name;
        private @Nullable String protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String publisher;
        private @Nullable String settings;
        private String type;
        private String typeHandlerVersion;
        public Builder() {}
        public Builder(LinuxVirtualMachineScaleSetExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.automaticUpgradeEnabled = defaults.automaticUpgradeEnabled;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        @CustomType.Setter
        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder automaticUpgradeEnabled(@Nullable Boolean automaticUpgradeEnabled) {
            this.automaticUpgradeEnabled = automaticUpgradeEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protectedSettings(@Nullable String protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        @CustomType.Setter
        public Builder provisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        @CustomType.Setter
        public Builder settings(@Nullable String settings) {
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }
        public LinuxVirtualMachineScaleSetExtension build() {
            final var o = new LinuxVirtualMachineScaleSetExtension();
            o.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            o.automaticUpgradeEnabled = automaticUpgradeEnabled;
            o.forceUpdateTag = forceUpdateTag;
            o.name = name;
            o.protectedSettings = protectedSettings;
            o.provisionAfterExtensions = provisionAfterExtensions;
            o.publisher = publisher;
            o.settings = settings;
            o.type = type;
            o.typeHandlerVersion = typeHandlerVersion;
            return o;
        }
    }
}