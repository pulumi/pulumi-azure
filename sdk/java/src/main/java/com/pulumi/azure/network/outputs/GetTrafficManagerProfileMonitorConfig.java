// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetTrafficManagerProfileMonitorConfigCustomHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrafficManagerProfileMonitorConfig {
    /**
     * @return One or more `custom_header` blocks as defined below.
     * 
     */
    private List<GetTrafficManagerProfileMonitorConfigCustomHeader> customHeaders;
    /**
     * @return A list of status code ranges.
     * 
     */
    private List<String> expectedStatusCodeRanges;
    /**
     * @return The interval used to check the endpoint health from a Traffic Manager probing agent.
     * 
     */
    private Integer intervalInSeconds;
    /**
     * @return The path used by the monitoring checks.
     * 
     */
    private String path;
    /**
     * @return The port number used by the monitoring checks.
     * 
     */
    private Integer port;
    /**
     * @return The protocol used by the monitoring checks.
     * 
     */
    private String protocol;
    /**
     * @return The amount of time the Traffic Manager probing agent should wait before considering that check a failure when a health check probe is sent to the endpoint.
     * 
     */
    private Integer timeoutInSeconds;
    /**
     * @return The number of failures a Traffic Manager probing agent tolerates before marking that endpoint as unhealthy.
     * 
     */
    private Integer toleratedNumberOfFailures;

    private GetTrafficManagerProfileMonitorConfig() {}
    /**
     * @return One or more `custom_header` blocks as defined below.
     * 
     */
    public List<GetTrafficManagerProfileMonitorConfigCustomHeader> customHeaders() {
        return this.customHeaders;
    }
    /**
     * @return A list of status code ranges.
     * 
     */
    public List<String> expectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges;
    }
    /**
     * @return The interval used to check the endpoint health from a Traffic Manager probing agent.
     * 
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }
    /**
     * @return The path used by the monitoring checks.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The port number used by the monitoring checks.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The protocol used by the monitoring checks.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The amount of time the Traffic Manager probing agent should wait before considering that check a failure when a health check probe is sent to the endpoint.
     * 
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    /**
     * @return The number of failures a Traffic Manager probing agent tolerates before marking that endpoint as unhealthy.
     * 
     */
    public Integer toleratedNumberOfFailures() {
        return this.toleratedNumberOfFailures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrafficManagerProfileMonitorConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrafficManagerProfileMonitorConfigCustomHeader> customHeaders;
        private List<String> expectedStatusCodeRanges;
        private Integer intervalInSeconds;
        private String path;
        private Integer port;
        private String protocol;
        private Integer timeoutInSeconds;
        private Integer toleratedNumberOfFailures;
        public Builder() {}
        public Builder(GetTrafficManagerProfileMonitorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.expectedStatusCodeRanges = defaults.expectedStatusCodeRanges;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.toleratedNumberOfFailures = defaults.toleratedNumberOfFailures;
        }

        @CustomType.Setter
        public Builder customHeaders(List<GetTrafficManagerProfileMonitorConfigCustomHeader> customHeaders) {
            this.customHeaders = Objects.requireNonNull(customHeaders);
            return this;
        }
        public Builder customHeaders(GetTrafficManagerProfileMonitorConfigCustomHeader... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        @CustomType.Setter
        public Builder expectedStatusCodeRanges(List<String> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = Objects.requireNonNull(expectedStatusCodeRanges);
            return this;
        }
        public Builder expectedStatusCodeRanges(String... expectedStatusCodeRanges) {
            return expectedStatusCodeRanges(List.of(expectedStatusCodeRanges));
        }
        @CustomType.Setter
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = Objects.requireNonNull(intervalInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder toleratedNumberOfFailures(Integer toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = Objects.requireNonNull(toleratedNumberOfFailures);
            return this;
        }
        public GetTrafficManagerProfileMonitorConfig build() {
            final var o = new GetTrafficManagerProfileMonitorConfig();
            o.customHeaders = customHeaders;
            o.expectedStatusCodeRanges = expectedStatusCodeRanges;
            o.intervalInSeconds = intervalInSeconds;
            o.path = path;
            o.port = port;
            o.protocol = protocol;
            o.timeoutInSeconds = timeoutInSeconds;
            o.toleratedNumberOfFailures = toleratedNumberOfFailures;
            return o;
        }
    }
}