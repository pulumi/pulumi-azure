// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetApiVersionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiVersionSetArgs Empty = new GetApiVersionSetArgs();

    /**
     * The name of the API Management Service where the API Version Set exists.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service where the API Version Set exists.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The name of the API Version Set.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the API Version Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the parent API Management Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the parent API Management Service exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetApiVersionSetArgs() {}

    private GetApiVersionSetArgs(GetApiVersionSetArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiVersionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiVersionSetArgs $;

        public Builder() {
            $ = new GetApiVersionSetArgs();
        }

        public Builder(GetApiVersionSetArgs defaults) {
            $ = new GetApiVersionSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service where the API Version Set exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service where the API Version Set exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param name The name of the API Version Set.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the API Version Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the parent API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the parent API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetApiVersionSetArgs build() {
            if ($.apiManagementName == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetArgs", "apiManagementName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
