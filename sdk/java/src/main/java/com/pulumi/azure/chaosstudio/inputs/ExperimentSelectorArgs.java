// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.chaosstudio.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ExperimentSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExperimentSelectorArgs Empty = new ExperimentSelectorArgs();

    /**
     * A list of Chaos Studio Target IDs that should be part of this Selector.
     * 
     */
    @Import(name="chaosStudioTargetIds", required=true)
    private Output<List<String>> chaosStudioTargetIds;

    /**
     * @return A list of Chaos Studio Target IDs that should be part of this Selector.
     * 
     */
    public Output<List<String>> chaosStudioTargetIds() {
        return this.chaosStudioTargetIds;
    }

    /**
     * The name of this Selector.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Selector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ExperimentSelectorArgs() {}

    private ExperimentSelectorArgs(ExperimentSelectorArgs $) {
        this.chaosStudioTargetIds = $.chaosStudioTargetIds;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentSelectorArgs $;

        public Builder() {
            $ = new ExperimentSelectorArgs();
        }

        public Builder(ExperimentSelectorArgs defaults) {
            $ = new ExperimentSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param chaosStudioTargetIds A list of Chaos Studio Target IDs that should be part of this Selector.
         * 
         * @return builder
         * 
         */
        public Builder chaosStudioTargetIds(Output<List<String>> chaosStudioTargetIds) {
            $.chaosStudioTargetIds = chaosStudioTargetIds;
            return this;
        }

        /**
         * @param chaosStudioTargetIds A list of Chaos Studio Target IDs that should be part of this Selector.
         * 
         * @return builder
         * 
         */
        public Builder chaosStudioTargetIds(List<String> chaosStudioTargetIds) {
            return chaosStudioTargetIds(Output.of(chaosStudioTargetIds));
        }

        /**
         * @param chaosStudioTargetIds A list of Chaos Studio Target IDs that should be part of this Selector.
         * 
         * @return builder
         * 
         */
        public Builder chaosStudioTargetIds(String... chaosStudioTargetIds) {
            return chaosStudioTargetIds(List.of(chaosStudioTargetIds));
        }

        /**
         * @param name The name of this Selector.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Selector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ExperimentSelectorArgs build() {
            if ($.chaosStudioTargetIds == null) {
                throw new MissingRequiredPropertyException("ExperimentSelectorArgs", "chaosStudioTargetIds");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ExperimentSelectorArgs", "name");
            }
            return $;
        }
    }

}
