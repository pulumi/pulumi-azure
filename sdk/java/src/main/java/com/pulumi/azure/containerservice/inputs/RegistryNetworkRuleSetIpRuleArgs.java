// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RegistryNetworkRuleSetIpRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryNetworkRuleSetIpRuleArgs Empty = new RegistryNetworkRuleSetIpRuleArgs();

    /**
     * The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The behaviour for requests matching this rule. At this time the only supported value is `Allow`
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The CIDR block from which requests will match the rule.
     * 
     */
    @Import(name="ipRange", required=true)
    private Output<String> ipRange;

    /**
     * @return The CIDR block from which requests will match the rule.
     * 
     */
    public Output<String> ipRange() {
        return this.ipRange;
    }

    private RegistryNetworkRuleSetIpRuleArgs() {}

    private RegistryNetworkRuleSetIpRuleArgs(RegistryNetworkRuleSetIpRuleArgs $) {
        this.action = $.action;
        this.ipRange = $.ipRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryNetworkRuleSetIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryNetworkRuleSetIpRuleArgs $;

        public Builder() {
            $ = new RegistryNetworkRuleSetIpRuleArgs();
        }

        public Builder(RegistryNetworkRuleSetIpRuleArgs defaults) {
            $ = new RegistryNetworkRuleSetIpRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The behaviour for requests matching this rule. At this time the only supported value is `Allow`
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The behaviour for requests matching this rule. At this time the only supported value is `Allow`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param ipRange The CIDR block from which requests will match the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The CIDR block from which requests will match the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        public RegistryNetworkRuleSetIpRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.ipRange = Objects.requireNonNull($.ipRange, "expected parameter 'ipRange' to be non-null");
            return $;
        }
    }

}