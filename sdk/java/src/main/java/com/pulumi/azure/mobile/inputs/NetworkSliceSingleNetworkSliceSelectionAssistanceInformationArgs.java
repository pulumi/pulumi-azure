// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs Empty = new NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs();

    /**
     * Slice differentiator (SD). Must be a 6 digit hex string.
     * 
     */
    @Import(name="sliceDifferentiator")
    private @Nullable Output<String> sliceDifferentiator;

    /**
     * @return Slice differentiator (SD). Must be a 6 digit hex string.
     * 
     */
    public Optional<Output<String>> sliceDifferentiator() {
        return Optional.ofNullable(this.sliceDifferentiator);
    }

    /**
     * Slice/service type (SST). Must be between `0` and `255`.
     * 
     */
    @Import(name="sliceServiceType", required=true)
    private Output<Integer> sliceServiceType;

    /**
     * @return Slice/service type (SST). Must be between `0` and `255`.
     * 
     */
    public Output<Integer> sliceServiceType() {
        return this.sliceServiceType;
    }

    private NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs() {}

    private NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs(NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs $) {
        this.sliceDifferentiator = $.sliceDifferentiator;
        this.sliceServiceType = $.sliceServiceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs $;

        public Builder() {
            $ = new NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs();
        }

        public Builder(NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs defaults) {
            $ = new NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sliceDifferentiator Slice differentiator (SD). Must be a 6 digit hex string.
         * 
         * @return builder
         * 
         */
        public Builder sliceDifferentiator(@Nullable Output<String> sliceDifferentiator) {
            $.sliceDifferentiator = sliceDifferentiator;
            return this;
        }

        /**
         * @param sliceDifferentiator Slice differentiator (SD). Must be a 6 digit hex string.
         * 
         * @return builder
         * 
         */
        public Builder sliceDifferentiator(String sliceDifferentiator) {
            return sliceDifferentiator(Output.of(sliceDifferentiator));
        }

        /**
         * @param sliceServiceType Slice/service type (SST). Must be between `0` and `255`.
         * 
         * @return builder
         * 
         */
        public Builder sliceServiceType(Output<Integer> sliceServiceType) {
            $.sliceServiceType = sliceServiceType;
            return this;
        }

        /**
         * @param sliceServiceType Slice/service type (SST). Must be between `0` and `255`.
         * 
         * @return builder
         * 
         */
        public Builder sliceServiceType(Integer sliceServiceType) {
            return sliceServiceType(Output.of(sliceServiceType));
        }

        public NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs build() {
            if ($.sliceServiceType == null) {
                throw new MissingRequiredPropertyException("NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs", "sliceServiceType");
            }
            return $;
        }
    }

}
