// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs Empty = new ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs();

    /**
     * The value of the parsed pattern type.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the parsed pattern type.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * The type of the value of the parsed pattern type value.
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<String> valueType;

    /**
     * @return The type of the value of the parsed pattern type value.
     * 
     */
    public Optional<Output<String>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    private ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs() {}

    private ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs(ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs $) {
        this.value = $.value;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs $;

        public Builder() {
            $ = new ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs();
        }

        public Builder(ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs defaults) {
            $ = new ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The value of the parsed pattern type.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the parsed pattern type.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueType The type of the value of the parsed pattern type value.
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType The type of the value of the parsed pattern type value.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        public ThreatIntelligenceIndicatorParsedPatternPatternTypeValueArgs build() {
            return $;
        }
    }

}
