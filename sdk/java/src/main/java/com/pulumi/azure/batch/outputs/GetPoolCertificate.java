// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolCertificate {
    /**
     * @return The fully qualified ID of the certificate installed on the pool.
     * 
     */
    private String id;
    /**
     * @return The location of the certificate store on the compute node into which the certificate is installed, either `CurrentUser` or `LocalMachine`.
     * 
     */
    private String storeLocation;
    /**
     * @return The name of the certificate store on the compute node into which the certificate is installed.
     * 
     */
    private String storeName;
    /**
     * @return Which user accounts on the compute node have access to the private data of the certificate.
     * 
     */
    private List<String> visibilities;

    private GetPoolCertificate() {}
    /**
     * @return The fully qualified ID of the certificate installed on the pool.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the certificate store on the compute node into which the certificate is installed, either `CurrentUser` or `LocalMachine`.
     * 
     */
    public String storeLocation() {
        return this.storeLocation;
    }
    /**
     * @return The name of the certificate store on the compute node into which the certificate is installed.
     * 
     */
    public String storeName() {
        return this.storeName;
    }
    /**
     * @return Which user accounts on the compute node have access to the private data of the certificate.
     * 
     */
    public List<String> visibilities() {
        return this.visibilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String storeLocation;
        private String storeName;
        private List<String> visibilities;
        public Builder() {}
        public Builder(GetPoolCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storeLocation = defaults.storeLocation;
    	      this.storeName = defaults.storeName;
    	      this.visibilities = defaults.visibilities;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPoolCertificate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder storeLocation(String storeLocation) {
            if (storeLocation == null) {
              throw new MissingRequiredPropertyException("GetPoolCertificate", "storeLocation");
            }
            this.storeLocation = storeLocation;
            return this;
        }
        @CustomType.Setter
        public Builder storeName(String storeName) {
            if (storeName == null) {
              throw new MissingRequiredPropertyException("GetPoolCertificate", "storeName");
            }
            this.storeName = storeName;
            return this;
        }
        @CustomType.Setter
        public Builder visibilities(List<String> visibilities) {
            if (visibilities == null) {
              throw new MissingRequiredPropertyException("GetPoolCertificate", "visibilities");
            }
            this.visibilities = visibilities;
            return this;
        }
        public Builder visibilities(String... visibilities) {
            return visibilities(List.of(visibilities));
        }
        public GetPoolCertificate build() {
            final var _resultValue = new GetPoolCertificate();
            _resultValue.id = id;
            _resultValue.storeLocation = storeLocation;
            _resultValue.storeName = storeName;
            _resultValue.visibilities = visibilities;
            return _resultValue;
        }
    }
}
