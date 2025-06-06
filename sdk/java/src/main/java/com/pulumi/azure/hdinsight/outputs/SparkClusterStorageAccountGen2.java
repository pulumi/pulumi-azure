// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkClusterStorageAccountGen2 {
    /**
     * @return The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
     * 
     */
    private String filesystemId;
    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** One of the `storage_account` or `storage_account_gen2` blocks must be marked as the default.
     * 
     */
    private Boolean isDefault;
    /**
     * @return The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This can be obtained from the `id` of the `azure.storage.Container` resource.
     * 
     */
    private String managedIdentityResourceId;
    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    private String storageResourceId;

    private SparkClusterStorageAccountGen2() {}
    /**
     * @return The ID of the Gen2 Filesystem. Changing this forces a new resource to be created.
     * 
     */
    public String filesystemId() {
        return this.filesystemId;
    }
    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** One of the `storage_account` or `storage_account_gen2` blocks must be marked as the default.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return The ID of Managed Identity to use for accessing the Gen2 filesystem. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This can be obtained from the `id` of the `azure.storage.Container` resource.
     * 
     */
    public String managedIdentityResourceId() {
        return this.managedIdentityResourceId;
    }
    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public String storageResourceId() {
        return this.storageResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterStorageAccountGen2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filesystemId;
        private Boolean isDefault;
        private String managedIdentityResourceId;
        private String storageResourceId;
        public Builder() {}
        public Builder(SparkClusterStorageAccountGen2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesystemId = defaults.filesystemId;
    	      this.isDefault = defaults.isDefault;
    	      this.managedIdentityResourceId = defaults.managedIdentityResourceId;
    	      this.storageResourceId = defaults.storageResourceId;
        }

        @CustomType.Setter
        public Builder filesystemId(String filesystemId) {
            if (filesystemId == null) {
              throw new MissingRequiredPropertyException("SparkClusterStorageAccountGen2", "filesystemId");
            }
            this.filesystemId = filesystemId;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            if (isDefault == null) {
              throw new MissingRequiredPropertyException("SparkClusterStorageAccountGen2", "isDefault");
            }
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder managedIdentityResourceId(String managedIdentityResourceId) {
            if (managedIdentityResourceId == null) {
              throw new MissingRequiredPropertyException("SparkClusterStorageAccountGen2", "managedIdentityResourceId");
            }
            this.managedIdentityResourceId = managedIdentityResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder storageResourceId(String storageResourceId) {
            if (storageResourceId == null) {
              throw new MissingRequiredPropertyException("SparkClusterStorageAccountGen2", "storageResourceId");
            }
            this.storageResourceId = storageResourceId;
            return this;
        }
        public SparkClusterStorageAccountGen2 build() {
            final var _resultValue = new SparkClusterStorageAccountGen2();
            _resultValue.filesystemId = filesystemId;
            _resultValue.isDefault = isDefault;
            _resultValue.managedIdentityResourceId = managedIdentityResourceId;
            _resultValue.storageResourceId = storageResourceId;
            return _resultValue;
        }
    }
}
