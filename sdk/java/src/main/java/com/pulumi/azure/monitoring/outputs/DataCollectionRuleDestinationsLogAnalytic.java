// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionRuleDestinationsLogAnalytic {
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    private String name;
    /**
     * @return The ID of a Log Analytic Workspace resource.
     * 
     */
    private String workspaceResourceId;

    private DataCollectionRuleDestinationsLogAnalytic() {}
    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of a Log Analytic Workspace resource.
     * 
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleDestinationsLogAnalytic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String workspaceResourceId;
        public Builder() {}
        public Builder(DataCollectionRuleDestinationsLogAnalytic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DataCollectionRuleDestinationsLogAnalytic", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceResourceId(String workspaceResourceId) {
            if (workspaceResourceId == null) {
              throw new MissingRequiredPropertyException("DataCollectionRuleDestinationsLogAnalytic", "workspaceResourceId");
            }
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public DataCollectionRuleDestinationsLogAnalytic build() {
            final var _resultValue = new DataCollectionRuleDestinationsLogAnalytic();
            _resultValue.name = name;
            _resultValue.workspaceResourceId = workspaceResourceId;
            return _resultValue;
        }
    }
}
