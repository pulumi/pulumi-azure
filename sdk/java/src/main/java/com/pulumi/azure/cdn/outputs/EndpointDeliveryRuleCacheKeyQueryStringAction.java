// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRuleCacheKeyQueryStringAction {
    /**
     * @return The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    private String behavior;
    /**
     * @return Comma separated list of parameter values.
     * 
     */
    private @Nullable String parameters;

    private EndpointDeliveryRuleCacheKeyQueryStringAction() {}
    /**
     * @return The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    public String behavior() {
        return this.behavior;
    }
    /**
     * @return Comma separated list of parameter values.
     * 
     */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRuleCacheKeyQueryStringAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String behavior;
        private @Nullable String parameters;
        public Builder() {}
        public Builder(EndpointDeliveryRuleCacheKeyQueryStringAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder behavior(String behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        public EndpointDeliveryRuleCacheKeyQueryStringAction build() {
            final var o = new EndpointDeliveryRuleCacheKeyQueryStringAction();
            o.behavior = behavior;
            o.parameters = parameters;
            return o;
        }
    }
}