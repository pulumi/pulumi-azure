// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleManagementPolicyNotificationRuleEligibleActivation {
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification> adminNotifications;
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification> approverNotifications;
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification> assigneeNotifications;

    private GetRoleManagementPolicyNotificationRuleEligibleActivation() {}
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification> adminNotifications() {
        return this.adminNotifications;
    }
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification> approverNotifications() {
        return this.approverNotifications;
    }
    /**
     * @return A `notification_settings` block as defined above.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification> assigneeNotifications() {
        return this.assigneeNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyNotificationRuleEligibleActivation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification> adminNotifications;
        private List<GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification> approverNotifications;
        private List<GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification> assigneeNotifications;
        public Builder() {}
        public Builder(GetRoleManagementPolicyNotificationRuleEligibleActivation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotifications = defaults.adminNotifications;
    	      this.approverNotifications = defaults.approverNotifications;
    	      this.assigneeNotifications = defaults.assigneeNotifications;
        }

        @CustomType.Setter
        public Builder adminNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification> adminNotifications) {
            if (adminNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleActivation", "adminNotifications");
            }
            this.adminNotifications = adminNotifications;
            return this;
        }
        public Builder adminNotifications(GetRoleManagementPolicyNotificationRuleEligibleActivationAdminNotification... adminNotifications) {
            return adminNotifications(List.of(adminNotifications));
        }
        @CustomType.Setter
        public Builder approverNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification> approverNotifications) {
            if (approverNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleActivation", "approverNotifications");
            }
            this.approverNotifications = approverNotifications;
            return this;
        }
        public Builder approverNotifications(GetRoleManagementPolicyNotificationRuleEligibleActivationApproverNotification... approverNotifications) {
            return approverNotifications(List.of(approverNotifications));
        }
        @CustomType.Setter
        public Builder assigneeNotifications(List<GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification> assigneeNotifications) {
            if (assigneeNotifications == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleActivation", "assigneeNotifications");
            }
            this.assigneeNotifications = assigneeNotifications;
            return this;
        }
        public Builder assigneeNotifications(GetRoleManagementPolicyNotificationRuleEligibleActivationAssigneeNotification... assigneeNotifications) {
            return assigneeNotifications(List.of(assigneeNotifications));
        }
        public GetRoleManagementPolicyNotificationRuleEligibleActivation build() {
            final var _resultValue = new GetRoleManagementPolicyNotificationRuleEligibleActivation();
            _resultValue.adminNotifications = adminNotifications;
            _resultValue.approverNotifications = approverNotifications;
            _resultValue.assigneeNotifications = assigneeNotifications;
            return _resultValue;
        }
    }
}
