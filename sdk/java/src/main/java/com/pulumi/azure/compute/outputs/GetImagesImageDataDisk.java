// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageDataDisk {
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
     * @return the logical unit number of the data disk.
     * 
     */
    private Integer lun;
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    private String managedDiskId;
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    private Integer sizeGb;

    private GetImagesImageDataDisk() {}
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
     * @return the logical unit number of the data disk.
     * 
     */
    public Integer lun() {
        return this.lun;
    }
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    public String managedDiskId() {
        return this.managedDiskId;
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

    public static Builder builder(GetImagesImageDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blobUri;
        private String caching;
        private Integer lun;
        private String managedDiskId;
        private Integer sizeGb;
        public Builder() {}
        public Builder(GetImagesImageDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.lun = defaults.lun;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.sizeGb = defaults.sizeGb;
        }

        @CustomType.Setter
        public Builder blobUri(String blobUri) {
            if (blobUri == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDataDisk", "blobUri");
            }
            this.blobUri = blobUri;
            return this;
        }
        @CustomType.Setter
        public Builder caching(String caching) {
            if (caching == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDataDisk", "caching");
            }
            this.caching = caching;
            return this;
        }
        @CustomType.Setter
        public Builder lun(Integer lun) {
            if (lun == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDataDisk", "lun");
            }
            this.lun = lun;
            return this;
        }
        @CustomType.Setter
        public Builder managedDiskId(String managedDiskId) {
            if (managedDiskId == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDataDisk", "managedDiskId");
            }
            this.managedDiskId = managedDiskId;
            return this;
        }
        @CustomType.Setter
        public Builder sizeGb(Integer sizeGb) {
            if (sizeGb == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDataDisk", "sizeGb");
            }
            this.sizeGb = sizeGb;
            return this;
        }
        public GetImagesImageDataDisk build() {
            final var _resultValue = new GetImagesImageDataDisk();
            _resultValue.blobUri = blobUri;
            _resultValue.caching = caching;
            _resultValue.lun = lun;
            _resultValue.managedDiskId = managedDiskId;
            _resultValue.sizeGb = sizeGb;
            return _resultValue;
        }
    }
}
