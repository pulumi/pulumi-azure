// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterDimension;
import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterNot;
import com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupFilterTag;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBudgetResourceGroupFilter {
    /**
     * @return A `dimension` block as defined below.
     * 
     */
    private List<GetBudgetResourceGroupFilterDimension> dimensions;
    /**
     * @return A `not` block as defined below.
     * 
     */
    private List<GetBudgetResourceGroupFilterNot> nots;
    /**
     * @return A `tag` block as defined below.
     * 
     */
    private List<GetBudgetResourceGroupFilterTag> tags;

    private GetBudgetResourceGroupFilter() {}
    /**
     * @return A `dimension` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return A `not` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterNot> nots() {
        return this.nots;
    }
    /**
     * @return A `tag` block as defined below.
     * 
     */
    public List<GetBudgetResourceGroupFilterTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBudgetResourceGroupFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBudgetResourceGroupFilterDimension> dimensions;
        private List<GetBudgetResourceGroupFilterNot> nots;
        private List<GetBudgetResourceGroupFilterTag> tags;
        public Builder() {}
        public Builder(GetBudgetResourceGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.nots = defaults.nots;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder dimensions(List<GetBudgetResourceGroupFilterDimension> dimensions) {
            if (dimensions == null) {
              throw new MissingRequiredPropertyException("GetBudgetResourceGroupFilter", "dimensions");
            }
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(GetBudgetResourceGroupFilterDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder nots(List<GetBudgetResourceGroupFilterNot> nots) {
            if (nots == null) {
              throw new MissingRequiredPropertyException("GetBudgetResourceGroupFilter", "nots");
            }
            this.nots = nots;
            return this;
        }
        public Builder nots(GetBudgetResourceGroupFilterNot... nots) {
            return nots(List.of(nots));
        }
        @CustomType.Setter
        public Builder tags(List<GetBudgetResourceGroupFilterTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetBudgetResourceGroupFilter", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetBudgetResourceGroupFilterTag... tags) {
            return tags(List.of(tags));
        }
        public GetBudgetResourceGroupFilter build() {
            final var _resultValue = new GetBudgetResourceGroupFilter();
            _resultValue.dimensions = dimensions;
            _resultValue.nots = nots;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
