// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayRewriteRuleSetRewriteRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayRewriteRuleSet {
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private @Nullable String id;
    /**
     * @return Unique name of the rewrite rule set block
     * 
     */
    private String name;
    /**
     * @return One or more `rewrite_rule` blocks as defined above.
     * 
     */
    private @Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules;

    private ApplicationGatewayRewriteRuleSet() {}
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Unique name of the rewrite rule set block
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return One or more `rewrite_rule` blocks as defined above.
     * 
     */
    public List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules() {
        return this.rewriteRules == null ? List.of() : this.rewriteRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String name;
        private @Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules;
        public Builder() {}
        public Builder(ApplicationGatewayRewriteRuleSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rewriteRules = defaults.rewriteRules;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder rewriteRules(@Nullable List<ApplicationGatewayRewriteRuleSetRewriteRule> rewriteRules) {
            this.rewriteRules = rewriteRules;
            return this;
        }
        public Builder rewriteRules(ApplicationGatewayRewriteRuleSetRewriteRule... rewriteRules) {
            return rewriteRules(List.of(rewriteRules));
        }
        public ApplicationGatewayRewriteRuleSet build() {
            final var o = new ApplicationGatewayRewriteRuleSet();
            o.id = id;
            o.name = name;
            o.rewriteRules = rewriteRules;
            return o;
        }
    }
}