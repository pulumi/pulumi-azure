// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DicomServiceAuthentication {
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is https://dicom.azurehealthcareapis.azure.com
     * 
     */
    private @Nullable List<String> audiences;
    private @Nullable String authority;

    private DicomServiceAuthentication() {}
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is https://dicom.azurehealthcareapis.azure.com
     * 
     */
    public List<String> audiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable String authority;
        public Builder() {}
        public Builder(DicomServiceAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authority = defaults.authority;
        }

        @CustomType.Setter
        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }
        public DicomServiceAuthentication build() {
            final var o = new DicomServiceAuthentication();
            o.audiences = audiences;
            o.authority = authority;
            return o;
        }
    }
}