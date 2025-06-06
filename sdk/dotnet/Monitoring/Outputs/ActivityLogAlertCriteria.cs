// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class ActivityLogAlertCriteria
    {
        /// <summary>
        /// The email address or Azure Active Directory identifier of the user who performed the operation.
        /// </summary>
        public readonly string? Caller;
        /// <summary>
        /// The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
        /// </summary>
        public readonly string Category;
        /// <summary>
        /// The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
        /// </summary>
        public readonly string? Level;
        /// <summary>
        /// A list of severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
        /// 
        /// &gt; **Note:** `level` and `levels` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> Levels;
        /// <summary>
        /// The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
        /// </summary>
        public readonly string? OperationName;
        /// <summary>
        /// The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence`, `HighAvailability` and `Performance`. It is only allowed when `category` is `Recommendation`.
        /// </summary>
        public readonly string? RecommendationCategory;
        /// <summary>
        /// The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
        /// </summary>
        public readonly string? RecommendationImpact;
        /// <summary>
        /// The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
        /// </summary>
        public readonly string? RecommendationType;
        /// <summary>
        /// The name of resource group monitored by the activity log alert.
        /// </summary>
        public readonly string? ResourceGroup;
        /// <summary>
        /// A list of names of resource groups monitored by the activity log alert.
        /// 
        /// &gt; **Note:** `resource_group` and `resource_groups` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> ResourceGroups;
        /// <summary>
        /// A block to define fine grain resource health settings.
        /// </summary>
        public readonly Outputs.ActivityLogAlertCriteriaResourceHealth? ResourceHealth;
        /// <summary>
        /// The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
        /// </summary>
        public readonly string? ResourceId;
        /// <summary>
        /// A list of specific resources monitored by the activity log alert. It should be within one of the `scopes`.
        /// 
        /// &gt; **Note:** `resource_id` and `resource_ids` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> ResourceIds;
        /// <summary>
        /// The name of the resource provider monitored by the activity log alert.
        /// </summary>
        public readonly string? ResourceProvider;
        /// <summary>
        /// A list of names of resource providers monitored by the activity log alert.
        /// 
        /// &gt; **Note:** `resource_provider` and `resource_providers` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> ResourceProviders;
        /// <summary>
        /// The resource type monitored by the activity log alert.
        /// </summary>
        public readonly string? ResourceType;
        /// <summary>
        /// A list of resource types monitored by the activity log alert.
        /// 
        /// &gt; **Note:** `resource_type` and `resource_types` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> ResourceTypes;
        /// <summary>
        /// A block to define fine grain service health settings.
        /// </summary>
        public readonly Outputs.ActivityLogAlertCriteriaServiceHealth? ServiceHealth;
        /// <summary>
        /// The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A list of status of the event. For example, `Started`, `Failed`, or `Succeeded`.
        /// 
        /// &gt; **Note:** `status` and `statuses` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// The sub status of the event.
        /// </summary>
        public readonly string? SubStatus;
        /// <summary>
        /// A list of sub status of the event.
        /// 
        /// &gt; **Note:** `sub_status` and `sub_statuses` are mutually exclusive.
        /// </summary>
        public readonly ImmutableArray<string> SubStatuses;

        [OutputConstructor]
        private ActivityLogAlertCriteria(
            string? caller,

            string category,

            string? level,

            ImmutableArray<string> levels,

            string? operationName,

            string? recommendationCategory,

            string? recommendationImpact,

            string? recommendationType,

            string? resourceGroup,

            ImmutableArray<string> resourceGroups,

            Outputs.ActivityLogAlertCriteriaResourceHealth? resourceHealth,

            string? resourceId,

            ImmutableArray<string> resourceIds,

            string? resourceProvider,

            ImmutableArray<string> resourceProviders,

            string? resourceType,

            ImmutableArray<string> resourceTypes,

            Outputs.ActivityLogAlertCriteriaServiceHealth? serviceHealth,

            string? status,

            ImmutableArray<string> statuses,

            string? subStatus,

            ImmutableArray<string> subStatuses)
        {
            Caller = caller;
            Category = category;
            Level = level;
            Levels = levels;
            OperationName = operationName;
            RecommendationCategory = recommendationCategory;
            RecommendationImpact = recommendationImpact;
            RecommendationType = recommendationType;
            ResourceGroup = resourceGroup;
            ResourceGroups = resourceGroups;
            ResourceHealth = resourceHealth;
            ResourceId = resourceId;
            ResourceIds = resourceIds;
            ResourceProvider = resourceProvider;
            ResourceProviders = resourceProviders;
            ResourceType = resourceType;
            ResourceTypes = resourceTypes;
            ServiceHealth = serviceHealth;
            Status = status;
            Statuses = statuses;
            SubStatus = subStatus;
            SubStatuses = subStatuses;
        }
    }
}
