// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrderReturnTrackingArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderReturnTrackingArgs Empty = new OrderReturnTrackingArgs();

    /**
     * Name of the carrier used in the delivery.
     * 
     */
    @Import(name="carrierName")
    private @Nullable Output<String> carrierName;

    /**
     * @return Name of the carrier used in the delivery.
     * 
     */
    public Optional<Output<String>> carrierName() {
        return Optional.ofNullable(this.carrierName);
    }

    /**
     * Serial number of the device being tracked.
     * 
     */
    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    /**
     * @return Serial number of the device being tracked.
     * 
     */
    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    /**
     * The ID of the tracking.
     * 
     */
    @Import(name="trackingId")
    private @Nullable Output<String> trackingId;

    /**
     * @return The ID of the tracking.
     * 
     */
    public Optional<Output<String>> trackingId() {
        return Optional.ofNullable(this.trackingId);
    }

    /**
     * Tracking URL of the shipment.
     * 
     */
    @Import(name="trackingUrl")
    private @Nullable Output<String> trackingUrl;

    /**
     * @return Tracking URL of the shipment.
     * 
     */
    public Optional<Output<String>> trackingUrl() {
        return Optional.ofNullable(this.trackingUrl);
    }

    private OrderReturnTrackingArgs() {}

    private OrderReturnTrackingArgs(OrderReturnTrackingArgs $) {
        this.carrierName = $.carrierName;
        this.serialNumber = $.serialNumber;
        this.trackingId = $.trackingId;
        this.trackingUrl = $.trackingUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderReturnTrackingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderReturnTrackingArgs $;

        public Builder() {
            $ = new OrderReturnTrackingArgs();
        }

        public Builder(OrderReturnTrackingArgs defaults) {
            $ = new OrderReturnTrackingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param carrierName Name of the carrier used in the delivery.
         * 
         * @return builder
         * 
         */
        public Builder carrierName(@Nullable Output<String> carrierName) {
            $.carrierName = carrierName;
            return this;
        }

        /**
         * @param carrierName Name of the carrier used in the delivery.
         * 
         * @return builder
         * 
         */
        public Builder carrierName(String carrierName) {
            return carrierName(Output.of(carrierName));
        }

        /**
         * @param serialNumber Serial number of the device being tracked.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param serialNumber Serial number of the device being tracked.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        /**
         * @param trackingId The ID of the tracking.
         * 
         * @return builder
         * 
         */
        public Builder trackingId(@Nullable Output<String> trackingId) {
            $.trackingId = trackingId;
            return this;
        }

        /**
         * @param trackingId The ID of the tracking.
         * 
         * @return builder
         * 
         */
        public Builder trackingId(String trackingId) {
            return trackingId(Output.of(trackingId));
        }

        /**
         * @param trackingUrl Tracking URL of the shipment.
         * 
         * @return builder
         * 
         */
        public Builder trackingUrl(@Nullable Output<String> trackingUrl) {
            $.trackingUrl = trackingUrl;
            return this;
        }

        /**
         * @param trackingUrl Tracking URL of the shipment.
         * 
         * @return builder
         * 
         */
        public Builder trackingUrl(String trackingUrl) {
            return trackingUrl(Output.of(trackingUrl));
        }

        public OrderReturnTrackingArgs build() {
            return $;
        }
    }

}