// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesEngineRuleMatchCondition {
    /**
     * @return can be set to `true` or `false` to negate the given condition. Defaults to `true`.
     * 
     */
    private @Nullable Boolean negateCondition;
    /**
     * @return can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
     * 
     */
    private String operator;
    /**
     * @return match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
     * 
     */
    private @Nullable String selector;
    /**
     * @return can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
     * 
     */
    private @Nullable List<String> transforms;
    /**
     * @return can contain one or more strings.
     * 
     */
    private @Nullable List<String> values;
    /**
     * @return can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
     * 
     */
    private @Nullable String variable;

    private RulesEngineRuleMatchCondition() {}
    /**
     * @return can be set to `true` or `false` to negate the given condition. Defaults to `true`.
     * 
     */
    public Optional<Boolean> negateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * @return can be set to `Any`, `IPMatch`, `GeoMatch`, `Equal`, `Contains`, `LessThan`, `GreaterThan`, `LessThanOrEqual`, `GreaterThanOrEqual`, `BeginsWith` or `EndsWith`
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return match against a specific key when `variable` is set to `PostArgs` or `RequestHeader`. It cannot be used with `QueryString` and `RequestMethod`. Defaults to `null`.
     * 
     */
    public Optional<String> selector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * @return can be set to one or more values out of `Lowercase`, `RemoveNulls`, `Trim`, `Uppercase`, `UrlDecode` and `UrlEncode`
     * 
     */
    public List<String> transforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }
    /**
     * @return can contain one or more strings.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }
    /**
     * @return can be set to `IsMobile`, `RemoteAddr`, `RequestMethod`, `QueryString`, `PostArgs`, `RequestURI`, `RequestPath`, `RequestFilename`, `RequestFilenameExtension`,`RequestHeader`,`RequestBody` or `RequestScheme`.
     * 
     */
    public Optional<String> variable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineRuleMatchCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean negateCondition;
        private String operator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;
        private @Nullable List<String> values;
        private @Nullable String variable;
        public Builder() {}
        public Builder(RulesEngineRuleMatchCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder selector(@Nullable String selector) {
            this.selector = selector;
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
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        @CustomType.Setter
        public Builder variable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }
        public RulesEngineRuleMatchCondition build() {
            final var o = new RulesEngineRuleMatchCondition();
            o.negateCondition = negateCondition;
            o.operator = operator;
            o.selector = selector;
            o.transforms = transforms;
            o.values = values;
            o.variable = variable;
            return o;
        }
    }
}