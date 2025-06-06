// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicState extends com.pulumi.resources.ResourceArgs {

    public static final TopicState Empty = new TopicState();

    /**
     * The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes. Defaults to `P10675199DT2H48M5.4775807S`.
     * 
     */
    @Import(name="autoDeleteOnIdle")
    private @Nullable Output<String> autoDeleteOnIdle;

    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes. Defaults to `P10675199DT2H48M5.4775807S`.
     * 
     */
    public Optional<Output<String>> autoDeleteOnIdle() {
        return Optional.ofNullable(this.autoDeleteOnIdle);
    }

    /**
     * Boolean flag which controls if server-side batched operations are enabled.
     * 
     */
    @Import(name="batchedOperationsEnabled")
    private @Nullable Output<Boolean> batchedOperationsEnabled;

    /**
     * @return Boolean flag which controls if server-side batched operations are enabled.
     * 
     */
    public Optional<Output<Boolean>> batchedOperationsEnabled() {
        return Optional.ofNullable(this.batchedOperationsEnabled);
    }

    /**
     * The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself. Defaults to `P10675199DT2H48M5.4775807S`.
     * 
     */
    @Import(name="defaultMessageTtl")
    private @Nullable Output<String> defaultMessageTtl;

    /**
     * @return The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself. Defaults to `P10675199DT2H48M5.4775807S`.
     * 
     */
    public Optional<Output<String>> defaultMessageTtl() {
        return Optional.ofNullable(this.defaultMessageTtl);
    }

    /**
     * The ISO 8601 timespan duration during which duplicates can be detected. Defaults to `PT10M` (10 Minutes).
     * 
     */
    @Import(name="duplicateDetectionHistoryTimeWindow")
    private @Nullable Output<String> duplicateDetectionHistoryTimeWindow;

    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected. Defaults to `PT10M` (10 Minutes).
     * 
     */
    public Optional<Output<String>> duplicateDetectionHistoryTimeWindow() {
        return Optional.ofNullable(this.duplicateDetectionHistoryTimeWindow);
    }

    /**
     * Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    @Import(name="expressEnabled")
    private @Nullable Output<Boolean> expressEnabled;

    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     * 
     */
    public Optional<Output<Boolean>> expressEnabled() {
        return Optional.ofNullable(this.expressEnabled);
    }

    /**
     * Integer value which controls the maximum size of a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview). Defaults to `256`.
     * 
     */
    @Import(name="maxMessageSizeInKilobytes")
    private @Nullable Output<Integer> maxMessageSizeInKilobytes;

    /**
     * @return Integer value which controls the maximum size of a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview). Defaults to `256`.
     * 
     */
    public Optional<Output<Integer>> maxMessageSizeInKilobytes() {
        return Optional.ofNullable(this.maxMessageSizeInKilobytes);
    }

    /**
     * Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `5120`.
     * 
     */
    @Import(name="maxSizeInMegabytes")
    private @Nullable Output<Integer> maxSizeInMegabytes;

    /**
     * @return Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `5120`.
     * 
     */
    public Optional<Output<Integer>> maxSizeInMegabytes() {
        return Optional.ofNullable(this.maxSizeInMegabytes);
    }

    /**
     * Specifies the name of the ServiceBus Topic resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Topic resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the ServiceBus Namespace to create this topic in. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The ID of the ServiceBus Namespace to create this topic in. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. For premium namespaces, partitioning is available at namespace creation and all queues and topics in the partitioned namespace will be partitioned. Premium namespaces that have `premium_messaging_partitions` set to `1` are not partitioned. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
     * 
     */
    @Import(name="partitioningEnabled")
    private @Nullable Output<Boolean> partitioningEnabled;

    /**
     * @return Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. For premium namespaces, partitioning is available at namespace creation and all queues and topics in the partitioned namespace will be partitioned. Premium namespaces that have `premium_messaging_partitions` set to `1` are not partitioned. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
     * 
     */
    public Optional<Output<Boolean>> partitioningEnabled() {
        return Optional.ofNullable(this.partitioningEnabled);
    }

    /**
     * Boolean flag which controls whether the Topic requires duplicate detection. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="requiresDuplicateDetection")
    private @Nullable Output<Boolean> requiresDuplicateDetection;

    /**
     * @return Boolean flag which controls whether the Topic requires duplicate detection. Defaults to `false`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> requiresDuplicateDetection() {
        return Optional.ofNullable(this.requiresDuplicateDetection);
    }

    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Boolean flag which controls whether the Topic supports ordering.
     * 
     */
    @Import(name="supportOrdering")
    private @Nullable Output<Boolean> supportOrdering;

    /**
     * @return Boolean flag which controls whether the Topic supports ordering.
     * 
     */
    public Optional<Output<Boolean>> supportOrdering() {
        return Optional.ofNullable(this.supportOrdering);
    }

    private TopicState() {}

    private TopicState(TopicState $) {
        this.autoDeleteOnIdle = $.autoDeleteOnIdle;
        this.batchedOperationsEnabled = $.batchedOperationsEnabled;
        this.defaultMessageTtl = $.defaultMessageTtl;
        this.duplicateDetectionHistoryTimeWindow = $.duplicateDetectionHistoryTimeWindow;
        this.expressEnabled = $.expressEnabled;
        this.maxMessageSizeInKilobytes = $.maxMessageSizeInKilobytes;
        this.maxSizeInMegabytes = $.maxSizeInMegabytes;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.namespaceName = $.namespaceName;
        this.partitioningEnabled = $.partitioningEnabled;
        this.requiresDuplicateDetection = $.requiresDuplicateDetection;
        this.resourceGroupName = $.resourceGroupName;
        this.status = $.status;
        this.supportOrdering = $.supportOrdering;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicState $;

        public Builder() {
            $ = new TopicState();
        }

        public Builder(TopicState defaults) {
            $ = new TopicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDeleteOnIdle The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes. Defaults to `P10675199DT2H48M5.4775807S`.
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteOnIdle(@Nullable Output<String> autoDeleteOnIdle) {
            $.autoDeleteOnIdle = autoDeleteOnIdle;
            return this;
        }

        /**
         * @param autoDeleteOnIdle The ISO 8601 timespan duration of the idle interval after which the Topic is automatically deleted, minimum of 5 minutes. Defaults to `P10675199DT2H48M5.4775807S`.
         * 
         * @return builder
         * 
         */
        public Builder autoDeleteOnIdle(String autoDeleteOnIdle) {
            return autoDeleteOnIdle(Output.of(autoDeleteOnIdle));
        }

        /**
         * @param batchedOperationsEnabled Boolean flag which controls if server-side batched operations are enabled.
         * 
         * @return builder
         * 
         */
        public Builder batchedOperationsEnabled(@Nullable Output<Boolean> batchedOperationsEnabled) {
            $.batchedOperationsEnabled = batchedOperationsEnabled;
            return this;
        }

        /**
         * @param batchedOperationsEnabled Boolean flag which controls if server-side batched operations are enabled.
         * 
         * @return builder
         * 
         */
        public Builder batchedOperationsEnabled(Boolean batchedOperationsEnabled) {
            return batchedOperationsEnabled(Output.of(batchedOperationsEnabled));
        }

        /**
         * @param defaultMessageTtl The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself. Defaults to `P10675199DT2H48M5.4775807S`.
         * 
         * @return builder
         * 
         */
        public Builder defaultMessageTtl(@Nullable Output<String> defaultMessageTtl) {
            $.defaultMessageTtl = defaultMessageTtl;
            return this;
        }

        /**
         * @param defaultMessageTtl The ISO 8601 timespan duration of TTL of messages sent to this topic if no TTL value is set on the message itself. Defaults to `P10675199DT2H48M5.4775807S`.
         * 
         * @return builder
         * 
         */
        public Builder defaultMessageTtl(String defaultMessageTtl) {
            return defaultMessageTtl(Output.of(defaultMessageTtl));
        }

        /**
         * @param duplicateDetectionHistoryTimeWindow The ISO 8601 timespan duration during which duplicates can be detected. Defaults to `PT10M` (10 Minutes).
         * 
         * @return builder
         * 
         */
        public Builder duplicateDetectionHistoryTimeWindow(@Nullable Output<String> duplicateDetectionHistoryTimeWindow) {
            $.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
            return this;
        }

        /**
         * @param duplicateDetectionHistoryTimeWindow The ISO 8601 timespan duration during which duplicates can be detected. Defaults to `PT10M` (10 Minutes).
         * 
         * @return builder
         * 
         */
        public Builder duplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
            return duplicateDetectionHistoryTimeWindow(Output.of(duplicateDetectionHistoryTimeWindow));
        }

        /**
         * @param expressEnabled Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
         * 
         * @return builder
         * 
         */
        public Builder expressEnabled(@Nullable Output<Boolean> expressEnabled) {
            $.expressEnabled = expressEnabled;
            return this;
        }

        /**
         * @param expressEnabled Boolean flag which controls whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
         * 
         * @return builder
         * 
         */
        public Builder expressEnabled(Boolean expressEnabled) {
            return expressEnabled(Output.of(expressEnabled));
        }

        /**
         * @param maxMessageSizeInKilobytes Integer value which controls the maximum size of a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview). Defaults to `256`.
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSizeInKilobytes(@Nullable Output<Integer> maxMessageSizeInKilobytes) {
            $.maxMessageSizeInKilobytes = maxMessageSizeInKilobytes;
            return this;
        }

        /**
         * @param maxMessageSizeInKilobytes Integer value which controls the maximum size of a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview). Defaults to `256`.
         * 
         * @return builder
         * 
         */
        public Builder maxMessageSizeInKilobytes(Integer maxMessageSizeInKilobytes) {
            return maxMessageSizeInKilobytes(Output.of(maxMessageSizeInKilobytes));
        }

        /**
         * @param maxSizeInMegabytes Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `5120`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeInMegabytes(@Nullable Output<Integer> maxSizeInMegabytes) {
            $.maxSizeInMegabytes = maxSizeInMegabytes;
            return this;
        }

        /**
         * @param maxSizeInMegabytes Integer value which controls the size of memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34; section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas). Defaults to `5120`.
         * 
         * @return builder
         * 
         */
        public Builder maxSizeInMegabytes(Integer maxSizeInMegabytes) {
            return maxSizeInMegabytes(Output.of(maxSizeInMegabytes));
        }

        /**
         * @param name Specifies the name of the ServiceBus Topic resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the ServiceBus Topic resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The ID of the ServiceBus Namespace to create this topic in. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of the ServiceBus Namespace to create this topic in. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param partitioningEnabled Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. For premium namespaces, partitioning is available at namespace creation and all queues and topics in the partitioned namespace will be partitioned. Premium namespaces that have `premium_messaging_partitions` set to `1` are not partitioned. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
         * 
         * @return builder
         * 
         */
        public Builder partitioningEnabled(@Nullable Output<Boolean> partitioningEnabled) {
            $.partitioningEnabled = partitioningEnabled;
            return this;
        }

        /**
         * @param partitioningEnabled Boolean flag which controls whether to enable the topic to be partitioned across multiple message brokers. Changing this forces a new resource to be created.
         * 
         * &gt; **Note:** Partitioning is available at entity creation for all queues and topics in Basic or Standard SKUs. It is not available for the Premium messaging SKU, but any previously existing partitioned entities in Premium namespaces continue to work as expected. For premium namespaces, partitioning is available at namespace creation and all queues and topics in the partitioned namespace will be partitioned. Premium namespaces that have `premium_messaging_partitions` set to `1` are not partitioned. Please [see the documentation](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-partitioning) for more information.
         * 
         * @return builder
         * 
         */
        public Builder partitioningEnabled(Boolean partitioningEnabled) {
            return partitioningEnabled(Output.of(partitioningEnabled));
        }

        /**
         * @param requiresDuplicateDetection Boolean flag which controls whether the Topic requires duplicate detection. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder requiresDuplicateDetection(@Nullable Output<Boolean> requiresDuplicateDetection) {
            $.requiresDuplicateDetection = requiresDuplicateDetection;
            return this;
        }

        /**
         * @param requiresDuplicateDetection Boolean flag which controls whether the Topic requires duplicate detection. Defaults to `false`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder requiresDuplicateDetection(Boolean requiresDuplicateDetection) {
            return requiresDuplicateDetection(Output.of(requiresDuplicateDetection));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param status The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param supportOrdering Boolean flag which controls whether the Topic supports ordering.
         * 
         * @return builder
         * 
         */
        public Builder supportOrdering(@Nullable Output<Boolean> supportOrdering) {
            $.supportOrdering = supportOrdering;
            return this;
        }

        /**
         * @param supportOrdering Boolean flag which controls whether the Topic supports ordering.
         * 
         * @return builder
         * 
         */
        public Builder supportOrdering(Boolean supportOrdering) {
            return supportOrdering(Output.of(supportOrdering));
        }

        public TopicState build() {
            return $;
        }
    }

}
