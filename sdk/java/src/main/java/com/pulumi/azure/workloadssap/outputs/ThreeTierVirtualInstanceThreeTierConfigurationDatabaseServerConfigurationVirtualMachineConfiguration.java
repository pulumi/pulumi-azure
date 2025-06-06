// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.workloadssap.outputs;

import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImage;
import com.pulumi.azure.workloadssap.outputs.ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfile;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration {
    /**
     * @return An `image` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImage image;
    /**
     * @return An `os_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfile osProfile;
    /**
     * @return The size of the Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    private String virtualMachineSize;

    private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration() {}
    /**
     * @return An `image` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImage image() {
        return this.image;
    }
    /**
     * @return An `os_profile` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfile osProfile() {
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

    public static Builder builder(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImage image;
        private ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfile osProfile;
        private String virtualMachineSize;
        public Builder() {}
        public Builder(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.osProfile = defaults.osProfile;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        @CustomType.Setter
        public Builder image(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationImage image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder osProfile(ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfigurationOsProfile osProfile) {
            if (osProfile == null) {
              throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration", "osProfile");
            }
            this.osProfile = osProfile;
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachineSize(String virtualMachineSize) {
            if (virtualMachineSize == null) {
              throw new MissingRequiredPropertyException("ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration", "virtualMachineSize");
            }
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }
        public ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration build() {
            final var _resultValue = new ThreeTierVirtualInstanceThreeTierConfigurationDatabaseServerConfigurationVirtualMachineConfiguration();
            _resultValue.image = image;
            _resultValue.osProfile = osProfile;
            _resultValue.virtualMachineSize = virtualMachineSize;
            return _resultValue;
        }
    }
}
