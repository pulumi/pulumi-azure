// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyCommonEncryptionCbcsDrmFairplay {
    /**
     * @return All license to be persistent or not. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable Boolean allowPersistentLicense;
    /**
     * @return Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private @Nullable String customLicenseAcquisitionUrlTemplate;

    private StreamingPolicyCommonEncryptionCbcsDrmFairplay() {}
    /**
     * @return All license to be persistent or not. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Boolean> allowPersistentLicense() {
        return Optional.ofNullable(this.allowPersistentLicense);
    }
    /**
     * @return Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<String> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyCommonEncryptionCbcsDrmFairplay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowPersistentLicense;
        private @Nullable String customLicenseAcquisitionUrlTemplate;
        public Builder() {}
        public Builder(StreamingPolicyCommonEncryptionCbcsDrmFairplay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPersistentLicense = defaults.allowPersistentLicense;
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
        }

        @CustomType.Setter
        public Builder allowPersistentLicense(@Nullable Boolean allowPersistentLicense) {
            this.allowPersistentLicense = allowPersistentLicense;
            return this;
        }
        @CustomType.Setter
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }
        public StreamingPolicyCommonEncryptionCbcsDrmFairplay build() {
            final var o = new StreamingPolicyCommonEncryptionCbcsDrmFairplay();
            o.allowPersistentLicense = allowPersistentLicense;
            o.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return o;
        }
    }
}