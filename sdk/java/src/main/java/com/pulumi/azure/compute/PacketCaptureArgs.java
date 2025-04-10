// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.compute.inputs.PacketCaptureFilterArgs;
import com.pulumi.azure.compute.inputs.PacketCaptureStorageLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketCaptureArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketCaptureArgs Empty = new PacketCaptureArgs();

    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<PacketCaptureFilterArgs>> filters;

    /**
     * @return One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<PacketCaptureFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="maximumBytesPerPacket")
    private @Nullable Output<Integer> maximumBytesPerPacket;

    /**
     * @return The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> maximumBytesPerPacket() {
        return Optional.ofNullable(this.maximumBytesPerPacket);
    }

    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="maximumBytesPerSession")
    private @Nullable Output<Integer> maximumBytesPerSession;

    /**
     * @return Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> maximumBytesPerSession() {
        return Optional.ofNullable(this.maximumBytesPerSession);
    }

    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    @Import(name="maximumCaptureDurationInSeconds")
    private @Nullable Output<Integer> maximumCaptureDurationInSeconds;

    /**
     * @return The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> maximumCaptureDurationInSeconds() {
        return Optional.ofNullable(this.maximumCaptureDurationInSeconds);
    }

    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkWatcherId", required=true)
    private Output<String> networkWatcherId;

    /**
     * @return The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkWatcherId() {
        return this.networkWatcherId;
    }

    /**
     * A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageLocation", required=true)
    private Output<PacketCaptureStorageLocationArgs> storageLocation;

    /**
     * @return A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<PacketCaptureStorageLocationArgs> storageLocation() {
        return this.storageLocation;
    }

    /**
     * The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualMachineId", required=true)
    private Output<String> virtualMachineId;

    /**
     * @return The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineId() {
        return this.virtualMachineId;
    }

    private PacketCaptureArgs() {}

    private PacketCaptureArgs(PacketCaptureArgs $) {
        this.filters = $.filters;
        this.maximumBytesPerPacket = $.maximumBytesPerPacket;
        this.maximumBytesPerSession = $.maximumBytesPerSession;
        this.maximumCaptureDurationInSeconds = $.maximumCaptureDurationInSeconds;
        this.name = $.name;
        this.networkWatcherId = $.networkWatcherId;
        this.storageLocation = $.storageLocation;
        this.virtualMachineId = $.virtualMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketCaptureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketCaptureArgs $;

        public Builder() {
            $ = new PacketCaptureArgs();
        }

        public Builder(PacketCaptureArgs defaults) {
            $ = new PacketCaptureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<PacketCaptureFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<PacketCaptureFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filters(PacketCaptureFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param maximumBytesPerPacket The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumBytesPerPacket(@Nullable Output<Integer> maximumBytesPerPacket) {
            $.maximumBytesPerPacket = maximumBytesPerPacket;
            return this;
        }

        /**
         * @param maximumBytesPerPacket The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumBytesPerPacket(Integer maximumBytesPerPacket) {
            return maximumBytesPerPacket(Output.of(maximumBytesPerPacket));
        }

        /**
         * @param maximumBytesPerSession Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumBytesPerSession(@Nullable Output<Integer> maximumBytesPerSession) {
            $.maximumBytesPerSession = maximumBytesPerSession;
            return this;
        }

        /**
         * @param maximumBytesPerSession Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumBytesPerSession(Integer maximumBytesPerSession) {
            return maximumBytesPerSession(Output.of(maximumBytesPerSession));
        }

        /**
         * @param maximumCaptureDurationInSeconds The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumCaptureDurationInSeconds(@Nullable Output<Integer> maximumCaptureDurationInSeconds) {
            $.maximumCaptureDurationInSeconds = maximumCaptureDurationInSeconds;
            return this;
        }

        /**
         * @param maximumCaptureDurationInSeconds The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder maximumCaptureDurationInSeconds(Integer maximumCaptureDurationInSeconds) {
            return maximumCaptureDurationInSeconds(Output.of(maximumCaptureDurationInSeconds));
        }

        /**
         * @param name The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkWatcherId The resource ID of the Network Watcher. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherId(Output<String> networkWatcherId) {
            $.networkWatcherId = networkWatcherId;
            return this;
        }

        /**
         * @param networkWatcherId The resource ID of the Network Watcher. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherId(String networkWatcherId) {
            return networkWatcherId(Output.of(networkWatcherId));
        }

        /**
         * @param storageLocation A `storage_location` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(Output<PacketCaptureStorageLocationArgs> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation A `storage_location` block as defined below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(PacketCaptureStorageLocationArgs storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        /**
         * @param virtualMachineId The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(Output<String> virtualMachineId) {
            $.virtualMachineId = virtualMachineId;
            return this;
        }

        /**
         * @param virtualMachineId The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(String virtualMachineId) {
            return virtualMachineId(Output.of(virtualMachineId));
        }

        public PacketCaptureArgs build() {
            if ($.networkWatcherId == null) {
                throw new MissingRequiredPropertyException("PacketCaptureArgs", "networkWatcherId");
            }
            if ($.storageLocation == null) {
                throw new MissingRequiredPropertyException("PacketCaptureArgs", "storageLocation");
            }
            if ($.virtualMachineId == null) {
                throw new MissingRequiredPropertyException("PacketCaptureArgs", "virtualMachineId");
            }
            return $;
        }
    }

}
