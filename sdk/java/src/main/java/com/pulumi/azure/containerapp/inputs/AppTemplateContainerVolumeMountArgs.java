// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppTemplateContainerVolumeMountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppTemplateContainerVolumeMountArgs Empty = new AppTemplateContainerVolumeMountArgs();

    /**
     * The name of the Volume to be mounted in the container.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Volume to be mounted in the container.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The path in the container at which to mount this volume.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path in the container at which to mount this volume.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The sub path of the volume to be mounted in the container.
     * 
     */
    @Import(name="subPath")
    private @Nullable Output<String> subPath;

    /**
     * @return The sub path of the volume to be mounted in the container.
     * 
     */
    public Optional<Output<String>> subPath() {
        return Optional.ofNullable(this.subPath);
    }

    private AppTemplateContainerVolumeMountArgs() {}

    private AppTemplateContainerVolumeMountArgs(AppTemplateContainerVolumeMountArgs $) {
        this.name = $.name;
        this.path = $.path;
        this.subPath = $.subPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppTemplateContainerVolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppTemplateContainerVolumeMountArgs $;

        public Builder() {
            $ = new AppTemplateContainerVolumeMountArgs();
        }

        public Builder(AppTemplateContainerVolumeMountArgs defaults) {
            $ = new AppTemplateContainerVolumeMountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Volume to be mounted in the container.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Volume to be mounted in the container.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The path in the container at which to mount this volume.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path in the container at which to mount this volume.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param subPath The sub path of the volume to be mounted in the container.
         * 
         * @return builder
         * 
         */
        public Builder subPath(@Nullable Output<String> subPath) {
            $.subPath = subPath;
            return this;
        }

        /**
         * @param subPath The sub path of the volume to be mounted in the container.
         * 
         * @return builder
         * 
         */
        public Builder subPath(String subPath) {
            return subPath(Output.of(subPath));
        }

        public AppTemplateContainerVolumeMountArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AppTemplateContainerVolumeMountArgs", "name");
            }
            if ($.path == null) {
                throw new MissingRequiredPropertyException("AppTemplateContainerVolumeMountArgs", "path");
            }
            return $;
        }
    }

}
