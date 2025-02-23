// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs Empty = new NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs();

    /**
     * Specifies the maximum port number.
     * 
     */
    @Import(name="maximum")
    private @Nullable Output<Integer> maximum;

    /**
     * @return Specifies the maximum port number.
     * 
     */
    public Optional<Output<Integer>> maximum() {
        return Optional.ofNullable(this.maximum);
    }

    /**
     * Specifies the minimum port number.
     * 
     */
    @Import(name="minimum")
    private @Nullable Output<Integer> minimum;

    /**
     * @return Specifies the minimum port number.
     * 
     */
    public Optional<Output<Integer>> minimum() {
        return Optional.ofNullable(this.minimum);
    }

    private NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs() {}

    private NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs(NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs $) {
        this.maximum = $.maximum;
        this.minimum = $.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs $;

        public Builder() {
            $ = new NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs();
        }

        public Builder(NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs defaults) {
            $ = new NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maximum Specifies the maximum port number.
         * 
         * @return builder
         * 
         */
        public Builder maximum(@Nullable Output<Integer> maximum) {
            $.maximum = maximum;
            return this;
        }

        /**
         * @param maximum Specifies the maximum port number.
         * 
         * @return builder
         * 
         */
        public Builder maximum(Integer maximum) {
            return maximum(Output.of(maximum));
        }

        /**
         * @param minimum Specifies the minimum port number.
         * 
         * @return builder
         * 
         */
        public Builder minimum(@Nullable Output<Integer> minimum) {
            $.minimum = minimum;
            return this;
        }

        /**
         * @param minimum Specifies the minimum port number.
         * 
         * @return builder
         * 
         */
        public Builder minimum(Integer minimum) {
            return minimum(Output.of(minimum));
        }

        public NetworkAttachedDataNetworkNetworkAddressPortTranslationPortRangeArgs build() {
            return $;
        }
    }

}
