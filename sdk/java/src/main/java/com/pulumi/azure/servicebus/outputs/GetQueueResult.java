// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetQueueResult {
    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    private String autoDeleteOnIdle;
    /**
     * @return Boolean flag which controls whether the Queue has dead letter support when a message expires.
     * 
     */
    private Boolean deadLetteringOnMessageExpiration;
    /**
     * @return The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on a message itself.
     * 
     */
    private String defaultMessageTtl;
    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected.
     * 
     */
    private String duplicateDetectionHistoryTimeWindow;
    /**
     * @return Boolean flag which controls whether server-side batched operations are enabled.
     * 
     */
    private Boolean enableBatchedOperations;
    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    private Boolean enableExpress;
    /**
     * @return Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers.
     * 
     */
    private Boolean enablePartitioning;
    /**
     * @return The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    private String forwardDeadLetteredMessagesTo;
    /**
     * @return The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    private String forwardTo;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers.
     * 
     */
    private String lockDuration;
    /**
     * @return Integer value which controls when a message is automatically dead lettered.
     * 
     */
    private Integer maxDeliveryCount;
    /**
     * @return Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
     * 
     */
    private Integer maxSizeInMegabytes;
    private String name;
    private @Nullable String namespaceId;
    /**
     * @deprecated
     * `namespace_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `namespace_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider. */
    private @Nullable String namespaceName;
    /**
     * @return Boolean flag which controls whether the Queue requires duplicate detection.
     * 
     */
    private Boolean requiresDuplicateDetection;
    /**
     * @return Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages.
     * 
     */
    private Boolean requiresSession;
    /**
     * @deprecated
     * `resource_group_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `resource_group_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider. */
    private @Nullable String resourceGroupName;
    /**
     * @return The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`.
     * 
     */
    private String status;

    private GetQueueResult() {}
    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    /**
     * @return Boolean flag which controls whether the Queue has dead letter support when a message expires.
     * 
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }
    /**
     * @return The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on a message itself.
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
    /**
     * @return Boolean flag which controls whether server-side batched operations are enabled.
     * 
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }
    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }
    /**
     * @return Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers.
     * 
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }
    /**
     * @return The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    public String forwardDeadLetteredMessagesTo() {
        return this.forwardDeadLetteredMessagesTo;
    }
    /**
     * @return The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    public String forwardTo() {
        return this.forwardTo;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers.
     * 
     */
    public String lockDuration() {
        return this.lockDuration;
    }
    /**
     * @return Integer value which controls when a message is automatically dead lettered.
     * 
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }
    /**
     * @return Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
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
     * `namespace_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `namespace_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider. */
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    /**
     * @return Boolean flag which controls whether the Queue requires duplicate detection.
     * 
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }
    /**
     * @return Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages.
     * 
     */
    public Boolean requiresSession() {
        return this.requiresSession;
    }
    /**
     * @deprecated
     * `resource_group_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider.
     * 
     */
    @Deprecated /* `resource_group_name` will be removed in favour of the property `namespace_id` in version 4.0 of the AzureRM Provider. */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoDeleteOnIdle;
        private Boolean deadLetteringOnMessageExpiration;
        private String defaultMessageTtl;
        private String duplicateDetectionHistoryTimeWindow;
        private Boolean enableBatchedOperations;
        private Boolean enableExpress;
        private Boolean enablePartitioning;
        private String forwardDeadLetteredMessagesTo;
        private String forwardTo;
        private String id;
        private String lockDuration;
        private Integer maxDeliveryCount;
        private Integer maxSizeInMegabytes;
        private String name;
        private @Nullable String namespaceId;
        private @Nullable String namespaceName;
        private Boolean requiresDuplicateDetection;
        private Boolean requiresSession;
        private @Nullable String resourceGroupName;
        private String status;
        public Builder() {}
        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteOnIdle = defaults.autoDeleteOnIdle;
    	      this.deadLetteringOnMessageExpiration = defaults.deadLetteringOnMessageExpiration;
    	      this.defaultMessageTtl = defaults.defaultMessageTtl;
    	      this.duplicateDetectionHistoryTimeWindow = defaults.duplicateDetectionHistoryTimeWindow;
    	      this.enableBatchedOperations = defaults.enableBatchedOperations;
    	      this.enableExpress = defaults.enableExpress;
    	      this.enablePartitioning = defaults.enablePartitioning;
    	      this.forwardDeadLetteredMessagesTo = defaults.forwardDeadLetteredMessagesTo;
    	      this.forwardTo = defaults.forwardTo;
    	      this.id = defaults.id;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.maxSizeInMegabytes = defaults.maxSizeInMegabytes;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
    	      this.requiresDuplicateDetection = defaults.requiresDuplicateDetection;
    	      this.requiresSession = defaults.requiresSession;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder autoDeleteOnIdle(String autoDeleteOnIdle) {
            this.autoDeleteOnIdle = Objects.requireNonNull(autoDeleteOnIdle);
            return this;
        }
        @CustomType.Setter
        public Builder deadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
            this.deadLetteringOnMessageExpiration = Objects.requireNonNull(deadLetteringOnMessageExpiration);
            return this;
        }
        @CustomType.Setter
        public Builder defaultMessageTtl(String defaultMessageTtl) {
            this.defaultMessageTtl = Objects.requireNonNull(defaultMessageTtl);
            return this;
        }
        @CustomType.Setter
        public Builder duplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
            this.duplicateDetectionHistoryTimeWindow = Objects.requireNonNull(duplicateDetectionHistoryTimeWindow);
            return this;
        }
        @CustomType.Setter
        public Builder enableBatchedOperations(Boolean enableBatchedOperations) {
            this.enableBatchedOperations = Objects.requireNonNull(enableBatchedOperations);
            return this;
        }
        @CustomType.Setter
        public Builder enableExpress(Boolean enableExpress) {
            this.enableExpress = Objects.requireNonNull(enableExpress);
            return this;
        }
        @CustomType.Setter
        public Builder enablePartitioning(Boolean enablePartitioning) {
            this.enablePartitioning = Objects.requireNonNull(enablePartitioning);
            return this;
        }
        @CustomType.Setter
        public Builder forwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
            this.forwardDeadLetteredMessagesTo = Objects.requireNonNull(forwardDeadLetteredMessagesTo);
            return this;
        }
        @CustomType.Setter
        public Builder forwardTo(String forwardTo) {
            this.forwardTo = Objects.requireNonNull(forwardTo);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lockDuration(String lockDuration) {
            this.lockDuration = Objects.requireNonNull(lockDuration);
            return this;
        }
        @CustomType.Setter
        public Builder maxDeliveryCount(Integer maxDeliveryCount) {
            this.maxDeliveryCount = Objects.requireNonNull(maxDeliveryCount);
            return this;
        }
        @CustomType.Setter
        public Builder maxSizeInMegabytes(Integer maxSizeInMegabytes) {
            this.maxSizeInMegabytes = Objects.requireNonNull(maxSizeInMegabytes);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public Builder requiresDuplicateDetection(Boolean requiresDuplicateDetection) {
            this.requiresDuplicateDetection = Objects.requireNonNull(requiresDuplicateDetection);
            return this;
        }
        @CustomType.Setter
        public Builder requiresSession(Boolean requiresSession) {
            this.requiresSession = Objects.requireNonNull(requiresSession);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetQueueResult build() {
            final var o = new GetQueueResult();
            o.autoDeleteOnIdle = autoDeleteOnIdle;
            o.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpiration;
            o.defaultMessageTtl = defaultMessageTtl;
            o.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            o.enableBatchedOperations = enableBatchedOperations;
            o.enableExpress = enableExpress;
            o.enablePartitioning = enablePartitioning;
            o.forwardDeadLetteredMessagesTo = forwardDeadLetteredMessagesTo;
            o.forwardTo = forwardTo;
            o.id = id;
            o.lockDuration = lockDuration;
            o.maxDeliveryCount = maxDeliveryCount;
            o.maxSizeInMegabytes = maxSizeInMegabytes;
            o.name = name;
            o.namespaceId = namespaceId;
            o.namespaceName = namespaceName;
            o.requiresDuplicateDetection = requiresDuplicateDetection;
            o.requiresSession = requiresSession;
            o.resourceGroupName = resourceGroupName;
            o.status = status;
            return o;
        }
    }
}