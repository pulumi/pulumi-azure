// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dynatrace.outputs;

import com.pulumi.azure.dynatrace.outputs.TagRulesMetricRuleFilteringTag;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TagRulesMetricRule {
    /**
     * @return Filtering tag for the metric rule. A `filtering_tag` block as defined below.
     * 
     */
    private List<TagRulesMetricRuleFilteringTag> filteringTags;
    /**
     * @return If sending metrics is enabled. The default value is `false`.
     * 
     */
    private @Nullable Boolean sendingMetricsEnabled;

    private TagRulesMetricRule() {}
    /**
     * @return Filtering tag for the metric rule. A `filtering_tag` block as defined below.
     * 
     */
    public List<TagRulesMetricRuleFilteringTag> filteringTags() {
        return this.filteringTags;
    }
    /**
     * @return If sending metrics is enabled. The default value is `false`.
     * 
     */
    public Optional<Boolean> sendingMetricsEnabled() {
        return Optional.ofNullable(this.sendingMetricsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagRulesMetricRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<TagRulesMetricRuleFilteringTag> filteringTags;
        private @Nullable Boolean sendingMetricsEnabled;
        public Builder() {}
        public Builder(TagRulesMetricRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.sendingMetricsEnabled = defaults.sendingMetricsEnabled;
        }

        @CustomType.Setter
        public Builder filteringTags(List<TagRulesMetricRuleFilteringTag> filteringTags) {
            if (filteringTags == null) {
              throw new MissingRequiredPropertyException("TagRulesMetricRule", "filteringTags");
            }
            this.filteringTags = filteringTags;
            return this;
        }
        public Builder filteringTags(TagRulesMetricRuleFilteringTag... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }
        @CustomType.Setter
        public Builder sendingMetricsEnabled(@Nullable Boolean sendingMetricsEnabled) {

            this.sendingMetricsEnabled = sendingMetricsEnabled;
            return this;
        }
        public TagRulesMetricRule build() {
            final var _resultValue = new TagRulesMetricRule();
            _resultValue.filteringTags = filteringTags;
            _resultValue.sendingMetricsEnabled = sendingMetricsEnabled;
            return _resultValue;
        }
    }
}
