// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicResult {
    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes.
     * 
     */
    private String autoDeleteOnIdle;
    /**
     * @return Boolean flag which controls if server-side batched operations are enabled.
     * 
     */
    private Boolean batchedOperationsEnabled;
    /**
     * @return The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself.
     * 
     */
    private String defaultMessageTtl;
    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected.
     * 
     */
    private String duplicateDetectionHistoryTimeWindow;
    private Boolean enableBatchedOperations;
    private Boolean enableExpress;
    private Boolean enablePartitioning;
    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    private Boolean expressEnabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
     * 
     */
    private Integer maxSizeInMegabytes;
    private String name;
    private @Nullable String namespaceId;
    /**
     * @deprecated
     * `namespace_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `namespace_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider. */
    private @Nullable String namespaceName;
    /**
     * @return Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers.
     * 
     */
    private Boolean partitioningEnabled;
    /**
     * @return Boolean flag which controls whether the Topic requires duplicate detection.
     * 
     */
    private Boolean requiresDuplicateDetection;
    /**
     * @deprecated
     * `resource_group_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `resource_group_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider. */
    private @Nullable String resourceGroupName;
    /**
     * @return The Status of the Service Bus Topic. Acceptable values are Active or Disabled.
     * 
     */
    private String status;
    /**
     * @return Boolean flag which controls whether the Topic supports ordering.
     * 
     */
    private Boolean supportOrdering;

    private GetTopicResult() {}
    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes.
     * 
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    /**
     * @return Boolean flag which controls if server-side batched operations are enabled.
     * 
     */
    public Boolean batchedOperationsEnabled() {
        return this.batchedOperationsEnabled;
    }
    /**
     * @return The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself.
     * 
     */
    public String defaultMessageTtl() {
        return this.defaultMessageTtl;
    }
    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected.
     * 
     */
    public String duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }
    public Boolean enableExpress() {
        return this.enableExpress;
    }
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }
    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    public Boolean expressEnabled() {
        return this.expressEnabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
     * 
     */
    public Integer maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    /**
     * @deprecated
     * `namespace_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `namespace_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider. */
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    /**
     * @return Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers.
     * 
     */
    public Boolean partitioningEnabled() {
        return this.partitioningEnabled;
    }
    /**
     * @return Boolean flag which controls whether the Topic requires duplicate detection.
     * 
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }
    /**
     * @deprecated
     * `resource_group_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `resource_group_name` will be removed in favour of the `namespace_id` property in v5.0 of the AzureRM Provider. */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The Status of the Service Bus Topic. Acceptable values are Active or Disabled.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Boolean flag which controls whether the Topic supports ordering.
     * 
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoDeleteOnIdle;
        private Boolean batchedOperationsEnabled;
        private String defaultMessageTtl;
        private String duplicateDetectionHistoryTimeWindow;
        private Boolean enableBatchedOperations;
        private Boolean enableExpress;
        private Boolean enablePartitioning;
        private Boolean expressEnabled;
        private String id;
        private Integer maxSizeInMegabytes;
        private String name;
        private @Nullable String namespaceId;
        private @Nullable String namespaceName;
        private Boolean partitioningEnabled;
        private Boolean requiresDuplicateDetection;
        private @Nullable String resourceGroupName;
        private String status;
        private Boolean supportOrdering;
        public Builder() {}
        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.batchedOperationsEnabled = defaults.batchedOperationsEnabled;
    	      this.defaultMessageTtl = defaults.defaultMessageTtl;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.expressEnabled = defaults.expressEnabled;
    	      this.id = defaults.id;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
    	      this.partitioningEnabled = defaults.partitioningEnabled;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.supportOrdering = defaults.supportOrdering;
        }

        @CustomType.Setter
        public Builder autoDeleteOnIdle(String autoDeleteOnIdle) {
            if (autoDeleteOnIdle == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "autoDeleteOnIdle");
            }
            this.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }
        @CustomType.Setter
        public Builder batchedOperationsEnabled(Boolean batchedOperationsEnabled) {
            if (batchedOperationsEnabled == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "batchedOperationsEnabled");
            }
            this.batchedOperationsEnabled = batchedOperationsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder defaultMessageTtl(String defaultMessageTtl) {
            if (defaultMessageTtl == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "defaultMessageTtl");
            }
            this.defaultMessageTtl = defaultMessageTtl;
            return this;
        }
        @CustomType.Setter
        public Builder duplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
            if (duplicateDetectionHistoryTimeWindow == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "duplicateDetectionHistoryTimeWindow");
            }
            this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }
        @CustomType.Setter
        public Builder enableBatchedOperations(Boolean enableBatchedOperations) {
            if (enableBatchedOperations == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "enableBatchedOperations");
            }
            this.enableBatchedOperations = enableBatchedOperations;
            return this;
        }
        @CustomType.Setter
        public Builder enableExpress(Boolean enableExpress) {
            if (enableExpress == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "enableExpress");
            }
            this.enableExpress = enableExpress;
            return this;
        }
        @CustomType.Setter
        public Builder enablePartitioning(Boolean enablePartitioning) {
            if (enablePartitioning == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "enablePartitioning");
            }
            this.enablePartitioning = enablePartitioning;
            return this;
        }
        @CustomType.Setter
        public Builder expressEnabled(Boolean expressEnabled) {
            if (expressEnabled == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "expressEnabled");
            }
            this.expressEnabled = expressEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxSizeInMegabytes(Integer maxSizeInMegabytes) {
            if (maxSizeInMegabytes == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "maxSizeInMegabytes");
            }
            this.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(@Nullable String namespaceId) {

            this.namespaceId = namespaceId;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(@Nullable String namespaceName) {

            this.namespaceName = namespaceName;
            return this;
        }
        @CustomType.Setter
        public Builder partitioningEnabled(Boolean partitioningEnabled) {
            if (partitioningEnabled == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "partitioningEnabled");
            }
            this.partitioningEnabled = partitioningEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder requiresDuplicateDetection(Boolean requiresDuplicateDetection) {
            if (requiresDuplicateDetection == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "requiresDuplicateDetection");
            }
            this.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {

            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder supportOrdering(Boolean supportOrdering) {
            if (supportOrdering == null) {
              throw new MissingRequiredPropertyException("GetTopicResult", "supportOrdering");
            }
            this.supportOrdering = supportOrdering;
            return this;
        }
        public GetTopicResult build() {
            final var _resultValue = new GetTopicResult();
            _resultValue.autoDeleteOnIdle = autoDeleteOnIdle;
            _resultValue.batchedOperationsEnabled = batchedOperationsEnabled;
            _resultValue.defaultMessageTtl = defaultMessageTtl;
            _resultValue.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            _resultValue.enableBatchedOperations = enableBatchedOperations;
            _resultValue.enableExpress = enableExpress;
            _resultValue.enablePartitioning = enablePartitioning;
            _resultValue.expressEnabled = expressEnabled;
            _resultValue.id = id;
            _resultValue.maxSizeInMegabytes = maxSizeInMegabytes;
            _resultValue.name = name;
            _resultValue.namespaceId = namespaceId;
            _resultValue.namespaceName = namespaceName;
            _resultValue.partitioningEnabled = partitioningEnabled;
            _resultValue.requiresDuplicateDetection = requiresDuplicateDetection;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.status = status;
            _resultValue.supportOrdering = supportOrdering;
            return _resultValue;
        }
    }
}
