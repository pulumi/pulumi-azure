// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * The name of the API Management Service in which the User should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the User should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * The kind of confirmation email which will be sent to this user. Possible values are `invite` and `signup`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="confirmation")
    private @Nullable Output<String> confirmation;

    /**
     * @return The kind of confirmation email which will be sent to this user. Possible values are `invite` and `signup`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> confirmation() {
        return Optional.ofNullable(this.confirmation);
    }

    /**
     * The email address associated with this user.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address associated with this user.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The first name for this user.
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return The first name for this user.
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * The last name for this user.
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return The last name for this user.
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * A note about this user.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    /**
     * @return A note about this user.
     * 
     */
    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * The password associated with this user.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password associated with this user.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The state of this user. Possible values are `active`, `blocked` and `pending`.
     * 
     * &gt; **Note:** the State can be changed from Pending &gt; Active/Blocked but not from Active/Blocked &gt; Pending.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of this user. Possible values are `active`, `blocked` and `pending`.
     * 
     * &gt; **Note:** the State can be changed from Pending &gt; Active/Blocked but not from Active/Blocked &gt; Pending.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The Identifier for this User, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The Identifier for this User, which must be unique within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.apiManagementName = $.apiManagementName;
        this.confirmation = $.confirmation;
        this.email = $.email;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
        this.note = $.note;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.state = $.state;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the User should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service in which the User should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param confirmation The kind of confirmation email which will be sent to this user. Possible values are `invite` and `signup`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(@Nullable Output<String> confirmation) {
            $.confirmation = confirmation;
            return this;
        }

        /**
         * @param confirmation The kind of confirmation email which will be sent to this user. Possible values are `invite` and `signup`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(String confirmation) {
            return confirmation(Output.of(confirmation));
        }

        /**
         * @param email The email address associated with this user.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address associated with this user.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firstName The first name for this user.
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName The first name for this user.
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param lastName The last name for this user.
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName The last name for this user.
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param note A note about this user.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note A note about this user.
         * 
         * @return builder
         * 
         */
        public Builder note(String note) {
            return note(Output.of(note));
        }

        /**
         * @param password The password associated with this user.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password associated with this user.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param state The state of this user. Possible values are `active`, `blocked` and `pending`.
         * 
         * &gt; **Note:** the State can be changed from Pending &gt; Active/Blocked but not from Active/Blocked &gt; Pending.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of this user. Possible values are `active`, `blocked` and `pending`.
         * 
         * &gt; **Note:** the State can be changed from Pending &gt; Active/Blocked but not from Active/Blocked &gt; Pending.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param userId The Identifier for this User, which must be unique within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The Identifier for this User, which must be unique within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserState build() {
            return $;
        }
    }

}
