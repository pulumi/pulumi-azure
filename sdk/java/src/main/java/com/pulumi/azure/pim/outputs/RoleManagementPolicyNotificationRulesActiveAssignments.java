// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotifications;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotifications;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotifications;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoleManagementPolicyNotificationRulesActiveAssignments {
    /**
     * @return Admin notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotifications adminNotifications;
    /**
     * @return Approver notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotifications approverNotifications;
    /**
     * @return Assignee notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotifications assigneeNotifications;

    private RoleManagementPolicyNotificationRulesActiveAssignments() {}
    /**
     * @return Admin notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotifications> adminNotifications() {
        return Optional.ofNullable(this.adminNotifications);
    }
    /**
     * @return Approver notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotifications> approverNotifications() {
        return Optional.ofNullable(this.approverNotifications);
    }
    /**
     * @return Assignee notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotifications> assigneeNotifications() {
        return Optional.ofNullable(this.assigneeNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleManagementPolicyNotificationRulesActiveAssignments defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotifications adminNotifications;
        private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotifications approverNotifications;
        private @Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotifications assigneeNotifications;
        public Builder() {}
        public Builder(RoleManagementPolicyNotificationRulesActiveAssignments defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotifications = defaults.adminNotifications;
    	      this.approverNotifications = defaults.approverNotifications;
    	      this.assigneeNotifications = defaults.assigneeNotifications;
        }

        @CustomType.Setter
        public Builder adminNotifications(@Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAdminNotifications adminNotifications) {

            this.adminNotifications = adminNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder approverNotifications(@Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsApproverNotifications approverNotifications) {

            this.approverNotifications = approverNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder assigneeNotifications(@Nullable RoleManagementPolicyNotificationRulesActiveAssignmentsAssigneeNotifications assigneeNotifications) {

            this.assigneeNotifications = assigneeNotifications;
            return this;
        }
        public RoleManagementPolicyNotificationRulesActiveAssignments build() {
            final var _resultValue = new RoleManagementPolicyNotificationRulesActiveAssignments();
            _resultValue.adminNotifications = adminNotifications;
            _resultValue.approverNotifications = approverNotifications;
            _resultValue.assigneeNotifications = assigneeNotifications;
            return _resultValue;
        }
    }
}
