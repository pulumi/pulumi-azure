// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arcmachine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionState extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionState Empty = new ExtensionState();

    /**
     * The ID of the Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    @Import(name="arcMachineId")
    private @Nullable Output<String> arcMachineId;

    /**
     * @return The ID of the Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    public Optional<Output<String>> arcMachineId() {
        return Optional.ofNullable(this.arcMachineId);
    }

    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version available. Supported values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** When `automatic_upgrade_enabled` can only be set during creation. Any later change will be ignored.
     * 
     * &gt; **Note:** When `automatic_upgrade_enabled` is set to `true`, the `type_handler_version` is automatically updated by the Azure platform when a new version is available and any change in `type_handler_version` will be automatically ignored.
     * 
     */
    @Import(name="automaticUpgradeEnabled")
    private @Nullable Output<Boolean> automaticUpgradeEnabled;

    /**
     * @return Indicates whether the extension should be automatically upgraded by the platform if there is a newer version available. Supported values are `true` and `false`. Defaults to `true`.
     * 
     * &gt; **Note:** When `automatic_upgrade_enabled` can only be set during creation. Any later change will be ignored.
     * 
     * &gt; **Note:** When `automatic_upgrade_enabled` is set to `true`, the `type_handler_version` is automatically updated by the Azure platform when a new version is available and any change in `type_handler_version` will be automatically ignored.
     * 
     */
    public Optional<Output<Boolean>> automaticUpgradeEnabled() {
        return Optional.ofNullable(this.automaticUpgradeEnabled);
    }

    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
    private @Nullable Output<String> forceUpdateTag;

    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Optional<Output<String>> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * The Azure Region where the Hybrid Compute Machine Extension should exist. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Hybrid Compute Machine Extension should exist. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Json formatted protected settings for the extension.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return Json formatted protected settings for the extension.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * The name of the extension handler publisher, such as `Microsoft.Azure.Monitor`. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return The name of the extension handler publisher, such as `Microsoft.Azure.Monitor`. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * A mapping of tags which should be assigned to the Hybrid Compute Machine Extension.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Hybrid Compute Machine Extension.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the type of the extension. For example `CustomScriptExtension` or `AzureMonitorLinuxAgent`. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of the extension. For example `CustomScriptExtension` or `AzureMonitorLinuxAgent`. Changing this forces a new Hybrid Compute Machine Extension to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the script handler.
     * 
     * &gt; **Note:** 1. When `automatic_upgrade_enabled` is set to `false` and no `type_handler_version` is specified, the `type_handler_version` change should be manually ignored by `ignore_changes` lifecycle block. This is because the `type_handler_version` is set by the Azure platform when the extension is created. 2. When `automatic_upgrade_enabled` is set to `false` and `type_handler_version` is specified, the provider will check whether the version prefix is aligned with user input. For example, if user specifies `1.24` in `type_handler_version`, `1.24.1` will be considered as no diff.
     * 
     */
    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the script handler.
     * 
     * &gt; **Note:** 1. When `automatic_upgrade_enabled` is set to `false` and no `type_handler_version` is specified, the `type_handler_version` change should be manually ignored by `ignore_changes` lifecycle block. This is because the `type_handler_version` is set by the Azure platform when the extension is created. 2. When `automatic_upgrade_enabled` is set to `false` and `type_handler_version` is specified, the provider will check whether the version prefix is aligned with user input. For example, if user specifies `1.24` in `type_handler_version`, `1.24.1` will be considered as no diff.
     * 
     */
    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    private ExtensionState() {}

    private ExtensionState(ExtensionState $) {
        this.arcMachineId = $.arcMachineId;
        this.automaticUpgradeEnabled = $.automaticUpgradeEnabled;
        this.forceUpdateTag = $.forceUpdateTag;
        this.location = $.location;
        this.name = $.name;
        this.protectedSettings = $.protectedSettings;
        this.publisher = $.publisher;
        this.settings = $.settings;
        this.tags = $.tags;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionState $;

        public Builder() {
            $ = new ExtensionState();
        }

        public Builder(ExtensionState defaults) {
            $ = new ExtensionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arcMachineId The ID of the Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcMachineId(@Nullable Output<String> arcMachineId) {
            $.arcMachineId = arcMachineId;
            return this;
        }

        /**
         * @param arcMachineId The ID of the Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder arcMachineId(String arcMachineId) {
            return arcMachineId(Output.of(arcMachineId));
        }

        /**
         * @param automaticUpgradeEnabled Indicates whether the extension should be automatically upgraded by the platform if there is a newer version available. Supported values are `true` and `false`. Defaults to `true`.
         * 
         * &gt; **Note:** When `automatic_upgrade_enabled` can only be set during creation. Any later change will be ignored.
         * 
         * &gt; **Note:** When `automatic_upgrade_enabled` is set to `true`, the `type_handler_version` is automatically updated by the Azure platform when a new version is available and any change in `type_handler_version` will be automatically ignored.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(@Nullable Output<Boolean> automaticUpgradeEnabled) {
            $.automaticUpgradeEnabled = automaticUpgradeEnabled;
            return this;
        }

        /**
         * @param automaticUpgradeEnabled Indicates whether the extension should be automatically upgraded by the platform if there is a newer version available. Supported values are `true` and `false`. Defaults to `true`.
         * 
         * &gt; **Note:** When `automatic_upgrade_enabled` can only be set during creation. Any later change will be ignored.
         * 
         * &gt; **Note:** When `automatic_upgrade_enabled` is set to `true`, the `type_handler_version` is automatically updated by the Azure platform when a new version is available and any change in `type_handler_version` will be automatically ignored.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(Boolean automaticUpgradeEnabled) {
            return automaticUpgradeEnabled(Output.of(automaticUpgradeEnabled));
        }

        /**
         * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            $.forceUpdateTag = forceUpdateTag;
            return this;
        }

        /**
         * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed.
         * 
         * @return builder
         * 
         */
        public Builder forceUpdateTag(String forceUpdateTag) {
            return forceUpdateTag(Output.of(forceUpdateTag));
        }

        /**
         * @param location The Azure Region where the Hybrid Compute Machine Extension should exist. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Hybrid Compute Machine Extension should exist. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Hybrid Compute Machine Extension. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectedSettings Json formatted protected settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings Json formatted protected settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param publisher The name of the extension handler publisher, such as `Microsoft.Azure.Monitor`. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The name of the extension handler publisher, such as `Microsoft.Azure.Monitor`. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param settings Json formatted public settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Json formatted public settings for the extension.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Hybrid Compute Machine Extension.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Hybrid Compute Machine Extension.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Specifies the type of the extension. For example `CustomScriptExtension` or `AzureMonitorLinuxAgent`. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the extension. For example `CustomScriptExtension` or `AzureMonitorLinuxAgent`. Changing this forces a new Hybrid Compute Machine Extension to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the script handler.
         * 
         * &gt; **Note:** 1. When `automatic_upgrade_enabled` is set to `false` and no `type_handler_version` is specified, the `type_handler_version` change should be manually ignored by `ignore_changes` lifecycle block. This is because the `type_handler_version` is set by the Azure platform when the extension is created. 2. When `automatic_upgrade_enabled` is set to `false` and `type_handler_version` is specified, the provider will check whether the version prefix is aligned with user input. For example, if user specifies `1.24` in `type_handler_version`, `1.24.1` will be considered as no diff.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the script handler.
         * 
         * &gt; **Note:** 1. When `automatic_upgrade_enabled` is set to `false` and no `type_handler_version` is specified, the `type_handler_version` change should be manually ignored by `ignore_changes` lifecycle block. This is because the `type_handler_version` is set by the Azure platform when the extension is created. 2. When `automatic_upgrade_enabled` is set to `false` and `type_handler_version` is specified, the provider will check whether the version prefix is aligned with user input. For example, if user specifies `1.24` in `type_handler_version`, `1.24.1` will be considered as no diff.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        public ExtensionState build() {
            return $;
        }
    }

}
