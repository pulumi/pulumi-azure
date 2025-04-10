// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReplicationRecoveryPlanAzureToAzureSetting {
    private String primaryEdgeZone;
    private String primaryZone;
    private String recoveryEdgeZone;
    private String recoveryZone;

    private GetReplicationRecoveryPlanAzureToAzureSetting() {}
    public String primaryEdgeZone() {
        return this.primaryEdgeZone;
    }
    public String primaryZone() {
        return this.primaryZone;
    }
    public String recoveryEdgeZone() {
        return this.recoveryEdgeZone;
    }
    public String recoveryZone() {
        return this.recoveryZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationRecoveryPlanAzureToAzureSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String primaryEdgeZone;
        private String primaryZone;
        private String recoveryEdgeZone;
        private String recoveryZone;
        public Builder() {}
        public Builder(GetReplicationRecoveryPlanAzureToAzureSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryEdgeZone = defaults.primaryEdgeZone;
    	      this.primaryZone = defaults.primaryZone;
    	      this.recoveryEdgeZone = defaults.recoveryEdgeZone;
    	      this.recoveryZone = defaults.recoveryZone;
        }

        @CustomType.Setter
        public Builder primaryEdgeZone(String primaryEdgeZone) {
            if (primaryEdgeZone == null) {
              throw new MissingRequiredPropertyException("GetReplicationRecoveryPlanAzureToAzureSetting", "primaryEdgeZone");
            }
            this.primaryEdgeZone = primaryEdgeZone;
            return this;
        }
        @CustomType.Setter
        public Builder primaryZone(String primaryZone) {
            if (primaryZone == null) {
              throw new MissingRequiredPropertyException("GetReplicationRecoveryPlanAzureToAzureSetting", "primaryZone");
            }
            this.primaryZone = primaryZone;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryEdgeZone(String recoveryEdgeZone) {
            if (recoveryEdgeZone == null) {
              throw new MissingRequiredPropertyException("GetReplicationRecoveryPlanAzureToAzureSetting", "recoveryEdgeZone");
            }
            this.recoveryEdgeZone = recoveryEdgeZone;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryZone(String recoveryZone) {
            if (recoveryZone == null) {
              throw new MissingRequiredPropertyException("GetReplicationRecoveryPlanAzureToAzureSetting", "recoveryZone");
            }
            this.recoveryZone = recoveryZone;
            return this;
        }
        public GetReplicationRecoveryPlanAzureToAzureSetting build() {
            final var _resultValue = new GetReplicationRecoveryPlanAzureToAzureSetting();
            _resultValue.primaryEdgeZone = primaryEdgeZone;
            _resultValue.primaryZone = primaryZone;
            _resultValue.recoveryEdgeZone = recoveryEdgeZone;
            _resultValue.recoveryZone = recoveryZone;
            return _resultValue;
        }
    }
}
