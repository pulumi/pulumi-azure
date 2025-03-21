// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DicomServiceStorage {
    /**
     * @return The filesystem name of connected storage account. Changing this forces a new Healthcare DICOM Service to be created.
     * 
     */
    private String fileSystemName;
    /**
     * @return The resource ID of connected storage account. Changing this forces a new Healthcare DICOM Service to be created.
     * 
     * &gt; **Note:** The `is_hns_enabled` needs to be set to `true` for the storage account to be used with the Healthcare DICOM Service.
     * 
     */
    private String storageAccountId;

    private DicomServiceStorage() {}
    /**
     * @return The filesystem name of connected storage account. Changing this forces a new Healthcare DICOM Service to be created.
     * 
     */
    public String fileSystemName() {
        return this.fileSystemName;
    }
    /**
     * @return The resource ID of connected storage account. Changing this forces a new Healthcare DICOM Service to be created.
     * 
     * &gt; **Note:** The `is_hns_enabled` needs to be set to `true` for the storage account to be used with the Healthcare DICOM Service.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fileSystemName;
        private String storageAccountId;
        public Builder() {}
        public Builder(DicomServiceStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemName = defaults.fileSystemName;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder fileSystemName(String fileSystemName) {
            if (fileSystemName == null) {
              throw new MissingRequiredPropertyException("DicomServiceStorage", "fileSystemName");
            }
            this.fileSystemName = fileSystemName;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            if (storageAccountId == null) {
              throw new MissingRequiredPropertyException("DicomServiceStorage", "storageAccountId");
            }
            this.storageAccountId = storageAccountId;
            return this;
        }
        public DicomServiceStorage build() {
            final var _resultValue = new DicomServiceStorage();
            _resultValue.fileSystemName = fileSystemName;
            _resultValue.storageAccountId = storageAccountId;
            return _resultValue;
        }
    }
}
