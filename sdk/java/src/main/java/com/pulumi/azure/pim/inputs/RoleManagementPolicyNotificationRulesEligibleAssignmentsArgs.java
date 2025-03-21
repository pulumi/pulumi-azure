// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.inputs;

import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs Empty = new RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs();

    /**
     * Admin notification settings
     * 
     */
    @Import(name="adminNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs> adminNotifications;

    /**
     * @return Admin notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs>> adminNotifications() {
        return Optional.ofNullable(this.adminNotifications);
    }

    /**
     * Approver notification settings
     * 
     */
    @Import(name="approverNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs> approverNotifications;

    /**
     * @return Approver notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs>> approverNotifications() {
        return Optional.ofNullable(this.approverNotifications);
    }

    /**
     * Assignee notification settings
     * 
     */
    @Import(name="assigneeNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs> assigneeNotifications;

    /**
     * @return Assignee notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs>> assigneeNotifications() {
        return Optional.ofNullable(this.assigneeNotifications);
    }

    private RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs() {}

    private RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs(RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs $) {
        this.adminNotifications = $.adminNotifications;
        this.approverNotifications = $.approverNotifications;
        this.assigneeNotifications = $.assigneeNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs $;

        public Builder() {
            $ = new RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs();
        }

        public Builder(RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs defaults) {
            $ = new RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminNotifications Admin notification settings
         * 
         * @return builder
         * 
         */
        public Builder adminNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs> adminNotifications) {
            $.adminNotifications = adminNotifications;
            return this;
        }

        /**
         * @param adminNotifications Admin notification settings
         * 
         * @return builder
         * 
         */
        public Builder adminNotifications(RoleManagementPolicyNotificationRulesEligibleAssignmentsAdminNotificationsArgs adminNotifications) {
            return adminNotifications(Output.of(adminNotifications));
        }

        /**
         * @param approverNotifications Approver notification settings
         * 
         * @return builder
         * 
         */
        public Builder approverNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs> approverNotifications) {
            $.approverNotifications = approverNotifications;
            return this;
        }

        /**
         * @param approverNotifications Approver notification settings
         * 
         * @return builder
         * 
         */
        public Builder approverNotifications(RoleManagementPolicyNotificationRulesEligibleAssignmentsApproverNotificationsArgs approverNotifications) {
            return approverNotifications(Output.of(approverNotifications));
        }

        /**
         * @param assigneeNotifications Assignee notification settings
         * 
         * @return builder
         * 
         */
        public Builder assigneeNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs> assigneeNotifications) {
            $.assigneeNotifications = assigneeNotifications;
            return this;
        }

        /**
         * @param assigneeNotifications Assignee notification settings
         * 
         * @return builder
         * 
         */
        public Builder assigneeNotifications(RoleManagementPolicyNotificationRulesEligibleAssignmentsAssigneeNotificationsArgs assigneeNotifications) {
            return assigneeNotifications(Output.of(assigneeNotifications));
        }

        public RoleManagementPolicyNotificationRulesEligibleAssignmentsArgs build() {
            return $;
        }
    }

}
