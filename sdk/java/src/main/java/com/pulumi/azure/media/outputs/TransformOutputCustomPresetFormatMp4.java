// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.TransformOutputCustomPresetFormatMp4OutputFile;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TransformOutputCustomPresetFormatMp4 {
    /**
     * @return The file naming pattern used for the creation of output files. The following macros are supported in the file name: `{Basename}` - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. `{Extension}` - The appropriate extension for this format. `{Label}` - The label assigned to the codec/layer. `{Index}` - A unique index for thumbnails. Only applicable to thumbnails. `{AudioStream}` - string &#34;Audio&#34; plus audio stream number(start from 1). `{Bitrate}` - The audio/video bitrate in kbps. Not applicable to thumbnails. `{Codec}` - The type of the audio/video codec. `{Resolution}` - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    private String filenamePattern;
    /**
     * @return One or more `output_file` blocks as defined below.
     * 
     */
    private @Nullable List<TransformOutputCustomPresetFormatMp4OutputFile> outputFiles;

    private TransformOutputCustomPresetFormatMp4() {}
    /**
     * @return The file naming pattern used for the creation of output files. The following macros are supported in the file name: `{Basename}` - An expansion macro that will use the name of the input video file. If the base name(the file suffix is not included) of the input video file is less than 32 characters long, the base name of input video files will be used. If the length of base name of the input video file exceeds 32 characters, the base name is truncated to the first 32 characters in total length. `{Extension}` - The appropriate extension for this format. `{Label}` - The label assigned to the codec/layer. `{Index}` - A unique index for thumbnails. Only applicable to thumbnails. `{AudioStream}` - string &#34;Audio&#34; plus audio stream number(start from 1). `{Bitrate}` - The audio/video bitrate in kbps. Not applicable to thumbnails. `{Codec}` - The type of the audio/video codec. `{Resolution}` - The video resolution. Any unsubstituted macros will be collapsed and removed from the filename.
     * 
     */
    public String filenamePattern() {
        return this.filenamePattern;
    }
    /**
     * @return One or more `output_file` blocks as defined below.
     * 
     */
    public List<TransformOutputCustomPresetFormatMp4OutputFile> outputFiles() {
        return this.outputFiles == null ? List.of() : this.outputFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputCustomPresetFormatMp4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filenamePattern;
        private @Nullable List<TransformOutputCustomPresetFormatMp4OutputFile> outputFiles;
        public Builder() {}
        public Builder(TransformOutputCustomPresetFormatMp4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filenamePattern = defaults.filenamePattern;
    	      this.outputFiles = defaults.outputFiles;
        }

        @CustomType.Setter
        public Builder filenamePattern(String filenamePattern) {
            this.filenamePattern = Objects.requireNonNull(filenamePattern);
            return this;
        }
        @CustomType.Setter
        public Builder outputFiles(@Nullable List<TransformOutputCustomPresetFormatMp4OutputFile> outputFiles) {
            this.outputFiles = outputFiles;
            return this;
        }
        public Builder outputFiles(TransformOutputCustomPresetFormatMp4OutputFile... outputFiles) {
            return outputFiles(List.of(outputFiles));
        }
        public TransformOutputCustomPresetFormatMp4 build() {
            final var o = new TransformOutputCustomPresetFormatMp4();
            o.filenamePattern = filenamePattern;
            o.outputFiles = outputFiles;
            return o;
        }
    }
}