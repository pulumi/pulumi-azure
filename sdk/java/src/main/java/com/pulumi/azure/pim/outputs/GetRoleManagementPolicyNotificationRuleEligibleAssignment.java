// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleManagementPolicyNotificationRuleEligibleAssignment {
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification> adminNotifications;
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification> approverNotifications;
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification> assigneeNotifications;

    private GetRoleManagementPolicyNotificationRuleEligibleAssignment() {}
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification> adminNotifications() {
        return this.adminNotifications;
    }
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification> approverNotifications() {
        return this.approverNotifications;
    }
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification> assigneeNotifications() {
        return this.assigneeNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyNotificationRuleEligibleAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification> adminNotifications;
        private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification> approverNotifications;
        private List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification> assigneeNotifications;
        public Builder() {}
        public Builder(GetRoleManagementPolicyNotificationRuleEligibleAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotifications = defaults.adminNotifications;
    	      this.approverNotifications = defaults.approverNotifications;
    	      this.assigneeNotifications = defaults.assigneeNotifications;
        }

        @CustomType.Setter
        public Builder adminNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification> adminNotifications) {
            if (adminNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignment", "adminNotifications");
            }
            this.adminNotifications = adminNotifications;
            return this;
        }
        public Builder adminNotifications(GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification... adminNotifications) {
            return adminNotifications(List.of(adminNotifications));
        }
        @CustomType.Setter
        public Builder approverNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification> approverNotifications) {
            if (approverNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignment", "approverNotifications");
            }
            this.approverNotifications = approverNotifications;
            return this;
        }
        public Builder approverNotifications(GetRoleManagementPolicyNotificationRuleEligibleAssignmentApproverNotification... approverNotifications) {
            return approverNotifications(List.of(approverNotifications));
        }
        @CustomType.Setter
        public Builder assigneeNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification> assigneeNotifications) {
            if (assigneeNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignment", "assigneeNotifications");
            }
            this.assigneeNotifications = assigneeNotifications;
            return this;
        }
        public Builder assigneeNotifications(GetRoleManagementPolicyNotificationRuleEligibleAssignmentAssigneeNotification... assigneeNotifications) {
            return assigneeNotifications(List.of(assigneeNotifications));
        }
        public GetRoleManagementPolicyNotificationRuleEligibleAssignment build() {
            final var _resultValue = new GetRoleManagementPolicyNotificationRuleEligibleAssignment();
            _resultValue.adminNotifications = adminNotifications;
            _resultValue.approverNotifications = approverNotifications;
            _resultValue.assigneeNotifications = assigneeNotifications;
            return _resultValue;
        }
    }
}
