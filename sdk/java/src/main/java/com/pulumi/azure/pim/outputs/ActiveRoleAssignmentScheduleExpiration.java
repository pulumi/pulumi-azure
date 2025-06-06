// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActiveRoleAssignmentScheduleExpiration {
    /**
     * @return The duration of the role assignment in days. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Integer durationDays;
    /**
     * @return The duration of the role assignment in hours. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Integer durationHours;
    /**
     * @return The end date/time of the role assignment. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only one of `duration_days`, `duration_hours` or `end_date_time` should be specified.
     * 
     */
    private @Nullable String endDateTime;

    private ActiveRoleAssignmentScheduleExpiration() {}
    /**
     * @return The duration of the role assignment in days. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> durationDays() {
        return Optional.ofNullable(this.durationDays);
    }
    /**
     * @return The duration of the role assignment in hours. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> durationHours() {
        return Optional.ofNullable(this.durationHours);
    }
    /**
     * @return The end date/time of the role assignment. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only one of `duration_days`, `duration_hours` or `end_date_time` should be specified.
     * 
     */
    public Optional<String> endDateTime() {
        return Optional.ofNullable(this.endDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveRoleAssignmentScheduleExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer durationDays;
        private @Nullable Integer durationHours;
        private @Nullable String endDateTime;
        public Builder() {}
        public Builder(ActiveRoleAssignmentScheduleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationDays = defaults.durationDays;
    	      this.durationHours = defaults.durationHours;
    	      this.endDateTime = defaults.endDateTime;
        }

        @CustomType.Setter
        public Builder durationDays(@Nullable Integer durationDays) {

            this.durationDays = durationDays;
            return this;
        }
        @CustomType.Setter
        public Builder durationHours(@Nullable Integer durationHours) {

            this.durationHours = durationHours;
            return this;
        }
        @CustomType.Setter
        public Builder endDateTime(@Nullable String endDateTime) {

            this.endDateTime = endDateTime;
            return this;
        }
        public ActiveRoleAssignmentScheduleExpiration build() {
            final var _resultValue = new ActiveRoleAssignmentScheduleExpiration();
            _resultValue.durationDays = durationDays;
            _resultValue.durationHours = durationHours;
            _resultValue.endDateTime = endDateTime;
            return _resultValue;
        }
    }
}
