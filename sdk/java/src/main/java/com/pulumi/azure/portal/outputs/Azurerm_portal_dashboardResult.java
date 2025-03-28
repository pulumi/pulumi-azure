// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.portal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Azurerm_portal_dashboardResult {
    /**
     * @return JSON data representing dashboard body.
     * 
     */
    private String dashboardProperties;
    private @Nullable String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the shared Azure Portal dashboard exists.
     * 
     */
    private String location;
    private @Nullable String name;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the shared Azure Portal dashboard.
     * 
     */
    private Map<String,String> tags;

    private Azurerm_portal_dashboardResult() {}
    /**
     * @return JSON data representing dashboard body.
     * 
     */
    public String dashboardProperties() {
        return this.dashboardProperties;
    }
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the shared Azure Portal dashboard exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the shared Azure Portal dashboard.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Azurerm_portal_dashboardResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dashboardProperties;
        private @Nullable String displayName;
        private String id;
        private String location;
        private @Nullable String name;
        private String resourceGroupName;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(Azurerm_portal_dashboardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardProperties = defaults.dashboardProperties;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder dashboardProperties(String dashboardProperties) {
            if (dashboardProperties == null) {
              throw new MissingRequiredPropertyException("Azurerm_portal_dashboardResult", "dashboardProperties");
            }
            this.dashboardProperties = dashboardProperties;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("Azurerm_portal_dashboardResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("Azurerm_portal_dashboardResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            if (resourceGroupName == null) {
              throw new MissingRequiredPropertyException("Azurerm_portal_dashboardResult", "resourceGroupName");
            }
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("Azurerm_portal_dashboardResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Azurerm_portal_dashboardResult build() {
            final var _resultValue = new Azurerm_portal_dashboardResult();
            _resultValue.dashboardProperties = dashboardProperties;
            _resultValue.displayName = displayName;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
