// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineStorageDataDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineStorageDataDiskArgs Empty = new VirtualMachineStorageDataDiskArgs();

    /**
     * Specifies the caching requirements for the Data Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    @Import(name="caching")
    private @Nullable Output<String> caching;

    /**
     * @return Specifies the caching requirements for the Data Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    public Optional<Output<String>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the data disk should be created. Possible values are `Attach`, `FromImage` and `Empty`.
     * 
     * &gt; **NOTE:** If using an image that does not have data to be written to the Data Disk, use `Empty` as the create option in order to create the desired disk without any data.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<String> createOption;

    /**
     * @return Specifies how the data disk should be created. Possible values are `Attach`, `FromImage` and `Empty`.
     * 
     * &gt; **NOTE:** If using an image that does not have data to be written to the Data Disk, use `Empty` as the create option in order to create the desired disk without any data.
     * 
     */
    public Output<String> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the size of the data disk in gigabytes.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Specifies the size of the data disk in gigabytes.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Specifies the logical unit number of the data disk. This needs to be unique within all the Data Disks on the Virtual Machine.
     * 
     */
    @Import(name="lun", required=true)
    private Output<Integer> lun;

    /**
     * @return Specifies the logical unit number of the data disk. This needs to be unique within all the Data Disks on the Virtual Machine.
     * 
     */
    public Output<Integer> lun() {
        return this.lun;
    }

    /**
     * Specifies the ID of an Existing Managed Disk which should be attached to this Virtual Machine. When this field is set `create_option` must be set to `Attach`.
     * 
     * The following properties apply when using Unmanaged Disks:
     * 
     */
    @Import(name="managedDiskId")
    private @Nullable Output<String> managedDiskId;

    /**
     * @return Specifies the ID of an Existing Managed Disk which should be attached to this Virtual Machine. When this field is set `create_option` must be set to `Attach`.
     * 
     * The following properties apply when using Unmanaged Disks:
     * 
     */
    public Optional<Output<String>> managedDiskId() {
        return Optional.ofNullable(this.managedDiskId);
    }

    /**
     * Specifies the type of managed disk to create. Possible values are either `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS` or `UltraSSD_LRS`.
     * 
     * &gt; **Note:** `managed_disk_type` of type `UltraSSD_LRS` is currently in preview and are not available to subscriptions that have not [requested](https://aka.ms/UltraSSDPreviewSignUp) onboarding to `Azure Ultra Disk Storage` preview. `Azure Ultra Disk Storage` is only available in `East US 2`, `North Europe`, and `Southeast Asia` regions. For more information see the `Azure Ultra Disk Storage` [product documentation](https://docs.microsoft.com/azure/virtual-machines/windows/disks-enable-ultra-ssd), [product blog](https://azure.microsoft.com/en-us/blog/announcing-the-general-availability-of-azure-ultra-disk-storage/) and [FAQ](https://docs.microsoft.com/azure/virtual-machines/windows/faq-for-disks#ultra-disks). You must also set `additional_capabilities.ultra_ssd_enabled` to `true`.
     * 
     */
    @Import(name="managedDiskType")
    private @Nullable Output<String> managedDiskType;

    /**
     * @return Specifies the type of managed disk to create. Possible values are either `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS` or `UltraSSD_LRS`.
     * 
     * &gt; **Note:** `managed_disk_type` of type `UltraSSD_LRS` is currently in preview and are not available to subscriptions that have not [requested](https://aka.ms/UltraSSDPreviewSignUp) onboarding to `Azure Ultra Disk Storage` preview. `Azure Ultra Disk Storage` is only available in `East US 2`, `North Europe`, and `Southeast Asia` regions. For more information see the `Azure Ultra Disk Storage` [product documentation](https://docs.microsoft.com/azure/virtual-machines/windows/disks-enable-ultra-ssd), [product blog](https://azure.microsoft.com/en-us/blog/announcing-the-general-availability-of-azure-ultra-disk-storage/) and [FAQ](https://docs.microsoft.com/azure/virtual-machines/windows/faq-for-disks#ultra-disks). You must also set `additional_capabilities.ultra_ssd_enabled` to `true`.
     * 
     */
    public Optional<Output<String>> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }

    /**
     * The name of the Data Disk.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Data Disk.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the URI of the VHD file backing this Unmanaged Data Disk.
     * 
     */
    @Import(name="vhdUri")
    private @Nullable Output<String> vhdUri;

    /**
     * @return Specifies the URI of the VHD file backing this Unmanaged Data Disk.
     * 
     */
    public Optional<Output<String>> vhdUri() {
        return Optional.ofNullable(this.vhdUri);
    }

    /**
     * Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
     * 
     * The following properties apply when using Managed Disks:
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Output<Boolean> writeAcceleratorEnabled;

    /**
     * @return Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
     * 
     * The following properties apply when using Managed Disks:
     * 
     */
    public Optional<Output<Boolean>> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private VirtualMachineStorageDataDiskArgs() {}

    private VirtualMachineStorageDataDiskArgs(VirtualMachineStorageDataDiskArgs $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.diskSizeGb = $.diskSizeGb;
        this.lun = $.lun;
        this.managedDiskId = $.managedDiskId;
        this.managedDiskType = $.managedDiskType;
        this.name = $.name;
        this.vhdUri = $.vhdUri;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineStorageDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineStorageDataDiskArgs $;

        public Builder() {
            $ = new VirtualMachineStorageDataDiskArgs();
        }

        public Builder(VirtualMachineStorageDataDiskArgs defaults) {
            $ = new VirtualMachineStorageDataDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Specifies the caching requirements for the Data Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching Specifies the caching requirements for the Data Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param createOption Specifies how the data disk should be created. Possible values are `Attach`, `FromImage` and `Empty`.
         * 
         * &gt; **NOTE:** If using an image that does not have data to be written to the Data Disk, use `Empty` as the create option in order to create the desired disk without any data.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<String> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Specifies how the data disk should be created. Possible values are `Attach`, `FromImage` and `Empty`.
         * 
         * &gt; **NOTE:** If using an image that does not have data to be written to the Data Disk, use `Empty` as the create option in order to create the desired disk without any data.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param diskSizeGb Specifies the size of the data disk in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the data disk in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param lun Specifies the logical unit number of the data disk. This needs to be unique within all the Data Disks on the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder lun(Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun Specifies the logical unit number of the data disk. This needs to be unique within all the Data Disks on the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param managedDiskId Specifies the ID of an Existing Managed Disk which should be attached to this Virtual Machine. When this field is set `create_option` must be set to `Attach`.
         * 
         * The following properties apply when using Unmanaged Disks:
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(@Nullable Output<String> managedDiskId) {
            $.managedDiskId = managedDiskId;
            return this;
        }

        /**
         * @param managedDiskId Specifies the ID of an Existing Managed Disk which should be attached to this Virtual Machine. When this field is set `create_option` must be set to `Attach`.
         * 
         * The following properties apply when using Unmanaged Disks:
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(String managedDiskId) {
            return managedDiskId(Output.of(managedDiskId));
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Possible values are either `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS` or `UltraSSD_LRS`.
         * 
         * &gt; **Note:** `managed_disk_type` of type `UltraSSD_LRS` is currently in preview and are not available to subscriptions that have not [requested](https://aka.ms/UltraSSDPreviewSignUp) onboarding to `Azure Ultra Disk Storage` preview. `Azure Ultra Disk Storage` is only available in `East US 2`, `North Europe`, and `Southeast Asia` regions. For more information see the `Azure Ultra Disk Storage` [product documentation](https://docs.microsoft.com/azure/virtual-machines/windows/disks-enable-ultra-ssd), [product blog](https://azure.microsoft.com/en-us/blog/announcing-the-general-availability-of-azure-ultra-disk-storage/) and [FAQ](https://docs.microsoft.com/azure/virtual-machines/windows/faq-for-disks#ultra-disks). You must also set `additional_capabilities.ultra_ssd_enabled` to `true`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(@Nullable Output<String> managedDiskType) {
            $.managedDiskType = managedDiskType;
            return this;
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Possible values are either `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS` or `UltraSSD_LRS`.
         * 
         * &gt; **Note:** `managed_disk_type` of type `UltraSSD_LRS` is currently in preview and are not available to subscriptions that have not [requested](https://aka.ms/UltraSSDPreviewSignUp) onboarding to `Azure Ultra Disk Storage` preview. `Azure Ultra Disk Storage` is only available in `East US 2`, `North Europe`, and `Southeast Asia` regions. For more information see the `Azure Ultra Disk Storage` [product documentation](https://docs.microsoft.com/azure/virtual-machines/windows/disks-enable-ultra-ssd), [product blog](https://azure.microsoft.com/en-us/blog/announcing-the-general-availability-of-azure-ultra-disk-storage/) and [FAQ](https://docs.microsoft.com/azure/virtual-machines/windows/faq-for-disks#ultra-disks). You must also set `additional_capabilities.ultra_ssd_enabled` to `true`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(String managedDiskType) {
            return managedDiskType(Output.of(managedDiskType));
        }

        /**
         * @param name The name of the Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vhdUri Specifies the URI of the VHD file backing this Unmanaged Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder vhdUri(@Nullable Output<String> vhdUri) {
            $.vhdUri = vhdUri;
            return this;
        }

        /**
         * @param vhdUri Specifies the URI of the VHD file backing this Unmanaged Data Disk.
         * 
         * @return builder
         * 
         */
        public Builder vhdUri(String vhdUri) {
            return vhdUri(Output.of(vhdUri));
        }

        /**
         * @param writeAcceleratorEnabled Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
         * 
         * The following properties apply when using Managed Disks:
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            $.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        /**
         * @param writeAcceleratorEnabled Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
         * 
         * The following properties apply when using Managed Disks:
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
            return writeAcceleratorEnabled(Output.of(writeAcceleratorEnabled));
        }

        public VirtualMachineStorageDataDiskArgs build() {
            if ($.createOption == null) {
                throw new MissingRequiredPropertyException("VirtualMachineStorageDataDiskArgs", "createOption");
            }
            if ($.lun == null) {
                throw new MissingRequiredPropertyException("VirtualMachineStorageDataDiskArgs", "lun");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("VirtualMachineStorageDataDiskArgs", "name");
            }
            return $;
        }
    }

}
