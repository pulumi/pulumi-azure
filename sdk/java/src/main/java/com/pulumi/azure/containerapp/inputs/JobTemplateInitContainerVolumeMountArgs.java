// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTemplateInitContainerVolumeMountArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateInitContainerVolumeMountArgs Empty = new JobTemplateInitContainerVolumeMountArgs();

    /**
     * The name of the volume to mount. This must match the name of a volume defined in the `volume` block.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the volume to mount. This must match the name of a volume defined in the `volume` block.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The path within the container at which the volume should be mounted. Must not contain `:`.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path within the container at which the volume should be mounted. Must not contain `:`.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private JobTemplateInitContainerVolumeMountArgs() {}

    private JobTemplateInitContainerVolumeMountArgs(JobTemplateInitContainerVolumeMountArgs $) {
        this.name = $.name;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateInitContainerVolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateInitContainerVolumeMountArgs $;

        public Builder() {
            $ = new JobTemplateInitContainerVolumeMountArgs();
        }

        public Builder(JobTemplateInitContainerVolumeMountArgs defaults) {
            $ = new JobTemplateInitContainerVolumeMountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the volume to mount. This must match the name of a volume defined in the `volume` block.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the volume to mount. This must match the name of a volume defined in the `volume` block.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The path within the container at which the volume should be mounted. Must not contain `:`.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path within the container at which the volume should be mounted. Must not contain `:`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public JobTemplateInitContainerVolumeMountArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("JobTemplateInitContainerVolumeMountArgs", "name");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("JobTemplateInitContainerVolumeMountArgs", "path");
            }
            return $;
        }
    }

}
