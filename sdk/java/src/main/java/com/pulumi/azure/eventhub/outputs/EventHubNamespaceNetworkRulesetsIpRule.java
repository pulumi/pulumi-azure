// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubNamespaceNetworkRulesetsIpRule {
    /**
     * @return The action to take when the rule is matched. Possible values are `Allow`.
     * 
     */
    private @Nullable String action;
    /**
     * @return The IP mask to match on.
     * 
     */
    private String ipMask;

    private EventHubNamespaceNetworkRulesetsIpRule() {}
    /**
     * @return The action to take when the rule is matched. Possible values are `Allow`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The IP mask to match on.
     * 
     */
    public String ipMask() {
        return this.ipMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubNamespaceNetworkRulesetsIpRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private String ipMask;
        public Builder() {}
        public Builder(EventHubNamespaceNetworkRulesetsIpRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public EventHubNamespaceNetworkRulesetsIpRule build() {
            final var o = new EventHubNamespaceNetworkRulesetsIpRule();
            o.action = action;
            o.ipMask = ipMask;
            return o;
        }
    }
}