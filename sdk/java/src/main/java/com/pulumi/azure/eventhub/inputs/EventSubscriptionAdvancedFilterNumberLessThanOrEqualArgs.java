// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs Empty = new EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs();

    /**
     * Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<Double> value;

    public Output<Double> value() {
        return this.value;
    }

    private EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs() {}

    private EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs(EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs $;

        public Builder() {
            $ = new EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs();
        }

        public Builder(EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs defaults) {
            $ = new EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("EventSubscriptionAdvancedFilterNumberLessThanOrEqualArgs", "value");
            }
            return $;
        }
    }

}
