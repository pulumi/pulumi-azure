// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.inputs;

import com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SynapseSparkState extends com.pulumi.resources.ResourceArgs {

    public static final SynapseSparkState Empty = new SynapseSparkState();

    /**
     * The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<SynapseSparkIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<SynapseSparkIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="localAuthEnabled")
    private @Nullable Output<Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<Boolean>> localAuthEnabled() {
        return Optional.ofNullable(this.localAuthEnabled);
    }

    /**
     * The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="machineLearningWorkspaceId")
    private @Nullable Output<String> machineLearningWorkspaceId;

    /**
     * @return The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<String>> machineLearningWorkspaceId() {
        return Optional.ofNullable(this.machineLearningWorkspaceId);
    }

    /**
     * The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="synapseSparkPoolId")
    private @Nullable Output<String> synapseSparkPoolId;

    /**
     * @return The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<String>> synapseSparkPoolId() {
        return Optional.ofNullable(this.synapseSparkPoolId);
    }

    /**
     * A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SynapseSparkState() {}

    private SynapseSparkState(SynapseSparkState $) {
        this.description = $.description;
        this.identity = $.identity;
        this.localAuthEnabled = $.localAuthEnabled;
        this.location = $.location;
        this.machineLearningWorkspaceId = $.machineLearningWorkspaceId;
        this.name = $.name;
        this.synapseSparkPoolId = $.synapseSparkPoolId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SynapseSparkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SynapseSparkState $;

        public Builder() {
            $ = new SynapseSparkState();
        }

        public Builder(SynapseSparkState defaults) {
            $ = new SynapseSparkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<SynapseSparkIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(SynapseSparkIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param localAuthEnabled Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(@Nullable Output<Boolean> localAuthEnabled) {
            $.localAuthEnabled = localAuthEnabled;
            return this;
        }

        /**
         * @param localAuthEnabled Whether local authentication methods is enabled. Defaults to `true`. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(Boolean localAuthEnabled) {
            return localAuthEnabled(Output.of(localAuthEnabled));
        }

        /**
         * @param location The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Machine Learning Synapse Spark should exist. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param machineLearningWorkspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder machineLearningWorkspaceId(@Nullable Output<String> machineLearningWorkspaceId) {
            $.machineLearningWorkspaceId = machineLearningWorkspaceId;
            return this;
        }

        /**
         * @param machineLearningWorkspaceId The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder machineLearningWorkspaceId(String machineLearningWorkspaceId) {
            return machineLearningWorkspaceId(Output.of(machineLearningWorkspaceId));
        }

        /**
         * @param name The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param synapseSparkPoolId The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseSparkPoolId(@Nullable Output<String> synapseSparkPoolId) {
            $.synapseSparkPoolId = synapseSparkPoolId;
            return this;
        }

        /**
         * @param synapseSparkPoolId The ID of the linked Synapse Spark Pool. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseSparkPoolId(String synapseSparkPoolId) {
            return synapseSparkPoolId(Output.of(synapseSparkPoolId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Machine Learning Synapse Spark. Changing this forces a new Machine Learning Synapse Spark to be created.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SynapseSparkState build() {
            return $;
        }
    }

}
