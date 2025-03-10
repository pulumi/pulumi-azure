// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GatewayApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayApiArgs Empty = new GatewayApiArgs();

    /**
     * The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    private GatewayApiArgs() {}

    private GatewayApiArgs(GatewayApiArgs $) {
        this.apiId = $.apiId;
        this.gatewayId = $.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayApiArgs $;

        public Builder() {
            $ = new GatewayApiArgs();
        }

        public Builder(GatewayApiArgs defaults) {
            $ = new GatewayApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId The Identifier of the API Management API within the API Management Service. Changing this forces a new API Management Gateway API to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param gatewayId The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId The Identifier for the API Management Gateway. Changing this forces a new API Management Gateway API to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        public GatewayApiArgs build() {
            if ($.apiId == null) {
                throw new MissingRequiredPropertyException("GatewayApiArgs", "apiId");
            }
            if ($.gatewayId == null) {
                throw new MissingRequiredPropertyException("GatewayApiArgs", "gatewayId");
            }
            return $;
        }
    }

}
