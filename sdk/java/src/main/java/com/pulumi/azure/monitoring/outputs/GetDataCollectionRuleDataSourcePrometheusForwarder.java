// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataCollectionRuleDataSourcePrometheusForwarder {
    /**
     * @return One or more `label_include_filter` blocks as defined above.
     * 
     */
    private List<GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter> labelIncludeFilters;
    /**
     * @return Specifies the name of the Data Collection Rule.
     * 
     */
    private String name;
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    private List<String> streams;

    private GetDataCollectionRuleDataSourcePrometheusForwarder() {}
    /**
     * @return One or more `label_include_filter` blocks as defined above.
     * 
     */
    public List<GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter> labelIncludeFilters() {
        return this.labelIncludeFilters;
    }
    /**
     * @return Specifies the name of the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    public List<String> streams() {
        return this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleDataSourcePrometheusForwarder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter> labelIncludeFilters;
        private String name;
        private List<String> streams;
        public Builder() {}
        public Builder(GetDataCollectionRuleDataSourcePrometheusForwarder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelIncludeFilters = defaults.labelIncludeFilters;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        @CustomType.Setter
        public Builder labelIncludeFilters(List<GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter> labelIncludeFilters) {
            if (labelIncludeFilters == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDataSourcePrometheusForwarder", "labelIncludeFilters");
            }
            this.labelIncludeFilters = labelIncludeFilters;
            return this;
        }
        public Builder labelIncludeFilters(GetDataCollectionRuleDataSourcePrometheusForwarderLabelIncludeFilter... labelIncludeFilters) {
            return labelIncludeFilters(List.of(labelIncludeFilters));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDataSourcePrometheusForwarder", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder streams(List<String> streams) {
            if (streams == null) {
              throw new MissingRequiredPropertyException("GetDataCollectionRuleDataSourcePrometheusForwarder", "streams");
            }
            this.streams = streams;
            return this;
        }
        public Builder streams(String... streams) {
            return streams(List.of(streams));
        }
        public GetDataCollectionRuleDataSourcePrometheusForwarder build() {
            final var _resultValue = new GetDataCollectionRuleDataSourcePrometheusForwarder();
            _resultValue.labelIncludeFilters = labelIncludeFilters;
            _resultValue.name = name;
            _resultValue.streams = streams;
            return _resultValue;
        }
    }
}
