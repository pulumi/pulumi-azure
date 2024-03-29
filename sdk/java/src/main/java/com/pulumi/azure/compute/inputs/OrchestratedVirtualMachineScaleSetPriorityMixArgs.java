// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetPriorityMixArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetPriorityMixArgs Empty = new OrchestratedVirtualMachineScaleSetPriorityMixArgs();

    /**
     * Specifies the base number of VMs of `Regular` priority that will be created before any VMs of priority `Spot` are created. Possible values are integers between `0` and `1000`. Defaults to `0`.
     * 
     */
    @Import(name="baseRegularCount")
    private @Nullable Output<Integer> baseRegularCount;

    /**
     * @return Specifies the base number of VMs of `Regular` priority that will be created before any VMs of priority `Spot` are created. Possible values are integers between `0` and `1000`. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> baseRegularCount() {
        return Optional.ofNullable(this.baseRegularCount);
    }

    /**
     * Specifies the desired percentage of VM instances that are of `Regular` priority after the base count has been reached. Possible values are integers between `0` and `100`. Defaults to `0`.
     * 
     */
    @Import(name="regularPercentageAboveBase")
    private @Nullable Output<Integer> regularPercentageAboveBase;

    /**
     * @return Specifies the desired percentage of VM instances that are of `Regular` priority after the base count has been reached. Possible values are integers between `0` and `100`. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> regularPercentageAboveBase() {
        return Optional.ofNullable(this.regularPercentageAboveBase);
    }

    private OrchestratedVirtualMachineScaleSetPriorityMixArgs() {}

    private OrchestratedVirtualMachineScaleSetPriorityMixArgs(OrchestratedVirtualMachineScaleSetPriorityMixArgs $) {
        this.baseRegularCount = $.baseRegularCount;
        this.regularPercentageAboveBase = $.regularPercentageAboveBase;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetPriorityMixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetPriorityMixArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetPriorityMixArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetPriorityMixArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetPriorityMixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseRegularCount Specifies the base number of VMs of `Regular` priority that will be created before any VMs of priority `Spot` are created. Possible values are integers between `0` and `1000`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder baseRegularCount(@Nullable Output<Integer> baseRegularCount) {
            $.baseRegularCount = baseRegularCount;
            return this;
        }

        /**
         * @param baseRegularCount Specifies the base number of VMs of `Regular` priority that will be created before any VMs of priority `Spot` are created. Possible values are integers between `0` and `1000`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder baseRegularCount(Integer baseRegularCount) {
            return baseRegularCount(Output.of(baseRegularCount));
        }

        /**
         * @param regularPercentageAboveBase Specifies the desired percentage of VM instances that are of `Regular` priority after the base count has been reached. Possible values are integers between `0` and `100`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder regularPercentageAboveBase(@Nullable Output<Integer> regularPercentageAboveBase) {
            $.regularPercentageAboveBase = regularPercentageAboveBase;
            return this;
        }

        /**
         * @param regularPercentageAboveBase Specifies the desired percentage of VM instances that are of `Regular` priority after the base count has been reached. Possible values are integers between `0` and `100`. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder regularPercentageAboveBase(Integer regularPercentageAboveBase) {
            return regularPercentageAboveBase(Output.of(regularPercentageAboveBase));
        }

        public OrchestratedVirtualMachineScaleSetPriorityMixArgs build() {
            return $;
        }
    }

}
