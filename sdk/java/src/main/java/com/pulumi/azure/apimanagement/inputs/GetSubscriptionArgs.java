// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionArgs Empty = new GetSubscriptionArgs();

    /**
     * The ID of the API Management Service in which this Subscription exists.
     * 
     */
    @Import(name="apiManagementId", required=true)
    private Output<String> apiManagementId;

    /**
     * @return The ID of the API Management Service in which this Subscription exists.
     * 
     */
    public Output<String> apiManagementId() {
        return this.apiManagementId;
    }

    /**
     * The Identifier for the API Management Subscription.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return The Identifier for the API Management Subscription.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private GetSubscriptionArgs() {}

    private GetSubscriptionArgs(GetSubscriptionArgs $) {
        this.apiManagementId = $.apiManagementId;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionArgs $;

        public Builder() {
            $ = new GetSubscriptionArgs();
        }

        public Builder(GetSubscriptionArgs defaults) {
            $ = new GetSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementId The ID of the API Management Service in which this Subscription exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(Output<String> apiManagementId) {
            $.apiManagementId = apiManagementId;
            return this;
        }

        /**
         * @param apiManagementId The ID of the API Management Service in which this Subscription exists.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(String apiManagementId) {
            return apiManagementId(Output.of(apiManagementId));
        }

        /**
         * @param subscriptionId The Identifier for the API Management Subscription.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId The Identifier for the API Management Subscription.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public GetSubscriptionArgs build() {
            if ($.apiManagementId == null) {
                throw new MissingRequiredPropertyException("GetSubscriptionArgs", "apiManagementId");
            }
            if ($.subscriptionId == null) {
                throw new MissingRequiredPropertyException("GetSubscriptionArgs", "subscriptionId");
            }
            return $;
        }
    }

}
