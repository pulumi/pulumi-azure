// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLinuxWebAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinuxWebAppArgs Empty = new GetLinuxWebAppArgs();

    /**
     * The name of this Linux Web App.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Linux Web App.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group where the Linux Web App exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Linux Web App exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLinuxWebAppArgs() {}

    private GetLinuxWebAppArgs(GetLinuxWebAppArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinuxWebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinuxWebAppArgs $;

        public Builder() {
            $ = new GetLinuxWebAppArgs();
        }

        public Builder(GetLinuxWebAppArgs defaults) {
            $ = new GetLinuxWebAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Linux Web App.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Linux Web App exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Linux Web App exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetLinuxWebAppArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetLinuxWebAppArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetLinuxWebAppArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
