// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.azure.streamanalytics.inputs.OutputEventHubSerializationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputEventHubState extends com.pulumi.resources.ResourceArgs {

    public static final OutputEventHubState Empty = new OutputEventHubState();

    /**
     * The name of the Event Hub.
     * 
     */
    @Import(name="eventhubName")
    private @Nullable Output<String> eventhubName;

    /**
     * @return The name of the Event Hub.
     * 
     */
    public Optional<Output<String>> eventhubName() {
        return Optional.ofNullable(this.eventhubName);
    }

    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The column that is used for the Event Hub partition key.
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<String> partitionKey;

    /**
     * @return The column that is used for the Event Hub partition key.
     * 
     */
    public Optional<Output<String>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * A list of property columns to add to the Event Hub output.
     * 
     */
    @Import(name="propertyColumns")
    private @Nullable Output<List<String>> propertyColumns;

    /**
     * @return A list of property columns to add to the Event Hub output.
     * 
     */
    public Optional<Output<List<String>>> propertyColumns() {
        return Optional.ofNullable(this.propertyColumns);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `serialization` block as defined below.
     * 
     */
    @Import(name="serialization")
    private @Nullable Output<OutputEventHubSerializationArgs> serialization;

    /**
     * @return A `serialization` block as defined below.
     * 
     */
    public Optional<Output<OutputEventHubSerializationArgs>> serialization() {
        return Optional.ofNullable(this.serialization);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    @Import(name="servicebusNamespace")
    private @Nullable Output<String> servicebusNamespace;

    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    public Optional<Output<String>> servicebusNamespace() {
        return Optional.ofNullable(this.servicebusNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
    private @Nullable Output<String> sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy.
     * 
     */
    public Optional<Output<String>> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    @Import(name="sharedAccessPolicyName")
    private @Nullable Output<String> sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    public Optional<Output<String>> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName")
    private @Nullable Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobName() {
        return Optional.ofNullable(this.streamAnalyticsJobName);
    }

    private OutputEventHubState() {}

    private OutputEventHubState(OutputEventHubState $) {
        this.eventhubName = $.eventhubName;
        this.name = $.name;
        this.partitionKey = $.partitionKey;
        this.propertyColumns = $.propertyColumns;
        this.resourceGroupName = $.resourceGroupName;
        this.serialization = $.serialization;
        this.servicebusNamespace = $.servicebusNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputEventHubState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputEventHubState $;

        public Builder() {
            $ = new OutputEventHubState();
        }

        public Builder(OutputEventHubState defaults) {
            $ = new OutputEventHubState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubName The name of the Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(@Nullable Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName The name of the Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partitionKey The column that is used for the Event Hub partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The column that is used for the Event Hub partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param propertyColumns A list of property columns to add to the Event Hub output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(@Nullable Output<List<String>> propertyColumns) {
            $.propertyColumns = propertyColumns;
            return this;
        }

        /**
         * @param propertyColumns A list of property columns to add to the Event Hub output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(List<String> propertyColumns) {
            return propertyColumns(Output.of(propertyColumns));
        }

        /**
         * @param propertyColumns A list of property columns to add to the Event Hub output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(String... propertyColumns) {
            return propertyColumns(List.of(propertyColumns));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(@Nullable Output<OutputEventHubSerializationArgs> serialization) {
            $.serialization = serialization;
            return this;
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(OutputEventHubSerializationArgs serialization) {
            return serialization(Output.of(serialization));
        }

        /**
         * @param servicebusNamespace The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder servicebusNamespace(@Nullable Output<String> servicebusNamespace) {
            $.servicebusNamespace = servicebusNamespace;
            return this;
        }

        /**
         * @param servicebusNamespace The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder servicebusNamespace(String servicebusNamespace) {
            return servicebusNamespace(Output.of(servicebusNamespace));
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(@Nullable Output<String> sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(String sharedAccessPolicyKey) {
            return sharedAccessPolicyKey(Output.of(sharedAccessPolicyKey));
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(@Nullable Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(@Nullable Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        public OutputEventHubState build() {
            return $;
        }
    }

}