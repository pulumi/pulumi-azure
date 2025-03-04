// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.inputs;

import com.pulumi.azure.pim.inputs.RoleManagementPolicyActivationRulesArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyActiveAssignmentRulesArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyEligibleAssignmentRulesArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleManagementPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RoleManagementPolicyState Empty = new RoleManagementPolicyState();

    /**
     * An `activation_rules` block as defined below.
     * 
     */
    @Import(name="activationRules")
    private @Nullable Output<RoleManagementPolicyActivationRulesArgs> activationRules;

    /**
     * @return An `activation_rules` block as defined below.
     * 
     */
    public Optional<Output<RoleManagementPolicyActivationRulesArgs>> activationRules() {
        return Optional.ofNullable(this.activationRules);
    }

    /**
     * An `active_assignment_rules` block as defined below.
     * 
     */
    @Import(name="activeAssignmentRules")
    private @Nullable Output<RoleManagementPolicyActiveAssignmentRulesArgs> activeAssignmentRules;

    /**
     * @return An `active_assignment_rules` block as defined below.
     * 
     */
    public Optional<Output<RoleManagementPolicyActiveAssignmentRulesArgs>> activeAssignmentRules() {
        return Optional.ofNullable(this.activeAssignmentRules);
    }

    /**
     * (String) The description of this policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (String) The description of this policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An `eligible_assignment_rules` block as defined below.
     * 
     */
    @Import(name="eligibleAssignmentRules")
    private @Nullable Output<RoleManagementPolicyEligibleAssignmentRulesArgs> eligibleAssignmentRules;

    /**
     * @return An `eligible_assignment_rules` block as defined below.
     * 
     */
    public Optional<Output<RoleManagementPolicyEligibleAssignmentRulesArgs>> eligibleAssignmentRules() {
        return Optional.ofNullable(this.eligibleAssignmentRules);
    }

    /**
     * (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `notification_rules` block as defined below.
     * 
     */
    @Import(name="notificationRules")
    private @Nullable Output<RoleManagementPolicyNotificationRulesArgs> notificationRules;

    /**
     * @return A `notification_rules` block as defined below.
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesArgs>> notificationRules() {
        return Optional.ofNullable(this.notificationRules);
    }

    /**
     * The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="roleDefinitionId")
    private @Nullable Output<String> roleDefinitionId;

    /**
     * @return The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> roleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }

    /**
     * The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private RoleManagementPolicyState() {}

    private RoleManagementPolicyState(RoleManagementPolicyState $) {
        this.activationRules = $.activationRules;
        this.activeAssignmentRules = $.activeAssignmentRules;
        this.description = $.description;
        this.eligibleAssignmentRules = $.eligibleAssignmentRules;
        this.name = $.name;
        this.notificationRules = $.notificationRules;
        this.roleDefinitionId = $.roleDefinitionId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleManagementPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleManagementPolicyState $;

        public Builder() {
            $ = new RoleManagementPolicyState();
        }

        public Builder(RoleManagementPolicyState defaults) {
            $ = new RoleManagementPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationRules An `activation_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder activationRules(@Nullable Output<RoleManagementPolicyActivationRulesArgs> activationRules) {
            $.activationRules = activationRules;
            return this;
        }

        /**
         * @param activationRules An `activation_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder activationRules(RoleManagementPolicyActivationRulesArgs activationRules) {
            return activationRules(Output.of(activationRules));
        }

        /**
         * @param activeAssignmentRules An `active_assignment_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder activeAssignmentRules(@Nullable Output<RoleManagementPolicyActiveAssignmentRulesArgs> activeAssignmentRules) {
            $.activeAssignmentRules = activeAssignmentRules;
            return this;
        }

        /**
         * @param activeAssignmentRules An `active_assignment_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder activeAssignmentRules(RoleManagementPolicyActiveAssignmentRulesArgs activeAssignmentRules) {
            return activeAssignmentRules(Output.of(activeAssignmentRules));
        }

        /**
         * @param description (String) The description of this policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (String) The description of this policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eligibleAssignmentRules An `eligible_assignment_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder eligibleAssignmentRules(@Nullable Output<RoleManagementPolicyEligibleAssignmentRulesArgs> eligibleAssignmentRules) {
            $.eligibleAssignmentRules = eligibleAssignmentRules;
            return this;
        }

        /**
         * @param eligibleAssignmentRules An `eligible_assignment_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder eligibleAssignmentRules(RoleManagementPolicyEligibleAssignmentRulesArgs eligibleAssignmentRules) {
            return eligibleAssignmentRules(Output.of(eligibleAssignmentRules));
        }

        /**
         * @param name (String) The name of this policy, which is typically a UUID and may change over time.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (String) The name of this policy, which is typically a UUID and may change over time.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationRules A `notification_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notificationRules(@Nullable Output<RoleManagementPolicyNotificationRulesArgs> notificationRules) {
            $.notificationRules = notificationRules;
            return this;
        }

        /**
         * @param notificationRules A `notification_rules` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder notificationRules(RoleManagementPolicyNotificationRulesArgs notificationRules) {
            return notificationRules(Output.of(notificationRules));
        }

        /**
         * @param roleDefinitionId The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(@Nullable Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        /**
         * @param roleDefinitionId The scoped Role Definition ID of the role for which this policy will apply. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        /**
         * @param scope The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope to which this Role Management Policy will apply. Can refer to a management group, a subscription, a resource group or a resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public RoleManagementPolicyState build() {
            return $;
        }
    }

}
