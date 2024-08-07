// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotifications;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotifications;
import com.pulumi.azure.pim.outputs.RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotifications;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoleManagementPolicyNotificationRulesEligibleActivations {
    /**
     * @return Admin notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotifications adminNotifications;
    /**
     * @return Approver notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotifications approverNotifications;
    /**
     * @return Assignee notification settings
     * 
     */
    private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotifications assigneeNotifications;

    private RoleManagementPolicyNotificationRulesEligibleActivations() {}
    /**
     * @return Admin notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotifications> adminNotifications() {
        return Optional.ofNullable(this.adminNotifications);
    }
    /**
     * @return Approver notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotifications> approverNotifications() {
        return Optional.ofNullable(this.approverNotifications);
    }
    /**
     * @return Assignee notification settings
     * 
     */
    public Optional<RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotifications> assigneeNotifications() {
        return Optional.ofNullable(this.assigneeNotifications);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleManagementPolicyNotificationRulesEligibleActivations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotifications adminNotifications;
        private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotifications approverNotifications;
        private @Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotifications assigneeNotifications;
        public Builder() {}
        public Builder(RoleManagementPolicyNotificationRulesEligibleActivations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminNotifications = defaults.adminNotifications;
    	      this.approverNotifications = defaults.approverNotifications;
    	      this.assigneeNotifications = defaults.assigneeNotifications;
        }

        @CustomType.Setter
        public Builder adminNotifications(@Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAdminNotifications adminNotifications) {

            this.adminNotifications = adminNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder approverNotifications(@Nullable RoleManagementPolicyNotificationRulesEligibleActivationsApproverNotifications approverNotifications) {

            this.approverNotifications = approverNotifications;
            return this;
        }
        @CustomType.Setter
        public Builder assigneeNotifications(@Nullable RoleManagementPolicyNotificationRulesEligibleActivationsAssigneeNotifications assigneeNotifications) {

            this.assigneeNotifications = assigneeNotifications;
            return this;
        }
        public RoleManagementPolicyNotificationRulesEligibleActivations build() {
            final var _resultValue = new RoleManagementPolicyNotificationRulesEligibleActivations();
            _resultValue.adminNotifications = adminNotifications;
            _resultValue.approverNotifications = approverNotifications;
            _resultValue.assigneeNotifications = assigneeNotifications;
            return _resultValue;
        }
    }
}
