// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.azure.cdn.inputs.FrontdoorSecretSecretArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorSecretState extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorSecretState Empty = new FrontdoorSecretState();

    /**
     * The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="cdnFrontdoorProfileId")
    private @Nullable Output<String> cdnFrontdoorProfileId;

    /**
     * @return The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Optional<Output<String>> cdnFrontdoorProfileId() {
        return Optional.ofNullable(this.cdnFrontdoorProfileId);
    }

    /**
     * The name of the Front Door Profile containing this Front Door Secret.
     * 
     */
    @Import(name="cdnFrontdoorProfileName")
    private @Nullable Output<String> cdnFrontdoorProfileName;

    /**
     * @return The name of the Front Door Profile containing this Front Door Secret.
     * 
     */
    public Optional<Output<String>> cdnFrontdoorProfileName() {
        return Optional.ofNullable(this.cdnFrontdoorProfileName);
    }

    /**
     * The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<FrontdoorSecretSecretArgs> secret;

    /**
     * @return A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
     * 
     */
    public Optional<Output<FrontdoorSecretSecretArgs>> secret() {
        return Optional.ofNullable(this.secret);
    }

    private FrontdoorSecretState() {}

    private FrontdoorSecretState(FrontdoorSecretState $) {
        this.cdnFrontdoorProfileId = $.cdnFrontdoorProfileId;
        this.cdnFrontdoorProfileName = $.cdnFrontdoorProfileName;
        this.name = $.name;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorSecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorSecretState $;

        public Builder() {
            $ = new FrontdoorSecretState();
        }

        public Builder(FrontdoorSecretState defaults) {
            $ = new FrontdoorSecretState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cdnFrontdoorProfileId The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(@Nullable Output<String> cdnFrontdoorProfileId) {
            $.cdnFrontdoorProfileId = cdnFrontdoorProfileId;
            return this;
        }

        /**
         * @param cdnFrontdoorProfileId The Resource ID of the Front Door Profile. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileId(String cdnFrontdoorProfileId) {
            return cdnFrontdoorProfileId(Output.of(cdnFrontdoorProfileId));
        }

        /**
         * @param cdnFrontdoorProfileName The name of the Front Door Profile containing this Front Door Secret.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileName(@Nullable Output<String> cdnFrontdoorProfileName) {
            $.cdnFrontdoorProfileName = cdnFrontdoorProfileName;
            return this;
        }

        /**
         * @param cdnFrontdoorProfileName The name of the Front Door Profile containing this Front Door Secret.
         * 
         * @return builder
         * 
         */
        public Builder cdnFrontdoorProfileName(String cdnFrontdoorProfileName) {
            return cdnFrontdoorProfileName(Output.of(cdnFrontdoorProfileName));
        }

        /**
         * @param name The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Front Door Secret. Possible values must start with a letter or a number, only contain letters, numbers and hyphens and have a length of between 2 and 260 characters. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<FrontdoorSecretSecretArgs> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret A `secret` block as defined below. Changing this forces a new Front Door Secret to be created.
         * 
         * @return builder
         * 
         */
        public Builder secret(FrontdoorSecretSecretArgs secret) {
            return secret(Output.of(secret));
        }

        public FrontdoorSecretState build() {
            return $;
        }
    }

}
