// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetExtensionState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetExtensionState Empty = new VirtualMachineScaleSetExtensionState();

    /**
     * Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    @Import(name="automaticUpgradeEnabled")
    private @Nullable Output<Boolean> automaticUpgradeEnabled;

    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> automaticUpgradeEnabled() {
        return Optional.ofNullable(this.automaticUpgradeEnabled);
    }

    /**
     * A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * An ordered list of Extension names which this should be provisioned after.
     * 
     */
    @Import(name="provisionAfterExtensions")
    private @Nullable Output<List<String>> provisionAfterExtensions;

    /**
     * @return An ordered list of Extension names which this should be provisioned after.
     * 
     */
    public Optional<Output<List<String>>> provisionAfterExtensions() {
        return Optional.ofNullable(this.provisionAfterExtensions);
    }

    /**
     * Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * A JSON String which specifies Settings for the Extension.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return A JSON String which specifies Settings for the Extension.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Specifies the Type of the Extension. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the Type of the Extension. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    /**
     * The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualMachineScaleSetId")
    private @Nullable Output<String> virtualMachineScaleSetId;

    /**
     * @return The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualMachineScaleSetId() {
        return Optional.ofNullable(this.virtualMachineScaleSetId);
    }

    private VirtualMachineScaleSetExtensionState() {}

    private VirtualMachineScaleSetExtensionState(VirtualMachineScaleSetExtensionState $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.automaticUpgradeEnabled = $.automaticUpgradeEnabled;
        this.forceUpdateTag = $.forceUpdateTag;
        this.name = $.name;
        this.protectedSettings = $.protectedSettings;
        this.provisionAfterExtensions = $.provisionAfterExtensions;
        this.publisher = $.publisher;
        this.settings = $.settings;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
        this.virtualMachineScaleSetId = $.virtualMachineScaleSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetExtensionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetExtensionState $;

        public Builder() {
            $ = new VirtualMachineScaleSetExtensionState();
        }

        public Builder(VirtualMachineScaleSetExtensionState defaults) {
            $ = new VirtualMachineScaleSetExtensionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Should the latest version of the Extension be used at Deployment Time, if one is available? This won&#39;t auto-update the extension on existing installation. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(@Nullable Output<Boolean> automaticUpgradeEnabled) {
            $.automaticUpgradeEnabled = automaticUpgradeEnabled;
            return this;
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(Boolean automaticUpgradeEnabled) {
            return automaticUpgradeEnabled(Output.of(automaticUpgradeEnabled));
        }

        /**
         * @param forceUpdateTag A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag A value which, when different to the previous value can be used to force-run the Extension even if the Extension Configuration hasn&#39;t changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param name The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the Virtual Machine Scale Set Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectedSettings A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings A JSON String which specifies Sensitive Settings (such as Passwords) for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            $.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(List<String> provisionAfterExtensions) {
            return provisionAfterExtensions(Output.of(provisionAfterExtensions));
        }

        /**
         * @param provisionAfterExtensions An ordered list of Extension names which this should be provisioned after.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }

        /**
         * @param publisher Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher Specifies the Publisher of the Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param settings A JSON String which specifies Settings for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings A JSON String which specifies Settings for the Extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param type Specifies the Type of the Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the Type of the Extension. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        /**
         * @param virtualMachineScaleSetId The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineScaleSetId(@Nullable Output<String> virtualMachineScaleSetId) {
            $.virtualMachineScaleSetId = virtualMachineScaleSetId;
            return this;
        }

        /**
         * @param virtualMachineScaleSetId The ID of the Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineScaleSetId(String virtualMachineScaleSetId) {
            return virtualMachineScaleSetId(Output.of(virtualMachineScaleSetId));
        }

        public VirtualMachineScaleSetExtensionState build() {
            return $;
        }
    }

}