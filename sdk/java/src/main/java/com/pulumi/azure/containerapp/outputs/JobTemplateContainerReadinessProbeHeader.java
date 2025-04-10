// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobTemplateContainerReadinessProbeHeader {
    /**
     * @return The HTTP Header Name.
     * 
     */
    private String name;
    /**
     * @return The HTTP Header value.
     * 
     */
    private String value;

    private JobTemplateContainerReadinessProbeHeader() {}
    /**
     * @return The HTTP Header Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The HTTP Header value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateContainerReadinessProbeHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(JobTemplateContainerReadinessProbeHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainerReadinessProbeHeader", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("JobTemplateContainerReadinessProbeHeader", "value");
            }
            this.value = value;
            return this;
        }
        public JobTemplateContainerReadinessProbeHeader build() {
            final var _resultValue = new JobTemplateContainerReadinessProbeHeader();
            _resultValue.name = name;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
