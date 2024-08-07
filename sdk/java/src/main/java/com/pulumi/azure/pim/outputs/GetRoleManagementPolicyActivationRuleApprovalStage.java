// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleManagementPolicyActivationRuleApprovalStage {
    /**
     * @return The IDs of the users or groups who can approve the activation
     * 
     */
    private List<GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover> primaryApprovers;

    private GetRoleManagementPolicyActivationRuleApprovalStage() {}
    /**
     * @return The IDs of the users or groups who can approve the activation
     * 
     */
    public List<GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover> primaryApprovers() {
        return this.primaryApprovers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyActivationRuleApprovalStage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover> primaryApprovers;
        public Builder() {}
        public Builder(GetRoleManagementPolicyActivationRuleApprovalStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryApprovers = defaults.primaryApprovers;
        }

        @CustomType.Setter
        public Builder primaryApprovers(List<GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover> primaryApprovers) {
            if (primaryApprovers == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyActivationRuleApprovalStage", "primaryApprovers");
            }
            this.primaryApprovers = primaryApprovers;
            return this;
        }
        public Builder primaryApprovers(GetRoleManagementPolicyActivationRuleApprovalStagePrimaryApprover... primaryApprovers) {
            return primaryApprovers(List.of(primaryApprovers));
        }
        public GetRoleManagementPolicyActivationRuleApprovalStage build() {
            final var _resultValue = new GetRoleManagementPolicyActivationRuleApprovalStage();
            _resultValue.primaryApprovers = primaryApprovers;
            return _resultValue;
        }
    }
}
