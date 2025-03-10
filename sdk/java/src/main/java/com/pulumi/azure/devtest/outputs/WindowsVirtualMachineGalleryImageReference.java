// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WindowsVirtualMachineGalleryImageReference {
    /**
     * @return The Offer of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String offer;
    /**
     * @return The Publisher of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String publisher;
    /**
     * @return The SKU of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String sku;
    /**
     * @return The Version of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    private String version;

    private WindowsVirtualMachineGalleryImageReference() {}
    /**
     * @return The Offer of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String offer() {
        return this.offer;
    }
    /**
     * @return The Publisher of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String publisher() {
        return this.publisher;
    }
    /**
     * @return The SKU of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return The Version of the Gallery Image. Changing this forces a new resource to be created.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineGalleryImageReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;
        private String version;
        public Builder() {}
        public Builder(WindowsVirtualMachineGalleryImageReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder offer(String offer) {
            if (offer == null) {
              throw new MissingRequiredPropertyException("WindowsVirtualMachineGalleryImageReference", "offer");
            }
            this.offer = offer;
            return this;
        }
        @CustomType.Setter
        public Builder publisher(String publisher) {
            if (publisher == null) {
              throw new MissingRequiredPropertyException("WindowsVirtualMachineGalleryImageReference", "publisher");
            }
            this.publisher = publisher;
            return this;
        }
        @CustomType.Setter
        public Builder sku(String sku) {
            if (sku == null) {
              throw new MissingRequiredPropertyException("WindowsVirtualMachineGalleryImageReference", "sku");
            }
            this.sku = sku;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("WindowsVirtualMachineGalleryImageReference", "version");
            }
            this.version = version;
            return this;
        }
        public WindowsVirtualMachineGalleryImageReference build() {
            final var _resultValue = new WindowsVirtualMachineGalleryImageReference();
            _resultValue.offer = offer;
            _resultValue.publisher = publisher;
            _resultValue.sku = sku;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
