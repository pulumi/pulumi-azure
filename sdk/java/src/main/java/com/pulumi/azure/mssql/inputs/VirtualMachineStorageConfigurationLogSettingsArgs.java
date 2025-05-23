// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualMachineStorageConfigurationLogSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineStorageConfigurationLogSettingsArgs Empty = new VirtualMachineStorageConfigurationLogSettingsArgs();

    @Import(name="defaultFilePath", required=true)
    private Output<String> defaultFilePath;

    public Output<String> defaultFilePath() {
        return this.defaultFilePath;
    }

    @Import(name="luns", required=true)
    private Output<List<Integer>> luns;

    public Output<List<Integer>> luns() {
        return this.luns;
    }

    private VirtualMachineStorageConfigurationLogSettingsArgs() {}

    private VirtualMachineStorageConfigurationLogSettingsArgs(VirtualMachineStorageConfigurationLogSettingsArgs $) {
        this.defaultFilePath = $.defaultFilePath;
        this.luns = $.luns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineStorageConfigurationLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineStorageConfigurationLogSettingsArgs $;

        public Builder() {
            $ = new VirtualMachineStorageConfigurationLogSettingsArgs();
        }

        public Builder(VirtualMachineStorageConfigurationLogSettingsArgs defaults) {
            $ = new VirtualMachineStorageConfigurationLogSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultFilePath(Output<String> defaultFilePath) {
            $.defaultFilePath = defaultFilePath;
            return this;
        }

        public Builder defaultFilePath(String defaultFilePath) {
            return defaultFilePath(Output.of(defaultFilePath));
        }

        public Builder luns(Output<List<Integer>> luns) {
            $.luns = luns;
            return this;
        }

        public Builder luns(List<Integer> luns) {
            return luns(Output.of(luns));
        }

        public Builder luns(Integer... luns) {
            return luns(List.of(luns));
        }

        public VirtualMachineStorageConfigurationLogSettingsArgs build() {
            if ($.defaultFilePath == null) {
                throw new MissingRequiredPropertyException("VirtualMachineStorageConfigurationLogSettingsArgs", "defaultFilePath");
            }
            if ($.luns == null) {
                throw new MissingRequiredPropertyException("VirtualMachineStorageConfigurationLogSettingsArgs", "luns");
            }
            return $;
        }
    }

}
