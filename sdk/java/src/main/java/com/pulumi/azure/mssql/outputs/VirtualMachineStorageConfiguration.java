// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.azure.mssql.outputs.VirtualMachineStorageConfigurationDataSettings;
import com.pulumi.azure.mssql.outputs.VirtualMachineStorageConfigurationLogSettings;
import com.pulumi.azure.mssql.outputs.VirtualMachineStorageConfigurationTempDbSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineStorageConfiguration {
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    private @Nullable VirtualMachineStorageConfigurationDataSettings dataSettings;
    /**
     * @return The type of disk configuration to apply to the SQL Server. Valid values include `NEW`, `EXTEND`, or `ADD`.
     * 
     */
    private String diskType;
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    private @Nullable VirtualMachineStorageConfigurationLogSettings logSettings;
    /**
     * @return The type of storage workload. Valid values include `GENERAL`, `OLTP`, or `DW`.
     * 
     */
    private String storageWorkloadType;
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    private @Nullable VirtualMachineStorageConfigurationTempDbSettings tempDbSettings;

    private VirtualMachineStorageConfiguration() {}
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    public Optional<VirtualMachineStorageConfigurationDataSettings> dataSettings() {
        return Optional.ofNullable(this.dataSettings);
    }
    /**
     * @return The type of disk configuration to apply to the SQL Server. Valid values include `NEW`, `EXTEND`, or `ADD`.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    public Optional<VirtualMachineStorageConfigurationLogSettings> logSettings() {
        return Optional.ofNullable(this.logSettings);
    }
    /**
     * @return The type of storage workload. Valid values include `GENERAL`, `OLTP`, or `DW`.
     * 
     */
    public String storageWorkloadType() {
        return this.storageWorkloadType;
    }
    /**
     * @return An `storage_settings` as defined below.
     * 
     */
    public Optional<VirtualMachineStorageConfigurationTempDbSettings> tempDbSettings() {
        return Optional.ofNullable(this.tempDbSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineStorageConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualMachineStorageConfigurationDataSettings dataSettings;
        private String diskType;
        private @Nullable VirtualMachineStorageConfigurationLogSettings logSettings;
        private String storageWorkloadType;
        private @Nullable VirtualMachineStorageConfigurationTempDbSettings tempDbSettings;
        public Builder() {}
        public Builder(VirtualMachineStorageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSettings = defaults.dataSettings;
    	      this.diskType = defaults.diskType;
    	      this.logSettings = defaults.logSettings;
    	      this.storageWorkloadType = defaults.storageWorkloadType;
    	      this.tempDbSettings = defaults.tempDbSettings;
        }

        @CustomType.Setter
        public Builder dataSettings(@Nullable VirtualMachineStorageConfigurationDataSettings dataSettings) {
            this.dataSettings = dataSettings;
            return this;
        }
        @CustomType.Setter
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        @CustomType.Setter
        public Builder logSettings(@Nullable VirtualMachineStorageConfigurationLogSettings logSettings) {
            this.logSettings = logSettings;
            return this;
        }
        @CustomType.Setter
        public Builder storageWorkloadType(String storageWorkloadType) {
            this.storageWorkloadType = Objects.requireNonNull(storageWorkloadType);
            return this;
        }
        @CustomType.Setter
        public Builder tempDbSettings(@Nullable VirtualMachineStorageConfigurationTempDbSettings tempDbSettings) {
            this.tempDbSettings = tempDbSettings;
            return this;
        }
        public VirtualMachineStorageConfiguration build() {
            final var o = new VirtualMachineStorageConfiguration();
            o.dataSettings = dataSettings;
            o.diskType = diskType;
            o.logSettings = logSettings;
            o.storageWorkloadType = storageWorkloadType;
            o.tempDbSettings = tempDbSettings;
            return o;
        }
    }
}