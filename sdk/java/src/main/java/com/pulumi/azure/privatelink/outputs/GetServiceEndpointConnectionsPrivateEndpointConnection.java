// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceEndpointConnectionsPrivateEndpointConnection {
    /**
     * @return A message indicating if changes on the service provider require any updates or not.
     * 
     */
    private String actionRequired;
    /**
     * @return The resource id of the private link service connection between the private link service and the private link endpoint.
     * 
     */
    private String connectionId;
    /**
     * @return The name of the connection between the private link service and the private link endpoint.
     * 
     */
    private String connectionName;
    /**
     * @return The request for approval message or the reason for rejection message.
     * 
     */
    private String description;
    /**
     * @return The resource id of the private link endpoint.
     * 
     */
    private String privateEndpointId;
    /**
     * @return The name of the private link endpoint.
     * 
     */
    private String privateEndpointName;
    /**
     * @return Indicates the state of the connection between the private link service and the private link endpoint, possible values are `Pending`, `Approved` or `Rejected`.
     * 
     */
    private String status;

    private GetServiceEndpointConnectionsPrivateEndpointConnection() {}
    /**
     * @return A message indicating if changes on the service provider require any updates or not.
     * 
     */
    public String actionRequired() {
        return this.actionRequired;
    }
    /**
     * @return The resource id of the private link service connection between the private link service and the private link endpoint.
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }
    /**
     * @return The name of the connection between the private link service and the private link endpoint.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * @return The request for approval message or the reason for rejection message.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The resource id of the private link endpoint.
     * 
     */
    public String privateEndpointId() {
        return this.privateEndpointId;
    }
    /**
     * @return The name of the private link endpoint.
     * 
     */
    public String privateEndpointName() {
        return this.privateEndpointName;
    }
    /**
     * @return Indicates the state of the connection between the private link service and the private link endpoint, possible values are `Pending`, `Approved` or `Rejected`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceEndpointConnectionsPrivateEndpointConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionRequired;
        private String connectionId;
        private String connectionName;
        private String description;
        private String privateEndpointId;
        private String privateEndpointName;
        private String status;
        public Builder() {}
        public Builder(GetServiceEndpointConnectionsPrivateEndpointConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionRequired = defaults.actionRequired;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionName = defaults.connectionName;
    	      this.description = defaults.description;
    	      this.privateEndpointId = defaults.privateEndpointId;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder actionRequired(String actionRequired) {
            if (actionRequired == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "actionRequired");
            }
            this.actionRequired = actionRequired;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            if (connectionName == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "connectionName");
            }
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointId(String privateEndpointId) {
            if (privateEndpointId == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "privateEndpointId");
            }
            this.privateEndpointId = privateEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointName(String privateEndpointName) {
            if (privateEndpointName == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "privateEndpointName");
            }
            this.privateEndpointName = privateEndpointName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetServiceEndpointConnectionsPrivateEndpointConnection", "status");
            }
            this.status = status;
            return this;
        }
        public GetServiceEndpointConnectionsPrivateEndpointConnection build() {
            final var _resultValue = new GetServiceEndpointConnectionsPrivateEndpointConnection();
            _resultValue.actionRequired = actionRequired;
            _resultValue.connectionId = connectionId;
            _resultValue.connectionName = connectionName;
            _resultValue.description = description;
            _resultValue.privateEndpointId = privateEndpointId;
            _resultValue.privateEndpointName = privateEndpointName;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
