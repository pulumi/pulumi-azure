// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.NetworkWatcherFlowLogRetentionPolicyArgs;
import com.pulumi.azure.network.inputs.NetworkWatcherFlowLogTrafficAnalyticsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkWatcherFlowLogState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkWatcherFlowLogState Empty = new NetworkWatcherFlowLogState();

    /**
     * Boolean flag to enable/disable traffic analytics.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean flag to enable/disable traffic analytics.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Network Security Group for which to enable flow logs for. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkSecurityGroupId")
    private @Nullable Output<String> networkSecurityGroupId;

    /**
     * @return The ID of the Network Security Group for which to enable flow logs for. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> networkSecurityGroupId() {
        return Optional.ofNullable(this.networkSecurityGroupId);
    }

    /**
     * The name of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkWatcherName")
    private @Nullable Output<String> networkWatcherName;

    /**
     * @return The name of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> networkWatcherName() {
        return Optional.ofNullable(this.networkWatcherName);
    }

    /**
     * The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `retention_policy` block as documented below.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<NetworkWatcherFlowLogRetentionPolicyArgs> retentionPolicy;

    /**
     * @return A `retention_policy` block as documented below.
     * 
     */
    public Optional<Output<NetworkWatcherFlowLogRetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The ID of the Storage Account where flow logs are stored.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The ID of the Storage Account where flow logs are stored.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * A mapping of tags which should be assigned to the Network Watcher Flow Log.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Network Watcher Flow Log.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A `traffic_analytics` block as documented below.
     * 
     */
    @Import(name="trafficAnalytics")
    private @Nullable Output<NetworkWatcherFlowLogTrafficAnalyticsArgs> trafficAnalytics;

    /**
     * @return A `traffic_analytics` block as documented below.
     * 
     */
    public Optional<Output<NetworkWatcherFlowLogTrafficAnalyticsArgs>> trafficAnalytics() {
        return Optional.ofNullable(this.trafficAnalytics);
    }

    /**
     * The version (revision) of the flow log. Possible values are `1` and `2`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The version (revision) of the flow log. Possible values are `1` and `2`.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private NetworkWatcherFlowLogState() {}

    private NetworkWatcherFlowLogState(NetworkWatcherFlowLogState $) {
        this.enabled = $.enabled;
        this.location = $.location;
        this.name = $.name;
        this.networkSecurityGroupId = $.networkSecurityGroupId;
        this.networkWatcherName = $.networkWatcherName;
        this.resourceGroupName = $.resourceGroupName;
        this.retentionPolicy = $.retentionPolicy;
        this.storageAccountId = $.storageAccountId;
        this.tags = $.tags;
        this.trafficAnalytics = $.trafficAnalytics;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkWatcherFlowLogState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkWatcherFlowLogState $;

        public Builder() {
            $ = new NetworkWatcherFlowLogState();
        }

        public Builder(NetworkWatcherFlowLogState defaults) {
            $ = new NetworkWatcherFlowLogState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Boolean flag to enable/disable traffic analytics.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean flag to enable/disable traffic analytics.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param location The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the Network Watcher Flow Log resides. Changing this forces a new resource to be created. Defaults to the `location` of the Network Watcher.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Network Watcher Flow Log. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkSecurityGroupId The ID of the Network Security Group for which to enable flow logs for. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupId(@Nullable Output<String> networkSecurityGroupId) {
            $.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }

        /**
         * @param networkSecurityGroupId The ID of the Network Security Group for which to enable flow logs for. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            return networkSecurityGroupId(Output.of(networkSecurityGroupId));
        }

        /**
         * @param networkWatcherName The name of the Network Watcher. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(@Nullable Output<String> networkWatcherName) {
            $.networkWatcherName = networkWatcherName;
            return this;
        }

        /**
         * @param networkWatcherName The name of the Network Watcher. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(String networkWatcherName) {
            return networkWatcherName(Output.of(networkWatcherName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Network Watcher was deployed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retentionPolicy A `retention_policy` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<NetworkWatcherFlowLogRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy A `retention_policy` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(NetworkWatcherFlowLogRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param storageAccountId The ID of the Storage Account where flow logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The ID of the Storage Account where flow logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Network Watcher Flow Log.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Network Watcher Flow Log.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param trafficAnalytics A `traffic_analytics` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder trafficAnalytics(@Nullable Output<NetworkWatcherFlowLogTrafficAnalyticsArgs> trafficAnalytics) {
            $.trafficAnalytics = trafficAnalytics;
            return this;
        }

        /**
         * @param trafficAnalytics A `traffic_analytics` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder trafficAnalytics(NetworkWatcherFlowLogTrafficAnalyticsArgs trafficAnalytics) {
            return trafficAnalytics(Output.of(trafficAnalytics));
        }

        /**
         * @param version The version (revision) of the flow log. Possible values are `1` and `2`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version (revision) of the flow log. Possible values are `1` and `2`.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public NetworkWatcherFlowLogState build() {
            return $;
        }
    }

}