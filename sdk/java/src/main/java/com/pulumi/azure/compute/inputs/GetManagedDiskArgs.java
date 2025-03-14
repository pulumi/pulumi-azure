// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDiskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDiskArgs Empty = new GetManagedDiskArgs();

    /**
     * Specifies the name of the Managed Disk.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Managed Disk.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the Resource Group where this Managed Disk exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where this Managed Disk exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedDiskArgs() {}

    private GetManagedDiskArgs(GetManagedDiskArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDiskArgs $;

        public Builder() {
            $ = new GetManagedDiskArgs();
        }

        public Builder(GetManagedDiskArgs defaults) {
            $ = new GetManagedDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Managed Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Managed Disk.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where this Managed Disk exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where this Managed Disk exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetManagedDiskArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetManagedDiskArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetManagedDiskArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
