// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class KubernetesClusterConfidentialComputing {
    /**
     * @return Should the SGX quote helper be enabled?
     * 
     */
    private Boolean sgxQuoteHelperEnabled;

    private KubernetesClusterConfidentialComputing() {}
    /**
     * @return Should the SGX quote helper be enabled?
     * 
     */
    public Boolean sgxQuoteHelperEnabled() {
        return this.sgxQuoteHelperEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterConfidentialComputing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean sgxQuoteHelperEnabled;
        public Builder() {}
        public Builder(KubernetesClusterConfidentialComputing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sgxQuoteHelperEnabled = defaults.sgxQuoteHelperEnabled;
        }

        @CustomType.Setter
        public Builder sgxQuoteHelperEnabled(Boolean sgxQuoteHelperEnabled) {
            if (sgxQuoteHelperEnabled == null) {
              throw new MissingRequiredPropertyException("KubernetesClusterConfidentialComputing", "sgxQuoteHelperEnabled");
            }
            this.sgxQuoteHelperEnabled = sgxQuoteHelperEnabled;
            return this;
        }
        public KubernetesClusterConfidentialComputing build() {
            final var _resultValue = new KubernetesClusterConfidentialComputing();
            _resultValue.sgxQuoteHelperEnabled = sgxQuoteHelperEnabled;
            return _resultValue;
        }
    }
}
