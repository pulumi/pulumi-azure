// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorUserArgs Empty = new MonitorUserArgs();

    /**
     * Email of the user used by Datadog for contacting them if needed. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return Email of the user used by Datadog for contacting them if needed. Changing this forces a new Datadog Monitor to be created.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * The name which should be used for this user_info. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this user_info. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Phone number of the user used by Datadog for contacting them if needed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable Output<String> phoneNumber;

    /**
     * @return Phone number of the user used by Datadog for contacting them if needed. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    private MonitorUserArgs() {}

    private MonitorUserArgs(MonitorUserArgs $) {
        this.email = $.email;
        this.name = $.name;
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorUserArgs $;

        public Builder() {
            $ = new MonitorUserArgs();
        }

        public Builder(MonitorUserArgs defaults) {
            $ = new MonitorUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email Email of the user used by Datadog for contacting them if needed. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email of the user used by Datadog for contacting them if needed. Changing this forces a new Datadog Monitor to be created.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param name The name which should be used for this user_info. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this user_info. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phoneNumber Phone number of the user used by Datadog for contacting them if needed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber Phone number of the user used by Datadog for contacting them if needed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public MonitorUserArgs build() {
            if ($.email == null) {
                throw new MissingRequiredPropertyException("MonitorUserArgs", "email");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("MonitorUserArgs", "name");
            }
            return $;
        }
    }

}
