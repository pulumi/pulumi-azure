// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.azure.mobile.inputs.NetworkSimPolicySliceArgs;
import com.pulumi.azure.mobile.inputs.NetworkSimPolicyUserEquipmentAggregateMaximumBitRateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSimPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkSimPolicyArgs Empty = new NetworkSimPolicyArgs();

    /**
     * The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
     * 
     */
    @Import(name="defaultSliceId", required=true)
    private Output<String> defaultSliceId;

    /**
     * @return The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
     * 
     */
    public Output<String> defaultSliceId() {
        return this.defaultSliceId;
    }

    /**
     * Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    @Import(name="mobileNetworkId", required=true)
    private Output<String> mobileNetworkId;

    /**
     * @return The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    public Output<String> mobileNetworkId() {
        return this.mobileNetworkId;
    }

    /**
     * The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     * 
     */
    @Import(name="ratFrequencySelectionPriorityIndex")
    private @Nullable Output<Integer> ratFrequencySelectionPriorityIndex;

    /**
     * @return RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     * 
     */
    public Optional<Output<Integer>> ratFrequencySelectionPriorityIndex() {
        return Optional.ofNullable(this.ratFrequencySelectionPriorityIndex);
    }

    /**
     * Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
     * 
     */
    @Import(name="registrationTimerInSeconds")
    private @Nullable Output<Integer> registrationTimerInSeconds;

    /**
     * @return Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
     * 
     */
    public Optional<Output<Integer>> registrationTimerInSeconds() {
        return Optional.ofNullable(this.registrationTimerInSeconds);
    }

    /**
     * An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     * 
     */
    @Import(name="slices", required=true)
    private Output<List<NetworkSimPolicySliceArgs>> slices;

    /**
     * @return An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     * 
     */
    public Output<List<NetworkSimPolicySliceArgs>> slices() {
        return this.slices;
    }

    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A `user_equipment_aggregate_maximum_bit_rate` block as defined below.
     * 
     */
    @Import(name="userEquipmentAggregateMaximumBitRate", required=true)
    private Output<NetworkSimPolicyUserEquipmentAggregateMaximumBitRateArgs> userEquipmentAggregateMaximumBitRate;

    /**
     * @return A `user_equipment_aggregate_maximum_bit_rate` block as defined below.
     * 
     */
    public Output<NetworkSimPolicyUserEquipmentAggregateMaximumBitRateArgs> userEquipmentAggregateMaximumBitRate() {
        return this.userEquipmentAggregateMaximumBitRate;
    }

    private NetworkSimPolicyArgs() {}

    private NetworkSimPolicyArgs(NetworkSimPolicyArgs $) {
        this.defaultSliceId = $.defaultSliceId;
        this.location = $.location;
        this.mobileNetworkId = $.mobileNetworkId;
        this.name = $.name;
        this.ratFrequencySelectionPriorityIndex = $.ratFrequencySelectionPriorityIndex;
        this.registrationTimerInSeconds = $.registrationTimerInSeconds;
        this.slices = $.slices;
        this.tags = $.tags;
        this.userEquipmentAggregateMaximumBitRate = $.userEquipmentAggregateMaximumBitRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkSimPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkSimPolicyArgs $;

        public Builder() {
            $ = new NetworkSimPolicyArgs();
        }

        public Builder(NetworkSimPolicyArgs defaults) {
            $ = new NetworkSimPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultSliceId The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
         * 
         * @return builder
         * 
         */
        public Builder defaultSliceId(Output<String> defaultSliceId) {
            $.defaultSliceId = defaultSliceId;
            return this;
        }

        /**
         * @param defaultSliceId The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
         * 
         * @return builder
         * 
         */
        public Builder defaultSliceId(String defaultSliceId) {
            return defaultSliceId(Output.of(defaultSliceId));
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mobileNetworkId The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(Output<String> mobileNetworkId) {
            $.mobileNetworkId = mobileNetworkId;
            return this;
        }

        /**
         * @param mobileNetworkId The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(String mobileNetworkId) {
            return mobileNetworkId(Output.of(mobileNetworkId));
        }

        /**
         * @param name The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ratFrequencySelectionPriorityIndex RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
         * 
         * @return builder
         * 
         */
        public Builder ratFrequencySelectionPriorityIndex(@Nullable Output<Integer> ratFrequencySelectionPriorityIndex) {
            $.ratFrequencySelectionPriorityIndex = ratFrequencySelectionPriorityIndex;
            return this;
        }

        /**
         * @param ratFrequencySelectionPriorityIndex RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
         * 
         * @return builder
         * 
         */
        public Builder ratFrequencySelectionPriorityIndex(Integer ratFrequencySelectionPriorityIndex) {
            return ratFrequencySelectionPriorityIndex(Output.of(ratFrequencySelectionPriorityIndex));
        }

        /**
         * @param registrationTimerInSeconds Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
         * 
         * @return builder
         * 
         */
        public Builder registrationTimerInSeconds(@Nullable Output<Integer> registrationTimerInSeconds) {
            $.registrationTimerInSeconds = registrationTimerInSeconds;
            return this;
        }

        /**
         * @param registrationTimerInSeconds Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
         * 
         * @return builder
         * 
         */
        public Builder registrationTimerInSeconds(Integer registrationTimerInSeconds) {
            return registrationTimerInSeconds(Output.of(registrationTimerInSeconds));
        }

        /**
         * @param slices An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder slices(Output<List<NetworkSimPolicySliceArgs>> slices) {
            $.slices = slices;
            return this;
        }

        /**
         * @param slices An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder slices(List<NetworkSimPolicySliceArgs> slices) {
            return slices(Output.of(slices));
        }

        /**
         * @param slices An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
         * 
         * @return builder
         * 
         */
        public Builder slices(NetworkSimPolicySliceArgs... slices) {
            return slices(List.of(slices));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Sim Policies.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Mobile Network Sim Policies.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param userEquipmentAggregateMaximumBitRate A `user_equipment_aggregate_maximum_bit_rate` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder userEquipmentAggregateMaximumBitRate(Output<NetworkSimPolicyUserEquipmentAggregateMaximumBitRateArgs> userEquipmentAggregateMaximumBitRate) {
            $.userEquipmentAggregateMaximumBitRate = userEquipmentAggregateMaximumBitRate;
            return this;
        }

        /**
         * @param userEquipmentAggregateMaximumBitRate A `user_equipment_aggregate_maximum_bit_rate` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder userEquipmentAggregateMaximumBitRate(NetworkSimPolicyUserEquipmentAggregateMaximumBitRateArgs userEquipmentAggregateMaximumBitRate) {
            return userEquipmentAggregateMaximumBitRate(Output.of(userEquipmentAggregateMaximumBitRate));
        }

        public NetworkSimPolicyArgs build() {
            $.defaultSliceId = Objects.requireNonNull($.defaultSliceId, "expected parameter 'defaultSliceId' to be non-null");
            $.mobileNetworkId = Objects.requireNonNull($.mobileNetworkId, "expected parameter 'mobileNetworkId' to be non-null");
            $.slices = Objects.requireNonNull($.slices, "expected parameter 'slices' to be non-null");
            $.userEquipmentAggregateMaximumBitRate = Objects.requireNonNull($.userEquipmentAggregateMaximumBitRate, "expected parameter 'userEquipmentAggregateMaximumBitRate' to be non-null");
            return $;
        }
    }

}