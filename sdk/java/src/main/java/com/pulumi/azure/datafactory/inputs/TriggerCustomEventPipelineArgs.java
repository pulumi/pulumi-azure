// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerCustomEventPipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerCustomEventPipelineArgs Empty = new TriggerCustomEventPipelineArgs();

    /**
     * The Data Factory Pipeline name that the trigger will act on.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Data Factory Pipeline name that the trigger will act on.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Data Factory Pipeline parameters that the trigger will act on.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return The Data Factory Pipeline parameters that the trigger will act on.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private TriggerCustomEventPipelineArgs() {}

    private TriggerCustomEventPipelineArgs(TriggerCustomEventPipelineArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerCustomEventPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerCustomEventPipelineArgs $;

        public Builder() {
            $ = new TriggerCustomEventPipelineArgs();
        }

        public Builder(TriggerCustomEventPipelineArgs defaults) {
            $ = new TriggerCustomEventPipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Data Factory Pipeline name that the trigger will act on.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Data Factory Pipeline name that the trigger will act on.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The Data Factory Pipeline parameters that the trigger will act on.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The Data Factory Pipeline parameters that the trigger will act on.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public TriggerCustomEventPipelineArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}