// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFrontdoorEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFrontdoorEndpointArgs Empty = new GetFrontdoorEndpointArgs();

    /**
     * Specifies the name of the Front Door Endpoint.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the Front Door Endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Front Door Profile within which Front Door Endpoint exists.
     * 
     */
    @Import(name="profileName", required=true)
    private Output<String> profileName;

    /**
     * @return The name of the Front Door Profile within which Front Door Endpoint exists.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * The name of the Resource Group where the Front Door Profile exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Front Door Profile exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFrontdoorEndpointArgs() {}

    private GetFrontdoorEndpointArgs(GetFrontdoorEndpointArgs $) {
        this.name = $.name;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrontdoorEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrontdoorEndpointArgs $;

        public Builder() {
            $ = new GetFrontdoorEndpointArgs();
        }

        public Builder(GetFrontdoorEndpointArgs defaults) {
            $ = new GetFrontdoorEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Front Door Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Front Door Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param profileName The name of the Front Door Profile within which Front Door Endpoint exists.
         * 
         * @return builder
         * 
         */
        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param profileName The name of the Front Door Profile within which Front Door Endpoint exists.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Front Door Profile exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Front Door Profile exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetFrontdoorEndpointArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetFrontdoorEndpointArgs", "name");
            }
            if ($.profileName == null) {
                throw new MissingRequiredPropertyException("GetFrontdoorEndpointArgs", "profileName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("GetFrontdoorEndpointArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
