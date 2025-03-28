// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetApiVersionSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiVersionSetPlainArgs Empty = new GetApiVersionSetPlainArgs();

    /**
     * The name of the API Management Service where the API Version Set exists.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private String apiManagementName;

    /**
     * @return The name of the API Management Service where the API Version Set exists.
     * 
     */
    public String apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The name of the API Version Set.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the API Version Set.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the Resource Group in which the parent API Management Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group in which the parent API Management Service exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetApiVersionSetPlainArgs() {}

    private GetApiVersionSetPlainArgs(GetApiVersionSetPlainArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiVersionSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiVersionSetPlainArgs $;

        public Builder() {
            $ = new GetApiVersionSetPlainArgs();
        }

        public Builder(GetApiVersionSetPlainArgs defaults) {
            $ = new GetApiVersionSetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service where the API Version Set exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param name The name of the API Version Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the parent API Management Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetApiVersionSetPlainArgs build() {
            if ($.apiManagementName == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetPlainArgs", "apiManagementName");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetPlainArgs", "name");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetApiVersionSetPlainArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
