// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SparkClusterStorageAccount {
    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    private Boolean isDefault;
    /**
     * @return The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    private String storageAccountKey;
    /**
     * @return The ID of the Storage Container. Changing this forces a new resource to be created.
     * 
     */
    private String storageContainerId;
    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String storageResourceId;

    private SparkClusterStorageAccount() {}
    /**
     * @return Is this the Default Storage Account for the HDInsight Hadoop Cluster? Changing this forces a new resource to be created.
     * 
     */
    public Boolean isDefault() {
        return this.isDefault;
    }
    /**
     * @return The Access Key which should be used to connect to the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }
    /**
     * @return The ID of the Storage Container. Changing this forces a new resource to be created.
     * 
     */
    public String storageContainerId() {
        return this.storageContainerId;
    }
    /**
     * @return The ID of the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> storageResourceId() {
        return Optional.ofNullable(this.storageResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterStorageAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean isDefault;
        private String storageAccountKey;
        private String storageContainerId;
        private @Nullable String storageResourceId;
        public Builder() {}
        public Builder(SparkClusterStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isDefault = defaults.isDefault;
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageContainerId = defaults.storageContainerId;
    	      this.storageResourceId = defaults.storageResourceId;
        }

        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountKey(String storageAccountKey) {
            this.storageAccountKey = Objects.requireNonNull(storageAccountKey);
            return this;
        }
        @CustomType.Setter
        public Builder storageContainerId(String storageContainerId) {
            this.storageContainerId = Objects.requireNonNull(storageContainerId);
            return this;
        }
        @CustomType.Setter
        public Builder storageResourceId(@Nullable String storageResourceId) {
            this.storageResourceId = storageResourceId;
            return this;
        }
        public SparkClusterStorageAccount build() {
            final var o = new SparkClusterStorageAccount();
            o.isDefault = isDefault;
            o.storageAccountKey = storageAccountKey;
            o.storageContainerId = storageContainerId;
            o.storageResourceId = storageResourceId;
            return o;
        }
    }
}