// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDeploymentScriptAzureCliContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDeploymentScriptAzureCliContainerArgs Empty = new ResourceDeploymentScriptAzureCliContainerArgs();

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

    private ResourceDeploymentScriptAzureCliContainerArgs() {}

    private ResourceDeploymentScriptAzureCliContainerArgs(ResourceDeploymentScriptAzureCliContainerArgs $) {
        this.containerGroupName = $.containerGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDeploymentScriptAzureCliContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDeploymentScriptAzureCliContainerArgs $;

        public Builder() {
            $ = new ResourceDeploymentScriptAzureCliContainerArgs();
        }

        public Builder(ResourceDeploymentScriptAzureCliContainerArgs defaults) {
            $ = new ResourceDeploymentScriptAzureCliContainerArgs(Objects.requireNonNull(defaults));
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

        public ResourceDeploymentScriptAzureCliContainerArgs build() {
            return $;
        }
    }

}
