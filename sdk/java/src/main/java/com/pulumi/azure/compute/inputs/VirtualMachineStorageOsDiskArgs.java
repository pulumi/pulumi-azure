// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineStorageOsDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineStorageOsDiskArgs Empty = new VirtualMachineStorageOsDiskArgs();

    /**
     * Specifies the caching requirements for the OS Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    @Import(name="caching")
    private @Nullable Output<String> caching;

    /**
     * @return Specifies the caching requirements for the OS Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    public Optional<Output<String>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the OS Disk should be created. Possible values are `Attach` (managed disks only) and `FromImage`.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<String> createOption;

    /**
     * @return Specifies how the OS Disk should be created. Possible values are `Attach` (managed disks only) and `FromImage`.
     * 
     */
    public Output<String> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the size of the OS Disk in gigabytes.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Specifies the size of the OS Disk in gigabytes.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Specifies the Image URI in the format `publisherName:offer:skus:version`. This field can also specify the [VHD URI](https://docs.microsoft.com/azure/virtual-machines/linux/tutorial-custom-images) of a custom VM image to clone. When cloning a Custom (Unmanaged) Disk Image the `os_type` field must be set.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    /**
     * @return Specifies the Image URI in the format `publisherName:offer:skus:version`. This field can also specify the [VHD URI](https://docs.microsoft.com/azure/virtual-machines/linux/tutorial-custom-images) of a custom VM image to clone. When cloning a Custom (Unmanaged) Disk Image the `os_type` field must be set.
     * 
     */
    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    /**
     * Specifies the ID of an existing Managed Disk which should be attached as the OS Disk of this Virtual Machine. If this is set then the `create_option` must be set to `Attach`.
     * 
     */
    @Import(name="managedDiskId")
    private @Nullable Output<String> managedDiskId;

    /**
     * @return Specifies the ID of an existing Managed Disk which should be attached as the OS Disk of this Virtual Machine. If this is set then the `create_option` must be set to `Attach`.
     * 
     */
    public Optional<Output<String>> managedDiskId() {
        return Optional.ofNullable(this.managedDiskId);
    }

    /**
     * Specifies the type of Managed Disk which should be created. Possible values are `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    @Import(name="managedDiskType")
    private @Nullable Output<String> managedDiskType;

    /**
     * @return Specifies the type of Managed Disk which should be created. Possible values are `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
     * 
     */
    public Optional<Output<String>> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }

    /**
     * Specifies the name of the OS Disk.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the OS Disk.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the Operating System on the OS Disk. Possible values are `Linux` and `Windows`.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return Specifies the Operating System on the OS Disk. Possible values are `Linux` and `Windows`.
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Specifies the URI of the VHD file backing this Unmanaged OS Disk. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vhdUri")
    private @Nullable Output<String> vhdUri;

    /**
     * @return Specifies the URI of the VHD file backing this Unmanaged OS Disk. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> vhdUri() {
        return Optional.ofNullable(this.vhdUri);
    }

    /**
     * Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Output<Boolean> writeAcceleratorEnabled;

    /**
     * @return Specifies if Write Accelerator is enabled on the disk. This can only be enabled on `Premium_LRS` managed disks with no caching and [M-Series VMs](https://docs.microsoft.com/azure/virtual-machines/workloads/sap/how-to-enable-write-accelerator). Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private VirtualMachineStorageOsDiskArgs() {}

    private VirtualMachineStorageOsDiskArgs(VirtualMachineStorageOsDiskArgs $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.diskSizeGb = $.diskSizeGb;
        this.imageUri = $.imageUri;
        this.managedDiskId = $.managedDiskId;
        this.managedDiskType = $.managedDiskType;
        this.name = $.name;
        this.osType = $.osType;
        this.vhdUri = $.vhdUri;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineStorageOsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineStorageOsDiskArgs $;

        public Builder() {
            $ = new VirtualMachineStorageOsDiskArgs();
        }

        public Builder(VirtualMachineStorageOsDiskArgs defaults) {
            $ = new VirtualMachineStorageOsDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Specifies the caching requirements for the OS Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching Specifies the caching requirements for the OS Disk. Possible values include `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param createOption Specifies how the OS Disk should be created. Possible values are `Attach` (managed disks only) and `FromImage`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<String> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Specifies how the OS Disk should be created. Possible values are `Attach` (managed disks only) and `FromImage`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param diskSizeGb Specifies the size of the OS Disk in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the OS Disk in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param imageUri Specifies the Image URI in the format `publisherName:offer:skus:version`. This field can also specify the [VHD URI](https://docs.microsoft.com/azure/virtual-machines/linux/tutorial-custom-images) of a custom VM image to clone. When cloning a Custom (Unmanaged) Disk Image the `os_type` field must be set.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        /**
         * @param imageUri Specifies the Image URI in the format `publisherName:offer:skus:version`. This field can also specify the [VHD URI](https://docs.microsoft.com/azure/virtual-machines/linux/tutorial-custom-images) of a custom VM image to clone. When cloning a Custom (Unmanaged) Disk Image the `os_type` field must be set.
         * 
         * @return builder
         * 
         */
        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        /**
         * @param managedDiskId Specifies the ID of an existing Managed Disk which should be attached as the OS Disk of this Virtual Machine. If this is set then the `create_option` must be set to `Attach`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(@Nullable Output<String> managedDiskId) {
            $.managedDiskId = managedDiskId;
            return this;
        }

        /**
         * @param managedDiskId Specifies the ID of an existing Managed Disk which should be attached as the OS Disk of this Virtual Machine. If this is set then the `create_option` must be set to `Attach`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(String managedDiskId) {
            return managedDiskId(Output.of(managedDiskId));
        }

        /**
         * @param managedDiskType Specifies the type of Managed Disk which should be created. Possible values are `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(@Nullable Output<String> managedDiskType) {
            $.managedDiskType = managedDiskType;
            return this;
        }

        /**
         * @param managedDiskType Specifies the type of Managed Disk which should be created. Possible values are `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(String managedDiskType) {
            return managedDiskType(Output.of(managedDiskType));
        }

        /**
         * @param name Specifies the name of the OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osType Specifies the Operating System on the OS Disk. Possible values are `Linux` and `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType Specifies the Operating System on the OS Disk. Possible values are `Linux` and `Windows`.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param vhdUri Specifies the URI of the VHD file backing this Unmanaged OS Disk. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vhdUri(@Nullable Output<String> vhdUri) {
            $.vhdUri = vhdUri;
            return this;
        }

        /**
         * @param vhdUri Specifies the URI of the VHD file backing this Unmanaged OS Disk. Changing this forces a new resource to be created.
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
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
            return writeAcceleratorEnabled(Output.of(writeAcceleratorEnabled));
        }

        public VirtualMachineStorageOsDiskArgs build() {
            $.createOption = Objects.requireNonNull($.createOption, "expected parameter 'createOption' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}