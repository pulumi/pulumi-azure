// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubDpsLinkedHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubDpsLinkedHubArgs Empty = new IotHubDpsLinkedHubArgs();

    /**
     * The weight applied to the IoT Hub. Defaults to `1`.
     * 
     */
    @Import(name="allocationWeight")
    private @Nullable Output<Integer> allocationWeight;

    /**
     * @return The weight applied to the IoT Hub. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> allocationWeight() {
        return Optional.ofNullable(this.allocationWeight);
    }

    /**
     * Determines whether to apply allocation policies to the IoT Hub. Defaults to `true`.
     * 
     */
    @Import(name="applyAllocationPolicy")
    private @Nullable Output<Boolean> applyAllocationPolicy;

    /**
     * @return Determines whether to apply allocation policies to the IoT Hub. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> applyAllocationPolicy() {
        return Optional.ofNullable(this.applyAllocationPolicy);
    }

    /**
     * The connection string to connect to the IoT Hub.
     * 
     */
    @Import(name="connectionString", required=true)
    private Output<String> connectionString;

    /**
     * @return The connection string to connect to the IoT Hub.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }

    /**
     * The IoT Hub hostname.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The IoT Hub hostname.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The location of the IoT hub.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the IoT hub.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    private IotHubDpsLinkedHubArgs() {}

    private IotHubDpsLinkedHubArgs(IotHubDpsLinkedHubArgs $) {
        this.allocationWeight = $.allocationWeight;
        this.applyAllocationPolicy = $.applyAllocationPolicy;
        this.connectionString = $.connectionString;
        this.hostname = $.hostname;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubDpsLinkedHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubDpsLinkedHubArgs $;

        public Builder() {
            $ = new IotHubDpsLinkedHubArgs();
        }

        public Builder(IotHubDpsLinkedHubArgs defaults) {
            $ = new IotHubDpsLinkedHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationWeight The weight applied to the IoT Hub. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder allocationWeight(@Nullable Output<Integer> allocationWeight) {
            $.allocationWeight = allocationWeight;
            return this;
        }

        /**
         * @param allocationWeight The weight applied to the IoT Hub. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder allocationWeight(Integer allocationWeight) {
            return allocationWeight(Output.of(allocationWeight));
        }

        /**
         * @param applyAllocationPolicy Determines whether to apply allocation policies to the IoT Hub. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder applyAllocationPolicy(@Nullable Output<Boolean> applyAllocationPolicy) {
            $.applyAllocationPolicy = applyAllocationPolicy;
            return this;
        }

        /**
         * @param applyAllocationPolicy Determines whether to apply allocation policies to the IoT Hub. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder applyAllocationPolicy(Boolean applyAllocationPolicy) {
            return applyAllocationPolicy(Output.of(applyAllocationPolicy));
        }

        /**
         * @param connectionString The connection string to connect to the IoT Hub.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string to connect to the IoT Hub.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param hostname The IoT Hub hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The IoT Hub hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param location The location of the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public IotHubDpsLinkedHubArgs build() {
            if ($.connectionString == null) {
                throw new MissingRequiredPropertyException("IotHubDpsLinkedHubArgs", "connectionString");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("IotHubDpsLinkedHubArgs", "location");
            }
            return $;
        }
    }

}
