// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBudgetSubscriptionTimePeriod {
    /**
     * @return The end date for the budget.
     * 
     */
    private String endDate;
    /**
     * @return The start date for the budget.
     * 
     */
    private String startDate;

    private GetBudgetSubscriptionTimePeriod() {}
    /**
     * @return The end date for the budget.
     * 
     */
    public String endDate() {
        return this.endDate;
    }
    /**
     * @return The start date for the budget.
     * 
     */
    public String startDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetSubscriptionTimePeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endDate;
        private String startDate;
        public Builder() {}
        public Builder(GetBudgetSubscriptionTimePeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        @CustomType.Setter
        public Builder endDate(String endDate) {
            if (endDate == null) {
              throw new MissingRequiredPropertyException("GetBudgetSubscriptionTimePeriod", "endDate");
            }
            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder startDate(String startDate) {
            if (startDate == null) {
              throw new MissingRequiredPropertyException("GetBudgetSubscriptionTimePeriod", "startDate");
            }
            this.startDate = startDate;
            return this;
        }
        public GetBudgetSubscriptionTimePeriod build() {
            final var _resultValue = new GetBudgetSubscriptionTimePeriod();
            _resultValue.endDate = endDate;
            _resultValue.startDate = startDate;
            return _resultValue;
        }
    }
}
