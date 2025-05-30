// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxVirtualMachineScaleSetTerminationNotification {
    /**
     * @return Should the termination notification be enabled on this Virtual Machine Scale Set?
     * 
     */
    private Boolean enabled;
    /**
     * @return Length of time (in minutes, between 5 and 15) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format. Defaults to `PT5M`.
     * 
     * &gt; **Note:** For more information about the termination notification, please [refer to this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-terminate-notification).
     * 
     */
    private @Nullable String timeout;

    private LinuxVirtualMachineScaleSetTerminationNotification() {}
    /**
     * @return Should the termination notification be enabled on this Virtual Machine Scale Set?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Length of time (in minutes, between 5 and 15) a notification to be sent to the VM on the instance metadata server till the VM gets deleted. The time duration should be specified in ISO 8601 format. Defaults to `PT5M`.
     * 
     * &gt; **Note:** For more information about the termination notification, please [refer to this doc](https://docs.microsoft.com/azure/virtual-machine-scale-sets/virtual-machine-scale-sets-terminate-notification).
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxVirtualMachineScaleSetTerminationNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String timeout;
        public Builder() {}
        public Builder(LinuxVirtualMachineScaleSetTerminationNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("LinuxVirtualMachineScaleSetTerminationNotification", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {

            this.timeout = timeout;
            return this;
        }
        public LinuxVirtualMachineScaleSetTerminationNotification build() {
            final var _resultValue = new LinuxVirtualMachineScaleSetTerminationNotification();
            _resultValue.enabled = enabled;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
