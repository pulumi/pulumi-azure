// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.outputs;

import com.pulumi.azure.workloadssap.outputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImage;
import com.pulumi.azure.workloadssap.outputs.SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfile;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration {
    /**
     * @return An `image` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImage image;
    /**
     * @return An `os_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfile osProfile;
    /**
     * @return The size of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    private String virtualMachineSize;

    private SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration() {}
    /**
     * @return An `image` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImage image() {
        return this.image;
    }
    /**
     * @return An `os_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfile osProfile() {
        return this.osProfile;
    }
    /**
     * @return The size of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public String virtualMachineSize() {
        return this.virtualMachineSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImage image;
        private SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfile osProfile;
        private String virtualMachineSize;
        public Builder() {}
        public Builder(SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.osProfile = defaults.osProfile;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        @CustomType.Setter
        public Builder image(SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationImage image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder osProfile(SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfigurationOsProfile osProfile) {
            if (osProfile == null) {
              throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration", "osProfile");
            }
            this.osProfile = osProfile;
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachineSize(String virtualMachineSize) {
            if (virtualMachineSize == null) {
              throw new MissingRequiredPropertyException("SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration", "virtualMachineSize");
            }
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }
        public SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration build() {
            final var _resultValue = new SingleNodeVirtualInstanceSingleServerConfigurationVirtualMachineConfiguration();
            _resultValue.image = image;
            _resultValue.osProfile = osProfile;
            _resultValue.virtualMachineSize = virtualMachineSize;
            return _resultValue;
        }
    }
}
