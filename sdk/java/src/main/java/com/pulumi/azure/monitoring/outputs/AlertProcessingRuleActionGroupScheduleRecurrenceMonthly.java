// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertProcessingRuleActionGroupScheduleRecurrenceMonthly {
    /**
     * @return Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
     * 
     */
    private List<Integer> daysOfMonths;
    /**
     * @return Specifies the recurrence end time (H:M:S).
     * 
     */
    private @Nullable String endTime;
    /**
     * @return Specifies the recurrence start time (H:M:S).
     * 
     */
    private @Nullable String startTime;

    private AlertProcessingRuleActionGroupScheduleRecurrenceMonthly() {}
    /**
     * @return Specifies a list of dayOfMonth to recurrence. Possible values are integers between `1` - `31`.
     * 
     */
    public List<Integer> daysOfMonths() {
        return this.daysOfMonths;
    }
    /**
     * @return Specifies the recurrence end time (H:M:S).
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Specifies the recurrence start time (H:M:S).
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertProcessingRuleActionGroupScheduleRecurrenceMonthly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> daysOfMonths;
        private @Nullable String endTime;
        private @Nullable String startTime;
        public Builder() {}
        public Builder(AlertProcessingRuleActionGroupScheduleRecurrenceMonthly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfMonths = defaults.daysOfMonths;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder daysOfMonths(List<Integer> daysOfMonths) {
            if (daysOfMonths == null) {
              throw new MissingRequiredPropertyException("AlertProcessingRuleActionGroupScheduleRecurrenceMonthly", "daysOfMonths");
            }
            this.daysOfMonths = daysOfMonths;
            return this;
        }
        public Builder daysOfMonths(Integer... daysOfMonths) {
            return daysOfMonths(List.of(daysOfMonths));
        }
        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {

            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {

            this.startTime = startTime;
            return this;
        }
        public AlertProcessingRuleActionGroupScheduleRecurrenceMonthly build() {
            final var _resultValue = new AlertProcessingRuleActionGroupScheduleRecurrenceMonthly();
            _resultValue.daysOfMonths = daysOfMonths;
            _resultValue.endTime = endTime;
            _resultValue.startTime = startTime;
            return _resultValue;
        }
    }
}
