// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConfigurationInstallPatchesLinux {
    /**
     * @return List of Classification category of patches to be patched. Possible values are `Critical`, `Security` and `Other`.
     * 
     */
    private @Nullable List<String> classificationsToIncludes;
    /**
     * @return List of package names to be excluded from patching.
     * 
     */
    private @Nullable List<String> packageNamesMaskToExcludes;
    /**
     * @return List of package names to be included for patching.
     * 
     */
    private @Nullable List<String> packageNamesMaskToIncludes;

    private ConfigurationInstallPatchesLinux() {}
    /**
     * @return List of Classification category of patches to be patched. Possible values are `Critical`, `Security` and `Other`.
     * 
     */
    public List<String> classificationsToIncludes() {
        return this.classificationsToIncludes == null ? List.of() : this.classificationsToIncludes;
    }
    /**
     * @return List of package names to be excluded from patching.
     * 
     */
    public List<String> packageNamesMaskToExcludes() {
        return this.packageNamesMaskToExcludes == null ? List.of() : this.packageNamesMaskToExcludes;
    }
    /**
     * @return List of package names to be included for patching.
     * 
     */
    public List<String> packageNamesMaskToIncludes() {
        return this.packageNamesMaskToIncludes == null ? List.of() : this.packageNamesMaskToIncludes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationInstallPatchesLinux defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> classificationsToIncludes;
        private @Nullable List<String> packageNamesMaskToExcludes;
        private @Nullable List<String> packageNamesMaskToIncludes;
        public Builder() {}
        public Builder(ConfigurationInstallPatchesLinux defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationsToIncludes = defaults.classificationsToIncludes;
    	      this.packageNamesMaskToExcludes = defaults.packageNamesMaskToExcludes;
    	      this.packageNamesMaskToIncludes = defaults.packageNamesMaskToIncludes;
        }

        @CustomType.Setter
        public Builder classificationsToIncludes(@Nullable List<String> classificationsToIncludes) {

            this.classificationsToIncludes = classificationsToIncludes;
            return this;
        }
        public Builder classificationsToIncludes(String... classificationsToIncludes) {
            return classificationsToIncludes(List.of(classificationsToIncludes));
        }
        @CustomType.Setter
        public Builder packageNamesMaskToExcludes(@Nullable List<String> packageNamesMaskToExcludes) {

            this.packageNamesMaskToExcludes = packageNamesMaskToExcludes;
            return this;
        }
        public Builder packageNamesMaskToExcludes(String... packageNamesMaskToExcludes) {
            return packageNamesMaskToExcludes(List.of(packageNamesMaskToExcludes));
        }
        @CustomType.Setter
        public Builder packageNamesMaskToIncludes(@Nullable List<String> packageNamesMaskToIncludes) {

            this.packageNamesMaskToIncludes = packageNamesMaskToIncludes;
            return this;
        }
        public Builder packageNamesMaskToIncludes(String... packageNamesMaskToIncludes) {
            return packageNamesMaskToIncludes(List.of(packageNamesMaskToIncludes));
        }
        public ConfigurationInstallPatchesLinux build() {
            final var _resultValue = new ConfigurationInstallPatchesLinux();
            _resultValue.classificationsToIncludes = classificationsToIncludes;
            _resultValue.packageNamesMaskToExcludes = packageNamesMaskToExcludes;
            _resultValue.packageNamesMaskToIncludes = packageNamesMaskToIncludes;
            return _resultValue;
        }
    }
}
