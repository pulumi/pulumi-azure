// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.avs.inputs;

import com.pulumi.azure.avs.inputs.PrivateCloudCircuitArgs;
import com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateCloudState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateCloudState Empty = new PrivateCloudState();

    /**
     * A `circuit` block as defined below.
     * 
     */
    @Import(name="circuits")
    private @Nullable Output<List<PrivateCloudCircuitArgs>> circuits;

    /**
     * @return A `circuit` block as defined below.
     * 
     */
    public Optional<Output<List<PrivateCloudCircuitArgs>>> circuits() {
        return Optional.ofNullable(this.circuits);
    }

    /**
     * The endpoint for the HCX Cloud Manager.
     * 
     */
    @Import(name="hcxCloudManagerEndpoint")
    private @Nullable Output<String> hcxCloudManagerEndpoint;

    /**
     * @return The endpoint for the HCX Cloud Manager.
     * 
     */
    public Optional<Output<String>> hcxCloudManagerEndpoint() {
        return Optional.ofNullable(this.hcxCloudManagerEndpoint);
    }

    /**
     * Is the Private Cluster connected to the internet? This field can not updated with `management_cluster.0.size` together.
     * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
     * 
     */
    @Import(name="internetConnectionEnabled")
    private @Nullable Output<Boolean> internetConnectionEnabled;

    /**
     * @return Is the Private Cluster connected to the internet? This field can not updated with `management_cluster.0.size` together.
     * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
     * 
     */
    public Optional<Output<Boolean>> internetConnectionEnabled() {
        return Optional.ofNullable(this.internetConnectionEnabled);
    }

    /**
     * The Azure Region where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `management_cluster` block as defined below.
     * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
     * 
     */
    @Import(name="managementCluster")
    private @Nullable Output<PrivateCloudManagementClusterArgs> managementCluster;

    /**
     * @return A `management_cluster` block as defined below.
     * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
     * 
     */
    public Optional<Output<PrivateCloudManagementClusterArgs>> managementCluster() {
        return Optional.ofNullable(this.managementCluster);
    }

    /**
     * The network used to access vCenter Server and NSX-T Manager.
     * 
     */
    @Import(name="managementSubnetCidr")
    private @Nullable Output<String> managementSubnetCidr;

    /**
     * @return The network used to access vCenter Server and NSX-T Manager.
     * 
     */
    public Optional<Output<String>> managementSubnetCidr() {
        return Optional.ofNullable(this.managementSubnetCidr);
    }

    /**
     * The name which should be used for this VMware Private Cloud. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this VMware Private Cloud. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The subnet which should be unique across virtual network in your subscription as well as on-premise. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="networkSubnetCidr")
    private @Nullable Output<String> networkSubnetCidr;

    /**
     * @return The subnet which should be unique across virtual network in your subscription as well as on-premise. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> networkSubnetCidr() {
        return Optional.ofNullable(this.networkSubnetCidr);
    }

    /**
     * The thumbprint of the NSX-T Manager SSL certificate.
     * 
     */
    @Import(name="nsxtCertificateThumbprint")
    private @Nullable Output<String> nsxtCertificateThumbprint;

    /**
     * @return The thumbprint of the NSX-T Manager SSL certificate.
     * 
     */
    public Optional<Output<String>> nsxtCertificateThumbprint() {
        return Optional.ofNullable(this.nsxtCertificateThumbprint);
    }

    /**
     * The endpoint for the NSX-T Data Center manager.
     * 
     */
    @Import(name="nsxtManagerEndpoint")
    private @Nullable Output<String> nsxtManagerEndpoint;

    /**
     * @return The endpoint for the NSX-T Data Center manager.
     * 
     */
    public Optional<Output<String>> nsxtManagerEndpoint() {
        return Optional.ofNullable(this.nsxtManagerEndpoint);
    }

    /**
     * The password of the NSX-T Manager. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="nsxtPassword")
    private @Nullable Output<String> nsxtPassword;

    /**
     * @return The password of the NSX-T Manager. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> nsxtPassword() {
        return Optional.ofNullable(this.nsxtPassword);
    }

    /**
     * The network which is used for virtual machine cold migration, cloning, and snapshot migration.
     * 
     */
    @Import(name="provisioningSubnetCidr")
    private @Nullable Output<String> provisioningSubnetCidr;

    /**
     * @return The network which is used for virtual machine cold migration, cloning, and snapshot migration.
     * 
     */
    public Optional<Output<String>> provisioningSubnetCidr() {
        return Optional.ofNullable(this.provisioningSubnetCidr);
    }

    /**
     * The name of the Resource Group where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Name of the SKU used for this Private Cloud. Possible values are `av20`, `av36` and `av36t`. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The Name of the SKU used for this Private Cloud. Possible values are `av20`, `av36` and `av36t`. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * A mapping of tags which should be assigned to the VMware Private Cloud.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the VMware Private Cloud.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The thumbprint of the vCenter Server SSL certificate.
     * 
     */
    @Import(name="vcenterCertificateThumbprint")
    private @Nullable Output<String> vcenterCertificateThumbprint;

    /**
     * @return The thumbprint of the vCenter Server SSL certificate.
     * 
     */
    public Optional<Output<String>> vcenterCertificateThumbprint() {
        return Optional.ofNullable(this.vcenterCertificateThumbprint);
    }

    /**
     * The password of the vCenter admin. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    @Import(name="vcenterPassword")
    private @Nullable Output<String> vcenterPassword;

    /**
     * @return The password of the vCenter admin. Changing this forces a new VMware Private Cloud to be created.
     * 
     */
    public Optional<Output<String>> vcenterPassword() {
        return Optional.ofNullable(this.vcenterPassword);
    }

    /**
     * The endpoint for Virtual Center Server Appliance.
     * 
     */
    @Import(name="vcsaEndpoint")
    private @Nullable Output<String> vcsaEndpoint;

    /**
     * @return The endpoint for Virtual Center Server Appliance.
     * 
     */
    public Optional<Output<String>> vcsaEndpoint() {
        return Optional.ofNullable(this.vcsaEndpoint);
    }

    /**
     * The network which is used for live migration of virtual machines.
     * 
     */
    @Import(name="vmotionSubnetCidr")
    private @Nullable Output<String> vmotionSubnetCidr;

    /**
     * @return The network which is used for live migration of virtual machines.
     * 
     */
    public Optional<Output<String>> vmotionSubnetCidr() {
        return Optional.ofNullable(this.vmotionSubnetCidr);
    }

    private PrivateCloudState() {}

    private PrivateCloudState(PrivateCloudState $) {
        this.circuits = $.circuits;
        this.hcxCloudManagerEndpoint = $.hcxCloudManagerEndpoint;
        this.internetConnectionEnabled = $.internetConnectionEnabled;
        this.location = $.location;
        this.managementCluster = $.managementCluster;
        this.managementSubnetCidr = $.managementSubnetCidr;
        this.name = $.name;
        this.networkSubnetCidr = $.networkSubnetCidr;
        this.nsxtCertificateThumbprint = $.nsxtCertificateThumbprint;
        this.nsxtManagerEndpoint = $.nsxtManagerEndpoint;
        this.nsxtPassword = $.nsxtPassword;
        this.provisioningSubnetCidr = $.provisioningSubnetCidr;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.tags = $.tags;
        this.vcenterCertificateThumbprint = $.vcenterCertificateThumbprint;
        this.vcenterPassword = $.vcenterPassword;
        this.vcsaEndpoint = $.vcsaEndpoint;
        this.vmotionSubnetCidr = $.vmotionSubnetCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateCloudState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateCloudState $;

        public Builder() {
            $ = new PrivateCloudState();
        }

        public Builder(PrivateCloudState defaults) {
            $ = new PrivateCloudState(Objects.requireNonNull(defaults));
        }

        /**
         * @param circuits A `circuit` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder circuits(@Nullable Output<List<PrivateCloudCircuitArgs>> circuits) {
            $.circuits = circuits;
            return this;
        }

        /**
         * @param circuits A `circuit` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder circuits(List<PrivateCloudCircuitArgs> circuits) {
            return circuits(Output.of(circuits));
        }

        /**
         * @param circuits A `circuit` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder circuits(PrivateCloudCircuitArgs... circuits) {
            return circuits(List.of(circuits));
        }

        /**
         * @param hcxCloudManagerEndpoint The endpoint for the HCX Cloud Manager.
         * 
         * @return builder
         * 
         */
        public Builder hcxCloudManagerEndpoint(@Nullable Output<String> hcxCloudManagerEndpoint) {
            $.hcxCloudManagerEndpoint = hcxCloudManagerEndpoint;
            return this;
        }

        /**
         * @param hcxCloudManagerEndpoint The endpoint for the HCX Cloud Manager.
         * 
         * @return builder
         * 
         */
        public Builder hcxCloudManagerEndpoint(String hcxCloudManagerEndpoint) {
            return hcxCloudManagerEndpoint(Output.of(hcxCloudManagerEndpoint));
        }

        /**
         * @param internetConnectionEnabled Is the Private Cluster connected to the internet? This field can not updated with `management_cluster.0.size` together.
         * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
         * 
         * @return builder
         * 
         */
        public Builder internetConnectionEnabled(@Nullable Output<Boolean> internetConnectionEnabled) {
            $.internetConnectionEnabled = internetConnectionEnabled;
            return this;
        }

        /**
         * @param internetConnectionEnabled Is the Private Cluster connected to the internet? This field can not updated with `management_cluster.0.size` together.
         * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
         * 
         * @return builder
         * 
         */
        public Builder internetConnectionEnabled(Boolean internetConnectionEnabled) {
            return internetConnectionEnabled(Output.of(internetConnectionEnabled));
        }

        /**
         * @param location The Azure Region where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementCluster A `management_cluster` block as defined below.
         * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
         * 
         * @return builder
         * 
         */
        public Builder managementCluster(@Nullable Output<PrivateCloudManagementClusterArgs> managementCluster) {
            $.managementCluster = managementCluster;
            return this;
        }

        /**
         * @param managementCluster A `management_cluster` block as defined below.
         * &gt; **NOTE :** `internet_connection_enabled` and `management_cluster.0.size` cannot be updated at the same time.
         * 
         * @return builder
         * 
         */
        public Builder managementCluster(PrivateCloudManagementClusterArgs managementCluster) {
            return managementCluster(Output.of(managementCluster));
        }

        /**
         * @param managementSubnetCidr The network used to access vCenter Server and NSX-T Manager.
         * 
         * @return builder
         * 
         */
        public Builder managementSubnetCidr(@Nullable Output<String> managementSubnetCidr) {
            $.managementSubnetCidr = managementSubnetCidr;
            return this;
        }

        /**
         * @param managementSubnetCidr The network used to access vCenter Server and NSX-T Manager.
         * 
         * @return builder
         * 
         */
        public Builder managementSubnetCidr(String managementSubnetCidr) {
            return managementSubnetCidr(Output.of(managementSubnetCidr));
        }

        /**
         * @param name The name which should be used for this VMware Private Cloud. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this VMware Private Cloud. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkSubnetCidr The subnet which should be unique across virtual network in your subscription as well as on-premise. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSubnetCidr(@Nullable Output<String> networkSubnetCidr) {
            $.networkSubnetCidr = networkSubnetCidr;
            return this;
        }

        /**
         * @param networkSubnetCidr The subnet which should be unique across virtual network in your subscription as well as on-premise. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSubnetCidr(String networkSubnetCidr) {
            return networkSubnetCidr(Output.of(networkSubnetCidr));
        }

        /**
         * @param nsxtCertificateThumbprint The thumbprint of the NSX-T Manager SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder nsxtCertificateThumbprint(@Nullable Output<String> nsxtCertificateThumbprint) {
            $.nsxtCertificateThumbprint = nsxtCertificateThumbprint;
            return this;
        }

        /**
         * @param nsxtCertificateThumbprint The thumbprint of the NSX-T Manager SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder nsxtCertificateThumbprint(String nsxtCertificateThumbprint) {
            return nsxtCertificateThumbprint(Output.of(nsxtCertificateThumbprint));
        }

        /**
         * @param nsxtManagerEndpoint The endpoint for the NSX-T Data Center manager.
         * 
         * @return builder
         * 
         */
        public Builder nsxtManagerEndpoint(@Nullable Output<String> nsxtManagerEndpoint) {
            $.nsxtManagerEndpoint = nsxtManagerEndpoint;
            return this;
        }

        /**
         * @param nsxtManagerEndpoint The endpoint for the NSX-T Data Center manager.
         * 
         * @return builder
         * 
         */
        public Builder nsxtManagerEndpoint(String nsxtManagerEndpoint) {
            return nsxtManagerEndpoint(Output.of(nsxtManagerEndpoint));
        }

        /**
         * @param nsxtPassword The password of the NSX-T Manager. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder nsxtPassword(@Nullable Output<String> nsxtPassword) {
            $.nsxtPassword = nsxtPassword;
            return this;
        }

        /**
         * @param nsxtPassword The password of the NSX-T Manager. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder nsxtPassword(String nsxtPassword) {
            return nsxtPassword(Output.of(nsxtPassword));
        }

        /**
         * @param provisioningSubnetCidr The network which is used for virtual machine cold migration, cloning, and snapshot migration.
         * 
         * @return builder
         * 
         */
        public Builder provisioningSubnetCidr(@Nullable Output<String> provisioningSubnetCidr) {
            $.provisioningSubnetCidr = provisioningSubnetCidr;
            return this;
        }

        /**
         * @param provisioningSubnetCidr The network which is used for virtual machine cold migration, cloning, and snapshot migration.
         * 
         * @return builder
         * 
         */
        public Builder provisioningSubnetCidr(String provisioningSubnetCidr) {
            return provisioningSubnetCidr(Output.of(provisioningSubnetCidr));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the VMware Private Cloud should exist. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The Name of the SKU used for this Private Cloud. Possible values are `av20`, `av36` and `av36t`. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The Name of the SKU used for this Private Cloud. Possible values are `av20`, `av36` and `av36t`. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the VMware Private Cloud.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the VMware Private Cloud.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vcenterCertificateThumbprint The thumbprint of the vCenter Server SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder vcenterCertificateThumbprint(@Nullable Output<String> vcenterCertificateThumbprint) {
            $.vcenterCertificateThumbprint = vcenterCertificateThumbprint;
            return this;
        }

        /**
         * @param vcenterCertificateThumbprint The thumbprint of the vCenter Server SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder vcenterCertificateThumbprint(String vcenterCertificateThumbprint) {
            return vcenterCertificateThumbprint(Output.of(vcenterCertificateThumbprint));
        }

        /**
         * @param vcenterPassword The password of the vCenter admin. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder vcenterPassword(@Nullable Output<String> vcenterPassword) {
            $.vcenterPassword = vcenterPassword;
            return this;
        }

        /**
         * @param vcenterPassword The password of the vCenter admin. Changing this forces a new VMware Private Cloud to be created.
         * 
         * @return builder
         * 
         */
        public Builder vcenterPassword(String vcenterPassword) {
            return vcenterPassword(Output.of(vcenterPassword));
        }

        /**
         * @param vcsaEndpoint The endpoint for Virtual Center Server Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vcsaEndpoint(@Nullable Output<String> vcsaEndpoint) {
            $.vcsaEndpoint = vcsaEndpoint;
            return this;
        }

        /**
         * @param vcsaEndpoint The endpoint for Virtual Center Server Appliance.
         * 
         * @return builder
         * 
         */
        public Builder vcsaEndpoint(String vcsaEndpoint) {
            return vcsaEndpoint(Output.of(vcsaEndpoint));
        }

        /**
         * @param vmotionSubnetCidr The network which is used for live migration of virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmotionSubnetCidr(@Nullable Output<String> vmotionSubnetCidr) {
            $.vmotionSubnetCidr = vmotionSubnetCidr;
            return this;
        }

        /**
         * @param vmotionSubnetCidr The network which is used for live migration of virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmotionSubnetCidr(String vmotionSubnetCidr) {
            return vmotionSubnetCidr(Output.of(vmotionSubnetCidr));
        }

        public PrivateCloudState build() {
            return $;
        }
    }

}