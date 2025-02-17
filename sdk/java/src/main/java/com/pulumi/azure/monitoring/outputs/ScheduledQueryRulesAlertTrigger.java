// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ScheduledQueryRulesAlertTriggerMetricTrigger;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduledQueryRulesAlertTrigger {
    /**
     * @return A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    private @Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger;
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    private String operator;
    /**
     * @return Result or count threshold based on which rule should be triggered. Values must be between 0 and 10000 inclusive.
     * 
     */
    private Double threshold;

    private ScheduledQueryRulesAlertTrigger() {}
    /**
     * @return A `metric_trigger` block as defined above. Trigger condition for metric query rule.
     * 
     */
    public Optional<ScheduledQueryRulesAlertTriggerMetricTrigger> metricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39;, GreaterThanOrEqual&#39;, &#39;LessThan&#39;, or &#39;LessThanOrEqual&#39;.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Result or count threshold based on which rule should be triggered. Values must be between 0 and 10000 inclusive.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledQueryRulesAlertTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger;
        private String operator;
        private Double threshold;
        public Builder() {}
        public Builder(ScheduledQueryRulesAlertTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder metricTrigger(@Nullable ScheduledQueryRulesAlertTriggerMetricTrigger metricTrigger) {

            this.metricTrigger = metricTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("ScheduledQueryRulesAlertTrigger", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            if (threshold == null) {
              throw new MissingRequiredPropertyException("ScheduledQueryRulesAlertTrigger", "threshold");
            }
            this.threshold = threshold;
            return this;
        }
        public ScheduledQueryRulesAlertTrigger build() {
            final var _resultValue = new ScheduledQueryRulesAlertTrigger();
            _resultValue.metricTrigger = metricTrigger;
            _resultValue.operator = operator;
            _resultValue.threshold = threshold;
            return _resultValue;
        }
    }
}
