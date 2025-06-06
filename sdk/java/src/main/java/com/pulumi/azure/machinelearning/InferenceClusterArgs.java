// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning;

import com.pulumi.azure.machinelearning.inputs.InferenceClusterIdentityArgs;
import com.pulumi.azure.machinelearning.inputs.InferenceClusterSslArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InferenceClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final InferenceClusterArgs Empty = new InferenceClusterArgs();

    /**
     * The purpose of the Inference Cluster. Options are `DevTest`, `DenseProd` and `FastProd`. If used for Development or Testing, use `DevTest` here. Default purpose is `FastProd`, which is recommended for production workloads. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     * &gt; **Note:** When creating or attaching a cluster, if the cluster will be used for production (`cluster_purpose = &#34;FastProd&#34;`), then it must contain at least 12 virtual CPUs. The number of virtual CPUs can be calculated by multiplying the number of nodes in the cluster by the number of cores provided by the VM size selected. For example, if you use a VM size of &#34;Standard_D3_v2&#34;, which has 4 virtual cores, then you should select 3 or greater as the number of nodes.
     * 
     */
    @Import(name="clusterPurpose")
    private @Nullable Output<String> clusterPurpose;

    /**
     * @return The purpose of the Inference Cluster. Options are `DevTest`, `DenseProd` and `FastProd`. If used for Development or Testing, use `DevTest` here. Default purpose is `FastProd`, which is recommended for production workloads. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     * &gt; **Note:** When creating or attaching a cluster, if the cluster will be used for production (`cluster_purpose = &#34;FastProd&#34;`), then it must contain at least 12 virtual CPUs. The number of virtual CPUs can be calculated by multiplying the number of nodes in the cluster by the number of cores provided by the VM size selected. For example, if you use a VM size of &#34;Standard_D3_v2&#34;, which has 4 virtual cores, then you should select 3 or greater as the number of nodes.
     * 
     */
    public Optional<Output<String>> clusterPurpose() {
        return Optional.ofNullable(this.clusterPurpose);
    }

    /**
     * The description of the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<InferenceClusterIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<InferenceClusterIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The ID of the Kubernetes Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="kubernetesClusterId", required=true)
    private Output<String> kubernetesClusterId;

    /**
     * @return The ID of the Kubernetes Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Output<String> kubernetesClusterId() {
        return this.kubernetesClusterId;
    }

    /**
     * The Azure Region where the Machine Learning Inference Cluster should exist. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Machine Learning Inference Cluster should exist. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="machineLearningWorkspaceId", required=true)
    private Output<String> machineLearningWorkspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Output<String> machineLearningWorkspaceId() {
        return this.machineLearningWorkspaceId;
    }

    /**
     * The name which should be used for this Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="ssl")
    private @Nullable Output<InferenceClusterSslArgs> ssl;

    /**
     * @return A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<InferenceClusterSslArgs>> ssl() {
        return Optional.ofNullable(this.ssl);
    }

    /**
     * A mapping of tags which should be assigned to the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private InferenceClusterArgs() {}

    private InferenceClusterArgs(InferenceClusterArgs $) {
        this.clusterPurpose = $.clusterPurpose;
        this.description = $.description;
        this.identity = $.identity;
        this.kubernetesClusterId = $.kubernetesClusterId;
        this.location = $.location;
        this.machineLearningWorkspaceId = $.machineLearningWorkspaceId;
        this.name = $.name;
        this.ssl = $.ssl;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InferenceClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InferenceClusterArgs $;

        public Builder() {
            $ = new InferenceClusterArgs();
        }

        public Builder(InferenceClusterArgs defaults) {
            $ = new InferenceClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterPurpose The purpose of the Inference Cluster. Options are `DevTest`, `DenseProd` and `FastProd`. If used for Development or Testing, use `DevTest` here. Default purpose is `FastProd`, which is recommended for production workloads. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * &gt; **Note:** When creating or attaching a cluster, if the cluster will be used for production (`cluster_purpose = &#34;FastProd&#34;`), then it must contain at least 12 virtual CPUs. The number of virtual CPUs can be calculated by multiplying the number of nodes in the cluster by the number of cores provided by the VM size selected. For example, if you use a VM size of &#34;Standard_D3_v2&#34;, which has 4 virtual cores, then you should select 3 or greater as the number of nodes.
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(@Nullable Output<String> clusterPurpose) {
            $.clusterPurpose = clusterPurpose;
            return this;
        }

        /**
         * @param clusterPurpose The purpose of the Inference Cluster. Options are `DevTest`, `DenseProd` and `FastProd`. If used for Development or Testing, use `DevTest` here. Default purpose is `FastProd`, which is recommended for production workloads. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * &gt; **Note:** When creating or attaching a cluster, if the cluster will be used for production (`cluster_purpose = &#34;FastProd&#34;`), then it must contain at least 12 virtual CPUs. The number of virtual CPUs can be calculated by multiplying the number of nodes in the cluster by the number of cores provided by the VM size selected. For example, if you use a VM size of &#34;Standard_D3_v2&#34;, which has 4 virtual cores, then you should select 3 or greater as the number of nodes.
         * 
         * @return builder
         * 
         */
        public Builder clusterPurpose(String clusterPurpose) {
            return clusterPurpose(Output.of(clusterPurpose));
        }

        /**
         * @param description The description of the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<InferenceClusterIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(InferenceClusterIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kubernetesClusterId The ID of the Kubernetes Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(Output<String> kubernetesClusterId) {
            $.kubernetesClusterId = kubernetesClusterId;
            return this;
        }

        /**
         * @param kubernetesClusterId The ID of the Kubernetes Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesClusterId(String kubernetesClusterId) {
            return kubernetesClusterId(Output.of(kubernetesClusterId));
        }

        /**
         * @param location The Azure Region where the Machine Learning Inference Cluster should exist. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Machine Learning Inference Cluster should exist. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param machineLearningWorkspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder machineLearningWorkspaceId(Output<String> machineLearningWorkspaceId) {
            $.machineLearningWorkspaceId = machineLearningWorkspaceId;
            return this;
        }

        /**
         * @param machineLearningWorkspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder machineLearningWorkspaceId(String machineLearningWorkspaceId) {
            return machineLearningWorkspaceId(Output.of(machineLearningWorkspaceId));
        }

        /**
         * @param name The name which should be used for this Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ssl A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder ssl(@Nullable Output<InferenceClusterSslArgs> ssl) {
            $.ssl = ssl;
            return this;
        }

        /**
         * @param ssl A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder ssl(InferenceClusterSslArgs ssl) {
            return ssl(Output.of(ssl));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning Inference Cluster. Changing this forces a new Machine Learning Inference Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public InferenceClusterArgs build() {
            if ($.kubernetesClusterId == null) {
                throw new MissingRequiredPropertyException("InferenceClusterArgs", "kubernetesClusterId");
            }
            if ($.machineLearningWorkspaceId == null) {
                throw new MissingRequiredPropertyException("InferenceClusterArgs", "machineLearningWorkspaceId");
            }
            return $;
        }
    }

}
