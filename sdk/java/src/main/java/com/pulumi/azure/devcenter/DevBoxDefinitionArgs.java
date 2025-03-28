// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devcenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevBoxDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevBoxDefinitionArgs Empty = new DevBoxDefinitionArgs();

    /**
     * The ID of the associated Dev Center. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="devCenterId", required=true)
    private Output<String> devCenterId;

    /**
     * @return The ID of the associated Dev Center. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> devCenterId() {
        return this.devCenterId;
    }

    /**
     * The ID of the image for the Dev Center Dev Box Definition.
     * 
     */
    @Import(name="imageReferenceId", required=true)
    private Output<String> imageReferenceId;

    /**
     * @return The ID of the image for the Dev Center Dev Box Definition.
     * 
     */
    public Output<String> imageReferenceId() {
        return this.imageReferenceId;
    }

    /**
     * The Azure Region where the Dev Center Dev Box Definition should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Dev Center Dev Box Definition should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of this Dev Center Dev Box Definition. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of this Dev Center Dev Box Definition. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the SKU for the Dev Center Dev Box Definition.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The name of the SKU for the Dev Center Dev Box Definition.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * A mapping of tags which should be assigned to the Dev Center Dev Box Definition.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Dev Center Dev Box Definition.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DevBoxDefinitionArgs() {}

    private DevBoxDefinitionArgs(DevBoxDefinitionArgs $) {
        this.devCenterId = $.devCenterId;
        this.imageReferenceId = $.imageReferenceId;
        this.location = $.location;
        this.name = $.name;
        this.skuName = $.skuName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevBoxDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevBoxDefinitionArgs $;

        public Builder() {
            $ = new DevBoxDefinitionArgs();
        }

        public Builder(DevBoxDefinitionArgs defaults) {
            $ = new DevBoxDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param devCenterId The ID of the associated Dev Center. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder devCenterId(Output<String> devCenterId) {
            $.devCenterId = devCenterId;
            return this;
        }

        /**
         * @param devCenterId The ID of the associated Dev Center. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder devCenterId(String devCenterId) {
            return devCenterId(Output.of(devCenterId));
        }

        /**
         * @param imageReferenceId The ID of the image for the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder imageReferenceId(Output<String> imageReferenceId) {
            $.imageReferenceId = imageReferenceId;
            return this;
        }

        /**
         * @param imageReferenceId The ID of the image for the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder imageReferenceId(String imageReferenceId) {
            return imageReferenceId(Output.of(imageReferenceId));
        }

        /**
         * @param location The Azure Region where the Dev Center Dev Box Definition should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Dev Center Dev Box Definition should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of this Dev Center Dev Box Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of this Dev Center Dev Box Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param skuName The name of the SKU for the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name of the SKU for the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Dev Center Dev Box Definition.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DevBoxDefinitionArgs build() {
            if ($.devCenterId == null) {
                throw new MissingRequiredPropertyException("DevBoxDefinitionArgs", "devCenterId");
            }
            if ($.imageReferenceId == null) {
                throw new MissingRequiredPropertyException("DevBoxDefinitionArgs", "imageReferenceId");
            }
            if ($.skuName == null) {
                throw new MissingRequiredPropertyException("DevBoxDefinitionArgs", "skuName");
            }
            return $;
        }
    }

}
