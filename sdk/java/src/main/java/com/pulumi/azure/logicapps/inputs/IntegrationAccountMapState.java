// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountMapState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountMapState Empty = new IntegrationAccountMapState();

    /**
     * The content of the Logic App Integration Account Map.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content of the Logic App Integration Account Map.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    @Import(name="integrationAccountName")
    private @Nullable Output<String> integrationAccountName;

    /**
     * @return The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    public Optional<Output<String>> integrationAccountName() {
        return Optional.ofNullable(this.integrationAccountName);
    }

    /**
     * The type of the Logic App Integration Account Map.
     * 
     */
    @Import(name="mapType")
    private @Nullable Output<String> mapType;

    /**
     * @return The type of the Logic App Integration Account Map.
     * 
     */
    public Optional<Output<String>> mapType() {
        return Optional.ofNullable(this.mapType);
    }

    /**
     * The metadata of the Logic App Integration Account Map.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The metadata of the Logic App Integration Account Map.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IntegrationAccountMapState() {}

    private IntegrationAccountMapState(IntegrationAccountMapState $) {
        this.content = $.content;
        this.integrationAccountName = $.integrationAccountName;
        this.mapType = $.mapType;
        this.metadata = $.metadata;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountMapState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountMapState $;

        public Builder() {
            $ = new IntegrationAccountMapState();
        }

        public Builder(IntegrationAccountMapState defaults) {
            $ = new IntegrationAccountMapState(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(@Nullable Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param mapType The type of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder mapType(@Nullable Output<String> mapType) {
            $.mapType = mapType;
            return this;
        }

        /**
         * @param mapType The type of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder mapType(String mapType) {
            return mapType(Output.of(mapType));
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Map.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Map. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Map should exist. Changing this forces a new Logic App Integration Account Map to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IntegrationAccountMapState build() {
            return $;
        }
    }

}