// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceControlGithubActionConfigurationContainerConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceControlGithubActionConfigurationContainerConfigurationArgs Empty = new SourceControlGithubActionConfigurationContainerConfigurationArgs();

    /**
     * The image name for the build. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    /**
     * @return The image name for the build. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }

    /**
     * The password used to upload the image to the container registry. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="registryPassword")
    private @Nullable Output<String> registryPassword;

    /**
     * @return The password used to upload the image to the container registry. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> registryPassword() {
        return Optional.ofNullable(this.registryPassword);
    }

    /**
     * The server URL for the container registry where the build will be hosted. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="registryUrl", required=true)
    private Output<String> registryUrl;

    /**
     * @return The server URL for the container registry where the build will be hosted. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> registryUrl() {
        return this.registryUrl;
    }

    /**
     * The username used to upload the image to the container registry. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="registryUsername")
    private @Nullable Output<String> registryUsername;

    /**
     * @return The username used to upload the image to the container registry. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> registryUsername() {
        return Optional.ofNullable(this.registryUsername);
    }

    private SourceControlGithubActionConfigurationContainerConfigurationArgs() {}

    private SourceControlGithubActionConfigurationContainerConfigurationArgs(SourceControlGithubActionConfigurationContainerConfigurationArgs $) {
        this.imageName = $.imageName;
        this.registryPassword = $.registryPassword;
        this.registryUrl = $.registryUrl;
        this.registryUsername = $.registryUsername;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceControlGithubActionConfigurationContainerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceControlGithubActionConfigurationContainerConfigurationArgs $;

        public Builder() {
            $ = new SourceControlGithubActionConfigurationContainerConfigurationArgs();
        }

        public Builder(SourceControlGithubActionConfigurationContainerConfigurationArgs defaults) {
            $ = new SourceControlGithubActionConfigurationContainerConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageName The image name for the build. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder imageName(Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The image name for the build. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param registryPassword The password used to upload the image to the container registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryPassword(@Nullable Output<String> registryPassword) {
            $.registryPassword = registryPassword;
            return this;
        }

        /**
         * @param registryPassword The password used to upload the image to the container registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryPassword(String registryPassword) {
            return registryPassword(Output.of(registryPassword));
        }

        /**
         * @param registryUrl The server URL for the container registry where the build will be hosted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryUrl(Output<String> registryUrl) {
            $.registryUrl = registryUrl;
            return this;
        }

        /**
         * @param registryUrl The server URL for the container registry where the build will be hosted. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryUrl(String registryUrl) {
            return registryUrl(Output.of(registryUrl));
        }

        /**
         * @param registryUsername The username used to upload the image to the container registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryUsername(@Nullable Output<String> registryUsername) {
            $.registryUsername = registryUsername;
            return this;
        }

        /**
         * @param registryUsername The username used to upload the image to the container registry. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder registryUsername(String registryUsername) {
            return registryUsername(Output.of(registryUsername));
        }

        public SourceControlGithubActionConfigurationContainerConfigurationArgs build() {
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            $.registryUrl = Objects.requireNonNull($.registryUrl, "expected parameter 'registryUrl' to be non-null");
            return $;
        }
    }

}