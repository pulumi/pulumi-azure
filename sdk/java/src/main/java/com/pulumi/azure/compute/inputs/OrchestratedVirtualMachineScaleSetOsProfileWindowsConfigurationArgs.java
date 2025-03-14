// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs Empty = new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs();

    /**
     * One or more `additional_unattend_content` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="additionalUnattendContents")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs>> additionalUnattendContents;

    /**
     * @return One or more `additional_unattend_content` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs>>> additionalUnattendContents() {
        return Optional.ofNullable(this.additionalUnattendContents);
    }

    /**
     * The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="adminPassword", required=true)
    private Output<String> adminPassword;

    /**
     * @return The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> adminPassword() {
        return this.adminPassword;
    }

    /**
     * The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="adminUsername", required=true)
    private Output<String> adminUsername;

    /**
     * @return The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> adminUsername() {
        return this.adminUsername;
    }

    /**
     * The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="computerNamePrefix")
    private @Nullable Output<String> computerNamePrefix;

    /**
     * @return The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> computerNamePrefix() {
        return Optional.ofNullable(this.computerNamePrefix);
    }

    /**
     * Are automatic updates enabled for this Virtual Machine? Defaults to `true`.
     * 
     */
    @Import(name="enableAutomaticUpdates")
    private @Nullable Output<Boolean> enableAutomaticUpdates;

    /**
     * @return Are automatic updates enabled for this Virtual Machine? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticUpdates() {
        return Optional.ofNullable(this.enableAutomaticUpdates);
    }

    /**
     * Should the VM be patched without requiring a reboot? Possible values are `true` or `false`. Defaults to `false`. For more information about hot patching please see the [product documentation](https://docs.microsoft.com/azure/automanage/automanage-hotpatch).
     * 
     * &gt; **Note:** Hotpatching can only be enabled if the `patch_mode` is set to `AutomaticByPlatform`, the `provision_vm_agent` is set to `true`, your `source_image_reference` references a hotpatching enabled image, the VM&#39;s `sku_name` is set to a [Azure generation 2](https://docs.microsoft.com/azure/virtual-machines/generation-2#generation-2-vm-sizes) VM SKU and the `extension` contains an application health extension. An example of how to correctly configure a Virtual Machine Scale Set to provision a Windows Virtual Machine with hotpatching enabled can be found in the `./examples/orchestrated-vm-scale-set/hotpatching-enabled` directory within the GitHub Repository.
     * 
     */
    @Import(name="hotpatchingEnabled")
    private @Nullable Output<Boolean> hotpatchingEnabled;

    /**
     * @return Should the VM be patched without requiring a reboot? Possible values are `true` or `false`. Defaults to `false`. For more information about hot patching please see the [product documentation](https://docs.microsoft.com/azure/automanage/automanage-hotpatch).
     * 
     * &gt; **Note:** Hotpatching can only be enabled if the `patch_mode` is set to `AutomaticByPlatform`, the `provision_vm_agent` is set to `true`, your `source_image_reference` references a hotpatching enabled image, the VM&#39;s `sku_name` is set to a [Azure generation 2](https://docs.microsoft.com/azure/virtual-machines/generation-2#generation-2-vm-sizes) VM SKU and the `extension` contains an application health extension. An example of how to correctly configure a Virtual Machine Scale Set to provision a Windows Virtual Machine with hotpatching enabled can be found in the `./examples/orchestrated-vm-scale-set/hotpatching-enabled` directory within the GitHub Repository.
     * 
     */
    public Optional<Output<Boolean>> hotpatchingEnabled() {
        return Optional.ofNullable(this.hotpatchingEnabled);
    }

    /**
     * Specifies the mode of VM Guest Patching for the virtual machines that are associated to the Virtual Machine Scale Set. Possible values are `AutomaticByPlatform` or `ImageDefault`. Defaults to `ImageDefault`.
     * 
     * &gt; **Note:** If the `patch_assessment_mode` is set to `AutomaticByPlatform` then the `provision_vm_agent` field must be set to `true`.
     * 
     */
    @Import(name="patchAssessmentMode")
    private @Nullable Output<String> patchAssessmentMode;

    /**
     * @return Specifies the mode of VM Guest Patching for the virtual machines that are associated to the Virtual Machine Scale Set. Possible values are `AutomaticByPlatform` or `ImageDefault`. Defaults to `ImageDefault`.
     * 
     * &gt; **Note:** If the `patch_assessment_mode` is set to `AutomaticByPlatform` then the `provision_vm_agent` field must be set to `true`.
     * 
     */
    public Optional<Output<String>> patchAssessmentMode() {
        return Optional.ofNullable(this.patchAssessmentMode);
    }

    /**
     * Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `Manual`, `AutomaticByOS` and `AutomaticByPlatform`. Defaults to `AutomaticByOS`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
     * 
     * &gt; **Note:** If `patch_mode` is set to `AutomaticByPlatform` the `provision_vm_agent` must be set to `true` and the `extension` must contain at least one application health extension.
     * 
     */
    @Import(name="patchMode")
    private @Nullable Output<String> patchMode;

    /**
     * @return Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `Manual`, `AutomaticByOS` and `AutomaticByPlatform`. Defaults to `AutomaticByOS`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
     * 
     * &gt; **Note:** If `patch_mode` is set to `AutomaticByPlatform` the `provision_vm_agent` must be set to `true` and the `extension` must contain at least one application health extension.
     * 
     */
    public Optional<Output<String>> patchMode() {
        return Optional.ofNullable(this.patchMode);
    }

    /**
     * Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
     * 
     */
    @Import(name="provisionVmAgent")
    private @Nullable Output<Boolean> provisionVmAgent;

    /**
     * @return Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> provisionVmAgent() {
        return Optional.ofNullable(this.provisionVmAgent);
    }

    /**
     * One or more `secret` blocks as defined below.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs>> secrets;

    /**
     * @return One or more `secret` blocks as defined below.
     * 
     */
    public Optional<Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * Specifies the time zone of the virtual machine, the possible values are defined [here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Specifies the time zone of the virtual machine, the possible values are defined [here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    /**
     * One or more `winrm_listener` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="winrmListeners")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs>> winrmListeners;

    /**
     * @return One or more `winrm_listener` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs>>> winrmListeners() {
        return Optional.ofNullable(this.winrmListeners);
    }

    private OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs() {}

    private OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs $) {
        this.additionalUnattendContents = $.additionalUnattendContents;
        this.adminPassword = $.adminPassword;
        this.adminUsername = $.adminUsername;
        this.computerNamePrefix = $.computerNamePrefix;
        this.enableAutomaticUpdates = $.enableAutomaticUpdates;
        this.hotpatchingEnabled = $.hotpatchingEnabled;
        this.patchAssessmentMode = $.patchAssessmentMode;
        this.patchMode = $.patchMode;
        this.provisionVmAgent = $.provisionVmAgent;
        this.secrets = $.secrets;
        this.timezone = $.timezone;
        this.winrmListeners = $.winrmListeners;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalUnattendContents One or more `additional_unattend_content` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContents(@Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs>> additionalUnattendContents) {
            $.additionalUnattendContents = additionalUnattendContents;
            return this;
        }

        /**
         * @param additionalUnattendContents One or more `additional_unattend_content` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContents(List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs> additionalUnattendContents) {
            return additionalUnattendContents(Output.of(additionalUnattendContents));
        }

        /**
         * @param additionalUnattendContents One or more `additional_unattend_content` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContents(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationAdditionalUnattendContentArgs... additionalUnattendContents) {
            return additionalUnattendContents(List.of(additionalUnattendContents));
        }

        /**
         * @param adminPassword The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword The Password which should be used for the local-administrator on this Virtual Machine. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param adminUsername The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(Output<String> adminUsername) {
            $.adminUsername = adminUsername;
            return this;
        }

        /**
         * @param adminUsername The username of the local administrator on each Virtual Machine Scale Set instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder adminUsername(String adminUsername) {
            return adminUsername(Output.of(adminUsername));
        }

        /**
         * @param computerNamePrefix The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder computerNamePrefix(@Nullable Output<String> computerNamePrefix) {
            $.computerNamePrefix = computerNamePrefix;
            return this;
        }

        /**
         * @param computerNamePrefix The prefix which should be used for the name of the Virtual Machines in this Scale Set. If unspecified this defaults to the value for the `name` field. If the value of the `name` field is not a valid `computer_name_prefix`, then you must specify `computer_name_prefix`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder computerNamePrefix(String computerNamePrefix) {
            return computerNamePrefix(Output.of(computerNamePrefix));
        }

        /**
         * @param enableAutomaticUpdates Are automatic updates enabled for this Virtual Machine? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpdates(@Nullable Output<Boolean> enableAutomaticUpdates) {
            $.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }

        /**
         * @param enableAutomaticUpdates Are automatic updates enabled for this Virtual Machine? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpdates(Boolean enableAutomaticUpdates) {
            return enableAutomaticUpdates(Output.of(enableAutomaticUpdates));
        }

        /**
         * @param hotpatchingEnabled Should the VM be patched without requiring a reboot? Possible values are `true` or `false`. Defaults to `false`. For more information about hot patching please see the [product documentation](https://docs.microsoft.com/azure/automanage/automanage-hotpatch).
         * 
         * &gt; **Note:** Hotpatching can only be enabled if the `patch_mode` is set to `AutomaticByPlatform`, the `provision_vm_agent` is set to `true`, your `source_image_reference` references a hotpatching enabled image, the VM&#39;s `sku_name` is set to a [Azure generation 2](https://docs.microsoft.com/azure/virtual-machines/generation-2#generation-2-vm-sizes) VM SKU and the `extension` contains an application health extension. An example of how to correctly configure a Virtual Machine Scale Set to provision a Windows Virtual Machine with hotpatching enabled can be found in the `./examples/orchestrated-vm-scale-set/hotpatching-enabled` directory within the GitHub Repository.
         * 
         * @return builder
         * 
         */
        public Builder hotpatchingEnabled(@Nullable Output<Boolean> hotpatchingEnabled) {
            $.hotpatchingEnabled = hotpatchingEnabled;
            return this;
        }

        /**
         * @param hotpatchingEnabled Should the VM be patched without requiring a reboot? Possible values are `true` or `false`. Defaults to `false`. For more information about hot patching please see the [product documentation](https://docs.microsoft.com/azure/automanage/automanage-hotpatch).
         * 
         * &gt; **Note:** Hotpatching can only be enabled if the `patch_mode` is set to `AutomaticByPlatform`, the `provision_vm_agent` is set to `true`, your `source_image_reference` references a hotpatching enabled image, the VM&#39;s `sku_name` is set to a [Azure generation 2](https://docs.microsoft.com/azure/virtual-machines/generation-2#generation-2-vm-sizes) VM SKU and the `extension` contains an application health extension. An example of how to correctly configure a Virtual Machine Scale Set to provision a Windows Virtual Machine with hotpatching enabled can be found in the `./examples/orchestrated-vm-scale-set/hotpatching-enabled` directory within the GitHub Repository.
         * 
         * @return builder
         * 
         */
        public Builder hotpatchingEnabled(Boolean hotpatchingEnabled) {
            return hotpatchingEnabled(Output.of(hotpatchingEnabled));
        }

        /**
         * @param patchAssessmentMode Specifies the mode of VM Guest Patching for the virtual machines that are associated to the Virtual Machine Scale Set. Possible values are `AutomaticByPlatform` or `ImageDefault`. Defaults to `ImageDefault`.
         * 
         * &gt; **Note:** If the `patch_assessment_mode` is set to `AutomaticByPlatform` then the `provision_vm_agent` field must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder patchAssessmentMode(@Nullable Output<String> patchAssessmentMode) {
            $.patchAssessmentMode = patchAssessmentMode;
            return this;
        }

        /**
         * @param patchAssessmentMode Specifies the mode of VM Guest Patching for the virtual machines that are associated to the Virtual Machine Scale Set. Possible values are `AutomaticByPlatform` or `ImageDefault`. Defaults to `ImageDefault`.
         * 
         * &gt; **Note:** If the `patch_assessment_mode` is set to `AutomaticByPlatform` then the `provision_vm_agent` field must be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder patchAssessmentMode(String patchAssessmentMode) {
            return patchAssessmentMode(Output.of(patchAssessmentMode));
        }

        /**
         * @param patchMode Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `Manual`, `AutomaticByOS` and `AutomaticByPlatform`. Defaults to `AutomaticByOS`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
         * 
         * &gt; **Note:** If `patch_mode` is set to `AutomaticByPlatform` the `provision_vm_agent` must be set to `true` and the `extension` must contain at least one application health extension.
         * 
         * @return builder
         * 
         */
        public Builder patchMode(@Nullable Output<String> patchMode) {
            $.patchMode = patchMode;
            return this;
        }

        /**
         * @param patchMode Specifies the mode of in-guest patching of this Windows Virtual Machine. Possible values are `Manual`, `AutomaticByOS` and `AutomaticByPlatform`. Defaults to `AutomaticByOS`. For more information on patch modes please see the [product documentation](https://docs.microsoft.com/azure/virtual-machines/automatic-vm-guest-patching#patch-orchestration-modes).
         * 
         * &gt; **Note:** If `patch_mode` is set to `AutomaticByPlatform` the `provision_vm_agent` must be set to `true` and the `extension` must contain at least one application health extension.
         * 
         * @return builder
         * 
         */
        public Builder patchMode(String patchMode) {
            return patchMode(Output.of(patchMode));
        }

        /**
         * @param provisionVmAgent Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder provisionVmAgent(@Nullable Output<Boolean> provisionVmAgent) {
            $.provisionVmAgent = provisionVmAgent;
            return this;
        }

        /**
         * @param provisionVmAgent Should the Azure VM Agent be provisioned on each Virtual Machine in the Scale Set? Defaults to `true`. Changing this value forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder provisionVmAgent(Boolean provisionVmAgent) {
            return provisionVmAgent(Output.of(provisionVmAgent));
        }

        /**
         * @param secrets One or more `secret` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets One or more `secret` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder secrets(List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param secrets One or more `secret` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder secrets(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        /**
         * @param timezone Specifies the time zone of the virtual machine, the possible values are defined [here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Specifies the time zone of the virtual machine, the possible values are defined [here](https://jackstromberg.com/2017/01/list-of-time-zones-consumed-by-azure/).
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        /**
         * @param winrmListeners One or more `winrm_listener` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder winrmListeners(@Nullable Output<List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs>> winrmListeners) {
            $.winrmListeners = winrmListeners;
            return this;
        }

        /**
         * @param winrmListeners One or more `winrm_listener` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder winrmListeners(List<OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs> winrmListeners) {
            return winrmListeners(Output.of(winrmListeners));
        }

        /**
         * @param winrmListeners One or more `winrm_listener` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder winrmListeners(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationWinrmListenerArgs... winrmListeners) {
            return winrmListeners(List.of(winrmListeners));
        }

        public OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs build() {
            if ($.adminPassword == null) {
                throw new MissingRequiredPropertyException("OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs", "adminPassword");
            }
            if ($.adminUsername == null) {
                throw new MissingRequiredPropertyException("OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationArgs", "adminUsername");
            }
            return $;
        }
    }

}
