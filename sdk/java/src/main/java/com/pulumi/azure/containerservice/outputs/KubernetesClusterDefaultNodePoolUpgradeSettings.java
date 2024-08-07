// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterDefaultNodePoolUpgradeSettings {
    /**
     * @return The amount of time in minutes to wait on eviction of pods and graceful termination per node. This eviction wait time honors pod disruption budgets for upgrades. If this time is exceeded, the upgrade fails. Unsetting this after configuring it will force a new resource to be created.
     * 
     */
    private @Nullable Integer drainTimeoutInMinutes;
    /**
     * @return The maximum number or percentage of nodes which will be added to the Node Pool size during an upgrade.
     * 
     * &gt; **Note:** If a percentage is provided, the number of surge nodes is calculated from the `node_count` value on the current cluster. Node surge can allow a cluster to have more nodes than `max_count` during an upgrade. Ensure that your cluster has enough [IP space](https://docs.microsoft.com/azure/aks/upgrade-cluster#customize-node-surge-upgrade) during an upgrade.
     * 
     */
    private String maxSurge;
    /**
     * @return The amount of time in minutes to wait after draining a node and before reimaging and moving on to next node. Defaults to `0`.
     * 
     */
    private @Nullable Integer nodeSoakDurationInMinutes;

    private KubernetesClusterDefaultNodePoolUpgradeSettings() {}
    /**
     * @return The amount of time in minutes to wait on eviction of pods and graceful termination per node. This eviction wait time honors pod disruption budgets for upgrades. If this time is exceeded, the upgrade fails. Unsetting this after configuring it will force a new resource to be created.
     * 
     */
    public Optional<Integer> drainTimeoutInMinutes() {
        return Optional.ofNullable(this.drainTimeoutInMinutes);
    }
    /**
     * @return The maximum number or percentage of nodes which will be added to the Node Pool size during an upgrade.
     * 
     * &gt; **Note:** If a percentage is provided, the number of surge nodes is calculated from the `node_count` value on the current cluster. Node surge can allow a cluster to have more nodes than `max_count` during an upgrade. Ensure that your cluster has enough [IP space](https://docs.microsoft.com/azure/aks/upgrade-cluster#customize-node-surge-upgrade) during an upgrade.
     * 
     */
    public String maxSurge() {
        return this.maxSurge;
    }
    /**
     * @return The amount of time in minutes to wait after draining a node and before reimaging and moving on to next node. Defaults to `0`.
     * 
     */
    public Optional<Integer> nodeSoakDurationInMinutes() {
        return Optional.ofNullable(this.nodeSoakDurationInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterDefaultNodePoolUpgradeSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer drainTimeoutInMinutes;
        private String maxSurge;
        private @Nullable Integer nodeSoakDurationInMinutes;
        public Builder() {}
        public Builder(KubernetesClusterDefaultNodePoolUpgradeSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainTimeoutInMinutes = defaults.drainTimeoutInMinutes;
    	      this.maxSurge = defaults.maxSurge;
    	      this.nodeSoakDurationInMinutes = defaults.nodeSoakDurationInMinutes;
        }

        @CustomType.Setter
        public Builder drainTimeoutInMinutes(@Nullable Integer drainTimeoutInMinutes) {

            this.drainTimeoutInMinutes = drainTimeoutInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder maxSurge(String maxSurge) {
            if (maxSurge == null) {
              throw new MissingRequiredPropertyException("KubernetesClusterDefaultNodePoolUpgradeSettings", "maxSurge");
            }
            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSoakDurationInMinutes(@Nullable Integer nodeSoakDurationInMinutes) {

            this.nodeSoakDurationInMinutes = nodeSoakDurationInMinutes;
            return this;
        }
        public KubernetesClusterDefaultNodePoolUpgradeSettings build() {
            final var _resultValue = new KubernetesClusterDefaultNodePoolUpgradeSettings();
            _resultValue.drainTimeoutInMinutes = drainTimeoutInMinutes;
            _resultValue.maxSurge = maxSurge;
            _resultValue.nodeSoakDurationInMinutes = nodeSoakDurationInMinutes;
            return _resultValue;
        }
    }
}
