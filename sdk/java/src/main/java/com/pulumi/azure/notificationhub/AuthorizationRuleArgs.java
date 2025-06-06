// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorizationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationRuleArgs Empty = new AuthorizationRuleArgs();

    /**
     * Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
     * 
     */
    @Import(name="listen")
    private @Nullable Output<Boolean> listen;

    /**
     * @return Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> listen() {
        return Optional.ofNullable(this.listen);
    }

    /**
     * Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
     * 
     * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
     * 
     */
    @Import(name="manage")
    private @Nullable Output<Boolean> manage;

    /**
     * @return Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
     * 
     * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
     * 
     */
    public Optional<Output<Boolean>> manage() {
        return Optional.ofNullable(this.manage);
    }

    /**
     * The name to use for this Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to use for this Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="notificationHubName", required=true)
    private Output<String> notificationHubName;

    /**
     * @return The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> notificationHubName() {
        return this.notificationHubName;
    }

    /**
     * The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
     * 
     */
    @Import(name="send")
    private @Nullable Output<Boolean> send;

    /**
     * @return Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> send() {
        return Optional.ofNullable(this.send);
    }

    private AuthorizationRuleArgs() {}

    private AuthorizationRuleArgs(AuthorizationRuleArgs $) {
        this.listen = $.listen;
        this.manage = $.manage;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.notificationHubName = $.notificationHubName;
        this.resourceGroupName = $.resourceGroupName;
        this.send = $.send;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationRuleArgs $;

        public Builder() {
            $ = new AuthorizationRuleArgs();
        }

        public Builder(AuthorizationRuleArgs defaults) {
            $ = new AuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listen Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(@Nullable Output<Boolean> listen) {
            $.listen = listen;
            return this;
        }

        /**
         * @param listen Does this Authorization Rule have Listen access to the Notification Hub? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(Boolean listen) {
            return listen(Output.of(listen));
        }

        /**
         * @param manage Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
         * 
         * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder manage(@Nullable Output<Boolean> manage) {
            $.manage = manage;
            return this;
        }

        /**
         * @param manage Does this Authorization Rule have Manage access to the Notification Hub? Defaults to `false`.
         * 
         * &gt; **Note:** If `manage` is set to `true` then both `send` and `listen` must also be set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder manage(Boolean manage) {
            return manage(Output.of(manage));
        }

        /**
         * @param name The name to use for this Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use for this Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The name of the Notification Hub Namespace in which the Notification Hub exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param notificationHubName The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder notificationHubName(Output<String> notificationHubName) {
            $.notificationHubName = notificationHubName;
            return this;
        }

        /**
         * @param notificationHubName The name of the Notification Hub for which the Authorization Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder notificationHubName(String notificationHubName) {
            return notificationHubName(Output.of(notificationHubName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Notification Hub Namespace exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param send Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(@Nullable Output<Boolean> send) {
            $.send = send;
            return this;
        }

        /**
         * @param send Does this Authorization Rule have Send access to the Notification Hub? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(Boolean send) {
            return send(Output.of(send));
        }

        public AuthorizationRuleArgs build() {
            if ($.namespaceName == null) {
                throw new MissingRequiredPropertyException("AuthorizationRuleArgs", "namespaceName");
            }
            if ($.notificationHubName == null) {
                throw new MissingRequiredPropertyException("AuthorizationRuleArgs", "notificationHubName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("AuthorizationRuleArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
