// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionRuleDestinationsEventHub {
    /**
     * @return The resource ID of the Event Hub.
     * 
     */
    private String eventHubId;
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    private String name;

    private DataCollectionRuleDestinationsEventHub() {}
    /**
     * @return The resource ID of the Event Hub.
     * 
     */
    public String eventHubId() {
        return this.eventHubId;
    }
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinationsEventHub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventHubId;
        private String name;
        public Builder() {}
        public Builder(DataCollectionRuleDestinationsEventHub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubId = defaults.eventHubId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder eventHubId(String eventHubId) {
            this.eventHubId = Objects.requireNonNull(eventHubId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public DataCollectionRuleDestinationsEventHub build() {
            final var o = new DataCollectionRuleDestinationsEventHub();
            o.eventHubId = eventHubId;
            o.name = name;
            return o;
        }
    }
}