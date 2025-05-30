// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetManagementGroupTimePeriod {
    /**
     * @return The end date for the budget. If not set this will be 10 years after the start date.
     * 
     */
    private @Nullable String endDate;
    /**
     * @return The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new resource to be created.
     * 
     */
    private String startDate;

    private BudgetManagementGroupTimePeriod() {}
    /**
     * @return The end date for the budget. If not set this will be 10 years after the start date.
     * 
     */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * @return The start date for the budget. The start date must be first of the month and should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should not be more than twelve months. Past start date should be selected within the timegrain period. Changing this forces a new resource to be created.
     * 
     */
    public String startDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetManagementGroupTimePeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endDate;
        private String startDate;
        public Builder() {}
        public Builder(BudgetManagementGroupTimePeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        @CustomType.Setter
        public Builder endDate(@Nullable String endDate) {

            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder startDate(String startDate) {
            if (startDate == null) {
              throw new MissingRequiredPropertyException("BudgetManagementGroupTimePeriod", "startDate");
            }
            this.startDate = startDate;
            return this;
        }
        public BudgetManagementGroupTimePeriod build() {
            final var _resultValue = new BudgetManagementGroupTimePeriod();
            _resultValue.endDate = endDate;
            _resultValue.startDate = startDate;
            return _resultValue;
        }
    }
}
