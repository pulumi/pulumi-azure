// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hybrid.outputs;

import com.pulumi.azure.hybrid.outputs.GetComputeMachineOsProfileWindowsConfigurationPatchSetting;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetComputeMachineOsProfileWindowsConfiguration {
    /**
     * @return A `patch_settings` block as defined above.
     * 
     */
    private List<GetComputeMachineOsProfileWindowsConfigurationPatchSetting> patchSettings;

    private GetComputeMachineOsProfileWindowsConfiguration() {}
    /**
     * @return A `patch_settings` block as defined above.
     * 
     */
    public List<GetComputeMachineOsProfileWindowsConfigurationPatchSetting> patchSettings() {
        return this.patchSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputeMachineOsProfileWindowsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetComputeMachineOsProfileWindowsConfigurationPatchSetting> patchSettings;
        public Builder() {}
        public Builder(GetComputeMachineOsProfileWindowsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.patchSettings = defaults.patchSettings;
        }

        @CustomType.Setter
        public Builder patchSettings(List<GetComputeMachineOsProfileWindowsConfigurationPatchSetting> patchSettings) {
            this.patchSettings = Objects.requireNonNull(patchSettings);
            return this;
        }
        public Builder patchSettings(GetComputeMachineOsProfileWindowsConfigurationPatchSetting... patchSettings) {
            return patchSettings(List.of(patchSettings));
        }
        public GetComputeMachineOsProfileWindowsConfiguration build() {
            final var o = new GetComputeMachineOsProfileWindowsConfiguration();
            o.patchSettings = patchSettings;
            return o;
        }
    }
}