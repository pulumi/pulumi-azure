// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetPolicyRuleAction;
import com.pulumi.azure.storage.outputs.GetPolicyRuleFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyRule {
    /**
     * @return An `actions` block as documented below.
     * 
     */
    private List<GetPolicyRuleAction> actions;
    /**
     * @return Boolean to specify whether the rule is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return A `filter` block as documented below.
     * 
     */
    private List<GetPolicyRuleFilter> filters;
    /**
     * @return The filter tag name used for tag based filtering for blob objects.
     * 
     */
    private String name;

    private GetPolicyRule() {}
    /**
     * @return An `actions` block as documented below.
     * 
     */
    public List<GetPolicyRuleAction> actions() {
        return this.actions;
    }
    /**
     * @return Boolean to specify whether the rule is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A `filter` block as documented below.
     * 
     */
    public List<GetPolicyRuleFilter> filters() {
        return this.filters;
    }
    /**
     * @return The filter tag name used for tag based filtering for blob objects.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPolicyRuleAction> actions;
        private Boolean enabled;
        private List<GetPolicyRuleFilter> filters;
        private String name;
        public Builder() {}
        public Builder(GetPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.enabled = defaults.enabled;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder actions(List<GetPolicyRuleAction> actions) {
            if (actions == null) {
              throw new MissingRequiredPropertyException("GetPolicyRule", "actions");
            }
            this.actions = actions;
            return this;
        }
        public Builder actions(GetPolicyRuleAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetPolicyRule", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder filters(List<GetPolicyRuleFilter> filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("GetPolicyRule", "filters");
            }
            this.filters = filters;
            return this;
        }
        public Builder filters(GetPolicyRuleFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPolicyRule", "name");
            }
            this.name = name;
            return this;
        }
        public GetPolicyRule build() {
            final var _resultValue = new GetPolicyRule();
            _resultValue.actions = actions;
            _resultValue.enabled = enabled;
            _resultValue.filters = filters;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
