// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTemplateContainerLivenessProbeHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateContainerLivenessProbeHeaderArgs Empty = new JobTemplateContainerLivenessProbeHeaderArgs();

    /**
     * The HTTP Header Name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The HTTP Header Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The HTTP Header value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The HTTP Header value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private JobTemplateContainerLivenessProbeHeaderArgs() {}

    private JobTemplateContainerLivenessProbeHeaderArgs(JobTemplateContainerLivenessProbeHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateContainerLivenessProbeHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateContainerLivenessProbeHeaderArgs $;

        public Builder() {
            $ = new JobTemplateContainerLivenessProbeHeaderArgs();
        }

        public Builder(JobTemplateContainerLivenessProbeHeaderArgs defaults) {
            $ = new JobTemplateContainerLivenessProbeHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The HTTP Header Name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The HTTP Header Name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The HTTP Header value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The HTTP Header value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public JobTemplateContainerLivenessProbeHeaderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("JobTemplateContainerLivenessProbeHeaderArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("JobTemplateContainerLivenessProbeHeaderArgs", "value");
            }
            return $;
        }
    }

}
