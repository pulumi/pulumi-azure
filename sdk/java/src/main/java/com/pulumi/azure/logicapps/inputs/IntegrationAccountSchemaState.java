// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountSchemaState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountSchemaState Empty = new IntegrationAccountSchemaState();

    /**
     * The content of the Logic App Integration Account Schema.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The content of the Logic App Integration Account Schema.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The file name of the Logic App Integration Account Schema.
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<String> fileName;

    /**
     * @return The file name of the Logic App Integration Account Schema.
     * 
     */
    public Optional<Output<String>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    @Import(name="integrationAccountName")
    private @Nullable Output<String> integrationAccountName;

    /**
     * @return The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    public Optional<Output<String>> integrationAccountName() {
        return Optional.ofNullable(this.integrationAccountName);
    }

    /**
     * The metadata of the Logic App Integration Account Schema.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return The metadata of the Logic App Integration Account Schema.
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name which should be used for this Logic App Integration Account Schema. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account Schema. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Logic App Integration Account Schema should exist. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account Schema should exist. Changing this forces a new Logic App Integration Account Schema to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IntegrationAccountSchemaState() {}

    private IntegrationAccountSchemaState(IntegrationAccountSchemaState $) {
        this.content = $.content;
        this.fileName = $.fileName;
        this.integrationAccountName = $.integrationAccountName;
        this.metadata = $.metadata;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountSchemaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountSchemaState $;

        public Builder() {
            $ = new IntegrationAccountSchemaState();
        }

        public Builder(IntegrationAccountSchemaState defaults) {
            $ = new IntegrationAccountSchemaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The content of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param fileName The file name of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<String> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName The file name of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(@Nullable Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata of the Logic App Integration Account Schema.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Schema. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Schema. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Schema should exist. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Schema should exist. Changing this forces a new Logic App Integration Account Schema to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IntegrationAccountSchemaState build() {
            return $;
        }
    }

}
