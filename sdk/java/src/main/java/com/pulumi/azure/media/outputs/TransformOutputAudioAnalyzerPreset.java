// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransformOutputAudioAnalyzerPreset {
    /**
     * @return Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
     * 
     */
    private @Nullable String audioAnalysisMode;
    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     */
    private @Nullable String audioLanguage;

    private TransformOutputAudioAnalyzerPreset() {}
    /**
     * @return Possibles value are `Basic` or `Standard`. Determines the set of audio analysis operations to be performed.
     * 
     */
    public Optional<String> audioAnalysisMode() {
        return Optional.ofNullable(this.audioAnalysisMode);
    }
    /**
     * @return The language for the audio payload in the input using the BCP-47 format of &#39;language tag-region&#39; (e.g: &#39;en-US&#39;). If you know the language of your content, it is recommended that you specify it. The language must be specified explicitly for AudioAnalysisMode:Basic, since automatic language detection is not included in basic mode. If the language isn&#39;t specified, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernible speech. If automatic detection fails to find the language, transcription would fallback to &#39;en-US&#39;.&#34; The list of supported languages is available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     * 
     */
    public Optional<String> audioLanguage() {
        return Optional.ofNullable(this.audioLanguage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformOutputAudioAnalyzerPreset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String audioAnalysisMode;
        private @Nullable String audioLanguage;
        public Builder() {}
        public Builder(TransformOutputAudioAnalyzerPreset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioAnalysisMode = defaults.audioAnalysisMode;
    	      this.audioLanguage = defaults.audioLanguage;
        }

        @CustomType.Setter
        public Builder audioAnalysisMode(@Nullable String audioAnalysisMode) {
            this.audioAnalysisMode = audioAnalysisMode;
            return this;
        }
        @CustomType.Setter
        public Builder audioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }
        public TransformOutputAudioAnalyzerPreset build() {
            final var o = new TransformOutputAudioAnalyzerPreset();
            o.audioAnalysisMode = audioAnalysisMode;
            o.audioLanguage = audioLanguage;
            return o;
        }
    }
}