// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventhubNamespaceDisasterRecoveryConfigState extends com.pulumi.resources.ResourceArgs {

    public static final EventhubNamespaceDisasterRecoveryConfigState Empty = new EventhubNamespaceDisasterRecoveryConfigState();

    /**
     * Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * The ID of the EventHub Namespace to replicate to.
     * 
     */
    @Import(name="partnerNamespaceId")
    private @Nullable Output<String> partnerNamespaceId;

    /**
     * @return The ID of the EventHub Namespace to replicate to.
     * 
     */
    public Optional<Output<String>> partnerNamespaceId() {
        return Optional.ofNullable(this.partnerNamespaceId);
    }

    /**
     * The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private EventhubNamespaceDisasterRecoveryConfigState() {}

    private EventhubNamespaceDisasterRecoveryConfigState(EventhubNamespaceDisasterRecoveryConfigState $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.partnerNamespaceId = $.partnerNamespaceId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventhubNamespaceDisasterRecoveryConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventhubNamespaceDisasterRecoveryConfigState $;

        public Builder() {
            $ = new EventhubNamespaceDisasterRecoveryConfigState();
        }

        public Builder(EventhubNamespaceDisasterRecoveryConfigState defaults) {
            $ = new EventhubNamespaceDisasterRecoveryConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Disaster Recovery Config. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the primary EventHub Namespace to replicate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param partnerNamespaceId The ID of the EventHub Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(@Nullable Output<String> partnerNamespaceId) {
            $.partnerNamespaceId = partnerNamespaceId;
            return this;
        }

        /**
         * @param partnerNamespaceId The ID of the EventHub Namespace to replicate to.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceId(String partnerNamespaceId) {
            return partnerNamespaceId(Output.of(partnerNamespaceId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Disaster Recovery Config exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public EventhubNamespaceDisasterRecoveryConfigState build() {
            return $;
        }
    }

}