// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBudgetResourceGroupTimePeriod {
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

    private GetBudgetResourceGroupTimePeriod() {}
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

    public static Builder builder(GetBudgetResourceGroupTimePeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endDate;
        private String startDate;
        public Builder() {}
        public Builder(GetBudgetResourceGroupTimePeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        @CustomType.Setter
        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        @CustomType.Setter
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public GetBudgetResourceGroupTimePeriod build() {
            final var o = new GetBudgetResourceGroupTimePeriod();
            o.endDate = endDate;
            o.startDate = startDate;
            return o;
        }
    }
}