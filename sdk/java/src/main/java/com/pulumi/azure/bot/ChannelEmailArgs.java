// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEmailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEmailArgs Empty = new ChannelEmailArgs();

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
     * The email address that the Bot will authenticate with.
     * 
     */
    @Import(name="emailAddress", required=true)
    private Output<String> emailAddress;

    /**
     * @return The email address that the Bot will authenticate with.
     * 
     */
    public Output<String> emailAddress() {
        return this.emailAddress;
    }

    /**
     * The email password that the Bot will authenticate with.
     * 
     */
    @Import(name="emailPassword")
    private @Nullable Output<String> emailPassword;

    /**
     * @return The email password that the Bot will authenticate with.
     * 
     */
    public Optional<Output<String>> emailPassword() {
        return Optional.ofNullable(this.emailPassword);
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
     * The magic code used to set up OAUTH authentication.
     * 
     */
    @Import(name="magicCode")
    private @Nullable Output<String> magicCode;

    /**
     * @return The magic code used to set up OAUTH authentication.
     * 
     */
    public Optional<Output<String>> magicCode() {
        return Optional.ofNullable(this.magicCode);
    }

    /**
     * The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ChannelEmailArgs() {}

    private ChannelEmailArgs(ChannelEmailArgs $) {
        this.botName = $.botName;
        this.emailAddress = $.emailAddress;
        this.emailPassword = $.emailPassword;
        this.location = $.location;
        this.magicCode = $.magicCode;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEmailArgs $;

        public Builder() {
            $ = new ChannelEmailArgs();
        }

        public Builder(ChannelEmailArgs defaults) {
            $ = new ChannelEmailArgs(Objects.requireNonNull(defaults));
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
         * @param emailAddress The email address that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress The email address that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param emailPassword The email password that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailPassword(@Nullable Output<String> emailPassword) {
            $.emailPassword = emailPassword;
            return this;
        }

        /**
         * @param emailPassword The email password that the Bot will authenticate with.
         * 
         * @return builder
         * 
         */
        public Builder emailPassword(String emailPassword) {
            return emailPassword(Output.of(emailPassword));
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
         * @param magicCode The magic code used to set up OAUTH authentication.
         * 
         * @return builder
         * 
         */
        public Builder magicCode(@Nullable Output<String> magicCode) {
            $.magicCode = magicCode;
            return this;
        }

        /**
         * @param magicCode The magic code used to set up OAUTH authentication.
         * 
         * @return builder
         * 
         */
        public Builder magicCode(String magicCode) {
            return magicCode(Output.of(magicCode));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
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

        public ChannelEmailArgs build() {
            if ($.botName == null) {
                throw new MissingRequiredPropertyException("ChannelEmailArgs", "botName");
            }
            if ($.emailAddress == null) {
                throw new MissingRequiredPropertyException("ChannelEmailArgs", "emailAddress");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ChannelEmailArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
