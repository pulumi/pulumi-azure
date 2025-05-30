// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineScaleSetGalleryApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetGalleryApplicationArgs Empty = new WindowsVirtualMachineScaleSetGalleryApplicationArgs();

    /**
     * Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="configurationBlobUri")
    private @Nullable Output<String> configurationBlobUri;

    /**
     * @return Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> configurationBlobUri() {
        return Optional.ofNullable(this.configurationBlobUri);
    }

    /**
     * Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * Specifies the Gallery Application Version resource ID. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return Specifies the Gallery Application Version resource ID. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    private WindowsVirtualMachineScaleSetGalleryApplicationArgs() {}

    private WindowsVirtualMachineScaleSetGalleryApplicationArgs(WindowsVirtualMachineScaleSetGalleryApplicationArgs $) {
        this.configurationBlobUri = $.configurationBlobUri;
        this.order = $.order;
        this.tag = $.tag;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineScaleSetGalleryApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetGalleryApplicationArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetGalleryApplicationArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetGalleryApplicationArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetGalleryApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationBlobUri Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationBlobUri(@Nullable Output<String> configurationBlobUri) {
            $.configurationBlobUri = configurationBlobUri;
            return this;
        }

        /**
         * @param configurationBlobUri Specifies the URI to an Azure Blob that will replace the default configuration for the package if provided. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationBlobUri(String configurationBlobUri) {
            return configurationBlobUri(Output.of(configurationBlobUri));
        }

        /**
         * @param order Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Specifies the order in which the packages have to be installed. Possible values are between `0` and `2147483647`. Defaults to `0`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param tag Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Specifies a passthrough value for more generic context. This field can be any valid `string` value. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param versionId Specifies the Gallery Application Version resource ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Specifies the Gallery Application Version resource ID. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public WindowsVirtualMachineScaleSetGalleryApplicationArgs build() {
            if ($.versionId == null) {
                throw new MissingRequiredPropertyException("WindowsVirtualMachineScaleSetGalleryApplicationArgs", "versionId");
            }
            return $;
        }
    }

}
