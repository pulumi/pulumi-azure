// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDicomServiceAuthentication {
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is https://dicom.azurehealthcareapis.azure.com
     * 
     */
    private List<String> audiences;
    private String authority;

    private GetDicomServiceAuthentication() {}
    /**
     * @return The intended audience to receive authentication tokens for the service. The default value is https://dicom.azurehealthcareapis.azure.com
     * 
     */
    public List<String> audiences() {
        return this.audiences;
    }
    public String authority() {
        return this.authority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDicomServiceAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> audiences;
        private String authority;
        public Builder() {}
        public Builder(GetDicomServiceAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authority = defaults.authority;
        }

        @CustomType.Setter
        public Builder audiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder authority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }
        public GetDicomServiceAuthentication build() {
            final var o = new GetDicomServiceAuthentication();
            o.audiences = audiences;
            o.authority = authority;
            return o;
        }
    }
}