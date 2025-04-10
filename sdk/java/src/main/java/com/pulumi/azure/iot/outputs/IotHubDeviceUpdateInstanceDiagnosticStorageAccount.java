// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IotHubDeviceUpdateInstanceDiagnosticStorageAccount {
    /**
     * @return Connection String of the Diagnostic Storage Account.
     * 
     */
    private String connectionString;
    /**
     * @return Resource ID of the Diagnostic Storage Account.
     * 
     */
    private String id;

    private IotHubDeviceUpdateInstanceDiagnosticStorageAccount() {}
    /**
     * @return Connection String of the Diagnostic Storage Account.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Resource ID of the Diagnostic Storage Account.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDeviceUpdateInstanceDiagnosticStorageAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionString;
        private String id;
        public Builder() {}
        public Builder(IotHubDeviceUpdateInstanceDiagnosticStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("IotHubDeviceUpdateInstanceDiagnosticStorageAccount", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("IotHubDeviceUpdateInstanceDiagnosticStorageAccount", "id");
            }
            this.id = id;
            return this;
        }
        public IotHubDeviceUpdateInstanceDiagnosticStorageAccount build() {
            final var _resultValue = new IotHubDeviceUpdateInstanceDiagnosticStorageAccount();
            _resultValue.connectionString = connectionString;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
