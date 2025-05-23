// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDataCollectionEndpointResult {
    /**
     * @return The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    private String configurationAccessEndpoint;
    /**
     * @return Specifies a description for the Data Collection Endpoint.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The immutable ID of the Data Collection Endpoint.
     * 
     */
    private String immutableId;
    /**
     * @return The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    private String kind;
    /**
     * @return The Azure Region where the Data Collection Endpoint should exist.
     * 
     */
    private String location;
    /**
     * @return The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    private String logsIngestionEndpoint;
    /**
     * @return The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
     * 
     */
    private String metricsIngestionEndpoint;
    private String name;
    /**
     * @return Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
     * 
     */
    private Boolean publicNetworkAccessEnabled;
    private String resourceGroupName;
    /**
     * @return A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    private Map<String,String> tags;

    private GetDataCollectionEndpointResult() {}
    /**
     * @return The endpoint used for accessing configuration, e.g., `https://mydce-abcd.eastus-1.control.monitor.azure.com`.
     * 
     */
    public String configurationAccessEndpoint() {
        return this.configurationAccessEndpoint;
    }
    /**
     * @return Specifies a description for the Data Collection Endpoint.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The immutable ID of the Data Collection Endpoint.
     * 
     */
    public String immutableId() {
        return this.immutableId;
    }
    /**
     * @return The kind of the Data Collection Endpoint. Possible values are `Linux` and `Windows`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The Azure Region where the Data Collection Endpoint should exist.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The endpoint used for ingesting logs, e.g., `https://mydce-abcd.eastus-1.ingest.monitor.azure.com`.
     * 
     */
    public String logsIngestionEndpoint() {
        return this.logsIngestionEndpoint;
    }
    /**
     * @return The endpoint used for ingesting metrics, e.g., `https://mydce-abcd.eastus-1.metrics.ingest.monitor.azure.com`.
     * 
     */
    public String metricsIngestionEndpoint() {
        return this.metricsIngestionEndpoint;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Whether network access from public internet to the Data Collection Endpoint are allowed. Possible values are `true` and `false`.
     * 
     */
    public Boolean publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags which should be assigned to the Data Collection Endpoint.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionEndpointResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configurationAccessEndpoint;
        private String description;
        private String id;
        private String immutableId;
        private String kind;
        private String location;
        private String logsIngestionEndpoint;
        private String metricsIngestionEndpoint;
        private String name;
        private Boolean publicNetworkAccessEnabled;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetDataCollectionEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAccessEndpoint = defaults.configurationAccessEndpoint;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.immutableId = defaults.immutableId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.logsIngestionEndpoint = defaults.logsIngestionEndpoint;
    	      this.metricsIngestionEndpoint = defaults.metricsIngestionEndpoint;
    	      this.name = defaults.name;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder configurationAccessEndpoint(String configurationAccessEndpoint) {
            if (configurationAccessEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "configurationAccessEndpoint");
            }
            this.configurationAccessEndpoint = configurationAccessEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder immutableId(String immutableId) {
            if (immutableId == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "immutableId");
            }
            this.immutableId = immutableId;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder logsIngestionEndpoint(String logsIngestionEndpoint) {
            if (logsIngestionEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "logsIngestionEndpoint");
            }
            this.logsIngestionEndpoint = logsIngestionEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder metricsIngestionEndpoint(String metricsIngestionEndpoint) {
            if (metricsIngestionEndpoint == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "metricsIngestionEndpoint");
            }
            this.metricsIngestionEndpoint = metricsIngestionEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            if (publicNetworkAccessEnabled == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "publicNetworkAccessEnabled");
            }
            this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionEndpointResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public GetDataCollectionEndpointResult build() {
            final var _resultValue = new GetDataCollectionEndpointResult();
            _resultValue.configurationAccessEndpoint = configurationAccessEndpoint;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.immutableId = immutableId;
            _resultValue.kind = kind;
            _resultValue.location = location;
            _resultValue.logsIngestionEndpoint = logsIngestionEndpoint;
            _resultValue.metricsIngestionEndpoint = metricsIngestionEndpoint;
            _resultValue.name = name;
            _resultValue.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
