// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification {
    /**
     * @return A list of additional email addresses that will receive these notifications.
     * 
     */
    private List<String> additionalRecipients;
    /**
     * @return (Boolean) Should the default recipients receive these notifications.
     * 
     */
    private Boolean defaultRecipients;
    /**
     * @return (String) What level of notifications should be sent. Either `All` or `Critical`.
     * 
     */
    private String notificationLevel;

    private GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification() {}
    /**
     * @return A list of additional email addresses that will receive these notifications.
     * 
     */
    public List<String> additionalRecipients() {
        return this.additionalRecipients;
    }
    /**
     * @return (Boolean) Should the default recipients receive these notifications.
     * 
     */
    public Boolean defaultRecipients() {
        return this.defaultRecipients;
    }
    /**
     * @return (String) What level of notifications should be sent. Either `All` or `Critical`.
     * 
     */
    public String notificationLevel() {
        return this.notificationLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalRecipients;
        private Boolean defaultRecipients;
        private String notificationLevel;
        public Builder() {}
        public Builder(GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalRecipients = defaults.additionalRecipients;
    	      this.defaultRecipients = defaults.defaultRecipients;
    	      this.notificationLevel = defaults.notificationLevel;
        }

        @CustomType.Setter
        public Builder additionalRecipients(List<String> additionalRecipients) {
            if (additionalRecipients == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification", "additionalRecipients");
            }
            this.additionalRecipients = additionalRecipients;
            return this;
        }
        public Builder additionalRecipients(String... additionalRecipients) {
            return additionalRecipients(List.of(additionalRecipients));
        }
        @CustomType.Setter
        public Builder defaultRecipients(Boolean defaultRecipients) {
            if (defaultRecipients == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification", "defaultRecipients");
            }
            this.defaultRecipients = defaultRecipients;
            return this;
        }
        @CustomType.Setter
        public Builder notificationLevel(String notificationLevel) {
            if (notificationLevel == null) {
              throw new MissingRequiredPropertyException("GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification", "notificationLevel");
            }
            this.notificationLevel = notificationLevel;
            return this;
        }
        public GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification build() {
            final var _resultValue = new GetRoleManagementPolicyNotificationRuleEligibleAssignmentAdminNotification();
            _resultValue.additionalRecipients = additionalRecipients;
            _resultValue.defaultRecipients = defaultRecipients;
            _resultValue.notificationLevel = notificationLevel;
            return _resultValue;
        }
    }
}
