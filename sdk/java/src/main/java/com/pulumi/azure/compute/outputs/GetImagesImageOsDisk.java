// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageOsDisk {
    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    private String blobUri;
    /**
     * @return the caching mode for the Data Disk.
     * 
     */
    private String caching;
    /**
     * @return the ID of the Disk Encryption Set used to encrypt this image.
     * 
     */
    private String diskEncryptionSetId;
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    private String managedDiskId;
    /**
     * @return the State of the OS used in the Image.
     * 
     */
    private String osState;
    /**
     * @return the type of Operating System used on the OS Disk.
     * 
     */
    private String osType;
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    private Integer sizeGb;

    private GetImagesImageOsDisk() {}
    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    public String blobUri() {
        return this.blobUri;
    }
    /**
     * @return the caching mode for the Data Disk.
     * 
     */
    public String caching() {
        return this.caching;
    }
    /**
     * @return the ID of the Disk Encryption Set used to encrypt this image.
     * 
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    public String managedDiskId() {
        return this.managedDiskId;
    }
    /**
     * @return the State of the OS used in the Image.
     * 
     */
    public String osState() {
        return this.osState;
    }
    /**
     * @return the type of Operating System used on the OS Disk.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageOsDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blobUri;
        private String caching;
        private String diskEncryptionSetId;
        private String managedDiskId;
        private String osState;
        private String osType;
        private Integer sizeGb;
        public Builder() {}
        public Builder(GetImagesImageOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.sizeGb = defaults.sizeGb;
        }

        @CustomType.Setter
        public Builder blobUri(String blobUri) {
            if (blobUri == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "blobUri");
            }
            this.blobUri = blobUri;
            return this;
        }
        @CustomType.Setter
        public Builder caching(String caching) {
            if (caching == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "caching");
            }
            this.caching = caching;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            if (diskEncryptionSetId == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "diskEncryptionSetId");
            }
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        @CustomType.Setter
        public Builder managedDiskId(String managedDiskId) {
            if (managedDiskId == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "managedDiskId");
            }
            this.managedDiskId = managedDiskId;
            return this;
        }
        @CustomType.Setter
        public Builder osState(String osState) {
            if (osState == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "osState");
            }
            this.osState = osState;
            return this;
        }
        @CustomType.Setter
        public Builder osType(String osType) {
            if (osType == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "osType");
            }
            this.osType = osType;
            return this;
        }
        @CustomType.Setter
        public Builder sizeGb(Integer sizeGb) {
            if (sizeGb == null) {
              throw new MissingRequiredPropertyException("GetImagesImageOsDisk", "sizeGb");
            }
            this.sizeGb = sizeGb;
            return this;
        }
        public GetImagesImageOsDisk build() {
            final var _resultValue = new GetImagesImageOsDisk();
            _resultValue.blobUri = blobUri;
            _resultValue.caching = caching;
            _resultValue.diskEncryptionSetId = diskEncryptionSetId;
            _resultValue.managedDiskId = managedDiskId;
            _resultValue.osState = osState;
            _resultValue.osType = osType;
            _resultValue.sizeGb = sizeGb;
            return _resultValue;
        }
    }
}
