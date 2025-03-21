// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactState extends com.pulumi.resources.ResourceArgs {

    public static final ContactState Empty = new ContactState();

    /**
     * Whether to send security alerts notifications to the security contact.
     * 
     */
    @Import(name="alertNotifications")
    private @Nullable Output<Boolean> alertNotifications;

    /**
     * @return Whether to send security alerts notifications to the security contact.
     * 
     */
    public Optional<Output<Boolean>> alertNotifications() {
        return Optional.ofNullable(this.alertNotifications);
    }

    /**
     * Whether to send security alerts notifications to subscription admins.
     * 
     */
    @Import(name="alertsToAdmins")
    private @Nullable Output<Boolean> alertsToAdmins;

    /**
     * @return Whether to send security alerts notifications to subscription admins.
     * 
     */
    public Optional<Output<Boolean>> alertsToAdmins() {
        return Optional.ofNullable(this.alertsToAdmins);
    }

    /**
     * The email of the Security Center Contact.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email of the Security Center Contact.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The phone number of the Security Center Contact.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    /**
     * @return The phone number of the Security Center Contact.
     * 
     */
    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    private ContactState() {}

    private ContactState(ContactState $) {
        this.alertNotifications = $.alertNotifications;
        this.alertsToAdmins = $.alertsToAdmins;
        this.email = $.email;
        this.name = $.name;
        this.phone = $.phone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactState $;

        public Builder() {
            $ = new ContactState();
        }

        public Builder(ContactState defaults) {
            $ = new ContactState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertNotifications Whether to send security alerts notifications to the security contact.
         * 
         * @return builder
         * 
         */
        public Builder alertNotifications(@Nullable Output<Boolean> alertNotifications) {
            $.alertNotifications = alertNotifications;
            return this;
        }

        /**
         * @param alertNotifications Whether to send security alerts notifications to the security contact.
         * 
         * @return builder
         * 
         */
        public Builder alertNotifications(Boolean alertNotifications) {
            return alertNotifications(Output.of(alertNotifications));
        }

        /**
         * @param alertsToAdmins Whether to send security alerts notifications to subscription admins.
         * 
         * @return builder
         * 
         */
        public Builder alertsToAdmins(@Nullable Output<Boolean> alertsToAdmins) {
            $.alertsToAdmins = alertsToAdmins;
            return this;
        }

        /**
         * @param alertsToAdmins Whether to send security alerts notifications to subscription admins.
         * 
         * @return builder
         * 
         */
        public Builder alertsToAdmins(Boolean alertsToAdmins) {
            return alertsToAdmins(Output.of(alertsToAdmins));
        }

        /**
         * @param email The email of the Security Center Contact.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email of the Security Center Contact.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param name The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Security Center Contact. Changing this forces a new Security Center Contact to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phone The phone number of the Security Center Contact.
         * 
         * @return builder
         * 
         */
        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone The phone number of the Security Center Contact.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        public ContactState build() {
            return $;
        }
    }

}
