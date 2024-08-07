// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataCollectionRuleDestinationStorageBlobDirect {
    /**
     * @return The Storage Container name.
     * 
     */
    private String containerName;
    /**
     * @return Specifies the name of the Data Collection Rule.
     * 
     */
    private String name;
    /**
     * @return The resource ID of the Storage Account.
     * 
     */
    private String storageAccountId;

    private GetDataCollectionRuleDestinationStorageBlobDirect() {}
    /**
     * @return The Storage Container name.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return Specifies the name of the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource ID of the Storage Account.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleDestinationStorageBlobDirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerName;
        private String name;
        private String storageAccountId;
        public Builder() {}
        public Builder(GetDataCollectionRuleDestinationStorageBlobDirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.name = defaults.name;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            if (containerName == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDestinationStorageBlobDirect", "containerName");
            }
            this.containerName = containerName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDestinationStorageBlobDirect", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            if (storageAccountId == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDestinationStorageBlobDirect", "storageAccountId");
            }
            this.storageAccountId = storageAccountId;
            return this;
        }
        public GetDataCollectionRuleDestinationStorageBlobDirect build() {
            final var _resultValue = new GetDataCollectionRuleDestinationStorageBlobDirect();
            _resultValue.containerName = containerName;
            _resultValue.name = name;
            _resultValue.storageAccountId = storageAccountId;
            return _resultValue;
        }
    }
}
