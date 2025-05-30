// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppTemplateAzureQueueScaleRuleAuthentication {
    /**
     * @return The name of the Container App Secret to use for this Scale Rule Authentication.
     * 
     */
    private String secretName;
    /**
     * @return The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
     * 
     */
    private String triggerParameter;

    private AppTemplateAzureQueueScaleRuleAuthentication() {}
    /**
     * @return The name of the Container App Secret to use for this Scale Rule Authentication.
     * 
     */
    public String secretName() {
        return this.secretName;
    }
    /**
     * @return The Trigger Parameter name to use the supply the value retrieved from the `secret_name`.
     * 
     */
    public String triggerParameter() {
        return this.triggerParameter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppTemplateAzureQueueScaleRuleAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretName;
        private String triggerParameter;
        public Builder() {}
        public Builder(AppTemplateAzureQueueScaleRuleAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
    	      this.triggerParameter = defaults.triggerParameter;
        }

        @CustomType.Setter
        public Builder secretName(String secretName) {
            if (secretName == null) {
              throw new MissingRequiredPropertyException("AppTemplateAzureQueueScaleRuleAuthentication", "secretName");
            }
            this.secretName = secretName;
            return this;
        }
        @CustomType.Setter
        public Builder triggerParameter(String triggerParameter) {
            if (triggerParameter == null) {
              throw new MissingRequiredPropertyException("AppTemplateAzureQueueScaleRuleAuthentication", "triggerParameter");
            }
            this.triggerParameter = triggerParameter;
            return this;
        }
        public AppTemplateAzureQueueScaleRuleAuthentication build() {
            final var _resultValue = new AppTemplateAzureQueueScaleRuleAuthentication();
            _resultValue.secretName = secretName;
            _resultValue.triggerParameter = triggerParameter;
            return _resultValue;
        }
    }
}
