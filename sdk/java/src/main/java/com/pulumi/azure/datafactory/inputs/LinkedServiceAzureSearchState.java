// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceAzureSearchState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceAzureSearchState Empty = new LinkedServiceAzureSearchState();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential to connect to Azure Search Service.
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<String> encryptedCredential;

    /**
     * @return The encrypted credential to connect to Azure Search Service.
     * 
     */
    public Optional<Output<String>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The key of the Azure Search Service.
     * 
     */
    @Import(name="searchServiceKey")
    private @Nullable Output<String> searchServiceKey;

    /**
     * @return The key of the Azure Search Service.
     * 
     */
    public Optional<Output<String>> searchServiceKey() {
        return Optional.ofNullable(this.searchServiceKey);
    }

    /**
     * The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private LinkedServiceAzureSearchState() {}

    private LinkedServiceAzureSearchState(LinkedServiceAzureSearchState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.name = $.name;
        this.parameters = $.parameters;
        this.searchServiceKey = $.searchServiceKey;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceAzureSearchState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceAzureSearchState $;

        public Builder() {
            $ = new LinkedServiceAzureSearchState();
        }

        public Builder(LinkedServiceAzureSearchState defaults) {
            $ = new LinkedServiceAzureSearchState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptedCredential The encrypted credential to connect to Azure Search Service.
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<String> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential to connect to Azure Search Service.
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(String encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param searchServiceKey The key of the Azure Search Service.
         * 
         * @return builder
         * 
         */
        public Builder searchServiceKey(@Nullable Output<String> searchServiceKey) {
            $.searchServiceKey = searchServiceKey;
            return this;
        }

        /**
         * @param searchServiceKey The key of the Azure Search Service.
         * 
         * @return builder
         * 
         */
        public Builder searchServiceKey(String searchServiceKey) {
            return searchServiceKey(Output.of(searchServiceKey));
        }

        /**
         * @param url The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the Search Service endpoint (e.g. https://{searchServiceName}.search.windows.net).
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public LinkedServiceAzureSearchState build() {
            return $;
        }
    }

}