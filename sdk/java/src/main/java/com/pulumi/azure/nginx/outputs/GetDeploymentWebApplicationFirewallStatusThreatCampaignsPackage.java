// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.nginx.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage {
    private String revisionDatetime;
    private String version;

    private GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage() {}
    public String revisionDatetime() {
        return this.revisionDatetime;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String revisionDatetime;
        private String version;
        public Builder() {}
        public Builder(GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revisionDatetime = defaults.revisionDatetime;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder revisionDatetime(String revisionDatetime) {
            if (revisionDatetime == null) {
              throw new MissingRequiredPropertyException("GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage", "revisionDatetime");
            }
            this.revisionDatetime = revisionDatetime;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage", "version");
            }
            this.version = version;
            return this;
        }
        public GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage build() {
            final var _resultValue = new GetDeploymentWebApplicationFirewallStatusThreatCampaignsPackage();
            _resultValue.revisionDatetime = revisionDatetime;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
