// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arckubernetes.inputs;

import com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterAzureActiveDirectoryArgs;
import com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProvisionedClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ProvisionedClusterState Empty = new ProvisionedClusterState();

    /**
     * The version of the agent running on the cluster resource.
     * 
     */
    @Import(name="agentVersion")
    private @Nullable Output<String> agentVersion;

    /**
     * @return The version of the agent running on the cluster resource.
     * 
     */
    public Optional<Output<String>> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }

    /**
     * Whether the Arc agents will be upgraded automatically to the latest version. Defaults to `true`.
     * 
     */
    @Import(name="arcAgentAutoUpgradeEnabled")
    private @Nullable Output<Boolean> arcAgentAutoUpgradeEnabled;

    /**
     * @return Whether the Arc agents will be upgraded automatically to the latest version. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> arcAgentAutoUpgradeEnabled() {
        return Optional.ofNullable(this.arcAgentAutoUpgradeEnabled);
    }

    /**
     * The version of the Arc agents to be installed on the cluster.
     * 
     */
    @Import(name="arcAgentDesiredVersion")
    private @Nullable Output<String> arcAgentDesiredVersion;

    /**
     * @return The version of the Arc agents to be installed on the cluster.
     * 
     */
    public Optional<Output<String>> arcAgentDesiredVersion() {
        return Optional.ofNullable(this.arcAgentDesiredVersion);
    }

    /**
     * An `azure_active_directory` block as defined below.
     * 
     */
    @Import(name="azureActiveDirectory")
    private @Nullable Output<ProvisionedClusterAzureActiveDirectoryArgs> azureActiveDirectory;

    /**
     * @return An `azure_active_directory` block as defined below.
     * 
     */
    public Optional<Output<ProvisionedClusterAzureActiveDirectoryArgs>> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }

    /**
     * The distribution running on this Arc Kubernetes Provisioned Cluster.
     * 
     */
    @Import(name="distribution")
    private @Nullable Output<String> distribution;

    /**
     * @return The distribution running on this Arc Kubernetes Provisioned Cluster.
     * 
     */
    public Optional<Output<String>> distribution() {
        return Optional.ofNullable(this.distribution);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ProvisionedClusterIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    public Optional<Output<ProvisionedClusterIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The infrastructure on which the Arc Kubernetes Provisioned Cluster is running on.
     * 
     */
    @Import(name="infrastructure")
    private @Nullable Output<String> infrastructure;

    /**
     * @return The infrastructure on which the Arc Kubernetes Provisioned Cluster is running on.
     * 
     */
    public Optional<Output<String>> infrastructure() {
        return Optional.ofNullable(this.infrastructure);
    }

    /**
     * The Kubernetes version of the cluster resource.
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version of the cluster resource.
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * The Azure Region where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Arc Kubernetes Provisioned Cluster. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Arc Kubernetes Provisioned Cluster. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The cluster offering.
     * 
     */
    @Import(name="offering")
    private @Nullable Output<String> offering;

    /**
     * @return The cluster offering.
     * 
     */
    public Optional<Output<String>> offering() {
        return Optional.ofNullable(this.offering);
    }

    /**
     * The name of the Resource Group where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Arc Kubernetes Provisioned Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Arc Kubernetes Provisioned Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The number of CPU cores present in the cluster resource.
     * 
     */
    @Import(name="totalCoreCount")
    private @Nullable Output<Integer> totalCoreCount;

    /**
     * @return The number of CPU cores present in the cluster resource.
     * 
     */
    public Optional<Output<Integer>> totalCoreCount() {
        return Optional.ofNullable(this.totalCoreCount);
    }

    /**
     * The number of nodes present in the cluster resource.
     * 
     */
    @Import(name="totalNodeCount")
    private @Nullable Output<Integer> totalNodeCount;

    /**
     * @return The number of nodes present in the cluster resource.
     * 
     */
    public Optional<Output<Integer>> totalNodeCount() {
        return Optional.ofNullable(this.totalNodeCount);
    }

    private ProvisionedClusterState() {}

    private ProvisionedClusterState(ProvisionedClusterState $) {
        this.agentVersion = $.agentVersion;
        this.arcAgentAutoUpgradeEnabled = $.arcAgentAutoUpgradeEnabled;
        this.arcAgentDesiredVersion = $.arcAgentDesiredVersion;
        this.azureActiveDirectory = $.azureActiveDirectory;
        this.distribution = $.distribution;
        this.identity = $.identity;
        this.infrastructure = $.infrastructure;
        this.kubernetesVersion = $.kubernetesVersion;
        this.location = $.location;
        this.name = $.name;
        this.offering = $.offering;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.totalCoreCount = $.totalCoreCount;
        this.totalNodeCount = $.totalNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProvisionedClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProvisionedClusterState $;

        public Builder() {
            $ = new ProvisionedClusterState();
        }

        public Builder(ProvisionedClusterState defaults) {
            $ = new ProvisionedClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentVersion The version of the agent running on the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        /**
         * @param agentVersion The version of the agent running on the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(String agentVersion) {
            return agentVersion(Output.of(agentVersion));
        }

        /**
         * @param arcAgentAutoUpgradeEnabled Whether the Arc agents will be upgraded automatically to the latest version. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder arcAgentAutoUpgradeEnabled(@Nullable Output<Boolean> arcAgentAutoUpgradeEnabled) {
            $.arcAgentAutoUpgradeEnabled = arcAgentAutoUpgradeEnabled;
            return this;
        }

        /**
         * @param arcAgentAutoUpgradeEnabled Whether the Arc agents will be upgraded automatically to the latest version. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder arcAgentAutoUpgradeEnabled(Boolean arcAgentAutoUpgradeEnabled) {
            return arcAgentAutoUpgradeEnabled(Output.of(arcAgentAutoUpgradeEnabled));
        }

        /**
         * @param arcAgentDesiredVersion The version of the Arc agents to be installed on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arcAgentDesiredVersion(@Nullable Output<String> arcAgentDesiredVersion) {
            $.arcAgentDesiredVersion = arcAgentDesiredVersion;
            return this;
        }

        /**
         * @param arcAgentDesiredVersion The version of the Arc agents to be installed on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arcAgentDesiredVersion(String arcAgentDesiredVersion) {
            return arcAgentDesiredVersion(Output.of(arcAgentDesiredVersion));
        }

        /**
         * @param azureActiveDirectory An `azure_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(@Nullable Output<ProvisionedClusterAzureActiveDirectoryArgs> azureActiveDirectory) {
            $.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        /**
         * @param azureActiveDirectory An `azure_active_directory` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureActiveDirectory(ProvisionedClusterAzureActiveDirectoryArgs azureActiveDirectory) {
            return azureActiveDirectory(Output.of(azureActiveDirectory));
        }

        /**
         * @param distribution The distribution running on this Arc Kubernetes Provisioned Cluster.
         * 
         * @return builder
         * 
         */
        public Builder distribution(@Nullable Output<String> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution The distribution running on this Arc Kubernetes Provisioned Cluster.
         * 
         * @return builder
         * 
         */
        public Builder distribution(String distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ProvisionedClusterIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(ProvisionedClusterIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param infrastructure The infrastructure on which the Arc Kubernetes Provisioned Cluster is running on.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(@Nullable Output<String> infrastructure) {
            $.infrastructure = infrastructure;
            return this;
        }

        /**
         * @param infrastructure The infrastructure on which the Arc Kubernetes Provisioned Cluster is running on.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(String infrastructure) {
            return infrastructure(Output.of(infrastructure));
        }

        /**
         * @param kubernetesVersion The Kubernetes version of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param location The Azure Region where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Arc Kubernetes Provisioned Cluster. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Arc Kubernetes Provisioned Cluster. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offering The cluster offering.
         * 
         * @return builder
         * 
         */
        public Builder offering(@Nullable Output<String> offering) {
            $.offering = offering;
            return this;
        }

        /**
         * @param offering The cluster offering.
         * 
         * @return builder
         * 
         */
        public Builder offering(String offering) {
            return offering(Output.of(offering));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Arc Kubernetes Provisioned Cluster should exist. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Arc Kubernetes Provisioned Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Arc Kubernetes Provisioned Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param totalCoreCount The number of CPU cores present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalCoreCount(@Nullable Output<Integer> totalCoreCount) {
            $.totalCoreCount = totalCoreCount;
            return this;
        }

        /**
         * @param totalCoreCount The number of CPU cores present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalCoreCount(Integer totalCoreCount) {
            return totalCoreCount(Output.of(totalCoreCount));
        }

        /**
         * @param totalNodeCount The number of nodes present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalNodeCount(@Nullable Output<Integer> totalNodeCount) {
            $.totalNodeCount = totalNodeCount;
            return this;
        }

        /**
         * @param totalNodeCount The number of nodes present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalNodeCount(Integer totalNodeCount) {
            return totalNodeCount(Output.of(totalNodeCount));
        }

        public ProvisionedClusterState build() {
            return $;
        }
    }

}
