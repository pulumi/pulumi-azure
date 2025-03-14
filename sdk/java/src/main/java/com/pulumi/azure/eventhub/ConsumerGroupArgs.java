// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsumerGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsumerGroupArgs Empty = new ConsumerGroupArgs();

    /**
     * Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventhubName", required=true)
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }

    /**
     * Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the user metadata.
     * 
     */
    @Import(name="userMetadata")
    private @Nullable Output<String> userMetadata;

    /**
     * @return Specifies the user metadata.
     * 
     */
    public Optional<Output<String>> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    private ConsumerGroupArgs() {}

    private ConsumerGroupArgs(ConsumerGroupArgs $) {
        this.eventhubName = $.eventhubName;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.userMetadata = $.userMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsumerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsumerGroupArgs $;

        public Builder() {
            $ = new ConsumerGroupArgs();
        }

        public Builder(ConsumerGroupArgs defaults) {
            $ = new ConsumerGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubName Specifies the name of the EventHub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName Specifies the name of the EventHub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param name Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the EventHub Consumer Group resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the grandparent EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param userMetadata Specifies the user metadata.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            $.userMetadata = userMetadata;
            return this;
        }

        /**
         * @param userMetadata Specifies the user metadata.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(String userMetadata) {
            return userMetadata(Output.of(userMetadata));
        }

        public ConsumerGroupArgs build() {
            if ($.eventhubName == null) {
                throw new MissingRequiredPropertyException("ConsumerGroupArgs", "eventhubName");
            }
            if ($.namespaceName == null) {
                throw new MissingRequiredPropertyException("ConsumerGroupArgs", "namespaceName");
            }
            if ($.resourceGroupName == null) {
                throw new MissingRequiredPropertyException("ConsumerGroupArgs", "resourceGroupName");
            }
            return $;
        }
    }

}
