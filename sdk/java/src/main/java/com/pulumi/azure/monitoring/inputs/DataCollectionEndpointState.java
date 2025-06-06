// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionEndpointState Empty = new DataCollectionEndpointState();

    /**
     * The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    @Import(name="configurationAccessEndpoint")
    private @Nullable Output<String> configurationAccessEndpoint;

    /**
     * @return The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    public Optional<Output<String>> configurationAccessEndpoint() {
        return Optional.ofNullable(this.configurationAccessEndpoint);
    }

    /**
     * Specifies a description for the Data Collection Endpoint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies a description for the Data Collection Endpoint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The immutable ID of the Data Collection Endpoint.
     * 
     */
    @Import(name="immutableId")
    private @Nullable Output<String> immutableId;

    /**
     * @return The immutable ID of the Data Collection Endpoint.
     * 
     */
    public Optional<Output<String>> immutableId() {
        return Optional.ofNullable(this.immutableId);
    }

    /**
     * The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    @Import(name="logsIngestionEndpoint")
    private @Nullable Output<String> logsIngestionEndpoint;

    /**
     * @return The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    public Optional<Output<String>> logsIngestionEndpoint() {
        return Optional.ofNullable(this.logsIngestionEndpoint);
    }

    /**
     * The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
     * 
     */
    @Import(name="metricsIngestionEndpoint")
    private @Nullable Output<String> metricsIngestionEndpoint;

    /**
     * @return The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
     * 
     */
    public Optional<Output<String>> metricsIngestionEndpoint() {
        return Optional.ofNullable(this.metricsIngestionEndpoint);
    }

    /**
     * The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DataCollectionEndpointState() {}

    private DataCollectionEndpointState(DataCollectionEndpointState $) {
        this.configurationAccessEndpoint = $.configurationAccessEndpoint;
        this.description = $.description;
        this.immutableId = $.immutableId;
        this.kind = $.kind;
        this.location = $.location;
        this.logsIngestionEndpoint = $.logsIngestionEndpoint;
        this.metricsIngestionEndpoint = $.metricsIngestionEndpoint;
        this.name = $.name;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionEndpointState $;

        public Builder() {
            $ = new DataCollectionEndpointState();
        }

        public Builder(DataCollectionEndpointState defaults) {
            $ = new DataCollectionEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationAccessEndpoint The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder configurationAccessEndpoint(@Nullable Output<String> configurationAccessEndpoint) {
            $.configurationAccessEndpoint = configurationAccessEndpoint;
            return this;
        }

        /**
         * @param configurationAccessEndpoint The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder configurationAccessEndpoint(String configurationAccessEndpoint) {
            return configurationAccessEndpoint(Output.of(configurationAccessEndpoint));
        }

        /**
         * @param description Specifies a description for the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies a description for the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param immutableId The immutable ID of the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder immutableId(@Nullable Output<String> immutableId) {
            $.immutableId = immutableId;
            return this;
        }

        /**
         * @param immutableId The immutable ID of the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder immutableId(String immutableId) {
            return immutableId(Output.of(immutableId));
        }

        /**
         * @param kind The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logsIngestionEndpoint The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder logsIngestionEndpoint(@Nullable Output<String> logsIngestionEndpoint) {
            $.logsIngestionEndpoint = logsIngestionEndpoint;
            return this;
        }

        /**
         * @param logsIngestionEndpoint The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder logsIngestionEndpoint(String logsIngestionEndpoint) {
            return logsIngestionEndpoint(Output.of(logsIngestionEndpoint));
        }

        /**
         * @param metricsIngestionEndpoint The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder metricsIngestionEndpoint(@Nullable Output<String> metricsIngestionEndpoint) {
            $.metricsIngestionEndpoint = metricsIngestionEndpoint;
            return this;
        }

        /**
         * @param metricsIngestionEndpoint The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
         * 
         * @return builder
         * 
         */
        public Builder metricsIngestionEndpoint(String metricsIngestionEndpoint) {
            return metricsIngestionEndpoint(Output.of(metricsIngestionEndpoint));
        }

        /**
         * @param name The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Data Collection Endpoint. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccessEnabled Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`. Default to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Data Collection Endpoint should exist. Changing this forces a new Data Collection Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Data Collection Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DataCollectionEndpointState build() {
            return $;
        }
    }

}
