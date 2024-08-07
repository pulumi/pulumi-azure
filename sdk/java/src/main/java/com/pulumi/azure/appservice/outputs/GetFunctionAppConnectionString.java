// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionAppConnectionString {
    /**
     * @return The name of the Function App resource.
     * 
     */
    private String name;
    /**
     * @return The identity type of the Managed Identity assigned to the Function App.
     * 
     */
    private String type;
    /**
     * @return The value for the Connection String.
     * 
     */
    private String value;

    private GetFunctionAppConnectionString() {}
    /**
     * @return The name of the Function App resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The identity type of the Managed Identity assigned to the Function App.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value for the Connection String.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionAppConnectionString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetFunctionAppConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppConnectionString", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppConnectionString", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetFunctionAppConnectionString", "value");
            }
            this.value = value;
            return this;
        }
        public GetFunctionAppConnectionString build() {
            final var _resultValue = new GetFunctionAppConnectionString();
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
