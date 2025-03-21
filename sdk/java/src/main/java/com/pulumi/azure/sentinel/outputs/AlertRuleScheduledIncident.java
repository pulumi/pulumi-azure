// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.azure.sentinel.outputs.AlertRuleScheduledIncidentGrouping;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class AlertRuleScheduledIncident {
    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    private Boolean createIncidentEnabled;
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    private AlertRuleScheduledIncidentGrouping grouping;

    private AlertRuleScheduledIncident() {}
    /**
     * @return Whether to create an incident from alerts triggered by this Sentinel Scheduled Alert Rule?
     * 
     */
    public Boolean createIncidentEnabled() {
        return this.createIncidentEnabled;
    }
    /**
     * @return A `grouping` block as defined below.
     * 
     */
    public AlertRuleScheduledIncidentGrouping grouping() {
        return this.grouping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleScheduledIncident defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean createIncidentEnabled;
        private AlertRuleScheduledIncidentGrouping grouping;
        public Builder() {}
        public Builder(AlertRuleScheduledIncident defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createIncidentEnabled = defaults.createIncidentEnabled;
    	      this.grouping = defaults.grouping;
        }

        @CustomType.Setter
        public Builder createIncidentEnabled(Boolean createIncidentEnabled) {
            if (createIncidentEnabled == null) {
              throw new MissingRequiredPropertyException("AlertRuleScheduledIncident", "createIncidentEnabled");
            }
            this.createIncidentEnabled = createIncidentEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder grouping(AlertRuleScheduledIncidentGrouping grouping) {
            if (grouping == null) {
              throw new MissingRequiredPropertyException("AlertRuleScheduledIncident", "grouping");
            }
            this.grouping = grouping;
            return this;
        }
        public AlertRuleScheduledIncident build() {
            final var _resultValue = new AlertRuleScheduledIncident();
            _resultValue.createIncidentEnabled = createIncidentEnabled;
            _resultValue.grouping = grouping;
            return _resultValue;
        }
    }
}
