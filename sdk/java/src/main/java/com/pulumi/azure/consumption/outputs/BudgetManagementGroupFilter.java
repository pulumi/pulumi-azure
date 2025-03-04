// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.BudgetManagementGroupFilterDimension;
import com.pulumi.azure.consumption.outputs.BudgetManagementGroupFilterTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BudgetManagementGroupFilter {
    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    private @Nullable List<BudgetManagementGroupFilterDimension> dimensions;
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    private @Nullable List<BudgetManagementGroupFilterTag> tags;

    private BudgetManagementGroupFilter() {}
    /**
     * @return One or more `dimension` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetManagementGroupFilterDimension> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return One or more `tag` blocks as defined below to filter the budget on.
     * 
     */
    public List<BudgetManagementGroupFilterTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetManagementGroupFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BudgetManagementGroupFilterDimension> dimensions;
        private @Nullable List<BudgetManagementGroupFilterTag> tags;
        public Builder() {}
        public Builder(BudgetManagementGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder dimensions(@Nullable List<BudgetManagementGroupFilterDimension> dimensions) {

            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(BudgetManagementGroupFilterDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<BudgetManagementGroupFilterTag> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(BudgetManagementGroupFilterTag... tags) {
            return tags(List.of(tags));
        }
        public BudgetManagementGroupFilter build() {
            final var _resultValue = new BudgetManagementGroupFilter();
            _resultValue.dimensions = dimensions;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
