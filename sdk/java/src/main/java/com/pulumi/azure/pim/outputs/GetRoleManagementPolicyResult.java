// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyActivationRule;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyActiveAssignmentRule;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyEligibleAssignmentRule;
import com.pulumi.azure.pim.outputs.GetRoleManagementPolicyNotificationRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleManagementPolicyResult {
    /**
     * @return An `activation_rules` block as defined below.
     * 
     */
    private List<GetRoleManagementPolicyActivationRule> activationRules;
    /**
     * @return An `active_assignment_rules` block as defined below.
     * 
     */
    private List<GetRoleManagementPolicyActiveAssignmentRule> activeAssignmentRules;
    /**
     * @return (String) The description of this policy.
     * 
     */
    private String description;
    /**
     * @return An `eligible_assignment_rules` block as defined below.
     * 
     */
    private List<GetRoleManagementPolicyEligibleAssignmentRule> eligibleAssignmentRules;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    private String name;
    /**
     * @return A `notification_rules` block as defined below.
     * 
     */
    private List<GetRoleManagementPolicyNotificationRule> notificationRules;
    private String roleDefinitionId;
    private String scope;

    private GetRoleManagementPolicyResult() {}
    /**
     * @return An `activation_rules` block as defined below.
     * 
     */
    public List<GetRoleManagementPolicyActivationRule> activationRules() {
        return this.activationRules;
    }
    /**
     * @return An `active_assignment_rules` block as defined below.
     * 
     */
    public List<GetRoleManagementPolicyActiveAssignmentRule> activeAssignmentRules() {
        return this.activeAssignmentRules;
    }
    /**
     * @return (String) The description of this policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return An `eligible_assignment_rules` block as defined below.
     * 
     */
    public List<GetRoleManagementPolicyEligibleAssignmentRule> eligibleAssignmentRules() {
        return this.eligibleAssignmentRules;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (String) The name of this policy, which is typically a UUID and may change over time.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `notification_rules` block as defined below.
     * 
     */
    public List<GetRoleManagementPolicyNotificationRule> notificationRules() {
        return this.notificationRules;
    }
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRoleManagementPolicyActivationRule> activationRules;
        private List<GetRoleManagementPolicyActiveAssignmentRule> activeAssignmentRules;
        private String description;
        private List<GetRoleManagementPolicyEligibleAssignmentRule> eligibleAssignmentRules;
        private String id;
        private String name;
        private List<GetRoleManagementPolicyNotificationRule> notificationRules;
        private String roleDefinitionId;
        private String scope;
        public Builder() {}
        public Builder(GetRoleManagementPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationRules = defaults.activationRules;
    	      this.activeAssignmentRules = defaults.activeAssignmentRules;
    	      this.description = defaults.description;
    	      this.eligibleAssignmentRules = defaults.eligibleAssignmentRules;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notificationRules = defaults.notificationRules;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder activationRules(List<GetRoleManagementPolicyActivationRule> activationRules) {
            if (activationRules == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "activationRules");
            }
            this.activationRules = activationRules;
            return this;
        }
        public Builder activationRules(GetRoleManagementPolicyActivationRule... activationRules) {
            return activationRules(List.of(activationRules));
        }
        @CustomType.Setter
        public Builder activeAssignmentRules(List<GetRoleManagementPolicyActiveAssignmentRule> activeAssignmentRules) {
            if (activeAssignmentRules == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "activeAssignmentRules");
            }
            this.activeAssignmentRules = activeAssignmentRules;
            return this;
        }
        public Builder activeAssignmentRules(GetRoleManagementPolicyActiveAssignmentRule... activeAssignmentRules) {
            return activeAssignmentRules(List.of(activeAssignmentRules));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder eligibleAssignmentRules(List<GetRoleManagementPolicyEligibleAssignmentRule> eligibleAssignmentRules) {
            if (eligibleAssignmentRules == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "eligibleAssignmentRules");
            }
            this.eligibleAssignmentRules = eligibleAssignmentRules;
            return this;
        }
        public Builder eligibleAssignmentRules(GetRoleManagementPolicyEligibleAssignmentRule... eligibleAssignmentRules) {
            return eligibleAssignmentRules(List.of(eligibleAssignmentRules));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notificationRules(List<GetRoleManagementPolicyNotificationRule> notificationRules) {
            if (notificationRules == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "notificationRules");
            }
            this.notificationRules = notificationRules;
            return this;
        }
        public Builder notificationRules(GetRoleManagementPolicyNotificationRule... notificationRules) {
            return notificationRules(List.of(notificationRules));
        }
        @CustomType.Setter
        public Builder roleDefinitionId(String roleDefinitionId) {
            if (roleDefinitionId == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "roleDefinitionId");
            }
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyResult", "scope");
            }
            this.scope = scope;
            return this;
        }
        public GetRoleManagementPolicyResult build() {
            final var _resultValue = new GetRoleManagementPolicyResult();
            _resultValue.activationRules = activationRules;
            _resultValue.activeAssignmentRules = activeAssignmentRules;
            _resultValue.description = description;
            _resultValue.eligibleAssignmentRules = eligibleAssignmentRules;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.notificationRules = notificationRules;
            _resultValue.roleDefinitionId = roleDefinitionId;
            _resultValue.scope = scope;
            return _resultValue;
        }
    }
}
