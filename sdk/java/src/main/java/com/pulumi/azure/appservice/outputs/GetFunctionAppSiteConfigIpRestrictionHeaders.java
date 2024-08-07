// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionAppSiteConfigIpRestrictionHeaders {
    private List<String> xAzureFdids;
    private List<String> xFdHealthProbes;
    private List<String> xForwardedFors;
    private List<String> xForwardedHosts;

    private GetFunctionAppSiteConfigIpRestrictionHeaders() {}
    public List<String> xAzureFdids() {
        return this.xAzureFdids;
    }
    public List<String> xFdHealthProbes() {
        return this.xFdHealthProbes;
    }
    public List<String> xForwardedFors() {
        return this.xForwardedFors;
    }
    public List<String> xForwardedHosts() {
        return this.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppSiteConfigIpRestrictionHeaders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> xAzureFdids;
        private List<String> xFdHealthProbes;
        private List<String> xForwardedFors;
        private List<String> xForwardedHosts;
        public Builder() {}
        public Builder(GetFunctionAppSiteConfigIpRestrictionHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xAzureFdids = defaults.xAzureFdids;
    	      this.xFdHealthProbes = defaults.xFdHealthProbes;
    	      this.xForwardedFors = defaults.xForwardedFors;
    	      this.xForwardedHosts = defaults.xForwardedHosts;
        }

        @CustomType.Setter
        public Builder xAzureFdids(List<String> xAzureFdids) {
            if (xAzureFdids == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSiteConfigIpRestrictionHeaders", "xAzureFdids");
            }
            this.xAzureFdids = xAzureFdids;
            return this;
        }
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }
        @CustomType.Setter
        public Builder xFdHealthProbes(List<String> xFdHealthProbes) {
            if (xFdHealthProbes == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSiteConfigIpRestrictionHeaders", "xFdHealthProbes");
            }
            this.xFdHealthProbes = xFdHealthProbes;
            return this;
        }
        public Builder xFdHealthProbes(String... xFdHealthProbes) {
            return xFdHealthProbes(List.of(xFdHealthProbes));
        }
        @CustomType.Setter
        public Builder xForwardedFors(List<String> xForwardedFors) {
            if (xForwardedFors == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSiteConfigIpRestrictionHeaders", "xForwardedFors");
            }
            this.xForwardedFors = xForwardedFors;
            return this;
        }
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }
        @CustomType.Setter
        public Builder xForwardedHosts(List<String> xForwardedHosts) {
            if (xForwardedHosts == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppSiteConfigIpRestrictionHeaders", "xForwardedHosts");
            }
            this.xForwardedHosts = xForwardedHosts;
            return this;
        }
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }
        public GetFunctionAppSiteConfigIpRestrictionHeaders build() {
            final var _resultValue = new GetFunctionAppSiteConfigIpRestrictionHeaders();
            _resultValue.xAzureFdids = xAzureFdids;
            _resultValue.xFdHealthProbes = xFdHealthProbes;
            _resultValue.xForwardedFors = xForwardedFors;
            _resultValue.xForwardedHosts = xForwardedHosts;
            return _resultValue;
        }
    }
}
