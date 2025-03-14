// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSharedImageGalleryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedImageGalleryArgs Empty = new GetSharedImageGalleryArgs();

    /**
     * The name of the Shared Image Gallery.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Shared Image Gallery.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the Shared Image Gallery exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Shared Image Gallery exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetSharedImageGalleryArgs() {}

    private GetSharedImageGalleryArgs(GetSharedImageGalleryArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedImageGalleryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedImageGalleryArgs $;

        public Builder() {
            $ = new GetSharedImageGalleryArgs();
        }

        public Builder(GetSharedImageGalleryArgs defaults) {
            $ = new GetSharedImageGalleryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Shared Image Gallery.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Shared Image Gallery.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Shared Image Gallery exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Shared Image Gallery exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetSharedImageGalleryArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSharedImageGalleryArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetSharedImageGalleryArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
