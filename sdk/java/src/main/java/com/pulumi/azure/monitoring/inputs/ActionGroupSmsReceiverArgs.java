// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ActionGroupSmsReceiverArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupSmsReceiverArgs Empty = new ActionGroupSmsReceiverArgs();

    /**
     * The country code of the SMS receiver.
     * 
     */
    @Import(name="countryCode", required=true)
    private Output<String> countryCode;

    /**
     * @return The country code of the SMS receiver.
     * 
     */
    public Output<String> countryCode() {
        return this.countryCode;
    }

    /**
     * The name of the SMS receiver. Names must be unique (case-insensitive) across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the SMS receiver. Names must be unique (case-insensitive) across all receivers within an action group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The phone number of the SMS receiver.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private Output<String> phoneNumber;

    /**
     * @return The phone number of the SMS receiver.
     * 
     */
    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }

    private ActionGroupSmsReceiverArgs() {}

    private ActionGroupSmsReceiverArgs(ActionGroupSmsReceiverArgs $) {
        this.countryCode = $.countryCode;
        this.name = $.name;
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupSmsReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupSmsReceiverArgs $;

        public Builder() {
            $ = new ActionGroupSmsReceiverArgs();
        }

        public Builder(ActionGroupSmsReceiverArgs defaults) {
            $ = new ActionGroupSmsReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param countryCode The country code of the SMS receiver.
         * 
         * @return builder
         * 
         */
        public Builder countryCode(Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        /**
         * @param countryCode The country code of the SMS receiver.
         * 
         * @return builder
         * 
         */
        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        /**
         * @param name The name of the SMS receiver. Names must be unique (case-insensitive) across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SMS receiver. Names must be unique (case-insensitive) across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phoneNumber The phone number of the SMS receiver.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber The phone number of the SMS receiver.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public ActionGroupSmsReceiverArgs build() {
            if ($.countryCode == null) {
                throw new MissingRequiredPropertyException("ActionGroupSmsReceiverArgs", "countryCode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ActionGroupSmsReceiverArgs", "name");
            }
            if ($.phoneNumber == null) {
                throw new MissingRequiredPropertyException("ActionGroupSmsReceiverArgs", "phoneNumber");
            }
            return $;
        }
    }

}
