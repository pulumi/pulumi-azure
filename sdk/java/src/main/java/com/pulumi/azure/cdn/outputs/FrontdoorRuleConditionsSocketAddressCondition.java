// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorRuleConditionsSocketAddressCondition {
    /**
     * @return Specify one or more IP address ranges. If multiple IP address ranges are specified, they&#39;re evaluated using `OR` logic.
     * 
     */
    private @Nullable List<String> matchValues;
    /**
     * @return If `true` operator becomes the opposite of its value. Possible values `true` or `false`. Defaults to `false`. Details can be found in the `Condition Operator List` below.
     * 
     */
    private @Nullable Boolean negateCondition;
    /**
     * @return The type of match. The Possible values are `IpMatch` or `Any`. Defaults to `IpMatch`.
     * 
     */
    private @Nullable String operator;

    private FrontdoorRuleConditionsSocketAddressCondition() {}
    /**
     * @return Specify one or more IP address ranges. If multiple IP address ranges are specified, they&#39;re evaluated using `OR` logic.
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
     * @return The type of match. The Possible values are `IpMatch` or `Any`. Defaults to `IpMatch`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorRuleConditionsSocketAddressCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private @Nullable String operator;
        public Builder() {}
        public Builder(FrontdoorRuleConditionsSocketAddressCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
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
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public FrontdoorRuleConditionsSocketAddressCondition build() {
            final var o = new FrontdoorRuleConditionsSocketAddressCondition();
            o.matchValues = matchValues;
            o.negateCondition = negateCondition;
            o.operator = operator;
            return o;
        }
    }
}