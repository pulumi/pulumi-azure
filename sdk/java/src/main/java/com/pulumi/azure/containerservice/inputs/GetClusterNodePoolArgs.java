// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodePoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterNodePoolArgs Empty = new GetClusterNodePoolArgs();

    /**
     * The Name of the Kubernetes Cluster where this Node Pool is located.
     * 
     */
    @Import(name="kubernetesClusterName", required=true)
    private Output<String> kubernetesClusterName;

    /**
     * @return The Name of the Kubernetes Cluster where this Node Pool is located.
     * 
     */
    public Output<String> kubernetesClusterName() {
        return this.kubernetesClusterName;
    }

    /**
     * The name of this Kubernetes Cluster Node Pool.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Kubernetes Cluster Node Pool.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Kubernetes Cluster exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Kubernetes Cluster exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetClusterNodePoolArgs() {}

    private GetClusterNodePoolArgs(GetClusterNodePoolArgs $) {
        this.kubernetesClusterName = $.kubernetesClusterName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterNodePoolArgs $;

        public Builder() {
            $ = new GetClusterNodePoolArgs();
        }

        public Builder(GetClusterNodePoolArgs defaults) {
            $ = new GetClusterNodePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kubernetesClusterName The Name of the Kubernetes Cluster where this Node Pool is located.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterName(Output<String> kubernetesClusterName) {
            $.kubernetesClusterName = kubernetesClusterName;
            return this;
        }

        /**
         * @param kubernetesClusterName The Name of the Kubernetes Cluster where this Node Pool is located.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterName(String kubernetesClusterName) {
            return kubernetesClusterName(Output.of(kubernetesClusterName));
        }

        /**
         * @param name The name of this Kubernetes Cluster Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Kubernetes Cluster Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Kubernetes Cluster exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Kubernetes Cluster exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetClusterNodePoolArgs build() {
            if ($.kubernetesClusterName == null) {
                throw new MissingRequiredPropertyException("GetClusterNodePoolArgs", "kubernetesClusterName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetClusterNodePoolArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetClusterNodePoolArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
