// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.azure.monitoring.outputs.ActivityLogAlertCriteriaResourceHealth;
import com.pulumi.azure.monitoring.outputs.ActivityLogAlertCriteriaServiceHealth;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActivityLogAlertCriteria {
    /**
     * @return The email address or Azure Active Directory identifier of the user who performed the operation.
     * 
     */
    private @Nullable String caller;
    /**
     * @return The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
     * 
     */
    private String category;
    /**
     * @return The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     */
    private @Nullable String level;
    /**
     * @return A list of severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     * &gt; **Note:** `level` and `levels` are mutually exclusive.
     * 
     */
    private @Nullable List<String> levels;
    /**
     * @return The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
     * 
     */
    private @Nullable String operationName;
    /**
     * @return The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence`, `HighAvailability` and `Performance`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    private @Nullable String recommendationCategory;
    /**
     * @return The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    private @Nullable String recommendationImpact;
    /**
     * @return The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
     * 
     */
    private @Nullable String recommendationType;
    /**
     * @return The name of resource group monitored by the activity log alert.
     * 
     */
    private @Nullable String resourceGroup;
    /**
     * @return A list of names of resource groups monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_group` and `resource_groups` are mutually exclusive.
     * 
     */
    private @Nullable List<String> resourceGroups;
    /**
     * @return A block to define fine grain resource health settings.
     * 
     */
    private @Nullable ActivityLogAlertCriteriaResourceHealth resourceHealth;
    /**
     * @return The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     */
    private @Nullable String resourceId;
    /**
     * @return A list of specific resources monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     * &gt; **Note:** `resource_id` and `resource_ids` are mutually exclusive.
     * 
     */
    private @Nullable List<String> resourceIds;
    /**
     * @return The name of the resource provider monitored by the activity log alert.
     * 
     */
    private @Nullable String resourceProvider;
    /**
     * @return A list of names of resource providers monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_provider` and `resource_providers` are mutually exclusive.
     * 
     */
    private @Nullable List<String> resourceProviders;
    /**
     * @return The resource type monitored by the activity log alert.
     * 
     */
    private @Nullable String resourceType;
    /**
     * @return A list of resource types monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_type` and `resource_types` are mutually exclusive.
     * 
     */
    private @Nullable List<String> resourceTypes;
    /**
     * @return A block to define fine grain service health settings.
     * 
     */
    private @Nullable ActivityLogAlertCriteriaServiceHealth serviceHealth;
    /**
     * @return The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     */
    private @Nullable String status;
    /**
     * @return A list of status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     * &gt; **Note:** `status` and `statuses` are mutually exclusive.
     * 
     */
    private @Nullable List<String> statuses;
    /**
     * @return The sub status of the event.
     * 
     */
    private @Nullable String subStatus;
    /**
     * @return A list of sub status of the event.
     * 
     * &gt; **Note:** `sub_status` and `sub_statuses` are mutually exclusive.
     * 
     */
    private @Nullable List<String> subStatuses;

    private ActivityLogAlertCriteria() {}
    /**
     * @return The email address or Azure Active Directory identifier of the user who performed the operation.
     * 
     */
    public Optional<String> caller() {
        return Optional.ofNullable(this.caller);
    }
    /**
     * @return The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return A list of severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     * &gt; **Note:** `level` and `levels` are mutually exclusive.
     * 
     */
    public List<String> levels() {
        return this.levels == null ? List.of() : this.levels;
    }
    /**
     * @return The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
     * 
     */
    public Optional<String> operationName() {
        return Optional.ofNullable(this.operationName);
    }
    /**
     * @return The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence`, `HighAvailability` and `Performance`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<String> recommendationCategory() {
        return Optional.ofNullable(this.recommendationCategory);
    }
    /**
     * @return The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<String> recommendationImpact() {
        return Optional.ofNullable(this.recommendationImpact);
    }
    /**
     * @return The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<String> recommendationType() {
        return Optional.ofNullable(this.recommendationType);
    }
    /**
     * @return The name of resource group monitored by the activity log alert.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return A list of names of resource groups monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_group` and `resource_groups` are mutually exclusive.
     * 
     */
    public List<String> resourceGroups() {
        return this.resourceGroups == null ? List.of() : this.resourceGroups;
    }
    /**
     * @return A block to define fine grain resource health settings.
     * 
     */
    public Optional<ActivityLogAlertCriteriaResourceHealth> resourceHealth() {
        return Optional.ofNullable(this.resourceHealth);
    }
    /**
     * @return The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return A list of specific resources monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     * &gt; **Note:** `resource_id` and `resource_ids` are mutually exclusive.
     * 
     */
    public List<String> resourceIds() {
        return this.resourceIds == null ? List.of() : this.resourceIds;
    }
    /**
     * @return The name of the resource provider monitored by the activity log alert.
     * 
     */
    public Optional<String> resourceProvider() {
        return Optional.ofNullable(this.resourceProvider);
    }
    /**
     * @return A list of names of resource providers monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_provider` and `resource_providers` are mutually exclusive.
     * 
     */
    public List<String> resourceProviders() {
        return this.resourceProviders == null ? List.of() : this.resourceProviders;
    }
    /**
     * @return The resource type monitored by the activity log alert.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * @return A list of resource types monitored by the activity log alert.
     * 
     * &gt; **Note:** `resource_type` and `resource_types` are mutually exclusive.
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    /**
     * @return A block to define fine grain service health settings.
     * 
     */
    public Optional<ActivityLogAlertCriteriaServiceHealth> serviceHealth() {
        return Optional.ofNullable(this.serviceHealth);
    }
    /**
     * @return The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return A list of status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     * &gt; **Note:** `status` and `statuses` are mutually exclusive.
     * 
     */
    public List<String> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * @return The sub status of the event.
     * 
     */
    public Optional<String> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }
    /**
     * @return A list of sub status of the event.
     * 
     * &gt; **Note:** `sub_status` and `sub_statuses` are mutually exclusive.
     * 
     */
    public List<String> subStatuses() {
        return this.subStatuses == null ? List.of() : this.subStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityLogAlertCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caller;
        private String category;
        private @Nullable String level;
        private @Nullable List<String> levels;
        private @Nullable String operationName;
        private @Nullable String recommendationCategory;
        private @Nullable String recommendationImpact;
        private @Nullable String recommendationType;
        private @Nullable String resourceGroup;
        private @Nullable List<String> resourceGroups;
        private @Nullable ActivityLogAlertCriteriaResourceHealth resourceHealth;
        private @Nullable String resourceId;
        private @Nullable List<String> resourceIds;
        private @Nullable String resourceProvider;
        private @Nullable List<String> resourceProviders;
        private @Nullable String resourceType;
        private @Nullable List<String> resourceTypes;
        private @Nullable ActivityLogAlertCriteriaServiceHealth serviceHealth;
        private @Nullable String status;
        private @Nullable List<String> statuses;
        private @Nullable String subStatus;
        private @Nullable List<String> subStatuses;
        public Builder() {}
        public Builder(ActivityLogAlertCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caller = defaults.caller;
    	      this.category = defaults.category;
    	      this.level = defaults.level;
    	      this.levels = defaults.levels;
    	      this.operationName = defaults.operationName;
    	      this.recommendationCategory = defaults.recommendationCategory;
    	      this.recommendationImpact = defaults.recommendationImpact;
    	      this.recommendationType = defaults.recommendationType;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceHealth = defaults.resourceHealth;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceIds = defaults.resourceIds;
    	      this.resourceProvider = defaults.resourceProvider;
    	      this.resourceProviders = defaults.resourceProviders;
    	      this.resourceType = defaults.resourceType;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.serviceHealth = defaults.serviceHealth;
    	      this.status = defaults.status;
    	      this.statuses = defaults.statuses;
    	      this.subStatus = defaults.subStatus;
    	      this.subStatuses = defaults.subStatuses;
        }

        @CustomType.Setter
        public Builder caller(@Nullable String caller) {

            this.caller = caller;
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("ActivityLogAlertCriteria", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {

            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder levels(@Nullable List<String> levels) {

            this.levels = levels;
            return this;
        }
        public Builder levels(String... levels) {
            return levels(List.of(levels));
        }
        @CustomType.Setter
        public Builder operationName(@Nullable String operationName) {

            this.operationName = operationName;
            return this;
        }
        @CustomType.Setter
        public Builder recommendationCategory(@Nullable String recommendationCategory) {

            this.recommendationCategory = recommendationCategory;
            return this;
        }
        @CustomType.Setter
        public Builder recommendationImpact(@Nullable String recommendationImpact) {

            this.recommendationImpact = recommendationImpact;
            return this;
        }
        @CustomType.Setter
        public Builder recommendationType(@Nullable String recommendationType) {

            this.recommendationType = recommendationType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(@Nullable String resourceGroup) {

            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroups(@Nullable List<String> resourceGroups) {

            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder resourceGroups(String... resourceGroups) {
            return resourceGroups(List.of(resourceGroups));
        }
        @CustomType.Setter
        public Builder resourceHealth(@Nullable ActivityLogAlertCriteriaResourceHealth resourceHealth) {

            this.resourceHealth = resourceHealth;
            return this;
        }
        @CustomType.Setter
        public Builder resourceId(@Nullable String resourceId) {

            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceIds(@Nullable List<String> resourceIds) {

            this.resourceIds = resourceIds;
            return this;
        }
        public Builder resourceIds(String... resourceIds) {
            return resourceIds(List.of(resourceIds));
        }
        @CustomType.Setter
        public Builder resourceProvider(@Nullable String resourceProvider) {

            this.resourceProvider = resourceProvider;
            return this;
        }
        @CustomType.Setter
        public Builder resourceProviders(@Nullable List<String> resourceProviders) {

            this.resourceProviders = resourceProviders;
            return this;
        }
        public Builder resourceProviders(String... resourceProviders) {
            return resourceProviders(List.of(resourceProviders));
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {

            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {

            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        @CustomType.Setter
        public Builder serviceHealth(@Nullable ActivityLogAlertCriteriaServiceHealth serviceHealth) {

            this.serviceHealth = serviceHealth;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder statuses(@Nullable List<String> statuses) {

            this.statuses = statuses;
            return this;
        }
        public Builder statuses(String... statuses) {
            return statuses(List.of(statuses));
        }
        @CustomType.Setter
        public Builder subStatus(@Nullable String subStatus) {

            this.subStatus = subStatus;
            return this;
        }
        @CustomType.Setter
        public Builder subStatuses(@Nullable List<String> subStatuses) {

            this.subStatuses = subStatuses;
            return this;
        }
        public Builder subStatuses(String... subStatuses) {
            return subStatuses(List.of(subStatuses));
        }
        public ActivityLogAlertCriteria build() {
            final var _resultValue = new ActivityLogAlertCriteria();
            _resultValue.caller = caller;
            _resultValue.category = category;
            _resultValue.level = level;
            _resultValue.levels = levels;
            _resultValue.operationName = operationName;
            _resultValue.recommendationCategory = recommendationCategory;
            _resultValue.recommendationImpact = recommendationImpact;
            _resultValue.recommendationType = recommendationType;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.resourceGroups = resourceGroups;
            _resultValue.resourceHealth = resourceHealth;
            _resultValue.resourceId = resourceId;
            _resultValue.resourceIds = resourceIds;
            _resultValue.resourceProvider = resourceProvider;
            _resultValue.resourceProviders = resourceProviders;
            _resultValue.resourceType = resourceType;
            _resultValue.resourceTypes = resourceTypes;
            _resultValue.serviceHealth = serviceHealth;
            _resultValue.status = status;
            _resultValue.statuses = statuses;
            _resultValue.subStatus = subStatus;
            _resultValue.subStatuses = subStatuses;
            return _resultValue;
        }
    }
}
