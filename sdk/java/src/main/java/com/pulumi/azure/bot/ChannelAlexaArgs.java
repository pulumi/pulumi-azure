// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelAlexaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelAlexaArgs Empty = new ChannelAlexaArgs();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
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
     * The name of the resource group where the Alexa Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Alexa Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Alexa skill ID for the Alexa Channel.
     * 
     */
    @Import(name="skillId", required=true)
    private Output<String> skillId;

    /**
     * @return The Alexa skill ID for the Alexa Channel.
     * 
     */
    public Output<String> skillId() {
        return this.skillId;
    }

    private ChannelAlexaArgs() {}

    private ChannelAlexaArgs(ChannelAlexaArgs $) {
        this.botName = $.botName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.skillId = $.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelAlexaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelAlexaArgs $;

        public Builder() {
            $ = new ChannelAlexaArgs();
        }

        public Builder(ChannelAlexaArgs defaults) {
            $ = new ChannelAlexaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
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
         * @param resourceGroupName The name of the resource group where the Alexa Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Alexa Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skillId The Alexa skill ID for the Alexa Channel.
         * 
         * @return builder
         * 
         */
        public Builder skillId(Output<String> skillId) {
            $.skillId = skillId;
            return this;
        }

        /**
         * @param skillId The Alexa skill ID for the Alexa Channel.
         * 
         * @return builder
         * 
         */
        public Builder skillId(String skillId) {
            return skillId(Output.of(skillId));
        }

        public ChannelAlexaArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.skillId = Objects.requireNonNull($.skillId, "expected parameter 'skillId' to be non-null");
            return $;
        }
    }

}