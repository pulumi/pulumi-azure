// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.TransformOutputCustomPresetFormatMp4;
import com.pulumi.azure.media.outputs.TransformOutputCustomPresetFormatTransportStream;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransformOutputCustomPresetFormat {
    /**
     * @return A `mp4` block as defined below.
     * 
     */
    private @Nullable TransformOutputCustomPresetFormatMp4 mp4;
    /**
     * @return A `transport_stream` block as defined below.
     * 
     * &gt; **NOTE:** Each format can only have one type: `mp4` or `transport_stream`. If you need to apply different type you must create one format for each one.
     * 
     */
    private @Nullable TransformOutputCustomPresetFormatTransportStream transportStream;

    private TransformOutputCustomPresetFormat() {}
    /**
     * @return A `mp4` block as defined below.
     * 
     */
    public Optional<TransformOutputCustomPresetFormatMp4> mp4() {
        return Optional.ofNullable(this.mp4);
    }
    /**
     * @return A `transport_stream` block as defined below.
     * 
     * &gt; **NOTE:** Each format can only have one type: `mp4` or `transport_stream`. If you need to apply different type you must create one format for each one.
     * 
     */
    public Optional<TransformOutputCustomPresetFormatTransportStream> transportStream() {
        return Optional.ofNullable(this.transportStream);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputCustomPresetFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TransformOutputCustomPresetFormatMp4 mp4;
        private @Nullable TransformOutputCustomPresetFormatTransportStream transportStream;
        public Builder() {}
        public Builder(TransformOutputCustomPresetFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mp4 = defaults.mp4;
    	      this.transportStream = defaults.transportStream;
        }

        @CustomType.Setter
        public Builder mp4(@Nullable TransformOutputCustomPresetFormatMp4 mp4) {
            this.mp4 = mp4;
            return this;
        }
        @CustomType.Setter
        public Builder transportStream(@Nullable TransformOutputCustomPresetFormatTransportStream transportStream) {
            this.transportStream = transportStream;
            return this;
        }
        public TransformOutputCustomPresetFormat build() {
            final var o = new TransformOutputCustomPresetFormat();
            o.mp4 = mp4;
            o.transportStream = transportStream;
            return o;
        }
    }
}