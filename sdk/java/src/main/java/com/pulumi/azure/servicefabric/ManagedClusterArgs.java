// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric;

import com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs;
import com.pulumi.azure.servicefabric.inputs.ManagedClusterCustomFabricSettingArgs;
import com.pulumi.azure.servicefabric.inputs.ManagedClusterLbRuleArgs;
import com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterArgs Empty = new ManagedClusterArgs();

    /**
     * Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<ManagedClusterAuthenticationArgs> authentication;

    /**
     * @return Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
     * 
     */
    public Optional<Output<ManagedClusterAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * If true, backup service is enabled.
     * 
     */
    @Import(name="backupServiceEnabled")
    private @Nullable Output<Boolean> backupServiceEnabled;

    /**
     * @return If true, backup service is enabled.
     * 
     */
    public Optional<Output<Boolean>> backupServiceEnabled() {
        return Optional.ofNullable(this.backupServiceEnabled);
    }

    /**
     * Port to use when connecting to the cluster.
     * 
     */
    @Import(name="clientConnectionPort", required=true)
    private Output<Integer> clientConnectionPort;

    /**
     * @return Port to use when connecting to the cluster.
     * 
     */
    public Output<Integer> clientConnectionPort() {
        return this.clientConnectionPort;
    }

    /**
     * One or more `custom_fabric_setting` blocks as defined below.
     * 
     */
    @Import(name="customFabricSettings")
    private @Nullable Output<List<ManagedClusterCustomFabricSettingArgs>> customFabricSettings;

    /**
     * @return One or more `custom_fabric_setting` blocks as defined below.
     * 
     */
    public Optional<Output<List<ManagedClusterCustomFabricSettingArgs>>> customFabricSettings() {
        return Optional.ofNullable(this.customFabricSettings);
    }

    /**
     * Hostname for the cluster. If unset the cluster&#39;s name will be used..
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return Hostname for the cluster. If unset the cluster&#39;s name will be used..
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * If true, DNS service is enabled.
     * 
     */
    @Import(name="dnsServiceEnabled")
    private @Nullable Output<Boolean> dnsServiceEnabled;

    /**
     * @return If true, DNS service is enabled.
     * 
     */
    public Optional<Output<Boolean>> dnsServiceEnabled() {
        return Optional.ofNullable(this.dnsServiceEnabled);
    }

    /**
     * Port that should be used by the Service Fabric Explorer to visualize applications and cluster status.
     * 
     */
    @Import(name="httpGatewayPort", required=true)
    private Output<Integer> httpGatewayPort;

    /**
     * @return Port that should be used by the Service Fabric Explorer to visualize applications and cluster status.
     * 
     */
    public Output<Integer> httpGatewayPort() {
        return this.httpGatewayPort;
    }

    /**
     * One or more `lb_rule` blocks as defined below.
     * 
     */
    @Import(name="lbRules", required=true)
    private Output<List<ManagedClusterLbRuleArgs>> lbRules;

    /**
     * @return One or more `lb_rule` blocks as defined below.
     * 
     */
    public Output<List<ManagedClusterLbRuleArgs>> lbRules() {
        return this.lbRules;
    }

    /**
     * The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more `node_type` blocks as defined below.
     * 
     */
    @Import(name="nodeTypes")
    private @Nullable Output<List<ManagedClusterNodeTypeArgs>> nodeTypes;

    /**
     * @return One or more `node_type` blocks as defined below.
     * 
     */
    public Optional<Output<List<ManagedClusterNodeTypeArgs>>> nodeTypes() {
        return Optional.ofNullable(this.nodeTypes);
    }

    /**
     * Administrator password for the VMs that will be created as part of this cluster.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Administrator password for the VMs that will be created as part of this cluster.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the Resource Group where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Resource Group should exist. Changing this forces a new Resource Group to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU for this cluster. Changing this forces a new resource to be created. Default is `Basic`, allowed values are either `Basic` or `Standard`.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return SKU for this cluster. Changing this forces a new resource to be created. Default is `Basic`, allowed values are either `Basic` or `Standard`.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The resource ID of the Subnet. Changing this forces a new Resource Group to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The resource ID of the Subnet. Changing this forces a new Resource Group to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags which should be assigned to the Resource Group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Resource Group.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Upgrade wave for the fabric runtime. Default is `Wave0`, allowed value must be one of `Wave0`, `Wave1`, or `Wave2`.
     * 
     */
    @Import(name="upgradeWave")
    private @Nullable Output<String> upgradeWave;

    /**
     * @return Upgrade wave for the fabric runtime. Default is `Wave0`, allowed value must be one of `Wave0`, `Wave1`, or `Wave2`.
     * 
     */
    public Optional<Output<String>> upgradeWave() {
        return Optional.ofNullable(this.upgradeWave);
    }

    /**
     * Administrator password for the VMs that will be created as part of this cluster.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Administrator password for the VMs that will be created as part of this cluster.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ManagedClusterArgs() {}

    private ManagedClusterArgs(ManagedClusterArgs $) {
        this.authentication = $.authentication;
        this.backupServiceEnabled = $.backupServiceEnabled;
        this.clientConnectionPort = $.clientConnectionPort;
        this.customFabricSettings = $.customFabricSettings;
        this.dnsName = $.dnsName;
        this.dnsServiceEnabled = $.dnsServiceEnabled;
        this.httpGatewayPort = $.httpGatewayPort;
        this.lbRules = $.lbRules;
        this.location = $.location;
        this.name = $.name;
        this.nodeTypes = $.nodeTypes;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.upgradeWave = $.upgradeWave;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterArgs $;

        public Builder() {
            $ = new ManagedClusterArgs();
        }

        public Builder(ManagedClusterArgs defaults) {
            $ = new ManagedClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<ManagedClusterAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authentication(ManagedClusterAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param backupServiceEnabled If true, backup service is enabled.
         * 
         * @return builder
         * 
         */
        public Builder backupServiceEnabled(@Nullable Output<Boolean> backupServiceEnabled) {
            $.backupServiceEnabled = backupServiceEnabled;
            return this;
        }

        /**
         * @param backupServiceEnabled If true, backup service is enabled.
         * 
         * @return builder
         * 
         */
        public Builder backupServiceEnabled(Boolean backupServiceEnabled) {
            return backupServiceEnabled(Output.of(backupServiceEnabled));
        }

        /**
         * @param clientConnectionPort Port to use when connecting to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clientConnectionPort(Output<Integer> clientConnectionPort) {
            $.clientConnectionPort = clientConnectionPort;
            return this;
        }

        /**
         * @param clientConnectionPort Port to use when connecting to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clientConnectionPort(Integer clientConnectionPort) {
            return clientConnectionPort(Output.of(clientConnectionPort));
        }

        /**
         * @param customFabricSettings One or more `custom_fabric_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customFabricSettings(@Nullable Output<List<ManagedClusterCustomFabricSettingArgs>> customFabricSettings) {
            $.customFabricSettings = customFabricSettings;
            return this;
        }

        /**
         * @param customFabricSettings One or more `custom_fabric_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customFabricSettings(List<ManagedClusterCustomFabricSettingArgs> customFabricSettings) {
            return customFabricSettings(Output.of(customFabricSettings));
        }

        /**
         * @param customFabricSettings One or more `custom_fabric_setting` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customFabricSettings(ManagedClusterCustomFabricSettingArgs... customFabricSettings) {
            return customFabricSettings(List.of(customFabricSettings));
        }

        /**
         * @param dnsName Hostname for the cluster. If unset the cluster&#39;s name will be used..
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName Hostname for the cluster. If unset the cluster&#39;s name will be used..
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param dnsServiceEnabled If true, DNS service is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dnsServiceEnabled(@Nullable Output<Boolean> dnsServiceEnabled) {
            $.dnsServiceEnabled = dnsServiceEnabled;
            return this;
        }

        /**
         * @param dnsServiceEnabled If true, DNS service is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dnsServiceEnabled(Boolean dnsServiceEnabled) {
            return dnsServiceEnabled(Output.of(dnsServiceEnabled));
        }

        /**
         * @param httpGatewayPort Port that should be used by the Service Fabric Explorer to visualize applications and cluster status.
         * 
         * @return builder
         * 
         */
        public Builder httpGatewayPort(Output<Integer> httpGatewayPort) {
            $.httpGatewayPort = httpGatewayPort;
            return this;
        }

        /**
         * @param httpGatewayPort Port that should be used by the Service Fabric Explorer to visualize applications and cluster status.
         * 
         * @return builder
         * 
         */
        public Builder httpGatewayPort(Integer httpGatewayPort) {
            return httpGatewayPort(Output.of(httpGatewayPort));
        }

        /**
         * @param lbRules One or more `lb_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder lbRules(Output<List<ManagedClusterLbRuleArgs>> lbRules) {
            $.lbRules = lbRules;
            return this;
        }

        /**
         * @param lbRules One or more `lb_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder lbRules(List<ManagedClusterLbRuleArgs> lbRules) {
            return lbRules(Output.of(lbRules));
        }

        /**
         * @param lbRules One or more `lb_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder lbRules(ManagedClusterLbRuleArgs... lbRules) {
            return lbRules(List.of(lbRules));
        }

        /**
         * @param location The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Resource Group should exist. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Resource Group. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(@Nullable Output<List<ManagedClusterNodeTypeArgs>> nodeTypes) {
            $.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(List<ManagedClusterNodeTypeArgs> nodeTypes) {
            return nodeTypes(Output.of(nodeTypes));
        }

        /**
         * @param nodeTypes One or more `node_type` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypes(ManagedClusterNodeTypeArgs... nodeTypes) {
            return nodeTypes(List.of(nodeTypes));
        }

        /**
         * @param password Administrator password for the VMs that will be created as part of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Administrator password for the VMs that will be created as part of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Resource Group should exist. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Resource Group should exist. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku SKU for this cluster. Changing this forces a new resource to be created. Default is `Basic`, allowed values are either `Basic` or `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku SKU for this cluster. Changing this forces a new resource to be created. Default is `Basic`, allowed values are either `Basic` or `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param subnetId The resource ID of the Subnet. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The resource ID of the Subnet. Changing this forces a new Resource Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param upgradeWave Upgrade wave for the fabric runtime. Default is `Wave0`, allowed value must be one of `Wave0`, `Wave1`, or `Wave2`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeWave(@Nullable Output<String> upgradeWave) {
            $.upgradeWave = upgradeWave;
            return this;
        }

        /**
         * @param upgradeWave Upgrade wave for the fabric runtime. Default is `Wave0`, allowed value must be one of `Wave0`, `Wave1`, or `Wave2`.
         * 
         * @return builder
         * 
         */
        public Builder upgradeWave(String upgradeWave) {
            return upgradeWave(Output.of(upgradeWave));
        }

        /**
         * @param username Administrator password for the VMs that will be created as part of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Administrator password for the VMs that will be created as part of this cluster.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ManagedClusterArgs build() {
            if ($.clientConnectionPort == null) {
                throw new MissingRequiredPropertyException("ManagedClusterArgs", "clientConnectionPort");
            }
            if ($.httpGatewayPort == null) {
                throw new MissingRequiredPropertyException("ManagedClusterArgs", "httpGatewayPort");
            }
            if ($.lbRules == null) {
                throw new MissingRequiredPropertyException("ManagedClusterArgs", "lbRules");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ManagedClusterArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
