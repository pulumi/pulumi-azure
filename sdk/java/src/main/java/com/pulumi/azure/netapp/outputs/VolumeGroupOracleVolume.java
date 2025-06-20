// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.netapp.outputs;

import com.pulumi.azure.netapp.outputs.VolumeGroupOracleVolumeDataProtectionReplication;
import com.pulumi.azure.netapp.outputs.VolumeGroupOracleVolumeDataProtectionSnapshotPolicy;
import com.pulumi.azure.netapp.outputs.VolumeGroupOracleVolumeExportPolicyRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeGroupOracleVolume {
    /**
     * @return The ID of the Capacity Pool. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String capacityPoolId;
    /**
     * @return A `data_protection_replication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private @Nullable VolumeGroupOracleVolumeDataProtectionReplication dataProtectionReplication;
    /**
     * @return A `data_protection_snapshot_policy` block as defined below.
     * 
     */
    private @Nullable VolumeGroupOracleVolumeDataProtectionSnapshotPolicy dataProtectionSnapshotPolicy;
    /**
     * @return The encryption key source, it can be `Microsoft.NetApp` for platform managed keys or `Microsoft.KeyVault` for customer-managed keys. This is required with `key_vault_private_endpoint_id`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String encryptionKeySource;
    /**
     * @return One or more `export_policy_rule` blocks as defined below.
     * 
     */
    private List<VolumeGroupOracleVolumeExportPolicyRule> exportPolicyRules;
    /**
     * @return The ID of the Application Volume Group.
     * 
     */
    private @Nullable String id;
    /**
     * @return The Private Endpoint ID for Key Vault, which is required when using customer-managed keys. This is required with `encryption_key_source`. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String keyVaultPrivateEndpointId;
    private @Nullable List<String> mountIpAddresses;
    /**
     * @return The name which should be used for this volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String name;
    /**
     * @return Indicates which network feature to use, accepted values are `Basic` or `Standard`, it defaults to `Basic` if not defined. This is a feature in public preview and for more information about it and how to register, please refer to [Configure network features for an Azure NetApp Files volume](https://docs.microsoft.com/en-us/azure/azure-netapp-files/configure-network-features). This is required if enabling customer managed keys encryption scenario.
     * 
     */
    private @Nullable String networkFeatures;
    /**
     * @return The target volume protocol expressed as a list. Changing this forces a new Application Volume Group to be created and data will be lost. Supported values for Application Volume Group include `NFSv3` or `NFSv4.1`.
     * 
     */
    private String protocols;
    /**
     * @return The ID of the proximity placement group (PPG). Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     * &gt; **Note:** For Oracle application, it is required to have PPG enabled so Azure NetApp Files can pin the volumes next to your compute resources, please check [Requirements and considerations for application volume group for Oracle](https://learn.microsoft.com/en-us/azure/azure-netapp-files/application-volume-group-oracle-considerations) for details and other requirements. Note that this cannot be used together with `zone`.
     * 
     */
    private @Nullable String proximityPlacementGroupId;
    /**
     * @return Volume security style. Possible values are `ntfs` and `unix`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String securityStyle;
    /**
     * @return Volume security style. Possible values are `Premium`, `Standard` and `Ultra`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String serviceLevel;
    /**
     * @return Specifies whether the .snapshot (NFS clients) path of a volume is visible. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private Boolean snapshotDirectoryVisible;
    /**
     * @return The maximum Storage Quota allowed for a file system in Gigabytes.
     * 
     */
    private Integer storageQuotaInGb;
    /**
     * @return The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String subnetId;
    /**
     * @return A mapping of tags which should be assigned to the Application Volume Group.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Throughput of this volume in Mibps.
     * 
     */
    private Double throughputInMibps;
    /**
     * @return A unique file path for the volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String volumePath;
    /**
     * @return Volume specification name. Possible values are `ora-data1` through `ora-data8`, `ora-log`, `ora-log-mirror`, `ora-backup` and `ora-binary`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    private String volumeSpecName;
    /**
     * @return Specifies the Availability Zone in which the Volume should be located. Possible values are `1`, `2` and `3`, depending on the Azure region. Changing this forces a new resource to be created. This feature is currently in preview, for more information on how to enable it, please refer to [Manage availability zone volume placement for Azure NetApp Files](https://learn.microsoft.com/en-us/azure/azure-netapp-files/manage-availability-zone-volume-placement). Note that this cannot be used together with `proximity_placement_group_id`.
     * 
     */
    private @Nullable String zone;

    private VolumeGroupOracleVolume() {}
    /**
     * @return The ID of the Capacity Pool. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String capacityPoolId() {
        return this.capacityPoolId;
    }
    /**
     * @return A `data_protection_replication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Optional<VolumeGroupOracleVolumeDataProtectionReplication> dataProtectionReplication() {
        return Optional.ofNullable(this.dataProtectionReplication);
    }
    /**
     * @return A `data_protection_snapshot_policy` block as defined below.
     * 
     */
    public Optional<VolumeGroupOracleVolumeDataProtectionSnapshotPolicy> dataProtectionSnapshotPolicy() {
        return Optional.ofNullable(this.dataProtectionSnapshotPolicy);
    }
    /**
     * @return The encryption key source, it can be `Microsoft.NetApp` for platform managed keys or `Microsoft.KeyVault` for customer-managed keys. This is required with `key_vault_private_endpoint_id`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> encryptionKeySource() {
        return Optional.ofNullable(this.encryptionKeySource);
    }
    /**
     * @return One or more `export_policy_rule` blocks as defined below.
     * 
     */
    public List<VolumeGroupOracleVolumeExportPolicyRule> exportPolicyRules() {
        return this.exportPolicyRules;
    }
    /**
     * @return The ID of the Application Volume Group.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Private Endpoint ID for Key Vault, which is required when using customer-managed keys. This is required with `encryption_key_source`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> keyVaultPrivateEndpointId() {
        return Optional.ofNullable(this.keyVaultPrivateEndpointId);
    }
    public List<String> mountIpAddresses() {
        return this.mountIpAddresses == null ? List.of() : this.mountIpAddresses;
    }
    /**
     * @return The name which should be used for this volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates which network feature to use, accepted values are `Basic` or `Standard`, it defaults to `Basic` if not defined. This is a feature in public preview and for more information about it and how to register, please refer to [Configure network features for an Azure NetApp Files volume](https://docs.microsoft.com/en-us/azure/azure-netapp-files/configure-network-features). This is required if enabling customer managed keys encryption scenario.
     * 
     */
    public Optional<String> networkFeatures() {
        return Optional.ofNullable(this.networkFeatures);
    }
    /**
     * @return The target volume protocol expressed as a list. Changing this forces a new Application Volume Group to be created and data will be lost. Supported values for Application Volume Group include `NFSv3` or `NFSv4.1`.
     * 
     */
    public String protocols() {
        return this.protocols;
    }
    /**
     * @return The ID of the proximity placement group (PPG). Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     * &gt; **Note:** For Oracle application, it is required to have PPG enabled so Azure NetApp Files can pin the volumes next to your compute resources, please check [Requirements and considerations for application volume group for Oracle](https://learn.microsoft.com/en-us/azure/azure-netapp-files/application-volume-group-oracle-considerations) for details and other requirements. Note that this cannot be used together with `zone`.
     * 
     */
    public Optional<String> proximityPlacementGroupId() {
        return Optional.ofNullable(this.proximityPlacementGroupId);
    }
    /**
     * @return Volume security style. Possible values are `ntfs` and `unix`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String securityStyle() {
        return this.securityStyle;
    }
    /**
     * @return Volume security style. Possible values are `Premium`, `Standard` and `Ultra`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String serviceLevel() {
        return this.serviceLevel;
    }
    /**
     * @return Specifies whether the .snapshot (NFS clients) path of a volume is visible. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public Boolean snapshotDirectoryVisible() {
        return this.snapshotDirectoryVisible;
    }
    /**
     * @return The maximum Storage Quota allowed for a file system in Gigabytes.
     * 
     */
    public Integer storageQuotaInGb() {
        return this.storageQuotaInGb;
    }
    /**
     * @return The ID of the Subnet the NetApp Volume resides in, which must have the `Microsoft.NetApp/volumes` delegation. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return A mapping of tags which should be assigned to the Application Volume Group.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Throughput of this volume in Mibps.
     * 
     */
    public Double throughputInMibps() {
        return this.throughputInMibps;
    }
    /**
     * @return A unique file path for the volume. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String volumePath() {
        return this.volumePath;
    }
    /**
     * @return Volume specification name. Possible values are `ora-data1` through `ora-data8`, `ora-log`, `ora-log-mirror`, `ora-backup` and `ora-binary`. Changing this forces a new Application Volume Group to be created and data will be lost.
     * 
     */
    public String volumeSpecName() {
        return this.volumeSpecName;
    }
    /**
     * @return Specifies the Availability Zone in which the Volume should be located. Possible values are `1`, `2` and `3`, depending on the Azure region. Changing this forces a new resource to be created. This feature is currently in preview, for more information on how to enable it, please refer to [Manage availability zone volume placement for Azure NetApp Files](https://learn.microsoft.com/en-us/azure/azure-netapp-files/manage-availability-zone-volume-placement). Note that this cannot be used together with `proximity_placement_group_id`.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeGroupOracleVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String capacityPoolId;
        private @Nullable VolumeGroupOracleVolumeDataProtectionReplication dataProtectionReplication;
        private @Nullable VolumeGroupOracleVolumeDataProtectionSnapshotPolicy dataProtectionSnapshotPolicy;
        private @Nullable String encryptionKeySource;
        private List<VolumeGroupOracleVolumeExportPolicyRule> exportPolicyRules;
        private @Nullable String id;
        private @Nullable String keyVaultPrivateEndpointId;
        private @Nullable List<String> mountIpAddresses;
        private String name;
        private @Nullable String networkFeatures;
        private String protocols;
        private @Nullable String proximityPlacementGroupId;
        private String securityStyle;
        private String serviceLevel;
        private Boolean snapshotDirectoryVisible;
        private Integer storageQuotaInGb;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private Double throughputInMibps;
        private String volumePath;
        private String volumeSpecName;
        private @Nullable String zone;
        public Builder() {}
        public Builder(VolumeGroupOracleVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityPoolId = defaults.capacityPoolId;
    	      this.dataProtectionReplication = defaults.dataProtectionReplication;
    	      this.dataProtectionSnapshotPolicy = defaults.dataProtectionSnapshotPolicy;
    	      this.encryptionKeySource = defaults.encryptionKeySource;
    	      this.exportPolicyRules = defaults.exportPolicyRules;
    	      this.id = defaults.id;
    	      this.keyVaultPrivateEndpointId = defaults.keyVaultPrivateEndpointId;
    	      this.mountIpAddresses = defaults.mountIpAddresses;
    	      this.name = defaults.name;
    	      this.networkFeatures = defaults.networkFeatures;
    	      this.protocols = defaults.protocols;
    	      this.proximityPlacementGroupId = defaults.proximityPlacementGroupId;
    	      this.securityStyle = defaults.securityStyle;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.snapshotDirectoryVisible = defaults.snapshotDirectoryVisible;
    	      this.storageQuotaInGb = defaults.storageQuotaInGb;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.throughputInMibps = defaults.throughputInMibps;
    	      this.volumePath = defaults.volumePath;
    	      this.volumeSpecName = defaults.volumeSpecName;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder capacityPoolId(String capacityPoolId) {
            if (capacityPoolId == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "capacityPoolId");
            }
            this.capacityPoolId = capacityPoolId;
            return this;
        }
        @CustomType.Setter
        public Builder dataProtectionReplication(@Nullable VolumeGroupOracleVolumeDataProtectionReplication dataProtectionReplication) {

            this.dataProtectionReplication = dataProtectionReplication;
            return this;
        }
        @CustomType.Setter
        public Builder dataProtectionSnapshotPolicy(@Nullable VolumeGroupOracleVolumeDataProtectionSnapshotPolicy dataProtectionSnapshotPolicy) {

            this.dataProtectionSnapshotPolicy = dataProtectionSnapshotPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKeySource(@Nullable String encryptionKeySource) {

            this.encryptionKeySource = encryptionKeySource;
            return this;
        }
        @CustomType.Setter
        public Builder exportPolicyRules(List<VolumeGroupOracleVolumeExportPolicyRule> exportPolicyRules) {
            if (exportPolicyRules == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "exportPolicyRules");
            }
            this.exportPolicyRules = exportPolicyRules;
            return this;
        }
        public Builder exportPolicyRules(VolumeGroupOracleVolumeExportPolicyRule... exportPolicyRules) {
            return exportPolicyRules(List.of(exportPolicyRules));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultPrivateEndpointId(@Nullable String keyVaultPrivateEndpointId) {

            this.keyVaultPrivateEndpointId = keyVaultPrivateEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder mountIpAddresses(@Nullable List<String> mountIpAddresses) {

            this.mountIpAddresses = mountIpAddresses;
            return this;
        }
        public Builder mountIpAddresses(String... mountIpAddresses) {
            return mountIpAddresses(List.of(mountIpAddresses));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkFeatures(@Nullable String networkFeatures) {

            this.networkFeatures = networkFeatures;
            return this;
        }
        @CustomType.Setter
        public Builder protocols(String protocols) {
            if (protocols == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "protocols");
            }
            this.protocols = protocols;
            return this;
        }
        @CustomType.Setter
        public Builder proximityPlacementGroupId(@Nullable String proximityPlacementGroupId) {

            this.proximityPlacementGroupId = proximityPlacementGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder securityStyle(String securityStyle) {
            if (securityStyle == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "securityStyle");
            }
            this.securityStyle = securityStyle;
            return this;
        }
        @CustomType.Setter
        public Builder serviceLevel(String serviceLevel) {
            if (serviceLevel == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "serviceLevel");
            }
            this.serviceLevel = serviceLevel;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
            if (snapshotDirectoryVisible == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "snapshotDirectoryVisible");
            }
            this.snapshotDirectoryVisible = snapshotDirectoryVisible;
            return this;
        }
        @CustomType.Setter
        public Builder storageQuotaInGb(Integer storageQuotaInGb) {
            if (storageQuotaInGb == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "storageQuotaInGb");
            }
            this.storageQuotaInGb = storageQuotaInGb;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            if (subnetId == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "subnetId");
            }
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder throughputInMibps(Double throughputInMibps) {
            if (throughputInMibps == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "throughputInMibps");
            }
            this.throughputInMibps = throughputInMibps;
            return this;
        }
        @CustomType.Setter
        public Builder volumePath(String volumePath) {
            if (volumePath == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "volumePath");
            }
            this.volumePath = volumePath;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSpecName(String volumeSpecName) {
            if (volumeSpecName == null) {
              throw new MissingRequiredPropertyException("VolumeGroupOracleVolume", "volumeSpecName");
            }
            this.volumeSpecName = volumeSpecName;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public VolumeGroupOracleVolume build() {
            final var _resultValue = new VolumeGroupOracleVolume();
            _resultValue.capacityPoolId = capacityPoolId;
            _resultValue.dataProtectionReplication = dataProtectionReplication;
            _resultValue.dataProtectionSnapshotPolicy = dataProtectionSnapshotPolicy;
            _resultValue.encryptionKeySource = encryptionKeySource;
            _resultValue.exportPolicyRules = exportPolicyRules;
            _resultValue.id = id;
            _resultValue.keyVaultPrivateEndpointId = keyVaultPrivateEndpointId;
            _resultValue.mountIpAddresses = mountIpAddresses;
            _resultValue.name = name;
            _resultValue.networkFeatures = networkFeatures;
            _resultValue.protocols = protocols;
            _resultValue.proximityPlacementGroupId = proximityPlacementGroupId;
            _resultValue.securityStyle = securityStyle;
            _resultValue.serviceLevel = serviceLevel;
            _resultValue.snapshotDirectoryVisible = snapshotDirectoryVisible;
            _resultValue.storageQuotaInGb = storageQuotaInGb;
            _resultValue.subnetId = subnetId;
            _resultValue.tags = tags;
            _resultValue.throughputInMibps = throughputInMibps;
            _resultValue.volumePath = volumePath;
            _resultValue.volumeSpecName = volumeSpecName;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
