// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.SourceControlSlotGithubActionConfigurationCodeConfiguration;
import com.pulumi.azure.appservice.outputs.SourceControlSlotGithubActionConfigurationContainerConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SourceControlSlotGithubActionConfiguration {
    /**
     * @return A `code_configuration` block as detailed below.
     * 
     */
    private @Nullable SourceControlSlotGithubActionConfigurationCodeConfiguration codeConfiguration;
    /**
     * @return A `container_configuration` block as detailed below.
     * 
     */
    private @Nullable SourceControlSlotGithubActionConfigurationContainerConfiguration containerConfiguration;
    /**
     * @return Should the service generate the GitHub Action Workflow file. Defaults to `true` Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Boolean generateWorkflowFile;
    /**
     * @return Denotes this action uses a Linux base image.
     * 
     */
    private @Nullable Boolean linuxAction;

    private SourceControlSlotGithubActionConfiguration() {}
    /**
     * @return A `code_configuration` block as detailed below.
     * 
     */
    public Optional<SourceControlSlotGithubActionConfigurationCodeConfiguration> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * @return A `container_configuration` block as detailed below.
     * 
     */
    public Optional<SourceControlSlotGithubActionConfigurationContainerConfiguration> containerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }
    /**
     * @return Should the service generate the GitHub Action Workflow file. Defaults to `true` Changing this forces a new resource to be created.
     * 
     */
    public Optional<Boolean> generateWorkflowFile() {
        return Optional.ofNullable(this.generateWorkflowFile);
    }
    /**
     * @return Denotes this action uses a Linux base image.
     * 
     */
    public Optional<Boolean> linuxAction() {
        return Optional.ofNullable(this.linuxAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceControlSlotGithubActionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SourceControlSlotGithubActionConfigurationCodeConfiguration codeConfiguration;
        private @Nullable SourceControlSlotGithubActionConfigurationContainerConfiguration containerConfiguration;
        private @Nullable Boolean generateWorkflowFile;
        private @Nullable Boolean linuxAction;
        public Builder() {}
        public Builder(SourceControlSlotGithubActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.generateWorkflowFile = defaults.generateWorkflowFile;
    	      this.linuxAction = defaults.linuxAction;
        }

        @CustomType.Setter
        public Builder codeConfiguration(@Nullable SourceControlSlotGithubActionConfigurationCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder containerConfiguration(@Nullable SourceControlSlotGithubActionConfigurationContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder generateWorkflowFile(@Nullable Boolean generateWorkflowFile) {
            this.generateWorkflowFile = generateWorkflowFile;
            return this;
        }
        @CustomType.Setter
        public Builder linuxAction(@Nullable Boolean linuxAction) {
            this.linuxAction = linuxAction;
            return this;
        }
        public SourceControlSlotGithubActionConfiguration build() {
            final var o = new SourceControlSlotGithubActionConfiguration();
            o.codeConfiguration = codeConfiguration;
            o.containerConfiguration = containerConfiguration;
            o.generateWorkflowFile = generateWorkflowFile;
            o.linuxAction = linuxAction;
            return o;
        }
    }
}