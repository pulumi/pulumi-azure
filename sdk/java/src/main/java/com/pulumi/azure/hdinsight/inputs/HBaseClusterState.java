// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.HBaseClusterComponentVersionArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterComputeIsolationArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterDiskEncryptionArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterExtensionArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterGatewayArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterMonitorArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterNetworkArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterSecurityProfileArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountGen2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HBaseClusterState extends com.pulumi.resources.ResourceArgs {

    public static final HBaseClusterState Empty = new HBaseClusterState();

    /**
     * Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterVersion")
    private @Nullable Output<String> clusterVersion;

    /**
     * @return Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }

    /**
     * A `component_version` block as defined below.
     * 
     */
    @Import(name="componentVersion")
    private @Nullable Output<HBaseClusterComponentVersionArgs> componentVersion;

    /**
     * @return A `component_version` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterComponentVersionArgs>> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }

    /**
     * A `compute_isolation` block as defined below.
     * 
     */
    @Import(name="computeIsolation")
    private @Nullable Output<HBaseClusterComputeIsolationArgs> computeIsolation;

    /**
     * @return A `compute_isolation` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterComputeIsolationArgs>> computeIsolation() {
        return Optional.ofNullable(this.computeIsolation);
    }

    /**
     * One or more `disk_encryption` block as defined below.
     * 
     */
    @Import(name="diskEncryptions")
    private @Nullable Output<List<HBaseClusterDiskEncryptionArgs>> diskEncryptions;

    /**
     * @return One or more `disk_encryption` block as defined below.
     * 
     */
    public Optional<Output<List<HBaseClusterDiskEncryptionArgs>>> diskEncryptions() {
        return Optional.ofNullable(this.diskEncryptions);
    }

    /**
     * An `extension` block as defined below.
     * 
     */
    @Import(name="extension")
    private @Nullable Output<HBaseClusterExtensionArgs> extension;

    /**
     * @return An `extension` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterExtensionArgs>> extension() {
        return Optional.ofNullable(this.extension);
    }

    /**
     * A `gateway` block as defined below.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<HBaseClusterGatewayArgs> gateway;

    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterGatewayArgs>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * The HTTPS Connectivity Endpoint for this HDInsight HBase Cluster.
     * 
     */
    @Import(name="httpsEndpoint")
    private @Nullable Output<String> httpsEndpoint;

    /**
     * @return The HTTPS Connectivity Endpoint for this HDInsight HBase Cluster.
     * 
     */
    public Optional<Output<String>> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }

    /**
     * Specifies the Azure Region which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `metastores` block as defined below.
     * 
     */
    @Import(name="metastores")
    private @Nullable Output<HBaseClusterMetastoresArgs> metastores;

    /**
     * @return A `metastores` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterMetastoresArgs>> metastores() {
        return Optional.ofNullable(this.metastores);
    }

    /**
     * A `monitor` block as defined below.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<HBaseClusterMonitorArgs> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterMonitorArgs>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * Specifies the name for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network` block as defined below.
     * 
     */
    @Import(name="network")
    private @Nullable Output<HBaseClusterNetworkArgs> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * A `private_link_configuration` block as defined below.
     * 
     */
    @Import(name="privateLinkConfiguration")
    private @Nullable Output<HBaseClusterPrivateLinkConfigurationArgs> privateLinkConfiguration;

    /**
     * @return A `private_link_configuration` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterPrivateLinkConfigurationArgs>> privateLinkConfiguration() {
        return Optional.ofNullable(this.privateLinkConfiguration);
    }

    /**
     * Specifies the name of the Resource Group in which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `roles` block as defined below.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<HBaseClusterRolesArgs> roles;

    /**
     * @return A `roles` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterRolesArgs>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="securityProfile")
    private @Nullable Output<HBaseClusterSecurityProfileArgs> securityProfile;

    /**
     * @return A `security_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<HBaseClusterSecurityProfileArgs>> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }

    /**
     * The SSH Connectivity Endpoint for this HDInsight HBase Cluster.
     * 
     */
    @Import(name="sshEndpoint")
    private @Nullable Output<String> sshEndpoint;

    /**
     * @return The SSH Connectivity Endpoint for this HDInsight HBase Cluster.
     * 
     */
    public Optional<Output<String>> sshEndpoint() {
        return Optional.ofNullable(this.sshEndpoint);
    }

    /**
     * A `storage_account_gen2` block as defined below.
     * 
     */
    @Import(name="storageAccountGen2")
    private @Nullable Output<HBaseClusterStorageAccountGen2Args> storageAccountGen2;

    /**
     * @return A `storage_account_gen2` block as defined below.
     * 
     */
    public Optional<Output<HBaseClusterStorageAccountGen2Args>> storageAccountGen2() {
        return Optional.ofNullable(this.storageAccountGen2);
    }

    /**
     * One or more `storage_account` block as defined below.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<HBaseClusterStorageAccountArgs>> storageAccounts;

    /**
     * @return One or more `storage_account` block as defined below.
     * 
     */
    public Optional<Output<List<HBaseClusterStorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * A map of Tags which should be assigned to this HDInsight HBase Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of Tags which should be assigned to this HDInsight HBase Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the Tier which should be used for this HDInsight HBase Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return Specifies the Tier which should be used for this HDInsight HBase Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    @Import(name="tlsMinVersion")
    private @Nullable Output<String> tlsMinVersion;

    /**
     * @return The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * 
     */
    public Optional<Output<String>> tlsMinVersion() {
        return Optional.ofNullable(this.tlsMinVersion);
    }

    private HBaseClusterState() {}

    private HBaseClusterState(HBaseClusterState $) {
        this.clusterVersion = $.clusterVersion;
        this.componentVersion = $.componentVersion;
        this.computeIsolation = $.computeIsolation;
        this.diskEncryptions = $.diskEncryptions;
        this.extension = $.extension;
        this.gateway = $.gateway;
        this.httpsEndpoint = $.httpsEndpoint;
        this.location = $.location;
        this.metastores = $.metastores;
        this.monitor = $.monitor;
        this.name = $.name;
        this.network = $.network;
        this.privateLinkConfiguration = $.privateLinkConfiguration;
        this.resourceGroupName = $.resourceGroupName;
        this.roles = $.roles;
        this.securityProfile = $.securityProfile;
        this.sshEndpoint = $.sshEndpoint;
        this.storageAccountGen2 = $.storageAccountGen2;
        this.storageAccounts = $.storageAccounts;
        this.tags = $.tags;
        this.tier = $.tier;
        this.tlsMinVersion = $.tlsMinVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HBaseClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HBaseClusterState $;

        public Builder() {
            $ = new HBaseClusterState();
        }

        public Builder(HBaseClusterState defaults) {
            $ = new HBaseClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(@Nullable Output<HBaseClusterComponentVersionArgs> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(HBaseClusterComponentVersionArgs componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param computeIsolation A `compute_isolation` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder computeIsolation(@Nullable Output<HBaseClusterComputeIsolationArgs> computeIsolation) {
            $.computeIsolation = computeIsolation;
            return this;
        }

        /**
         * @param computeIsolation A `compute_isolation` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder computeIsolation(HBaseClusterComputeIsolationArgs computeIsolation) {
            return computeIsolation(Output.of(computeIsolation));
        }

        /**
         * @param diskEncryptions One or more `disk_encryption` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptions(@Nullable Output<List<HBaseClusterDiskEncryptionArgs>> diskEncryptions) {
            $.diskEncryptions = diskEncryptions;
            return this;
        }

        /**
         * @param diskEncryptions One or more `disk_encryption` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptions(List<HBaseClusterDiskEncryptionArgs> diskEncryptions) {
            return diskEncryptions(Output.of(diskEncryptions));
        }

        /**
         * @param diskEncryptions One or more `disk_encryption` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptions(HBaseClusterDiskEncryptionArgs... diskEncryptions) {
            return diskEncryptions(List.of(diskEncryptions));
        }

        /**
         * @param extension An `extension` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder extension(@Nullable Output<HBaseClusterExtensionArgs> extension) {
            $.extension = extension;
            return this;
        }

        /**
         * @param extension An `extension` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder extension(HBaseClusterExtensionArgs extension) {
            return extension(Output.of(extension));
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<HBaseClusterGatewayArgs> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(HBaseClusterGatewayArgs gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(@Nullable Output<String> httpsEndpoint) {
            $.httpsEndpoint = httpsEndpoint;
            return this;
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(String httpsEndpoint) {
            return httpsEndpoint(Output.of(httpsEndpoint));
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(@Nullable Output<HBaseClusterMetastoresArgs> metastores) {
            $.metastores = metastores;
            return this;
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(HBaseClusterMetastoresArgs metastores) {
            return metastores(Output.of(metastores));
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<HBaseClusterMonitorArgs> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(HBaseClusterMonitorArgs monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param name Specifies the name for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name for this HDInsight HBase Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<HBaseClusterNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(HBaseClusterNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param privateLinkConfiguration A `private_link_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfiguration(@Nullable Output<HBaseClusterPrivateLinkConfigurationArgs> privateLinkConfiguration) {
            $.privateLinkConfiguration = privateLinkConfiguration;
            return this;
        }

        /**
         * @param privateLinkConfiguration A `private_link_configuration` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkConfiguration(HBaseClusterPrivateLinkConfigurationArgs privateLinkConfiguration) {
            return privateLinkConfiguration(Output.of(privateLinkConfiguration));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight HBase Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<HBaseClusterRolesArgs> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(HBaseClusterRolesArgs roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param securityProfile A `security_profile` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(@Nullable Output<HBaseClusterSecurityProfileArgs> securityProfile) {
            $.securityProfile = securityProfile;
            return this;
        }

        /**
         * @param securityProfile A `security_profile` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(HBaseClusterSecurityProfileArgs securityProfile) {
            return securityProfile(Output.of(securityProfile));
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(@Nullable Output<String> sshEndpoint) {
            $.sshEndpoint = sshEndpoint;
            return this;
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(String sshEndpoint) {
            return sshEndpoint(Output.of(sshEndpoint));
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(@Nullable Output<HBaseClusterStorageAccountGen2Args> storageAccountGen2) {
            $.storageAccountGen2 = storageAccountGen2;
            return this;
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(HBaseClusterStorageAccountGen2Args storageAccountGen2) {
            return storageAccountGen2(Output.of(storageAccountGen2));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<HBaseClusterStorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<HBaseClusterStorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(HBaseClusterStorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight HBase Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight HBase Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight HBase Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param tlsMinVersion The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(@Nullable Output<String> tlsMinVersion) {
            $.tlsMinVersion = tlsMinVersion;
            return this;
        }

        /**
         * @param tlsMinVersion The minimal supported TLS version. Possible values are 1.0, 1.1 or 1.2. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
         * 
         * @return builder
         * 
         */
        public Builder tlsMinVersion(String tlsMinVersion) {
            return tlsMinVersion(Output.of(tlsMinVersion));
        }

        public HBaseClusterState build() {
            return $;
        }
    }

}
