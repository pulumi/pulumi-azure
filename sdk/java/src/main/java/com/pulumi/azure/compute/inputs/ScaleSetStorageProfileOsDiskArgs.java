// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSetStorageProfileOsDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleSetStorageProfileOsDiskArgs Empty = new ScaleSetStorageProfileOsDiskArgs();

    /**
     * Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    @Import(name="caching")
    private @Nullable Output<String> caching;

    /**
     * @return Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
     * 
     */
    public Optional<Output<String>> caching() {
        return Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the virtual machine should be created. The only possible option is `FromImage`.
     * 
     */
    @Import(name="createOption", required=true)
    private Output<String> createOption;

    /**
     * @return Specifies how the virtual machine should be created. The only possible option is `FromImage`.
     * 
     */
    public Output<String> createOption() {
        return this.createOption;
    }

    /**
     * Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
     * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
     * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
     * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
     * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
     * 
     */
    @Import(name="managedDiskType")
    private @Nullable Output<String> managedDiskType;

    /**
     * @return Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
     * 
     */
    public Optional<Output<String>> managedDiskType() {
        return Optional.ofNullable(this.managedDiskType);
    }

    /**
     * Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the operating system Type, valid values are windows, Linux.
     * 
     */
    @Import(name="osType")
    private @Nullable Output<String> osType;

    /**
     * @return Specifies the operating system Type, valid values are windows, Linux.
     * 
     */
    public Optional<Output<String>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
     * 
     */
    @Import(name="vhdContainers")
    private @Nullable Output<List<String>> vhdContainers;

    /**
     * @return Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
     * 
     */
    public Optional<Output<List<String>>> vhdContainers() {
        return Optional.ofNullable(this.vhdContainers);
    }

    private ScaleSetStorageProfileOsDiskArgs() {}

    private ScaleSetStorageProfileOsDiskArgs(ScaleSetStorageProfileOsDiskArgs $) {
        this.caching = $.caching;
        this.createOption = $.createOption;
        this.image = $.image;
        this.managedDiskType = $.managedDiskType;
        this.name = $.name;
        this.osType = $.osType;
        this.vhdContainers = $.vhdContainers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleSetStorageProfileOsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleSetStorageProfileOsDiskArgs $;

        public Builder() {
            $ = new ScaleSetStorageProfileOsDiskArgs();
        }

        public Builder(ScaleSetStorageProfileOsDiskArgs defaults) {
            $ = new ScaleSetStorageProfileOsDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(@Nullable Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching Specifies the caching requirements. Possible values include: `None` (default), `ReadOnly`, `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param createOption Specifies how the virtual machine should be created. The only possible option is `FromImage`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(Output<String> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Specifies how the virtual machine should be created. The only possible option is `FromImage`.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param image Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
         * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
         * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Specifies the blob URI for user image. A virtual machine scale set creates an os disk in the same container as the user image.
         * Updating the osDisk image causes the existing disk to be deleted and a new one created with the new image. If the VM scale set is in Manual upgrade mode then the virtual machines are not updated until they have manualUpgrade applied to them.
         * When setting this field `os_type` needs to be specified. Cannot be used when `vhd_containers`, `managed_disk_type` or `storage_profile_image_reference` are specified.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(@Nullable Output<String> managedDiskType) {
            $.managedDiskType = managedDiskType;
            return this;
        }

        /**
         * @param managedDiskType Specifies the type of managed disk to create. Value you must be either `Standard_LRS`, `StandardSSD_LRS` or `Premium_LRS`. Cannot be used when `vhd_containers` or `image` is specified.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskType(String managedDiskType) {
            return managedDiskType(Output.of(managedDiskType));
        }

        /**
         * @param name Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the disk name. Must be specified when using unmanaged disk (&#39;managed_disk_type&#39; property not set).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osType Specifies the operating system Type, valid values are windows, Linux.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<String> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType Specifies the operating system Type, valid values are windows, Linux.
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param vhdContainers Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(@Nullable Output<List<String>> vhdContainers) {
            $.vhdContainers = vhdContainers;
            return this;
        }

        /**
         * @param vhdContainers Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(List<String> vhdContainers) {
            return vhdContainers(Output.of(vhdContainers));
        }

        /**
         * @param vhdContainers Specifies the VHD URI. Cannot be used when `image` or `managed_disk_type` is specified.
         * 
         * @return builder
         * 
         */
        public Builder vhdContainers(String... vhdContainers) {
            return vhdContainers(List.of(vhdContainers));
        }

        public ScaleSetStorageProfileOsDiskArgs build() {
            if ($.createOption == null) {
                throw new MissingRequiredPropertyException("ScaleSetStorageProfileOsDiskArgs", "createOption");
            }
            return $;
        }
    }

}
