// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegistryTaskPlatform {
    /**
     * @return The OS architecture. Possible values are `amd64`, `x86`, `386`, `arm` and `arm64`.
     * 
     */
    private @Nullable String architecture;
    /**
     * @return The operating system type required for the task. Possible values are `Windows` and `Linux`.
     * 
     */
    private String os;
    /**
     * @return The variant of the CPU. Possible values are `v6`, `v7`, `v8`.
     * 
     */
    private @Nullable String variant;

    private RegistryTaskPlatform() {}
    /**
     * @return The OS architecture. Possible values are `amd64`, `x86`, `386`, `arm` and `arm64`.
     * 
     */
    public Optional<String> architecture() {
        return Optional.ofNullable(this.architecture);
    }
    /**
     * @return The operating system type required for the task. Possible values are `Windows` and `Linux`.
     * 
     */
    public String os() {
        return this.os;
    }
    /**
     * @return The variant of the CPU. Possible values are `v6`, `v7`, `v8`.
     * 
     */
    public Optional<String> variant() {
        return Optional.ofNullable(this.variant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryTaskPlatform defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String architecture;
        private String os;
        private @Nullable String variant;
        public Builder() {}
        public Builder(RegistryTaskPlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
    	      this.variant = defaults.variant;
        }

        @CustomType.Setter
        public Builder architecture(@Nullable String architecture) {

            this.architecture = architecture;
            return this;
        }
        @CustomType.Setter
        public Builder os(String os) {
            if (os == null) {
              throw new MissingRequiredPropertyException("RegistryTaskPlatform", "os");
            }
            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder variant(@Nullable String variant) {

            this.variant = variant;
            return this;
        }
        public RegistryTaskPlatform build() {
            final var _resultValue = new RegistryTaskPlatform();
            _resultValue.architecture = architecture;
            _resultValue.os = os;
            _resultValue.variant = variant;
            return _resultValue;
        }
    }
}
