// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataCollectionRuleDataFlow {
    /**
     * @return Specifies a list of destination names. A `azure_monitor_metrics` data source only allows for stream of kind `Microsoft-InsightsMetrics`.
     * 
     */
    private List<String> destinations;
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values are `Microsoft-Event`,and `Microsoft-WindowsEvent`.
     * 
     */
    private List<String> streams;

    private GetDataCollectionRuleDataFlow() {}
    /**
     * @return Specifies a list of destination names. A `azure_monitor_metrics` data source only allows for stream of kind `Microsoft-InsightsMetrics`.
     * 
     */
    public List<String> destinations() {
        return this.destinations;
    }
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values are `Microsoft-Event`,and `Microsoft-WindowsEvent`.
     * 
     */
    public List<String> streams() {
        return this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleDataFlow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> destinations;
        private List<String> streams;
        public Builder() {}
        public Builder(GetDataCollectionRuleDataFlow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.streams = defaults.streams;
        }

        @CustomType.Setter
        public Builder destinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder streams(List<String> streams) {
            this.streams = Objects.requireNonNull(streams);
            return this;
        }
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }
        public GetDataCollectionRuleDataFlow build() {
            final var o = new GetDataCollectionRuleDataFlow();
            o.destinations = destinations;
            o.streams = streams;
            return o;
        }
    }
}