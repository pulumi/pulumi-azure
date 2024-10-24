// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalSchemaState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalSchemaState Empty = new GlobalSchemaState();

    /**
     * The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * The description of the schema.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the schema.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A unique identifier for this Schema. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="schemaId")
    private @Nullable Output<String> schemaId;

    /**
     * @return A unique identifier for this Schema. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }

    /**
     * The content type of the Schema. Possible values are `xml` and `json`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The content type of the Schema. Possible values are `xml` and `json`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The string defining the document representing the Schema.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The string defining the document representing the Schema.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GlobalSchemaState() {}

    private GlobalSchemaState(GlobalSchemaState $) {
        this.apiManagementName = $.apiManagementName;
        this.description = $.description;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaId = $.schemaId;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalSchemaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalSchemaState $;

        public Builder() {
            $ = new GlobalSchemaState();
        }

        public Builder(GlobalSchemaState defaults) {
            $ = new GlobalSchemaState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param description The description of the schema.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the schema.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaId A unique identifier for this Schema. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(@Nullable Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        /**
         * @param schemaId A unique identifier for this Schema. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        /**
         * @param type The content type of the Schema. Possible values are `xml` and `json`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The content type of the Schema. Possible values are `xml` and `json`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The string defining the document representing the Schema.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The string defining the document representing the Schema.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GlobalSchemaState build() {
            return $;
        }
    }

}
