// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.inputs;

import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs;
import com.pulumi.azure.pim.inputs.RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleManagementPolicyNotificationRulesEligibleActivationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleManagementPolicyNotificationRulesEligibleActivationsArgs Empty = new RoleManagementPolicyNotificationRulesEligibleActivationsArgs();

    /**
     * Admin notification settings
     * 
     */
    @Import(name="adminNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs> adminNotifications;

    /**
     * @return Admin notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs>> adminNotifications() {
        return Optional.ofNullable(this.adminNotifications);
    }

    /**
     * Approver notification settings
     * 
     */
    @Import(name="approverNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs> approverNotifications;

    /**
     * @return Approver notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs>> approverNotifications() {
        return Optional.ofNullable(this.approverNotifications);
    }

    /**
     * Assignee notification settings
     * 
     */
    @Import(name="assigneeNotifications")
    private @Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs> assigneeNotifications;

    /**
     * @return Assignee notification settings
     * 
     */
    public Optional<Output<RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs>> assigneeNotifications() {
        return Optional.ofNullable(this.assigneeNotifications);
    }

    private RoleManagementPolicyNotificationRulesEligibleActivationsArgs() {}

    private RoleManagementPolicyNotificationRulesEligibleActivationsArgs(RoleManagementPolicyNotificationRulesEligibleActivationsArgs $) {
        this.adminNotifications = $.adminNotifications;
        this.approverNotifications = $.approverNotifications;
        this.assigneeNotifications = $.assigneeNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleManagementPolicyNotificationRulesEligibleActivationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleManagementPolicyNotificationRulesEligibleActivationsArgs $;

        public Builder() {
            $ = new RoleManagementPolicyNotificationRulesEligibleActivationsArgs();
        }

        public Builder(RoleManagementPolicyNotificationRulesEligibleActivationsArgs defaults) {
            $ = new RoleManagementPolicyNotificationRulesEligibleActivationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminNotifications Admin notification settings
         * 
         * @return builder
         * 
         */
        public Builder adminNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs> adminNotifications) {
            $.adminNotifications = adminNotifications;
            return this;
        }

        /**
         * @param adminNotifications Admin notification settings
         * 
         * @return builder
         * 
         */
        public Builder adminNotifications(RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotificationsArgs adminNotifications) {
            return adminNotifications(Output.of(adminNotifications));
        }

        /**
         * @param approverNotifications Approver notification settings
         * 
         * @return builder
         * 
         */
        public Builder approverNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs> approverNotifications) {
            $.approverNotifications = approverNotifications;
            return this;
        }

        /**
         * @param approverNotifications Approver notification settings
         * 
         * @return builder
         * 
         */
        public Builder approverNotifications(RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotificationsArgs approverNotifications) {
            return approverNotifications(Output.of(approverNotifications));
        }

        /**
         * @param assigneeNotifications Assignee notification settings
         * 
         * @return builder
         * 
         */
        public Builder assigneeNotifications(@Nullable Output<RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs> assigneeNotifications) {
            $.assigneeNotifications = assigneeNotifications;
            return this;
        }

        /**
         * @param assigneeNotifications Assignee notification settings
         * 
         * @return builder
         * 
         */
        public Builder assigneeNotifications(RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotificationsArgs assigneeNotifications) {
            return assigneeNotifications(Output.of(assigneeNotifications));
        }

        public RoleManagementPolicyNotificationRulesEligibleActivationsArgs build() {
            return $;
        }
    }

}
