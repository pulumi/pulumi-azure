// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance;

import com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs;
import com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * The in guest user patch mode. Possible values are `Platform` or `User`. Must be specified when `scope` is `InGuestPatch`.
     * 
     */
    @Import(name="inGuestUserPatchMode")
    private @Nullable Output<String> inGuestUserPatchMode;

    /**
     * @return The in guest user patch mode. Possible values are `Platform` or `User`. Must be specified when `scope` is `InGuestPatch`.
     * 
     */
    public Optional<Output<String>> inGuestUserPatchMode() {
        return Optional.ofNullable(this.inGuestUserPatchMode);
    }

    /**
     * An `install_patches` block as defined below.
     * 
     * &gt; **Note:** `install_patches` must be specified when `scope` is `InGuestPatch`.
     * 
     */
    @Import(name="installPatches")
    private @Nullable Output<ConfigurationInstallPatchesArgs> installPatches;

    /**
     * @return An `install_patches` block as defined below.
     * 
     * &gt; **Note:** `install_patches` must be specified when `scope` is `InGuestPatch`.
     * 
     */
    public Optional<Output<ConfigurationInstallPatchesArgs>> installPatches() {
        return Optional.ofNullable(this.installPatches);
    }

    /**
     * Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of properties to assign to the resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return A mapping of properties to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The scope of the Maintenance Configuration. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of the Maintenance Configuration. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * A mapping of tags to assign to the resource. The key could not contain upper case letter.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. The key could not contain upper case letter.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The visibility of the Maintenance Configuration. The only allowable value is `Custom`. Defaults to `Custom`.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    /**
     * @return The visibility of the Maintenance Configuration. The only allowable value is `Custom`. Defaults to `Custom`.
     * 
     */
    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    /**
     * A `window` block as defined below.
     * 
     */
    @Import(name="window")
    private @Nullable Output<ConfigurationWindowArgs> window;

    /**
     * @return A `window` block as defined below.
     * 
     */
    public Optional<Output<ConfigurationWindowArgs>> window() {
        return Optional.ofNullable(this.window);
    }

    private ConfigurationArgs() {}

    private ConfigurationArgs(ConfigurationArgs $) {
        this.inGuestUserPatchMode = $.inGuestUserPatchMode;
        this.installPatches = $.installPatches;
        this.location = $.location;
        this.name = $.name;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.scope = $.scope;
        this.tags = $.tags;
        this.visibility = $.visibility;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationArgs $;

        public Builder() {
            $ = new ConfigurationArgs();
        }

        public Builder(ConfigurationArgs defaults) {
            $ = new ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inGuestUserPatchMode The in guest user patch mode. Possible values are `Platform` or `User`. Must be specified when `scope` is `InGuestPatch`.
         * 
         * @return builder
         * 
         */
        public Builder inGuestUserPatchMode(@Nullable Output<String> inGuestUserPatchMode) {
            $.inGuestUserPatchMode = inGuestUserPatchMode;
            return this;
        }

        /**
         * @param inGuestUserPatchMode The in guest user patch mode. Possible values are `Platform` or `User`. Must be specified when `scope` is `InGuestPatch`.
         * 
         * @return builder
         * 
         */
        public Builder inGuestUserPatchMode(String inGuestUserPatchMode) {
            return inGuestUserPatchMode(Output.of(inGuestUserPatchMode));
        }

        /**
         * @param installPatches An `install_patches` block as defined below.
         * 
         * &gt; **Note:** `install_patches` must be specified when `scope` is `InGuestPatch`.
         * 
         * @return builder
         * 
         */
        public Builder installPatches(@Nullable Output<ConfigurationInstallPatchesArgs> installPatches) {
            $.installPatches = installPatches;
            return this;
        }

        /**
         * @param installPatches An `install_patches` block as defined below.
         * 
         * &gt; **Note:** `install_patches` must be specified when `scope` is `InGuestPatch`.
         * 
         * @return builder
         * 
         */
        public Builder installPatches(ConfigurationInstallPatchesArgs installPatches) {
            return installPatches(Output.of(installPatches));
        }

        /**
         * @param location Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties A mapping of properties to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A mapping of properties to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scope The scope of the Maintenance Configuration. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the Maintenance Configuration. Possible values are `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags A mapping of tags to assign to the resource. The key could not contain upper case letter.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource. The key could not contain upper case letter.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param visibility The visibility of the Maintenance Configuration. The only allowable value is `Custom`. Defaults to `Custom`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility The visibility of the Maintenance Configuration. The only allowable value is `Custom`. Defaults to `Custom`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        /**
         * @param window A `window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder window(@Nullable Output<ConfigurationWindowArgs> window) {
            $.window = window;
            return this;
        }

        /**
         * @param window A `window` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder window(ConfigurationWindowArgs window) {
            return window(Output.of(window));
        }

        public ConfigurationArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ConfigurationArgs", "resourceGroupName");
            }
            if ($.scope == null) {
                throw new MissingRequiredPropertyException("ConfigurationArgs", "scope");
            }
            return $;
        }
    }

}
