// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MonitorTagRuleMetricFilter {
    /**
     * @return Allowed values Include or Exclude.
     * 
     */
    private String action;
    /**
     * @return Name of the Tag.
     * 
     */
    private String name;
    /**
     * @return Value of the Tag.
     * 
     */
    private String value;

    private MonitorTagRuleMetricFilter() {}
    /**
     * @return Allowed values Include or Exclude.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Name of the Tag.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the Tag.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorTagRuleMetricFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String name;
        private String value;
        public Builder() {}
        public Builder(MonitorTagRuleMetricFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("MonitorTagRuleMetricFilter", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("MonitorTagRuleMetricFilter", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("MonitorTagRuleMetricFilter", "value");
            }
            this.value = value;
            return this;
        }
        public MonitorTagRuleMetricFilter build() {
            final var _resultValue = new MonitorTagRuleMetricFilter();
            _resultValue.action = action;
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
