// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.BudgetSubscriptionFilterDimension;
import com.pulumi.azure.consumption.outputs.BudgetSubscriptionFilterNot;
import com.pulumi.azure.consumption.outputs.BudgetSubscriptionFilterTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetSubscriptionFilter {
    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    private @Nullable List<BudgetSubscriptionFilterDimension> dimensions;
    /**
     * @return A `not` block as defined below to filter the budget on.
     * 
     */
    private @Nullable BudgetSubscriptionFilterNot not;
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    private @Nullable List<BudgetSubscriptionFilterTag> tags;

    private BudgetSubscriptionFilter() {}
    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetSubscriptionFilterDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return A `not` block as defined below to filter the budget on.
     * 
     */
    public Optional<BudgetSubscriptionFilterNot> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetSubscriptionFilterTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetSubscriptionFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BudgetSubscriptionFilterDimension> dimensions;
        private @Nullable BudgetSubscriptionFilterNot not;
        private @Nullable List<BudgetSubscriptionFilterTag> tags;
        public Builder() {}
        public Builder(BudgetSubscriptionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.not = defaults.not;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable List<BudgetSubscriptionFilterDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(BudgetSubscriptionFilterDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder not(@Nullable BudgetSubscriptionFilterNot not) {
            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<BudgetSubscriptionFilterTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(BudgetSubscriptionFilterTag... tags) {
            return tags(List.of(tags));
        }
        public BudgetSubscriptionFilter build() {
            final var o = new BudgetSubscriptionFilter();
            o.dimensions = dimensions;
            o.not = not;
            o.tags = tags;
            return o;
        }
    }
}