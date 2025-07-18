// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorRuleConditionsUrlPathConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorRuleConditionsUrlPathConditionArgs Empty = new FrontdoorRuleConditionsUrlPathConditionArgs();

    /**
     * One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    @Import(name="matchValues")
    private @Nullable Output<List<String>> matchValues;

    /**
     * @return One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    public Optional<Output<List<String>>> matchValues() {
        return Optional.ofNullable(this.matchValues);
    }

    /**
     * If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    @Import(name="negateCondition")
    private @Nullable Output<Boolean> negateCondition;

    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    public Optional<Output<Boolean>> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }

    /**
     * A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
     * 
     */
    @Import(name="transforms")
    private @Nullable Output<List<String>> transforms;

    /**
     * @return A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
     * 
     */
    public Optional<Output<List<String>>> transforms() {
        return Optional.ofNullable(this.transforms);
    }

    private FrontdoorRuleConditionsUrlPathConditionArgs() {}

    private FrontdoorRuleConditionsUrlPathConditionArgs(FrontdoorRuleConditionsUrlPathConditionArgs $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.operator = $.operator;
        this.transforms = $.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorRuleConditionsUrlPathConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorRuleConditionsUrlPathConditionArgs $;

        public Builder() {
            $ = new FrontdoorRuleConditionsUrlPathConditionArgs();
        }

        public Builder(FrontdoorRuleConditionsUrlPathConditionArgs defaults) {
            $ = new FrontdoorRuleConditionsUrlPathConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValues One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(@Nullable Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        /**
         * @param matchValues One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        /**
         * @param matchValues One or more string or integer values(e.g. &#34;1&#34;) representing the value of the request path to match. Don&#39;t include the leading slash (`/`). If multiple values are specified, they&#39;re evaluated using `OR` logic.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }

        /**
         * @param negateCondition If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            $.negateCondition = negateCondition;
            return this;
        }

        /**
         * @param negateCondition If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
         * 
         * @return builder
         * 
         */
        public Builder negateCondition(Boolean negateCondition) {
            return negateCondition(Output.of(negateCondition));
        }

        /**
         * @param operator A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator A Conditional operator. Possible values include `Any`, `Equal`, `Contains`, `BeginsWith`, `EndsWith`, `LessThan`, `LessThanOrEqual`, `GreaterThan`, `GreaterThanOrEqual`, `RegEx` or `Wildcard`. Details can be found in the `Condition Operator List` below.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param transforms A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
         * 
         * @return builder
         * 
         */
        public Builder transforms(@Nullable Output<List<String>> transforms) {
            $.transforms = transforms;
            return this;
        }

        /**
         * @param transforms A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
         * 
         * @return builder
         * 
         */
        public Builder transforms(List<String> transforms) {
            return transforms(Output.of(transforms));
        }

        /**
         * @param transforms A Conditional operator. Possible values include `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` or `UrlEncode`. Details can be found in the `Condition Transform List` below.
         * 
         * @return builder
         * 
         */
        public Builder transforms(String... transforms) {
            return transforms(List.of(transforms));
        }

        public FrontdoorRuleConditionsUrlPathConditionArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("FrontdoorRuleConditionsUrlPathConditionArgs", "operator");
            }
            return $;
        }
    }

}
