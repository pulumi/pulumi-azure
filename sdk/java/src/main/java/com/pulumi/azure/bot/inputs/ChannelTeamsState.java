// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelTeamsState extends com.pulumi.resources.ResourceArgs {

    public static final ChannelTeamsState Empty = new ChannelTeamsState();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName")
    private @Nullable Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
    }

    /**
     * Specifies the webhook for Microsoft Teams channel calls.
     * 
     */
    @Import(name="callingWebHook")
    private @Nullable Output<String> callingWebHook;

    /**
     * @return Specifies the webhook for Microsoft Teams channel calls.
     * 
     */
    public Optional<Output<String>> callingWebHook() {
        return Optional.ofNullable(this.callingWebHook);
    }

    /**
     * Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
     * 
     */
    @Import(name="enableCalling")
    private @Nullable Output<Boolean> enableCalling;

    /**
     * @return Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableCalling() {
        return Optional.ofNullable(this.enableCalling);
    }

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ChannelTeamsState() {}

    private ChannelTeamsState(ChannelTeamsState $) {
        this.botName = $.botName;
        this.callingWebHook = $.callingWebHook;
        this.enableCalling = $.enableCalling;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelTeamsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelTeamsState $;

        public Builder() {
            $ = new ChannelTeamsState();
        }

        public Builder(ChannelTeamsState defaults) {
            $ = new ChannelTeamsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(@Nullable Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param callingWebHook Specifies the webhook for Microsoft Teams channel calls.
         * 
         * @return builder
         * 
         */
        public Builder callingWebHook(@Nullable Output<String> callingWebHook) {
            $.callingWebHook = callingWebHook;
            return this;
        }

        /**
         * @param callingWebHook Specifies the webhook for Microsoft Teams channel calls.
         * 
         * @return builder
         * 
         */
        public Builder callingWebHook(String callingWebHook) {
            return callingWebHook(Output.of(callingWebHook));
        }

        /**
         * @param enableCalling Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableCalling(@Nullable Output<Boolean> enableCalling) {
            $.enableCalling = enableCalling;
            return this;
        }

        /**
         * @param enableCalling Specifies whether to enable Microsoft Teams channel calls. This defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableCalling(Boolean enableCalling) {
            return enableCalling(Output.of(enableCalling));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ChannelTeamsState build() {
            return $;
        }
    }

}