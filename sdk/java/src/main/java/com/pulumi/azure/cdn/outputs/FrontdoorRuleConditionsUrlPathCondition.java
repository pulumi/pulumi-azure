// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorRuleConditionsUrlPathCondition {
    /**
     * @return One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    private @Nullable List<String> matchValues;
    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    private @Nullable Boolean negateCondition;
    /**
     * @return A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
     * 
     */
    private String operator;
    /**
     * @return A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
     * 
     */
    private @Nullable List<String> transforms;

    private FrontdoorRuleConditionsUrlPathCondition() {}
    /**
     * @return One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    public List<String> matchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }
    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
     * 
     */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorRuleConditionsUrlPathCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String operator;
        private @Nullable List<String> transforms;
        public Builder() {}
        public Builder(FrontdoorRuleConditionsUrlPathCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        @CustomType.Setter
        public Builder matchValues(@Nullable List<String> matchValues) {

            this.matchValues = matchValues;
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        @CustomType.Setter
        public Builder negateCondition(@Nullable Boolean negateCondition) {

            this.negateCondition = negateCondition;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("FrontdoorRuleConditionsUrlPathCondition", "operator");
            }
            this.operator = operator;
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
        public FrontdoorRuleConditionsUrlPathCondition build() {
            final var _resultValue = new FrontdoorRuleConditionsUrlPathCondition();
            _resultValue.matchValues = matchValues;
            _resultValue.negateCondition = negateCondition;
            _resultValue.operator = operator;
            _resultValue.transforms = transforms;
            return _resultValue;
        }
    }
}
