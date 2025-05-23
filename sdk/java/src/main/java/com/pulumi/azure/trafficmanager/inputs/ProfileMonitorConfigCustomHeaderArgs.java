// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.trafficmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ProfileMonitorConfigCustomHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProfileMonitorConfigCustomHeaderArgs Empty = new ProfileMonitorConfigCustomHeaderArgs();

    /**
     * The name of the custom header.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the custom header.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of custom header. Applicable for HTTP and HTTPS protocol.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of custom header. Applicable for HTTP and HTTPS protocol.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ProfileMonitorConfigCustomHeaderArgs() {}

    private ProfileMonitorConfigCustomHeaderArgs(ProfileMonitorConfigCustomHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfileMonitorConfigCustomHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfileMonitorConfigCustomHeaderArgs $;

        public Builder() {
            $ = new ProfileMonitorConfigCustomHeaderArgs();
        }

        public Builder(ProfileMonitorConfigCustomHeaderArgs defaults) {
            $ = new ProfileMonitorConfigCustomHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the custom header.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of custom header. Applicable for HTTP and HTTPS protocol.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of custom header. Applicable for HTTP and HTTPS protocol.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProfileMonitorConfigCustomHeaderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProfileMonitorConfigCustomHeaderArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ProfileMonitorConfigCustomHeaderArgs", "value");
            }
            return $;
        }
    }

}
