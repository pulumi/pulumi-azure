// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDeploymentScriptPowerShellContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDeploymentScriptPowerShellContainerArgs Empty = new ResourceDeploymentScriptPowerShellContainerArgs();

    /**
     * Container group name, if not specified then the name will get auto-generated. For more information, please refer to the [Container Configuration](https://learn.microsoft.com/en-us/rest/api/resources/deployment-scripts/create?tabs=HTTP#containerconfiguration) documentation.
     * 
     */
    @Import(name="containerGroupName")
    private @Nullable Output<String> containerGroupName;

    /**
     * @return Container group name, if not specified then the name will get auto-generated. For more information, please refer to the [Container Configuration](https://learn.microsoft.com/en-us/rest/api/resources/deployment-scripts/create?tabs=HTTP#containerconfiguration) documentation.
     * 
     */
    public Optional<Output<String>> containerGroupName() {
        return Optional.ofNullable(this.containerGroupName);
    }

    private ResourceDeploymentScriptPowerShellContainerArgs() {}

    private ResourceDeploymentScriptPowerShellContainerArgs(ResourceDeploymentScriptPowerShellContainerArgs $) {
        this.containerGroupName = $.containerGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDeploymentScriptPowerShellContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDeploymentScriptPowerShellContainerArgs $;

        public Builder() {
            $ = new ResourceDeploymentScriptPowerShellContainerArgs();
        }

        public Builder(ResourceDeploymentScriptPowerShellContainerArgs defaults) {
            $ = new ResourceDeploymentScriptPowerShellContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerGroupName Container group name, if not specified then the name will get auto-generated. For more information, please refer to the [Container Configuration](https://learn.microsoft.com/en-us/rest/api/resources/deployment-scripts/create?tabs=HTTP#containerconfiguration) documentation.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(@Nullable Output<String> containerGroupName) {
            $.containerGroupName = containerGroupName;
            return this;
        }

        /**
         * @param containerGroupName Container group name, if not specified then the name will get auto-generated. For more information, please refer to the [Container Configuration](https://learn.microsoft.com/en-us/rest/api/resources/deployment-scripts/create?tabs=HTTP#containerconfiguration) documentation.
         * 
         * @return builder
         * 
         */
        public Builder containerGroupName(String containerGroupName) {
            return containerGroupName(Output.of(containerGroupName));
        }

        public ResourceDeploymentScriptPowerShellContainerArgs build() {
            return $;
        }
    }

}