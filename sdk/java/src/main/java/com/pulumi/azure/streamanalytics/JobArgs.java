// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.streamanalytics.inputs.JobIdentityArgs;
import com.pulumi.azure.streamanalytics.inputs.JobJobStorageAccountArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     * &gt; **Note:** Support for Compatibility Level 1.2 is dependent on a new version of the Stream Analytics API, which [being tracked in this issue](https://github.com/Azure/azure-rest-api-specs/issues/5604).
     * 
     */
    @Import(name="compatibilityLevel")
    private @Nullable Output<String> compatibilityLevel;

    /**
     * @return Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
     * 
     * &gt; **Note:** Support for Compatibility Level 1.2 is dependent on a new version of the Stream Analytics API, which [being tracked in this issue](https://github.com/Azure/azure-rest-api-specs/issues/5604).
     * 
     */
    public Optional<Output<String>> compatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }

    /**
     * The policy for storing stream analytics content. Possible values are `JobStorageAccount`, `SystemAccount`. Defaults to `SystemAccount`.
     * 
     */
    @Import(name="contentStoragePolicy")
    private @Nullable Output<String> contentStoragePolicy;

    /**
     * @return The policy for storing stream analytics content. Possible values are `JobStorageAccount`, `SystemAccount`. Defaults to `SystemAccount`.
     * 
     */
    public Optional<Output<String>> contentStoragePolicy() {
        return Optional.ofNullable(this.contentStoragePolicy);
    }

    /**
     * Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;). Defaults to `en-US`.
     * 
     */
    @Import(name="dataLocale")
    private @Nullable Output<String> dataLocale;

    /**
     * @return Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;). Defaults to `en-US`.
     * 
     */
    public Optional<Output<String>> dataLocale() {
        return Optional.ofNullable(this.dataLocale);
    }

    /**
     * Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s). Default is `5`.
     * 
     */
    @Import(name="eventsLateArrivalMaxDelayInSeconds")
    private @Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s). Default is `5`.
     * 
     */
    public Optional<Output<Integer>> eventsLateArrivalMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsLateArrivalMaxDelayInSeconds);
    }

    /**
     * Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `0`.
     * 
     */
    @Import(name="eventsOutOfOrderMaxDelayInSeconds")
    private @Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds;

    /**
     * @return Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `0`.
     * 
     */
    public Optional<Output<Integer>> eventsOutOfOrderMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsOutOfOrderMaxDelayInSeconds);
    }

    /**
     * Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`. Default is `Adjust`.
     * 
     */
    @Import(name="eventsOutOfOrderPolicy")
    private @Nullable Output<String> eventsOutOfOrderPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`. Default is `Adjust`.
     * 
     */
    public Optional<Output<String>> eventsOutOfOrderPolicy() {
        return Optional.ofNullable(this.eventsOutOfOrderPolicy);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<JobIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<JobIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The details of the job storage account. A `job_storage_account` block as defined below.
     * 
     * &gt; **Note:** `content_storage_policy` must be set to `JobStorageAccount` when specifying `job_storage_account`.
     * 
     */
    @Import(name="jobStorageAccounts")
    private @Nullable Output<List<JobJobStorageAccountArgs>> jobStorageAccounts;

    /**
     * @return The details of the job storage account. A `job_storage_account` block as defined below.
     * 
     * &gt; **Note:** `content_storage_policy` must be set to `JobStorageAccount` when specifying `job_storage_account`.
     * 
     */
    public Optional<Output<List<JobJobStorageAccountArgs>>> jobStorageAccounts() {
        return Optional.ofNullable(this.jobStorageAccounts);
    }

    /**
     * The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`. Default is `Drop`.
     * 
     */
    @Import(name="outputErrorPolicy")
    private @Nullable Output<String> outputErrorPolicy;

    /**
     * @return Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`. Default is `Drop`.
     * 
     */
    public Optional<Output<String>> outputErrorPolicy() {
        return Optional.ofNullable(this.outputErrorPolicy);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU Name to use for the Stream Analytics Job. Possible values are `Standard`, `StandardV2`. Defaults to `Standard`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The SKU Name to use for the Stream Analytics Job. Possible values are `Standard`, `StandardV2`. Defaults to `Standard`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    @Import(name="streamAnalyticsClusterId")
    private @Nullable Output<String> streamAnalyticsClusterId;

    /**
     * @return The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
     * 
     */
    public Optional<Output<String>> streamAnalyticsClusterId() {
        return Optional.ofNullable(this.streamAnalyticsClusterId);
    }

    /**
     * Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`. A conversion table for V2 streaming units can be found [here](https://learn.microsoft.com/azure/stream-analytics/stream-analytics-streaming-unit-consumption#understand-streaming-unit-conversions-and-where-they-apply)
     * 
     * &gt; **Note:** `streaming_units` must be set when `type` is `Cloud`.
     * 
     */
    @Import(name="streamingUnits")
    private @Nullable Output<Integer> streamingUnits;

    /**
     * @return Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`. A conversion table for V2 streaming units can be found [here](https://learn.microsoft.com/azure/stream-analytics/stream-analytics-streaming-unit-consumption#understand-streaming-unit-conversions-and-where-they-apply)
     * 
     * &gt; **Note:** `streaming_units` must be set when `type` is `Cloud`.
     * 
     */
    public Optional<Output<Integer>> streamingUnits() {
        return Optional.ofNullable(this.streamingUnits);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="transformationQuery", required=true)
    private Output<String> transformationQuery;

    public Output<String> transformationQuery() {
        return this.transformationQuery;
    }

    /**
     * The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `Edge` doesn&#39;t support `stream_analytics_cluster_id` and `streaming_units`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** `Edge` doesn&#39;t support `stream_analytics_cluster_id` and `streaming_units`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.compatibilityLevel = $.compatibilityLevel;
        this.contentStoragePolicy = $.contentStoragePolicy;
        this.dataLocale = $.dataLocale;
        this.eventsLateArrivalMaxDelayInSeconds = $.eventsLateArrivalMaxDelayInSeconds;
        this.eventsOutOfOrderMaxDelayInSeconds = $.eventsOutOfOrderMaxDelayInSeconds;
        this.eventsOutOfOrderPolicy = $.eventsOutOfOrderPolicy;
        this.identity = $.identity;
        this.jobStorageAccounts = $.jobStorageAccounts;
        this.location = $.location;
        this.name = $.name;
        this.outputErrorPolicy = $.outputErrorPolicy;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.streamAnalyticsClusterId = $.streamAnalyticsClusterId;
        this.streamingUnits = $.streamingUnits;
        this.tags = $.tags;
        this.transformationQuery = $.transformationQuery;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compatibilityLevel Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
         * 
         * &gt; **Note:** Support for Compatibility Level 1.2 is dependent on a new version of the Stream Analytics API, which [being tracked in this issue](https://github.com/Azure/azure-rest-api-specs/issues/5604).
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(@Nullable Output<String> compatibilityLevel) {
            $.compatibilityLevel = compatibilityLevel;
            return this;
        }

        /**
         * @param compatibilityLevel Specifies the compatibility level for this job - which controls certain runtime behaviours of the streaming job. Possible values are `1.0`, `1.1` and `1.2`.
         * 
         * &gt; **Note:** Support for Compatibility Level 1.2 is dependent on a new version of the Stream Analytics API, which [being tracked in this issue](https://github.com/Azure/azure-rest-api-specs/issues/5604).
         * 
         * @return builder
         * 
         */
        public Builder compatibilityLevel(String compatibilityLevel) {
            return compatibilityLevel(Output.of(compatibilityLevel));
        }

        /**
         * @param contentStoragePolicy The policy for storing stream analytics content. Possible values are `JobStorageAccount`, `SystemAccount`. Defaults to `SystemAccount`.
         * 
         * @return builder
         * 
         */
        public Builder contentStoragePolicy(@Nullable Output<String> contentStoragePolicy) {
            $.contentStoragePolicy = contentStoragePolicy;
            return this;
        }

        /**
         * @param contentStoragePolicy The policy for storing stream analytics content. Possible values are `JobStorageAccount`, `SystemAccount`. Defaults to `SystemAccount`.
         * 
         * @return builder
         * 
         */
        public Builder contentStoragePolicy(String contentStoragePolicy) {
            return contentStoragePolicy(Output.of(contentStoragePolicy));
        }

        /**
         * @param dataLocale Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;). Defaults to `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder dataLocale(@Nullable Output<String> dataLocale) {
            $.dataLocale = dataLocale;
            return this;
        }

        /**
         * @param dataLocale Specifies the Data Locale of the Job, which [should be a supported .NET Culture](&lt;https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx&gt;). Defaults to `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder dataLocale(String dataLocale) {
            return dataLocale(Output.of(dataLocale));
        }

        /**
         * @param eventsLateArrivalMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s). Default is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eventsLateArrivalMaxDelayInSeconds(@Nullable Output<Integer> eventsLateArrivalMaxDelayInSeconds) {
            $.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
            return this;
        }

        /**
         * @param eventsLateArrivalMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where events arriving late could be included. Supported range is `-1` (indefinite) to `1814399` (20d 23h 59m 59s). Default is `5`.
         * 
         * @return builder
         * 
         */
        public Builder eventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
            return eventsLateArrivalMaxDelayInSeconds(Output.of(eventsLateArrivalMaxDelayInSeconds));
        }

        /**
         * @param eventsOutOfOrderMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderMaxDelayInSeconds(@Nullable Output<Integer> eventsOutOfOrderMaxDelayInSeconds) {
            $.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
            return this;
        }

        /**
         * @param eventsOutOfOrderMaxDelayInSeconds Specifies the maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order. Supported range is `0` to `599` (9m 59s). Default is `0`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
            return eventsOutOfOrderMaxDelayInSeconds(Output.of(eventsOutOfOrderMaxDelayInSeconds));
        }

        /**
         * @param eventsOutOfOrderPolicy Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`. Default is `Adjust`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderPolicy(@Nullable Output<String> eventsOutOfOrderPolicy) {
            $.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
            return this;
        }

        /**
         * @param eventsOutOfOrderPolicy Specifies the policy which should be applied to events which arrive out of order in the input event stream. Possible values are `Adjust` and `Drop`. Default is `Adjust`.
         * 
         * @return builder
         * 
         */
        public Builder eventsOutOfOrderPolicy(String eventsOutOfOrderPolicy) {
            return eventsOutOfOrderPolicy(Output.of(eventsOutOfOrderPolicy));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<JobIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(JobIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param jobStorageAccounts The details of the job storage account. A `job_storage_account` block as defined below.
         * 
         * &gt; **Note:** `content_storage_policy` must be set to `JobStorageAccount` when specifying `job_storage_account`.
         * 
         * @return builder
         * 
         */
        public Builder jobStorageAccounts(@Nullable Output<List<JobJobStorageAccountArgs>> jobStorageAccounts) {
            $.jobStorageAccounts = jobStorageAccounts;
            return this;
        }

        /**
         * @param jobStorageAccounts The details of the job storage account. A `job_storage_account` block as defined below.
         * 
         * &gt; **Note:** `content_storage_policy` must be set to `JobStorageAccount` when specifying `job_storage_account`.
         * 
         * @return builder
         * 
         */
        public Builder jobStorageAccounts(List<JobJobStorageAccountArgs> jobStorageAccounts) {
            return jobStorageAccounts(Output.of(jobStorageAccounts));
        }

        /**
         * @param jobStorageAccounts The details of the job storage account. A `job_storage_account` block as defined below.
         * 
         * &gt; **Note:** `content_storage_policy` must be set to `JobStorageAccount` when specifying `job_storage_account`.
         * 
         * @return builder
         * 
         */
        public Builder jobStorageAccounts(JobJobStorageAccountArgs... jobStorageAccounts) {
            return jobStorageAccounts(List.of(jobStorageAccounts));
        }

        /**
         * @param location The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region in which the Resource Group exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputErrorPolicy Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`. Default is `Drop`.
         * 
         * @return builder
         * 
         */
        public Builder outputErrorPolicy(@Nullable Output<String> outputErrorPolicy) {
            $.outputErrorPolicy = outputErrorPolicy;
            return this;
        }

        /**
         * @param outputErrorPolicy Specifies the policy which should be applied to events which arrive at the output and cannot be written to the external storage due to being malformed (such as missing column values, column values of wrong type or size). Possible values are `Drop` and `Stop`. Default is `Drop`.
         * 
         * @return builder
         * 
         */
        public Builder outputErrorPolicy(String outputErrorPolicy) {
            return outputErrorPolicy(Output.of(outputErrorPolicy));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The SKU Name to use for the Stream Analytics Job. Possible values are `Standard`, `StandardV2`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The SKU Name to use for the Stream Analytics Job. Possible values are `Standard`, `StandardV2`. Defaults to `Standard`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param streamAnalyticsClusterId The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsClusterId(@Nullable Output<String> streamAnalyticsClusterId) {
            $.streamAnalyticsClusterId = streamAnalyticsClusterId;
            return this;
        }

        /**
         * @param streamAnalyticsClusterId The ID of an existing Stream Analytics Cluster where the Stream Analytics Job should run.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsClusterId(String streamAnalyticsClusterId) {
            return streamAnalyticsClusterId(Output.of(streamAnalyticsClusterId));
        }

        /**
         * @param streamingUnits Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`. A conversion table for V2 streaming units can be found [here](https://learn.microsoft.com/azure/stream-analytics/stream-analytics-streaming-unit-consumption#understand-streaming-unit-conversions-and-where-they-apply)
         * 
         * &gt; **Note:** `streaming_units` must be set when `type` is `Cloud`.
         * 
         * @return builder
         * 
         */
        public Builder streamingUnits(@Nullable Output<Integer> streamingUnits) {
            $.streamingUnits = streamingUnits;
            return this;
        }

        /**
         * @param streamingUnits Specifies the number of streaming units that the streaming job uses. Supported values are `1`, `3`, `6` and multiples of `6` up to `120`. A conversion table for V2 streaming units can be found [here](https://learn.microsoft.com/azure/stream-analytics/stream-analytics-streaming-unit-consumption#understand-streaming-unit-conversions-and-where-they-apply)
         * 
         * &gt; **Note:** `streaming_units` must be set when `type` is `Cloud`.
         * 
         * @return builder
         * 
         */
        public Builder streamingUnits(Integer streamingUnits) {
            return streamingUnits(Output.of(streamingUnits));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder transformationQuery(Output<String> transformationQuery) {
            $.transformationQuery = transformationQuery;
            return this;
        }

        public Builder transformationQuery(String transformationQuery) {
            return transformationQuery(Output.of(transformationQuery));
        }

        /**
         * @param type The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `Edge` doesn&#39;t support `stream_analytics_cluster_id` and `streaming_units`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Stream Analytics Job. Possible values are `Cloud` and `Edge`. Defaults to `Cloud`. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** `Edge` doesn&#39;t support `stream_analytics_cluster_id` and `streaming_units`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JobArgs build() {
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("JobArgs", "resourceGroupName");
            }
            if ($.transformationQuery == null) {
                throw new MissingRequiredPropertyException("JobArgs", "transformationQuery");
            }
            return $;
        }
    }

}
