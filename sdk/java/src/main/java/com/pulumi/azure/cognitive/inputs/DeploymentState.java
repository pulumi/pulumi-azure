// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive.inputs;

import com.pulumi.azure.cognitive.inputs.DeploymentModelArgs;
import com.pulumi.azure.cognitive.inputs.DeploymentSkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentState Empty = new DeploymentState();

    /**
     * The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="cognitiveAccountId")
    private @Nullable Output<String> cognitiveAccountId;

    /**
     * @return The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> cognitiveAccountId() {
        return Optional.ofNullable(this.cognitiveAccountId);
    }

    /**
     * Whether dynamic throttling is enabled.
     * 
     */
    @Import(name="dynamicThrottlingEnabled")
    private @Nullable Output<Boolean> dynamicThrottlingEnabled;

    /**
     * @return Whether dynamic throttling is enabled.
     * 
     */
    public Optional<Output<Boolean>> dynamicThrottlingEnabled() {
        return Optional.ofNullable(this.dynamicThrottlingEnabled);
    }

    /**
     * A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="model")
    private @Nullable Output<DeploymentModelArgs> model;

    /**
     * @return A `model` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<DeploymentModelArgs>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of RAI policy.
     * 
     */
    @Import(name="raiPolicyName")
    private @Nullable Output<String> raiPolicyName;

    /**
     * @return The name of RAI policy.
     * 
     */
    public Optional<Output<String>> raiPolicyName() {
        return Optional.ofNullable(this.raiPolicyName);
    }

    /**
     * A `sku` block as defined below.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<DeploymentSkuArgs> sku;

    /**
     * @return A `sku` block as defined below.
     * 
     */
    public Optional<Output<DeploymentSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Deployment model version upgrade option. Possible values are `OnceNewDefaultVersionAvailable`, `OnceCurrentVersionExpired`, and `NoAutoUpgrade`. Defaults to `OnceNewDefaultVersionAvailable`.
     * 
     */
    @Import(name="versionUpgradeOption")
    private @Nullable Output<String> versionUpgradeOption;

    /**
     * @return Deployment model version upgrade option. Possible values are `OnceNewDefaultVersionAvailable`, `OnceCurrentVersionExpired`, and `NoAutoUpgrade`. Defaults to `OnceNewDefaultVersionAvailable`.
     * 
     */
    public Optional<Output<String>> versionUpgradeOption() {
        return Optional.ofNullable(this.versionUpgradeOption);
    }

    private DeploymentState() {}

    private DeploymentState(DeploymentState $) {
        this.cognitiveAccountId = $.cognitiveAccountId;
        this.dynamicThrottlingEnabled = $.dynamicThrottlingEnabled;
        this.model = $.model;
        this.name = $.name;
        this.raiPolicyName = $.raiPolicyName;
        this.sku = $.sku;
        this.versionUpgradeOption = $.versionUpgradeOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentState $;

        public Builder() {
            $ = new DeploymentState();
        }

        public Builder(DeploymentState defaults) {
            $ = new DeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(@Nullable Output<String> cognitiveAccountId) {
            $.cognitiveAccountId = cognitiveAccountId;
            return this;
        }

        /**
         * @param cognitiveAccountId The ID of the Cognitive Services Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveAccountId(String cognitiveAccountId) {
            return cognitiveAccountId(Output.of(cognitiveAccountId));
        }

        /**
         * @param dynamicThrottlingEnabled Whether dynamic throttling is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dynamicThrottlingEnabled(@Nullable Output<Boolean> dynamicThrottlingEnabled) {
            $.dynamicThrottlingEnabled = dynamicThrottlingEnabled;
            return this;
        }

        /**
         * @param dynamicThrottlingEnabled Whether dynamic throttling is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dynamicThrottlingEnabled(Boolean dynamicThrottlingEnabled) {
            return dynamicThrottlingEnabled(Output.of(dynamicThrottlingEnabled));
        }

        /**
         * @param model A `model` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<DeploymentModelArgs> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model A `model` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder model(DeploymentModelArgs model) {
            return model(Output.of(model));
        }

        /**
         * @param name The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cognitive Services Account Deployment. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param raiPolicyName The name of RAI policy.
         * 
         * @return builder
         * 
         */
        public Builder raiPolicyName(@Nullable Output<String> raiPolicyName) {
            $.raiPolicyName = raiPolicyName;
            return this;
        }

        /**
         * @param raiPolicyName The name of RAI policy.
         * 
         * @return builder
         * 
         */
        public Builder raiPolicyName(String raiPolicyName) {
            return raiPolicyName(Output.of(raiPolicyName));
        }

        /**
         * @param sku A `sku` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<DeploymentSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku A `sku` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sku(DeploymentSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param versionUpgradeOption Deployment model version upgrade option. Possible values are `OnceNewDefaultVersionAvailable`, `OnceCurrentVersionExpired`, and `NoAutoUpgrade`. Defaults to `OnceNewDefaultVersionAvailable`.
         * 
         * @return builder
         * 
         */
        public Builder versionUpgradeOption(@Nullable Output<String> versionUpgradeOption) {
            $.versionUpgradeOption = versionUpgradeOption;
            return this;
        }

        /**
         * @param versionUpgradeOption Deployment model version upgrade option. Possible values are `OnceNewDefaultVersionAvailable`, `OnceCurrentVersionExpired`, and `NoAutoUpgrade`. Defaults to `OnceNewDefaultVersionAvailable`.
         * 
         * @return builder
         * 
         */
        public Builder versionUpgradeOption(String versionUpgradeOption) {
            return versionUpgradeOption(Output.of(versionUpgradeOption));
        }

        public DeploymentState build() {
            return $;
        }
    }

}
