// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyIntrusionDetectionSignatureOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyIntrusionDetectionSignatureOverrideArgs Empty = new FirewallPolicyIntrusionDetectionSignatureOverrideArgs();

    /**
     * 12-digit number (id) which identifies your signature.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return 12-digit number (id) which identifies your signature.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * state can be any of `Off`, `Alert` or `Deny`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return state can be any of `Off`, `Alert` or `Deny`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private FirewallPolicyIntrusionDetectionSignatureOverrideArgs() {}

    private FirewallPolicyIntrusionDetectionSignatureOverrideArgs(FirewallPolicyIntrusionDetectionSignatureOverrideArgs $) {
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyIntrusionDetectionSignatureOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyIntrusionDetectionSignatureOverrideArgs $;

        public Builder() {
            $ = new FirewallPolicyIntrusionDetectionSignatureOverrideArgs();
        }

        public Builder(FirewallPolicyIntrusionDetectionSignatureOverrideArgs defaults) {
            $ = new FirewallPolicyIntrusionDetectionSignatureOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id 12-digit number (id) which identifies your signature.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id 12-digit number (id) which identifies your signature.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param state state can be any of `Off`, `Alert` or `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state state can be any of `Off`, `Alert` or `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public FirewallPolicyIntrusionDetectionSignatureOverrideArgs build() {
            return $;
        }
    }

}