// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf.outputs;

import com.pulumi.azure.waf.outputs.PolicyCustomRuleMatchConditionMatchVariable;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyCustomRuleMatchCondition {
    /**
     * @return A list of match values.
     * 
     */
    private List<String> matchValues;
    /**
     * @return One or more `match_variables` blocks as defined below.
     * 
     */
    private List<PolicyCustomRuleMatchConditionMatchVariable> matchVariables;
    /**
     * @return Describes if this is negate condition or not
     * 
     */
    private @Nullable Boolean negationCondition;
    /**
     * @return Describes operator to be matched.
     * 
     */
    private String operator;
    /**
     * @return A list of transformations to do before the match is attempted.
     * 
     */
    private @Nullable List<String> transforms;

    private PolicyCustomRuleMatchCondition() {}
    /**
     * @return A list of match values.
     * 
     */
    public List<String> matchValues() {
        return this.matchValues;
    }
    /**
     * @return One or more `match_variables` blocks as defined below.
     * 
     */
    public List<PolicyCustomRuleMatchConditionMatchVariable> matchVariables() {
        return this.matchVariables;
    }
    /**
     * @return Describes if this is negate condition or not
     * 
     */
    public Optional<Boolean> negationCondition() {
        return Optional.ofNullable(this.negationCondition);
    }
    /**
     * @return Describes operator to be matched.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A list of transformations to do before the match is attempted.
     * 
     */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyCustomRuleMatchCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> matchValues;
        private List<PolicyCustomRuleMatchConditionMatchVariable> matchVariables;
        private @Nullable Boolean negationCondition;
        private String operator;
        private @Nullable List<String> transforms;
        public Builder() {}
        public Builder(PolicyCustomRuleMatchCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.matchVariables = defaults.matchVariables;
    	      this.negationCondition = defaults.negationCondition;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        @CustomType.Setter
        public Builder matchValues(List<String> matchValues) {
            this.matchValues = Objects.requireNonNull(matchValues);
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        @CustomType.Setter
        public Builder matchVariables(List<PolicyCustomRuleMatchConditionMatchVariable> matchVariables) {
            this.matchVariables = Objects.requireNonNull(matchVariables);
            return this;
        }
        public Builder matchVariables(PolicyCustomRuleMatchConditionMatchVariable... matchVariables) {
            return matchVariables(List.of(matchVariables));
        }
        @CustomType.Setter
        public Builder negationCondition(@Nullable Boolean negationCondition) {
            this.negationCondition = negationCondition;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder transforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }
        public PolicyCustomRuleMatchCondition build() {
            final var o = new PolicyCustomRuleMatchCondition();
            o.matchValues = matchValues;
            o.matchVariables = matchVariables;
            o.negationCondition = negationCondition;
            o.operator = operator;
            o.transforms = transforms;
            return o;
        }
    }
}