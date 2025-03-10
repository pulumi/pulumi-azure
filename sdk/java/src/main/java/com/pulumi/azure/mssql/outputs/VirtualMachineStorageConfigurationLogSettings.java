// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VirtualMachineStorageConfigurationLogSettings {
    private String defaultFilePath;
    private List<Integer> luns;

    private VirtualMachineStorageConfigurationLogSettings() {}
    public String defaultFilePath() {
        return this.defaultFilePath;
    }
    public List<Integer> luns() {
        return this.luns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineStorageConfigurationLogSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultFilePath;
        private List<Integer> luns;
        public Builder() {}
        public Builder(VirtualMachineStorageConfigurationLogSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultFilePath = defaults.defaultFilePath;
    	      this.luns = defaults.luns;
        }

        @CustomType.Setter
        public Builder defaultFilePath(String defaultFilePath) {
            if (defaultFilePath == null) {
              throw new MissingRequiredPropertyException("VirtualMachineStorageConfigurationLogSettings", "defaultFilePath");
            }
            this.defaultFilePath = defaultFilePath;
            return this;
        }
        @CustomType.Setter
        public Builder luns(List<Integer> luns) {
            if (luns == null) {
              throw new MissingRequiredPropertyException("VirtualMachineStorageConfigurationLogSettings", "luns");
            }
            this.luns = luns;
            return this;
        }
        public Builder luns(Integer... luns) {
            return luns(List.of(luns));
        }
        public VirtualMachineStorageConfigurationLogSettings build() {
            final var _resultValue = new VirtualMachineStorageConfigurationLogSettings();
            _resultValue.defaultFilePath = defaultFilePath;
            _resultValue.luns = luns;
            return _resultValue;
        }
    }
}
