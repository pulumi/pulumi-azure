// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSharedImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedImageArgs Empty = new GetSharedImageArgs();

    /**
     * The name of the Shared Image Gallery in which the Shared Image exists.
     * 
     */
    @Import(name="galleryName", required=true)
    private Output<String> galleryName;

    /**
     * @return The name of the Shared Image Gallery in which the Shared Image exists.
     * 
     */
    public Output<String> galleryName() {
        return this.galleryName;
    }

    /**
     * The name of the Shared Image.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Shared Image.
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

    private GetSharedImageArgs() {}

    private GetSharedImageArgs(GetSharedImageArgs $) {
        this.galleryName = $.galleryName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedImageArgs $;

        public Builder() {
            $ = new GetSharedImageArgs();
        }

        public Builder(GetSharedImageArgs defaults) {
            $ = new GetSharedImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Shared Image exists.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(Output<String> galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Shared Image exists.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            return galleryName(Output.of(galleryName));
        }

        /**
         * @param name The name of the Shared Image.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Shared Image.
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

        public GetSharedImageArgs build() {
            if ($.galleryName == null) {
                throw new MissingRequiredPropertyException("GetSharedImageArgs", "galleryName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSharedImageArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetSharedImageArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
