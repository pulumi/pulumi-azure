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


public final class FrontdoorRuleConditionsHttpVersionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorRuleConditionsHttpVersionConditionArgs Empty = new FrontdoorRuleConditionsHttpVersionConditionArgs();

    /**
     * What HTTP version should this condition match? Possible values `2.0`, `1.1`, `1.0` or `0.9`.
     * 
     */
    @Import(name="matchValues", required=true)
    private Output<List<String>> matchValues;

    /**
     * @return What HTTP version should this condition match? Possible values `2.0`, `1.1`, `1.0` or `0.9`.
     * 
     */
    public Output<List<String>> matchValues() {
        return this.matchValues;
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
     * Possible value `Equal`. Defaults to `Equal`.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<String> operator;

    /**
     * @return Possible value `Equal`. Defaults to `Equal`.
     * 
     */
    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    private FrontdoorRuleConditionsHttpVersionConditionArgs() {}

    private FrontdoorRuleConditionsHttpVersionConditionArgs(FrontdoorRuleConditionsHttpVersionConditionArgs $) {
        this.matchValues = $.matchValues;
        this.negateCondition = $.negateCondition;
        this.operator = $.operator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorRuleConditionsHttpVersionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorRuleConditionsHttpVersionConditionArgs $;

        public Builder() {
            $ = new FrontdoorRuleConditionsHttpVersionConditionArgs();
        }

        public Builder(FrontdoorRuleConditionsHttpVersionConditionArgs defaults) {
            $ = new FrontdoorRuleConditionsHttpVersionConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchValues What HTTP version should this condition match? Possible values `2.0`, `1.1`, `1.0` or `0.9`.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(Output<List<String>> matchValues) {
            $.matchValues = matchValues;
            return this;
        }

        /**
         * @param matchValues What HTTP version should this condition match? Possible values `2.0`, `1.1`, `1.0` or `0.9`.
         * 
         * @return builder
         * 
         */
        public Builder matchValues(List<String> matchValues) {
            return matchValues(Output.of(matchValues));
        }

        /**
         * @param matchValues What HTTP version should this condition match? Possible values `2.0`, `1.1`, `1.0` or `0.9`.
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
         * @param operator Possible value `Equal`. Defaults to `Equal`.
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Possible value `Equal`. Defaults to `Equal`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public FrontdoorRuleConditionsHttpVersionConditionArgs build() {
            if ($.matchValues == null) {
                throw new MissingRequiredPropertyException("FrontdoorRuleConditionsHttpVersionConditionArgs", "matchValues");
            }
            return $;
        }
    }

}
