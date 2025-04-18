// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionDeliveryIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionDeliveryIdentityArgs Empty = new EventSubscriptionDeliveryIdentityArgs();

    /**
     * Specifies the type of Managed Service Identity that is used for event delivery. Allowed value is `SystemAssigned`, `UserAssigned`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that is used for event delivery. Allowed value is `SystemAssigned`, `UserAssigned`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The user identity associated with the resource.
     * 
     */
    @Import(name="userAssignedIdentity")
    private @Nullable Output<String> userAssignedIdentity;

    /**
     * @return The user identity associated with the resource.
     * 
     */
    public Optional<Output<String>> userAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    private EventSubscriptionDeliveryIdentityArgs() {}

    private EventSubscriptionDeliveryIdentityArgs(EventSubscriptionDeliveryIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentity = $.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionDeliveryIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionDeliveryIdentityArgs $;

        public Builder() {
            $ = new EventSubscriptionDeliveryIdentityArgs();
        }

        public Builder(EventSubscriptionDeliveryIdentityArgs defaults) {
            $ = new EventSubscriptionDeliveryIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that is used for event delivery. Allowed value is `SystemAssigned`, `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that is used for event delivery. Allowed value is `SystemAssigned`, `UserAssigned`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userAssignedIdentity The user identity associated with the resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(@Nullable Output<String> userAssignedIdentity) {
            $.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        /**
         * @param userAssignedIdentity The user identity associated with the resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(String userAssignedIdentity) {
            return userAssignedIdentity(Output.of(userAssignedIdentity));
        }

        public EventSubscriptionDeliveryIdentityArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("EventSubscriptionDeliveryIdentityArgs", "type");
            }
            return $;
        }
    }

}
